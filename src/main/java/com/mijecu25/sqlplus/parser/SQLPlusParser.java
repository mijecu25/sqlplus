// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlus.g 2016-04-24 11:38:15

	package com.mijecu25.sqlplus.parser;
	
	import com.mijecu25.sqlplus.compiler.core.statement.Statement;
	import com.mijecu25.sqlplus.compiler.core.statement.StatementShowDatabases;
	import com.mijecu25.sqlplus.compiler.core.statement.StatementUseDatabase;


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
		"SHOW", "STRAIGHT_JOIN", "TODO", "UNDERSCORE", "UPDATE", "USE", "USING", 
		"WHERE", "WS"
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
	public static final int USE=49;
	public static final int USING=50;
	public static final int WHERE=51;
	public static final int WS=52;

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
	// src/main/sqlplus/parser/SQLPlus.g:14:1: sqlplus returns [Statement statement] : ( sql_statement | sqlplus_alert );
	public final Statement sqlplus() throws RecognitionException {
		Statement statement = null;


		Statement sql_statement1 =null;


				statement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:18:2: ( sql_statement | sqlplus_alert )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==SELECT||LA1_0==SHOW||LA1_0==USE) ) {
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
					// src/main/sqlplus/parser/SQLPlus.g:18:5: sql_statement
					{
					pushFollow(FOLLOW_sql_statement_in_sqlplus35);
					sql_statement1=sql_statement();
					state._fsp--;


								statement = sql_statement1;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:22:4: sqlplus_alert
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
	// src/main/sqlplus/parser/SQLPlus.g:26:1: sqlplus_alert : ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON ;
	public final void sqlplus_alert() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:27:2: ( ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON )
			// src/main/sqlplus/parser/SQLPlus.g:27:4: ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON
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
	// src/main/sqlplus/parser/SQLPlus.g:33:1: sql_statement returns [Statement sqlStatement] : ( select_statement | show_statement | use_statement );
	public final Statement sql_statement() throws RecognitionException {
		Statement sqlStatement = null;


		Statement show_statement2 =null;
		Statement use_statement3 =null;


				sqlStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:37:2: ( select_statement | show_statement | use_statement )
			int alt2=3;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				alt2=1;
				}
				break;
			case SHOW:
				{
				alt2=2;
				}
				break;
			case USE:
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
					// src/main/sqlplus/parser/SQLPlus.g:37:4: select_statement
					{
					pushFollow(FOLLOW_select_statement_in_sql_statement104);
					select_statement();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:38:4: show_statement
					{
					pushFollow(FOLLOW_show_statement_in_sql_statement109);
					show_statement2=show_statement();
					state._fsp--;


								sqlStatement = show_statement2;
							
					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:41:4: use_statement
					{
					pushFollow(FOLLOW_use_statement_in_sql_statement116);
					use_statement3=use_statement();
					state._fsp--;


								sqlStatement = use_statement3;
							
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



	// $ANTLR start "use_statement"
	// src/main/sqlplus/parser/SQLPlus.g:46:1: use_statement returns [Statement useStatement] : use_database ;
	public final Statement use_statement() throws RecognitionException {
		Statement useStatement = null;


		Statement use_database4 =null;


				useStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:50:2: ( use_database )
			// src/main/sqlplus/parser/SQLPlus.g:50:4: use_database
			{
			pushFollow(FOLLOW_use_database_in_use_statement140);
			use_database4=use_database();
			state._fsp--;


						useStatement = use_database4;
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return useStatement;
	}
	// $ANTLR end "use_statement"



	// $ANTLR start "use_database"
	// src/main/sqlplus/parser/SQLPlus.g:55:1: use_database returns [Statement useDatabaseStatement] : USE database= schema_name ;
	public final Statement use_database() throws RecognitionException {
		Statement useDatabaseStatement = null;


		ParserRuleReturnScope database =null;


				useDatabaseStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:59:2: ( USE database= schema_name )
			// src/main/sqlplus/parser/SQLPlus.g:59:4: USE database= schema_name
			{
			match(input,USE,FOLLOW_USE_in_use_database164); 
			pushFollow(FOLLOW_schema_name_in_use_database173);
			database=schema_name();
			state._fsp--;


						useDatabaseStatement = new StatementUseDatabase("use " + (database!=null?input.toString(database.start,database.stop):null), (database!=null?input.toString(database.start,database.stop):null));
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return useDatabaseStatement;
	}
	// $ANTLR end "use_database"



	// $ANTLR start "show_statement"
	// src/main/sqlplus/parser/SQLPlus.g:65:1: show_statement returns [Statement showStatement] : show_databases ;
	public final Statement show_statement() throws RecognitionException {
		Statement showStatement = null;


		Statement show_databases5 =null;


				showStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:69:2: ( show_databases )
			// src/main/sqlplus/parser/SQLPlus.g:69:4: show_databases
			{
			pushFollow(FOLLOW_show_databases_in_show_statement197);
			show_databases5=show_databases();
			state._fsp--;

			 
						showStatement = show_databases5;
					
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
	// src/main/sqlplus/parser/SQLPlus.g:74:1: show_databases returns [Statement showDatabasesStatement] : SHOW DATABASES ;
	public final Statement show_databases() throws RecognitionException {
		Statement showDatabasesStatement = null;



				showDatabasesStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:78:2: ( SHOW DATABASES )
			// src/main/sqlplus/parser/SQLPlus.g:78:4: SHOW DATABASES
			{
			match(input,SHOW,FOLLOW_SHOW_in_show_databases224); 
			match(input,DATABASES,FOLLOW_DATABASES_in_show_databases226); 
			 
						showDatabasesStatement = new StatementShowDatabases("show databases"); 
					
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
	// src/main/sqlplus/parser/SQLPlus.g:83:1: select_statement : select_expression ;
	public final void select_statement() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:84:2: ( select_expression )
			// src/main/sqlplus/parser/SQLPlus.g:84:4: select_expression
			{
			pushFollow(FOLLOW_select_expression_in_select_statement239);
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
	// src/main/sqlplus/parser/SQLPlus.g:87:1: select_expression : SELECT select_list ( FROM table_references )? ;
	public final void select_expression() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:88:2: ( SELECT select_list ( FROM table_references )? )
			// src/main/sqlplus/parser/SQLPlus.g:88:4: SELECT select_list ( FROM table_references )?
			{
			match(input,SELECT,FOLLOW_SELECT_in_select_expression251); 
			pushFollow(FOLLOW_select_list_in_select_expression253);
			select_list();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:88:23: ( FROM table_references )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==FROM) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:88:24: FROM table_references
					{
					match(input,FROM,FOLLOW_FROM_in_select_expression256); 
					pushFollow(FOLLOW_table_references_in_select_expression258);
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
	// src/main/sqlplus/parser/SQLPlus.g:91:1: select_list : ( displayed_column ( COMMA displayed_column )* | ASTERISK );
	public final void select_list() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:92:2: ( displayed_column ( COMMA displayed_column )* | ASTERISK )
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
					// src/main/sqlplus/parser/SQLPlus.g:92:4: displayed_column ( COMMA displayed_column )*
					{
					pushFollow(FOLLOW_displayed_column_in_select_list273);
					displayed_column();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:92:21: ( COMMA displayed_column )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMA) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:92:22: COMMA displayed_column
							{
							match(input,COMMA,FOLLOW_COMMA_in_select_list276); 
							pushFollow(FOLLOW_displayed_column_in_select_list278);
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
					// src/main/sqlplus/parser/SQLPlus.g:93:5: ASTERISK
					{
					match(input,ASTERISK,FOLLOW_ASTERISK_in_select_list287); 
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
	// src/main/sqlplus/parser/SQLPlus.g:96:1: displayed_column : ( table_spec DOT ASTERISK | column_spec ( alias )? );
	public final void displayed_column() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:97:2: ( table_spec DOT ASTERISK | column_spec ( alias )? )
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
					// src/main/sqlplus/parser/SQLPlus.g:97:4: table_spec DOT ASTERISK
					{
					pushFollow(FOLLOW_table_spec_in_displayed_column300);
					table_spec();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_displayed_column302); 
					match(input,ASTERISK,FOLLOW_ASTERISK_in_displayed_column304); 
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:98:4: column_spec ( alias )?
					{
					pushFollow(FOLLOW_column_spec_in_displayed_column309);
					column_spec();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:98:16: ( alias )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==AS||LA6_0==ID) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:98:17: alias
							{
							pushFollow(FOLLOW_alias_in_displayed_column312);
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
	// src/main/sqlplus/parser/SQLPlus.g:101:1: table_references : table_reference ( COMMA table_reference )* ;
	public final void table_references() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:102:2: ( table_reference ( COMMA table_reference )* )
			// src/main/sqlplus/parser/SQLPlus.g:102:4: table_reference ( COMMA table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_references325);
			table_reference();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:102:20: ( COMMA table_reference )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:102:21: COMMA table_reference
					{
					match(input,COMMA,FOLLOW_COMMA_in_table_references328); 
					pushFollow(FOLLOW_table_reference_in_table_references330);
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
	// src/main/sqlplus/parser/SQLPlus.g:105:1: table_reference : table_atom ;
	public final void table_reference() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:106:2: ( table_atom )
			// src/main/sqlplus/parser/SQLPlus.g:107:9: table_atom
			{
			pushFollow(FOLLOW_table_atom_in_table_reference349);
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
	// src/main/sqlplus/parser/SQLPlus.g:110:1: table_factor1 : table_factor2 ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )? ;
	public final void table_factor1() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:111:2: ( table_factor2 ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )? )
			// src/main/sqlplus/parser/SQLPlus.g:111:4: table_factor2 ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )?
			{
			pushFollow(FOLLOW_table_factor2_in_table_factor1360);
			table_factor2();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:111:18: ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==CROSS||LA11_0==INNER||LA11_0==JOIN) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:111:19: ( INNER | CROSS )? JOIN table_atom ( join_condition )?
					{
					// src/main/sqlplus/parser/SQLPlus.g:111:19: ( INNER | CROSS )?
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

					match(input,JOIN,FOLLOW_JOIN_in_table_factor1372); 
					pushFollow(FOLLOW_table_atom_in_table_factor1374);
					table_atom();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:111:52: ( join_condition )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ON||LA10_0==USING) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:111:53: join_condition
							{
							pushFollow(FOLLOW_join_condition_in_table_factor1377);
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
	// src/main/sqlplus/parser/SQLPlus.g:114:1: table_factor2 : table_factor3 ( STRAIGHT_JOIN table_atom ( ON expression )? )? ;
	public final void table_factor2() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:115:2: ( table_factor3 ( STRAIGHT_JOIN table_atom ( ON expression )? )? )
			// src/main/sqlplus/parser/SQLPlus.g:115:4: table_factor3 ( STRAIGHT_JOIN table_atom ( ON expression )? )?
			{
			pushFollow(FOLLOW_table_factor3_in_table_factor2393);
			table_factor3();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:115:18: ( STRAIGHT_JOIN table_atom ( ON expression )? )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==STRAIGHT_JOIN) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:115:19: STRAIGHT_JOIN table_atom ( ON expression )?
					{
					match(input,STRAIGHT_JOIN,FOLLOW_STRAIGHT_JOIN_in_table_factor2396); 
					pushFollow(FOLLOW_table_atom_in_table_factor2398);
					table_atom();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:115:44: ( ON expression )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==ON) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:115:45: ON expression
							{
							match(input,ON,FOLLOW_ON_in_table_factor2401); 
							pushFollow(FOLLOW_expression_in_table_factor2403);
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
	// src/main/sqlplus/parser/SQLPlus.g:118:1: table_factor3 : table_factor4 ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )? ;
	public final void table_factor3() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:119:2: ( table_factor4 ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )? )
			// src/main/sqlplus/parser/SQLPlus.g:119:4: table_factor4 ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )?
			{
			pushFollow(FOLLOW_table_factor4_in_table_factor3418);
			table_factor4();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:119:18: ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==LEFT||LA15_0==RIGHT) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:119:19: ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition
					{
					if ( input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// src/main/sqlplus/parser/SQLPlus.g:119:32: ( OUTER )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==OUTER) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:119:33: OUTER
							{
							match(input,OUTER,FOLLOW_OUTER_in_table_factor3428); 
							}
							break;

					}

					match(input,JOIN,FOLLOW_JOIN_in_table_factor3432); 
					pushFollow(FOLLOW_table_factor4_in_table_factor3434);
					table_factor4();
					state._fsp--;

					pushFollow(FOLLOW_join_condition_in_table_factor3436);
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
	// src/main/sqlplus/parser/SQLPlus.g:122:1: table_factor4 : table_atom ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )? ;
	public final void table_factor4() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:123:2: ( table_atom ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )? )
			// src/main/sqlplus/parser/SQLPlus.g:123:4: table_atom ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )?
			{
			pushFollow(FOLLOW_table_atom_in_table_factor4450);
			table_atom();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:123:15: ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==NATURAL) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:123:16: NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom
					{
					match(input,NATURAL,FOLLOW_NATURAL_in_table_factor4453); 
					// src/main/sqlplus/parser/SQLPlus.g:123:24: ( ( LEFT | RIGHT ) ( OUTER )? )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==LEFT||LA17_0==RIGHT) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:123:25: ( LEFT | RIGHT ) ( OUTER )?
							{
							if ( input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							// src/main/sqlplus/parser/SQLPlus.g:123:38: ( OUTER )?
							int alt16=2;
							int LA16_0 = input.LA(1);
							if ( (LA16_0==OUTER) ) {
								alt16=1;
							}
							switch (alt16) {
								case 1 :
									// src/main/sqlplus/parser/SQLPlus.g:123:39: OUTER
									{
									match(input,OUTER,FOLLOW_OUTER_in_table_factor4463); 
									}
									break;

							}

							}
							break;

					}

					match(input,JOIN,FOLLOW_JOIN_in_table_factor4469); 
					pushFollow(FOLLOW_table_atom_in_table_factor4471);
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
	// src/main/sqlplus/parser/SQLPlus.g:126:1: table_atom : ( table_spec ( partition_clause )? ( alias )? ( index_hint_list )? | subquery alias | LEFT_PARENTHESIS table_references RIGHT_PARENTHESIS | OJ table_reference LEFT OUTER JOIN table_reference ON expression );
	public final void table_atom() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:127:2: ( table_spec ( partition_clause )? ( alias )? ( index_hint_list )? | subquery alias | LEFT_PARENTHESIS table_references RIGHT_PARENTHESIS | OJ table_reference LEFT OUTER JOIN table_reference ON expression )
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
					// src/main/sqlplus/parser/SQLPlus.g:127:4: table_spec ( partition_clause )? ( alias )? ( index_hint_list )?
					{
					pushFollow(FOLLOW_table_spec_in_table_atom485);
					table_spec();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:127:15: ( partition_clause )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==PARTITION) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:127:16: partition_clause
							{
							pushFollow(FOLLOW_partition_clause_in_table_atom488);
							partition_clause();
							state._fsp--;

							}
							break;

					}

					// src/main/sqlplus/parser/SQLPlus.g:127:35: ( alias )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==AS||LA20_0==ID) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:127:36: alias
							{
							pushFollow(FOLLOW_alias_in_table_atom493);
							alias();
							state._fsp--;

							}
							break;

					}

					// src/main/sqlplus/parser/SQLPlus.g:127:44: ( index_hint_list )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==TODO) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:127:45: index_hint_list
							{
							pushFollow(FOLLOW_index_hint_list_in_table_atom498);
							index_hint_list();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:128:5: subquery alias
					{
					pushFollow(FOLLOW_subquery_in_table_atom506);
					subquery();
					state._fsp--;

					pushFollow(FOLLOW_alias_in_table_atom508);
					alias();
					state._fsp--;

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:129:5: LEFT_PARENTHESIS table_references RIGHT_PARENTHESIS
					{
					match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_table_atom514); 
					pushFollow(FOLLOW_table_references_in_table_atom516);
					table_references();
					state._fsp--;

					match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_table_atom518); 
					}
					break;
				case 4 :
					// src/main/sqlplus/parser/SQLPlus.g:130:5: OJ table_reference LEFT OUTER JOIN table_reference ON expression
					{
					match(input,OJ,FOLLOW_OJ_in_table_atom524); 
					pushFollow(FOLLOW_table_reference_in_table_atom526);
					table_reference();
					state._fsp--;

					match(input,LEFT,FOLLOW_LEFT_in_table_atom528); 
					match(input,OUTER,FOLLOW_OUTER_in_table_atom530); 
					match(input,JOIN,FOLLOW_JOIN_in_table_atom532); 
					pushFollow(FOLLOW_table_reference_in_table_atom534);
					table_reference();
					state._fsp--;

					match(input,ON,FOLLOW_ON_in_table_atom536); 
					pushFollow(FOLLOW_expression_in_table_atom538);
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
	// src/main/sqlplus/parser/SQLPlus.g:133:1: join_condition : ( ON expression | USING column_list );
	public final void join_condition() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:134:2: ( ON expression | USING column_list )
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
					// src/main/sqlplus/parser/SQLPlus.g:134:4: ON expression
					{
					match(input,ON,FOLLOW_ON_in_join_condition549); 
					pushFollow(FOLLOW_expression_in_join_condition551);
					expression();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:135:5: USING column_list
					{
					match(input,USING,FOLLOW_USING_in_join_condition558); 
					pushFollow(FOLLOW_column_list_in_join_condition560);
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
	// src/main/sqlplus/parser/SQLPlus.g:138:1: index_hint_list : index_hint ( COMMA index_hint )* ;
	public final void index_hint_list() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:139:2: ( index_hint ( COMMA index_hint )* )
			// src/main/sqlplus/parser/SQLPlus.g:139:4: index_hint ( COMMA index_hint )*
			{
			pushFollow(FOLLOW_index_hint_in_index_hint_list571);
			index_hint();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:139:15: ( COMMA index_hint )*
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
					// src/main/sqlplus/parser/SQLPlus.g:139:16: COMMA index_hint
					{
					match(input,COMMA,FOLLOW_COMMA_in_index_hint_list574); 
					pushFollow(FOLLOW_index_hint_in_index_hint_list576);
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
	// src/main/sqlplus/parser/SQLPlus.g:142:1: index_hint : TODO ;
	public final void index_hint() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:143:2: ( TODO )
			// src/main/sqlplus/parser/SQLPlus.g:143:4: TODO
			{
			match(input,TODO,FOLLOW_TODO_in_index_hint590); 
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
	// src/main/sqlplus/parser/SQLPlus.g:146:1: partition_clause : PARTITION LEFT_PARENTHESIS partition_names RIGHT_PARENTHESIS ;
	public final void partition_clause() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:147:2: ( PARTITION LEFT_PARENTHESIS partition_names RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:147:4: PARTITION LEFT_PARENTHESIS partition_names RIGHT_PARENTHESIS
			{
			match(input,PARTITION,FOLLOW_PARTITION_in_partition_clause603); 
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_partition_clause605); 
			pushFollow(FOLLOW_partition_names_in_partition_clause607);
			partition_names();
			state._fsp--;

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_partition_clause609); 
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
	// src/main/sqlplus/parser/SQLPlus.g:150:1: partition_names : partition_name ( COMMA partition_name )* ;
	public final void partition_names() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:151:2: ( partition_name ( COMMA partition_name )* )
			// src/main/sqlplus/parser/SQLPlus.g:151:4: partition_name ( COMMA partition_name )*
			{
			pushFollow(FOLLOW_partition_name_in_partition_names621);
			partition_name();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:151:19: ( COMMA partition_name )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==COMMA) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:151:20: COMMA partition_name
					{
					match(input,COMMA,FOLLOW_COMMA_in_partition_names624); 
					pushFollow(FOLLOW_partition_name_in_partition_names626);
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
	// src/main/sqlplus/parser/SQLPlus.g:154:1: expression : TODO ;
	public final void expression() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:155:2: ( TODO )
			// src/main/sqlplus/parser/SQLPlus.g:155:4: TODO
			{
			match(input,TODO,FOLLOW_TODO_in_expression639); 
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
	// src/main/sqlplus/parser/SQLPlus.g:158:1: table_spec : ( schema_name DOT )? table_name ;
	public final void table_spec() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:159:2: ( ( schema_name DOT )? table_name )
			// src/main/sqlplus/parser/SQLPlus.g:159:4: ( schema_name DOT )? table_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:159:4: ( schema_name DOT )?
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
					// src/main/sqlplus/parser/SQLPlus.g:159:5: schema_name DOT
					{
					pushFollow(FOLLOW_schema_name_in_table_spec652);
					schema_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_table_spec654); 
					}
					break;

			}

			pushFollow(FOLLOW_table_name_in_table_spec658);
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
	// src/main/sqlplus/parser/SQLPlus.g:162:1: column_spec : ( ( schema_name DOT )? table_name DOT )? column_name ;
	public final void column_spec() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:163:2: ( ( ( schema_name DOT )? table_name DOT )? column_name )
			// src/main/sqlplus/parser/SQLPlus.g:163:4: ( ( schema_name DOT )? table_name DOT )? column_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:163:4: ( ( schema_name DOT )? table_name DOT )?
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
					// src/main/sqlplus/parser/SQLPlus.g:163:5: ( schema_name DOT )? table_name DOT
					{
					// src/main/sqlplus/parser/SQLPlus.g:163:5: ( schema_name DOT )?
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
							// src/main/sqlplus/parser/SQLPlus.g:163:6: schema_name DOT
							{
							pushFollow(FOLLOW_schema_name_in_column_spec671);
							schema_name();
							state._fsp--;

							match(input,DOT,FOLLOW_DOT_in_column_spec673); 
							}
							break;

					}

					pushFollow(FOLLOW_table_name_in_column_spec677);
					table_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_column_spec679); 
					}
					break;

			}

			pushFollow(FOLLOW_column_name_in_column_spec683);
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
	// src/main/sqlplus/parser/SQLPlus.g:166:1: column_list : TODO ;
	public final void column_list() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:167:2: ( TODO )
			// src/main/sqlplus/parser/SQLPlus.g:167:4: TODO
			{
			match(input,TODO,FOLLOW_TODO_in_column_list695); 
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
	// src/main/sqlplus/parser/SQLPlus.g:170:1: subquery : LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS ;
	public final void subquery() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:171:2: ( LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:171:4: LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_subquery708); 
			pushFollow(FOLLOW_select_statement_in_subquery710);
			select_statement();
			state._fsp--;

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_subquery712); 
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
	// src/main/sqlplus/parser/SQLPlus.g:174:1: alias : ( AS )? ID ;
	public final void alias() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:174:7: ( ( AS )? ID )
			// src/main/sqlplus/parser/SQLPlus.g:174:9: ( AS )? ID
			{
			// src/main/sqlplus/parser/SQLPlus.g:174:9: ( AS )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==AS) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:174:10: AS
					{
					match(input,AS,FOLLOW_AS_in_alias723); 
					}
					break;

			}

			match(input,ID,FOLLOW_ID_in_alias727); 
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
	// src/main/sqlplus/parser/SQLPlus.g:175:1: column_name : ID ;
	public final void column_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:175:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:175:15: ID
			{
			match(input,ID,FOLLOW_ID_in_column_name734); 
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
	// src/main/sqlplus/parser/SQLPlus.g:176:1: partition_name : ID ;
	public final void partition_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:176:16: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:176:18: ID
			{
			match(input,ID,FOLLOW_ID_in_partition_name741); 
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


	public static class schema_name_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "schema_name"
	// src/main/sqlplus/parser/SQLPlus.g:177:1: schema_name : ID ;
	public final SQLPlusParser.schema_name_return schema_name() throws RecognitionException {
		SQLPlusParser.schema_name_return retval = new SQLPlusParser.schema_name_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:177:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:177:15: ID
			{
			match(input,ID,FOLLOW_ID_in_schema_name748); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "schema_name"



	// $ANTLR start "table_name"
	// src/main/sqlplus/parser/SQLPlus.g:178:1: table_name : ID ;
	public final void table_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:178:12: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:178:14: ID
			{
			match(input,ID,FOLLOW_ID_in_table_name755); 
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
	// src/main/sqlplus/parser/SQLPlus.g:180:1: timing : ( BEFORE | AFTER );
	public final void timing() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:181:2: ( BEFORE | AFTER )
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
	// src/main/sqlplus/parser/SQLPlus.g:185:1: data_manipulation_language : ( INSERT | DELETE | UPDATE );
	public final void data_manipulation_language() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:186:2: ( INSERT | DELETE | UPDATE )
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
	// src/main/sqlplus/parser/SQLPlus.g:191:1: relational_operation : ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE );
	public final void relational_operation() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:192:2: ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE )
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
	// src/main/sqlplus/parser/SQLPlus.g:201:1: match_value : ( ID | QUESTION_MARK );
	public final void match_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:202:2: ( ID | QUESTION_MARK )
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
	public static final BitSet FOLLOW_use_statement_in_sql_statement116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_database_in_use_statement140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_use_database164 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_schema_name_in_use_database173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_databases_in_show_statement197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHOW_in_show_databases224 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DATABASES_in_show_databases226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_expression_in_select_statement239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select_expression251 = new BitSet(new long[]{0x0000000000100080L});
	public static final BitSet FOLLOW_select_list_in_select_expression253 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_FROM_in_select_expression256 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_references_in_select_expression258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_displayed_column_in_select_list273 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_select_list276 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_displayed_column_in_select_list278 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ASTERISK_in_select_list287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_spec_in_displayed_column300 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DOT_in_displayed_column302 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASTERISK_in_displayed_column304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_displayed_column309 = new BitSet(new long[]{0x0000000000100042L});
	public static final BitSet FOLLOW_alias_in_displayed_column312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_references325 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_table_references328 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_reference_in_table_references330 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_table_atom_in_table_reference349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_factor2_in_table_factor1360 = new BitSet(new long[]{0x0000000002800802L});
	public static final BitSet FOLLOW_JOIN_in_table_factor1372 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_atom_in_table_factor1374 = new BitSet(new long[]{0x0004000800000002L});
	public static final BitSet FOLLOW_join_condition_in_table_factor1377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_factor3_in_table_factor2393 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_STRAIGHT_JOIN_in_table_factor2396 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_atom_in_table_factor2398 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_ON_in_table_factor2401 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_expression_in_table_factor2403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_factor4_in_table_factor3418 = new BitSet(new long[]{0x0000010004000002L});
	public static final BitSet FOLLOW_set_in_table_factor3421 = new BitSet(new long[]{0x0000001002000000L});
	public static final BitSet FOLLOW_OUTER_in_table_factor3428 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_JOIN_in_table_factor3432 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_factor4_in_table_factor3434 = new BitSet(new long[]{0x0004000800000000L});
	public static final BitSet FOLLOW_join_condition_in_table_factor3436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_atom_in_table_factor4450 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_NATURAL_in_table_factor4453 = new BitSet(new long[]{0x0000010006000000L});
	public static final BitSet FOLLOW_set_in_table_factor4456 = new BitSet(new long[]{0x0000001002000000L});
	public static final BitSet FOLLOW_OUTER_in_table_factor4463 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_JOIN_in_table_factor4469 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_atom_in_table_factor4471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_spec_in_table_atom485 = new BitSet(new long[]{0x0000402000100042L});
	public static final BitSet FOLLOW_partition_clause_in_table_atom488 = new BitSet(new long[]{0x0000400000100042L});
	public static final BitSet FOLLOW_alias_in_table_atom493 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_index_hint_list_in_table_atom498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_table_atom506 = new BitSet(new long[]{0x0000000000100040L});
	public static final BitSet FOLLOW_alias_in_table_atom508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_table_atom514 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_references_in_table_atom516 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_table_atom518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OJ_in_table_atom524 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_reference_in_table_atom526 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LEFT_in_table_atom528 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_OUTER_in_table_atom530 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_JOIN_in_table_atom532 = new BitSet(new long[]{0x0000000408100000L});
	public static final BitSet FOLLOW_table_reference_in_table_atom534 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_ON_in_table_atom536 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_expression_in_table_atom538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_join_condition549 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_expression_in_join_condition551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_join_condition558 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_column_list_in_join_condition560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_hint_in_index_hint_list571 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_index_hint_list574 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_index_hint_in_index_hint_list576 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_TODO_in_index_hint590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARTITION_in_partition_clause603 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_partition_clause605 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_partition_names_in_partition_clause607 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_partition_clause609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partition_name_in_partition_names621 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_partition_names624 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_partition_name_in_partition_names626 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_TODO_in_expression639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_table_spec652 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DOT_in_table_spec654 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_table_name_in_table_spec658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_column_spec671 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DOT_in_column_spec673 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_table_name_in_column_spec677 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DOT_in_column_spec679 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_column_name_in_column_spec683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TODO_in_column_list695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_subquery708 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_select_statement_in_subquery710 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_subquery712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_alias723 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_alias727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partition_name741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_schema_name748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name755 = new BitSet(new long[]{0x0000000000000002L});
}
