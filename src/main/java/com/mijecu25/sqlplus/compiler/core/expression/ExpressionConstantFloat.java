package com.mijecu25.sqlplus.compiler.core.expression;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class represents a float expression.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
 */
public class ExpressionConstantFloat extends ExpressionConstant {

    private final float value;

    private static final Logger logger = LogManager.getLogger(ExpressionConstantFloat.class);

    public ExpressionConstantFloat(float value) {
        super();

        this.value = value;

        ExpressionConstantFloat.logger.info("Parsed and created an ExpressionConstantFloat");
    }

    @Override
    public String toString() { return this.value + ""; }

}
