package com.mijecu25.utils.sql;

import com.mijecu25.utils.sql.mysql.MySQLUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * TODO
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.3  
 */
public abstract class SQLUtils {

    /**
     * Get the name of the database system that is used by the connection.
     *
     * @param connection the connection to the database.
     *
     * @return the name of the database system.
     */
    private static String getDatabaseSystem(Connection connection) {
        // TODO might need to throw sqle exception to calling method
        try {
            // Get the name of the database system used by the connection
            String database = connection.getMetaData().getDatabaseProductName();

            if(database == null) {
                // TODO what the heck, how is this possible?
            }
            
            return database;
        }
        catch(SQLException sqle) {
            // TODO
        }
        return null;
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
        // If the connection is null
        if(connection == null) {
            // TODO
        }

        // Get the database system
        String database = SQLUtils.getDatabaseSystem(connection);

        // Get the length
        int length = 0;

        switch(database) {
            // MySQL
            default:
                length = MySQLUtils.maxDatabaseNameLength(connection);
                break;
        }

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
        // If the connection is null
        if(connection == null) {
            // TODO
        }

        // Get the database system
        String database = SQLUtils.getDatabaseSystem(connection);

        // Get the name of the database
        String currentDatabase = null;

        switch(database) {
            // MySQL
            default:
                currentDatabase = MySQLUtils.selectDatabase(connection);
                break;
        }

        return currentDatabase;
    }

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
        // If the connection is null
        if(connection == null) {
            // TODO
        }

        // Get the database system
        String databaseSystem = SQLUtils.getDatabaseSystem(connection);

        // Get the length
        int length = 0;

        switch(databaseSystem) {
            // MySQL
            default:
                length = MySQLUtils.maxTableNameLength(connection, database);
                break;
        }

        return length;
    }

//    /**
     //     * Get the maximum length of a column in a table.
     //     *
     //     * @param connection the connection to the database.
     //     * @param column the name of the column.
     //     * @param table the name of the table that will be used.
     //     *
     //     * @return the length of the maximum entry in the column.
     //     *
     //     * @throws SQLException if there is an error when executing the query.
     //     */
//    public static int maxLengthColumn(Connection connection, String column, String table) throws SQLException {
//        if(connection == null) {
//            // TODO
//        }
//
//        if(column == null || column.isEmpty()) {
//            // TODO
//        }
//
//        if(table == null || table.isEmpty()) {
//            // TODO
//        }
//
//        // Create a statement
//        Statement statement = connection.createStatement();
//        String query = "select max(len(" + column + ")) from " + table + ";";
//
//        // Query the statement
//        ResultSet resultSet = statement.executeQuery(query);
//
//        // Get the length
//        int length = 0;
//
//        while(resultSet.next()) {
//            length = resultSet.getInt(1);
//        }
//
//        // Close the result set and statement
//        resultSet.close();
//        statement.close();
//
//        return length;
//    }

    //    public static void useDatabaseTable(Connection connection) throws SQLException {
//        Statement statement = connection.createStatement();
//        String query = "use " + MySQLUtils.DATABASE_TABLE;
//
//        statement.execute(query);
//    }
    
}
