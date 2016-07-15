package com.mijecu25.sqlplus.compiler.core.expression;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class represents a Literal expression. It is used for strings and numbers.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
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
    public String toString() { return this.value; }

}
