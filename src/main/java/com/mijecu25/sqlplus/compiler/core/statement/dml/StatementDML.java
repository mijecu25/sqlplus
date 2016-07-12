package com.mijecu25.sqlplus.compiler.core.statement.dml;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mijecu25.messages.Messages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.sqlplus.compiler.core.statement.Statement;

/**
 * This class contains common behavior for all DML SQL statements.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.8
 */
public abstract class StatementDML extends Statement {
    private static final Logger logger = LogManager.getLogger(StatementDML.class);
    
    protected List<String> columns;
    protected List<String> tables;
    
    public StatementDML(List<String> columns, List<String> tables) {
        super();
        this.columns = columns;

        if(tables.size() > 1) {
            // We currently support only 1 table reference
            UnsupportedOperationException uoe = new UnsupportedOperationException();
            String message = Messages.WARNING + "You can only enter a single table reference";
            StatementDML.logger.warn(message);
            System.out.println(message);
            StatementDML.logger.warn(Messages.WARNING + "Throwing a " + uoe.getClass().getSimpleName() + " to the calling class");
            throw uoe;
        }

        this.tables = tables;
        StatementDML.logger.info("Parsed and created a StatementDML");
    }
    
    @Override
    public abstract void execute(Connection connection) throws SQLException;

    @Override
    protected abstract void printResult();

    /**
     * TODO
     *
     * @param connection the connection used to execute the query.
     * @throws SQLException if there is a problem executing the query.
     */
    protected void executeUpdate(Connection connection) throws SQLException {
        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            StatementDML.logger.fatal(Messages.FATAL + "The connection passed to execute the query "
                    + "cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            StatementDML.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        try {
            // Create a Java statement with a resultSet that can be scrolled and cannot be updated while scrolling
            java.sql.Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            long startTime = System.nanoTime();
            int rowCount = statement.executeUpdate(this.statement);
            long endTime = System.nanoTime();

            System.out.println(StatementDML.displayNumberOfAffectedRows(rowCount));

            System.out.printf("Execution time: %.2f sec\n", (endTime - startTime)/1000000000.0);

            statement.close();
        }
        catch(SQLException sqle) {
            StatementDML.logger.warn(Messages.WARNING + "Error when executing " + this, sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + sqle.getMessage());

            StatementDML.logger.warn(Messages.WARNING + "Throwing a " + sqle.getClass().getSimpleName()
                    + " to the calling class");
            throw sqle;
        }
    }

    /**
     * Helper method to return the first table in the list of referenced tables.
     *
     * @return a string with the name of the first referenced table.
     */
    public String getFirstTable() { return this.tables.get(0); }

    /**
     * Format a string that displays the number of rows affected by a query.
     *
     * @param rowCount the number of rows affected by a query.
     *
     * @return a string formatted based on the numbers of affected rows.
     */
    public static String displayNumberOfAffectedRows(int rowCount) {
        if(rowCount < 0) {
            IllegalArgumentException iae = new IllegalArgumentException();
            StatementDML.logger.fatal(Messages.FATAL + "The minimum number of affected rows: " + rowCount
                    + " cannot be less than 0");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                    + " " + Messages.CHECK_LOG_FILES);
            StatementDML.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName() + " to the calling class");
            throw iae;
        }

        StringBuilder result = new StringBuilder();
        result.append("Query OK, ");
        result.append(rowCount);

        if(rowCount == 1) {
            result.append(" row");
        }
        else {
            result.append(" rows");
        }

        result.append(" in set");

        return result.toString();
    }

}
