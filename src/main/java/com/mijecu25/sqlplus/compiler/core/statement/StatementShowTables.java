package com.mijecu25.sqlplus.compiler.core.statement;

import com.mijecu25.messages.Messages;
import com.mijecu25.sqlutils.SQLUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * This class represents the "show tables" SQL statement. It prints the tables located within a database.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.13
 */
public class StatementShowTables extends Statement {
    private static final Logger logger = LogManager.getLogger(StatementShowTables.class);

    public StatementShowTables() {
        super();
        StatementShowTables.logger.info("Parsed and created a ShowTablesStatement");
    }

    @Override
    public void execute(Connection connection) throws SQLException {
        StatementShowTables.logger.info("Will execute the code to show the tables");

        // If the connection is null
        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            StatementShowTables.logger.fatal(Messages.FATAL + "The connection passed to execute the statement "
                    + "cannot be null");
            System.out.println(Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            StatementShowTables.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        // Execute the query
        this.executeQuery(connection);
    }

    @Override
    protected void printResult() {
        StatementShowTables.logger.info("Printing the result");
        try{
            // Get the medatadata from the result set
            ResultSetMetaData resultSetMetaData;
            resultSetMetaData = this.resultSet.getMetaData();

            // Get the currently selected database
            String currentDatabase = SQLUtils.selectDatabase(this.connection);
            // Get the maximum table name length
            int maxTableNameLength = SQLUtils.maxTableNameLength(this.connection, currentDatabase);
            // Get the title of the result column
            String label = resultSetMetaData.getColumnLabel(1);
            // The maximum width that we are going to print is either the title of the column
            // or a table name
            maxTableNameLength = Math.max(maxTableNameLength, label.length());

            // Print the result which is a single column
            Statement.printSingleColumn(this.resultSet, maxTableNameLength);
        }
        catch (SQLException sqle) {
            StatementShowTables.logger.warn(Messages.WARNING + "Error when printing the result of " + this, sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + "Could not print the result. " + Messages.CHECK_LOG_FILES);
        }
    }

    @Override
    public String toString() {
        return "StatementShowTables [statement=" + this.statement + "]";
    }
}
