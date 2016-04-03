grammar SQLPlus;

import SQLPlusLex;

@header {
	package com.mijecu25.sqlplus.parser;
}

// This is the entry point of the SQLPlus alert program
sqlplus
	: 	sql_expression
		// TODO should this be optional 
	|	sqlplus_alert
	;


sqlplus_alert 
	:	ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON 
			{ 
				System.out.println("Created SQLPlus alert"); 
			}
	;
	
sql_expression
	:	select_statement
	;

select_statement
	:	select_expression
	;
	
select_expression
	:	SELECT select_list (FROM table_references)?{ System.out.println("SQL Expressions"); }
	;
	
select_list
	:	displayed_column (COMMA displayed_column)* 
	| 	ASTERISK
	;
	
displayed_column 
	:	table_spec DOT ASTERISK
	|	column_spec (alias)?
	;

table_references
	:	table_reference (COMMA table_reference)*
	;
	
table_reference
	:	//table_factor1 
	/*|*/ 	table_atom
	;

table_factor1
	:	table_factor2 ((INNER | CROSS)? JOIN table_atom (join_condition)?)?
	;
	
table_factor2
	:	table_factor3 (STRAIGHT_JOIN table_atom (ON expression)?)?
	;

table_factor3
	:	table_factor4 ((LEFT|RIGHT) (OUTER)? JOIN table_factor4 join_condition)?
	;
	
table_factor4
	:	table_atom (NATURAL ((LEFT|RIGHT) (OUTER)?)? JOIN table_atom)?
	;
	
table_atom
	:	table_spec (partition_clause)? (alias)? (index_hint_list)?
	| 	subquery alias
	| 	LEFT_PARENTHESIS table_references RIGHT_PARENTHESIS
	| 	OJ table_reference LEFT OUTER JOIN table_reference ON expression
	;

join_condition
	:	ON expression 
	| 	USING column_list
	;

index_hint_list
	:	index_hint (COMMA index_hint)*
	;
	
index_hint
	:	TODO // TODO
	;
	
partition_clause
	:	PARTITION LEFT_PARENTHESIS partition_names RIGHT_PARENTHESIS
	;
	
partition_names
	:	partition_name (COMMA partition_name)*
	;

expression
	:	TODO // TODO
	;

table_spec
	:	(schema_name DOT)? table_name
	;

column_spec
	: ((schema_name DOT)? table_name DOT)? column_name 
	;

column_list
	:	TODO //TODO
	;
	
subquery
	:	LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS
	;

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