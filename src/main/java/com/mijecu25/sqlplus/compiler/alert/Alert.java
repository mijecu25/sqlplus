package com.mijecu25.sqlplus.compiler.alert;

import com.mijecu25.sqlplus.compiler.core.expression.Expression;
import com.mijecu25.sqlplus.compiler.core.statement.Statement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.Connection;import java.sql.SQLException;

/**
 * TODO
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.2
 */
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
        AlertManager.getManager().addAlert(this);
        this.printResult();
    }

    @Override
    protected void printResult() {
        Alert.logger.info("Printing message that acknowledges that an alert was created");
        System.out.println("Alert created");
        AlertManager.getManager().listAll();
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) { return true; }
        if(other == null || this.getClass() != other.getClass()) { return false; }

        Alert alert = (Alert) other;

        if(!this.timing.equals(alert.timing)) { return false; }
        if(!this.DML.equals(alert.DML)) { return false; }
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

    public String getTable() { return this.table; }

    public Expression getWhereClause() { return this.whereClause; }

    @Override
    public String toString() { return "Alert [statement=" + this.statement + "]"; }

}
