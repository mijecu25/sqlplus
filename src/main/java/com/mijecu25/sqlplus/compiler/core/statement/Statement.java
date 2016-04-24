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
 * @version 0.1.0.2
 */
public abstract class Statement {
    
    protected static final String CORNER_SYMBOL = "+";
    protected static final String HORIZONTAL_BORDER = "-";
    protected static final String VERTICAL_BORDERL = "|";
            
    private static final Logger logger = LogManager.getLogger(Statement.class);
    
    public Statement() {
        ;
    }
    
    /**
     * Execute the statement.
     * 
     * @param connection the connection used to execute the statement.
     */
    public void execute(Connection Connection) throws SQLException {
        // TODO should I change this to a warn?
        Statement.logger.info("This statement does not have an execute method implemented");
    }
    
    /**
     * Print the result obtained after executing the statement
     */
    public void printResult() {
        Statement.logger.info("The statement previously executed does not have a result to print");
    }
    
    public void printHorizontalBorder(int length) {
        StringBuilder line = new StringBuilder();
        line.append(Statement.CORNER_SYMBOL);
        line.append(StringUtils.repeat(Statement.HORIZONTAL_BORDER, length - 2));
        line.append(Statement.CORNER_SYMBOL);
        System.out.println(line);
    }
    
}
