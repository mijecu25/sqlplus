package com.mijecu25.sqlplus.compiler.core.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.messages.Messages;

/**
 * This class represents either a SQLPlus statement or a regular SQL statement.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.12
 */
public abstract class Statement {
    
    protected String statement;
    protected Connection connection; 
    protected ResultSet resultSet;
    
    protected static final String CORNER_SYMBOL = "+";
    protected static final String HORIZONTAL_BORDER = "-";
    protected static final String VERTICAL_BORDERL = "|";
            
    private static final Logger logger = LogManager.getLogger(Statement.class);
    
    /**
     * Create a statement object
     */
    public Statement() {
        this("");
        Statement.logger.info("Created a default Statement");
    }
       
    /**
     * Create a statement object using a statement.
     *
     * @param statement the string that represents the statement that will be executed
     */
    public Statement(String statement) {
        this.statement = statement;
        this.connection = null;
        this.resultSet = null;
        Statement.logger.info("Created a Statement with a string statement");
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
     * @throws SQLException if there is a problem executing the statement.
     */
    protected abstract void printResult() throws SQLException;

    /**
     * Print an horizontal border around text. The total characters displayed in the border depends on the length
     * specified by the parameter. A new line is printed
     *  
     * @param length the length of the longest string that will be printed.
     */
    public static String buildHorizontalBorder(int length) {
        if(length < 5) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The minimum length to print a horizontal border is 5");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                    + Messages.SPACE + Messages.CHECK_LOG_FILES);
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
     * TODO check the parameter check
     * Print a right horizontal border around text. The total characters displayed in the border depends on the length
     * specified by the parameter. A new line is printed
     *
     * @param length the length of the longest string that will be printed.
     */
    public static String buildRightHorizontalBorder(int length) {
        if(length < 4) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The minimum length to print a horizontal border is 4");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                    + Messages.SPACE + Messages.CHECK_LOG_FILES);
            Statement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
            throw iae;
        }

        StringBuilder line = new StringBuilder();
        line.append(StringUtils.repeat(Statement.HORIZONTAL_BORDER, length - 1));
        line.append(Statement.CORNER_SYMBOL);
        return line.toString();
    }
    
    public static void printSingleColumn(ResultSet resultSet, int maxLength) throws SQLException {
        if(resultSet == null) {
            // TODO
        }
        
        if(maxLength < 0) {
            // TODO
        }
        
        StringBuilder line = new StringBuilder();
        // The total length is added by 4 for the 2 borders and the 2 spaces on either side
        int lineTotalLength = maxLength + 4;
        // Print the horizontal border based on the length
        line.append(Statement.buildHorizontalBorder(lineTotalLength) + "\n");

        // Get the title of the result column
        String label = resultSet.getMetaData().getColumnLabel(1);
        // Build the label of the column
        line.append(StatementShowDatabases.VERTICAL_BORDERL + " ");
        line.append(label);
        line.append(StringUtils.repeat(" ", lineTotalLength - 3 - label.length()));
        line.append(StatementShowDatabases.VERTICAL_BORDERL + "\n");

        // Build a border after the name of the column
        line.append(Statement.buildHorizontalBorder(lineTotalLength) + "\n");

        // While the are more rows to process
        while(resultSet.next()) {
            // Get and print the current row value
            String row = resultSet.getString(1);

            line.append(StatementShowDatabases.VERTICAL_BORDERL + " ");
            line.append(row);
            line.append(StringUtils.repeat(" ", lineTotalLength - 3 - row.length()));
            line.append(StatementShowDatabases.VERTICAL_BORDERL + "\n");
        }

        // Build a border after the all of the rows
        line.append(Statement.buildHorizontalBorder(lineTotalLength) + "\n");

        System.out.println(line);
    }

//    /**
//     * Return the statement that will be executed.
//     * 
//     * @return the string that represents the statement that will be executed
//     */
//    protected String getStatement() { return this.statement; }
//
//    /**
//     * Return the connection to the database.
//     * 
//     * @return the connection used to execute the statement.
//     */
//    protected Connection getConnection() { return this.connection; }
//
//    /**
//     * Set the statement.
//     * 
//     * @param statement the statement that will be executed
//     */
//    protected void setStatement(String statement) { this.statement = statement; }
//
//    /**
//     * Set the connection.
//     * 
//     * @param connection the connection used to execute the statement.
//     */
//    protected void setConnection(Connection connection) { this.connection = connection; }    
}
