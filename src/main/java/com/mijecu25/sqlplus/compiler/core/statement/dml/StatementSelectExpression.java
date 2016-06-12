package com.mijecu25.sqlplus.compiler.core.statement.dml;

import com.mijecu25.messages.Messages;
import com.mijecu25.sqlplus.compiler.core.statement.Statement;
import com.mijecu25.sqlutils.SQLUtils;

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
 * @version 0.1.0.9
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
            System.out.println(Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
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

            // Loop through all the columns to build the top border of the result
            for(int i = 0; i < this.columns.size(); i++) {
                // Get the maximum row length
                int maxRowLength = SQLUtils.maxRowLength(this.connection, this.columns.get(i), this.getFirstTable());
                // Get the title of the result column
                String label = resultSetMetaData.getColumnLabel(i+1);
                // The maximum width that we are going to print is either the title of the column
                // or a row
                maxRowLength = Math.max(maxRowLength, label.length());
                // Add the max row length to the respective column.
                this.columnsMaxLength.add(i, maxRowLength);
            }

            // Print the result which could have multiple
            Statement.printMultipleColumn(this.resultSet, this.columnsMaxLength);
        }
        catch (SQLException sqle) {
            StatementSelectExpression.logger.warn(Messages.WARNING + "Error when printing the result of " + this, sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + "Could not print the result. " + Messages.CHECK_LOG_FILES);
        }
        
    }

    @Override
    public String toString() {
        return "StatementSelectExpression [statement=" + this.statement + "]";
    }
    
}
