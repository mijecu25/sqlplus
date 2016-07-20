package com.mijecu25.sqlplus.compiler.core.expression;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class represents a Literal expression. It is used for strings and numbers.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.3
 */
public class ExpressionLiteral extends ExpressionConstant {

    private String value;

    private static final Logger logger = LogManager.getLogger(ExpressionLiteral.class);

    public ExpressionLiteral(String value) {
        super();

        this.value = value;
        ExpressionLiteral.logger.info("Parsed and created an ExpressionConstant");
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) { return true; }
        if(other == null || this.getClass() != other.getClass()) { return false; }

        ExpressionLiteral expressionLiteral = (ExpressionLiteral) other;

        return value.toLowerCase().equals(expressionLiteral.value.toLowerCase());
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() { return this.value; }

}
