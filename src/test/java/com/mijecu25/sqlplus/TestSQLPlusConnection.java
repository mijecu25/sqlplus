package com.mijecu25.sqlplus;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for SQLPlusConnection class. TODO tell that this test might not work with their machine.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.0.0.1
 *
 */
public class TestSQLPlusConnection {

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
        SQLPlusConnection connection = SQLPlusConnection.getConnection("root", "", "mysql", "3306");

        // Check that the connection is not null
        Assert.assertNotNull(connection);
        
        // TODO delete this call. This is for testing purposes
        // Delete instance
        SQLPlusConnection.destroyInstance();
    }
    
    /**
     * Test getConnection providing username and password
     * @throws SQLException 
     */
    @Test
    public void getConnection2() throws SQLException {
        // Get connection
        SQLPlusConnection connection = SQLPlusConnection.getConnection("root", "");

        // Check that the connection is not null
        Assert.assertNotNull(connection);

        // TODO delete this call. This is for testing purposes
        // Delete instance
        SQLPlusConnection.destroyInstance();
    }
        
    /**
     * Test getConnection providing username and password
     */
    @Test
    public void getConnection3() {
        // Get connection
        SQLPlusConnection connection = SQLPlusConnection.getConnection();

        // Check that the connection is not null
        Assert.assertNull(connection);
    }
    
    /**
     * Test getConnection providing username, password and port
     * @throws SQLException 
     */
    @Test
    public void getConnection4() throws SQLException {
        // Get connection
        SQLPlusConnection connection = SQLPlusConnection.getConnection("root", "", "3306");

        // Check that the connection is not null
        Assert.assertNotNull(connection);

        // TODO delete this call. This is for testing purposes
        // Delete instance
        SQLPlusConnection.destroyInstance();
    }
            
}
