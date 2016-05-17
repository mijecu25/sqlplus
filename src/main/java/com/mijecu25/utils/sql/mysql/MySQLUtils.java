package com.mijecu25.utils.sql.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Utility class for MySQL database.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.4 
 */
public class MySQLUtils {

    public static final String DATABASE_TABLE = "information_schema";

    /**
     * Get the maximum length out of all the table names in a database.
     *
     * @param connection the connection to the database.
     * @param database the database where the tables are located.
     *
     * @return the length of the maximum table name.
     *
     * @throws SQLException if there is an error when executing the query.
     */
    public static int maxTableNameLength(Connection connection, String database) throws SQLException {
        if(connection == null) {
            // TODO
        }

        if(database == null || database.isEmpty()) {
            // TODO
        }

        // Create a statement
        Statement statement = connection.createStatement();
        String query = "select max(length(table_name)) from " + DATABASE_TABLE + ".tables where table_schema='"
                + database + "'";

        // Query the statement
        ResultSet resultSet = statement.executeQuery(query);

        int length = 0;

        while(resultSet.next()) {
            length = resultSet.getInt(1);
        }

        // Close the result set and statement
        resultSet.close();
        statement.close();

        // TODO handle weird value if one is returned
        return length;
    }

    /**
     * Get the length of the database name with the longest name.
     *
     * @param connection the connection to the database.
     *
     * @return the length of the maximum database name.
     *
     * @throws SQLException if there is an error when executing the query.
     */
    public static int maxDatabaseNameLength(Connection connection) throws SQLException {
        if(connection == null) {
            // TODO
        }

        // Create a statement
        Statement statement = connection.createStatement();
        String query = "select max(length(schema_name)) from " + DATABASE_TABLE + ".schemata;";

        // Query the statement
        ResultSet resultSet = statement.executeQuery(query);

        // Return the length
        int length = 0;

        while(resultSet.next()) {
            length = resultSet.getInt(1);
        }

        // Close the result set and statement
        resultSet.close();
        statement.close();

        return length;
    }

    /**
     * Get the name of the currently selected database.
     *
     * @param connection the connection to the database.
     *
     * @return the name of the database that is currently selected.
     *
     * @throws SQLException if there is an error when executing the query.
     */
    public static String selectDatabase(Connection connection) throws SQLException {
        if(connection == null) {
            // TODO
        }

        // Create a statement
        Statement statement = connection.createStatement();
        String query = "select database()";

        // Query the statement
        ResultSet resultSet = statement.executeQuery(query);

        // Return the result
        String table = null;

        while(resultSet.next()) {
            table = resultSet.getString(1);
        }

        // Close the result set and statement
        resultSet.close();
        statement.close();

        return table;
    }

}
