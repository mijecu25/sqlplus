package com.mijecu25.sqlplus.compiler.core.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test; 

/**
 * Test Statement 
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.4
 */
public class TestStatement {
   
//    private static StatementConcrete statement;
    
    protected static Properties properties;
    protected static Connection connection;
       
    @BeforeClass 
    public static void initialize() throws SQLException {
        TestStatement.properties = new Properties();
        TestStatement.properties.put("user", System.getProperty("user.name"));
        TestStatement.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/", properties);  
        
//        TestStatement.statement = new TestStatement().new StatementConcrete();
    }
    
    @AfterClass
    public static void terminate() throws SQLException {
        TestStatement.connection.close();
    }
        
    /**
     * Implementation of abstract class to test the abstract class.
     * 
     * @author Miguel Velez - miguelvelezmj25
     * @version 0.1.0.1
     */
    private class StatementConcrete extends Statement {

        public StatementConcrete() {
            super();
        }

        public StatementConcrete(String statement) {
            super();
        }

        @Override
        public void execute(Connection connection) throws SQLException {
            // Abstract method
        }

        @Override
        public void printResult() {
            // Abstract method    
        }

    }

    @Test
    public void testStatement1() {
        StatementConcrete statement = new StatementConcrete("statement");
        
        Assert.assertNotNull(statement);
    }
    
    @Test
    public void testStatement3() {
        StatementConcrete statement = new StatementConcrete();
        
        Assert.assertNotNull(statement);
    }
    
    @Test
    public void testBuildHorizontalBorder() {
        String line = Statement.buildHorizontalBorder(5);

        Assert.assertNotNull(line);
    }
    
}
