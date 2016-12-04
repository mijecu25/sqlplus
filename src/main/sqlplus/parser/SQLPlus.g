grammar SQLPlus;

import SQLPlusLex;

@header {
	package com.mijecu25.sqlplus.parser;

    import java.util.Map;
    import java.util.HashMap;

	import com.mijecu25.sqlplus.compiler.core.statement.Statement;
	import com.mijecu25.sqlplus.compiler.core.statement.StatementUseDatabase;
	import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementSelectExpression;
	import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementInsertStatement1;
	import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementSingleTableUpdateStatement;
	import com.mijecu25.sqlplus.compiler.core.expression.Expression;
	import com.mijecu25.sqlplus.compiler.core.expression.ExpressionBinary;
	import com.mijecu25.sqlplus.compiler.core.expression.ExpressionLiteral;
	import com.mijecu25.sqlplus.compiler.core.expression.ExpressionTable;
	import com.mijecu25.sqlplus.compiler.core.expression.ExpressionColumn;
	import com.mijecu25.sqlplus.compiler.core.expression.ExpressionConstantInteger;
	import com.mijecu25.sqlplus.compiler.core.expression.ExpressionConstantFloat;
	import com.mijecu25.sqlplus.compiler.alert.Alert;
	import com.mijecu25.sqlplus.compiler.alert.AlertManager;
	import com.mijecu25.sqlplus.compiler.alert.AlertDefault;
}

@members {
	@Override
 	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
    	throw e;
	}

	protected void mismatch(IntStream input, int ttype, BitSet follow) throws RecognitionException {
		 throw new MismatchedTokenException(ttype, input);
	}

	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
		throw new MismatchedTokenException(ttype, input);
	}
}

@rulecatch {
	catch (RecognitionException re) {
		throw re;
	}
}

// This is the entry point of the SQLPlus alert program
sqlplus returns [Statement statement]
	@init {
		statement = null;
	}
	: 	sql_statement SEMICOLON {
			statement = $sql_statement.sqlStatement;
		}
	|	sqlplus_statement SEMICOLON {
	        statement = $sqlplus_statement.sqlplusStatement;
        }
	;

sqlplus_statement returns [Statement sqlplusStatement]
    @init {
        sqlplusStatement = null;
    }
    :   sqlplus_alert {
            sqlplusStatement = $sqlplus_alert.alert;
        }
    |   sqlplus_list_alert {
            sqlplusStatement = $sqlplus_list_alert.listAlert;
        }
    |   CLEAR ALERTS {
            AlertManager.getManager().clearAll();
            sqlplusStatement = new AlertDefault();
        }
    ;

sqlplus_alert returns [Statement alert]
    @init {
        alert = null;
    }
    // TODO add 'LIKE'
    // TODO use '?' to grab value from the user
    :   ALERT timing data_manipulation_language IN table_reference where_clause {
            alert = new Alert($timing.text, $data_manipulation_language.text, $table_reference.tableReference, $where_clause.expr);
        }
    ;

sqlplus_list_alert returns [Statement listAlert]
    @init {
        listAlert = null;
    }
    :   LIST ALERTS {
            AlertManager.getManager().listAll();
            listAlert = new AlertDefault();
        }
    ;

sql_statement returns [Statement sqlStatement]
	@init {
		sqlStatement = null;
	}
	:   data_manipulation_statements {
	        sqlStatement = $data_manipulation_statements.dataManipulationStatement;
	    }
	|	use_statement {
			sqlStatement = $use_statement.useStatement;
		}
	;

use_statement returns [Statement useStatement]
	@init {
		useStatement = null;
	}
	:	use_database {
			useStatement = $use_database.useDatabaseStatement;
		}
	;

use_database returns [Statement useDatabaseStatement]
	@init {
		useDatabaseStatement = null;
	}
	:	USE
		database = schema_name {
			useDatabaseStatement = new StatementUseDatabase($database.text);
		}
	;

data_manipulation_statements returns [Statement dataManipulationStatement]
	@init {
	    dataManipulationStatement = null;
	}
	:   select_statement {
            dataManipulationStatement = $select_statement.selectStatement;
        }
    |   insert_statements {
            dataManipulationStatement = $insert_statements.insertStatements;
        }
    |   update_statements {
            dataManipulationStatement = $update_statements.updateStatements;
    }
    ;

select_statement returns [Statement selectStatement]
	@init {
		selectStatement = null;
	}
	:	select_expression {
			selectStatement = $select_expression.selectExpression;
		}
	;

insert_statements returns [Statement insertStatements]
    @init {
        insertStatements = null;
    }
    :   insert_statement1 {
            insertStatements = $insert_statement1.insertStatement1;
        }
    ;

update_statements returns [Statement updateStatements]
	@init {
		updateStatements = null;
	}
	:	single_table_update_statement {
			updateStatements = $single_table_update_statement.singleTableUpdateStatement;
		}
	;

select_expression returns [Statement selectExpression]
	@init {
		selectExpression = null;
	}
	:	SELECT select_list FROM (table_references (where_clause)?)?  {
			selectExpression = new StatementSelectExpression($select_list.selectList, $table_references.tableReferences, $where_clause.expr);
		}
	;

insert_statement1 returns [Statement insertStatement1]
	@init {
	    insertStatement1 = null;
	}
	:   insert_header
	    (column_list)? value_list_clause {
	        insertStatement1 = new StatementInsertStatement1($insert_header.table, $column_list.columnList, $value_list_clause.valueListClause);
	    }
	;

single_table_update_statement returns [Statement singleTableUpdateStatement]
	@init {
		singleTableUpdateStatement = null;
	}
	:	UPDATE table_reference set_columns_clause (where_clause)? {
			singleTableUpdateStatement = new StatementSingleTableUpdateStatement($table_reference.tableReference, $set_columns_clause.columnsValuesMap, $where_clause.expr);
		}
	;

select_list returns [List<Expression> selectList]
	@init {
		selectList = new ArrayList<Expression>();
	}
	:	column = displayed_column {
	 		selectList.add($column.displayedColumn);
		}
		(
			COMMA column = displayed_column {
				selectList.add($column.displayedColumn);
			}
		)*
	| 	ASTERISK {
			selectList.add(new ExpressionLiteral($ASTERISK.text));
		}
	;

displayed_column returns [Expression displayedColumn]
    @init {
        displayedColumn = null;
    }
	:	column_spec (alias)? { displayedColumn = $column_spec.columnSpec; }
	;

table_references returns [List<ExpressionTable> tableReferences]
	@init {
		tableReferences = new ArrayList<ExpressionTable>();
	}
	:	table = table_reference {
			tableReferences.add($table.tableReference);
		}
		(
			COMMA
			table = table_reference {
				tableReferences.add($table.tableReference);
			}
		)*
	;

table_reference returns [ExpressionTable tableReference]
    @init {
        tableReference = null;
    }
	:	table_atom { tableReference = $table_atom.tableAtom; }
	;

insert_header returns [ExpressionTable table]
    @init {
        table = null;
    }
    :   INSERT (INTO)? table_spec {
            table = $table_spec.tableSpec;
        }
    ;

value_list_clause returns [List<List<Expression>> valueListClause]
    @init {
        valueListClause = new ArrayList<List<Expression>>();
    }
    :   VALUES
        value = column_value_list {
            valueListClause.add($value.columnValueList);
        }
        (
            COMMA
            value = column_value_list {
                valueListClause.add($value.columnValueList);
            }
        )*
    ;

column_value_list returns [List<Expression> columnValueList]
    @init {
        columnValueList = new ArrayList<Expression>();
    }
    :   LEFT_PARENTHESIS
        expr = bit_expr {
            columnValueList.add($expr.bitExpr);
        }
        (
            COMMA
            expr = bit_expr {
                columnValueList.add($expr.bitExpr);
            }
        )*
        RIGHT_PARENTHESIS
    ;

set_columns_clause returns [Map<ExpressionColumn, Expression> columnsValuesMap]
    @init {
        columnsValuesMap = new HashMap<ExpressionColumn, Expression>();
    }
    :   SET
        columnValue = set_column_clause {
            columnsValuesMap.putAll($columnValue.columnValueMap);
        }
        (
            COMMA
            columnValue = set_column_clause {
                columnsValuesMap.putAll($columnValue.columnValueMap);
            }
        )*
    ;

set_column_clause returns [Map<ExpressionColumn, Expression> columnValueMap]
    @init {
        columnValueMap = new HashMap<ExpressionColumn, Expression>();
    }
    :	column_spec EQUAL (
            expression {
                columnValueMap.put($column_spec.columnSpec, $expression.expr);
            }
            |
            DEFAULT {
                columnValueMap.put($column_spec.columnSpec, new ExpressionLiteral($DEFAULT.text));
            }
        )
    ;

where_clause returns [Expression expr]
    @init {
        expr = null;
    }
    :   WHERE expression { expr = $expression.expr; }
    ;

table_atom returns [ExpressionTable tableAtom]
    @init {
        tableAtom = null;
    }
	:	table_spec { tableAtom = $table_spec.tableSpec; }
	;

table_spec returns [ExpressionTable tableSpec]
    @init {
        tableSpec = null;
    }
	:	(schema_name DOT)? table_name { tableSpec = new ExpressionTable($schema_name.text, $table_name.text); }
	;

column_list returns [List<ExpressionColumn> columnList]
    @init {
        columnList = new ArrayList<ExpressionColumn>();
    }
	:   LEFT_PARENTHESIS
	    column = column_spec {
	        columnList.add($column.columnSpec);
	    }
        (
            COMMA
            column = column_spec {
                columnList.add($column.columnSpec);
            }
        )*
        RIGHT_PARENTHESIS
	;

column_spec returns [ExpressionColumn columnSpec]
    @init {
        columnSpec = null;
    }
	:   ((schema_name DOT)? table_name DOT)? column_name {
	        columnSpec = new ExpressionColumn($schema_name.text, $table_name.text, $column_name.text);
        }
	;

subquery
    :   LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS
    ;

expression returns [Expression expr]
    @init {
        expr = null;
    }
    :   left = expr_factor1 { expr = $left.expr; }
        (
            OR right = expr_factor1 {
                expr = new ExpressionBinary($OR.text, expr, $right.expr);
            }
        )*
    ;

expr_factor1 returns [Expression expr]
    @init {
        expr = null;
    }
    :   left = expr_factor2 { expr = $left.expr; }
        (
            XOR right = expr_factor2 {
                expr = new ExpressionBinary($XOR.text, expr, $right.expr);
            }
        )*
    ;

expr_factor2 returns [Expression expr]
    @init {
        expr = null;
    }
    :   left = expr_factor3 { expr = $left.expr; }
        (
            AND right = expr_factor3 {
                expr = new ExpressionBinary($AND.text, expr, $right.expr);
            }
        )*
    ;

expr_factor3 returns [Expression expr]
    @init {
        expr = null;
    }
    :   (NOT)? expr_factor4 { expr = new ExpressionBinary($NOT.text, null, $expr_factor4.expr); }
    ;

expr_factor4 returns [Expression expr]
    @init {
        expr = null;
    }
    :   bool_primary ( IS (NOT)? (boolean_literal | NULL) )? { expr = $bool_primary.expr; }
    ;

bool_primary returns [Expression expr]
    @init {
        expr = null;
    }
    :   left = predicate
        relational_op
        right = predicate {
            expr = new ExpressionBinary($relational_op.text, $left.expr, $right.expr);
        }
    |   predicate relational_op ( ALL | ANY )? subquery
    |   NOT EXISTS subquery
    |   predicate
    ;

predicate returns [Expression expr]
    @init {
        expr = null;
    }
    :   bit_expr { expr = $bit_expr.bitExpr; }
    ;

bit_expr returns [Expression bitExpr]
    @init {
        bitExpr = null;
    }
    :   simple_expr { bitExpr = $simple_expr.simpleExpression; }
    ;

simple_expr returns [Expression simpleExpression]
    @init {
        simpleExpression = null;
    }
    :   literal_value { simpleExpression = $literal_value.literalValue; }
    |   column_spec //{ simpleExpression = $column_spec.columnSpec; }
    ;

literal_value returns [Expression literalValue]
    @init {
        literalValue = null;
    }
    :   string_literal { literalValue = $string_literal.stringLiteral; }
    |   number_literal { literalValue = $number_literal.numberLiteral; }
    ;

relational_op
    :   EQUAL
    |   GREATER_THAN
    |   GREATER_THAN_EQUAL
    |   LESS_THAN
    |   LESS_THAN_EQUAL
    |   NOT_EQUAL
    ;

string_literal  returns [Expression stringLiteral]
    @init {
        stringLiteral = null;
    }
    :   TEXT_STRING { stringLiteral = new ExpressionLiteral($TEXT_STRING.text); }
    ;
number_literal  returns [Expression numberLiteral]
    @init {
        numberLiteral = null;
    }
    :	(PLUS | MINUS)?
        (
            INTEGER_NUMBER { numberLiteral = new ExpressionConstantInteger(Integer.parseInt($INTEGER_NUMBER.text)); }
        |
            REAL_NUMBER { numberLiteral = new ExpressionConstantFloat(Float.parseFloat($REAL_NUMBER.text)); }
        )
    ;

boolean_literal :	TRUE | FALSE;


timing
	:	BEFORE
	|	AFTER
	;

data_manipulation_language
	:	INSERT
	|	DELETE
	|	UPDATE
	;

relational_operation
	:	EQUAL
	|	LESS_THAN_EQUAL
	|	GREATER_THAN_EQUAL
	|	NOT_EQUAL
	|	LESS_THAN
	|	GREATER_THAN
	|	LIKE // Not part of mysql standard
	;

match_value
	:	ID
	|	QUESTION_MARK
	;

alias : (AS)? ID;
column_name : ID;
partition_name : ID;
schema_name	: ID;
table_name	: ID;