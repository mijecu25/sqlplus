package com.mijecu25.sqlplus.compiler.alert;

import com.mijecu25.sqlplus.compiler.core.statement.Statement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * This class represents a default Alert statement. It is used to hold statements that do not require an object
 * for themselves.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
 */
public class AlertDefault extends Statement {

    private static final Logger logger = LogManager.getLogger(AlertDefault.class);

    public AlertDefault() { }

    @Override
    public void execute(Connection connection) throws SQLException { }

    @Override
    protected void printResult() { }

    @Override
    public String toString() { return "AlertDefault [statement=" + this.statement + "]"; }
}
