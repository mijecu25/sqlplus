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
 * @version 0.1.0.5
 */
public class TestStatementUseDatabase extends TestStatement {

    private static final String INFORMATION_SCHEMA = "information_schema";

    protected static StatementUseDatabase statement;
    
    @BeforeClass
    public static void initialize() throws SQLException {
        TestStatement.initialize();
        TestStatementUseDatabase.statement = new StatementUseDatabase(TestStatementUseDatabase.INFORMATION_SCHEMA);
        TestStatementUseDatabase.statement.setStatement("use " + TestStatementUseDatabase.INFORMATION_SCHEMA);
    }
    
    @AfterClass
    public static void terminate() throws SQLException {
        TestStatement.terminate();
    }
    
    @Test
    public void testStatementUseDatabase() {
        StatementUseDatabase statement = new StatementUseDatabase(TestStatementUseDatabase.INFORMATION_SCHEMA);

        Assert.assertNotNull(statement);
    }
    
    @Test
    public void testExecute() throws SQLException {
        TestStatementUseDatabase.statement.execute(TestStatementUseDatabase.connection);
    }
}
