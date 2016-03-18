package com.mijecu25.sqlplus.connection;

import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test SQLPlusConnection.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.0.0.1
 */
public class TestSQLPlusConnection {
    
    protected static String host;
    protected static String username;
    protected static String password;
    protected static String database;
    protected static String port;
    protected static SQLPlusMySQLConnection connection;
    
    @BeforeClass
    public static void initialize() throws SQLException  {
        TestSQLPlusConnection.username = "root";
        TestSQLPlusConnection.password = "";
        TestSQLPlusConnection.host = "localhost";
        TestSQLPlusConnection.database = "mysql";
        TestSQLPlusConnection.port = "3306";
        
        TestSQLPlusConnection.connection = SQLPlusMySQLConnection.getConnection(TestSQLPlusConnection.username, 
                TestSQLPlusConnection.password, TestSQLPlusConnection.host, TestSQLPlusConnection.database, 
                TestSQLPlusConnection.port);
    }
    
    /**
     * TODO delete this call. This is for testing purposes
     * Delete instance
     */
    @Before
    public void destroyConnectionBefore() {
        SQLPlusMySQLConnection.destroyInstance();
    }
    
    /**
     * TODO delete this call. This is for testing purposes
     * Delete instance
     */
    @AfterClass
    public static void destroyConnectionAfter() {
        SQLPlusMySQLConnection.destroyInstance();
    }
    
    /**
     * Test execute.
     * 
     * @throws SQLException
     */
    @Test
    public void testExecute() throws SQLException {
        // Execute some query
        TestSQLPlusConnection.connection.execute("show databases;");
    }
    
    /**
     * Test execute.
     * 
     * @throws SQLException
     */
    @Test
    public void testDisconnect() throws SQLException {
        // Get connection
        TestSQLPlusConnection.connection.disconnect();
    }
    
    
}
