lexer grammar SQLPlusLex;

@header {
	package com.mijecu25.sqlplus.parser;
}

LESS_THAN_EQUAL : '<=';
GREATER_THAN_EQUAL: '>=';
COLON : ':';
DASH : '-';
QUOTE : '\'';
EQUAL :	'=';
LESS_THAN :	'<';
GREATER_THAN : '>';
NOT_EQ	: '<>' | '!=' | '~='| '^=';
SEMICOLON :	';';
UNDERSCORE :'_';
QUESTION_MARK : '?';

ALERT
	:	'alert'
	|	'ALERT'
	;

IF
	:	'if'
	|	'IF'
	;

IN
	:	'in'
	|	'IN'
	;

// SQL Where keyword
WHERE
	: 	'where'
	|	'WHERE'
	;

// SQLPlus Before keyword
BEFORE
	:	'before'
	|	'BEFORE'
	;

// SQLPlus After keyword
AFTER
	:	'after'
	|	'AFTER'
	;

// SQL Insert statement
INSERT
	: 	'insert'
	|	'INSERT'
	;

// SQL Delete statement
DELETE
	:	'delete'
	|	'DELETE'
	;	

// SQL Update statement
UPDATE
	: 	'update'
	|	'UPDATE'
	;

LIKE	
	:	'like'
	|	'LIKE'
	;

ID
	:	(
			('a'..'z')|('A'..'Z')|UNDERSCORE
		) 
		(
			('a'..'z')|('A'..'Z')|UNDERSCORE|('0'..'9')|COLON|DASH|QUOTE
		)*
	;

NEWLINE	
		// Optional carriage return
	: 	'\r'? '\n' 
	;

WS  	
		// One or more. Just ignore
	: 	(' '|'\t')+ { $channel = HIDDEN; } 
	;