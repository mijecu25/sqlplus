// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlusLex.g 2016-04-23 15:49:48

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
	public static final int CROSS=11;
	public static final int DASH=12;
	public static final int DATABASES=13;
	public static final int DELETE=14;
	public static final int DOT=15;
	public static final int EQUAL=16;
	public static final int FROM=17;
	public static final int GREATER_THAN=18;
	public static final int GREATER_THAN_EQUAL=19;
	public static final int ID=20;
	public static final int IF=21;
	public static final int IN=22;
	public static final int INNER=23;
	public static final int INSERT=24;
	public static final int JOIN=25;
	public static final int LEFT=26;
	public static final int LEFT_PARENTHESIS=27;
	public static final int LESS_THAN=28;
	public static final int LESS_THAN_EQUAL=29;
	public static final int LIKE=30;
	public static final int NATURAL=31;
	public static final int NEWLINE=32;
	public static final int NOT_EQUAL=33;
	public static final int OJ=34;
	public static final int ON=35;
	public static final int OUTER=36;
	public static final int PARTITION=37;
	public static final int QUESTION_MARK=38;
	public static final int QUOTE=39;
	public static final int RIGHT=40;
	public static final int RIGHT_PARENTHESIS=41;
	public static final int SELECT=42;
	public static final int SEMICOLON=43;
	public static final int SHOW=44;
	public static final int STRAIGHT_JOIN=45;
	public static final int TODO=46;
	public static final int UNDERSCORE=47;
	public static final int UPDATE=48;
	public static final int USING=49;
	public static final int WHERE=50;
	public static final int WS=51;

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

	// $ANTLR start "TODO"
	public final void mTODO() throws RecognitionException {
		try {
			int _type = TODO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:8:6: ( 'TODO' )
			// src/main/sqlplus/parser/SQLPlusLex.g:8:8: 'TODO'
			{
			match("TODO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TODO"

	// $ANTLR start "ASTERISK"
	public final void mASTERISK() throws RecognitionException {
		try {
			int _type = ASTERISK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:10:10: ( '*' )
			// src/main/sqlplus/parser/SQLPlusLex.g:10:12: '*'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:11:7: ( ',' )
			// src/main/sqlplus/parser/SQLPlusLex.g:11:9: ','
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
			// src/main/sqlplus/parser/SQLPlusLex.g:12:7: ( ':' )
			// src/main/sqlplus/parser/SQLPlusLex.g:12:9: ':'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:13:6: ( '-' )
			// src/main/sqlplus/parser/SQLPlusLex.g:13:8: '-'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:14:5: ( '.' )
			// src/main/sqlplus/parser/SQLPlusLex.g:14:7: '.'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:15:7: ( '=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:15:9: '='
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
			// src/main/sqlplus/parser/SQLPlusLex.g:16:14: ( '>' )
			// src/main/sqlplus/parser/SQLPlusLex.g:16:16: '>'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:17:19: ( '>=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:17:21: '>='
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
			// src/main/sqlplus/parser/SQLPlusLex.g:18:18: ( '(' )
			// src/main/sqlplus/parser/SQLPlusLex.g:18:20: '('
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
			// src/main/sqlplus/parser/SQLPlusLex.g:19:11: ( '<' )
			// src/main/sqlplus/parser/SQLPlusLex.g:19:13: '<'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:20:17: ( '<=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:20:19: '<='
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
			// src/main/sqlplus/parser/SQLPlusLex.g:22:2: ( '<>' | '!=' | '~=' | '^=' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:22:4: '<>'
					{
					match("<>"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:23:5: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlusLex.g:24:5: '~='
					{
					match("~="); 

					}
					break;
				case 4 :
					// src/main/sqlplus/parser/SQLPlusLex.g:25:5: '^='
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
			// src/main/sqlplus/parser/SQLPlusLex.g:27:15: ( '?' )
			// src/main/sqlplus/parser/SQLPlusLex.g:27:17: '?'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:28:7: ( '\\'' )
			// src/main/sqlplus/parser/SQLPlusLex.g:28:9: '\\''
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
			// src/main/sqlplus/parser/SQLPlusLex.g:29:19: ( ')' )
			// src/main/sqlplus/parser/SQLPlusLex.g:29:21: ')'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:30:11: ( ';' )
			// src/main/sqlplus/parser/SQLPlusLex.g:30:13: ';'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:31:12: ( '_' )
			// src/main/sqlplus/parser/SQLPlusLex.g:31:13: '_'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:35:2: ( 'alert' | 'ALERT' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:35:4: 'alert'
					{
					match("alert"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:36:4: 'ALERT'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:40:2: ( 'after' | 'AFTER' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:40:4: 'after'
					{
					match("after"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:41:4: 'AFTER'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:45:2: ( 'as' | 'AS' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:45:5: 'as'
					{
					match("as"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:46:4: 'AS'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:50:2: ( 'before' | 'BEFORE' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:50:4: 'before'
					{
					match("before"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:51:4: 'BEFORE'
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

	// $ANTLR start "CROSS"
	public final void mCROSS() throws RecognitionException {
		try {
			int _type = CROSS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:55:2: ( 'cross' | 'CROSS' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='c') ) {
				alt6=1;
			}
			else if ( (LA6_0=='C') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:55:4: 'cross'
					{
					match("cross"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:56:4: 'CROSS'
					{
					match("CROSS"); 

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
	// $ANTLR end "CROSS"

	// $ANTLR start "DELETE"
	public final void mDELETE() throws RecognitionException {
		try {
			int _type = DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:60:2: ( 'delete' | 'DELETE' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:60:4: 'delete'
					{
					match("delete"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:61:4: 'DELETE'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:65:2: ( 'from' | 'FROM' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:65:4: 'from'
					{
					match("from"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:66:4: 'FROM'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:70:2: ( 'if' | 'IF' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:70:4: 'if'
					{
					match("if"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:71:4: 'IF'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:75:2: ( 'in' | 'IN' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:75:4: 'in'
					{
					match("in"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:76:4: 'IN'
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

	// $ANTLR start "INNER"
	public final void mINNER() throws RecognitionException {
		try {
			int _type = INNER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:80:2: ( 'inner' | 'INNER' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:80:4: 'inner'
					{
					match("inner"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:81:4: 'INNER'
					{
					match("INNER"); 

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
	// $ANTLR end "INNER"

	// $ANTLR start "INSERT"
	public final void mINSERT() throws RecognitionException {
		try {
			int _type = INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:85:2: ( 'insert' | 'INSERT' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:85:5: 'insert'
					{
					match("insert"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:86:4: 'INSERT'
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

	// $ANTLR start "JOIN"
	public final void mJOIN() throws RecognitionException {
		try {
			int _type = JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:90:2: ( 'join' | 'JOIN' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='j') ) {
				alt13=1;
			}
			else if ( (LA13_0=='J') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:90:4: 'join'
					{
					match("join"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:91:4: 'JOIN'
					{
					match("JOIN"); 

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
	// $ANTLR end "JOIN"

	// $ANTLR start "LEFT"
	public final void mLEFT() throws RecognitionException {
		try {
			int _type = LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:95:2: ( 'left' | 'LEFT' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='l') ) {
				alt14=1;
			}
			else if ( (LA14_0=='L') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:95:4: 'left'
					{
					match("left"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:96:4: 'LEFT'
					{
					match("LEFT"); 

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
	// $ANTLR end "LEFT"

	// $ANTLR start "LIKE"
	public final void mLIKE() throws RecognitionException {
		try {
			int _type = LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:100:2: ( 'like' | 'LIKE' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='l') ) {
				alt15=1;
			}
			else if ( (LA15_0=='L') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:100:4: 'like'
					{
					match("like"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:101:4: 'LIKE'
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

	// $ANTLR start "NATURAL"
	public final void mNATURAL() throws RecognitionException {
		try {
			int _type = NATURAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:105:2: ( 'natural' | 'NATURAL' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='n') ) {
				alt16=1;
			}
			else if ( (LA16_0=='N') ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:105:4: 'natural'
					{
					match("natural"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:106:4: 'NATURAL'
					{
					match("NATURAL"); 

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
	// $ANTLR end "NATURAL"

	// $ANTLR start "OJ"
	public final void mOJ() throws RecognitionException {
		try {
			int _type = OJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:110:2: ( 'oj' | 'OJ' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='o') ) {
				alt17=1;
			}
			else if ( (LA17_0=='O') ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:110:4: 'oj'
					{
					match("oj"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:111:4: 'OJ'
					{
					match("OJ"); 

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
	// $ANTLR end "OJ"

	// $ANTLR start "ON"
	public final void mON() throws RecognitionException {
		try {
			int _type = ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:115:2: ( 'on' | 'ON' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='o') ) {
				alt18=1;
			}
			else if ( (LA18_0=='O') ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:115:4: 'on'
					{
					match("on"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:116:4: 'ON'
					{
					match("ON"); 

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
	// $ANTLR end "ON"

	// $ANTLR start "OUTER"
	public final void mOUTER() throws RecognitionException {
		try {
			int _type = OUTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:120:2: ( 'outer' | 'OUTER' )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='o') ) {
				alt19=1;
			}
			else if ( (LA19_0=='O') ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:120:4: 'outer'
					{
					match("outer"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:121:4: 'OUTER'
					{
					match("OUTER"); 

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
	// $ANTLR end "OUTER"

	// $ANTLR start "PARTITION"
	public final void mPARTITION() throws RecognitionException {
		try {
			int _type = PARTITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:125:2: ( 'partition' | 'PARTITION' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='p') ) {
				alt20=1;
			}
			else if ( (LA20_0=='P') ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:125:4: 'partition'
					{
					match("partition"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:126:4: 'PARTITION'
					{
					match("PARTITION"); 

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
	// $ANTLR end "PARTITION"

	// $ANTLR start "RIGHT"
	public final void mRIGHT() throws RecognitionException {
		try {
			int _type = RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:130:2: ( 'right' | 'RIGHT' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='r') ) {
				alt21=1;
			}
			else if ( (LA21_0=='R') ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:130:4: 'right'
					{
					match("right"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:131:4: 'RIGHT'
					{
					match("RIGHT"); 

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
	// $ANTLR end "RIGHT"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:135:2: ( 'select' | 'SELECT' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='s') ) {
				alt22=1;
			}
			else if ( (LA22_0=='S') ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:135:4: 'select'
					{
					match("select"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:136:4: 'SELECT'
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

	// $ANTLR start "STRAIGHT_JOIN"
	public final void mSTRAIGHT_JOIN() throws RecognitionException {
		try {
			int _type = STRAIGHT_JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:140:2: ( 'straight_join' | 'STRAIGHT_JOIN' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='s') ) {
				alt23=1;
			}
			else if ( (LA23_0=='S') ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:140:4: 'straight_join'
					{
					match("straight_join"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:141:4: 'STRAIGHT_JOIN'
					{
					match("STRAIGHT_JOIN"); 

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
	// $ANTLR end "STRAIGHT_JOIN"

	// $ANTLR start "UPDATE"
	public final void mUPDATE() throws RecognitionException {
		try {
			int _type = UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:145:2: ( 'update' | 'UPDATE' )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0=='u') ) {
				alt24=1;
			}
			else if ( (LA24_0=='U') ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:145:5: 'update'
					{
					match("update"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:146:4: 'UPDATE'
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

	// $ANTLR start "USING"
	public final void mUSING() throws RecognitionException {
		try {
			int _type = USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:150:2: ( 'using' | 'USING' )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0=='u') ) {
				alt25=1;
			}
			else if ( (LA25_0=='U') ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:150:4: 'using'
					{
					match("using"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:151:4: 'USING'
					{
					match("USING"); 

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
	// $ANTLR end "USING"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:155:2: ( 'where' | 'WHERE' )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0=='w') ) {
				alt26=1;
			}
			else if ( (LA26_0=='W') ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:155:5: 'where'
					{
					match("where"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:156:4: 'WHERE'
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

	// $ANTLR start "SHOW"
	public final void mSHOW() throws RecognitionException {
		try {
			int _type = SHOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:160:2: ( 'show' | 'SHOW' )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='s') ) {
				alt27=1;
			}
			else if ( (LA27_0=='S') ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:160:4: 'show'
					{
					match("show"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:161:4: 'SHOW'
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

	// $ANTLR start "DATABASES"
	public final void mDATABASES() throws RecognitionException {
		try {
			int _type = DATABASES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:165:2: ( 'databases' | 'DATABASES' )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0=='d') ) {
				alt28=1;
			}
			else if ( (LA28_0=='D') ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:165:4: 'databases'
					{
					match("databases"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:166:4: 'DATABASES'
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:170:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )* )
			// src/main/sqlplus/parser/SQLPlusLex.g:170:4: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )*
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// src/main/sqlplus/parser/SQLPlusLex.g:170:39: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0=='$'||(LA29_0 >= '0' && LA29_0 <= '9')||(LA29_0 >= 'A' && LA29_0 <= 'Z')||LA29_0=='_'||(LA29_0 >= 'a' && LA29_0 <= 'z')) ) {
					alt29=1;
				}

				switch (alt29) {
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
					break loop29;
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
			// src/main/sqlplus/parser/SQLPlusLex.g:175:2: ( ( '\\r' )? '\\n' )
			// src/main/sqlplus/parser/SQLPlusLex.g:175:5: ( '\\r' )? '\\n'
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:175:5: ( '\\r' )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0=='\r') ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:175:5: '\\r'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:180:2: ( ( ' ' | '\\t' )+ )
			// src/main/sqlplus/parser/SQLPlusLex.g:180:5: ( ' ' | '\\t' )+
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:180:5: ( ' ' | '\\t' )+
			int cnt31=0;
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0=='\t'||LA31_0==' ') ) {
					alt31=1;
				}

				switch (alt31) {
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
					if ( cnt31 >= 1 ) break loop31;
					EarlyExitException eee = new EarlyExitException(31, input);
					throw eee;
				}
				cnt31++;
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
		// src/main/sqlplus/parser/SQLPlusLex.g:1:8: ( TODO | ASTERISK | COMMA | COLON | DASH | DOT | EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LEFT_PARENTHESIS | LESS_THAN | LESS_THAN_EQUAL | NOT_EQUAL | QUESTION_MARK | QUOTE | RIGHT_PARENTHESIS | SEMICOLON | UNDERSCORE | ALERT | AFTER | AS | BEFORE | CROSS | DELETE | FROM | IF | IN | INNER | INSERT | JOIN | LEFT | LIKE | NATURAL | OJ | ON | OUTER | PARTITION | RIGHT | SELECT | STRAIGHT_JOIN | UPDATE | USING | WHERE | SHOW | DATABASES | ID | NEWLINE | WS )
		int alt32=48;
		alt32 = dfa32.predict(input);
		switch (alt32) {
			case 1 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:10: TODO
				{
				mTODO(); 

				}
				break;
			case 2 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:15: ASTERISK
				{
				mASTERISK(); 

				}
				break;
			case 3 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:24: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 4 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:30: COLON
				{
				mCOLON(); 

				}
				break;
			case 5 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:36: DASH
				{
				mDASH(); 

				}
				break;
			case 6 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:41: DOT
				{
				mDOT(); 

				}
				break;
			case 7 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:45: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 8 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:51: GREATER_THAN
				{
				mGREATER_THAN(); 

				}
				break;
			case 9 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:64: GREATER_THAN_EQUAL
				{
				mGREATER_THAN_EQUAL(); 

				}
				break;
			case 10 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:83: LEFT_PARENTHESIS
				{
				mLEFT_PARENTHESIS(); 

				}
				break;
			case 11 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:100: LESS_THAN
				{
				mLESS_THAN(); 

				}
				break;
			case 12 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:110: LESS_THAN_EQUAL
				{
				mLESS_THAN_EQUAL(); 

				}
				break;
			case 13 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:126: NOT_EQUAL
				{
				mNOT_EQUAL(); 

				}
				break;
			case 14 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:136: QUESTION_MARK
				{
				mQUESTION_MARK(); 

				}
				break;
			case 15 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:150: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 16 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:156: RIGHT_PARENTHESIS
				{
				mRIGHT_PARENTHESIS(); 

				}
				break;
			case 17 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:174: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 18 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:184: UNDERSCORE
				{
				mUNDERSCORE(); 

				}
				break;
			case 19 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:195: ALERT
				{
				mALERT(); 

				}
				break;
			case 20 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:201: AFTER
				{
				mAFTER(); 

				}
				break;
			case 21 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:207: AS
				{
				mAS(); 

				}
				break;
			case 22 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:210: BEFORE
				{
				mBEFORE(); 

				}
				break;
			case 23 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:217: CROSS
				{
				mCROSS(); 

				}
				break;
			case 24 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:223: DELETE
				{
				mDELETE(); 

				}
				break;
			case 25 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:230: FROM
				{
				mFROM(); 

				}
				break;
			case 26 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:235: IF
				{
				mIF(); 

				}
				break;
			case 27 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:238: IN
				{
				mIN(); 

				}
				break;
			case 28 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:241: INNER
				{
				mINNER(); 

				}
				break;
			case 29 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:247: INSERT
				{
				mINSERT(); 

				}
				break;
			case 30 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:254: JOIN
				{
				mJOIN(); 

				}
				break;
			case 31 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:259: LEFT
				{
				mLEFT(); 

				}
				break;
			case 32 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:264: LIKE
				{
				mLIKE(); 

				}
				break;
			case 33 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:269: NATURAL
				{
				mNATURAL(); 

				}
				break;
			case 34 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:277: OJ
				{
				mOJ(); 

				}
				break;
			case 35 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:280: ON
				{
				mON(); 

				}
				break;
			case 36 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:283: OUTER
				{
				mOUTER(); 

				}
				break;
			case 37 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:289: PARTITION
				{
				mPARTITION(); 

				}
				break;
			case 38 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:299: RIGHT
				{
				mRIGHT(); 

				}
				break;
			case 39 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:305: SELECT
				{
				mSELECT(); 

				}
				break;
			case 40 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:312: STRAIGHT_JOIN
				{
				mSTRAIGHT_JOIN(); 

				}
				break;
			case 41 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:326: UPDATE
				{
				mUPDATE(); 

				}
				break;
			case 42 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:333: USING
				{
				mUSING(); 

				}
				break;
			case 43 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:339: WHERE
				{
				mWHERE(); 

				}
				break;
			case 44 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:345: SHOW
				{
				mSHOW(); 

				}
				break;
			case 45 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:350: DATABASES
				{
				mDATABASES(); 

				}
				break;
			case 46 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:360: ID
				{
				mID(); 

				}
				break;
			case 47 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:363: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 48 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:371: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA32 dfa32 = new DFA32(this);
	static final String DFA32_eotS =
		"\1\uffff\1\57\6\uffff\1\64\1\uffff\1\66\5\uffff\1\67\36\57\3\uffff\1\57"+
		"\5\uffff\2\57\1\155\2\57\1\155\12\57\1\172\1\175\1\172\1\175\10\57\1\u0088"+
		"\1\u0089\1\57\1\u0088\1\u0089\24\57\1\uffff\14\57\1\uffff\2\57\1\uffff"+
		"\12\57\2\uffff\22\57\1\u00c9\14\57\2\u00d6\4\57\2\u00db\1\u00dc\1\u00dd"+
		"\1\u00dc\1\u00dd\12\57\1\u00e8\2\57\1\u00e8\6\57\1\uffff\1\u00f1\1\u00f2"+
		"\1\u00f1\1\u00f2\2\57\2\u00f5\4\57\1\uffff\1\u00fa\1\57\1\u00fa\1\57\3"+
		"\uffff\2\57\2\u00ff\2\57\2\u0102\2\57\1\uffff\3\57\1\u0108\1\57\1\u0108"+
		"\2\u010a\2\uffff\2\u010b\1\uffff\1\u010c\1\57\1\u010c\1\57\1\uffff\2\u010f"+
		"\2\57\1\uffff\2\57\1\uffff\1\u0114\1\57\1\u0114\1\57\1\u0117\1\uffff\1"+
		"\u0117\3\uffff\2\57\1\uffff\2\u011a\2\57\1\uffff\2\57\1\uffff\2\57\1\uffff"+
		"\4\57\2\u0125\2\u0126\2\57\2\uffff\6\57\2\u012f\1\uffff";
	static final String DFA32_eofS =
		"\u0130\uffff";
	static final String DFA32_minS =
		"\1\11\1\117\6\uffff\1\75\1\uffff\1\75\5\uffff\1\44\1\146\1\106\1\145\1"+
		"\105\1\162\1\122\1\141\1\101\1\162\1\122\1\146\1\106\1\157\1\117\1\145"+
		"\1\105\1\141\1\101\1\152\1\112\1\141\1\101\1\151\1\111\1\145\1\105\1\160"+
		"\1\120\1\150\1\110\3\uffff\1\104\5\uffff\1\145\1\164\1\44\1\105\1\124"+
		"\1\44\1\146\1\106\1\157\1\117\1\154\1\164\1\114\1\124\1\157\1\117\4\44"+
		"\1\151\1\111\1\146\1\153\1\106\1\113\1\164\1\124\2\44\1\164\2\44\1\124"+
		"\1\162\1\122\1\147\1\107\1\154\1\162\1\157\1\114\1\122\1\117\1\144\1\151"+
		"\1\104\1\111\1\145\1\105\1\117\1\162\1\145\1\uffff\1\122\1\105\1\157\1"+
		"\117\1\163\1\123\1\145\1\141\1\105\1\101\1\155\1\115\1\uffff\2\145\1\uffff"+
		"\2\105\1\156\1\116\1\164\1\145\1\124\1\105\1\165\1\125\2\uffff\1\145\1"+
		"\105\1\164\1\124\1\150\1\110\1\145\1\141\1\167\1\105\1\101\1\127\1\141"+
		"\1\156\1\101\1\116\1\162\1\122\1\44\1\164\1\162\1\124\1\122\1\162\1\122"+
		"\1\163\1\123\1\164\1\142\1\124\1\102\2\44\2\162\2\122\6\44\1\162\1\122"+
		"\1\162\1\122\1\151\1\111\1\164\1\124\1\143\1\151\1\44\1\103\1\111\1\44"+
		"\1\164\1\147\1\124\1\107\1\145\1\105\1\uffff\4\44\1\145\1\105\2\44\1\145"+
		"\1\141\1\105\1\101\1\uffff\1\44\1\164\1\44\1\124\3\uffff\1\141\1\101\2"+
		"\44\1\164\1\124\2\44\1\164\1\147\1\uffff\1\124\1\107\1\145\1\44\1\105"+
		"\3\44\2\uffff\2\44\1\uffff\1\44\1\163\1\44\1\123\1\uffff\2\44\1\154\1"+
		"\114\1\uffff\1\151\1\111\1\uffff\1\44\1\150\1\44\1\110\1\44\1\uffff\1"+
		"\44\3\uffff\1\145\1\105\1\uffff\2\44\1\157\1\117\1\uffff\1\164\1\124\1"+
		"\uffff\1\163\1\123\1\uffff\1\156\1\116\2\137\4\44\1\152\1\112\2\uffff"+
		"\1\157\1\117\1\151\1\111\1\156\1\116\2\44\1\uffff";
	static final String DFA32_maxS =
		"\1\176\1\117\6\uffff\1\75\1\uffff\1\76\5\uffff\1\172\1\163\1\123\1\145"+
		"\1\105\1\162\1\122\1\145\1\105\1\162\1\122\1\156\1\116\1\157\1\117\1\151"+
		"\1\111\1\141\1\101\1\165\1\125\1\141\1\101\1\151\1\111\1\164\1\124\1\163"+
		"\1\123\1\150\1\110\3\uffff\1\104\5\uffff\1\145\1\164\1\172\1\105\1\124"+
		"\1\172\1\146\1\106\1\157\1\117\1\154\1\164\1\114\1\124\1\157\1\117\4\172"+
		"\1\151\1\111\1\146\1\153\1\106\1\113\1\164\1\124\2\172\1\164\2\172\1\124"+
		"\1\162\1\122\1\147\1\107\1\154\1\162\1\157\1\114\1\122\1\117\1\144\1\151"+
		"\1\104\1\111\1\145\1\105\1\117\1\162\1\145\1\uffff\1\122\1\105\1\157\1"+
		"\117\1\163\1\123\1\145\1\141\1\105\1\101\1\155\1\115\1\uffff\2\145\1\uffff"+
		"\2\105\1\156\1\116\1\164\1\145\1\124\1\105\1\165\1\125\2\uffff\1\145\1"+
		"\105\1\164\1\124\1\150\1\110\1\145\1\141\1\167\1\105\1\101\1\127\1\141"+
		"\1\156\1\101\1\116\1\162\1\122\1\172\1\164\1\162\1\124\1\122\1\162\1\122"+
		"\1\163\1\123\1\164\1\142\1\124\1\102\2\172\2\162\2\122\6\172\1\162\1\122"+
		"\1\162\1\122\1\151\1\111\1\164\1\124\1\143\1\151\1\172\1\103\1\111\1\172"+
		"\1\164\1\147\1\124\1\107\1\145\1\105\1\uffff\4\172\1\145\1\105\2\172\1"+
		"\145\1\141\1\105\1\101\1\uffff\1\172\1\164\1\172\1\124\3\uffff\1\141\1"+
		"\101\2\172\1\164\1\124\2\172\1\164\1\147\1\uffff\1\124\1\107\1\145\1\172"+
		"\1\105\3\172\2\uffff\2\172\1\uffff\1\172\1\163\1\172\1\123\1\uffff\2\172"+
		"\1\154\1\114\1\uffff\1\151\1\111\1\uffff\1\172\1\150\1\172\1\110\1\172"+
		"\1\uffff\1\172\3\uffff\1\145\1\105\1\uffff\2\172\1\157\1\117\1\uffff\1"+
		"\164\1\124\1\uffff\1\163\1\123\1\uffff\1\156\1\116\2\137\4\172\1\152\1"+
		"\112\2\uffff\1\157\1\117\1\151\1\111\1\156\1\116\2\172\1\uffff";
	static final String DFA32_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\uffff\1\15\1\16\1\17\1"+
		"\20\1\21\37\uffff\1\56\1\57\1\60\1\uffff\1\11\1\10\1\14\1\13\1\22\65\uffff"+
		"\1\25\14\uffff\1\32\2\uffff\1\33\12\uffff\1\42\1\43\77\uffff\1\1\14\uffff"+
		"\1\31\4\uffff\1\36\1\37\1\40\12\uffff\1\54\10\uffff\1\23\1\24\2\uffff"+
		"\1\27\4\uffff\1\34\4\uffff\1\44\2\uffff\1\46\5\uffff\1\52\1\uffff\1\53"+
		"\1\26\1\30\2\uffff\1\35\4\uffff\1\47\2\uffff\1\51\2\uffff\1\41\12\uffff"+
		"\1\55\1\45\10\uffff\1\50";
	static final String DFA32_specialS =
		"\u0130\uffff}>";
	static final String[] DFA32_transitionS = {
			"\1\61\1\60\2\uffff\1\60\22\uffff\1\61\1\13\2\uffff\1\57\2\uffff\1\15"+
			"\1\11\1\16\1\2\1\uffff\1\3\1\5\1\6\13\uffff\1\4\1\17\1\12\1\7\1\10\1"+
			"\14\1\uffff\1\22\1\24\1\26\1\30\1\57\1\32\2\57\1\34\1\36\1\57\1\40\1"+
			"\57\1\42\1\44\1\46\1\57\1\50\1\52\1\1\1\54\1\57\1\56\3\57\3\uffff\1\13"+
			"\1\20\1\uffff\1\21\1\23\1\25\1\27\1\57\1\31\2\57\1\33\1\35\1\57\1\37"+
			"\1\57\1\41\1\43\1\45\1\57\1\47\1\51\1\57\1\53\1\57\1\55\3\57\3\uffff"+
			"\1\13",
			"\1\62",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\63",
			"",
			"\1\65\1\13",
			"",
			"",
			"",
			"",
			"",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\71\5\uffff\1\70\6\uffff\1\72",
			"\1\74\5\uffff\1\73\6\uffff\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\103\3\uffff\1\102",
			"\1\105\3\uffff\1\104",
			"\1\106",
			"\1\107",
			"\1\110\7\uffff\1\111",
			"\1\112\7\uffff\1\113",
			"\1\114",
			"\1\115",
			"\1\116\3\uffff\1\117",
			"\1\120\3\uffff\1\121",
			"\1\122",
			"\1\123",
			"\1\124\3\uffff\1\125\6\uffff\1\126",
			"\1\127\3\uffff\1\130\6\uffff\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136\2\uffff\1\140\13\uffff\1\137",
			"\1\141\2\uffff\1\143\13\uffff\1\142",
			"\1\144\2\uffff\1\145",
			"\1\146\2\uffff\1\147",
			"\1\150",
			"\1\151",
			"",
			"",
			"",
			"\1\152",
			"",
			"",
			"",
			"",
			"",
			"\1\153",
			"\1\154",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\156",
			"\1\157",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
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
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\173"+
			"\4\57\1\174\7\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\15\57\1\176\4\57\1\177\7\57\4\uffff\1\57"+
			"\1\uffff\32\57",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u008a",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
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
			"",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"",
			"\1\u00ab",
			"\1\u00ac",
			"",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"",
			"",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u00e9",
			"\1\u00ea",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u00f3",
			"\1\u00f4",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u00fb",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u00fc",
			"",
			"",
			"",
			"\1\u00fd",
			"\1\u00fe",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0100",
			"\1\u0101",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0103",
			"\1\u0104",
			"",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0109",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"",
			"",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u010d",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u010e",
			"",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0110",
			"\1\u0111",
			"",
			"\1\u0112",
			"\1\u0113",
			"",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0115",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0116",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"",
			"",
			"",
			"\1\u0118",
			"\1\u0119",
			"",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u011b",
			"\1\u011c",
			"",
			"\1\u011d",
			"\1\u011e",
			"",
			"\1\u011f",
			"\1\u0120",
			"",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0127",
			"\1\u0128",
			"",
			"",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\57\13\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			""
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	protected class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( TODO | ASTERISK | COMMA | COLON | DASH | DOT | EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LEFT_PARENTHESIS | LESS_THAN | LESS_THAN_EQUAL | NOT_EQUAL | QUESTION_MARK | QUOTE | RIGHT_PARENTHESIS | SEMICOLON | UNDERSCORE | ALERT | AFTER | AS | BEFORE | CROSS | DELETE | FROM | IF | IN | INNER | INSERT | JOIN | LEFT | LIKE | NATURAL | OJ | ON | OUTER | PARTITION | RIGHT | SELECT | STRAIGHT_JOIN | UPDATE | USING | WHERE | SHOW | DATABASES | ID | NEWLINE | WS );";
		}
	}

}
