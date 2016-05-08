// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlusLex.g 2016-04-27 13:32:59

	package com.mijecu25.sqlplus.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SQLPlusLex extends Lexer {
	public static final int EOF=-1;
	public static final int AFTER=4;
	public static final int ALERT=5;
	public static final int AS=6;
	public static final int ASTERISK=7;
	public static final int BEFORE=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int DASH=11;
	public static final int DATABASES=12;
	public static final int DELETE=13;
	public static final int DOT=14;
	public static final int EQUAL=15;
	public static final int FROM=16;
	public static final int GREATER_THAN=17;
	public static final int GREATER_THAN_EQUAL=18;
	public static final int ID=19;
	public static final int IF=20;
	public static final int IN=21;
	public static final int INSERT=22;
	public static final int LEFT_PARENTHESIS=23;
	public static final int LESS_THAN=24;
	public static final int LESS_THAN_EQUAL=25;
	public static final int LIKE=26;
	public static final int NEWLINE=27;
	public static final int NOT_EQUAL=28;
	public static final int QUESTION_MARK=29;
	public static final int QUOTE=30;
	public static final int RIGHT_PARENTHESIS=31;
	public static final int SELECT=32;
	public static final int SEMICOLON=33;
	public static final int SHOW=34;
	public static final int UNDERSCORE=35;
	public static final int UPDATE=36;
	public static final int USE=37;
	public static final int WHERE=38;
	public static final int WS=39;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public SQLPlusLex() {} 
	public SQLPlusLex(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public SQLPlusLex(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "src/main/sqlplus/parser/SQLPlusLex.g"; }

	// $ANTLR start "ASTERISK"
	public final void mASTERISK() throws RecognitionException {
		try {
			int _type = ASTERISK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:7:10: ( '*' )
			// src/main/sqlplus/parser/SQLPlusLex.g:7:12: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASTERISK"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:8:7: ( ',' )
			// src/main/sqlplus/parser/SQLPlusLex.g:8:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:9:7: ( ':' )
			// src/main/sqlplus/parser/SQLPlusLex.g:9:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "DASH"
	public final void mDASH() throws RecognitionException {
		try {
			int _type = DASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:10:6: ( '-' )
			// src/main/sqlplus/parser/SQLPlusLex.g:10:8: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DASH"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:11:5: ( '.' )
			// src/main/sqlplus/parser/SQLPlusLex.g:11:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:12:7: ( '=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:12:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "GREATER_THAN"
	public final void mGREATER_THAN() throws RecognitionException {
		try {
			int _type = GREATER_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:13:14: ( '>' )
			// src/main/sqlplus/parser/SQLPlusLex.g:13:16: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER_THAN"

	// $ANTLR start "GREATER_THAN_EQUAL"
	public final void mGREATER_THAN_EQUAL() throws RecognitionException {
		try {
			int _type = GREATER_THAN_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:14:19: ( '>=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:14:21: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER_THAN_EQUAL"

	// $ANTLR start "LEFT_PARENTHESIS"
	public final void mLEFT_PARENTHESIS() throws RecognitionException {
		try {
			int _type = LEFT_PARENTHESIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:15:18: ( '(' )
			// src/main/sqlplus/parser/SQLPlusLex.g:15:20: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_PARENTHESIS"

	// $ANTLR start "LESS_THAN"
	public final void mLESS_THAN() throws RecognitionException {
		try {
			int _type = LESS_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:16:11: ( '<' )
			// src/main/sqlplus/parser/SQLPlusLex.g:16:13: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS_THAN"

	// $ANTLR start "LESS_THAN_EQUAL"
	public final void mLESS_THAN_EQUAL() throws RecognitionException {
		try {
			int _type = LESS_THAN_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:17:17: ( '<=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:17:19: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS_THAN_EQUAL"

	// $ANTLR start "NOT_EQUAL"
	public final void mNOT_EQUAL() throws RecognitionException {
		try {
			int _type = NOT_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:19:2: ( '<>' | '!=' | '~=' | '^=' )
			int alt1=4;
			switch ( input.LA(1) ) {
			case '<':
				{
				alt1=1;
				}
				break;
			case '!':
				{
				alt1=2;
				}
				break;
			case '~':
				{
				alt1=3;
				}
				break;
			case '^':
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:19:4: '<>'
					{
					match("<>"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:20:5: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlusLex.g:21:5: '~='
					{
					match("~="); 

					}
					break;
				case 4 :
					// src/main/sqlplus/parser/SQLPlusLex.g:22:5: '^='
					{
					match("^="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_EQUAL"

	// $ANTLR start "QUESTION_MARK"
	public final void mQUESTION_MARK() throws RecognitionException {
		try {
			int _type = QUESTION_MARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:24:15: ( '?' )
			// src/main/sqlplus/parser/SQLPlusLex.g:24:17: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION_MARK"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			int _type = QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:25:7: ( '\\'' )
			// src/main/sqlplus/parser/SQLPlusLex.g:25:9: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTE"

	// $ANTLR start "RIGHT_PARENTHESIS"
	public final void mRIGHT_PARENTHESIS() throws RecognitionException {
		try {
			int _type = RIGHT_PARENTHESIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:26:19: ( ')' )
			// src/main/sqlplus/parser/SQLPlusLex.g:26:21: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_PARENTHESIS"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:27:11: ( ';' )
			// src/main/sqlplus/parser/SQLPlusLex.g:27:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "UNDERSCORE"
	public final void mUNDERSCORE() throws RecognitionException {
		try {
			int _type = UNDERSCORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:28:12: ( '_' )
			// src/main/sqlplus/parser/SQLPlusLex.g:28:13: '_'
			{
			match('_'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDERSCORE"

	// $ANTLR start "ALERT"
	public final void mALERT() throws RecognitionException {
		try {
			int _type = ALERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:32:2: ( 'alert' | 'ALERT' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='a') ) {
				alt2=1;
			}
			else if ( (LA2_0=='A') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:32:4: 'alert'
					{
					match("alert"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:33:4: 'ALERT'
					{
					match("ALERT"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALERT"

	// $ANTLR start "AFTER"
	public final void mAFTER() throws RecognitionException {
		try {
			int _type = AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:37:2: ( 'after' | 'AFTER' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='a') ) {
				alt3=1;
			}
			else if ( (LA3_0=='A') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:37:4: 'after'
					{
					match("after"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:38:4: 'AFTER'
					{
					match("AFTER"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AFTER"

	// $ANTLR start "AS"
	public final void mAS() throws RecognitionException {
		try {
			int _type = AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:42:2: ( 'as' | 'AS' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='a') ) {
				alt4=1;
			}
			else if ( (LA4_0=='A') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:42:5: 'as'
					{
					match("as"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:43:4: 'AS'
					{
					match("AS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AS"

	// $ANTLR start "BEFORE"
	public final void mBEFORE() throws RecognitionException {
		try {
			int _type = BEFORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:47:2: ( 'before' | 'BEFORE' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='b') ) {
				alt5=1;
			}
			else if ( (LA5_0=='B') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:47:4: 'before'
					{
					match("before"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:48:4: 'BEFORE'
					{
					match("BEFORE"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BEFORE"

	// $ANTLR start "DATABASES"
	public final void mDATABASES() throws RecognitionException {
		try {
			int _type = DATABASES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:52:2: ( 'databases' | 'DATABASES' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='d') ) {
				alt6=1;
			}
			else if ( (LA6_0=='D') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:52:4: 'databases'
					{
					match("databases"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:53:4: 'DATABASES'
					{
					match("DATABASES"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATABASES"

	// $ANTLR start "DELETE"
	public final void mDELETE() throws RecognitionException {
		try {
			int _type = DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:57:2: ( 'delete' | 'DELETE' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='d') ) {
				alt7=1;
			}
			else if ( (LA7_0=='D') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:57:4: 'delete'
					{
					match("delete"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:58:4: 'DELETE'
					{
					match("DELETE"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DELETE"

	// $ANTLR start "FROM"
	public final void mFROM() throws RecognitionException {
		try {
			int _type = FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:62:2: ( 'from' | 'FROM' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='f') ) {
				alt8=1;
			}
			else if ( (LA8_0=='F') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:62:4: 'from'
					{
					match("from"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:63:4: 'FROM'
					{
					match("FROM"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FROM"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:67:2: ( 'if' | 'IF' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='i') ) {
				alt9=1;
			}
			else if ( (LA9_0=='I') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:67:4: 'if'
					{
					match("if"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:68:4: 'IF'
					{
					match("IF"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:72:2: ( 'in' | 'IN' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='i') ) {
				alt10=1;
			}
			else if ( (LA10_0=='I') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:72:4: 'in'
					{
					match("in"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:73:4: 'IN'
					{
					match("IN"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "INSERT"
	public final void mINSERT() throws RecognitionException {
		try {
			int _type = INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:77:2: ( 'insert' | 'INSERT' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='i') ) {
				alt11=1;
			}
			else if ( (LA11_0=='I') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:77:5: 'insert'
					{
					match("insert"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:78:4: 'INSERT'
					{
					match("INSERT"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSERT"

	// $ANTLR start "LIKE"
	public final void mLIKE() throws RecognitionException {
		try {
			int _type = LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:82:2: ( 'like' | 'LIKE' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='l') ) {
				alt12=1;
			}
			else if ( (LA12_0=='L') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:82:4: 'like'
					{
					match("like"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:83:4: 'LIKE'
					{
					match("LIKE"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIKE"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:87:2: ( 'select' | 'SELECT' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='s') ) {
				alt13=1;
			}
			else if ( (LA13_0=='S') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:87:4: 'select'
					{
					match("select"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:88:4: 'SELECT'
					{
					match("SELECT"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "SHOW"
	public final void mSHOW() throws RecognitionException {
		try {
			int _type = SHOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:92:2: ( 'show' | 'SHOW' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='s') ) {
				alt14=1;
			}
			else if ( (LA14_0=='S') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:92:4: 'show'
					{
					match("show"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:93:4: 'SHOW'
					{
					match("SHOW"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHOW"

	// $ANTLR start "UPDATE"
	public final void mUPDATE() throws RecognitionException {
		try {
			int _type = UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:97:2: ( 'update' | 'UPDATE' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='u') ) {
				alt15=1;
			}
			else if ( (LA15_0=='U') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:97:5: 'update'
					{
					match("update"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:98:4: 'UPDATE'
					{
					match("UPDATE"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPDATE"

	// $ANTLR start "USE"
	public final void mUSE() throws RecognitionException {
		try {
			int _type = USE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:102:2: ( 'use' | 'USE' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='u') ) {
				alt16=1;
			}
			else if ( (LA16_0=='U') ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:102:4: 'use'
					{
					match("use"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:103:4: 'USE'
					{
					match("USE"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USE"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:107:2: ( 'where' | 'WHERE' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='w') ) {
				alt17=1;
			}
			else if ( (LA17_0=='W') ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:107:5: 'where'
					{
					match("where"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:108:4: 'WHERE'
					{
					match("WHERE"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHERE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:112:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )* )
			// src/main/sqlplus/parser/SQLPlusLex.g:112:4: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )*
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// src/main/sqlplus/parser/SQLPlusLex.g:112:39: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0=='$'||(LA18_0 >= '0' && LA18_0 <= '9')||(LA18_0 >= 'A' && LA18_0 <= 'Z')||LA18_0=='_'||(LA18_0 >= 'a' && LA18_0 <= 'z')) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop18;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:117:2: ( ( '\\r' )? '\\n' )
			// src/main/sqlplus/parser/SQLPlusLex.g:117:5: ( '\\r' )? '\\n'
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:117:5: ( '\\r' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='\r') ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:117:5: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:122:2: ( ( ' ' | '\\t' )+ )
			// src/main/sqlplus/parser/SQLPlusLex.g:122:5: ( ' ' | '\\t' )+
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:122:5: ( ' ' | '\\t' )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0=='\t'||LA20_0==' ') ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// src/main/sqlplus/parser/SQLPlusLex.g:1:8: ( ASTERISK | COMMA | COLON | DASH | DOT | EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LEFT_PARENTHESIS | LESS_THAN | LESS_THAN_EQUAL | NOT_EQUAL | QUESTION_MARK | QUOTE | RIGHT_PARENTHESIS | SEMICOLON | UNDERSCORE | ALERT | AFTER | AS | BEFORE | DATABASES | DELETE | FROM | IF | IN | INSERT | LIKE | SELECT | SHOW | UPDATE | USE | WHERE | ID | NEWLINE | WS )
		int alt21=36;
		alt21 = dfa21.predict(input);
		switch (alt21) {
			case 1 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:10: ASTERISK
				{
				mASTERISK(); 

				}
				break;
			case 2 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:19: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 3 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:25: COLON
				{
				mCOLON(); 

				}
				break;
			case 4 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:31: DASH
				{
				mDASH(); 

				}
				break;
			case 5 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:36: DOT
				{
				mDOT(); 

				}
				break;
			case 6 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:40: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 7 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:46: GREATER_THAN
				{
				mGREATER_THAN(); 

				}
				break;
			case 8 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:59: GREATER_THAN_EQUAL
				{
				mGREATER_THAN_EQUAL(); 

				}
				break;
			case 9 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:78: LEFT_PARENTHESIS
				{
				mLEFT_PARENTHESIS(); 

				}
				break;
			case 10 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:95: LESS_THAN
				{
				mLESS_THAN(); 

				}
				break;
			case 11 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:105: LESS_THAN_EQUAL
				{
				mLESS_THAN_EQUAL(); 

				}
				break;
			case 12 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:121: NOT_EQUAL
				{
				mNOT_EQUAL(); 

				}
				break;
			case 13 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:131: QUESTION_MARK
				{
				mQUESTION_MARK(); 

				}
				break;
			case 14 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:145: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 15 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:151: RIGHT_PARENTHESIS
				{
				mRIGHT_PARENTHESIS(); 

				}
				break;
			case 16 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:169: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 17 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:179: UNDERSCORE
				{
				mUNDERSCORE(); 

				}
				break;
			case 18 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:190: ALERT
				{
				mALERT(); 

				}
				break;
			case 19 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:196: AFTER
				{
				mAFTER(); 

				}
				break;
			case 20 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:202: AS
				{
				mAS(); 

				}
				break;
			case 21 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:205: BEFORE
				{
				mBEFORE(); 

				}
				break;
			case 22 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:212: DATABASES
				{
				mDATABASES(); 

				}
				break;
			case 23 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:222: DELETE
				{
				mDELETE(); 

				}
				break;
			case 24 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:229: FROM
				{
				mFROM(); 

				}
				break;
			case 25 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:234: IF
				{
				mIF(); 

				}
				break;
			case 26 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:237: IN
				{
				mIN(); 

				}
				break;
			case 27 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:240: INSERT
				{
				mINSERT(); 

				}
				break;
			case 28 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:247: LIKE
				{
				mLIKE(); 

				}
				break;
			case 29 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:252: SELECT
				{
				mSELECT(); 

				}
				break;
			case 30 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:259: SHOW
				{
				mSHOW(); 

				}
				break;
			case 31 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:264: UPDATE
				{
				mUPDATE(); 

				}
				break;
			case 32 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:271: USE
				{
				mUSE(); 

				}
				break;
			case 33 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:275: WHERE
				{
				mWHERE(); 

				}
				break;
			case 34 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:281: ID
				{
				mID(); 

				}
				break;
			case 35 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:284: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 36 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:292: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA21 dfa21 = new DFA21(this);
	static final String DFA21_eotS =
		"\7\uffff\1\46\1\uffff\1\50\5\uffff\1\51\22\42\10\uffff\2\42\1\112\2\42"+
		"\1\112\10\42\1\125\1\127\1\125\1\127\16\42\1\uffff\12\42\1\uffff\1\42"+
		"\1\uffff\10\42\1\172\1\42\1\172\14\42\2\u0088\2\42\2\u008b\1\42\1\u008d"+
		"\1\42\1\u008d\1\42\1\uffff\3\42\1\u0093\1\u0094\1\u0093\1\u0094\6\42\1"+
		"\uffff\2\42\1\uffff\1\42\1\uffff\3\42\2\u00a1\2\uffff\2\u00a2\1\42\1\u00a4"+
		"\1\42\1\u00a4\2\u00a6\2\u00a7\2\u00a8\2\uffff\1\42\1\uffff\1\42\3\uffff"+
		"\2\42\2\u00ad\1\uffff";
	static final String DFA21_eofS =
		"\u00ae\uffff";
	static final String DFA21_minS =
		"\1\11\6\uffff\1\75\1\uffff\1\75\5\uffff\1\44\1\146\1\106\1\145\1\105\1"+
		"\141\1\101\1\162\1\122\1\146\1\106\1\151\1\111\1\145\1\105\1\160\1\120"+
		"\1\150\1\110\10\uffff\1\145\1\164\1\44\1\105\1\124\1\44\1\146\1\106\1"+
		"\164\1\154\1\124\1\114\1\157\1\117\4\44\1\153\1\113\1\154\1\157\1\114"+
		"\1\117\1\144\1\145\1\104\1\105\1\145\1\105\1\162\1\145\1\uffff\1\122\1"+
		"\105\1\157\1\117\1\141\1\145\1\101\1\105\1\155\1\115\1\uffff\1\145\1\uffff"+
		"\1\105\1\145\1\105\1\145\1\167\1\105\1\127\1\141\1\44\1\101\1\44\1\162"+
		"\1\122\1\164\1\162\1\124\1\122\1\162\1\122\1\142\1\164\1\102\1\124\2\44"+
		"\1\162\1\122\2\44\1\143\1\44\1\103\1\44\1\164\1\uffff\1\124\1\145\1\105"+
		"\4\44\1\145\1\105\1\141\1\145\1\101\1\105\1\uffff\1\164\1\124\1\uffff"+
		"\1\164\1\uffff\1\124\1\145\1\105\2\44\2\uffff\2\44\1\163\1\44\1\123\7"+
		"\44\2\uffff\1\145\1\uffff\1\105\3\uffff\1\163\1\123\2\44\1\uffff";
	static final String DFA21_maxS =
		"\1\176\6\uffff\1\75\1\uffff\1\76\5\uffff\1\172\1\163\1\123\1\145\1\105"+
		"\1\145\1\105\1\162\1\122\1\156\1\116\1\151\1\111\1\150\1\110\1\163\1\123"+
		"\1\150\1\110\10\uffff\1\145\1\164\1\172\1\105\1\124\1\172\1\146\1\106"+
		"\1\164\1\154\1\124\1\114\1\157\1\117\4\172\1\153\1\113\1\154\1\157\1\114"+
		"\1\117\1\144\1\145\1\104\1\105\1\145\1\105\1\162\1\145\1\uffff\1\122\1"+
		"\105\1\157\1\117\1\141\1\145\1\101\1\105\1\155\1\115\1\uffff\1\145\1\uffff"+
		"\1\105\1\145\1\105\1\145\1\167\1\105\1\127\1\141\1\172\1\101\1\172\1\162"+
		"\1\122\1\164\1\162\1\124\1\122\1\162\1\122\1\142\1\164\1\102\1\124\2\172"+
		"\1\162\1\122\2\172\1\143\1\172\1\103\1\172\1\164\1\uffff\1\124\1\145\1"+
		"\105\4\172\1\145\1\105\1\141\1\145\1\101\1\105\1\uffff\1\164\1\124\1\uffff"+
		"\1\164\1\uffff\1\124\1\145\1\105\2\172\2\uffff\2\172\1\163\1\172\1\123"+
		"\7\172\2\uffff\1\145\1\uffff\1\105\3\uffff\1\163\1\123\2\172\1\uffff";
	static final String DFA21_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\uffff\1\14\1\15\1\16\1"+
		"\17\1\20\23\uffff\1\42\1\43\1\44\1\10\1\7\1\13\1\12\1\21\40\uffff\1\24"+
		"\12\uffff\1\31\1\uffff\1\32\42\uffff\1\40\15\uffff\1\30\2\uffff\1\34\1"+
		"\uffff\1\36\5\uffff\1\22\1\23\14\uffff\1\41\1\25\1\uffff\1\27\1\uffff"+
		"\1\33\1\35\1\37\4\uffff\1\26";
	static final String DFA21_specialS =
		"\u00ae\uffff}>";
	static final String[] DFA21_transitionS = {
			"\1\44\1\43\2\uffff\1\43\22\uffff\1\44\1\12\2\uffff\1\42\2\uffff\1\14"+
			"\1\10\1\15\1\1\1\uffff\1\2\1\4\1\5\13\uffff\1\3\1\16\1\11\1\6\1\7\1\13"+
			"\1\uffff\1\21\1\23\1\42\1\25\1\42\1\27\2\42\1\31\2\42\1\33\6\42\1\35"+
			"\1\42\1\37\1\42\1\41\3\42\3\uffff\1\12\1\17\1\uffff\1\20\1\22\1\42\1"+
			"\24\1\42\1\26\2\42\1\30\2\42\1\32\6\42\1\34\1\42\1\36\1\42\1\40\3\42"+
			"\3\uffff\1\12",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\45",
			"",
			"\1\47\1\12",
			"",
			"",
			"",
			"",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\53\5\uffff\1\52\6\uffff\1\54",
			"\1\56\5\uffff\1\55\6\uffff\1\57",
			"\1\60",
			"\1\61",
			"\1\62\3\uffff\1\63",
			"\1\64\3\uffff\1\65",
			"\1\66",
			"\1\67",
			"\1\70\7\uffff\1\71",
			"\1\72\7\uffff\1\73",
			"\1\74",
			"\1\75",
			"\1\76\2\uffff\1\77",
			"\1\100\2\uffff\1\101",
			"\1\102\2\uffff\1\103",
			"\1\104\2\uffff\1\105",
			"\1\106",
			"\1\107",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\110",
			"\1\111",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\113",
			"\1\114",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\126"+
			"\7\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\22\42\1\130\7\42\4\uffff\1\42\1\uffff\32"+
			"\42",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"",
			"\1\161",
			"",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\173",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0089",
			"\1\u008a",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u008c",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u008e",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u008f",
			"",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"",
			"\1\u009b",
			"\1\u009c",
			"",
			"\1\u009d",
			"",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00a3",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u00a5",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"",
			"\1\u00a9",
			"",
			"\1\u00aa",
			"",
			"",
			"",
			"\1\u00ab",
			"\1\u00ac",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			""
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( ASTERISK | COMMA | COLON | DASH | DOT | EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LEFT_PARENTHESIS | LESS_THAN | LESS_THAN_EQUAL | NOT_EQUAL | QUESTION_MARK | QUOTE | RIGHT_PARENTHESIS | SEMICOLON | UNDERSCORE | ALERT | AFTER | AS | BEFORE | DATABASES | DELETE | FROM | IF | IN | INSERT | LIKE | SELECT | SHOW | UPDATE | USE | WHERE | ID | NEWLINE | WS );";
		}
	}

}
