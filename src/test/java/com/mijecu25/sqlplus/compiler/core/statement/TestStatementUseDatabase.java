package com.mijecu25.sqlplus.compiler.core.statement;

import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test StatementUseDatabase
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.3
 */
public class TestStatementUseDatabase extends TestStatement {
    
    protected static StatementUseDatabase statement;
    
    @BeforeClass
    public static void initialize() throws SQLException {
        TestStatement.initialize();
        // TODO this might not work in all computers since they might not have this database
        TestStatementUseDatabase.statement = new StatementUseDatabase("information_schema");
    }
    
    @AfterClass
    public static void terminate() throws SQLException {
        TestStatement.terminate();
    }
    
    @Test
    public void testStatementUseDatabase() {
        StatementUseDatabase statement = new StatementUseDatabase("information_schema");

        Assert.assertNotNull(statement);
    }
    
    @Test
    public void testExecute() throws SQLException {
        TestStatementUseDatabase.statement.execute(TestStatementUseDatabase.connection);
    }
}
