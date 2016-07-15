package com.mijecu25.sqlplus.compiler.core.expression;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class represents an Expression used in the queries.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
 */
public class Expression {
    private static final Logger logger = LogManager.getLogger(Expression.class);

    public Expression() {
        Expression.logger.info("Parsed and created an Expression");
    }

}
