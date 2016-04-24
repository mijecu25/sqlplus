package com.mijecu25.utils.sql.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mijecu25.utils.sql.SQLUtils;

/**
 * 
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1; 
 */
public class MySQLUtils extends SQLUtils {

    /**
     * 
     * @param column
     * @return
     * @throws SQLException 
     */
    public static int maxLengthColumn(Connection connection, String column, String table) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "select max(len(" + column + ")) from " + table + ";";
        
        ResultSet resultSet = statement.executeQuery(query);
        
        while(resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
        
        return 0;
    }
    
    public static int maxDatabaseNameLength(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "select max(length(schema_name)) from information_schema.schemata;"; 
    
        ResultSet resultSet = statement.executeQuery(query);
        
        while(resultSet.next()) {
            return resultSet.getInt(1);
        }
        
        return -1;
    }

}
