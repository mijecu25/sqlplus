package com.mijecu25.sqlplus.compiler.core.statement.dml;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.mijecu25.sqlplus.compiler.core.statement.Statement;

public abstract class StatementDML extends Statement {
    
    protected static final String DELETE = "DELETE ";
    protected static final String INSERT = "INSERT ";
    protected static final String SELECT = "SELECT ";
    protected static final String UPDATE = "UPDATE ";
    protected static final String FROM = " FROM ";    
    
    private List<String> columns;
    private String table;
    
    public StatementDML(String statement, List<String> columns, String table) {
        super(statement);
        this.columns = columns;
        this.table = table;
    }
    
    @Override
    public abstract void execute(Connection connection) throws SQLException;

    @Override
    protected abstract void printResult();

    public static String unrollColumns(List<String> columns) {
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < columns.size(); i++) {
            if(i > 0) {
                result.append(", ");
            }
            
            result.append(columns.get(i));
        }
        
        return result.toString();
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "StatementDML []";
    }
    
    
}
