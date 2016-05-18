package com.mijecu25.sqlplus.connection;

import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mijecu25.sqlplus.compiler.core.statement.StatementShowDatabases;

/**
 * Test SQLPlusConnection.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.4
 */
public class TestSQLPlusConnection {
    
    protected static String host;
    protected static String username;
    protected static char[] password;
    protected static String database;
    protected static String port;
    protected static SQLPlusMySQLConnection connection;
    
    /**
     * TODO Execute once.
     * 
     * @throws SQLException
     */
    @BeforeClass
    public static void initialize() throws SQLException  {
        // TODO use computer current user
        TestSQLPlusConnection.username = "root";
        TestSQLPlusConnection.password = "".toCharArray();
        TestSQLPlusConnection.host = "localhost";
        TestSQLPlusConnection.database = "mysql";
        TestSQLPlusConnection.port = "3306";
        
        TestSQLPlusConnection.connection = SQLPlusMySQLConnection.getConnection(TestSQLPlusConnection.username, 
                TestSQLPlusConnection.password, TestSQLPlusConnection.host, TestSQLPlusConnection.port);
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
        TestSQLPlusConnection.connection.execute(new StatementShowDatabases());
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
