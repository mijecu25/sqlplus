package com.mijecu25.sqlplus.compiler.core.statement;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.messages.Messages;

/**
 * This class represents either a SQLPlus statement or a regular SQL statement.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.4
 */
public abstract class Statement {
    
    private String statement;
    private Connection connection;
    
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
        Statement.logger.info("Created a Statement with a statement");
    }
    
    /**
     * Execute the statement.
     * 
     * @param Connection connection the connection used to execute the statement.
     * @throws SQLException
     */
    public abstract void execute(Connection connection) throws SQLException;
//    Statement.logger.info("This statement does not have an execute method implemented");
    
    /**
     * Print the result obtained after executing the statement
     */
    protected abstract void printResult();
//        Statement.logger.info("The statement previously executed does not have a result to print")
    
    /**
     * Print an horizontal border around text. The total characters displayed in the border depend on the length
     * specified by the parameter.
     *  
     * @param length the length of the longest string that will be printed.
     */
    public void printHorizontalBorder(int length) {
        if(length < 5) {
            IllegalArgumentException iae = new IllegalArgumentException();
            Statement.logger.fatal(Messages.FATAL + "The minimum length to print a horizontal border is 5");
            System.out.println(Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + Messages.SPACE
                    + "The minimum length to print a horizontal border is 5." + Messages.SPACE 
                    + Messages.CHECK_LOG_FILES);
            throw iae;
        }
        
        StringBuilder line = new StringBuilder();
        line.append(Statement.CORNER_SYMBOL);
        line.append(StringUtils.repeat(Statement.HORIZONTAL_BORDER, length - 2));
        line.append(Statement.CORNER_SYMBOL);
        System.out.println(line);
    }

    /**
     * Return the statement that will be executed.
     * 
     * @return the string that represents the statement that will be executed
     */
    protected String getStatement() { return this.statement; }

    /**
     * Return the connection to the database.
     * 
     * @return the connection used to execute the statement.
     */
    protected Connection getConnection() { return this.connection; }

    /**
     * Set the statement.
     * 
     * @param statement the statement that will be executed
     */
    protected void setStatement(String statement) { this.statement = statement; }

    /**
     * Set the connection.
     * 
     * @param connection the connection used to execute the statement.
     */
    protected void setConnection(Connection connection) { this.connection = connection; }    
}
