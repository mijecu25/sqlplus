package com.mijecu25.sqlplus.connection;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mijecu25.sqlplus.connection.SQLPlusMySQLConnection;

/**
 * Test for SQLPlusConnection class. TODO tell that this test might not work with their machine.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.0.0.1
 *
 */
public class TestSQLPlusMySQLConnection {

    @Before
    public void initialize() {
        
    }
    
    /**
     * Test getConnection providing all parameters
     * @throws SQLException 
     */
    @Test
    public void getConnection1() throws SQLException {
        // Get connection
        SQLPlusMySQLConnection connection = SQLPlusMySQLConnection.getConnection("root", "", "mysql", "3306");

        // Check that the connection is not null
        Assert.assertNotNull(connection);
        
        // TODO delete this call. This is for testing purposes
        // Delete instance
        SQLPlusMySQLConnection.destroyInstance();
    }
    
    /**
     * Test getConnection providing username and password
     * @throws SQLException 
     */
    @Test
    public void getConnection2() throws SQLException {
        // Get connection
        SQLPlusMySQLConnection connection = SQLPlusMySQLConnection.getConnection("root", "");

        // Check that the connection is not null
        Assert.assertNotNull(connection);

        // TODO delete this call. This is for testing purposes
        // Delete instance
        SQLPlusMySQLConnection.destroyInstance();
    }
        
    /**
     * Test getConnection without there being a connection
     */
    @Test
    public void getConnection3() {
        // Get connection
        SQLPlusMySQLConnection connection = SQLPlusMySQLConnection.getConnection();

        // Check that the connection is null since no connection has been created
        Assert.assertNull(connection);
    }
    
    /**
     * Test getConnection providing username, password and port
     * @throws SQLException 
     */
    @Test
    public void getConnection4() throws SQLException {
        // Get connection
        SQLPlusMySQLConnection connection = SQLPlusMySQLConnection.getConnection("root", "", "3306");

        // Check that the connection is not null
        Assert.assertNotNull(connection);

        // TODO delete this call. This is for testing purposes
        // Delete instance
        SQLPlusMySQLConnection.destroyInstance();
    }
            
}
