package com.mijecu25.sqlplus.compiler.core.statement.dml;

import java.sql.Connection;
import java.sql.SQLException;

import com.mijecu25.sqlplus.compiler.core.statement.Statement;

/**
 * TODO
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1 
 */
public class StatementSelect extends Statement {
       
    @Override
    public void execute(Connection connection) throws SQLException {
        // TODO Auto-generated method stub
        System.out.println(this);
    }

    @Override
    protected void printResult() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {
        return "StatementSelect [statement=" + this.statement + "]";
    }

}
