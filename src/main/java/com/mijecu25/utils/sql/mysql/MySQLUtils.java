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
 * @version 0.1.0.2; 
 */
public class MySQLUtils extends SQLUtils {

    public static final String DATABASE_TABLE = "information_schema";
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

    public static int maxTableNameLength(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "select database()";

        ResultSet resultSet = statement.executeQuery(query);

        String table = null;

        while(resultSet.next()) {
            table = resultSet.getString(1);
        }

        if(table == null) {
            // TODO handle exception
        }

        MySQLUtils.useDatabaseTable(connection);

        query = "select max(length(table_name)) from tables where table_schema='" + table + "'";

        resultSet = statement.executeQuery(query);

        while(resultSet.next()) {
            return resultSet.getInt(1);
        }

        // TODO handle weird value if one is returned
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

    public static void useDatabaseTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "use " + MySQLUtils.DATABASE_TABLE;

        statement.execute(query);
    }

}
