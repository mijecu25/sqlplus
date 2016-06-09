package com.mijecu25.sqlplus.compiler.core.statement.dml;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.sqlplus.compiler.core.statement.Statement;

/**
 * This class contains common behavior for all DML SQL statements.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
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
        this.tables = tables;
        StatementDML.logger.info("Parsed and created a StatementDML");
    }
    
    @Override
    public abstract void execute(Connection connection) throws SQLException;

    @Override
    protected abstract void printResult();

    /**
     * Transform the list of columns to a comma separated string.
     *

     * @param columns the columns referenced in the query.
     *
     * @return comma separate string with the columns
     */
    public static String unrollList(List<String> columns) {
        StringBuilder result = new StringBuilder();

        // Loop through the list of columns
        for(int i = 0; i < columns.size(); i++) {
            // If we are adding another column to the string, add a comma
            if(i > 0) {
                result.append(", ");
            }

            // Add the column to the list
            result.append(columns.get(i));
        }
        
        return result.toString();
    }

//    /**
//     * Return the columns referenced in the query.
//     *
//     * @return a list of strings with the columns referenced in the query.
//     */
//    public List<String> getColumns() { return columns; }
//
//    /**
//     * Set the columns referenced in the query.
//     *
//     * @param columns the list of columns referenced in the query.
//     */
//    public void setColumns(List<String> columns) { this.columns = columns; }
//
//    /**
//     * Return the tables referenced in the query.
//     *
//     * @return a list of strings with the tables referenced in the query.
//     */
//    public List<String> getTables() { return this.tables; }
//
//    /**
//     * Set the tables referenced in the query.
//     *
//     * @param tables the list of tables referenced in the query.
//     */
//    public void setTables(List<String> tables) {
//        this.tables = tables;
//    }

}
