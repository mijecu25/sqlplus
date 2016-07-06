// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlusLex.g 2016-07-06 13:40:52

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
	public static final int DATABASES=11;
	public static final int DELETE=12;
	public static final int DOT=13;
	public static final int EQUAL=14;
	public static final int FROM=15;
	public static final int GREATER_THAN=16;
	public static final int GREATER_THAN_EQUAL=17;
	public static final int ID=18;
	public static final int IF=19;
	public static final int IN=20;
	public static final int INSERT=21;
	public static final int INTEGER_NUMBER=22;
	public static final int INTO=23;
	public static final int LEFT_PARENTHESIS=24;
	public static final int LESS_THAN=25;
	public static final int LESS_THAN_EQUAL=26;
	public static final int LIKE=27;
	public static final int MINUS=28;
	public static final int NEWLINE=29;
	public static final int NOT_EQUAL=30;
	public static final int PLUS=31;
	public static final int QUESTION_MARK=32;
	public static final int QUOTE=33;
	public static final int REAL_NUMBER=34;
	public static final int RIGHT_PARENTHESIS=35;
	public static final int SELECT=36;
	public static final int SEMICOLON=37;
	public static final int SHOW=38;
	public static final int TABLES=39;
	public static final int TEXT_STRING=40;
	public static final int UNDERSCORE=41;
	public static final int UPDATE=42;
	public static final int USE=43;
	public static final int VALUES=44;
	public static final int WHERE=45;
	public static final int WS=46;

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

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:10:5: ( '.' )
			// src/main/sqlplus/parser/SQLPlusLex.g:10:7: '.'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:11:7: ( '=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:11:9: '='
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
			// src/main/sqlplus/parser/SQLPlusLex.g:12:14: ( '>' )
			// src/main/sqlplus/parser/SQLPlusLex.g:12:16: '>'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:13:19: ( '>=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:13:21: '>='
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
			// src/main/sqlplus/parser/SQLPlusLex.g:14:18: ( '(' )
			// src/main/sqlplus/parser/SQLPlusLex.g:14:20: '('
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
			// src/main/sqlplus/parser/SQLPlusLex.g:15:11: ( '<' )
			// src/main/sqlplus/parser/SQLPlusLex.g:15:13: '<'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:16:17: ( '<=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:16:19: '<='
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

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:17:7: ( '-' )
			// src/main/sqlplus/parser/SQLPlusLex.g:17:9: '-'
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
	// $ANTLR end "MINUS"

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

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:24:6: ( '+' )
			// src/main/sqlplus/parser/SQLPlusLex.g:24:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "QUESTION_MARK"
	public final void mQUESTION_MARK() throws RecognitionException {
		try {
			int _type = QUESTION_MARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:25:15: ( '?' )
			// src/main/sqlplus/parser/SQLPlusLex.g:25:17: '?'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:26:7: ( '\\'' )
			// src/main/sqlplus/parser/SQLPlusLex.g:26:9: '\\''
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
			// src/main/sqlplus/parser/SQLPlusLex.g:27:19: ( ')' )
			// src/main/sqlplus/parser/SQLPlusLex.g:27:21: ')'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:28:11: ( ';' )
			// src/main/sqlplus/parser/SQLPlusLex.g:28:13: ';'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:29:12: ( '_' )
			// src/main/sqlplus/parser/SQLPlusLex.g:29:13: '_'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:33:2: ( 'alert' | 'ALERT' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:33:4: 'alert'
					{
					match("alert"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:34:4: 'ALERT'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:38:2: ( 'after' | 'AFTER' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:38:4: 'after'
					{
					match("after"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:39:4: 'AFTER'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:43:2: ( 'as' | 'AS' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:43:5: 'as'
					{
					match("as"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:44:4: 'AS'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:48:2: ( 'before' | 'BEFORE' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:48:4: 'before'
					{
					match("before"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:49:4: 'BEFORE'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:53:2: ( 'databases' | 'DATABASES' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:53:4: 'databases'
					{
					match("databases"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:54:4: 'DATABASES'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:58:2: ( 'delete' | 'DELETE' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:58:4: 'delete'
					{
					match("delete"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:59:4: 'DELETE'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:63:2: ( 'from' | 'FROM' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:63:4: 'from'
					{
					match("from"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:64:4: 'FROM'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:68:2: ( 'if' | 'IF' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:68:4: 'if'
					{
					match("if"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:69:4: 'IF'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:73:2: ( 'in' | 'IN' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:73:4: 'in'
					{
					match("in"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:74:4: 'IN'
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

	// $ANTLR start "INTO"
	public final void mINTO() throws RecognitionException {
		try {
			int _type = INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:78:5: ( 'into' | 'INTO' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:78:9: 'into'
					{
					match("into"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:79:9: 'INTO'
					{
					match("INTO"); 

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
	// $ANTLR end "INTO"

	// $ANTLR start "INSERT"
	public final void mINSERT() throws RecognitionException {
		try {
			int _type = INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:83:2: ( 'insert' | 'INSERT' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='i') ) {
				alt12=1;
			}
			else if ( (LA12_0=='I') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:83:5: 'insert'
					{
					match("insert"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:84:4: 'INSERT'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:88:2: ( 'like' | 'LIKE' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='l') ) {
				alt13=1;
			}
			else if ( (LA13_0=='L') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:88:4: 'like'
					{
					match("like"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:89:4: 'LIKE'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:93:2: ( 'select' | 'SELECT' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:93:4: 'select'
					{
					match("select"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:94:4: 'SELECT'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:98:2: ( 'show' | 'SHOW' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='s') ) {
				alt15=1;
			}
			else if ( (LA15_0=='S') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:98:4: 'show'
					{
					match("show"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:99:4: 'SHOW'
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

	// $ANTLR start "TABLES"
	public final void mTABLES() throws RecognitionException {
		try {
			int _type = TABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:103:2: ( 'tables' | 'TABLES' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='t') ) {
				alt16=1;
			}
			else if ( (LA16_0=='T') ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:103:4: 'tables'
					{
					match("tables"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:104:4: 'TABLES'
					{
					match("TABLES"); 

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
	// $ANTLR end "TABLES"

	// $ANTLR start "UPDATE"
	public final void mUPDATE() throws RecognitionException {
		try {
			int _type = UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:108:2: ( 'update' | 'UPDATE' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='u') ) {
				alt17=1;
			}
			else if ( (LA17_0=='U') ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:108:5: 'update'
					{
					match("update"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:109:4: 'UPDATE'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:113:2: ( 'use' | 'USE' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='u') ) {
				alt18=1;
			}
			else if ( (LA18_0=='U') ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:113:4: 'use'
					{
					match("use"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:114:4: 'USE'
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

	// $ANTLR start "VALUES"
	public final void mVALUES() throws RecognitionException {
		try {
			int _type = VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:118:5: ( 'values' | 'VALUES' )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='v') ) {
				alt19=1;
			}
			else if ( (LA19_0=='V') ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:118:9: 'values'
					{
					match("values"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:119:9: 'VALUES'
					{
					match("VALUES"); 

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
	// $ANTLR end "VALUES"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:123:2: ( 'where' | 'WHERE' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='w') ) {
				alt20=1;
			}
			else if ( (LA20_0=='W') ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:123:5: 'where'
					{
					match("where"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:124:4: 'WHERE'
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

	// $ANTLR start "INTEGER_NUMBER"
	public final void mINTEGER_NUMBER() throws RecognitionException {
		try {
			int _type = INTEGER_NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:128:5: ( ( '0' .. '9' )+ )
			// src/main/sqlplus/parser/SQLPlusLex.g:128:9: ( '0' .. '9' )+
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:128:9: ( '0' .. '9' )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
					if ( cnt21 >= 1 ) break loop21;
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER_NUMBER"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:132:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )* )
			// src/main/sqlplus/parser/SQLPlusLex.g:132:4: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )*
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// src/main/sqlplus/parser/SQLPlusLex.g:132:39: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0=='$'||(LA22_0 >= '0' && LA22_0 <= '9')||(LA22_0 >= 'A' && LA22_0 <= 'Z')||LA22_0=='_'||(LA22_0 >= 'a' && LA22_0 <= 'z')) ) {
					alt22=1;
				}

				switch (alt22) {
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
					break loop22;
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

	// $ANTLR start "REAL_NUMBER"
	public final void mREAL_NUMBER() throws RecognitionException {
		try {
			int _type = REAL_NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:136:5: ( ( INTEGER_NUMBER DOT INTEGER_NUMBER | INTEGER_NUMBER DOT | DOT INTEGER_NUMBER | INTEGER_NUMBER ) ( ( 'E' | 'e' ) ( PLUS | MINUS )? INTEGER_NUMBER )? )
			// src/main/sqlplus/parser/SQLPlusLex.g:136:9: ( INTEGER_NUMBER DOT INTEGER_NUMBER | INTEGER_NUMBER DOT | DOT INTEGER_NUMBER | INTEGER_NUMBER ) ( ( 'E' | 'e' ) ( PLUS | MINUS )? INTEGER_NUMBER )?
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:136:9: ( INTEGER_NUMBER DOT INTEGER_NUMBER | INTEGER_NUMBER DOT | DOT INTEGER_NUMBER | INTEGER_NUMBER )
			int alt23=4;
			alt23 = dfa23.predict(input);
			switch (alt23) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:136:11: INTEGER_NUMBER DOT INTEGER_NUMBER
					{
					mINTEGER_NUMBER(); 

					mDOT(); 

					mINTEGER_NUMBER(); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:136:47: INTEGER_NUMBER DOT
					{
					mINTEGER_NUMBER(); 

					mDOT(); 

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlusLex.g:136:68: DOT INTEGER_NUMBER
					{
					mDOT(); 

					mINTEGER_NUMBER(); 

					}
					break;
				case 4 :
					// src/main/sqlplus/parser/SQLPlusLex.g:136:89: INTEGER_NUMBER
					{
					mINTEGER_NUMBER(); 

					}
					break;

			}

			// src/main/sqlplus/parser/SQLPlusLex.g:137:9: ( ( 'E' | 'e' ) ( PLUS | MINUS )? INTEGER_NUMBER )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0=='E'||LA25_0=='e') ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:137:11: ( 'E' | 'e' ) ( PLUS | MINUS )? INTEGER_NUMBER
					{
					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// src/main/sqlplus/parser/SQLPlusLex.g:137:21: ( PLUS | MINUS )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0=='+'||LA24_0=='-') ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlusLex.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					mINTEGER_NUMBER(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL_NUMBER"

	// $ANTLR start "TEXT_STRING"
	public final void mTEXT_STRING() throws RecognitionException {
		try {
			int _type = TEXT_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:141:5: ( '\\'' (~ ( '\\'' ) )* '\\'' | '\"' (~ ( '\"' ) )* '\"' )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0=='\'') ) {
				alt28=1;
			}
			else if ( (LA28_0=='\"') ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:141:9: '\\'' (~ ( '\\'' ) )* '\\''
					{
					match('\''); 
					// src/main/sqlplus/parser/SQLPlusLex.g:141:14: (~ ( '\\'' ) )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( ((LA26_0 >= '\u0000' && LA26_0 <= '&')||(LA26_0 >= '(' && LA26_0 <= '\uFFFF')) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlusLex.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
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
							break loop26;
						}
					}

					match('\''); 
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:142:9: '\"' (~ ( '\"' ) )* '\"'
					{
					match('\"'); 
					// src/main/sqlplus/parser/SQLPlusLex.g:142:13: (~ ( '\"' ) )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( ((LA27_0 >= '\u0000' && LA27_0 <= '!')||(LA27_0 >= '#' && LA27_0 <= '\uFFFF')) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlusLex.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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
							break loop27;
						}
					}

					match('\"'); 
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
	// $ANTLR end "TEXT_STRING"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:147:2: ( ( '\\r' )? '\\n' )
			// src/main/sqlplus/parser/SQLPlusLex.g:147:5: ( '\\r' )? '\\n'
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:147:5: ( '\\r' )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='\r') ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:147:5: '\\r'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:152:2: ( ( ' ' | '\\t' )+ )
			// src/main/sqlplus/parser/SQLPlusLex.g:152:5: ( ' ' | '\\t' )+
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:152:5: ( ' ' | '\\t' )+
			int cnt30=0;
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0=='\t'||LA30_0==' ') ) {
					alt30=1;
				}

				switch (alt30) {
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
					if ( cnt30 >= 1 ) break loop30;
					EarlyExitException eee = new EarlyExitException(30, input);
					throw eee;
				}
				cnt30++;
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
		// src/main/sqlplus/parser/SQLPlusLex.g:1:8: ( ASTERISK | COMMA | COLON | DOT | EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LEFT_PARENTHESIS | LESS_THAN | LESS_THAN_EQUAL | MINUS | NOT_EQUAL | PLUS | QUESTION_MARK | QUOTE | RIGHT_PARENTHESIS | SEMICOLON | UNDERSCORE | ALERT | AFTER | AS | BEFORE | DATABASES | DELETE | FROM | IF | IN | INTO | INSERT | LIKE | SELECT | SHOW | TABLES | UPDATE | USE | VALUES | WHERE | INTEGER_NUMBER | ID | REAL_NUMBER | TEXT_STRING | NEWLINE | WS )
		int alt31=43;
		alt31 = dfa31.predict(input);
		switch (alt31) {
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
				// src/main/sqlplus/parser/SQLPlusLex.g:1:31: DOT
				{
				mDOT(); 

				}
				break;
			case 5 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:35: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 6 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:41: GREATER_THAN
				{
				mGREATER_THAN(); 

				}
				break;
			case 7 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:54: GREATER_THAN_EQUAL
				{
				mGREATER_THAN_EQUAL(); 

				}
				break;
			case 8 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:73: LEFT_PARENTHESIS
				{
				mLEFT_PARENTHESIS(); 

				}
				break;
			case 9 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:90: LESS_THAN
				{
				mLESS_THAN(); 

				}
				break;
			case 10 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:100: LESS_THAN_EQUAL
				{
				mLESS_THAN_EQUAL(); 

				}
				break;
			case 11 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:116: MINUS
				{
				mMINUS(); 

				}
				break;
			case 12 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:122: NOT_EQUAL
				{
				mNOT_EQUAL(); 

				}
				break;
			case 13 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:132: PLUS
				{
				mPLUS(); 

				}
				break;
			case 14 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:137: QUESTION_MARK
				{
				mQUESTION_MARK(); 

				}
				break;
			case 15 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:151: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 16 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:157: RIGHT_PARENTHESIS
				{
				mRIGHT_PARENTHESIS(); 

				}
				break;
			case 17 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:175: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 18 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:185: UNDERSCORE
				{
				mUNDERSCORE(); 

				}
				break;
			case 19 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:196: ALERT
				{
				mALERT(); 

				}
				break;
			case 20 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:202: AFTER
				{
				mAFTER(); 

				}
				break;
			case 21 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:208: AS
				{
				mAS(); 

				}
				break;
			case 22 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:211: BEFORE
				{
				mBEFORE(); 

				}
				break;
			case 23 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:218: DATABASES
				{
				mDATABASES(); 

				}
				break;
			case 24 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:228: DELETE
				{
				mDELETE(); 

				}
				break;
			case 25 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:235: FROM
				{
				mFROM(); 

				}
				break;
			case 26 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:240: IF
				{
				mIF(); 

				}
				break;
			case 27 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:243: IN
				{
				mIN(); 

				}
				break;
			case 28 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:246: INTO
				{
				mINTO(); 

				}
				break;
			case 29 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:251: INSERT
				{
				mINSERT(); 

				}
				break;
			case 30 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:258: LIKE
				{
				mLIKE(); 

				}
				break;
			case 31 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:263: SELECT
				{
				mSELECT(); 

				}
				break;
			case 32 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:270: SHOW
				{
				mSHOW(); 

				}
				break;
			case 33 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:275: TABLES
				{
				mTABLES(); 

				}
				break;
			case 34 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:282: UPDATE
				{
				mUPDATE(); 

				}
				break;
			case 35 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:289: USE
				{
				mUSE(); 

				}
				break;
			case 36 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:293: VALUES
				{
				mVALUES(); 

				}
				break;
			case 37 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:300: WHERE
				{
				mWHERE(); 

				}
				break;
			case 38 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:306: INTEGER_NUMBER
				{
				mINTEGER_NUMBER(); 

				}
				break;
			case 39 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:321: ID
				{
				mID(); 

				}
				break;
			case 40 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:324: REAL_NUMBER
				{
				mREAL_NUMBER(); 

				}
				break;
			case 41 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:336: TEXT_STRING
				{
				mTEXT_STRING(); 

				}
				break;
			case 42 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:348: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 43 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:356: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA23 dfa23 = new DFA23(this);
	protected DFA31 dfa31 = new DFA31(this);
	static final String DFA23_eotS =
		"\1\uffff\1\3\2\uffff\1\5\2\uffff";
	static final String DFA23_eofS =
		"\7\uffff";
	static final String DFA23_minS =
		"\2\56\2\uffff\1\60\2\uffff";
	static final String DFA23_maxS =
		"\2\71\2\uffff\1\71\2\uffff";
	static final String DFA23_acceptS =
		"\2\uffff\1\3\1\4\1\uffff\1\2\1\1";
	static final String DFA23_specialS =
		"\7\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\4\1\uffff\12\1",
			"",
			"",
			"\12\6",
			"",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "136:9: ( INTEGER_NUMBER DOT INTEGER_NUMBER | INTEGER_NUMBER DOT | DOT INTEGER_NUMBER | INTEGER_NUMBER )";
		}
	}

	static final String DFA31_eotS =
		"\4\uffff\1\54\1\uffff\1\57\1\uffff\1\61\4\uffff\1\62\2\uffff\1\63\26\50"+
		"\1\126\14\uffff\2\50\1\131\2\50\1\131\10\50\1\144\1\147\1\144\1\147\20"+
		"\50\1\uffff\2\50\1\uffff\12\50\1\uffff\2\50\1\uffff\13\50\1\u0093\1\50"+
		"\1\u0093\16\50\2\u00a3\1\u00a4\1\50\1\u00a4\1\50\2\u00a7\1\50\1\u00a9"+
		"\1\50\1\u00a9\3\50\1\uffff\5\50\1\u00b3\1\u00b4\1\u00b3\1\u00b4\6\50\2"+
		"\uffff\2\50\1\uffff\1\50\1\uffff\7\50\2\u00c5\2\uffff\2\u00c6\1\50\1\u00c8"+
		"\1\50\1\u00c8\2\u00ca\2\u00cb\2\u00cc\2\u00cd\2\u00ce\2\uffff\1\50\1\uffff"+
		"\1\50\5\uffff\2\50\2\u00d3\1\uffff";
	static final String DFA31_eofS =
		"\u00d4\uffff";
	static final String DFA31_minS =
		"\1\11\3\uffff\1\60\1\uffff\1\75\1\uffff\1\75\4\uffff\1\0\2\uffff\1\44"+
		"\1\146\1\106\1\145\1\105\1\141\1\101\1\162\1\122\1\146\1\106\1\151\1\111"+
		"\1\145\1\105\1\141\1\101\1\160\1\120\1\141\1\101\1\150\1\110\1\56\14\uffff"+
		"\1\145\1\164\1\44\1\105\1\124\1\44\1\146\1\106\1\164\1\154\1\124\1\114"+
		"\1\157\1\117\4\44\1\153\1\113\1\154\1\157\1\114\1\117\1\142\1\102\1\144"+
		"\1\145\1\104\1\105\1\154\1\114\1\145\1\105\1\uffff\1\162\1\145\1\uffff"+
		"\1\122\1\105\1\157\1\117\1\141\1\145\1\101\1\105\1\155\1\115\1\uffff\1"+
		"\157\1\145\1\uffff\1\117\1\105\1\145\1\105\1\145\1\167\1\105\1\127\1\154"+
		"\1\114\1\141\1\44\1\101\1\44\1\165\1\125\1\162\1\122\1\164\1\162\1\124"+
		"\1\122\1\162\1\122\1\142\1\164\1\102\1\124\3\44\1\162\1\44\1\122\2\44"+
		"\1\143\1\44\1\103\1\44\1\145\1\105\1\164\1\uffff\1\124\1\145\1\105\1\145"+
		"\1\105\4\44\1\145\1\105\1\141\1\145\1\101\1\105\2\uffff\1\164\1\124\1"+
		"\uffff\1\164\1\uffff\1\124\1\163\1\123\1\145\1\105\1\163\1\123\2\44\2"+
		"\uffff\2\44\1\163\1\44\1\123\13\44\2\uffff\1\145\1\uffff\1\105\5\uffff"+
		"\1\163\1\123\2\44\1\uffff";
	static final String DFA31_maxS =
		"\1\176\3\uffff\1\71\1\uffff\1\75\1\uffff\1\76\4\uffff\1\uffff\2\uffff"+
		"\1\172\1\163\1\123\1\145\1\105\1\145\1\105\1\162\1\122\1\156\1\116\1\151"+
		"\1\111\1\150\1\110\1\141\1\101\1\163\1\123\1\141\1\101\1\150\1\110\1\145"+
		"\14\uffff\1\145\1\164\1\172\1\105\1\124\1\172\1\146\1\106\1\164\1\154"+
		"\1\124\1\114\1\157\1\117\4\172\1\153\1\113\1\154\1\157\1\114\1\117\1\142"+
		"\1\102\1\144\1\145\1\104\1\105\1\154\1\114\1\145\1\105\1\uffff\1\162\1"+
		"\145\1\uffff\1\122\1\105\1\157\1\117\1\141\1\145\1\101\1\105\1\155\1\115"+
		"\1\uffff\1\157\1\145\1\uffff\1\117\1\105\1\145\1\105\1\145\1\167\1\105"+
		"\1\127\1\154\1\114\1\141\1\172\1\101\1\172\1\165\1\125\1\162\1\122\1\164"+
		"\1\162\1\124\1\122\1\162\1\122\1\142\1\164\1\102\1\124\3\172\1\162\1\172"+
		"\1\122\2\172\1\143\1\172\1\103\1\172\1\145\1\105\1\164\1\uffff\1\124\1"+
		"\145\1\105\1\145\1\105\4\172\1\145\1\105\1\141\1\145\1\101\1\105\2\uffff"+
		"\1\164\1\124\1\uffff\1\164\1\uffff\1\124\1\163\1\123\1\145\1\105\1\163"+
		"\1\123\2\172\2\uffff\2\172\1\163\1\172\1\123\13\172\2\uffff\1\145\1\uffff"+
		"\1\105\5\uffff\1\163\1\123\2\172\1\uffff";
	static final String DFA31_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\uffff\1\10\1\uffff\1\13\1\14\1\15\1"+
		"\16\1\uffff\1\20\1\21\30\uffff\1\47\1\51\1\52\1\53\1\4\1\50\1\7\1\6\1"+
		"\12\1\11\1\17\1\22\42\uffff\1\46\2\uffff\1\25\12\uffff\1\32\2\uffff\1"+
		"\33\53\uffff\1\43\17\uffff\1\31\1\34\2\uffff\1\36\1\uffff\1\40\11\uffff"+
		"\1\23\1\24\20\uffff\1\45\1\26\1\uffff\1\30\1\uffff\1\35\1\37\1\41\1\42"+
		"\1\44\4\uffff\1\27";
	static final String DFA31_specialS =
		"\15\uffff\1\0\u00c6\uffff}>";
	static final String[] DFA31_transitionS = {
			"\1\53\1\52\2\uffff\1\52\22\uffff\1\53\1\12\1\51\1\uffff\1\50\2\uffff"+
			"\1\15\1\7\1\16\1\1\1\13\1\2\1\11\1\4\1\uffff\12\47\1\3\1\17\1\10\1\5"+
			"\1\6\1\14\1\uffff\1\22\1\24\1\50\1\26\1\50\1\30\2\50\1\32\2\50\1\34\6"+
			"\50\1\36\1\40\1\42\1\44\1\46\3\50\3\uffff\1\12\1\20\1\uffff\1\21\1\23"+
			"\1\50\1\25\1\50\1\27\2\50\1\31\2\50\1\33\6\50\1\35\1\37\1\41\1\43\1\45"+
			"\3\50\3\uffff\1\12",
			"",
			"",
			"",
			"\12\55",
			"",
			"\1\56",
			"",
			"\1\60\1\12",
			"",
			"",
			"",
			"",
			"\0\51",
			"",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\65\5\uffff\1\64\6\uffff\1\66",
			"\1\70\5\uffff\1\67\6\uffff\1\71",
			"\1\72",
			"\1\73",
			"\1\74\3\uffff\1\75",
			"\1\76\3\uffff\1\77",
			"\1\100",
			"\1\101",
			"\1\102\7\uffff\1\103",
			"\1\104\7\uffff\1\105",
			"\1\106",
			"\1\107",
			"\1\110\2\uffff\1\111",
			"\1\112\2\uffff\1\113",
			"\1\114",
			"\1\115",
			"\1\116\2\uffff\1\117",
			"\1\120\2\uffff\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\55\1\uffff\12\47\13\uffff\1\55\37\uffff\1\55",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\127",
			"\1\130",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\132",
			"\1\133",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\146"+
			"\1\145\6\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\22\50\1\151\1\150\6\50\4\uffff\1\50\1\uffff"+
			"\32\50",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"",
			"\1\172",
			"\1\173",
			"",
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
			"",
			"\1\u0086",
			"\1\u0087",
			"",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0094",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00a5",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00a6",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00a8",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00aa",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"",
			"",
			"\1\u00bb",
			"\1\u00bc",
			"",
			"\1\u00bd",
			"",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00c7",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00c9",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\1\u00cf",
			"",
			"\1\u00d0",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d1",
			"\1\u00d2",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			""
	};

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( ASTERISK | COMMA | COLON | DOT | EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LEFT_PARENTHESIS | LESS_THAN | LESS_THAN_EQUAL | MINUS | NOT_EQUAL | PLUS | QUESTION_MARK | QUOTE | RIGHT_PARENTHESIS | SEMICOLON | UNDERSCORE | ALERT | AFTER | AS | BEFORE | DATABASES | DELETE | FROM | IF | IN | INTO | INSERT | LIKE | SELECT | SHOW | TABLES | UPDATE | USE | VALUES | WHERE | INTEGER_NUMBER | ID | REAL_NUMBER | TEXT_STRING | NEWLINE | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA31_13 = input.LA(1);
						s = -1;
						if ( ((LA31_13 >= '\u0000' && LA31_13 <= '\uFFFF')) ) {s = 41;}
						else s = 50;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 31, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
