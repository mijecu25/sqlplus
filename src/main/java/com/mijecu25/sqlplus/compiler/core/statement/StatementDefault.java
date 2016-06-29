package com.mijecu25.sqlplus.compiler.core.statement;

import com.mijecu25.messages.Messages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * This class represents a default SQL statement.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.2
 */
public class StatementDefault extends Statement {
    private static final Logger logger = LogManager.getLogger(StatementDefault.class);

    public StatementDefault() {
        super();
        StatementDefault.logger.info("Parsed and created a default statement object");
    }

    @Override
    public void execute(Connection connection) throws SQLException {
        StatementDefault.logger.info("Will execute the code of a default SQL statement");

        // If the connection is null
        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            StatementDefault.logger.fatal(Messages.FATAL + "The connection passed to execute the statement "
                    + "cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            StatementDefault.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        this.executeQuery(connection);
        // TODO Do we need to catch the exception here?
    }

    @Override
    protected void printResult() {
        StatementDefault.logger.info("Printing the result");

        try{
            this.printTable();
        }
        catch (SQLException sqle) {
            StatementDefault.logger.warn(Messages.WARNING + "Error when printing the result of " + this, sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + "Could not print the result. " + Messages.CHECK_LOG_FILES);
        }
    }

    @Override
    public String toString() {
        return "StatementDefault [statement=" + this.statement + "]";
    }
}
