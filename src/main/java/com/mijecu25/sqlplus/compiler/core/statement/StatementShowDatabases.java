package com.mijecu25.sqlplus.compiler.core.statement;

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.messages.Messages;
import com.mijecu25.sqlutils.SQLUtils;

/**
 * This class represents the "show databases" SQL statement. It prints the databases found in the server.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.15
 */
public class StatementShowDatabases extends Statement {
    private static final Logger logger = LogManager.getLogger(StatementShowDatabases.class);
    
    public StatementShowDatabases() {
        super();
        StatementShowDatabases.logger.info("Parsed and created a ShowDatabasesStatement");
    }
    
    @Override
    public void execute(Connection connection) throws SQLException {
        StatementShowDatabases.logger.info("Will execute the code to show the databases");

        // If the connection is null
        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            StatementShowDatabases.logger.fatal(Messages.FATAL + "The connection passed to execute the statement "
                    + "cannot be null");
            System.out.println(Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            StatementShowDatabases.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        // Set the connection
        this.connection = connection;
        
        try {
            // Execute the query
            java.sql.Statement statement = this.connection.createStatement();
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
            StatementShowDatabases.logger.warn(Messages.WARNING + "Error when executing " + this, sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + sqle.getMessage());
            
            StatementShowDatabases.logger.warn(Messages.WARNING + "Throwing a " + sqle.getClass().getSimpleName()
                    + " to the calling class");
            throw sqle;
        }

    }
    
    @Override
    protected void printResult() {
        StatementShowDatabases.logger.info("Printing the result");
        try{
            // Get the medatadata from the result set
            ResultSetMetaData resultSetMetaData;
            resultSetMetaData = this.resultSet.getMetaData();

            // Get the maximum database name length
            int maxDatabaseNameLength = SQLUtils.maxDatabaseNameLength(this.connection);
            // Get the title of the result column
            String label = resultSetMetaData.getColumnLabel(1);
            // The maximum width that we are going to print is either the title of the column
            // or a table name
            maxDatabaseNameLength = Math.max(maxDatabaseNameLength, label.length());

            // Print the result which is a single column
            Statement.printSingleColumn(this.resultSet, maxDatabaseNameLength);
        }
        catch (SQLException sqle) {
            StatementShowDatabases.logger.warn(Messages.WARNING + "Error when printing the result of " + this, sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + "Could not print the result. " + Messages.CHECK_LOG_FILES);
        }
    }

    @Override
    public String toString() {
        return "ShowDatabasesStatement [statement=" + this.statement + "]";
    }

}
