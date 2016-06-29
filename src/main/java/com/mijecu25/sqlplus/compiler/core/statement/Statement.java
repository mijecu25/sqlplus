package com.mijecu25.sqlplus.compiler.core.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.messages.Messages;

/**
 * This class represents either a SQLPlus statement or a regular SQL statement.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.25
 */
public abstract class Statement {
    private List<Integer> columnsMaxLength;

    protected String statement;
    protected ResultSet resultSet;

    private static final String CORNER_SYMBOL = "+";
    private static final String HORIZONTAL_BORDER = "-";
    private static final String VERTICAL_BORDER = "|";

    private static final Logger logger = LogManager.getLogger(Statement.class);

    /**
     * Create a statement object
     */
    public Statement() {
        this.statement = null;
//        this.connection = null;
        this.resultSet = null;
        this.columnsMaxLength = new ArrayList<Integer>();
        Statement.logger.info("Created a Statement");
    }

    /**
     * Execute the statement.
     *
     * @param connection the connection used to execute the statement.
     * @throws SQLException if there is a problem executing the statement.
     */
    public abstract void execute(Connection connection) throws SQLException;

    /**
     * Print the result obtained after executing the statement.
     */
    protected abstract void printResult();

    /**
     * Print an horizontal border around text. The total characters displayed in the border depends on the length
     * specified by the parameter. A new line is printed
     *
     * @param length the length of the longest string that will be printed.
     */
    public static String buildHorizontalBorder(int length) {
        Statement.logger.info("Building a horizontal border");

        int limit = 5;

        if(length < limit) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The minimum length to print a horizontal border is " + limit);
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                    + " " + Messages.CHECK_LOG_FILES);
            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
            throw iae;
        }

        StringBuilder line = new StringBuilder();
        line.append(Statement.CORNER_SYMBOL);
        line.append(StringUtils.repeat(Statement.HORIZONTAL_BORDER, length - 2));
        line.append(Statement.CORNER_SYMBOL);
        return line.toString();
    }

    /**
     * Print a right horizontal border around text. The total characters displayed in the border depends on the length
     * specified by the parameter. A new line is printed
     *
     * @param length the length of the longest string that will be printed.
     */
    public static String buildRightHorizontalBorder(int length) {
        Statement.logger.info("Building a horizontal border");

        int limit = 4;

        if(length < limit) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The minimum length to print a horizontal border is " + limit);
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                    + " " + Messages.CHECK_LOG_FILES);
            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
            throw iae;
        }

        StringBuilder line = new StringBuilder();
        line.append(StringUtils.repeat(Statement.HORIZONTAL_BORDER, length - 1));
        line.append(Statement.CORNER_SYMBOL);
        return line.toString();
    }

    // TODO add check to this method like the one above
    /**
     * Print the result of a query that either a single or multiple columns. The <code>columnsMaxLength</code> parameter
     * is not calculated in this method and should be done by the calling method.
     *
     * @throws SQLException if there is a problem print the results.
     */
    private void printMultipleColumn() throws SQLException {
        Statement.logger.info("Printing a result set that has a single or multiple columns");

        if(this.resultSet == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The result set is null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                    + " " + Messages.CHECK_LOG_FILES);
            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
            throw iae;
        }

        int limit = 1;

        // Loop through all of the columns lengths
        for(Integer columnMaxLength : this.columnsMaxLength) {
            if(columnMaxLength < limit) {
                IllegalArgumentException iae = new IllegalArgumentException();
                Statement.logger.fatal(Messages.FATAL + "The minimum length to print a single column is " + limit);
                System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                        + " " + Messages.CHECK_LOG_FILES);
                Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
                throw iae;
            }
        }

        // Since we might be printing multiple columns, the approach we take is to add the left
        // characters and for each column, we complete the right side of the table
        StringBuilder line = new StringBuilder(Statement.CORNER_SYMBOL);
        String label;
        int padding = 3;

        // Loop through all the columns to build the top border of the result
        for(int i = 0; i < this.columnsMaxLength.size(); i++) {
            // The total length of each columns is added by 3 for the right border and the 2 spaces on either side
            this.columnsMaxLength.set(i, this.columnsMaxLength.get(i) + padding);
            // Add a right border the to fit the maximum row in a column
            line.append(Statement.buildRightHorizontalBorder(this.columnsMaxLength.get(i)));
        }

        // After completing the top border, we add a new line
        line.append("\n");
        // Add a vertical border to start the title row
        line.append(Statement.VERTICAL_BORDER);

        // Loop through all of the columns to print the titles of the result table
        for(int i = 1; i <= this.columnsMaxLength.size(); i++) {
            // Get the title
            label = this.resultSet.getMetaData().getColumnLabel(i);

            // Add a white space, title, whitespaces, and right border to complete the title for this column
            line.append(" ");
            line.append(label);
            line.append(StringUtils.repeat(" ", this.columnsMaxLength.get(i-1) - 2 - label.length()));
            line.append(Statement.VERTICAL_BORDER);
        }

        // After completing the titles, we add a new line
        line.append("\n");
        // Add a corner symbol to start bottom border of the title row
        line.append(Statement.CORNER_SYMBOL);

        // Loop through all of the columns
        for(Integer columnMaxLength : this.columnsMaxLength) {
            // Add a right border the to fit the maximum row in a column
            line.append(Statement.buildRightHorizontalBorder(columnMaxLength));
        }

        // After completing the bottom border of titles, we add a new line
        line.append("\n");

        int rowTotal = 0;

        // While the are more rows to process
        while (this.resultSet.next()) {
            // Add a vertical border to start the current row of results
            line.append(Statement.VERTICAL_BORDER);

            // Loop through all of the columns
            for(int i = 1; i <= this.columnsMaxLength.size(); i++) {
                // Get the current row and check if it is null
                String row = Statement.getRowAsString(resultSet, i);

                // Add a white space, row, whitespaces, and right border to complete the row for this column
                line.append(" ");
                line.append(row);
                line.append(StringUtils.repeat(" ", this.columnsMaxLength.get(i-1) - 2 - row.length()));
                line.append(Statement.VERTICAL_BORDER);
            }

            // After completing all of the columns, we add a new line
            line.append("\n");

            rowTotal++;
        }

        // Add a corner symbol to start bottom border of the result table
        line.append(Statement.CORNER_SYMBOL);

        // Loop through all of the columns
        for(Integer columnMaxLength : this.columnsMaxLength) {
            // Add a right border the to fit the maximum row in a column
            line.append(Statement.buildRightHorizontalBorder(columnMaxLength));
        }

        line.append("\n" + Statement.displayResultSetSize(rowTotal));

        // Print the result table
        System.out.println(line);
    }

    /**
     * Check if the string is null. If it is, return "NULL". Otherwise, return the original string.
     *
     * This is a helper method mostly used in resultt values to transform null values into "NULL".
     *
     * @param string the string that will be checked.
     *
     * @return "NULL" if the original string is null or the original string.
     */
    public static String checkAndTransformNull(String string) {
        if(string == null) {
            return "NULL";
        }

        return string;
    }

    /**
     * Print a string that specifies that the result set is empty.
     */
    public static void printEmptySet() {
        System.out.println("Empty set");
    }

    /**
     * Return a list of all of the columns when the user used the {@code SQLUtils.ALL_SYMBOL} to query a table.
     *
     * @param resultSetMetaData the object that has the information about the columns.
     *
     * @return a list with all of the columns in the queried table.
     *
     * @throws SQLException if there is a problem getting the columns.
     */
    public static List<String> transformAllToColumns(ResultSetMetaData resultSetMetaData) throws SQLException {
        Statement.logger.info("Getting all of the columns that the user queried");
        List<String> columns = new ArrayList<String>();

        try {
            // Loop through all of the columns found in the result set metadata
            for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
                // Add the column name to the list
                columns.add(resultSetMetaData.getColumnName(i));
            }
        }
        catch(SQLException sqle) {
            Statement.logger.warn(Messages.WARNING + "Error when getting all of the columns queried", sqle);

            throw sqle;
        }

        return columns;
    }


    /**
     * TODO
     * @param connection
     * @throws SQLException
     */
    protected void executeQuery(Connection connection) throws SQLException {
        try {
            // Execute the query
            java.sql.Statement statement = connection.createStatement();

            long startTime = System.nanoTime();
            this.resultSet = statement.executeQuery(this.statement);
            long endTime = System.nanoTime();

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

            System.out.printf("Execution time: %.2f sec\n", (endTime - startTime)/1000000000.0);

            // Close the result set and statement
            this.resultSet.close();
            statement.close();
        }
        catch(SQLException sqle) {
            Statement.logger.warn(Messages.WARNING + "Error when executing " + this, sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + sqle.getMessage());

            Statement.logger.warn(Messages.WARNING + "Throwing a " + sqle.getClass().getSimpleName()
                    + " to the calling class");
            throw sqle;
        }
    }

    /**
     * TODO
     * @param connection
     * @throws SQLException
     */
    public void executeSQL(Connection connection) throws SQLException {
        // If the connection is null
        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The connection passed to execute the statement "
                    + "cannot be null");
            System.out.println(Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        try {
            // Execute the query
            java.sql.Statement statement = connection.createStatement();
            statement.execute(this.statement);

            this.printResult();
        }
        catch(SQLException sqle) {
            Statement.logger.warn(Messages.WARNING + "Error when executing " + this, sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + sqle.getMessage());

            Statement.logger.warn(Messages.WARNING + "Throwing a " + sqle.getClass().getSimpleName() + " to the calling class");
            throw sqle;
        }
    }

    /**
     * TODO
     * @throws SQLException
     */
    public void printTable() throws SQLException {
        // Get the medatadata from the result set
        ResultSetMetaData resultSetMetaData;
        resultSetMetaData = this.resultSet.getMetaData();

        // Loop through all the columns to build the top border of the result
        for(int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
            // Get the maximum database name length
            this.columnsMaxLength.add(i, resultSetMetaData.getColumnLabel(1).length());
        }

        while(this.resultSet.next()) {
            for(int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
                int maxLength = this.columnsMaxLength.get(i);
                maxLength = Math.max(maxLength, Statement.getRowAsString(this.resultSet, i + 1).length());
                this.columnsMaxLength.set(i, maxLength);
            }
        }

        this.resultSet.beforeFirst();

        // Print the result which is a single column
        this.printMultipleColumn();
    }


    private static String getRowAsString(ResultSet resultSet, int index) {
        try {
            // TODO can we leave this private? Maybe we can make it public if other classes use it
            String type = resultSet.getMetaData().getColumnTypeName(index);

            switch (type) {
                case "VARCHAR":
                    return Statement.checkAndTransformNull(resultSet.getString(index));
                case "INT":
                    return Statement.checkAndTransformNull(resultSet.getInt(index) + "");
                case "DOUBLE":
                    return Statement.checkAndTransformNull(resultSet.getDouble(index) + "");
                case "DATETIME":
                    return Statement.checkAndTransformNull(resultSet.getDate(index) + " " + resultSet.getTime(index));
                case "DATE":
                    return Statement.checkAndTransformNull(resultSet.getDate(index) + "");
                default:
                    System.out.println(type + " is new");
                    // TODO throw an error
                    break;
            }
        }
        catch(SQLException sqle) {
            // TODO
        }

        // TODO should never reach
        return "ERROR";

    }

    private static String displayResultSetSize(int size) {
        if(size == 1) {
            return size + " row in set";
        }

        return size + " rows in set";
    }

    /**
     * TODO
     * @param statement
     */
    public void setStatement(String statement) { this.statement = statement; }

}
