// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlus.g 2016-04-03 15:35:26

	package com.mijecu25.sqlplus.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SQLPlusParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFTER", "ALERT", "AS", "ASTERISK", 
		"BEFORE", "COLON", "COMMA", "CROSS", "DASH", "DELETE", "DOT", "EQUAL", 
		"FROM", "GREATER_THAN", "GREATER_THAN_EQUAL", "ID", "IF", "IN", "INNER", 
		"INSERT", "JOIN", "LEFT", "LEFT_PARENTHESIS", "LESS_THAN", "LESS_THAN_EQUAL", 
		"LIKE", "NATURAL", "NEWLINE", "NOT_EQUAL", "OJ", "ON", "OUTER", "PARTITION", 
		"QUESTION_MARK", "QUOTE", "RIGHT", "RIGHT_PARENTHESIS", "SELECT", "SEMICOLON", 
		"STRAIGHT_JOIN", "TODO", "UNDERSCORE", "UPDATE", "USING", "WHERE", "WS"
	};
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
	public static final int DELETE=13;
	public static final int DOT=14;
	public static final int EQUAL=15;
	public static final int FROM=16;
	public static final int GREATER_THAN=17;
	public static final int GREATER_THAN_EQUAL=18;
	public static final int ID=19;
	public static final int IF=20;
	public static final int IN=21;
	public static final int INNER=22;
	public static final int INSERT=23;
	public static final int JOIN=24;
	public static final int LEFT=25;
	public static final int LEFT_PARENTHESIS=26;
	public static final int LESS_THAN=27;
	public static final int LESS_THAN_EQUAL=28;
	public static final int LIKE=29;
	public static final int NATURAL=30;
	public static final int NEWLINE=31;
	public static final int NOT_EQUAL=32;
	public static final int OJ=33;
	public static final int ON=34;
	public static final int OUTER=35;
	public static final int PARTITION=36;
	public static final int QUESTION_MARK=37;
	public static final int QUOTE=38;
	public static final int RIGHT=39;
	public static final int RIGHT_PARENTHESIS=40;
	public static final int SELECT=41;
	public static final int SEMICOLON=42;
	public static final int STRAIGHT_JOIN=43;
	public static final int TODO=44;
	public static final int UNDERSCORE=45;
	public static final int UPDATE=46;
	public static final int USING=47;
	public static final int WHERE=48;
	public static final int WS=49;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public SQLPlusParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SQLPlusParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return SQLPlusParser.tokenNames; }
	@Override public String getGrammarFileName() { return "src/main/sqlplus/parser/SQLPlus.g"; }



	// $ANTLR start "sqlplus"
	// src/main/sqlplus/parser/SQLPlus.g:10:1: sqlplus : ( sql_expression | sqlplus_alert );
	public final void sqlplus() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:11:2: ( sql_expression | sqlplus_alert )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==SELECT) ) {
				alt1=1;
			}
			else if ( (LA1_0==ALERT) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:11:5: sql_expression
					{
					pushFollow(FOLLOW_sql_expression_in_sqlplus25);
					sql_expression();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:13:4: sqlplus_alert
					{
					pushFollow(FOLLOW_sqlplus_alert_in_sqlplus33);
					sqlplus_alert();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sqlplus"



	// $ANTLR start "sqlplus_alert"
	// src/main/sqlplus/parser/SQLPlus.g:17:1: sqlplus_alert : ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON ;
	public final void sqlplus_alert() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:18:2: ( ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON )
			// src/main/sqlplus/parser/SQLPlus.g:18:4: ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON
			{
			match(input,ALERT,FOLLOW_ALERT_in_sqlplus_alert46); 
			pushFollow(FOLLOW_timing_in_sqlplus_alert48);
			timing();
			state._fsp--;

			pushFollow(FOLLOW_data_manipulation_language_in_sqlplus_alert50);
			data_manipulation_language();
			state._fsp--;

			match(input,IN,FOLLOW_IN_in_sqlplus_alert52); 
			match(input,ID,FOLLOW_ID_in_sqlplus_alert54); 
			match(input,IF,FOLLOW_IF_in_sqlplus_alert56); 
			match(input,ID,FOLLOW_ID_in_sqlplus_alert58); 
			pushFollow(FOLLOW_relational_operation_in_sqlplus_alert60);
			relational_operation();
			state._fsp--;

			pushFollow(FOLLOW_match_value_in_sqlplus_alert62);
			match_value();
			state._fsp--;

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sqlplus_alert64); 
			 
							System.out.println("Created SQLPlus alert"); 
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sqlplus_alert"



	// $ANTLR start "sql_expression"
	// src/main/sqlplus/parser/SQLPlus.g:24:1: sql_expression : select_statement ;
	public final void sql_expression() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:25:2: ( select_statement )
			// src/main/sqlplus/parser/SQLPlus.g:25:4: select_statement
			{
			pushFollow(FOLLOW_select_statement_in_sql_expression82);
			select_statement();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sql_expression"



	// $ANTLR start "select_statement"
	// src/main/sqlplus/parser/SQLPlus.g:28:1: select_statement : select_expression ;
	public final void select_statement() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:29:2: ( select_expression )
			// src/main/sqlplus/parser/SQLPlus.g:29:4: select_expression
			{
			pushFollow(FOLLOW_select_expression_in_select_statement93);
			select_expression();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "select_statement"



	// $ANTLR start "select_expression"
	// src/main/sqlplus/parser/SQLPlus.g:32:1: select_expression : SELECT select_list ( FROM table_references )? ;
	public final void select_expression() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:33:2: ( SELECT select_list ( FROM table_references )? )
			// src/main/sqlplus/parser/SQLPlus.g:33:4: SELECT select_list ( FROM table_references )?
			{
			match(input,SELECT,FOLLOW_SELECT_in_select_expression105); 
			pushFollow(FOLLOW_select_list_in_select_expression107);
			select_list();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:33:23: ( FROM table_references )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==FROM) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:33:24: FROM table_references
					{
					match(input,FROM,FOLLOW_FROM_in_select_expression110); 
					pushFollow(FOLLOW_table_references_in_select_expression112);
					table_references();
					state._fsp--;

					}
					break;

			}

			 System.out.println("SQL Expressions"); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "select_expression"



	// $ANTLR start "select_list"
	// src/main/sqlplus/parser/SQLPlus.g:36:1: select_list : ( displayed_column ( COMMA displayed_column )* | ASTERISK );
	public final void select_list() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:37:2: ( displayed_column ( COMMA displayed_column )* | ASTERISK )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ID) ) {
				alt4=1;
			}
			else if ( (LA4_0==ASTERISK) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:37:4: displayed_column ( COMMA displayed_column )*
					{
					pushFollow(FOLLOW_displayed_column_in_select_list127);
					displayed_column();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:37:21: ( COMMA displayed_column )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==COMMA) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:37:22: COMMA displayed_column
							{
							match(input,COMMA,FOLLOW_COMMA_in_select_list130); 
							pushFollow(FOLLOW_displayed_column_in_select_list132);
							displayed_column();
							state._fsp--;

							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:38:5: ASTERISK
					{
					match(input,ASTERISK,FOLLOW_ASTERISK_in_select_list141); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "select_list"



	// $ANTLR start "displayed_column"
	// src/main/sqlplus/parser/SQLPlus.g:41:1: displayed_column : ( table_spec DOT ASTERISK | column_spec ( alias )? );
	public final void displayed_column() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:42:2: ( table_spec DOT ASTERISK | column_spec ( alias )? )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==DOT) ) {
					int LA6_2 = input.LA(3);
					if ( (LA6_2==ASTERISK) ) {
						alt6=1;
					}
					else if ( (LA6_2==ID) ) {
						int LA6_5 = input.LA(4);
						if ( (LA6_5==DOT) ) {
							int LA6_6 = input.LA(5);
							if ( (LA6_6==ASTERISK) ) {
								alt6=1;
							}
							else if ( (LA6_6==ID) ) {
								alt6=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 6, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA6_5==EOF||LA6_5==AS||LA6_5==COMMA||LA6_5==FROM||LA6_5==ID||LA6_5==RIGHT_PARENTHESIS) ) {
							alt6=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA6_1==EOF||LA6_1==AS||LA6_1==COMMA||LA6_1==FROM||LA6_1==ID||LA6_1==RIGHT_PARENTHESIS) ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:42:4: table_spec DOT ASTERISK
					{
					pushFollow(FOLLOW_table_spec_in_displayed_column154);
					table_spec();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_displayed_column156); 
					match(input,ASTERISK,FOLLOW_ASTERISK_in_displayed_column158); 
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:43:4: column_spec ( alias )?
					{
					pushFollow(FOLLOW_column_spec_in_displayed_column163);
					column_spec();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:43:16: ( alias )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==AS||LA5_0==ID) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:43:17: alias
							{
							pushFollow(FOLLOW_alias_in_displayed_column166);
							alias();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "displayed_column"



	// $ANTLR start "table_references"
	// src/main/sqlplus/parser/SQLPlus.g:46:1: table_references : table_reference ( COMMA table_reference )* ;
	public final void table_references() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:47:2: ( table_reference ( COMMA table_reference )* )
			// src/main/sqlplus/parser/SQLPlus.g:47:4: table_reference ( COMMA table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_references179);
			table_reference();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:47:20: ( COMMA table_reference )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:47:21: COMMA table_reference
					{
					match(input,COMMA,FOLLOW_COMMA_in_table_references182); 
					pushFollow(FOLLOW_table_reference_in_table_references184);
					table_reference();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "table_references"



	// $ANTLR start "table_reference"
	// src/main/sqlplus/parser/SQLPlus.g:50:1: table_reference : table_atom ;
	public final void table_reference() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:51:2: ( table_atom )
			// src/main/sqlplus/parser/SQLPlus.g:52:9: table_atom
			{
			pushFollow(FOLLOW_table_atom_in_table_reference203);
			table_atom();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "table_reference"



	// $ANTLR start "table_factor1"
	// src/main/sqlplus/parser/SQLPlus.g:55:1: table_factor1 : table_factor2 ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )? ;
	public final void table_factor1() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:56:2: ( table_factor2 ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )? )
			// src/main/sqlplus/parser/SQLPlus.g:56:4: table_factor2 ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )?
			{
			pushFollow(FOLLOW_table_factor2_in_table_factor1214);
			table_factor2();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:56:18: ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==CROSS||LA10_0==INNER||LA10_0==JOIN) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:56:19: ( INNER | CROSS )? JOIN table_atom ( join_condition )?
					{
					// src/main/sqlplus/parser/SQLPlus.g:56:19: ( INNER | CROSS )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==CROSS||LA8_0==INNER) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:
							{
							if ( input.LA(1)==CROSS||input.LA(1)==INNER ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					match(input,JOIN,FOLLOW_JOIN_in_table_factor1226); 
					pushFollow(FOLLOW_table_atom_in_table_factor1228);
					table_atom();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:56:52: ( join_condition )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==ON||LA9_0==USING) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:56:53: join_condition
							{
							pushFollow(FOLLOW_join_condition_in_table_factor1231);
							join_condition();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "table_factor1"



	// $ANTLR start "table_factor2"
	// src/main/sqlplus/parser/SQLPlus.g:59:1: table_factor2 : table_factor3 ( STRAIGHT_JOIN table_atom ( ON expression )? )? ;
	public final void table_factor2() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:60:2: ( table_factor3 ( STRAIGHT_JOIN table_atom ( ON expression )? )? )
			// src/main/sqlplus/parser/SQLPlus.g:60:4: table_factor3 ( STRAIGHT_JOIN table_atom ( ON expression )? )?
			{
			pushFollow(FOLLOW_table_factor3_in_table_factor2247);
			table_factor3();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:60:18: ( STRAIGHT_JOIN table_atom ( ON expression )? )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==STRAIGHT_JOIN) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:60:19: STRAIGHT_JOIN table_atom ( ON expression )?
					{
					match(input,STRAIGHT_JOIN,FOLLOW_STRAIGHT_JOIN_in_table_factor2250); 
					pushFollow(FOLLOW_table_atom_in_table_factor2252);
					table_atom();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:60:44: ( ON expression )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ON) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:60:45: ON expression
							{
							match(input,ON,FOLLOW_ON_in_table_factor2255); 
							pushFollow(FOLLOW_expression_in_table_factor2257);
							expression();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "table_factor2"



	// $ANTLR start "table_factor3"
	// src/main/sqlplus/parser/SQLPlus.g:63:1: table_factor3 : table_factor4 ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )? ;
	public final void table_factor3() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:64:2: ( table_factor4 ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )? )
			// src/main/sqlplus/parser/SQLPlus.g:64:4: table_factor4 ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )?
			{
			pushFollow(FOLLOW_table_factor4_in_table_factor3272);
			table_factor4();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:64:18: ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==LEFT||LA14_0==RIGHT) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:64:19: ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition
					{
					if ( input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// src/main/sqlplus/parser/SQLPlus.g:64:32: ( OUTER )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==OUTER) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:64:33: OUTER
							{
							match(input,OUTER,FOLLOW_OUTER_in_table_factor3282); 
							}
							break;

					}

					match(input,JOIN,FOLLOW_JOIN_in_table_factor3286); 
					pushFollow(FOLLOW_table_factor4_in_table_factor3288);
					table_factor4();
					state._fsp--;

					pushFollow(FOLLOW_join_condition_in_table_factor3290);
					join_condition();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "table_factor3"



	// $ANTLR start "table_factor4"
	// src/main/sqlplus/parser/SQLPlus.g:67:1: table_factor4 : table_atom ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )? ;
	public final void table_factor4() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:68:2: ( table_atom ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )? )
			// src/main/sqlplus/parser/SQLPlus.g:68:4: table_atom ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )?
			{
			pushFollow(FOLLOW_table_atom_in_table_factor4304);
			table_atom();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:68:15: ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==NATURAL) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:68:16: NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom
					{
					match(input,NATURAL,FOLLOW_NATURAL_in_table_factor4307); 
					// src/main/sqlplus/parser/SQLPlus.g:68:24: ( ( LEFT | RIGHT ) ( OUTER )? )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==LEFT||LA16_0==RIGHT) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:68:25: ( LEFT | RIGHT ) ( OUTER )?
							{
							if ( input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							// src/main/sqlplus/parser/SQLPlus.g:68:38: ( OUTER )?
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( (LA15_0==OUTER) ) {
								alt15=1;
							}
							switch (alt15) {
								case 1 :
									// src/main/sqlplus/parser/SQLPlus.g:68:39: OUTER
									{
									match(input,OUTER,FOLLOW_OUTER_in_table_factor4317); 
									}
									break;

							}

							}
							break;

					}

					match(input,JOIN,FOLLOW_JOIN_in_table_factor4323); 
					pushFollow(FOLLOW_table_atom_in_table_factor4325);
					table_atom();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "table_factor4"



	// $ANTLR start "table_atom"
	// src/main/sqlplus/parser/SQLPlus.g:71:1: table_atom : ( table_spec ( partition_clause )? ( alias )? ( index_hint_list )? | subquery alias | LEFT_PARENTHESIS table_references RIGHT_PARENTHESIS | OJ table_reference LEFT OUTER JOIN table_reference ON expression );
	public final void table_atom() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:72:2: ( table_spec ( partition_clause )? ( alias )? ( index_hint_list )? | subquery alias | LEFT_PARENTHESIS table_references RIGHT_PARENTHESIS | OJ table_reference LEFT OUTER JOIN table_reference ON expression )
			int alt21=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt21=1;
				}
				break;
			case LEFT_PARENTHESIS:
				{
				int LA21_2 = input.LA(2);
				if ( (LA21_2==SELECT) ) {
					alt21=2;
				}
				else if ( (LA21_2==ID||LA21_2==LEFT_PARENTHESIS||LA21_2==OJ) ) {
					alt21=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OJ:
				{
				alt21=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:72:4: table_spec ( partition_clause )? ( alias )? ( index_hint_list )?
					{
					pushFollow(FOLLOW_table_spec_in_table_atom339);
					table_spec();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:72:15: ( partition_clause )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==PARTITION) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:72:16: partition_clause
							{
							pushFollow(FOLLOW_partition_clause_in_table_atom342);
							partition_clause();
							state._fsp--;

							}
							break;

					}

					// src/main/sqlplus/parser/SQLPlus.g:72:35: ( alias )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==AS||LA19_0==ID) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:72:36: alias
							{
							pushFollow(FOLLOW_alias_in_table_atom347);
							alias();
							state._fsp--;

							}
							break;

					}

					// src/main/sqlplus/parser/SQLPlus.g:72:44: ( index_hint_list )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==TODO) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:72:45: index_hint_list
							{
							pushFollow(FOLLOW_index_hint_list_in_table_atom352);
							index_hint_list();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:73:5: subquery alias
					{
					pushFollow(FOLLOW_subquery_in_table_atom360);
					subquery();
					state._fsp--;

					pushFollow(FOLLOW_alias_in_table_atom362);
					alias();
					state._fsp--;

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:74:5: LEFT_PARENTHESIS table_references RIGHT_PARENTHESIS
					{
					match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_table_atom368); 
					pushFollow(FOLLOW_table_references_in_table_atom370);
					table_references();
					state._fsp--;

					match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_table_atom372); 
					}
					break;
				case 4 :
					// src/main/sqlplus/parser/SQLPlus.g:75:5: OJ table_reference LEFT OUTER JOIN table_reference ON expression
					{
					match(input,OJ,FOLLOW_OJ_in_table_atom378); 
					pushFollow(FOLLOW_table_reference_in_table_atom380);
					table_reference();
					state._fsp--;

					match(input,LEFT,FOLLOW_LEFT_in_table_atom382); 
					match(input,OUTER,FOLLOW_OUTER_in_table_atom384); 
					match(input,JOIN,FOLLOW_JOIN_in_table_atom386); 
					pushFollow(FOLLOW_table_reference_in_table_atom388);
					table_reference();
					state._fsp--;

					match(input,ON,FOLLOW_ON_in_table_atom390); 
					pushFollow(FOLLOW_expression_in_table_atom392);
					expression();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "table_atom"



	// $ANTLR start "join_condition"
	// src/main/sqlplus/parser/SQLPlus.g:78:1: join_condition : ( ON expression | USING column_list );
	public final void join_condition() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:79:2: ( ON expression | USING column_list )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==ON) ) {
				alt22=1;
			}
			else if ( (LA22_0==USING) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:79:4: ON expression
					{
					match(input,ON,FOLLOW_ON_in_join_condition403); 
					pushFollow(FOLLOW_expression_in_join_condition405);
					expression();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:80:5: USING column_list
					{
					match(input,USING,FOLLOW_USING_in_join_condition412); 
					pushFollow(FOLLOW_column_list_in_join_condition414);
					column_list();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "join_condition"



	// $ANTLR start "index_hint_list"
	// src/main/sqlplus/parser/SQLPlus.g:83:1: index_hint_list : index_hint ( COMMA index_hint )* ;
	public final void index_hint_list() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:84:2: ( index_hint ( COMMA index_hint )* )
			// src/main/sqlplus/parser/SQLPlus.g:84:4: index_hint ( COMMA index_hint )*
			{
			pushFollow(FOLLOW_index_hint_in_index_hint_list425);
			index_hint();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:84:15: ( COMMA index_hint )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==COMMA) ) {
					int LA23_1 = input.LA(2);
					if ( (LA23_1==TODO) ) {
						alt23=1;
					}

				}

				switch (alt23) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:84:16: COMMA index_hint
					{
					match(input,COMMA,FOLLOW_COMMA_in_index_hint_list428); 
					pushFollow(FOLLOW_index_hint_in_index_hint_list430);
					index_hint();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_hint_list"



	// $ANTLR start "index_hint"
	// src/main/sqlplus/parser/SQLPlus.g:87:1: index_hint : TODO ;
	public final void index_hint() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:88:2: ( TODO )
			// src/main/sqlplus/parser/SQLPlus.g:88:4: TODO
			{
			match(input,TODO,FOLLOW_TODO_in_index_hint444); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_hint"



	// $ANTLR start "partition_clause"
	// src/main/sqlplus/parser/SQLPlus.g:91:1: partition_clause : PARTITION LEFT_PARENTHESIS partition_names RIGHT_PARENTHESIS ;
	public final void partition_clause() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:92:2: ( PARTITION LEFT_PARENTHESIS partition_names RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:92:4: PARTITION LEFT_PARENTHESIS partition_names RIGHT_PARENTHESIS
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_partition_clause457); 
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_partition_clause459); 
			pushFollow(FOLLOW_partition_names_in_partition_clause461);
			partition_names();
			state._fsp--;

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_partition_clause463); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "partition_clause"



	// $ANTLR start "partition_names"
	// src/main/sqlplus/parser/SQLPlus.g:95:1: partition_names : partition_name ( COMMA partition_name )* ;
	public final void partition_names() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:96:2: ( partition_name ( COMMA partition_name )* )
			// src/main/sqlplus/parser/SQLPlus.g:96:4: partition_name ( COMMA partition_name )*
			{
			pushFollow(FOLLOW_partition_name_in_partition_names475);
			partition_name();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:96:19: ( COMMA partition_name )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==COMMA) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:96:20: COMMA partition_name
					{
					match(input,COMMA,FOLLOW_COMMA_in_partition_names478); 
					pushFollow(FOLLOW_partition_name_in_partition_names480);
					partition_name();
					state._fsp--;

					}
					break;

				default :
					break loop24;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "partition_names"



	// $ANTLR start "expression"
	// src/main/sqlplus/parser/SQLPlus.g:99:1: expression : TODO ;
	public final void expression() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:100:2: ( TODO )
			// src/main/sqlplus/parser/SQLPlus.g:100:4: TODO
			{
			match(input,TODO,FOLLOW_TODO_in_expression493); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "table_spec"
	// src/main/sqlplus/parser/SQLPlus.g:103:1: table_spec : ( schema_name DOT )? table_name ;
	public final void table_spec() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:104:2: ( ( schema_name DOT )? table_name )
			// src/main/sqlplus/parser/SQLPlus.g:104:4: ( schema_name DOT )? table_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:104:4: ( schema_name DOT )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==ID) ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1==DOT) ) {
					int LA25_2 = input.LA(3);
					if ( (LA25_2==ID) ) {
						alt25=1;
					}
				}
			}
			switch (alt25) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:104:5: schema_name DOT
					{
					pushFollow(FOLLOW_schema_name_in_table_spec506);
					schema_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_table_spec508); 
					}
					break;

			}

			pushFollow(FOLLOW_table_name_in_table_spec512);
			table_name();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "table_spec"



	// $ANTLR start "column_spec"
	// src/main/sqlplus/parser/SQLPlus.g:107:1: column_spec : ( ( schema_name DOT )? table_name DOT )? column_name ;
	public final void column_spec() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:108:2: ( ( ( schema_name DOT )? table_name DOT )? column_name )
			// src/main/sqlplus/parser/SQLPlus.g:108:4: ( ( schema_name DOT )? table_name DOT )? column_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:108:4: ( ( schema_name DOT )? table_name DOT )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==ID) ) {
				int LA27_1 = input.LA(2);
				if ( (LA27_1==DOT) ) {
					alt27=1;
				}
			}
			switch (alt27) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:108:5: ( schema_name DOT )? table_name DOT
					{
					// src/main/sqlplus/parser/SQLPlus.g:108:5: ( schema_name DOT )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==ID) ) {
						int LA26_1 = input.LA(2);
						if ( (LA26_1==DOT) ) {
							int LA26_2 = input.LA(3);
							if ( (LA26_2==ID) ) {
								int LA26_3 = input.LA(4);
								if ( (LA26_3==DOT) ) {
									alt26=1;
								}
							}
						}
					}
					switch (alt26) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:108:6: schema_name DOT
							{
							pushFollow(FOLLOW_schema_name_in_column_spec525);
							schema_name();
							state._fsp--;

							match(input,DOT,FOLLOW_DOT_in_column_spec527); 
							}
							break;

					}

					pushFollow(FOLLOW_table_name_in_column_spec531);
					table_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_column_spec533); 
					}
					break;

			}

			pushFollow(FOLLOW_column_name_in_column_spec537);
			column_name();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "column_spec"



	// $ANTLR start "column_list"
	// src/main/sqlplus/parser/SQLPlus.g:111:1: column_list : TODO ;
	public final void column_list() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:112:2: ( TODO )
			// src/main/sqlplus/parser/SQLPlus.g:112:4: TODO
			{
			match(input,TODO,FOLLOW_TODO_in_column_list549); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "column_list"



	// $ANTLR start "subquery"
	// src/main/sqlplus/parser/SQLPlus.g:115:1: subquery : LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS ;
	public final void subquery() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:116:2: ( LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:116:4: LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_subquery562); 
			pushFollow(FOLLOW_select_statement_in_subquery564);
			select_statement();
			state._fsp--;

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_subquery566); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subquery"



	// $ANTLR start "alias"
	// src/main/sqlplus/parser/SQLPlus.g:119:1: alias : ( AS )? ID ;
	public final void alias() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:119:7: ( ( AS )? ID )
			// src/main/sqlplus/parser/SQLPlus.g:119:9: ( AS )? ID
			{
			// src/main/sqlplus/parser/SQLPlus.g:119:9: ( AS )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==AS) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:119:10: AS
					{
					match(input,AS,FOLLOW_AS_in_alias577); 
					}
					break;

			}

			match(input,ID,FOLLOW_ID_in_alias581); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "alias"



	// $ANTLR start "column_name"
	// src/main/sqlplus/parser/SQLPlus.g:120:1: column_name : ID ;
	public final void column_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:120:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:120:15: ID
			{
			match(input,ID,FOLLOW_ID_in_column_name588); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "column_name"



	// $ANTLR start "partition_name"
	// src/main/sqlplus/parser/SQLPlus.g:121:1: partition_name : ID ;
	public final void partition_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:121:16: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:121:18: ID
			{
			match(input,ID,FOLLOW_ID_in_partition_name595); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "partition_name"



	// $ANTLR start "schema_name"
	// src/main/sqlplus/parser/SQLPlus.g:122:1: schema_name : ID ;
	public final void schema_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:122:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:122:15: ID
			{
			match(input,ID,FOLLOW_ID_in_schema_name602); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "schema_name"



	// $ANTLR start "table_name"
	// src/main/sqlplus/parser/SQLPlus.g:123:1: table_name : ID ;
	public final void table_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:123:12: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:123:14: ID
			{
			match(input,ID,FOLLOW_ID_in_table_name609); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "table_name"



	// $ANTLR start "timing"
	// src/main/sqlplus/parser/SQLPlus.g:125:1: timing : ( BEFORE | AFTER );
	public final void timing() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:126:2: ( BEFORE | AFTER )
			// src/main/sqlplus/parser/SQLPlus.g:
			{
			if ( input.LA(1)==AFTER||input.LA(1)==BEFORE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "timing"



	// $ANTLR start "data_manipulation_language"
	// src/main/sqlplus/parser/SQLPlus.g:130:1: data_manipulation_language : ( INSERT | DELETE | UPDATE );
	public final void data_manipulation_language() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:131:2: ( INSERT | DELETE | UPDATE )
			// src/main/sqlplus/parser/SQLPlus.g:
			{
			if ( input.LA(1)==DELETE||input.LA(1)==INSERT||input.LA(1)==UPDATE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "data_manipulation_language"



	// $ANTLR start "relational_operation"
	// src/main/sqlplus/parser/SQLPlus.g:136:1: relational_operation : ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE );
	public final void relational_operation() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:137:2: ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE )
			// src/main/sqlplus/parser/SQLPlus.g:
			{
			if ( input.LA(1)==EQUAL||(input.LA(1) >= GREATER_THAN && input.LA(1) <= GREATER_THAN_EQUAL)||(input.LA(1) >= LESS_THAN && input.LA(1) <= LIKE)||input.LA(1)==NOT_EQUAL ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relational_operation"



	// $ANTLR start "match_value"
	// src/main/sqlplus/parser/SQLPlus.g:146:1: match_value : ( ID | QUESTION_MARK );
	public final void match_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:147:2: ( ID | QUESTION_MARK )
			// src/main/sqlplus/parser/SQLPlus.g:
			{
			if ( input.LA(1)==ID||input.LA(1)==QUESTION_MARK ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "match_value"

	// Delegated rules



	public static final BitSet FOLLOW_sql_expression_in_sqlplus25 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sqlplus_alert_in_sqlplus33 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALERT_in_sqlplus_alert46 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_timing_in_sqlplus_alert48 = new BitSet(new long[]{0x0000400000802000L});
	public static final BitSet FOLLOW_data_manipulation_language_in_sqlplus_alert50 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IN_in_sqlplus_alert52 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert54 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IF_in_sqlplus_alert56 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert58 = new BitSet(new long[]{0x0000000138068000L});
	public static final BitSet FOLLOW_relational_operation_in_sqlplus_alert60 = new BitSet(new long[]{0x0000002000080000L});
	public static final BitSet FOLLOW_match_value_in_sqlplus_alert62 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus_alert64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_statement_in_sql_expression82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_expression_in_select_statement93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select_expression105 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_select_list_in_select_expression107 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_FROM_in_select_expression110 = new BitSet(new long[]{0x0000000204080000L});
	public static final BitSet FOLLOW_table_references_in_select_expression112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_displayed_column_in_select_list127 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_select_list130 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_displayed_column_in_select_list132 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ASTERISK_in_select_list141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_spec_in_displayed_column154 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DOT_in_displayed_column156 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASTERISK_in_displayed_column158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_displayed_column163 = new BitSet(new long[]{0x0000000000080042L});
	public static final BitSet FOLLOW_alias_in_displayed_column166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_references179 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_table_references182 = new BitSet(new long[]{0x0000000204080000L});
	public static final BitSet FOLLOW_table_reference_in_table_references184 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_table_atom_in_table_reference203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_factor2_in_table_factor1214 = new BitSet(new long[]{0x0000000001400802L});
	public static final BitSet FOLLOW_JOIN_in_table_factor1226 = new BitSet(new long[]{0x0000000204080000L});
	public static final BitSet FOLLOW_table_atom_in_table_factor1228 = new BitSet(new long[]{0x0000800400000002L});
	public static final BitSet FOLLOW_join_condition_in_table_factor1231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_factor3_in_table_factor2247 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_STRAIGHT_JOIN_in_table_factor2250 = new BitSet(new long[]{0x0000000204080000L});
	public static final BitSet FOLLOW_table_atom_in_table_factor2252 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_ON_in_table_factor2255 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_expression_in_table_factor2257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_factor4_in_table_factor3272 = new BitSet(new long[]{0x0000008002000002L});
	public static final BitSet FOLLOW_set_in_table_factor3275 = new BitSet(new long[]{0x0000000801000000L});
	public static final BitSet FOLLOW_OUTER_in_table_factor3282 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_JOIN_in_table_factor3286 = new BitSet(new long[]{0x0000000204080000L});
	public static final BitSet FOLLOW_table_factor4_in_table_factor3288 = new BitSet(new long[]{0x0000800400000000L});
	public static final BitSet FOLLOW_join_condition_in_table_factor3290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_atom_in_table_factor4304 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_NATURAL_in_table_factor4307 = new BitSet(new long[]{0x0000008003000000L});
	public static final BitSet FOLLOW_set_in_table_factor4310 = new BitSet(new long[]{0x0000000801000000L});
	public static final BitSet FOLLOW_OUTER_in_table_factor4317 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_JOIN_in_table_factor4323 = new BitSet(new long[]{0x0000000204080000L});
	public static final BitSet FOLLOW_table_atom_in_table_factor4325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_spec_in_table_atom339 = new BitSet(new long[]{0x0000101000080042L});
	public static final BitSet FOLLOW_partition_clause_in_table_atom342 = new BitSet(new long[]{0x0000100000080042L});
	public static final BitSet FOLLOW_alias_in_table_atom347 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_index_hint_list_in_table_atom352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_table_atom360 = new BitSet(new long[]{0x0000000000080040L});
	public static final BitSet FOLLOW_alias_in_table_atom362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_table_atom368 = new BitSet(new long[]{0x0000000204080000L});
	public static final BitSet FOLLOW_table_references_in_table_atom370 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_table_atom372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OJ_in_table_atom378 = new BitSet(new long[]{0x0000000204080000L});
	public static final BitSet FOLLOW_table_reference_in_table_atom380 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LEFT_in_table_atom382 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_OUTER_in_table_atom384 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_JOIN_in_table_atom386 = new BitSet(new long[]{0x0000000204080000L});
	public static final BitSet FOLLOW_table_reference_in_table_atom388 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_ON_in_table_atom390 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_expression_in_table_atom392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_join_condition403 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_expression_in_join_condition405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_join_condition412 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_column_list_in_join_condition414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_hint_in_index_hint_list425 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_index_hint_list428 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_index_hint_in_index_hint_list430 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_TODO_in_index_hint444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_partition_clause457 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_partition_clause459 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_partition_names_in_partition_clause461 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_partition_clause463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partition_name_in_partition_names475 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_partition_names478 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_partition_name_in_partition_names480 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_TODO_in_expression493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_table_spec506 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DOT_in_table_spec508 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_table_name_in_table_spec512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_column_spec525 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DOT_in_column_spec527 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_table_name_in_column_spec531 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DOT_in_column_spec533 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_column_name_in_column_spec537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TODO_in_column_list549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_subquery562 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_select_statement_in_subquery564 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_subquery566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_alias577 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_alias581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partition_name595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_schema_name602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name609 = new BitSet(new long[]{0x0000000000000002L});
}
