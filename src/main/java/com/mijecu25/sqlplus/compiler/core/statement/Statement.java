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
 * @version 0.1.0.10
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
     * @throws SQLException if there is a problem executing the statement
     */
    public abstract void execute(Connection connection) throws SQLException;

    /**
     * Print the result obtained after executing the statement
     */
    protected abstract void printResult();

    /**
     * Print an horizontal border around text. The total characters displayed in the border depend on the length
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
