package com.mijecu25.sqlplus.connection;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import com.mijecu25.sqlplus.connection.SQLPlusMySQLConnection;

/**
 * Test for SQLPlusMySQLConnection class. TODO tell that this test might not work with their machine.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.3
 *
 */
public class TestSQLPlusMySQLConnection extends TestSQLPlusConnection {
        
    /**
     * Test getConnection without there being a connection
     */
    @Test
    public void getConnection1() {        
        // Get connection
        SQLPlusMySQLConnection connection = SQLPlusMySQLConnection.getConnection();

        // Check that the connection is null since no connection has been created
        Assert.assertNull(connection);
    }
        
    /**
     * Test getConnection providing username and password
     * @throws SQLException 
     */
    @Test
    public void getConnection2() throws SQLException {
        // Get connection
        SQLPlusMySQLConnection connection = SQLPlusMySQLConnection.getConnection(TestSQLPlusMySQLConnection.username, 
                TestSQLPlusMySQLConnection.password, TestSQLPlusMySQLConnection.host);

        // Check that the connection is not null
        Assert.assertNotNull(connection);
    }
            
    /**
     * Test getConnection providing username, password and port
     * @throws SQLException 
     */
    @Test
    public void getConnection3() throws SQLException {
        // Get connection
        SQLPlusMySQLConnection connection = SQLPlusMySQLConnection.getConnection(TestSQLPlusMySQLConnection.username, 
                TestSQLPlusMySQLConnection.password, TestSQLPlusMySQLConnection.host, TestSQLPlusMySQLConnection.port);

        // Check that the connection is not null
        Assert.assertNotNull(connection);
    }
    
    /**
     * Test getConnection providing all parameters
     * @throws SQLException
     */
    @Test
    public void getConnection4() throws SQLException {
        // Get connection
        SQLPlusMySQLConnection connection = SQLPlusMySQLConnection.getConnection(TestSQLPlusMySQLConnection.username,
                TestSQLPlusMySQLConnection.password);

        // Check that the connection is not null
        Assert.assertNotNull(connection);
    }
            
}
