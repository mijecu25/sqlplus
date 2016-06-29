package com.mijecu25.sqlplus.connection;

import java.sql.SQLException;

import com.mijecu25.sqlplus.compiler.core.statement.Statement;
import com.mijecu25.sqlplus.compiler.core.statement.StatementDefault;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Test SQLPlusConnection.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.8
 */
public class TestSQLPlusConnection {

    protected static String host;
    protected static String username;
    protected static char[] password;
    protected static String database;
    protected static String port;
    protected static SQLPlusMySQLConnection connection;

    /**
     * Initialize variables for testing. Execute once.
     *
     * @throws SQLException
     */
    @BeforeClass
    public static void initialize() throws SQLException  {
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
        // Create a show databases statement
        Statement showDatabasesStatement = new StatementDefault();
        showDatabasesStatement.setStatement("show databases");

        // Execute some query
        TestSQLPlusConnection.connection.execute(showDatabasesStatement);
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
