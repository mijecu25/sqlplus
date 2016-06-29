package com.mijecu25.sqlplus.compiler.core.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mijecu25.sqlplus.SQLPlus;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.messages.Messages;

/**
 * This class represents either a SQLPlus statement or a regular SQL statement.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.26
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
            Statement.logger.fatal(Messages.FATAL + "The minimum length to print a right horizontal border is " + limit);
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

//        if(this.resultSet == null) {
//            IllegalArgumentException iae = new IllegalArgumentException();
//            Statement.logger.fatal(Messages.FATAL + "The result set is null");
//            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
//                    + " " + Messages.CHECK_LOG_FILES);
//            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
//            throw iae;
//        }
//
//        int limit = 1;
//
//        // Loop through all of the columns lengths
//        for(Integer columnMaxLength : this.columnsMaxLength) {
//            if(columnMaxLength < limit) {
//                IllegalArgumentException iae = new IllegalArgumentException();
//                Statement.logger.fatal(Messages.FATAL + "The minimum length to print a single column is " + limit);
//                System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
//                        + " " + Messages.CHECK_LOG_FILES);
//                Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
//                throw iae;
//            }
//        }

        try {
            // Since we might be printing multiple columns, the approach we take is to add the left
            // characters and for each column, we complete the right side of the table
            StringBuilder line = new StringBuilder(Statement.CORNER_SYMBOL);
            String label;
            int padding = 3;

            // Loop through all the columns to build the top border of the result
            for (int i = 0; i < this.columnsMaxLength.size(); i++) {
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
            for (int i = 1; i <= this.columnsMaxLength.size(); i++) {
                // Get the title
                label = this.resultSet.getMetaData().getColumnLabel(i);

                // Add a white space, title, whitespaces, and right border to complete the title for this column
                line.append(" ");
                line.append(label);
                line.append(StringUtils.repeat(" ", this.columnsMaxLength.get(i - 1) - 2 - label.length()));
                line.append(Statement.VERTICAL_BORDER);
            }

            // After completing the titles, we add a new line
            line.append("\n");
            // Add a corner symbol to start bottom border of the title row
            line.append(Statement.CORNER_SYMBOL);

            // Loop through all of the columns
            for (Integer columnMaxLength : this.columnsMaxLength) {
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
                for (int i = 1; i <= this.columnsMaxLength.size(); i++) {
                    // Get the current row and check if it is null
                    String row = this.getRowAsString(i);

                    // Add a white space, row, whitespaces, and right border to complete the row for this column
                    line.append(" ");
                    line.append(row);
                    line.append(StringUtils.repeat(" ", this.columnsMaxLength.get(i - 1) - 2 - row.length()));
                    line.append(Statement.VERTICAL_BORDER);
                }

                // After completing all of the columns, we add a new line
                line.append("\n");

                rowTotal++;
            }

            // Add a corner symbol to start bottom border of the result table
            line.append(Statement.CORNER_SYMBOL);

            // Loop through all of the columns
            for (Integer columnMaxLength : this.columnsMaxLength) {
                // Add a right border the to fit the maximum row in a column
                line.append(Statement.buildRightHorizontalBorder(columnMaxLength));
            }

            line.append("\n" + Statement.displayResultSetSize(rowTotal));

            // Print the result table
            System.out.println(line);
        }
        catch(SQLException sqle) {
            Statement.logger.warn(Messages.WARNING + "Error when printing a result set with single or multiple columns",
                    sqle);

            throw sqle;
        }
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
     * Execute a SQL query statement using the provided connection. This type of execution generates a single ResultSet
     * object.
     *
     * @param connection the connection used to execute the query.
     * @throws SQLException if there is a problem executing the query.
     */
    protected void executeQuery(Connection connection) throws SQLException {
        // If the connection is null
        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The connection passed to execute the query "
                    + "cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        try {
            // Create a Java statement with a resultSet that can be scrolled and cannot be updated while scrolling
            java.sql.Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            long startTime = System.nanoTime();
            this.resultSet = statement.executeQuery(this.statement);
            long endTime = System.nanoTime();

            // The result from the query is null
            if(this.resultSet == null) {
                // Throw an exception because this is very weird. Also,
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
     * Execute a SQL statement using the provided connection. This type of execution does not generate any object.
     * Developers should implement their own output to the user.
     *
     * @param connection the connection used to execute the query.
     * @throws SQLException if there is a problem executing the query.
     */
    protected void executeSQL(Connection connection) throws SQLException {
        // If the connection is null
        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The connection passed to execute sql "
                    + "cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        try {
            // Create a Java statement
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
     * Print a result table after executing a statement.
     *
     * @throws SQLException if there is a problem printing a result table.
     */
    protected void printTable() throws SQLException {
        try {
            // Get the medatadata from the result set
            ResultSetMetaData resultSetMetaData;
            resultSetMetaData = this.resultSet.getMetaData();

            // Loop through all the columns to build the top border of the result
            for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
                // Get the maximum database name length
                this.columnsMaxLength.add(i, resultSetMetaData.getColumnLabel(1).length());
            }

            while (this.resultSet.next()) {
                for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
                    int maxLength = this.columnsMaxLength.get(i);
                    maxLength = Math.max(maxLength, this.getRowAsString(i + 1).length());
                    this.columnsMaxLength.set(i, maxLength);
                }
            }

            // Move the cursor before the first row to be able to print the results
            this.resultSet.beforeFirst();

            // Print the result which is a single column
            this.printMultipleColumn();
        }
        catch(SQLException sqle) {
            Statement.logger.warn(Messages.WARNING + "Error when printing a table result", sqle);

            throw sqle;
        }
    }

    /**
     * Extracts the current row from a result set using the correct method based on its data type. The data type is
     * derived from the column type in the resultSet.
     *
     * @param columnIndex the index of the column for the current row.
     *
     * @return a string representation of the current row.
     *
     * @throws SQLException if there is a problem transforming a row into a string.
     */
    protected String getRowAsString(int columnIndex) throws SQLException {
        if(columnIndex < 1) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The minimum column index: " + columnIndex + " cannot be less than 1");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                    + " " + Messages.CHECK_LOG_FILES);
            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
            throw iae;
        }

        try {
            String type = this.resultSet.getMetaData().getColumnTypeName(columnIndex);

            // Get a string based on types
            switch (type) {
                case "VARCHAR":
                    return Statement.checkAndTransformNull(this.resultSet.getString(columnIndex));
                case "INT":
                    return Statement.checkAndTransformNull(this.resultSet.getInt(columnIndex) + "");
                case "DOUBLE":
                    return Statement.checkAndTransformNull(this.resultSet.getDouble(columnIndex) + "");
                case "DATETIME":
                    return Statement.checkAndTransformNull(this.resultSet.getDate(columnIndex) + " " + this.resultSet.getTime(columnIndex));
                case "DATE":
                    return Statement.checkAndTransformNull(this.resultSet.getDate(columnIndex) + "");
                default:
                    throw new UnsupportedOperationException(type + " is not currently a supported data type in " + SQLPlus.PROGRAM_NAME);
            }
        }
        catch(SQLException sqle) {
            Statement.logger.warn(Messages.WARNING + "Error when transforming a row to a string", sqle);

            throw sqle;
        }
    }

    /**
     * Format a string that displays the size of a result set based on its size.
     *
     * @param size the number of rows in the result set.
     *
     * @return a string formatted based on the size of the result.
     */
    public static String displayResultSetSize(int size) {
        if(size < 1) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The minimum result set size: " + size + " cannot be less than 1");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                    + " " + Messages.CHECK_LOG_FILES);
            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
            throw iae;
        }

        if(size == 1) {
            return size + " row in set";
        }

        return size + " rows in set";
    }

    /**
     * Set the statement string.
     *
     * @param statement the statement.
     */
    public void setStatement(String statement) { this.statement = statement; }

}
