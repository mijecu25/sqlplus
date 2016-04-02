package com.mijecu25.utils.sql.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mijecu25.utils.sql.SQLUtils;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

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
        Statement statement = (Statement) connection.createStatement();
        String query = "select max(len(" + column + ")) from " + table;
        
        ResultSet resultSet = statement.executeQuery(query);
        
        while(resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
        
        return 0;
    }
}
