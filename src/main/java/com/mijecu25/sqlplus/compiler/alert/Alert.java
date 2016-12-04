package com.mijecu25.sqlplus.compiler.alert;

import com.mijecu25.sqlplus.compiler.core.expression.Expression;
import com.mijecu25.sqlplus.compiler.core.expression.ExpressionTable;
import com.mijecu25.sqlplus.compiler.core.statement.Statement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * This class represents the "alert...." statement. It creates an alert using a timing and DML statement when manipulating
 * a table in the database.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.5
 */
public class Alert extends Statement {
//    ALERT timing data_manipulation_language IN table_reference IF column_spec relational_op match_value

    private String timing;
    private String DML;
    private ExpressionTable table;
    private Expression whereClause;
    // private String column;
    // private//
    // private String column;
    // TODO make it work with multiple columns

    public static final String BEFORE = "before";
    public static final String AFTER = "after";

    private static final Logger logger = LogManager.getLogger(Alert.class);

    public Alert(String timing, String DML, ExpressionTable table, Expression whereClause) {
        this.timing = timing;
        this.DML = DML;
        this.table = table;
        this.whereClause = whereClause;
        Alert.logger.info("Parsed and created an Alert");
    }

    @Override
    public void execute(Connection connection) throws SQLException {
        Alert.logger.info("Will execute the code to add the alert to the list of alerts");
        AlertManager.getManager().addAlert(this);
        this.printResult();
    }

    @Override
    protected void printResult() { }

    @Override
    public boolean equals(Object other) {
        if(this == other) { return true; }
        if(other == null || this.getClass() != other.getClass()) { return false; }

        Alert alert = (Alert) other;

        if(!this.timing.toLowerCase().equals(alert.timing.toLowerCase())) { return false; }
        if(!this.DML.toLowerCase().equals(alert.DML.toLowerCase())) { return false; }
        if(!this.table.equals(alert.table)) { return false; }

        return this.whereClause.equals(alert.whereClause);
    }

    @Override
    public int hashCode() {
        String variables = this.timing + this.DML + this.table + this.whereClause;

        return variables.hashCode();
    }

    public String getTiming() { return this.timing; }

    public String getDML() { return this.DML; }

    public Expression getTable() { return this.table; }

    public Expression getWhereClause() { return this.whereClause; }

    @Override
    public String toString() { return "Alert [statement=" + this.statement + "]"; }

}
