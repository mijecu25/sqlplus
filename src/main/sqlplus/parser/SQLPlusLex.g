lexer grammar SQLPlusLex;

@header {
	package com.mijecu25.sqlplus.parser;
}

// TODO delete this
TODO : 'TODO';

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

CROSS
	:	'cross'
	|	'CROSS'
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
	
INNER
	:	'inner'
	|	'INNER'
	;
		
INSERT
	: 	'insert'
	|	'INSERT'
	;	
	
JOIN
	:	'join'
	|	'JOIN'
	;
	
LEFT
	:	'left'
	|	'LEFT'
	;
		
LIKE	
	:	'like'
	|	'LIKE'
	;
	
NATURAL
	:	'natural'
	|	'NATURAL'
	;

OJ
	:	'oj'
	|	'OJ'
	;
	
ON
	:	'on'
	|	'ON'
	;

OUTER
	:	'outer'
	|	'OUTER'
	;

PARTITION
	:	'partition'
	|	'PARTITION'
	;

RIGHT
	:	'right'
	|	'RIGHT'
	;
	
SELECT
	:	'select'
	|	'SELECT'
	;
		
STRAIGHT_JOIN
	:	'straight_join'
	|	'STRAIGHT_JOIN'
	;
			
UPDATE
	: 	'update'
	|	'UPDATE'
	;	

USING
	:	'using'
	|	'USING'
	;

WHERE
	: 	'where'
	|	'WHERE'
	;
	
SHOW
	:	'show'
	|	'SHOW'
	;
	
DATABASES
	:	'databases'
	|	'DATABASES'
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