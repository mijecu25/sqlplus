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
 * @version 0.1.0.3
 */
public abstract class StatementDML extends Statement {
    
    protected static final String DELETE = "DELETE ";
    protected static final String INSERT = "INSERT ";
    protected static final String SELECT = "SELECT ";
    protected static final String UPDATE = "UPDATE ";
    protected static final String FROM = " FROM ";

    private static final Logger logger = LogManager.getLogger(StatementDML.class);
    
    protected List<String> columns;
    protected List<String> tables;
    
    public StatementDML(String statement, List<String> columns, List<String> tables) {
        super(statement);
        this.columns = columns;

        // Check if the user entered more than 1 table reference
        if(tables.size() > 1) {
            // We currently support only 1 table reference
            UnsupportedOperationException uoe = new UnsupportedOperationException();
            StatementDML.logger.warn(Messages.WARNING + "You can only enter a single table reference in the FROM clause");
            System.out.println(Messages.WARNING + "You can only enter a single table reference in the FROM clause");
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
     * Transform the list of elements to a comma separated string.
     *
     * @param list the list of elements that are transformed to a string.
     *
     * @return comma separate string with the elements.
     */
    public static String unrollList(List<String> list) {
        StringBuilder result = new StringBuilder();

        // Loop through the list of columns
        for(int i = 0; i < list.size(); i++) {
            // If we are adding another column to the string, add a comma
            if(i > 0) {
                result.append(", ");
            }

            // Add the column to the list
            result.append(list.get(i));
        }
        
        return result.toString();
    }

    /**
     * Helper method to return the first table in the list of referenced tables.
     *
     * @return a string with the name of the first referenced table.
     */
    public String getFirstTable() { return this.tables.get(0); }

}
