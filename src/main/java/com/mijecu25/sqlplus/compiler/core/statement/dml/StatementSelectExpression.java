package com.mijecu25.sqlplus.compiler.core.statement.dml;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StatementSelectExpression extends StatementDML {
        
    public StatementSelectExpression(List<String> columns, String table) {
        super(StatementDML.SELECT + StatementDML.unrollColumns(columns) + StatementDML.FROM + table,
        columns, table);
    }

    @Override
    public void execute(Connection connection) throws SQLException {
        System.out.println(this);
        
    }

    @Override
    protected void printResult() {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "StatementSelectExpression [statement=" + this.getStatement() + "]";
    }
    
}
