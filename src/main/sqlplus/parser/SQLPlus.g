grammar SQLPlus;

import SQLPlusLex;

@header {
	package com.mijecu25.sqlplus.parser;

	import com.mijecu25.sqlplus.compiler.core.statement.Statement;
	import com.mijecu25.sqlplus.compiler.core.statement.StatementUseDatabase;
	import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementSelectExpression;
	import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementInsertStatement1;
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
		$statement = null;
	}
	: 	sql_statement SEMICOLON {
			statement = $sql_statement.sqlStatement;
		}
		// TODO this should be optional
	|	sqlplus_alert
	;


sqlplus_alert
	:	ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON
			{
				System.out.println("Created SQLPlus alert");
			}
	;

sql_statement returns [Statement sqlStatement]
	@init {
		$sqlStatement = null;
	}
	:   data_manipulation_statements {
	        $sqlStatement = $data_manipulation_statements.dataManipulationStatement;
	    }
	|	use_statement {
			$sqlStatement = $use_statement.useStatement;
		}
	;

use_statement returns [Statement useStatement]
	@init {
		$useStatement = null;
	}
	:	use_database {
			$useStatement = $use_database.useDatabaseStatement;
		}
	;

use_database returns [Statement useDatabaseStatement]
	@init {
		$useDatabaseStatement = null;
	}
	:	USE
		database = schema_name {
			$useDatabaseStatement = new StatementUseDatabase($database.text);
		}
	;

data_manipulation_statements returns [Statement dataManipulationStatement]
	@init {
	    $dataManipulationStatement = null;
	}
	:   select_statement {
            $dataManipulationStatement = $select_statement.selectStatement;
        }
    |   insert_statements {
            $dataManipulationStatement = $insert_statements.insertStatements;
        }
    ;

select_statement returns [Statement selectStatement]
	@init {
		$selectStatement = null;
	}
	:	select_expression {
			$selectStatement = $select_expression.selectExpression;
		}
	;

insert_statements returns [Statement insertStatements]
    @init {
        $insertStatements = null;
    }
    :   insert_statement1 {
            $insertStatements = $insert_statement1.insertStatement1;
        }
    ;

/*update_statements returns [Statement updateStatements]
	@init {
		$updateStatements = null;
	}
	:	single_table_update_statement {
			$updateStatements = $select_expression.selectExpression;
		}
	;*/

select_expression returns [Statement selectExpression]
	@init {
		$selectExpression = null;
	}
	// Original: (from table_references) ?
	:	SELECT select_list FROM table_references {
			$selectExpression = new StatementSelectExpression($select_list.selectList, $table_references.tableReferences);
		}
	;

insert_statement1 returns [Statement insertStatement1]
	@init {
	    $insertStatement1 = null;
	}
	:   insert_header
	    (column_list)? value_list_clause {
	        $insertStatement1 = new StatementInsertStatement1($insert_header.table, $column_list.columnList, $value_list_clause.valueListClause);
	    }
	;

/*single_table_update_statement returns [Statement singleTableUpdateStatement]
	@init {
		$singleTableUpdateStatement = null;
	}
	:	UPDATE table_reference select_list FROM table_references {
			$selectExpression = new StatementSelectExpression($select_list.selectList, $table_references.tableReferences);
		}
	;*/

select_list returns [List<String> selectList]
	@init {
		$selectList = new ArrayList<String>();
	}
	:	column = displayed_column {
	 		$selectList.add($column.text);
		}
		(
			COMMA column = displayed_column {
				$selectList.add($column.text);
			}
		)*
	| 	ASTERISK {
			$selectList.add($ASTERISK.text);
		}
	;

displayed_column
	:	column_spec (alias)?
	;

table_references returns [List<String> tableReferences]
	@init {
		$tableReferences = new ArrayList<String>();
	}
	:	table = table_reference {
			$tableReferences.add($table.text);
		}
		(
			COMMA
			table = table_reference {
				$tableReferences.add($table.text);
			}
		)*
	;

table_reference
	:	table_atom
	;

insert_header returns [String table]
    @init {
        $table = null;
    }
    :   INSERT (INTO)? table_spec {
            $table = $table_spec.text;
        }
    ;

value_list_clause returns [List<List<String>> valueListClause]
    @init {
        $valueListClause = new ArrayList<List<String>>();
    }
    :   VALUES
        value = column_value_list {
            $valueListClause.add($value.columnValueList);
        }
        (
            COMMA
            value = column_value_list {
                $valueListClause.add($value.columnValueList);
            }
        )*
    ;

column_value_list returns [List<String> columnValueList]
    @init {
        $columnValueList = new ArrayList<String>();
    }
    :   LEFT_PARENTHESIS
        expression = bit_expr {
            $columnValueList.add($expression.text);
        }
        (
            COMMA
            expression = bit_expr {
                $columnValueList.add($expression.text);
            }
        )* RIGHT_PARENTHESIS
    ;

table_atom
	:	table_spec
	;

table_spec
	:	(schema_name DOT)? table_name
	;

column_list returns [List<String> columnList]
    @init {
        $columnList = new ArrayList<String>();
    }
	:   LEFT_PARENTHESIS
	    column = column_spec {
	        $columnList.add($column.text);
	    }
        (
            COMMA
            column = column_spec {
                $columnList.add($column.text);
            }
        )* RIGHT_PARENTHESIS
	;

column_spec
	: ((schema_name DOT)? table_name DOT)? column_name
	;

bit_expr
    :   simple_expr
    ;

simple_expr
    :   literal_value
    |   column_spec
    ;

literal_value
    :   string_literal
    |   number_literal
    ;

string_literal  :   TEXT_STRING;
number_literal  :	(PLUS | MINUS)? (INTEGER_NUMBER | REAL_NUMBER);

alias : (AS)? ID;
column_name : ID;
partition_name : ID;
schema_name	: ID;
table_name	: ID;

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