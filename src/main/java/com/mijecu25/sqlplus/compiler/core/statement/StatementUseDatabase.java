package com.mijecu25.sqlplus.compiler.core.statement;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * TODO
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
 */
public class StatementUseDatabase extends Statement {
    
    private String database;
    
    private static final Logger logger = LogManager.getLogger(StatementUseDatabase.class);
    
    public StatementUseDatabase(String statement, String database) {
        super(statement);
        StatementUseDatabase.logger.info("Parsed and created a StatementUseDatabase");
        this.database = database;
    }

    @Override
    public void execute(Connection connection) throws SQLException {
        StatementUseDatabase.logger.info("Will execute the code to use the specified database");
        this.setConnection(connection);
        java.sql.Statement statement = this.getConnection().createStatement();
        statement.execute(this.getStatement());
        // TODO check how to handle the exception
        
        this.printResult();        
    }

    @Override
    public void printResult() {
        StatementUseDatabase.logger.info("Printing message that acknowledges that the database was changed");
        System.out.println("Database changed to " + this.database);
    }

    @Override
    public String toString() {
        return "StatementUseDatabase [statement=" + this.getStatement() + "]";
    }

}
