package com.mijecu25.sqlplus;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.util.TablesNamesFinder;

/**
 * Test class for JSqlParser
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
 */
public class SQLPlusSQLParsing {

    public static void main(String[] args) throws JSQLParserException  {
        String query = "Select * from tab1";
        
        Statement stmt = CCJSqlParserUtil.parse(query);
        
        System.out.println(stmt.getClass());
        System.out.println(stmt instanceof Statement);
        System.out.println(stmt instanceof Select);
        System.out.println(stmt instanceof Delete);
        
        
        
        Select select = (Select) stmt;
        TablesNamesFinder tnf = new TablesNamesFinder();
        System.out.println(tnf.getTableList(select));
    }

}
