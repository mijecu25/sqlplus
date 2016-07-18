// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlusLex.g 2016-07-18 18:14:56

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
	public static final int ALL=6;
	public static final int AND=7;
	public static final int ANY=8;
	public static final int AS=9;
	public static final int ASTERISK=10;
	public static final int BEFORE=11;
	public static final int COLON=12;
	public static final int COMMA=13;
	public static final int DATABASES=14;
	public static final int DEFAULT=15;
	public static final int DELETE=16;
	public static final int DOT=17;
	public static final int EQUAL=18;
	public static final int EXISTS=19;
	public static final int FALSE=20;
	public static final int FROM=21;
	public static final int GREATER_THAN=22;
	public static final int GREATER_THAN_EQUAL=23;
	public static final int ID=24;
	public static final int IF=25;
	public static final int IN=26;
	public static final int INSERT=27;
	public static final int INTEGER_NUMBER=28;
	public static final int INTO=29;
	public static final int IS=30;
	public static final int LEFT_PARENTHESIS=31;
	public static final int LESS_THAN=32;
	public static final int LESS_THAN_EQUAL=33;
	public static final int LIKE=34;
	public static final int MINUS=35;
	public static final int NEWLINE=36;
	public static final int NOT=37;
	public static final int NOT_EQUAL=38;
	public static final int NULL=39;
	public static final int OR=40;
	public static final int PLUS=41;
	public static final int QUESTION_MARK=42;
	public static final int QUOTE=43;
	public static final int REAL_NUMBER=44;
	public static final int RIGHT_PARENTHESIS=45;
	public static final int SELECT=46;
	public static final int SEMICOLON=47;
	public static final int SET=48;
	public static final int SHOW=49;
	public static final int TABLES=50;
	public static final int TEXT_STRING=51;
	public static final int TRUE=52;
	public static final int UNDERSCORE=53;
	public static final int UPDATE=54;
	public static final int USE=55;
	public static final int VALUES=56;
	public static final int WHERE=57;
	public static final int WS=58;
	public static final int XOR=59;

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

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:8:5: ( 'and' | 'AND' | '&&' )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 'a':
				{
				alt1=1;
				}
				break;
			case 'A':
				{
				alt1=2;
				}
				break;
			case '&':
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:8:9: 'and'
					{
					match("and"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:9:9: 'AND'
					{
					match("AND"); 

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlusLex.g:10:9: '&&'
					{
					match("&&"); 

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
	// $ANTLR end "AND"

	// $ANTLR start "ASTERISK"
	public final void mASTERISK() throws RecognitionException {
		try {
			int _type = ASTERISK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:12:10: ( '*' )
			// src/main/sqlplus/parser/SQLPlusLex.g:12:12: '*'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:13:7: ( ',' )
			// src/main/sqlplus/parser/SQLPlusLex.g:13:9: ','
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
			// src/main/sqlplus/parser/SQLPlusLex.g:14:7: ( ':' )
			// src/main/sqlplus/parser/SQLPlusLex.g:14:9: ':'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:15:5: ( '.' )
			// src/main/sqlplus/parser/SQLPlusLex.g:15:7: '.'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:16:7: ( '=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:16:9: '='
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
			// src/main/sqlplus/parser/SQLPlusLex.g:17:14: ( '>' )
			// src/main/sqlplus/parser/SQLPlusLex.g:17:16: '>'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:18:20: ( '>=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:18:22: '>='
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
			// src/main/sqlplus/parser/SQLPlusLex.g:19:18: ( '(' )
			// src/main/sqlplus/parser/SQLPlusLex.g:19:20: '('
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
			// src/main/sqlplus/parser/SQLPlusLex.g:20:11: ( '<' )
			// src/main/sqlplus/parser/SQLPlusLex.g:20:13: '<'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:21:17: ( '<=' )
			// src/main/sqlplus/parser/SQLPlusLex.g:21:19: '<='
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
			// src/main/sqlplus/parser/SQLPlusLex.g:22:7: ( '-' )
			// src/main/sqlplus/parser/SQLPlusLex.g:22:9: '-'
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

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:24:5: ( 'NOT' | 'not' | '!' )
			int alt2=3;
			switch ( input.LA(1) ) {
			case 'N':
				{
				alt2=1;
				}
				break;
			case 'n':
				{
				alt2=2;
				}
				break;
			case '!':
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:24:7: 'NOT'
					{
					match("NOT"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:25:7: 'not'
					{
					match("not"); 

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlusLex.g:26:7: '!'
					{
					match('!'); 
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
	// $ANTLR end "NOT"

	// $ANTLR start "NOT_EQUAL"
	public final void mNOT_EQUAL() throws RecognitionException {
		try {
			int _type = NOT_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:29:2: ( '<>' | '!=' | '~=' | '^=' )
			int alt3=4;
			switch ( input.LA(1) ) {
			case '<':
				{
				alt3=1;
				}
				break;
			case '!':
				{
				alt3=2;
				}
				break;
			case '~':
				{
				alt3=3;
				}
				break;
			case '^':
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:29:4: '<>'
					{
					match("<>"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:30:5: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlusLex.g:31:5: '~='
					{
					match("~="); 

					}
					break;
				case 4 :
					// src/main/sqlplus/parser/SQLPlusLex.g:32:5: '^='
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

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:35:5: ( 'or' | 'OR' | '||' )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 'o':
				{
				alt4=1;
				}
				break;
			case 'O':
				{
				alt4=2;
				}
				break;
			case '|':
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:35:9: 'or'
					{
					match("or"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:36:9: 'OR'
					{
					match("OR"); 

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlusLex.g:37:9: '||'
					{
					match("||"); 

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
	// $ANTLR end "OR"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:39:6: ( '+' )
			// src/main/sqlplus/parser/SQLPlusLex.g:39:8: '+'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:40:15: ( '?' )
			// src/main/sqlplus/parser/SQLPlusLex.g:40:17: '?'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:41:7: ( '\\'' )
			// src/main/sqlplus/parser/SQLPlusLex.g:41:9: '\\''
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
			// src/main/sqlplus/parser/SQLPlusLex.g:42:19: ( ')' )
			// src/main/sqlplus/parser/SQLPlusLex.g:42:21: ')'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:43:11: ( ';' )
			// src/main/sqlplus/parser/SQLPlusLex.g:43:13: ';'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:44:12: ( '_' )
			// src/main/sqlplus/parser/SQLPlusLex.g:44:13: '_'
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

	// $ANTLR start "XOR"
	public final void mXOR() throws RecognitionException {
		try {
			int _type = XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:46:5: ( 'xor' | 'XOR' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='x') ) {
				alt5=1;
			}
			else if ( (LA5_0=='X') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:46:9: 'xor'
					{
					match("xor"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:47:9: 'XOR'
					{
					match("XOR"); 

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
	// $ANTLR end "XOR"

	// $ANTLR start "ALERT"
	public final void mALERT() throws RecognitionException {
		try {
			int _type = ALERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:52:2: ( 'alert' | 'ALERT' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='a') ) {
				alt6=1;
			}
			else if ( (LA6_0=='A') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:52:4: 'alert'
					{
					match("alert"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:53:4: 'ALERT'
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

	// $ANTLR start "ALL"
	public final void mALL() throws RecognitionException {
		try {
			int _type = ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:57:5: ( 'all' | 'any' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='a') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='l') ) {
					alt7=1;
				}
				else if ( (LA7_1=='n') ) {
					alt7=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:57:9: 'all'
					{
					match("all"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:58:9: 'any'
					{
					match("any"); 

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
	// $ANTLR end "ALL"

	// $ANTLR start "AFTER"
	public final void mAFTER() throws RecognitionException {
		try {
			int _type = AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:62:2: ( 'after' | 'AFTER' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='a') ) {
				alt8=1;
			}
			else if ( (LA8_0=='A') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:62:4: 'after'
					{
					match("after"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:63:4: 'AFTER'
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

	// $ANTLR start "ANY"
	public final void mANY() throws RecognitionException {
		try {
			int _type = ANY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:67:5: ( 'any' | 'ANY' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='a') ) {
				alt9=1;
			}
			else if ( (LA9_0=='A') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:67:9: 'any'
					{
					match("any"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:68:9: 'ANY'
					{
					match("ANY"); 

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
	// $ANTLR end "ANY"

	// $ANTLR start "AS"
	public final void mAS() throws RecognitionException {
		try {
			int _type = AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:72:2: ( 'as' | 'AS' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='a') ) {
				alt10=1;
			}
			else if ( (LA10_0=='A') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:72:5: 'as'
					{
					match("as"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:73:4: 'AS'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:77:2: ( 'before' | 'BEFORE' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='b') ) {
				alt11=1;
			}
			else if ( (LA11_0=='B') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:77:4: 'before'
					{
					match("before"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:78:4: 'BEFORE'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:82:2: ( 'databases' | 'DATABASES' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='d') ) {
				alt12=1;
			}
			else if ( (LA12_0=='D') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:82:4: 'databases'
					{
					match("databases"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:83:4: 'DATABASES'
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

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:87:5: ( 'default' | 'DEFAULT' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='d') ) {
				alt13=1;
			}
			else if ( (LA13_0=='D') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:87:9: 'default'
					{
					match("default"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:88:9: 'DEFAULT'
					{
					match("DEFAULT"); 

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
	// $ANTLR end "DEFAULT"

	// $ANTLR start "DELETE"
	public final void mDELETE() throws RecognitionException {
		try {
			int _type = DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:92:2: ( 'delete' | 'DELETE' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='d') ) {
				alt14=1;
			}
			else if ( (LA14_0=='D') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:92:4: 'delete'
					{
					match("delete"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:93:4: 'DELETE'
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

	// $ANTLR start "EXISTS"
	public final void mEXISTS() throws RecognitionException {
		try {
			int _type = EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:97:5: ( 'exists' | 'EXISTS' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='e') ) {
				alt15=1;
			}
			else if ( (LA15_0=='E') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:97:9: 'exists'
					{
					match("exists"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:98:9: 'EXISTS'
					{
					match("EXISTS"); 

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
	// $ANTLR end "EXISTS"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:102:5: ( 'false' | 'FALSE' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='f') ) {
				alt16=1;
			}
			else if ( (LA16_0=='F') ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:102:9: 'false'
					{
					match("false"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:103:9: 'FALSE'
					{
					match("FALSE"); 

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
	// $ANTLR end "FALSE"

	// $ANTLR start "FROM"
	public final void mFROM() throws RecognitionException {
		try {
			int _type = FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:107:2: ( 'from' | 'FROM' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='f') ) {
				alt17=1;
			}
			else if ( (LA17_0=='F') ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:107:4: 'from'
					{
					match("from"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:108:4: 'FROM'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:112:2: ( 'if' | 'IF' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='i') ) {
				alt18=1;
			}
			else if ( (LA18_0=='I') ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:112:4: 'if'
					{
					match("if"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:113:4: 'IF'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:117:2: ( 'in' | 'IN' )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='i') ) {
				alt19=1;
			}
			else if ( (LA19_0=='I') ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:117:4: 'in'
					{
					match("in"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:118:4: 'IN'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:122:5: ( 'into' | 'INTO' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='i') ) {
				alt20=1;
			}
			else if ( (LA20_0=='I') ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:122:9: 'into'
					{
					match("into"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:123:9: 'INTO'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:127:2: ( 'insert' | 'INSERT' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='i') ) {
				alt21=1;
			}
			else if ( (LA21_0=='I') ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:127:5: 'insert'
					{
					match("insert"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:128:4: 'INSERT'
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

	// $ANTLR start "IS"
	public final void mIS() throws RecognitionException {
		try {
			int _type = IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:132:5: ( 'is' | 'IS' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='i') ) {
				alt22=1;
			}
			else if ( (LA22_0=='I') ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:132:9: 'is'
					{
					match("is"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:133:9: 'IS'
					{
					match("IS"); 

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
	// $ANTLR end "IS"

	// $ANTLR start "LIKE"
	public final void mLIKE() throws RecognitionException {
		try {
			int _type = LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:137:2: ( 'like' | 'LIKE' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='l') ) {
				alt23=1;
			}
			else if ( (LA23_0=='L') ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:137:4: 'like'
					{
					match("like"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:138:4: 'LIKE'
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

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:142:5: ( 'null' | 'NULL' )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0=='n') ) {
				alt24=1;
			}
			else if ( (LA24_0=='N') ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:142:9: 'null'
					{
					match("null"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:143:9: 'NULL'
					{
					match("NULL"); 

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
	// $ANTLR end "NULL"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:147:2: ( 'select' | 'SELECT' )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0=='s') ) {
				alt25=1;
			}
			else if ( (LA25_0=='S') ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:147:4: 'select'
					{
					match("select"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:148:4: 'SELECT'
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

	// $ANTLR start "SET"
	public final void mSET() throws RecognitionException {
		try {
			int _type = SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:152:5: ( 'set' | 'SET' )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0=='s') ) {
				alt26=1;
			}
			else if ( (LA26_0=='S') ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:152:9: 'set'
					{
					match("set"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:153:9: 'SET'
					{
					match("SET"); 

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
	// $ANTLR end "SET"

	// $ANTLR start "SHOW"
	public final void mSHOW() throws RecognitionException {
		try {
			int _type = SHOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:157:2: ( 'show' | 'SHOW' )
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
					// src/main/sqlplus/parser/SQLPlusLex.g:157:4: 'show'
					{
					match("show"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:158:4: 'SHOW'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:162:2: ( 'tables' | 'TABLES' )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0=='t') ) {
				alt28=1;
			}
			else if ( (LA28_0=='T') ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:162:4: 'tables'
					{
					match("tables"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:163:4: 'TABLES'
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

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:167:5: ( 'true' | 'TRUE' )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='t') ) {
				alt29=1;
			}
			else if ( (LA29_0=='T') ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:167:9: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:168:9: 'TRUE'
					{
					match("TRUE"); 

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
	// $ANTLR end "TRUE"

	// $ANTLR start "UPDATE"
	public final void mUPDATE() throws RecognitionException {
		try {
			int _type = UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/sqlplus/parser/SQLPlusLex.g:172:2: ( 'update' | 'UPDATE' )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0=='u') ) {
				alt30=1;
			}
			else if ( (LA30_0=='U') ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:172:5: 'update'
					{
					match("update"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:173:4: 'UPDATE'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:177:2: ( 'use' | 'USE' )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0=='u') ) {
				alt31=1;
			}
			else if ( (LA31_0=='U') ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:177:4: 'use'
					{
					match("use"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:178:4: 'USE'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:182:5: ( 'values' | 'VALUES' )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0=='v') ) {
				alt32=1;
			}
			else if ( (LA32_0=='V') ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:182:9: 'values'
					{
					match("values"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:183:9: 'VALUES'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:187:2: ( 'where' | 'WHERE' )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0=='w') ) {
				alt33=1;
			}
			else if ( (LA33_0=='W') ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:187:5: 'where'
					{
					match("where"); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:188:4: 'WHERE'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:192:5: ( ( '0' .. '9' )+ )
			// src/main/sqlplus/parser/SQLPlusLex.g:192:9: ( '0' .. '9' )+
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:192:9: ( '0' .. '9' )+
			int cnt34=0;
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( ((LA34_0 >= '0' && LA34_0 <= '9')) ) {
					alt34=1;
				}

				switch (alt34) {
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
					if ( cnt34 >= 1 ) break loop34;
					EarlyExitException eee = new EarlyExitException(34, input);
					throw eee;
				}
				cnt34++;
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
			// src/main/sqlplus/parser/SQLPlusLex.g:196:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )* )
			// src/main/sqlplus/parser/SQLPlusLex.g:196:4: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )*
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// src/main/sqlplus/parser/SQLPlusLex.g:196:39: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0=='$'||(LA35_0 >= '0' && LA35_0 <= '9')||(LA35_0 >= 'A' && LA35_0 <= 'Z')||LA35_0=='_'||(LA35_0 >= 'a' && LA35_0 <= 'z')) ) {
					alt35=1;
				}

				switch (alt35) {
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
					break loop35;
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
			// src/main/sqlplus/parser/SQLPlusLex.g:200:5: ( ( INTEGER_NUMBER DOT INTEGER_NUMBER | INTEGER_NUMBER DOT | DOT INTEGER_NUMBER | INTEGER_NUMBER ) ( ( 'E' | 'e' ) ( PLUS | MINUS )? INTEGER_NUMBER )? )
			// src/main/sqlplus/parser/SQLPlusLex.g:200:9: ( INTEGER_NUMBER DOT INTEGER_NUMBER | INTEGER_NUMBER DOT | DOT INTEGER_NUMBER | INTEGER_NUMBER ) ( ( 'E' | 'e' ) ( PLUS | MINUS )? INTEGER_NUMBER )?
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:200:9: ( INTEGER_NUMBER DOT INTEGER_NUMBER | INTEGER_NUMBER DOT | DOT INTEGER_NUMBER | INTEGER_NUMBER )
			int alt36=4;
			alt36 = dfa36.predict(input);
			switch (alt36) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:200:11: INTEGER_NUMBER DOT INTEGER_NUMBER
					{
					mINTEGER_NUMBER(); 

					mDOT(); 

					mINTEGER_NUMBER(); 

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:200:47: INTEGER_NUMBER DOT
					{
					mINTEGER_NUMBER(); 

					mDOT(); 

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlusLex.g:200:68: DOT INTEGER_NUMBER
					{
					mDOT(); 

					mINTEGER_NUMBER(); 

					}
					break;
				case 4 :
					// src/main/sqlplus/parser/SQLPlusLex.g:200:89: INTEGER_NUMBER
					{
					mINTEGER_NUMBER(); 

					}
					break;

			}

			// src/main/sqlplus/parser/SQLPlusLex.g:201:9: ( ( 'E' | 'e' ) ( PLUS | MINUS )? INTEGER_NUMBER )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0=='E'||LA38_0=='e') ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:201:11: ( 'E' | 'e' ) ( PLUS | MINUS )? INTEGER_NUMBER
					{
					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// src/main/sqlplus/parser/SQLPlusLex.g:201:21: ( PLUS | MINUS )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0=='+'||LA37_0=='-') ) {
						alt37=1;
					}
					switch (alt37) {
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
			// src/main/sqlplus/parser/SQLPlusLex.g:205:5: ( '\\'' (~ ( '\\'' ) )* '\\'' | '\"' (~ ( '\"' ) )* '\"' )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0=='\'') ) {
				alt41=1;
			}
			else if ( (LA41_0=='\"') ) {
				alt41=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:205:9: '\\'' (~ ( '\\'' ) )* '\\''
					{
					match('\''); 
					// src/main/sqlplus/parser/SQLPlusLex.g:205:14: (~ ( '\\'' ) )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( ((LA39_0 >= '\u0000' && LA39_0 <= '&')||(LA39_0 >= '(' && LA39_0 <= '\uFFFF')) ) {
							alt39=1;
						}

						switch (alt39) {
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
							break loop39;
						}
					}

					match('\''); 
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlusLex.g:206:9: '\"' (~ ( '\"' ) )* '\"'
					{
					match('\"'); 
					// src/main/sqlplus/parser/SQLPlusLex.g:206:13: (~ ( '\"' ) )*
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( ((LA40_0 >= '\u0000' && LA40_0 <= '!')||(LA40_0 >= '#' && LA40_0 <= '\uFFFF')) ) {
							alt40=1;
						}

						switch (alt40) {
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
							break loop40;
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
			// src/main/sqlplus/parser/SQLPlusLex.g:211:2: ( ( '\\r' )? '\\n' )
			// src/main/sqlplus/parser/SQLPlusLex.g:211:5: ( '\\r' )? '\\n'
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:211:5: ( '\\r' )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0=='\r') ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlusLex.g:211:5: '\\r'
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
			// src/main/sqlplus/parser/SQLPlusLex.g:216:2: ( ( ' ' | '\\t' )+ )
			// src/main/sqlplus/parser/SQLPlusLex.g:216:5: ( ' ' | '\\t' )+
			{
			// src/main/sqlplus/parser/SQLPlusLex.g:216:5: ( ' ' | '\\t' )+
			int cnt43=0;
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0=='\t'||LA43_0==' ') ) {
					alt43=1;
				}

				switch (alt43) {
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
					if ( cnt43 >= 1 ) break loop43;
					EarlyExitException eee = new EarlyExitException(43, input);
					throw eee;
				}
				cnt43++;
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
		// src/main/sqlplus/parser/SQLPlusLex.g:1:8: ( AND | ASTERISK | COMMA | COLON | DOT | EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LEFT_PARENTHESIS | LESS_THAN | LESS_THAN_EQUAL | MINUS | NOT | NOT_EQUAL | OR | PLUS | QUESTION_MARK | QUOTE | RIGHT_PARENTHESIS | SEMICOLON | UNDERSCORE | XOR | ALERT | ALL | AFTER | ANY | AS | BEFORE | DATABASES | DEFAULT | DELETE | EXISTS | FALSE | FROM | IF | IN | INTO | INSERT | IS | LIKE | NULL | SELECT | SET | SHOW | TABLES | TRUE | UPDATE | USE | VALUES | WHERE | INTEGER_NUMBER | ID | REAL_NUMBER | TEXT_STRING | NEWLINE | WS )
		int alt44=56;
		alt44 = dfa44.predict(input);
		switch (alt44) {
			case 1 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:14: ASTERISK
				{
				mASTERISK(); 

				}
				break;
			case 3 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:23: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 4 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:29: COLON
				{
				mCOLON(); 

				}
				break;
			case 5 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:35: DOT
				{
				mDOT(); 

				}
				break;
			case 6 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:39: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 7 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:45: GREATER_THAN
				{
				mGREATER_THAN(); 

				}
				break;
			case 8 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:58: GREATER_THAN_EQUAL
				{
				mGREATER_THAN_EQUAL(); 

				}
				break;
			case 9 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:77: LEFT_PARENTHESIS
				{
				mLEFT_PARENTHESIS(); 

				}
				break;
			case 10 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:94: LESS_THAN
				{
				mLESS_THAN(); 

				}
				break;
			case 11 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:104: LESS_THAN_EQUAL
				{
				mLESS_THAN_EQUAL(); 

				}
				break;
			case 12 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:120: MINUS
				{
				mMINUS(); 

				}
				break;
			case 13 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:126: NOT
				{
				mNOT(); 

				}
				break;
			case 14 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:130: NOT_EQUAL
				{
				mNOT_EQUAL(); 

				}
				break;
			case 15 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:140: OR
				{
				mOR(); 

				}
				break;
			case 16 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:143: PLUS
				{
				mPLUS(); 

				}
				break;
			case 17 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:148: QUESTION_MARK
				{
				mQUESTION_MARK(); 

				}
				break;
			case 18 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:162: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 19 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:168: RIGHT_PARENTHESIS
				{
				mRIGHT_PARENTHESIS(); 

				}
				break;
			case 20 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:186: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 21 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:196: UNDERSCORE
				{
				mUNDERSCORE(); 

				}
				break;
			case 22 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:207: XOR
				{
				mXOR(); 

				}
				break;
			case 23 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:211: ALERT
				{
				mALERT(); 

				}
				break;
			case 24 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:217: ALL
				{
				mALL(); 

				}
				break;
			case 25 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:221: AFTER
				{
				mAFTER(); 

				}
				break;
			case 26 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:227: ANY
				{
				mANY(); 

				}
				break;
			case 27 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:231: AS
				{
				mAS(); 

				}
				break;
			case 28 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:234: BEFORE
				{
				mBEFORE(); 

				}
				break;
			case 29 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:241: DATABASES
				{
				mDATABASES(); 

				}
				break;
			case 30 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:251: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 31 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:259: DELETE
				{
				mDELETE(); 

				}
				break;
			case 32 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:266: EXISTS
				{
				mEXISTS(); 

				}
				break;
			case 33 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:273: FALSE
				{
				mFALSE(); 

				}
				break;
			case 34 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:279: FROM
				{
				mFROM(); 

				}
				break;
			case 35 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:284: IF
				{
				mIF(); 

				}
				break;
			case 36 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:287: IN
				{
				mIN(); 

				}
				break;
			case 37 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:290: INTO
				{
				mINTO(); 

				}
				break;
			case 38 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:295: INSERT
				{
				mINSERT(); 

				}
				break;
			case 39 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:302: IS
				{
				mIS(); 

				}
				break;
			case 40 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:305: LIKE
				{
				mLIKE(); 

				}
				break;
			case 41 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:310: NULL
				{
				mNULL(); 

				}
				break;
			case 42 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:315: SELECT
				{
				mSELECT(); 

				}
				break;
			case 43 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:322: SET
				{
				mSET(); 

				}
				break;
			case 44 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:326: SHOW
				{
				mSHOW(); 

				}
				break;
			case 45 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:331: TABLES
				{
				mTABLES(); 

				}
				break;
			case 46 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:338: TRUE
				{
				mTRUE(); 

				}
				break;
			case 47 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:343: UPDATE
				{
				mUPDATE(); 

				}
				break;
			case 48 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:350: USE
				{
				mUSE(); 

				}
				break;
			case 49 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:354: VALUES
				{
				mVALUES(); 

				}
				break;
			case 50 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:361: WHERE
				{
				mWHERE(); 

				}
				break;
			case 51 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:367: INTEGER_NUMBER
				{
				mINTEGER_NUMBER(); 

				}
				break;
			case 52 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:382: ID
				{
				mID(); 

				}
				break;
			case 53 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:385: REAL_NUMBER
				{
				mREAL_NUMBER(); 

				}
				break;
			case 54 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:397: TEXT_STRING
				{
				mTEXT_STRING(); 

				}
				break;
			case 55 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:409: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 56 :
				// src/main/sqlplus/parser/SQLPlusLex.g:1:417: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA36 dfa36 = new DFA36(this);
	protected DFA44 dfa44 = new DFA44(this);
	static final String DFA36_eotS =
		"\1\uffff\1\3\2\uffff\1\5\2\uffff";
	static final String DFA36_eofS =
		"\7\uffff";
	static final String DFA36_minS =
		"\2\56\2\uffff\1\60\2\uffff";
	static final String DFA36_maxS =
		"\2\71\2\uffff\1\71\2\uffff";
	static final String DFA36_acceptS =
		"\2\uffff\1\3\1\4\1\uffff\1\2\1\1";
	static final String DFA36_specialS =
		"\7\uffff}>";
	static final String[] DFA36_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\4\1\uffff\12\1",
			"",
			"",
			"\12\6",
			"",
			""
	};

	static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
	static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
	static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
	static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
	static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
	static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
	static final short[][] DFA36_transition;

	static {
		int numStates = DFA36_transitionS.length;
		DFA36_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
		}
	}

	protected class DFA36 extends DFA {

		public DFA36(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 36;
			this.eot = DFA36_eot;
			this.eof = DFA36_eof;
			this.min = DFA36_min;
			this.max = DFA36_max;
			this.accept = DFA36_accept;
			this.special = DFA36_special;
			this.transition = DFA36_transition;
		}
		@Override
		public String getDescription() {
			return "200:9: ( INTEGER_NUMBER DOT INTEGER_NUMBER | INTEGER_NUMBER DOT | DOT INTEGER_NUMBER | INTEGER_NUMBER )";
		}
	}

	static final String DFA44_eotS =
		"\1\uffff\2\63\4\uffff\1\77\1\uffff\1\102\1\uffff\1\104\1\uffff\2\63\1"+
		"\111\1\uffff\2\63\3\uffff\1\114\2\uffff\1\115\30\63\1\164\4\uffff\3\63"+
		"\1\172\3\63\1\172\6\uffff\4\63\1\uffff\2\23\2\uffff\16\63\1\u0093\1\u0096"+
		"\1\u0097\1\u0093\1\u0096\1\u0097\22\63\1\uffff\1\3\1\u00ae\1\63\1\u00ae"+
		"\1\63\1\uffff\1\3\1\u00b1\2\63\1\111\1\63\1\111\1\63\2\u00b6\16\63\1\uffff"+
		"\2\63\2\uffff\5\63\1\u00cc\2\63\1\u00cc\6\63\1\u00d5\1\63\1\u00d5\4\63"+
		"\1\uffff\2\63\1\uffff\2\63\2\u00df\1\uffff\13\63\1\u00eb\1\63\1\u00eb"+
		"\1\u00ed\1\63\1\u00ed\1\63\2\u00f0\1\63\1\uffff\1\u00f2\1\63\1\u00f2\1"+
		"\63\1\u00f5\1\63\1\u00f5\1\63\1\uffff\5\63\1\u00fd\1\u00fe\1\u00fd\1\u00fe"+
		"\1\uffff\12\63\1\u0109\1\uffff\1\u0109\1\uffff\2\63\1\uffff\1\63\1\uffff"+
		"\2\63\1\uffff\5\63\2\u0114\2\uffff\2\u0115\2\63\1\u0118\2\63\1\u0118\2"+
		"\u011b\1\uffff\2\u011c\2\u011d\2\u011e\2\u011f\2\u0120\2\uffff\1\63\1"+
		"\u0122\1\uffff\1\63\1\u0122\6\uffff\1\63\1\uffff\1\63\2\u0126\1\uffff";
	static final String DFA44_eofS =
		"\u0127\uffff";
	static final String DFA44_minS =
		"\1\11\1\146\1\106\4\uffff\1\60\1\uffff\1\75\1\uffff\1\75\1\uffff\1\117"+
		"\1\157\1\75\1\uffff\1\162\1\122\3\uffff\1\0\2\uffff\1\44\1\157\1\117\1"+
		"\145\1\105\1\141\1\101\1\170\1\130\1\141\1\101\1\146\1\106\1\151\1\111"+
		"\1\145\1\105\1\141\1\101\1\160\1\120\1\141\1\101\1\150\1\110\1\56\4\uffff"+
		"\1\144\1\145\1\164\1\44\1\104\1\105\1\124\1\44\6\uffff\1\124\1\114\1\164"+
		"\1\154\1\uffff\2\44\2\uffff\1\162\1\122\1\146\1\106\1\164\1\146\1\124"+
		"\1\106\1\151\1\111\1\154\1\157\1\114\1\117\6\44\1\153\1\113\1\154\1\157"+
		"\1\114\1\117\1\142\1\165\1\102\1\125\1\144\1\145\1\104\1\105\1\154\1\114"+
		"\1\145\1\105\1\uffff\2\44\1\162\1\44\1\145\1\uffff\2\44\1\122\1\105\1"+
		"\44\1\114\1\44\1\154\2\44\1\157\1\117\2\141\1\145\2\101\1\105\1\163\1"+
		"\123\1\163\1\155\1\123\1\115\1\uffff\1\157\1\145\2\uffff\1\117\1\105\1"+
		"\145\1\105\1\145\1\44\1\167\1\105\1\44\1\127\1\154\1\145\1\114\1\105\1"+
		"\141\1\44\1\101\1\44\1\165\1\125\1\162\1\122\1\uffff\1\164\1\162\1\uffff"+
		"\1\124\1\122\2\44\1\uffff\1\162\1\122\1\142\1\165\1\164\1\102\1\125\1"+
		"\124\1\164\1\124\1\145\1\44\1\105\2\44\1\162\1\44\1\122\2\44\1\143\1\uffff"+
		"\1\44\1\103\1\44\1\145\1\44\1\105\1\44\1\164\1\uffff\1\124\1\145\1\105"+
		"\1\145\1\105\4\44\1\uffff\1\145\1\105\1\141\1\154\1\145\1\101\1\114\1"+
		"\105\1\163\1\123\1\44\1\uffff\1\44\1\uffff\1\164\1\124\1\uffff\1\164\1"+
		"\uffff\1\124\1\163\1\uffff\1\123\1\145\1\105\1\163\1\123\2\44\2\uffff"+
		"\2\44\1\163\1\164\1\44\1\123\1\124\3\44\1\uffff\12\44\2\uffff\1\145\1"+
		"\44\1\uffff\1\105\1\44\6\uffff\1\163\1\uffff\1\123\2\44\1\uffff";
	static final String DFA44_maxS =
		"\1\176\1\163\1\123\4\uffff\1\71\1\uffff\1\75\1\uffff\1\76\1\uffff\1\125"+
		"\1\165\1\75\1\uffff\1\162\1\122\3\uffff\1\uffff\2\uffff\1\172\1\157\1"+
		"\117\1\145\1\105\1\145\1\105\1\170\1\130\1\162\1\122\1\163\1\123\1\151"+
		"\1\111\1\150\1\110\1\162\1\122\1\163\1\123\1\141\1\101\1\150\1\110\1\145"+
		"\4\uffff\1\171\1\154\1\164\1\172\1\131\1\105\1\124\1\172\6\uffff\1\124"+
		"\1\114\1\164\1\154\1\uffff\2\172\2\uffff\1\162\1\122\1\146\1\106\1\164"+
		"\1\154\1\124\1\114\1\151\1\111\1\154\1\157\1\114\1\117\6\172\1\153\1\113"+
		"\1\164\1\157\1\124\1\117\1\142\1\165\1\102\1\125\1\144\1\145\1\104\1\105"+
		"\1\154\1\114\1\145\1\105\1\uffff\2\172\1\162\1\172\1\145\1\uffff\2\172"+
		"\1\122\1\105\1\172\1\114\1\172\1\154\2\172\1\157\1\117\2\141\1\145\2\101"+
		"\1\105\1\163\1\123\1\163\1\155\1\123\1\115\1\uffff\1\157\1\145\2\uffff"+
		"\1\117\1\105\1\145\1\105\1\145\1\172\1\167\1\105\1\172\1\127\1\154\1\145"+
		"\1\114\1\105\1\141\1\172\1\101\1\172\1\165\1\125\1\162\1\122\1\uffff\1"+
		"\164\1\162\1\uffff\1\124\1\122\2\172\1\uffff\1\162\1\122\1\142\1\165\1"+
		"\164\1\102\1\125\1\124\1\164\1\124\1\145\1\172\1\105\2\172\1\162\1\172"+
		"\1\122\2\172\1\143\1\uffff\1\172\1\103\1\172\1\145\1\172\1\105\1\172\1"+
		"\164\1\uffff\1\124\1\145\1\105\1\145\1\105\4\172\1\uffff\1\145\1\105\1"+
		"\141\1\154\1\145\1\101\1\114\1\105\1\163\1\123\1\172\1\uffff\1\172\1\uffff"+
		"\1\164\1\124\1\uffff\1\164\1\uffff\1\124\1\163\1\uffff\1\123\1\145\1\105"+
		"\1\163\1\123\2\172\2\uffff\2\172\1\163\1\164\1\172\1\123\1\124\3\172\1"+
		"\uffff\12\172\2\uffff\1\145\1\172\1\uffff\1\105\1\172\6\uffff\1\163\1"+
		"\uffff\1\123\2\172\1\uffff";
	static final String DFA44_acceptS =
		"\3\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\uffff\1\11\1\uffff\1\14\3\uffff"+
		"\1\16\2\uffff\1\17\1\20\1\21\1\uffff\1\23\1\24\32\uffff\1\64\1\66\1\67"+
		"\1\70\10\uffff\1\5\1\65\1\10\1\7\1\13\1\12\4\uffff\1\15\2\uffff\1\22\1"+
		"\25\46\uffff\1\63\5\uffff\1\33\30\uffff\1\43\2\uffff\1\44\1\47\26\uffff"+
		"\1\30\2\uffff\1\32\4\uffff\1\26\25\uffff\1\53\10\uffff\1\60\11\uffff\1"+
		"\51\13\uffff\1\42\1\uffff\1\45\2\uffff\1\50\1\uffff\1\54\2\uffff\1\56"+
		"\7\uffff\1\27\1\31\12\uffff\1\41\12\uffff\1\62\1\34\2\uffff\1\37\2\uffff"+
		"\1\40\1\46\1\52\1\55\1\57\1\61\1\uffff\1\36\3\uffff\1\35";
	static final String DFA44_specialS =
		"\26\uffff\1\0\u0110\uffff}>";
	static final String[] DFA44_transitionS = {
			"\1\66\1\65\2\uffff\1\65\22\uffff\1\66\1\17\1\64\1\uffff\1\63\1\uffff"+
			"\1\3\1\26\1\12\1\27\1\4\1\24\1\5\1\14\1\7\1\uffff\12\62\1\6\1\30\1\13"+
			"\1\10\1\11\1\25\1\uffff\1\2\1\35\1\63\1\37\1\41\1\43\2\63\1\45\2\63\1"+
			"\47\1\63\1\15\1\22\3\63\1\51\1\53\1\55\1\57\1\61\1\33\2\63\3\uffff\1"+
			"\20\1\31\1\uffff\1\1\1\34\1\63\1\36\1\40\1\42\2\63\1\44\2\63\1\46\1\63"+
			"\1\16\1\21\3\63\1\50\1\52\1\54\1\56\1\60\1\32\2\63\1\uffff\1\23\1\uffff"+
			"\1\20",
			"\1\71\5\uffff\1\70\1\uffff\1\67\4\uffff\1\72",
			"\1\75\5\uffff\1\74\1\uffff\1\73\4\uffff\1\76",
			"",
			"",
			"",
			"",
			"\12\100",
			"",
			"\1\101",
			"",
			"\1\103\1\20",
			"",
			"\1\105\5\uffff\1\106",
			"\1\107\5\uffff\1\110",
			"\1\20",
			"",
			"\1\112",
			"\1\113",
			"",
			"",
			"",
			"\0\64",
			"",
			"",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122\3\uffff\1\123",
			"\1\124\3\uffff\1\125",
			"\1\126",
			"\1\127",
			"\1\130\20\uffff\1\131",
			"\1\132\20\uffff\1\133",
			"\1\134\7\uffff\1\135\4\uffff\1\136",
			"\1\137\7\uffff\1\140\4\uffff\1\141",
			"\1\142",
			"\1\143",
			"\1\144\2\uffff\1\145",
			"\1\146\2\uffff\1\147",
			"\1\150\20\uffff\1\151",
			"\1\152\20\uffff\1\153",
			"\1\154\2\uffff\1\155",
			"\1\156\2\uffff\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\100\1\uffff\12\62\13\uffff\1\100\37\uffff\1\100",
			"",
			"",
			"",
			"",
			"\1\165\24\uffff\1\166",
			"\1\167\6\uffff\1\170",
			"\1\171",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\173\24\uffff\1\174",
			"\1\175",
			"\1\176",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088\5\uffff\1\u0089",
			"\1\u008a",
			"\1\u008b\5\uffff\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u0095"+
			"\1\u0094\6\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\22\63\1\u0099\1\u0098\6\63\4\uffff\1\63"+
			"\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c\7\uffff\1\u009d",
			"\1\u009e",
			"\1\u009f\7\uffff\1\u00a0",
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
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00af",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00b0",
			"",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00b2",
			"\1\u00b3",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00b4",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00b5",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
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
			"",
			"\1\u00c5",
			"\1\u00c6",
			"",
			"",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00cd",
			"\1\u00ce",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00d6",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"",
			"\1\u00db",
			"\1\u00dc",
			"",
			"\1\u00dd",
			"\1\u00de",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00ec",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00ee",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00ef",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00f1",
			"",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00f3",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00f4",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00f6",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00f7",
			"",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u010a",
			"\1\u010b",
			"",
			"\1\u010c",
			"",
			"\1\u010d",
			"\1\u010e",
			"",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0116",
			"\1\u0117",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0119",
			"\1\u011a",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"\1\u0121",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u0123",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0124",
			"",
			"\1\u0125",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			""
	};

	static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
	static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
	static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
	static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
	static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
	static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
	static final short[][] DFA44_transition;

	static {
		int numStates = DFA44_transitionS.length;
		DFA44_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
		}
	}

	protected class DFA44 extends DFA {

		public DFA44(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 44;
			this.eot = DFA44_eot;
			this.eof = DFA44_eof;
			this.min = DFA44_min;
			this.max = DFA44_max;
			this.accept = DFA44_accept;
			this.special = DFA44_special;
			this.transition = DFA44_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | ASTERISK | COMMA | COLON | DOT | EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LEFT_PARENTHESIS | LESS_THAN | LESS_THAN_EQUAL | MINUS | NOT | NOT_EQUAL | OR | PLUS | QUESTION_MARK | QUOTE | RIGHT_PARENTHESIS | SEMICOLON | UNDERSCORE | XOR | ALERT | ALL | AFTER | ANY | AS | BEFORE | DATABASES | DEFAULT | DELETE | EXISTS | FALSE | FROM | IF | IN | INTO | INSERT | IS | LIKE | NULL | SELECT | SET | SHOW | TABLES | TRUE | UPDATE | USE | VALUES | WHERE | INTEGER_NUMBER | ID | REAL_NUMBER | TEXT_STRING | NEWLINE | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA44_22 = input.LA(1);
						s = -1;
						if ( ((LA44_22 >= '\u0000' && LA44_22 <= '\uFFFF')) ) {s = 52;}
						else s = 76;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 44, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
