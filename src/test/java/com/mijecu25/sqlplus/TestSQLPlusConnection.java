package com.mijecu25.sqlplus;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for SQLPlusConnection class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.0.1 
 *
 */
public class TestSQLPlusConnection {

    @Before
    public void initialize() {
        
    }
    
    /**
     * Test getConnection providing all parameters
     */
    @Test
    public void getConnection1() {
        // Get connection
        SQLPlusConnection connection = SQLPlusConnection.getConnection("test", "abc", "db", "12345");

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
    public void getConnection2() {
        // Get connection
        SQLPlusConnection connection = SQLPlusConnection.getConnection("test", "abc");

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
    
}
