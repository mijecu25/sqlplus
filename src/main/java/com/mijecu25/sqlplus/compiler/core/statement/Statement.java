package com.mijecu25.sqlplus.compiler.core.statement;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class represents either a SQLPlus statement or a regular SQL statement.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.3
 */
public abstract class Statement {
    
    private String statement;
    private Connection connection;
    
    protected static final String CORNER_SYMBOL = "+";
    protected static final String HORIZONTAL_BORDER = "-";
    protected static final String VERTICAL_BORDERL = "|";
            
    private static final Logger logger = LogManager.getLogger(Statement.class);
    
    /**
     * TODO
     * @param connection
     * @param statement
     */
    public Statement(Connection connection, String statement) {
        Statement.logger.info("Created a Statement with a connection and statement");
        this.connection = connection;
        this.statement = statement;
    }
    
    /**
     * TODO
     */
    public Statement() {
        this(null,null);
        Statement.logger.info("Created a default Statement");
    }
    
    /**
     * TODO
     * @param connection
     */
    public Statement(Connection connection) {
        this(connection, null);
        Statement.logger.info("Created a Statement with a connection");
    }
    
    /**
     * TODO
     * @param statement
     */
    public Statement(String statement) {
        this(null, statement);
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
    public abstract void printResult();
//        Statement.logger.info("The statement previously executed does not have a result to print")
    
    /**
     * 
     * @param length
     */
    public void printHorizontalBorder(int length) {
        StringBuilder line = new StringBuilder();
        line.append(Statement.CORNER_SYMBOL);
        line.append(StringUtils.repeat(Statement.HORIZONTAL_BORDER, length - 2));
        line.append(Statement.CORNER_SYMBOL);
        System.out.println(line);
    }

    /**
     * TODO
     * @return the statement
     */
    protected String getStatement() { return this.statement; }

    /**
     * TODO
     * @return the connection
     */
    protected Connection getConnection() { return this.connection; }

    /**
     * TODO
     * @param statement the statement to set
     */
    protected void setStatement(String statement) { this.statement = statement; }

    /**
     * TODO
     * @param connection the connection to set
     */
    protected void setConnection(Connection connection) { this.connection = connection; }    
}
