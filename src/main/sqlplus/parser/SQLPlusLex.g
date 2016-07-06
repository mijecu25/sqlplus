lexer grammar SQLPlusLex;

@header {
	package com.mijecu25.sqlplus.parser;
}

ASTERISK : '*';
COMMA : ',';
COLON : ':';
DOT : '.';
EQUAL :	'=';
GREATER_THAN : '>';
GREATER_THAN_EQUAL: '>=';
LEFT_PARENTHESIS : '(';
LESS_THAN :	'<';
LESS_THAN_EQUAL : '<=';
MINUS : '-';
NOT_EQUAL
	:	'<>'
	| 	'!='
	| 	'~='
	| 	'^='
	;
PLUS : '+';
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

INTO
    :   'into'
    |   'INTO'
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

VALUES
    :   'values'
    |   'VALUES'
    ;

WHERE
	: 	'where'
	|	'WHERE'
	;

INTEGER_NUMBER
    :   ( '0'..'9' )+
    ;

ID
	:	( 'A'..'Z' | 'a'..'z' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' )*
	;

REAL_NUMBER
    :   ( INTEGER_NUMBER DOT INTEGER_NUMBER | INTEGER_NUMBER DOT | DOT INTEGER_NUMBER | INTEGER_NUMBER )
        ( ('E'|'e') ( PLUS | MINUS )? INTEGER_NUMBER )?
    ;

TEXT_STRING
    :   '\'' ( ~('\'') )* '\''
    |   '"' ( ~('"') )* '"'
    ;

NEWLINE
		// Optional carriage return
	: 	'\r'? '\n'
	;

WS
		// One or more. Just ignore
	: 	(' '|'\t')+ { $channel = HIDDEN; }
	;