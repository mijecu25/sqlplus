package com.mijecu25.sqlplus.compiler.core.statement.dml;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
 */
public class StatementInsertStatement1 extends StatementDML {

    private List<List<String>> valuesList;

    public StatementInsertStatement1(String table, List<String> columns, List<List<String>> valuesList) {
        super(columns, StatementInsertStatement1.tableToList(table));

        this.valuesList = valuesList;
    }

    @Override
    public void execute(Connection connection) throws SQLException {

    }

    @Override
    protected void printResult() {

    }

    private static List<String> tableToList(String table) {
        List<String> tableList = new ArrayList<String>();
        tableList.add(table);

        return tableList;
    }

    @Override
    public String toString() {
        return "StatementInsertStatement1 [statement=" + this.statement + "]";
    }
}
