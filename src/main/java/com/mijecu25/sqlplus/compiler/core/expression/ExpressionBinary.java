package com.mijecu25.sqlplus.compiler.core.expression;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class represents a Binary expression. It has two child expressions and an operator which may or may not be null.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.4
 */
public class ExpressionBinary extends Expression {
    private static final Logger logger = LogManager.getLogger(ExpressionBinary.class);

    private Expression leftExpression;
    private String relationalOperator;
    private Expression rightExpression;

    public ExpressionBinary(String relationalOperator, Expression leftExpression, Expression rightExpression) {
        super();
        this.relationalOperator = relationalOperator;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;

        ExpressionBinary.logger.info("Parsed and created an ExpressionBinary");
    }

    /**
     * Return the left expression.
     *
     * @return the left expression.
     */
    public Expression getLeftExpression() {
//        if(this.leftExpression != null) {
            return this.leftExpression;
//        }

//        return ((ExpressionBinary) this.getRightExpression()).getLeftExpression();
    }

    /**
     * Return the relational operator.
     *
     * @return the relational operator.
     */
    public String getRelationalOperator() { return this.relationalOperator; }

    /**
     * Return the right expression.
     *
     * @return the right expression.
     */
    public Expression getRightExpression() { return this.rightExpression; }

    /**
     * Transform a SQL '=' to '==' if the operator is a '='. Otherwise, the original operator is returned.
     *
     * @param operator that will be transformed.
     *
     * @return a transformed string or the original string.
     */
    public static String transformToEquals(String operator) {
        if(operator.equals("=")) {
            return "==";
        }

        return operator;
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) { return true; }
        if(other == null || this.getClass() != other.getClass()) { return false; }

        ExpressionBinary expressionBinary = (ExpressionBinary) other;

        boolean compareFails = true;

        if(this.leftExpression != null) {
            compareFails = !this.leftExpression.equals(expressionBinary.leftExpression);
        }
        else {
            compareFails = expressionBinary.leftExpression != null;
        }

        if(compareFails) { return false; }

        if(this.relationalOperator != null) {
            compareFails = !this.relationalOperator.equals(expressionBinary.relationalOperator);
        }
        else {
            compareFails = expressionBinary.relationalOperator != null;
        }

        if(compareFails) { return false; }

        return rightExpression.equals(expressionBinary.rightExpression);

    }

    @Override
    public int hashCode() {
        String variables = this.leftExpression + this.relationalOperator + this.rightExpression;

        return variables.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if(this.relationalOperator != null) {
            result.append(this.relationalOperator);
        }

        if(this.leftExpression != null) {
            if(this.leftExpression instanceof ExpressionLiteral || this.relationalOperator == null) {
                result.append(this.leftExpression);
            }
            else {
                result.append("(" + this.leftExpression + ")");
            }
        }

        if(this.rightExpression != null) {
            if(this.rightExpression instanceof ExpressionLiteral || this.relationalOperator == null) {
                result.append(this.rightExpression);
            }
            else {
                result.append("(" + this.rightExpression + ")");
            }
        }

        return result.toString();
    }
}