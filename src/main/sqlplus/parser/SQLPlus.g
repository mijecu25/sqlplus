grammar SQLPlus;

import SQLPlusLex;

@header {
	package com.mijecu25.sqlplus.parser;
}

// This is the entry point of the SQLPlus alert syntax
sqlplus_alert 
		/* Match an optional SQLPlus alert since we do not want ANTLR to output an error 
		   if the user entered a valid syntax.
		*/
	:	(ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON 
			{ 
				System.out.println("Created SQLPlus alert"); 
			}
		)
	;

// SQLPlus syntax to determine when should the alert be checked
timing
	:	BEFORE
	|	AFTER
	;

// SQL Data Manipulation Language key words. 
data_manipulation_language	
	:	INSERT
	|	DELETE
	|	UPDATE
	;

relational_operation
	:	EQUAL
	|	LESS_THAN_EQUAL
	|	GREATER_THAN_EQUAL
	|	LESS_THAN
	|	GREATER_THAN
	|	LIKE
	;

match_value
	:	ID
	|	QUESTION_MARK
	;