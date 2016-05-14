lexer grammar SQLPlusLex;

@header {
	package com.mijecu25.sqlplus.parser;
}

ASTERISK : '*';
COMMA : ',';
COLON : ':';
DASH : '-';
DOT : '.';
EQUAL :	'=';
GREATER_THAN : '>';
GREATER_THAN_EQUAL: '>=';
LEFT_PARENTHESIS : '(';
LESS_THAN :	'<';
LESS_THAN_EQUAL : '<=';
NOT_EQUAL	
	:	'<>' 
	| 	'!=' 
	| 	'~='
	| 	'^='
	;
QUESTION_MARK : '?';
QUOTE : '\'';
RIGHT_PARENTHESIS : ')';
SEMICOLON :	';';
UNDERSCORE :'_';


ALERT
	:	'alert'
	|	'ALERT'
	;
	
AFTER
	:	'after'
	|	'AFTER'
	;	

AS
	: 	'as'
	|	'AS'
	;
	
BEFORE
	:	'before'
	|	'BEFORE'
	;
	
DATABASES
	:	'databases'
	|	'DATABASES'
	;
		
DELETE
	:	'delete'
	|	'DELETE'
	;	

FROM
	:	'from'
	|	'FROM'
	;

IF
	:	'if'
	|	'IF'
	;
	
IN	
	:	'in'
	|	'IN'
	;
			
INSERT
	: 	'insert'
	|	'INSERT'
	;	
			
LIKE	
	:	'like'
	|	'LIKE'
	;
		
SELECT
	:	'select'
	|	'SELECT'
	;
	
SHOW
	:	'show'
	|	'SHOW'
	;

TABLES
	:	'tables'
	|	'TABLES'
	;
					
UPDATE
	: 	'update'
	|	'UPDATE'
	;
	
USE
	:	'use'
	|	'USE'
	;	

WHERE
	: 	'where'
	|	'WHERE'
	;
	
ID
	:	( 'A'..'Z' | 'a'..'z' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' )*
	;

NEWLINE	
		// Optional carriage return
	: 	'\r'? '\n' 
	;

WS  	
		// One or more. Just ignore
	: 	(' '|'\t')+ { $channel = HIDDEN; } 
	;