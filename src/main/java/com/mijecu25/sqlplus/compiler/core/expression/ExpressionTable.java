package com.mijecu25.sqlplus.compiler.core.expression;

public class ExpressionTable extends ExpressionLiteral {

    private String schema;

    public ExpressionTable(String schema, String value) {
        super(value);

        this.schema = schema;
    }

    @Override
    public String toString() {
        String result = "";

        if(this.schema !=null) {
            result += this.schema + " ";
        }

        result += this.value;

        return result;
    }
}
