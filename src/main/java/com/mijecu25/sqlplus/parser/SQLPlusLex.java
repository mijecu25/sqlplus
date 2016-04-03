// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlusLex.g 2016-04-03 14:01:06

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
	public static final int BEFORE=6;
	public static final int COLON=7;
	public static final int DASH=8;
	public static final int DELETE=9;
	public static final int EQUAL=10;
	public static final int GREATER_THAN=11;
	public static final int GREATER_THAN_EQUAL=12;
	public static final int ID=13;
	public static final int IF=14;
	public static final int IN=15;
	public static final int INSERT=16;
	public static final int LESS_THAN=17;
	public static final int LESS_THAN_EQUAL=18;
	public static final int LIKE=19;
	public static final int NEWLINE=20;
	public static final int NOT_EQ=21;
	public static final int QUESTION_MARK=22;
	public static final int QUOTE=23;
	public static final int SEMICOLON=24;
	public static final int UNDERSCORE=25;
	public static final int UPDATE=26;
	public static final int WHERE=27;
	public static final int WS=28;

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

	// $ANTLR start "LESS_THAN_EQUAL"
	public final void mLESS_THAN_EQUAL() throws RecognitionException {
		try {
			int _type = LESS_THAN_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:7:17: ( '<=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:7:19: '<='
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

	// $ANTLR start "GREATER_THAN_EQUAL"
	public final void mGREATER_THAN_EQUAL() throws RecognitionException {
		try {
			int _type = GREATER_THAN_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:8:19: ( '>=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:8:21: '>='
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

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			int _type = QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:11:7: ( '\\'' )
			// src/main/sqlplus/parser/SQLPlusLex.g:11:9: '\\''
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

	// $ANTLR start "LESS_THAN"
	public final void mLESS_THAN() throws RecognitionException {
		try {
			int _type = LESS_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:13:11: ( '<' )
			// src/main/sqlplus/parser/SQLPlusLex.g:13:13: '<'
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

	// $ANTLR start "GREATER_THAN"
	public final void mGREATER_THAN() throws RecognitionException {
		try {
			int _type = GREATER_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:14:14: ( '>' )
			// src/main/sqlplus/parser/SQLPlusLex.g:14:16: '>'
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

	// $ANTLR start "NOT_EQ"
	public final void mNOT_EQ() throws RecognitionException {
		try {
			int _type = NOT_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:15:8: ( '<>' | '!=' | '~=' | '^=' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:15:10: '<>'
					{
					match("<>"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:15:17: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlusLex.g:15:24: '~='
					{
					match("~="); 

					}
					break;
				case 4 :
					// src/main/sqlplus/parser/SQLPlusLex.g:15:30: '^='
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
	// $ANTLR end "NOT_EQ"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:16:11: ( ';' )
			// src/main/sqlplus/parser/SQLPlusLex.g:16:13: ';'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:17:12: ( '_' )
			// src/main/sqlplus/parser/SQLPlusLex.g:17:13: '_'
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

	// $ANTLR start "QUESTION_MARK"
	public final void mQUESTION_MARK() throws RecognitionException {
		try {
			int _type = QUESTION_MARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:18:15: ( '?' )
			// src/main/sqlplus/parser/SQLPlusLex.g:18:17: '?'
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

	// $ANTLR start "ALERT"
	public final void mALERT() throws RecognitionException {
		try {
			int _type = ALERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:21:2: ( 'alert' | 'ALERT' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:21:4: 'alert'
					{
					match("alert"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:22:4: 'ALERT'
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

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:26:2: ( 'if' | 'IF' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='i') ) {
				alt3=1;
			}
			else if ( (LA3_0=='I') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:26:4: 'if'
					{
					match("if"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:27:4: 'IF'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:31:2: ( 'in' | 'IN' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='i') ) {
				alt4=1;
			}
			else if ( (LA4_0=='I') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:31:4: 'in'
					{
					match("in"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:32:4: 'IN'
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

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:37:2: ( 'where' | 'WHERE' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='w') ) {
				alt5=1;
			}
			else if ( (LA5_0=='W') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:37:5: 'where'
					{
					match("where"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:38:4: 'WHERE'
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

	// $ANTLR start "BEFORE"
	public final void mBEFORE() throws RecognitionException {
		try {
			int _type = BEFORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:43:2: ( 'before' | 'BEFORE' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='b') ) {
				alt6=1;
			}
			else if ( (LA6_0=='B') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:43:4: 'before'
					{
					match("before"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:44:4: 'BEFORE'
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

	// $ANTLR start "AFTER"
	public final void mAFTER() throws RecognitionException {
		try {
			int _type = AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:49:2: ( 'after' | 'AFTER' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='a') ) {
				alt7=1;
			}
			else if ( (LA7_0=='A') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:49:4: 'after'
					{
					match("after"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:50:4: 'AFTER'
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

	// $ANTLR start "INSERT"
	public final void mINSERT() throws RecognitionException {
		try {
			int _type = INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:55:2: ( 'insert' | 'INSERT' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='i') ) {
				alt8=1;
			}
			else if ( (LA8_0=='I') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:55:5: 'insert'
					{
					match("insert"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:56:4: 'INSERT'
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

	// $ANTLR start "DELETE"
	public final void mDELETE() throws RecognitionException {
		try {
			int _type = DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:61:2: ( 'delete' | 'DELETE' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='d') ) {
				alt9=1;
			}
			else if ( (LA9_0=='D') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:61:4: 'delete'
					{
					match("delete"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:62:4: 'DELETE'
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

	// $ANTLR start "UPDATE"
	public final void mUPDATE() throws RecognitionException {
		try {
			int _type = UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:67:2: ( 'update' | 'UPDATE' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='u') ) {
				alt10=1;
			}
			else if ( (LA10_0=='U') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:67:5: 'update'
					{
					match("update"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:68:4: 'UPDATE'
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

	// $ANTLR start "LIKE"
	public final void mLIKE() throws RecognitionException {
		try {
			int _type = LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:72:2: ( 'like' | 'LIKE' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='l') ) {
				alt11=1;
			}
			else if ( (LA11_0=='L') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:72:4: 'like'
					{
					match("like"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:73:4: 'LIKE'
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:77:2: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | UNDERSCORE ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | UNDERSCORE | ( '0' .. '9' ) | COLON | DASH | QUOTE )* )
			// src/main/sqlplus/parser/SQLPlusLex.g:77:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | UNDERSCORE ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | UNDERSCORE | ( '0' .. '9' ) | COLON | DASH | QUOTE )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// src/main/sqlplus/parser/SQLPlusLex.g:80:3: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | UNDERSCORE | ( '0' .. '9' ) | COLON | DASH | QUOTE )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='\''||LA12_0=='-'||(LA12_0 >= '0' && LA12_0 <= ':')||(LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='_'||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:
					{
					if ( input.LA(1)=='\''||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop12;
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
			// src/main/sqlplus/parser/SQLPlusLex.g:87:2: ( ( '\\r' )? '\\n' )
			// src/main/sqlplus/parser/SQLPlusLex.g:87:5: ( '\\r' )? '\\n'
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:87:5: ( '\\r' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='\r') ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:87:5: '\\r'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:92:2: ( ( ' ' | '\\t' )+ )
			// src/main/sqlplus/parser/SQLPlusLex.g:92:5: ( ' ' | '\\t' )+
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:92:5: ( ' ' | '\\t' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\t'||LA14_0==' ') ) {
					alt14=1;
				}

				switch (alt14) {
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
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
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
		// src/main/sqlplus/parser/SQLPlusLex.g:1:8: ( LESS_THAN_EQUAL | GREATER_THAN_EQUAL | COLON | DASH | QUOTE | EQUAL | LESS_THAN | GREATER_THAN | NOT_EQ | SEMICOLON | UNDERSCORE | QUESTION_MARK | ALERT | IF | IN | WHERE | BEFORE | AFTER | INSERT | DELETE | UPDATE | LIKE | ID | NEWLINE | WS )
		int alt15=25;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:10: LESS_THAN_EQUAL
				{
				mLESS_THAN_EQUAL(); 

				}
				break;
			case 2 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:26: GREATER_THAN_EQUAL
				{
				mGREATER_THAN_EQUAL(); 

				}
				break;
			case 3 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:45: COLON
				{
				mCOLON(); 

				}
				break;
			case 4 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:51: DASH
				{
				mDASH(); 

				}
				break;
			case 5 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:56: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 6 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:62: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 7 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:68: LESS_THAN
				{
				mLESS_THAN(); 

				}
				break;
			case 8 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:78: GREATER_THAN
				{
				mGREATER_THAN(); 

				}
				break;
			case 9 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:91: NOT_EQ
				{
				mNOT_EQ(); 

				}
				break;
			case 10 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:98: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 11 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:108: UNDERSCORE
				{
				mUNDERSCORE(); 

				}
				break;
			case 12 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:119: QUESTION_MARK
				{
				mQUESTION_MARK(); 

				}
				break;
			case 13 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:133: ALERT
				{
				mALERT(); 

				}
				break;
			case 14 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:139: IF
				{
				mIF(); 

				}
				break;
			case 15 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:142: IN
				{
				mIN(); 

				}
				break;
			case 16 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:145: WHERE
				{
				mWHERE(); 

				}
				break;
			case 17 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:151: BEFORE
				{
				mBEFORE(); 

				}
				break;
			case 18 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:158: AFTER
				{
				mAFTER(); 

				}
				break;
			case 19 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:164: INSERT
				{
				mINSERT(); 

				}
				break;
			case 20 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:171: DELETE
				{
				mDELETE(); 

				}
				break;
			case 21 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:178: UPDATE
				{
				mUPDATE(); 

				}
				break;
			case 22 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:185: LIKE
				{
				mLIKE(); 

				}
				break;
			case 23 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:190: ID
				{
				mID(); 

				}
				break;
			case 24 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:193: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 25 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:201: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\1\uffff\1\35\1\37\6\uffff\1\40\1\uffff\16\31\10\uffff\4\31\1\67\1\71"+
		"\1\67\1\71\16\31\1\uffff\1\31\1\uffff\31\31\2\143\1\144\1\145\1\144\1"+
		"\145\2\31\2\150\6\31\3\uffff\2\157\1\uffff\2\160\2\161\2\162\4\uffff";
	static final String DFA15_eofS =
		"\163\uffff";
	static final String DFA15_minS =
		"\1\11\2\75\6\uffff\1\47\1\uffff\1\146\1\106\1\146\1\106\1\150\1\110\1"+
		"\145\1\105\1\145\1\105\1\160\1\120\1\151\1\111\10\uffff\1\145\1\164\1"+
		"\105\1\124\4\47\1\145\1\105\1\146\1\106\1\154\1\114\1\144\1\104\1\153"+
		"\1\113\1\162\1\145\1\122\1\105\1\uffff\1\145\1\uffff\1\105\1\162\1\122"+
		"\1\157\1\117\1\145\1\105\1\141\1\101\1\145\1\105\1\164\1\162\1\124\1\122"+
		"\1\162\1\122\1\145\1\105\1\162\1\122\1\164\1\124\1\164\1\124\6\47\1\164"+
		"\1\124\2\47\1\145\1\105\1\145\1\105\1\145\1\105\3\uffff\2\47\1\uffff\6"+
		"\47\4\uffff";
	static final String DFA15_maxS =
		"\1\176\1\76\1\75\6\uffff\1\172\1\uffff\1\154\1\114\1\156\1\116\1\150\1"+
		"\110\1\145\1\105\1\145\1\105\1\160\1\120\1\151\1\111\10\uffff\1\145\1"+
		"\164\1\105\1\124\4\172\1\145\1\105\1\146\1\106\1\154\1\114\1\144\1\104"+
		"\1\153\1\113\1\162\1\145\1\122\1\105\1\uffff\1\145\1\uffff\1\105\1\162"+
		"\1\122\1\157\1\117\1\145\1\105\1\141\1\101\1\145\1\105\1\164\1\162\1\124"+
		"\1\122\1\162\1\122\1\145\1\105\1\162\1\122\1\164\1\124\1\164\1\124\6\172"+
		"\1\164\1\124\2\172\1\145\1\105\1\145\1\105\1\145\1\105\3\uffff\2\172\1"+
		"\uffff\6\172\4\uffff";
	static final String DFA15_acceptS =
		"\3\uffff\1\3\1\4\1\5\1\6\1\11\1\12\1\uffff\1\14\16\uffff\1\27\1\30\1\31"+
		"\1\1\1\7\1\2\1\10\1\13\26\uffff\1\16\1\uffff\1\17\51\uffff\1\26\1\15\1"+
		"\22\2\uffff\1\20\6\uffff\1\23\1\21\1\24\1\25";
	static final String DFA15_specialS =
		"\163\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\33\1\32\2\uffff\1\32\22\uffff\1\33\1\7\5\uffff\1\5\5\uffff\1\4\14"+
			"\uffff\1\3\1\10\1\1\1\6\1\2\1\12\1\uffff\1\14\1\22\1\31\1\24\4\31\1\16"+
			"\2\31\1\30\10\31\1\26\1\31\1\20\3\31\3\uffff\1\7\1\11\1\uffff\1\13\1"+
			"\21\1\31\1\23\4\31\1\15\2\31\1\27\10\31\1\25\1\31\1\17\3\31\3\uffff\1"+
			"\7",
			"\1\34\1\7",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"",
			"\1\42\5\uffff\1\41",
			"\1\44\5\uffff\1\43",
			"\1\45\7\uffff\1\46",
			"\1\47\7\uffff\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\22\31\1\70\7\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\22\31\1\72\7\31\4\uffff\1\31"+
			"\1\uffff\32\31",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"",
			"\1\111",
			"",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
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
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\146",
			"\1\147",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"",
			"",
			"",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"\1\31\5\uffff\1\31\2\uffff\13\31\6\uffff\32\31\4\uffff\1\31\1\uffff"+
			"\32\31",
			"",
			"",
			"",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( LESS_THAN_EQUAL | GREATER_THAN_EQUAL | COLON | DASH | QUOTE | EQUAL | LESS_THAN | GREATER_THAN | NOT_EQ | SEMICOLON | UNDERSCORE | QUESTION_MARK | ALERT | IF | IN | WHERE | BEFORE | AFTER | INSERT | DELETE | UPDATE | LIKE | ID | NEWLINE | WS );";
		}
	}

}
