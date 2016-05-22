package com.mijecu25.sqlplus.compiler.core.statement;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.messages.Messages;

/**
 * This class represents the "use <code>database</code>" SQL statement. It changes the current database
 * in the server and prints a message with the name of the current database.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.5
 */
public class StatementUseDatabase extends Statement {
    
    private String database;
    
    private static final String STATEMENT = "use ";
    
    private static final Logger logger = LogManager.getLogger(StatementUseDatabase.class);
    
    public StatementUseDatabase(String database) {
        super(StatementUseDatabase.STATEMENT + database);
        StatementUseDatabase.logger.info("Parsed and created a StatementUseDatabase");
        this.database = database;
    }

    @Override
    public void execute(Connection connection) throws SQLException {
        StatementUseDatabase.logger.info("Will execute the code to use " + this.database);

        // If the connection is null
        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            StatementUseDatabase.logger.fatal(Messages.FATAL + "The connection passed to execute the statement "
                    + "cannot be null");
            System.out.println(Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + Messages.SPACE
                    + Messages.CHECK_LOG_FILES);
            StatementUseDatabase.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        // Set the connection
        this.setConnection(connection);
        
        try {
            // Execute the query
            java.sql.Statement statement = this.getConnection().createStatement();
            statement.execute(this.getStatement());

            this.printResult();                    
        }
        catch(SQLException sqle) {
            StatementUseDatabase.logger.warn(Messages.WARNING + "Error when executing " + this, sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + sqle.getMessage());
            
            StatementUseDatabase.logger.warn(Messages.WARNING + "Throwing a " + sqle.getClass().getSimpleName() + " to the calling class");
            throw sqle;
        }
    }

    @Override
    protected void printResult() {
        StatementUseDatabase.logger.info("Printing message that acknowledges that the database was changed");
        System.out.println("Database changed to " + this.database);
    }

    @Override
    public String toString() {
        return "StatementUseDatabase [statement=" + this.getStatement() + "]";
    }

}
