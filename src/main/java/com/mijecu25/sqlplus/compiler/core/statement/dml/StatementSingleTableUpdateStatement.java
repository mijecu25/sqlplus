package com.mijecu25.sqlplus.compiler.core.statement.dml;

import com.mijecu25.messages.Messages;
import com.mijecu25.sqlplus.compiler.core.expression.Expression;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

/**
 * This class represents the "update...." SQL statement. It updates the columns that match the query.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.2
 */
public class StatementSingleTableUpdateStatement extends StatementDML {
    private Map<String, Expression> columnValues;

    private static final Logger logger = LogManager.getLogger(StatementSingleTableUpdateStatement.class);


    public StatementSingleTableUpdateStatement(String table, Map<String, Expression> columnValues, Expression whereClause) {
        super(StatementDML.tableToList(table), whereClause);

        this.columnValues = columnValues;

        StatementSingleTableUpdateStatement.logger.info("Parsed and created a StatementInsertStatement1");
    }

    @Override
    public void execute(Connection connection) throws SQLException {
        StatementSingleTableUpdateStatement.logger.info("Will execute the code to update columns in the selected database");

        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            StatementSingleTableUpdateStatement.logger.fatal(Messages.FATAL + "The connection passed to execute the statement "
                    + "cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            StatementSingleTableUpdateStatement.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        this.executeUpdate(connection);
        // TODO Do we need to catch the exception here?
    }

    @Override
    protected void printResult() {
        StatementSingleTableUpdateStatement.logger.info("Printing the result");
    }

    @Override
    public String toString() {
        return "StatementSingleTableUpdateStatement [statement=" + this.statement + "]";
    }
}