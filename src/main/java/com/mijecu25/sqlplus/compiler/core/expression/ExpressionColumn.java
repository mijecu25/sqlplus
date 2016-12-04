package com.mijecu25.sqlplus.compiler.core.expression;

/**
 * Created by miguelvelez on 7/22/16.
 */
public class ExpressionColumn extends ExpressionLiteral {

    private String schema;
    private String table;

    public ExpressionColumn(String schema, String table, String value) {
        super(value);

        this.schema = schema;
        this.table = table;
    }

    @Override
    public String toString() {
        String result = "";

        if(this.schema !=null) {
            result += this.schema + " ";
        }

        if(this.table !=null) {
            result += this.table + " ";
        }

        result += this.value;

        return result;
    }
}
