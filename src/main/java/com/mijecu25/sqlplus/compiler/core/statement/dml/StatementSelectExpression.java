package com.mijecu25.sqlplus.compiler.core.statement.dml;

import com.mijecu25.messages.Messages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * This class represents the "select...." SQL statement. It prints the columns that match the query.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.14
 */
public class StatementSelectExpression extends StatementDML {
    private static final Logger logger = LogManager.getLogger(StatementSelectExpression.class);

    public StatementSelectExpression(List<String> columns, List<String> tables) {
        super(columns, tables);

        StatementSelectExpression.logger.info("Parsed and created a StatementSelectExpression");
    }

    @Override
    public void execute(Connection connection) throws SQLException {
        StatementSelectExpression.logger.info("Will execute the code to query the database using a select statement");

        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            StatementSelectExpression.logger.fatal(Messages.FATAL + "The connection passed to execute the statement "
                    + "cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            StatementSelectExpression.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        this.executeQuery(connection);
        // TODO Do we need to catch the exception here?
    }

    @Override
    protected void printResult() {
        StatementSelectExpression.logger.info("Printing the result");

        try{
            this.printTable();
        }
        catch (SQLException sqle) {
            StatementSelectExpression.logger.warn(Messages.WARNING + "Error when printing the result of " + this, sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + "Could not print the result. " + Messages.CHECK_LOG_FILES);
        }

    }

    @Override
    public String toString() {
        return "StatementSelectExpression [statement=" + this.statement + "]";
    }

}
