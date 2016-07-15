package com.mijecu25.sqlplus.compiler.core.expression;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class represents a Constant expression.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
 */
public class ExpressionConstant extends Expression {

    private static final Logger logger = LogManager.getLogger(ExpressionConstant.class);

    public ExpressionConstant() {
        super();

        ExpressionConstant.logger.info("Parsed and created an ExpressionConstant");
    }

}
