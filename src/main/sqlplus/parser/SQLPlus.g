grammar SQLPlus;

import SQLPlusLex;

@header {
	package com.mijecu25.sqlplus.parser;

	import com.mijecu25.sqlplus.compiler.core.statement.Statement;
	import com.mijecu25.sqlplus.compiler.core.statement.StatementUseDatabase;
	import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementSelectExpression;
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
    ;

select_statement returns [Statement selectStatement]
	@init {
		$selectStatement = null;
	}
	:	select_expression {
			$selectStatement = $select_expression.selectExpression;
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
	// TODO the (from table_references) was optional
	:	SELECT select_list FROM table_references {
			$selectExpression = new StatementSelectExpression($select_list.selectList, $table_references.tableReferences);
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
			COMMA table = table_reference {
				$tableReferences.add($table.text);
			}
		)*
	;

table_reference
	:	table_atom
	;

//table_factor1
//	:	table_factor2 ((INNER | CROSS)? JOIN table_atom (join_condition)?)?
//	;
//	
//table_factor2
//	:	table_factor3 (STRAIGHT_JOIN table_atom (ON expression)?)?
//	;
//
//table_factor3
//	:	table_factor4 ((LEFT|RIGHT) (OUTER)? JOIN table_factor4 join_condition)?
//	;
//	
//table_factor4
//	:	table_atom (NATURAL ((LEFT|RIGHT) (OUTER)?)? JOIN table_atom)?
//	;
//	
table_atom
	:	table_spec
	;

//join_condition
//	:	ON expression 
//	| 	USING column_list
//	;
//
//index_hint_list
//	:	index_hint (COMMA index_hint)*
//	;
//	
//index_hint
//	:	TODO // TODO
//	;
//	
//partition_clause
//	:	PARTITION LEFT_PARENTHESIS partition_names RIGHT_PARENTHESIS
//	;
//	
//partition_names
//	:	partition_name (COMMA partition_name)*
//	;
//
//expression
//	:	TODO // TODO
//	;
//
table_spec
	:	(schema_name DOT)? table_name
	;

column_spec
	: ((schema_name DOT)? table_name DOT)? column_name
	;

//column_list
//	:	TODO //TODO
//	;
//	
//subquery
//	:	LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS
//	;

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