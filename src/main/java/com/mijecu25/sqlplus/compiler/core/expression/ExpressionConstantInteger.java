package com.mijecu25.sqlplus.compiler.core.expression;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class represents an integer expression.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
 */
public class ExpressionConstantInteger extends ExpressionConstant {

    private final int value;

    private static final Logger logger = LogManager.getLogger(ExpressionConstantInteger.class);

    public ExpressionConstantInteger(int value) {
        super();

        this.value = value;

        ExpressionConstantInteger.logger.info("Parsed and created an ExpressionConstantInteger");
    }

    @Override
    public String toString() { return this.value + ""; }

}
