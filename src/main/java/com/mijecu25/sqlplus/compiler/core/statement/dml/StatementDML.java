package com.mijecu25.sqlplus.compiler.core.statement.dml;

import java.sql.Connection;
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
 * @version 0.1.0.7
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
            String message = Messages.WARNING + "You can only enter a single table reference in the FROM clause";
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
     * Helper method to return the first table in the list of referenced tables.
     *
     * @return a string with the name of the first referenced table.
     */
    public String getFirstTable() { return this.tables.get(0); }

}
