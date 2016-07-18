package com.mijecu25.sqlplus.compiler.alert;

import com.mijecu25.sqlplus.compiler.core.expression.Expression;
import com.mijecu25.sqlplus.compiler.core.statement.Statement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.Connection;import java.sql.SQLException;

public class Alert extends Statement {
//    ALERT timing data_manipulation_language IN table_reference IF column_spec relational_op match_value

    private String timing;
    private String DML;
    private String table;
    private Expression whereClause;
    // private String column;
    // TODO make it work with multiple columns//
    // private//
    // private String column; // TODO make it work with multiple columns

    private static final Logger logger = LogManager.getLogger(Alert.class);

    public Alert(String timing, String DML, String table, Expression whereClause) {
        this.timing = timing;
        this.DML = DML;
        this.table = table;
        this.whereClause = whereClause;
        // TODO check if this does not collision with an already existing alert. If it does, out error message
        // saying that there is already an alert like it
        Alert.logger.info("Parsed and created an Alert");
    }

    @Override
    public void execute(Connection connection) throws SQLException {
        // TODO save in list of alerts
        AlertManager.alerts.add(this);
        this.printResult();
    }

    @Override
    protected void printResult() {
        Alert.logger.info("Printing message that acknowledges that an alert was created");
        System.out.println("Alert created ");
    }

    public String getTiming() { return this.timing; }

    public String getDML() { return this.DML; }

    public String getTable() { return this.table; }

    public Expression getWhereClause() { return this.whereClause; }

    @Override
    public String toString() { return "Alert [statement=" + this.statement + "]"; }

}
