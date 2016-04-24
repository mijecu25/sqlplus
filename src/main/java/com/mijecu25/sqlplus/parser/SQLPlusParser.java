// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlus.g 2016-04-23 16:50:31

	package com.mijecu25.sqlplus.parser;
	
	import com.mijecu25.sqlplus.compiler.core.statement.Statement;
	import com.mijecu25.sqlplus.compiler.core.statement.ShowDatabasesStatement;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SQLPlusParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFTER", "ALERT", "AS", "ASTERISK", 
		"BEFORE", "COLON", "COMMA", "CROSS", "DASH", "DATABASES", "DELETE", "DOT", 
		"EQUAL", "FROM", "GREATER_THAN", "GREATER_THAN_EQUAL", "ID", "IF", "IN", 
		"INNER", "INSERT", "JOIN", "LEFT", "LEFT_PARENTHESIS", "LESS_THAN", "LESS_THAN_EQUAL", 
		"LIKE", "NATURAL", "NEWLINE", "NOT_EQUAL", "OJ", "ON", "OUTER", "PARTITION", 
		"QUESTION_MARK", "QUOTE", "RIGHT", "RIGHT_PARENTHESIS", "SELECT", "SEMICOLON", 
		"SHOW", "STRAIGHT_JOIN", "TODO", "UNDERSCORE", "UPDATE", "USING", "WHERE", 
		"WS"
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
	// src/main/sqlplus/parser/SQLPlus.g:13:1: sqlplus returns [Statement statement] : ( sql_statement | sqlplus_alert );
	public final Statement sqlplus() throws RecognitionException {
		Statement statement = null;


		Statement sql_statement1 =null;


				statement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:17:2: ( sql_statement | sqlplus_alert )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==SELECT||LA1_0==SHOW) ) {
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
					// src/main/sqlplus/parser/SQLPlus.g:17:5: sql_statement
					{
					pushFollow(FOLLOW_sql_statement_in_sqlplus35);
					sql_statement1=sql_statement();
					state._fsp--;


								statement = sql_statement1;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:21:4: sqlplus_alert
					{
					pushFollow(FOLLOW_sqlplus_alert_in_sqlplus45);
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
		return statement;
	}
	// $ANTLR end "sqlplus"



	// $ANTLR start "sqlplus_alert"
	// src/main/sqlplus/parser/SQLPlus.g:25:1: sqlplus_alert : ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON ;
	public final void sqlplus_alert() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:26:2: ( ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON )
			// src/main/sqlplus/parser/SQLPlus.g:26:4: ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON
			{
			match(input,ALERT,FOLLOW_ALERT_in_sqlplus_alert58); 
			pushFollow(FOLLOW_timing_in_sqlplus_alert60);
			timing();
			state._fsp--;

			pushFollow(FOLLOW_data_manipulation_language_in_sqlplus_alert62);
			data_manipulation_language();
			state._fsp--;

			match(input,IN,FOLLOW_IN_in_sqlplus_alert64); 
			match(input,ID,FOLLOW_ID_in_sqlplus_alert66); 
			match(input,IF,FOLLOW_IF_in_sqlplus_alert68); 
			match(input,ID,FOLLOW_ID_in_sqlplus_alert70); 
			pushFollow(FOLLOW_relational_operation_in_sqlplus_alert72);
			relational_operation();
			state._fsp--;

			pushFollow(FOLLOW_match_value_in_sqlplus_alert74);
			match_value();
			state._fsp--;

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sqlplus_alert76); 
			 
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



	// $ANTLR start "sql_statement"
	// src/main/sqlplus/parser/SQLPlus.g:32:1: sql_statement returns [Statement sqlStatement] : ( select_statement | show_statement );
	public final Statement sql_statement() throws RecognitionException {
		Statement sqlStatement = null;


		Statement show_statement2 =null;


				sqlStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:36:2: ( select_statement | show_statement )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SELECT) ) {
				alt2=1;
			}
			else if ( (LA2_0==SHOW) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:36:4: select_statement
					{
					pushFollow(FOLLOW_select_statement_in_sql_statement104);
					select_statement();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:37:4: show_statement
					{
					pushFollow(FOLLOW_show_statement_in_sql_statement109);
					show_statement2=show_statement();
					state._fsp--;


								sqlStatement = show_statement2;
							
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
		return sqlStatement;
	}
	// $ANTLR end "sql_statement"



	// $ANTLR start "show_statement"
	// src/main/sqlplus/parser/SQLPlus.g:42:1: show_statement returns [Statement showStatement] : show_databases ;
	public final Statement show_statement() throws RecognitionException {
		Statement showStatement = null;


		Statement show_databases3 =null;


				showStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:46:2: ( show_databases )
			// src/main/sqlplus/parser/SQLPlus.g:46:4: show_databases
			{
			pushFollow(FOLLOW_show_databases_in_show_statement133);
			show_databases3=show_databases();
			state._fsp--;

			 
						showStatement = show_databases3;
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return showStatement;
	}
	// $ANTLR end "show_statement"



	// $ANTLR start "show_databases"
	// src/main/sqlplus/parser/SQLPlus.g:51:1: show_databases returns [Statement showDatabasesStatement] : SHOW DATABASES ;
	public final Statement show_databases() throws RecognitionException {
		Statement showDatabasesStatement = null;



				showDatabasesStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:55:2: ( SHOW DATABASES )
			// src/main/sqlplus/parser/SQLPlus.g:55:4: SHOW DATABASES
			{
			match(input,SHOW,FOLLOW_SHOW_in_show_databases160); 
			match(input,DATABASES,FOLLOW_DATABASES_in_show_databases162); 
			 
						showDatabasesStatement = new ShowDatabasesStatement("show databases"); 
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return showDatabasesStatement;
	}
	// $ANTLR end "show_databases"



	// $ANTLR start "select_statement"
	// src/main/sqlplus/parser/SQLPlus.g:60:1: select_statement : select_expression ;
	public final void select_statement() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:61:2: ( select_expression )
			// src/main/sqlplus/parser/SQLPlus.g:61:4: select_expression
			{
			pushFollow(FOLLOW_select_expression_in_select_statement175);
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
	// src/main/sqlplus/parser/SQLPlus.g:64:1: select_expression : SELECT select_list ( FROM table_references )? ;
	public final void select_expression() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:65:2: ( SELECT select_list ( FROM table_references )? )
			// src/main/sqlplus/parser/SQLPlus.g:65:4: SELECT select_list ( FROM table_references )?
			{
			match(input,SELECT,FOLLOW_SELECT_in_select_expression187); 
			pushFollow(FOLLOW_select_list_in_select_expression189);
			select_list();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:65:23: ( FROM table_references )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==FROM) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:65:24: FROM table_references
					{
					match(input,FROM,FOLLOW_FROM_in_select_expression192); 
					pushFollow(FOLLOW_table_references_in_select_expression194);
					table_references();
					state._fsp--;

					}
					break;

			}

			 System.out.println("SQL Statements"); 
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
	// src/main/sqlplus/parser/SQLPlus.g:68:1: select_list : ( displayed_column ( COMMA displayed_column )* | ASTERISK );
	public final void select_list() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:69:2: ( displayed_column ( COMMA displayed_column )* | ASTERISK )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			else if ( (LA5_0==ASTERISK) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:69:4: displayed_column ( COMMA displayed_column )*
					{
					pushFollow(FOLLOW_displayed_column_in_select_list209);
					displayed_column();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:69:21: ( COMMA displayed_column )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMA) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:69:22: COMMA displayed_column
							{
							match(input,COMMA,FOLLOW_COMMA_in_select_list212); 
							pushFollow(FOLLOW_displayed_column_in_select_list214);
							displayed_column();
							state._fsp--;

							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:70:5: ASTERISK
					{
					match(input,ASTERISK,FOLLOW_ASTERISK_in_select_list223); 
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
	// src/main/sqlplus/parser/SQLPlus.g:73:1: displayed_column : ( table_spec DOT ASTERISK | column_spec ( alias )? );
	public final void displayed_column() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:74:2: ( table_spec DOT ASTERISK | column_spec ( alias )? )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ID) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==DOT) ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2==ASTERISK) ) {
						alt7=1;
					}
					else if ( (LA7_2==ID) ) {
						int LA7_5 = input.LA(4);
						if ( (LA7_5==DOT) ) {
							int LA7_6 = input.LA(5);
							if ( (LA7_6==ASTERISK) ) {
								alt7=1;
							}
							else if ( (LA7_6==ID) ) {
								alt7=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 7, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA7_5==EOF||LA7_5==AS||LA7_5==COMMA||LA7_5==FROM||LA7_5==ID||LA7_5==RIGHT_PARENTHESIS) ) {
							alt7=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 5, input);
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
								new NoViableAltException("", 7, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA7_1==EOF||LA7_1==AS||LA7_1==COMMA||LA7_1==FROM||LA7_1==ID||LA7_1==RIGHT_PARENTHESIS) ) {
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
					// src/main/sqlplus/parser/SQLPlus.g:74:4: table_spec DOT ASTERISK
					{
					pushFollow(FOLLOW_table_spec_in_displayed_column236);
					table_spec();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_displayed_column238); 
					match(input,ASTERISK,FOLLOW_ASTERISK_in_displayed_column240); 
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:75:4: column_spec ( alias )?
					{
					pushFollow(FOLLOW_column_spec_in_displayed_column245);
					column_spec();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:75:16: ( alias )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==AS||LA6_0==ID) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:75:17: alias
							{
							pushFollow(FOLLOW_alias_in_displayed_column248);
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
	// src/main/sqlplus/parser/SQLPlus.g:78:1: table_references : table_reference ( COMMA table_reference )* ;
	public final void table_references() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:79:2: ( table_reference ( COMMA table_reference )* )
			// src/main/sqlplus/parser/SQLPlus.g:79:4: table_reference ( COMMA table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_references261);
			table_reference();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:79:20: ( COMMA table_reference )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:79:21: COMMA table_reference
					{
					match(input,COMMA,FOLLOW_COMMA_in_table_references264); 
					pushFollow(FOLLOW_table_reference_in_table_references266);
					table_reference();
					state._fsp--;

					}
					break;

				default :
					break loop8;
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
	// src/main/sqlplus/parser/SQLPlus.g:82:1: table_reference : table_atom ;
	public final void table_reference() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:83:2: ( table_atom )
			// src/main/sqlplus/parser/SQLPlus.g:84:9: table_atom
			{
			pushFollow(FOLLOW_table_atom_in_table_reference285);
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
	// src/main/sqlplus/parser/SQLPlus.g:87:1: table_factor1 : table_factor2 ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )? ;
	public final void table_factor1() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:88:2: ( table_factor2 ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )? )
			// src/main/sqlplus/parser/SQLPlus.g:88:4: table_factor2 ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )?
			{
			pushFollow(FOLLOW_table_factor2_in_table_factor1296);
			table_factor2();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:88:18: ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==CROSS||LA11_0==INNER||LA11_0==JOIN) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:88:19: ( INNER | CROSS )? JOIN table_atom ( join_condition )?
					{
					// src/main/sqlplus/parser/SQLPlus.g:88:19: ( INNER | CROSS )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==CROSS||LA9_0==INNER) ) {
						alt9=1;
					}
					switch (alt9) {
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

					match(input,JOIN,FOLLOW_JOIN_in_table_factor1308); 
					pushFollow(FOLLOW_table_atom_in_table_factor1310);
					table_atom();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:88:52: ( join_condition )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ON||LA10_0==USING) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:88:53: join_condition
							{
							pushFollow(FOLLOW_join_condition_in_table_factor1313);
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
	// src/main/sqlplus/parser/SQLPlus.g:91:1: table_factor2 : table_factor3 ( STRAIGHT_JOIN table_atom ( ON expression )? )? ;
	public final void table_factor2() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:92:2: ( table_factor3 ( STRAIGHT_JOIN table_atom ( ON expression )? )? )
			// src/main/sqlplus/parser/SQLPlus.g:92:4: table_factor3 ( STRAIGHT_JOIN table_atom ( ON expression )? )?
			{
			pushFollow(FOLLOW_table_factor3_in_table_factor2329);
			table_factor3();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:92:18: ( STRAIGHT_JOIN table_atom ( ON expression )? )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==STRAIGHT_JOIN) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:92:19: STRAIGHT_JOIN table_atom ( ON expression )?
					{
					match(input,STRAIGHT_JOIN,FOLLOW_STRAIGHT_JOIN_in_table_factor2332); 
					pushFollow(FOLLOW_table_atom_in_table_factor2334);
					table_atom();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:92:44: ( ON expression )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==ON) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:92:45: ON expression
							{
							match(input,ON,FOLLOW_ON_in_table_factor2337); 
							pushFollow(FOLLOW_expression_in_table_factor2339);
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
	// src/main/sqlplus/parser/SQLPlus.g:95:1: table_factor3 : table_factor4 ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )? ;
	public final void table_factor3() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:96:2: ( table_factor4 ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )? )
			// src/main/sqlplus/parser/SQLPlus.g:96:4: table_factor4 ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )?
			{
			pushFollow(FOLLOW_table_factor4_in_table_factor3354);
			table_factor4();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:96:18: ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==LEFT||LA15_0==RIGHT) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:96:19: ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition
					{
					if ( input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// src/main/sqlplus/parser/SQLPlus.g:96:32: ( OUTER )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==OUTER) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:96:33: OUTER
							{
							match(input,OUTER,FOLLOW_OUTER_in_table_factor3364); 
							}
							break;

					}

					match(input,JOIN,FOLLOW_JOIN_in_table_factor3368); 
					pushFollow(FOLLOW_table_factor4_in_table_factor3370);
					table_factor4();
					state._fsp--;

					pushFollow(FOLLOW_join_condition_in_table_factor3372);
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
	// src/main/sqlplus/parser/SQLPlus.g:99:1: table_factor4 : table_atom ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )? ;
	public final void table_factor4() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:100:2: ( table_atom ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )? )
			// src/main/sqlplus/parser/SQLPlus.g:100:4: table_atom ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )?
			{
			pushFollow(FOLLOW_table_atom_in_table_factor4386);
			table_atom();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:100:15: ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==NATURAL) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:100:16: NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom
					{
					match(input,NATURAL,FOLLOW_NATURAL_in_table_factor4389); 
					// src/main/sqlplus/parser/SQLPlus.g:100:24: ( ( LEFT | RIGHT ) ( OUTER )? )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==LEFT||LA17_0==RIGHT) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:100:25: ( LEFT | RIGHT ) ( OUTER )?
							{
							if ( input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							// src/main/sqlplus/parser/SQLPlus.g:100:38: ( OUTER )?
							int alt16=2;
							int LA16_0 = input.LA(1);
							if ( (LA16_0==OUTER) ) {
								alt16=1;
							}
							switch (alt16) {
								case 1 :
									// src/main/sqlplus/parser/SQLPlus.g:100:39: OUTER
									{
									match(input,OUTER,FOLLOW_OUTER_in_table_factor4399); 
									}
									break;

							}

							}
							break;

					}

					match(input,JOIN,FOLLOW_JOIN_in_table_factor4405); 
					pushFollow(FOLLOW_table_atom_in_table_factor4407);
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
	// src/main/sqlplus/parser/SQLPlus.g:103:1: table_atom : ( table_spec ( partition_clause )? ( alias )? ( index_hint_list )? | subquery alias | LEFT_PARENTHESIS table_references RIGHT_PARENTHESIS | OJ table_reference LEFT OUTER JOIN table_reference ON expression );
	public final void table_atom() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:104:2: ( table_spec ( partition_clause )? ( alias )? ( index_hint_list )? | subquery alias | LEFT_PARENTHESIS table_references RIGHT_PARENTHESIS | OJ table_reference LEFT OUTER JOIN table_reference ON expression )
			int alt22=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt22=1;
				}
				break;
			case LEFT_PARENTHESIS:
				{
				int LA22_2 = input.LA(2);
				if ( (LA22_2==SELECT) ) {
					alt22=2;
				}
				else if ( (LA22_2==ID||LA22_2==LEFT_PARENTHESIS||LA22_2==OJ) ) {
					alt22=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OJ:
				{
				alt22=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:104:4: table_spec ( partition_clause )? ( alias )? ( index_hint_list )?
					{
					pushFollow(FOLLOW_table_spec_in_table_atom421);
					table_spec();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:104:15: ( partition_clause )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==PARTITION) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:104:16: partition_clause
							{
							pushFollow(FOLLOW_partition_clause_in_table_atom424);
							partition_clause();
							state._fsp--;

							}
							break;

					}

					// src/main/sqlplus/parser/SQLPlus.g:104:35: ( alias )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==AS||LA20_0==ID) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:104:36: alias
							{
							pushFollow(FOLLOW_alias_in_table_atom429);
							alias();
							state._fsp--;

							}
							break;

					}

					// src/main/sqlplus/parser/SQLPlus.g:104:44: ( index_hint_list )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==TODO) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:104:45: index_hint_list
							{
							pushFollow(FOLLOW_index_hint_list_in_table_atom434);
							index_hint_list();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:105:5: subquery alias
					{
					pushFollow(FOLLOW_subquery_in_table_atom442);
					subquery();
					state._fsp--;

					pushFollow(FOLLOW_alias_in_table_atom444);
					alias();
					state._fsp--;

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:106:5: LEFT_PARENTHESIS table_references RIGHT_PARENTHESIS
					{
					match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_table_atom450); 
					pushFollow(FOLLOW_table_references_in_table_atom452);
					table_references();
					state._fsp--;

					match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_table_atom454); 
					}
					break;
				case 4 :
					// src/main/sqlplus/parser/SQLPlus.g:107:5: OJ table_reference LEFT OUTER JOIN table_reference ON expression
					{
					match(input,OJ,FOLLOW_OJ_in_table_atom460); 
					pushFollow(FOLLOW_table_reference_in_table_atom462);
					table_reference();
					state._fsp--;

					match(input,LEFT,FOLLOW_LEFT_in_table_atom464); 
					match(input,OUTER,FOLLOW_OUTER_in_table_atom466); 
					match(input,JOIN,FOLLOW_JOIN_in_table_atom468); 
					pushFollow(FOLLOW_table_reference_in_table_atom470);
					table_reference();
					state._fsp--;

					match(input,ON,FOLLOW_ON_in_table_atom472); 
					pushFollow(FOLLOW_expression_in_table_atom474);
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
	// src/main/sqlplus/parser/SQLPlus.g:110:1: join_condition : ( ON expression | USING column_list );
	public final void join_condition() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:111:2: ( ON expression | USING column_list )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ON) ) {
				alt23=1;
			}
			else if ( (LA23_0==USING) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:111:4: ON expression
					{
					match(input,ON,FOLLOW_ON_in_join_condition485); 
					pushFollow(FOLLOW_expression_in_join_condition487);
					expression();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:112:5: USING column_list
					{
					match(input,USING,FOLLOW_USING_in_join_condition494); 
					pushFollow(FOLLOW_column_list_in_join_condition496);
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
	// src/main/sqlplus/parser/SQLPlus.g:115:1: index_hint_list : index_hint ( COMMA index_hint )* ;
	public final void index_hint_list() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:116:2: ( index_hint ( COMMA index_hint )* )
			// src/main/sqlplus/parser/SQLPlus.g:116:4: index_hint ( COMMA index_hint )*
			{
			pushFollow(FOLLOW_index_hint_in_index_hint_list507);
			index_hint();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:116:15: ( COMMA index_hint )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==COMMA) ) {
					int LA24_1 = input.LA(2);
					if ( (LA24_1==TODO) ) {
						alt24=1;
					}

				}

				switch (alt24) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:116:16: COMMA index_hint
					{
					match(input,COMMA,FOLLOW_COMMA_in_index_hint_list510); 
					pushFollow(FOLLOW_index_hint_in_index_hint_list512);
					index_hint();
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
	// $ANTLR end "index_hint_list"



	// $ANTLR start "index_hint"
	// src/main/sqlplus/parser/SQLPlus.g:119:1: index_hint : TODO ;
	public final void index_hint() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:120:2: ( TODO )
			// src/main/sqlplus/parser/SQLPlus.g:120:4: TODO
			{
			match(input,TODO,FOLLOW_TODO_in_index_hint526); 
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
	// src/main/sqlplus/parser/SQLPlus.g:123:1: partition_clause : PARTITION LEFT_PARENTHESIS partition_names RIGHT_PARENTHESIS ;
	public final void partition_clause() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:124:2: ( PARTITION LEFT_PARENTHESIS partition_names RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:124:4: PARTITION LEFT_PARENTHESIS partition_names RIGHT_PARENTHESIS
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_partition_clause539); 
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_partition_clause541); 
			pushFollow(FOLLOW_partition_names_in_partition_clause543);
			partition_names();
			state._fsp--;

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_partition_clause545); 
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
	// src/main/sqlplus/parser/SQLPlus.g:127:1: partition_names : partition_name ( COMMA partition_name )* ;
	public final void partition_names() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:128:2: ( partition_name ( COMMA partition_name )* )
			// src/main/sqlplus/parser/SQLPlus.g:128:4: partition_name ( COMMA partition_name )*
			{
			pushFollow(FOLLOW_partition_name_in_partition_names557);
			partition_name();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:128:19: ( COMMA partition_name )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==COMMA) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:128:20: COMMA partition_name
					{
					match(input,COMMA,FOLLOW_COMMA_in_partition_names560); 
					pushFollow(FOLLOW_partition_name_in_partition_names562);
					partition_name();
					state._fsp--;

					}
					break;

				default :
					break loop25;
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
	// src/main/sqlplus/parser/SQLPlus.g:131:1: expression : TODO ;
	public final void expression() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:132:2: ( TODO )
			// src/main/sqlplus/parser/SQLPlus.g:132:4: TODO
			{
			match(input,TODO,FOLLOW_TODO_in_expression575); 
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
	// src/main/sqlplus/parser/SQLPlus.g:135:1: table_spec : ( schema_name DOT )? table_name ;
	public final void table_spec() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:136:2: ( ( schema_name DOT )? table_name )
			// src/main/sqlplus/parser/SQLPlus.g:136:4: ( schema_name DOT )? table_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:136:4: ( schema_name DOT )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==ID) ) {
				int LA26_1 = input.LA(2);
				if ( (LA26_1==DOT) ) {
					int LA26_2 = input.LA(3);
					if ( (LA26_2==ID) ) {
						alt26=1;
					}
				}
			}
			switch (alt26) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:136:5: schema_name DOT
					{
					pushFollow(FOLLOW_schema_name_in_table_spec588);
					schema_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_table_spec590); 
					}
					break;

			}

			pushFollow(FOLLOW_table_name_in_table_spec594);
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
	// src/main/sqlplus/parser/SQLPlus.g:139:1: column_spec : ( ( schema_name DOT )? table_name DOT )? column_name ;
	public final void column_spec() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:140:2: ( ( ( schema_name DOT )? table_name DOT )? column_name )
			// src/main/sqlplus/parser/SQLPlus.g:140:4: ( ( schema_name DOT )? table_name DOT )? column_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:140:4: ( ( schema_name DOT )? table_name DOT )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==ID) ) {
				int LA28_1 = input.LA(2);
				if ( (LA28_1==DOT) ) {
					alt28=1;
				}
			}
			switch (alt28) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:140:5: ( schema_name DOT )? table_name DOT
					{
					// src/main/sqlplus/parser/SQLPlus.g:140:5: ( schema_name DOT )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==ID) ) {
						int LA27_1 = input.LA(2);
						if ( (LA27_1==DOT) ) {
							int LA27_2 = input.LA(3);
							if ( (LA27_2==ID) ) {
								int LA27_3 = input.LA(4);
								if ( (LA27_3==DOT) ) {
									alt27=1;
								}
							}
						}
					}
					switch (alt27) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:140:6: schema_name DOT
							{
							pushFollow(FOLLOW_schema_name_in_column_spec607);
							schema_name();
							state._fsp--;

							match(input,DOT,FOLLOW_DOT_in_column_spec609); 
							}
							break;

					}

					pushFollow(FOLLOW_table_name_in_column_spec613);
					table_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_column_spec615); 
					}
					break;

			}

			pushFollow(FOLLOW_column_name_in_column_spec619);
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
	// src/main/sqlplus/parser/SQLPlus.g:143:1: column_list : TODO ;
	public final void column_list() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:144:2: ( TODO )
			// src/main/sqlplus/parser/SQLPlus.g:144:4: TODO
			{
			match(input,TODO,FOLLOW_TODO_in_column_list631); 
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
	// src/main/sqlplus/parser/SQLPlus.g:147:1: subquery : LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS ;
	public final void subquery() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:148:2: ( LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:148:4: LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_subquery644); 
			pushFollow(FOLLOW_select_statement_in_subquery646);
			select_statement();
			state._fsp--;

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_subquery648); 
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
	// src/main/sqlplus/parser/SQLPlus.g:151:1: alias : ( AS )? ID ;
	public final void alias() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:151:7: ( ( AS )? ID )
			// src/main/sqlplus/parser/SQLPlus.g:151:9: ( AS )? ID
			{
			// src/main/sqlplus/parser/SQLPlus.g:151:9: ( AS )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==AS) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:151:10: AS
					{
					match(input,AS,FOLLOW_AS_in_alias659); 
					}
					break;

			}

			match(input,ID,FOLLOW_ID_in_alias663); 
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
	// src/main/sqlplus/parser/SQLPlus.g:152:1: column_name : ID ;
	public final void column_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:152:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:152:15: ID
			{
			match(input,ID,FOLLOW_ID_in_column_name670); 
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
	// src/main/sqlplus/parser/SQLPlus.g:153:1: partition_name : ID ;
	public final void partition_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:153:16: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:153:18: ID
			{
			match(input,ID,FOLLOW_ID_in_partition_name677); 
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
	// src/main/sqlplus/parser/SQLPlus.g:154:1: schema_name : ID ;
	public final void schema_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:154:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:154:15: ID
			{
			match(input,ID,FOLLOW_ID_in_schema_name684); 
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
	// src/main/sqlplus/parser/SQLPlus.g:155:1: table_name : ID ;
	public final void table_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:155:12: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:155:14: ID
			{
			match(input,ID,FOLLOW_ID_in_table_name691); 
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
	// src/main/sqlplus/parser/SQLPlus.g:157:1: timing : ( BEFORE | AFTER );
	public final void timing() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:158:2: ( BEFORE | AFTER )
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
	// src/main/sqlplus/parser/SQLPlus.g:162:1: data_manipulation_language : ( INSERT | DELETE | UPDATE );
	public final void data_manipulation_language() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:163:2: ( INSERT | DELETE | UPDATE )
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
	// src/main/sqlplus/parser/SQLPlus.g:168:1: relational_operation : ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE );
	public final void relational_operation() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:169:2: ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE )
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
	// src/main/sqlplus/parser/SQLPlus.g:178:1: match_value : ( ID | QUESTION_MARK );
	public final void match_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:179:2: ( ID | QUESTION_MARK )
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



	public static final BitSet FOLLOW_sql_statement_in_sqlplus35 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sqlplus_alert_in_sqlplus45 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALERT_in_sqlplus_alert58 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_timing_in_sqlplus_alert60 = new BitSet(new long[]{0x0001000001004000L});
	public static final BitSet FOLLOW_data_manipulation_language_in_sqlplus_alert62 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IN_in_sqlplus_alert64 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert66 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IF_in_sqlplus_alert68 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert70 = new BitSet(new long[]{0x00000002700D0000L});
	public static final BitSet FOLLOW_relational_operation_in_sqlplus_alert72 = new BitSet(new long[]{0x0000004000100000L});
	public static final BitSet FOLLOW_match_value_in_sqlplus_alert74 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus_alert76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_statement_in_sql_statement104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_statement_in_sql_statement109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_databases_in_show_statement133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHOW_in_show_databases160 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DATABASES_in_show_databases162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_expression_in_select_statement175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select_expression187 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_select_list_in_select_expression189 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_FROM_in_select_expression192 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_references_in_select_expression194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_displayed_column_in_select_list209 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_select_list212 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_displayed_column_in_select_list214 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ASTERISK_in_select_list223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_spec_in_displayed_column236 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DOT_in_displayed_column238 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASTERISK_in_displayed_column240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_displayed_column245 = new BitSet(new long[]{0x0000000000100042L});
	public static final BitSet FOLLOW_alias_in_displayed_column248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_references261 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_table_references264 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_reference_in_table_references266 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_table_atom_in_table_reference285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_factor2_in_table_factor1296 = new BitSet(new long[]{0x0000000002800802L});
	public static final BitSet FOLLOW_JOIN_in_table_factor1308 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_atom_in_table_factor1310 = new BitSet(new long[]{0x0002000800000002L});
	public static final BitSet FOLLOW_join_condition_in_table_factor1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_factor3_in_table_factor2329 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_STRAIGHT_JOIN_in_table_factor2332 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_atom_in_table_factor2334 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_ON_in_table_factor2337 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_expression_in_table_factor2339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_factor4_in_table_factor3354 = new BitSet(new long[]{0x0000010004000002L});
	public static final BitSet FOLLOW_set_in_table_factor3357 = new BitSet(new long[]{0x0000001002000000L});
	public static final BitSet FOLLOW_OUTER_in_table_factor3364 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_JOIN_in_table_factor3368 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_factor4_in_table_factor3370 = new BitSet(new long[]{0x0002000800000000L});
	public static final BitSet FOLLOW_join_condition_in_table_factor3372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_atom_in_table_factor4386 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_NATURAL_in_table_factor4389 = new BitSet(new long[]{0x0000010006000000L});
	public static final BitSet FOLLOW_set_in_table_factor4392 = new BitSet(new long[]{0x0000001002000000L});
	public static final BitSet FOLLOW_OUTER_in_table_factor4399 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_JOIN_in_table_factor4405 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_atom_in_table_factor4407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_spec_in_table_atom421 = new BitSet(new long[]{0x0000402000100042L});
	public static final BitSet FOLLOW_partition_clause_in_table_atom424 = new BitSet(new long[]{0x0000400000100042L});
	public static final BitSet FOLLOW_alias_in_table_atom429 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_index_hint_list_in_table_atom434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_table_atom442 = new BitSet(new long[]{0x0000000000100040L});
	public static final BitSet FOLLOW_alias_in_table_atom444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_table_atom450 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_references_in_table_atom452 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_table_atom454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OJ_in_table_atom460 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_reference_in_table_atom462 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LEFT_in_table_atom464 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_OUTER_in_table_atom466 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_JOIN_in_table_atom468 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_reference_in_table_atom470 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ON_in_table_atom472 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_expression_in_table_atom474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_join_condition485 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_expression_in_join_condition487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_join_condition494 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_column_list_in_join_condition496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_hint_in_index_hint_list507 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_index_hint_list510 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_index_hint_in_index_hint_list512 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_TODO_in_index_hint526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_partition_clause539 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_partition_clause541 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_partition_names_in_partition_clause543 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_partition_clause545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partition_name_in_partition_names557 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_partition_names560 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_partition_name_in_partition_names562 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_TODO_in_expression575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_table_spec588 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DOT_in_table_spec590 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_table_name_in_table_spec594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_column_spec607 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DOT_in_column_spec609 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_table_name_in_column_spec613 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DOT_in_column_spec615 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_column_name_in_column_spec619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TODO_in_column_list631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_subquery644 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_select_statement_in_subquery646 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_subquery648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_alias659 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_alias663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partition_name677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_schema_name684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name691 = new BitSet(new long[]{0x0000000000000002L});
}
