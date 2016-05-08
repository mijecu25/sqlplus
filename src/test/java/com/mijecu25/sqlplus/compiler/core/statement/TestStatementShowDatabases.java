package com.mijecu25.sqlplus.compiler.core.statement;

import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test StatementShowDatabases
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
 */
public class TestStatementShowDatabases extends TestStatement {

    protected static StatementShowDatabases statement;
    
    @BeforeClass
    public static void initialize() throws SQLException {
        TestStatement.initialize();
        TestStatementShowDatabases.statement = new StatementShowDatabases();
    }
    
    @AfterClass
    public static void terminate() throws SQLException {
        TestStatement.terminate();
    }
    
    @Test
    public void testStatementShowDatabases() {
        StatementShowDatabases statement = new StatementShowDatabases();

        Assert.assertNotNull(statement);
    }
    
    @Test
    public void testExecute() throws SQLException {
        TestStatementShowDatabases.statement.execute(TestStatementShowDatabases.connection);
    }
    
}
