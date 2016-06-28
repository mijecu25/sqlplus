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
 * @version 0.1.0.22
 */
public abstract class Statement {

    protected String statement;
    protected Connection connection;
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
        this.connection = null;
        this.resultSet = null;
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

    /**
     * Print the result of a query that only has a single column. If the result set has more than 1 column, an
     * exception is thrown. The <code>maxLength</code> parameter is not calculated in this method and should be
     * done by the calling method.
     *
     * @param resultSet the result set that will be printed.
     * @param maxLength the calculated maximum length of the row in the table.
     *
     * @throws SQLException if there is a problem print the results.
     */
    public static void printSingleColumn(ResultSet resultSet, int maxLength) throws SQLException {
        Statement.logger.info("Printing a result set that has a single column");

        if(resultSet == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The result set is null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                    + " " + Messages.CHECK_LOG_FILES);
            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
            throw iae;
        }

        // If there is more than a single column
        if(resultSet.getMetaData().getColumnCount() > 1) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The result set has more than one column");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                    + " " + Messages.CHECK_LOG_FILES);
            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
            throw iae;
        }

        int limit = 1;

        if(maxLength < limit) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The minimum length to print a single column is " + limit);
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                    + " " + Messages.CHECK_LOG_FILES);
            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
            throw iae;
        }


        StringBuilder line = new StringBuilder();

        try {
            // The total length is added by 4 for the 2 borders and the 2 spaces on either side
            int lineTotalLength = maxLength + 4;
            // Print the horizontal border based on the length
            line.append(Statement.buildHorizontalBorder(lineTotalLength) + "\n");

            // Get the title of the result column
            String label = resultSet.getMetaData().getColumnLabel(1);
            // Build the label of the column
            line.append(Statement.VERTICAL_BORDER + " ");
            line.append(label);
            line.append(StringUtils.repeat(" ", lineTotalLength - 3 - label.length()));
            line.append(Statement.VERTICAL_BORDER + "\n");

            // Build a border after the name of the column
            line.append(Statement.buildHorizontalBorder(lineTotalLength) + "\n");

            // While the are more rows to process
            while (resultSet.next()) {
                // Get and print the current row value
                String row = Statement.getRowAsString(resultSet, 1);

                line.append(Statement.VERTICAL_BORDER + " ");
                line.append(row);
                line.append(StringUtils.repeat(" ", lineTotalLength - 3 - row.length()));
                line.append(Statement.VERTICAL_BORDER + "\n");
            }

            // Build a border after the all of the rows
            line.append(Statement.buildHorizontalBorder(lineTotalLength));
            line.append("\n");
        }
        catch(SQLException sqle) {
            Statement.logger.warn(Messages.WARNING + "Error when printing a single column result", sqle);

            throw sqle;
        }

        System.out.println(line);
    }

    /**
     * Print the result of a query that either a single or multiple columns. The <code>columnsMaxLength</code> parameter
     * is not calculated in this method and should be done by the calling method.
     *
     * @param resultSet the result set that will be printed.
     * @param columnsMaxLength the calculated maximum length of each of column in the table.
     *
     * @throws SQLException if there is a problem print the results.
     */
    public static void printMultipleColumn(ResultSet resultSet, List<Integer> columnsMaxLength) throws SQLException {
        Statement.logger.info("Printing a result set that has a single or multiple columns");

        if(resultSet == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The result set is null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                    + " " + Messages.CHECK_LOG_FILES);
            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
            throw iae;
        }

        int limit = 1;

        // Loop through all of the columns lengths
        for(Integer columnMaxLength : columnsMaxLength) {
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
        for(int i = 0; i < columnsMaxLength.size(); i++) {
            // The total length of each columns is added by 3 for the right border and the 2 spaces on either side
            columnsMaxLength.set(i, columnsMaxLength.get(i) + padding);
            // Add a right border the to fit the maximum row in a column
            line.append(Statement.buildRightHorizontalBorder(columnsMaxLength.get(i)));
        }

        // After completing the top border, we add a new line
        line.append("\n");
        // Add a vertical border to start the title row
        line.append(Statement.VERTICAL_BORDER);

        // Loop through all of the columns to print the titles of the result table
        for(int i = 1; i <= columnsMaxLength.size(); i++) {
            // Get the title
            label = resultSet.getMetaData().getColumnLabel(i);

            // Add a white space, title, whitespaces, and right border to complete the title for this column
            line.append(" ");
            line.append(label);
            line.append(StringUtils.repeat(" ", columnsMaxLength.get(i-1) - 2 - label.length()));
            line.append(Statement.VERTICAL_BORDER);
        }

        // After completing the titles, we add a new line
        line.append("\n");
        // Add a corner symbol to start bottom border of the title row
        line.append(Statement.CORNER_SYMBOL);

        // Loop through all of the columns
        for(Integer columnMaxLength : columnsMaxLength) {
            // Add a right border the to fit the maximum row in a column
            line.append(Statement.buildRightHorizontalBorder(columnMaxLength));
        }

        // After completing the bottom border of titles, we add a new line
        line.append("\n");

        // While the are more rows to process
        while (resultSet.next()) {
            // Add a vertical border to start the current row of results
            line.append(Statement.VERTICAL_BORDER);

            // Loop through all of the columns
            for(int i = 1; i <= columnsMaxLength.size(); i++) {
                // Get the current row and check if it is null
                String row = Statement.getRowAsString(resultSet, i);

                // Add a white space, row, whitespaces, and right border to complete the row for this column
                line.append(" ");
                line.append(row);
                line.append(StringUtils.repeat(" ", columnsMaxLength.get(i-1) - 2 - row.length()));
                line.append(Statement.VERTICAL_BORDER);
            }

            // After completing all of the columns, we add a new line
            line.append("\n");
        }

        // Add a corner symbol to start bottom border of the result table
        line.append(Statement.CORNER_SYMBOL);

        // Loop through all of the columns
        for(Integer columnMaxLength : columnsMaxLength) {
            // Add a right border the to fit the maximum row in a column
            line.append(Statement.buildRightHorizontalBorder(columnMaxLength));
        }

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
    public void executeQuery(Connection connection) throws SQLException {
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

        // Set the connection
        this.connection = connection;

        try {
            // Execute the query
            java.sql.Statement statement = connection.createStatement();
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
            Statement.logger.warn(Messages.WARNING + "Error when executing " + this, sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + sqle.getMessage());

            Statement.logger.warn(Messages.WARNING + "Throwing a " + sqle.getClass().getSimpleName()
                    + " to the calling class");
            throw sqle;
        }
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

    /**
     * TODO
     * @param statement
     */
    public void setStatement(String statement) { this.statement = statement; }

}
