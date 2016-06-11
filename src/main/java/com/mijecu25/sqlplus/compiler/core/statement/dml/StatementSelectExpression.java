package com.mijecu25.sqlplus.compiler.core.statement.dml;

import com.mijecu25.messages.Messages;
import com.mijecu25.sqlplus.compiler.core.statement.Statement;
import com.mijecu25.sqlutils.SQLUtils;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the "select...." SQL statement. It prints the columns that match the query.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.4
 */
public class StatementSelectExpression extends StatementDML {
    
    private List<Integer> columnsMaxLength;

    private static final Logger logger = LogManager.getLogger(StatementSelectExpression.class);

    public StatementSelectExpression(List<String> columns, List<String> tables) {
        // we are going to support right now.
        super(StatementDML.SELECT + StatementDML.unrollList(columns)
                + StatementDML.FROM + StatementDML.unrollList(tables),
                columns, tables);
        this.columnsMaxLength = new ArrayList<Integer>();
        
        StatementSelectExpression.logger.info("Parsed and created a StatementSelectExpression");
    }

    @Override
    public void execute(Connection connection) throws SQLException {
        StatementSelectExpression.logger.info("Will execute the code to query the database using a select statement");

        // If the connection is null
        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            StatementSelectExpression.logger.fatal(Messages.FATAL + "The connection passed to execute the statement "
                    + "cannot be null");
            System.out.println(Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + Messages.SPACE
                    + Messages.CHECK_LOG_FILES);
            StatementSelectExpression.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        // Set the connection
        this.connection = connection;

        try {
            // Execute the query
            java.sql.Statement statement = this.connection.createStatement();
            this.resultSet = statement.executeQuery(this.statement);

            // The result from the query is null
            if(this.resultSet == null) {
                // Throw an exception because this will be very weird. Also,
                // if there is no response, we do not want to continue executing
                throw new SQLException();
            }

            // TODO add this in all other places
            // Check if the result set has values or not
            if(this.resultSet.isBeforeFirst()) {
                this.printResult();
            }
            else {
                Statement.printEmptySet();
            }

            // Close the result set and statement
            this.resultSet.close();
            statement.close();
        }
        catch(SQLException sqle) {
            StatementSelectExpression.logger.warn(Messages.WARNING + "Error when executing " + this, sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + sqle.getMessage());

            StatementSelectExpression.logger.warn(Messages.WARNING + "Throwing a " + sqle.getClass().getSimpleName()
                    + " to the calling class");
            throw sqle;
        }
        
    }

    @Override
    protected void printResult() {
        StatementSelectExpression.logger.info("Printing the result");
        try{
            // Get the medatadata from the result set
            ResultSetMetaData resultSetMetaData;
            resultSetMetaData = this.resultSet.getMetaData();

            // Since we might be printing multiple columns, the approach we take is begin with adding the left
            // characters and for each column, we complete the right side of the table
            StringBuilder line = new StringBuilder(StatementSelectExpression.CORNER_SYMBOL);
            String label = "";

            // Loop through all the columns to build the top border of the result
            for(int i = 0; i < this.columns.size(); i++) {
                // Get the maximum row length
                int maxRowLength = SQLUtils.maxRowLength(this.connection, this.columns.get(i), this.getFirstTable());
                // Get the title of the result column
                label = resultSetMetaData.getColumnLabel(i+1);
                // The maximum width that we are going to print is either the title of the column
                // or a row
                maxRowLength = Math.max(maxRowLength, label.length());
                // Add the max row length to the respective column. We add 3 to the length for the 1 right border and
                // 2 whitespaces on either side
                this.columnsMaxLength.add(i, maxRowLength + 3);
                // Add a right border the to fit the maximum row in a column
                line.append(Statement.buildRightHorizontalBorder(this.columnsMaxLength.get(i)));
            }

            // After completing the top border, we add a new line
            line.append("\n");
            // Add a vertical border to start the title row
            line.append(StatementSelectExpression.VERTICAL_BORDERL);

            // Loop through all of the columns to print the titles of the result table
            for(int i = 1; i <= this.columns.size(); i++) {
                // Get the title
                label = resultSetMetaData.getColumnLabel(i);

                // Add a white space, title, whitespaces, and right border to complete the title for this column
                line.append(" ");
                line.append(label);
                line.append(StringUtils.repeat(" ", this.columnsMaxLength.get(i-1) - 2 - label.length()));
                line.append(StatementSelectExpression.VERTICAL_BORDERL);
            }

            // After completing the titles, we add a new line
            line.append("\n");
            // Add a corner symbol to start bottom border of the title row
            line.append(StatementSelectExpression.CORNER_SYMBOL);

            // Loop through all of the columns
            for(int i = 0; i < this.columns.size(); i++) {
                // Add a right border the to fit the maximum row in a column
                line.append(Statement.buildRightHorizontalBorder(this.columnsMaxLength.get(i)));
            }

            // After completing the bottom border of titles, we add a new line
            line.append("\n");

            // While the are more rows to process
            while (resultSet.next()) {
                // Add a vertical border to start the current row of results
                line.append(StatementSelectExpression.VERTICAL_BORDERL);

                // Loop through all of the columns
                for(int i = 1; i <= this.columns.size(); i++) {
                    // Get the current row and check if it is null
                    String row = Statement.checkAndTransformNull(this.resultSet.getString(i));

                    // Add a white space, row, whitespaces, and right border to complete the row for this column
                    line.append(" ");
                    line.append(row);
                    line.append(StringUtils.repeat(" ", this.columnsMaxLength.get(i-1) - 2 - row.length()));
                    line.append(StatementSelectExpression.VERTICAL_BORDERL);
                }

                // After completing all of the columns, we add a new line
                line.append("\n");
            }

            // Add a corner symbol to start bottom border of the result table
            line.append(StatementSelectExpression.CORNER_SYMBOL);

            // Loop through all of the columns
            for(int i = 0; i < this.columns.size(); i++) {
                // Add a right border the to fit the maximum row in a column
                line.append(Statement.buildRightHorizontalBorder(this.columnsMaxLength.get(i)));
            }

            // Print the result table
            System.out.println(line);
        }
        catch (SQLException sqle) {
            StatementSelectExpression.logger.warn(Messages.WARNING + "Error when printing the result of " + this, sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + "Could not print the result." + Messages.SPACE + Messages.WARNING + Messages.CHECK_LOG_FILES);
        }
        
    }

    @Override
    public String toString() {
        return "StatementSelectExpression [statement=" + this.statement + "]";
    }
    
}
