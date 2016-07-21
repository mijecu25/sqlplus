package com.mijecu25.sqlplus.compiler.core.statement.dml;

import com.mijecu25.messages.Messages;
import com.mijecu25.sqlplus.compiler.alert.Alert;
import com.mijecu25.sqlplus.compiler.alert.AlertManager;
import com.mijecu25.sqlplus.compiler.core.expression.Expression;
import com.mijecu25.sqlplus.compiler.core.expression.ExpressionBinary;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * This class represents the "insert...." SQL statement. It inserts rows into a table.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.5
 */
public class StatementInsertStatement1 extends StatementDML {
    private List<List<String>> valuesList;

    private static final Logger logger = LogManager.getLogger(StatementSelectExpression.class);

    public StatementInsertStatement1(String table, List<String> columns, List<List<String>> valuesList) {
        super(columns, StatementDML.tableToList(table));

        this.valuesList = valuesList;

        StatementInsertStatement1.logger.info("Parsed and created a StatementInsertStatement1");
    }

    @Override
    public void execute(Connection connection) throws SQLException {
        StatementInsertStatement1.logger.info("Will execute the code to insert columns in the selected database");

        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            StatementInsertStatement1.logger.fatal(Messages.FATAL + "The connection passed to execute the statement "
                    + "cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            StatementInsertStatement1.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        List<Alert> beforeInsertAlerts = AlertManager.filterByTable(AlertManager.filterByDML(
                    AlertManager.getManager().listByTiming(Alert.BEFORE), StatementDML.INSERT
                ), this.getFirstTable());

        if(!beforeInsertAlerts.isEmpty()) {
            for(List<String> values : this.valuesList) {
                for (Alert alert : beforeInsertAlerts) {
                    for (int i = 0; i < this.columns.size(); i++) {
                        String column = this.columns.get(i);
                        ExpressionBinary condition = (ExpressionBinary) alert.getWhereClause();
                        Expression left = condition.getLeftExpression();

                        // Get the final complete clause for the alert. It could be the case that the left and
                        // relation expressions are null an only the right expression has a value.
                        while(left == null) {
                            condition = (ExpressionBinary) condition.getRightExpression();
                            left = condition.getLeftExpression();
                        }

                        if(column.toLowerCase().equals(condition.getLeftExpression().toString().toLowerCase())) {
                            String expression = condition.getLeftExpression()
                                    + ExpressionBinary.transformToEquals(condition.getRelationalOperator())
                                    + condition.getRightExpression();

                            com.udojava.evalex.Expression evaluator = new com.udojava.evalex.Expression(expression);
                            evaluator.with(condition.getLeftExpression().toString(), values.get(i));
                            BigDecimal result = evaluator.eval();

                            if(result.intValue() == 1) {
                                System.out.println("This alert will be processed " + alert);
                            }
                        }
                    }
                }
            }
        }


        // TODO this is where the sqlplus alert should check before or after this insert statement
        this.executeUpdate(connection);
        // TODO Do we need to catch the exception here?
    }

    @Override
    protected void printResult() {
        StatementInsertStatement1.logger.info("Printing the result");
    }

    @Override
    public String toString() {
        return "StatementInsertStatement1 [statement=" + this.statement + "]";
    }
}
