package com.mijecu25.sqlplus;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

/**
 * TODO Test for SQLPlus class. Cannot test since we are using console input.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.0.1
 *
 */
public class TestSQLPlus {

    private Scanner inputScanner;
    
    @Before
    public void initialize() {
        this.inputScanner = new Scanner(System.in);
    }
    
    /**
     * Test createSQLPlusConnection
     */
    @Test
    public void createSQLPlusConnection1() {
        // Provide username and poassword
        String data = "\n\ntest\nabc.123\n";       
//        // Set the input of the program to the data
//        System.setIn(new ByteArrayInputStream((data.getBytes())));
//        
//        // Create a new scanner
//        this.inputScanner = new Scanner(System.in);
//        
//        // Create a new SQLPlusConnection
//        SQLPlusConnection connection = SQLPlus.createSQLPlusConnection(inputScanner);
//        
//        // Assert that the conenction is not null
//        Assert.assertNotNull(connection);
//        
//        // TODO delete this call. This is for testing
//        SQLPlusConnection.destroyInstance();
    }
    
    /**
     * Test createSQLPlusConnection
     */
    @Test
    public void createSQLPlusConnection2() {
        // Provide username, password, and port
        String data = "\n12345\ntest\nabc.123\n";      
//        // Set the input of the program to the data
//        System.setIn(new ByteArrayInputStream((data.getBytes())));
//        
//        // Create a new scanner
//        this.inputScanner = new Scanner(System.in);
//        
//        // Create a new SQLPlusConnection
//        SQLPlusConnection connection = SQLPlus.createSQLPlusConnection(inputScanner);
//        
//        // Assert that the conenction is not null
//        Assert.assertNotNull(connection);
//        
//        // TODO delete this call. This is for testing
//        SQLPlusConnection.destroyInstance();
    }
    
    /**
     * Test createSQLPlusConnection
     */
    @Test
    public void createSQLPlusConnection3() {
        // Provide all credentials
        String data = "db\n98765\ntest\nabc.123\n"; 
//        // Set the input of the program to the data
//        System.setIn(new ByteArrayInputStream((data.getBytes())));
//        
//        // Create a new scanner
//        this.inputScanner = new Scanner(System.in);
//        
//        // Create a new SQLPlusConnection
//        SQLPlusConnection connection = SQLPlus.createSQLPlusConnection(inputScanner);
//        
//        // Assert that the conenction is not null
//        Assert.assertNotNull(connection);
//        
//        // TODO delete this call. This is for testing
//        SQLPlusConnection.destroyInstance();
    }
    
}
