lexer grammar SQLPlusLex;

@header {
	package com.mijecu25.sqlplus.parser;
}

AND
    :   'and'
    |   'AND'
    |   '&&'
    ;
ASTERISK : '*';
COMMA : ',';
COLON : ':';
DOT : '.';
EQUAL :	'=';
GREATER_THAN : '>';
GREATER_THAN_EQUAL : '>=';
LEFT_PARENTHESIS : '(';
LESS_THAN :	'<';
LESS_THAN_EQUAL : '<=';
MINUS : '-';
NOT
    : 'NOT'
    | 'not'
    | '!'
    ;
NOT_EQUAL
	:	'<>'
	| 	'!='
	| 	'~='
	| 	'^='
	;
OR
    :   'or'
    |   'OR'
    |   '||'
    ;
PLUS : '+';
QUESTION_MARK : '?';
QUOTE : '\'';
RIGHT_PARENTHESIS : ')';
SEMICOLON :	';';
UNDERSCORE :'_';
XOR
    :   'xor'
    |   'XOR'
    ;


ALERT
	:	'alert'
	|	'ALERT'
	;

ALERTS
	:	'alerts'
	|	'ALERTS'
	;

ALL
    :   'all'
    |   'any'
    ;

AFTER
	:	'after'
	|	'AFTER'
	;

ANY
    :   'any'
    |   'ANY'
    ;

AS
	: 	'as'
	|	'AS'
	;

BEFORE
	:	'before'
	|	'BEFORE'
	;

CLEAR
    :   'clear'
    |   'CLEAR'
    ;

DATABASES
	:	'databases'
	|	'DATABASES'
	;

DEFAULT
    :   'default'
    |   'DEFAULT'
    ;

DELETE
	:	'delete'
	|	'DELETE'
	;

EXISTS
    :   'exists'
    |   'EXISTS'
    ;

FALSE
    :   'false'
    |   'FALSE'
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

IS
    :   'is'
    |   'IS'
    ;

LIKE
	:	'like'
	|	'LIKE'
	;

LIST
    :   'list'
    |   'LIST'
    ;

NULL
    :   'null'
    |   'NULL'
    ;

SELECT
	:	'select'
	|	'SELECT'
	;

SET
    :   'set'
    |   'SET'
    ;

SHOW
	:	'show'
	|	'SHOW'
	;

TABLES
	:	'tables'
	|	'TABLES'
	;

TRUE
    :   'true'
    |   'TRUE'
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