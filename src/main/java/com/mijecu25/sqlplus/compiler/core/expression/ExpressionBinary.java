package com.mijecu25.sqlplus.compiler.core.expression;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class represents a Binary expression. It has two child expressions and an operator which may or may not be null.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.2
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
     * TODO
     * @return
     */
    public Expression getLeftExpression() { 
        if(this.leftExpression != null) {
            return this.leftExpression; 
        }

        return ((ExpressionBinary) this.getRightExpression()).getLeftExpression();
     }

    /**
     * TODO
     * @return
     */
    public String getRelationalOperator() { return this.relationalOperator; }  

    /**
     * TODO
     * @return
     */
    public Expression getRightExpression() { return this.rightExpression; } 

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