// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlus.g 2016-06-06 19:07:20

	package com.mijecu25.sqlplus.parser;

	import com.mijecu25.sqlplus.compiler.core.statement.Statement;
	import com.mijecu25.sqlplus.compiler.core.statement.StatementShowDatabases;
	import com.mijecu25.sqlplus.compiler.core.statement.StatementUseDatabase;
	import com.mijecu25.sqlplus.compiler.core.statement.StatementShowTables;
	import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementDML;
	import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementSelect;
	import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementSelectExpression;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SQLPlusParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFTER", "ALERT", "AS", "ASTERISK", 
		"BEFORE", "COLON", "COMMA", "DASH", "DATABASES", "DELETE", "DOT", "EQUAL", 
		"FROM", "GREATER_THAN", "GREATER_THAN_EQUAL", "ID", "IF", "IN", "INSERT", 
		"LEFT_PARENTHESIS", "LESS_THAN", "LESS_THAN_EQUAL", "LIKE", "NEWLINE", 
		"NOT_EQUAL", "QUESTION_MARK", "QUOTE", "RIGHT_PARENTHESIS", "SELECT", 
		"SEMICOLON", "SHOW", "TABLES", "UNDERSCORE", "UPDATE", "USE", "WHERE", 
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
	public static final int TABLES=35;
	public static final int UNDERSCORE=36;
	public static final int UPDATE=37;
	public static final int USE=38;
	public static final int WHERE=39;
	public static final int WS=40;

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
	// src/main/sqlplus/parser/SQLPlus.g:18:1: sqlplus returns [Statement statement] : ( sql_statement | sqlplus_alert );
	public final Statement sqlplus() throws RecognitionException {
		Statement statement = null;


		Statement sql_statement1 =null;


				statement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:22:2: ( sql_statement | sqlplus_alert )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==QUESTION_MARK||LA1_0==SELECT||LA1_0==SHOW||LA1_0==USE) ) {
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
					// src/main/sqlplus/parser/SQLPlus.g:22:5: sql_statement
					{
					pushFollow(FOLLOW_sql_statement_in_sqlplus35);
					sql_statement1=sql_statement();
					state._fsp--;


								statement = sql_statement1;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:26:4: sqlplus_alert
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
	// src/main/sqlplus/parser/SQLPlus.g:30:1: sqlplus_alert : ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON ;
	public final void sqlplus_alert() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:31:2: ( ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON )
			// src/main/sqlplus/parser/SQLPlus.g:31:4: ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON
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
	// src/main/sqlplus/parser/SQLPlus.g:37:1: sql_statement returns [Statement sqlStatement] : ( select_statement | show_statement | use_statement );
	public final Statement sql_statement() throws RecognitionException {
		Statement sqlStatement = null;


		Statement select_statement2 =null;
		Statement show_statement3 =null;
		Statement use_statement4 =null;


				sqlStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:41:2: ( select_statement | show_statement | use_statement )
			int alt2=3;
			switch ( input.LA(1) ) {
			case QUESTION_MARK:
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
					// src/main/sqlplus/parser/SQLPlus.g:41:4: select_statement
					{
					pushFollow(FOLLOW_select_statement_in_sql_statement104);
					select_statement2=select_statement();
					state._fsp--;


								sqlStatement = select_statement2;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:44:4: show_statement
					{
					pushFollow(FOLLOW_show_statement_in_sql_statement111);
					show_statement3=show_statement();
					state._fsp--;


								sqlStatement = show_statement3;
							
					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:47:4: use_statement
					{
					pushFollow(FOLLOW_use_statement_in_sql_statement118);
					use_statement4=use_statement();
					state._fsp--;


								sqlStatement = use_statement4;
							
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
	// src/main/sqlplus/parser/SQLPlus.g:52:1: use_statement returns [Statement useStatement] : use_database ;
	public final Statement use_statement() throws RecognitionException {
		Statement useStatement = null;


		Statement use_database5 =null;


				useStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:56:2: ( use_database )
			// src/main/sqlplus/parser/SQLPlus.g:56:4: use_database
			{
			pushFollow(FOLLOW_use_database_in_use_statement142);
			use_database5=use_database();
			state._fsp--;


						useStatement = use_database5;
					
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
	// src/main/sqlplus/parser/SQLPlus.g:61:1: use_database returns [Statement useDatabaseStatement] : USE database= schema_name ;
	public final Statement use_database() throws RecognitionException {
		Statement useDatabaseStatement = null;


		ParserRuleReturnScope database =null;


				useDatabaseStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:65:2: ( USE database= schema_name )
			// src/main/sqlplus/parser/SQLPlus.g:65:4: USE database= schema_name
			{
			match(input,USE,FOLLOW_USE_in_use_database166); 
			pushFollow(FOLLOW_schema_name_in_use_database175);
			database=schema_name();
			state._fsp--;


						useDatabaseStatement = new StatementUseDatabase((database!=null?input.toString(database.start,database.stop):null));
					
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
	// src/main/sqlplus/parser/SQLPlus.g:71:1: show_statement returns [Statement showStatement] : ( show_databases | show_tables );
	public final Statement show_statement() throws RecognitionException {
		Statement showStatement = null;


		Statement show_databases6 =null;
		Statement show_tables7 =null;


				showStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:75:2: ( show_databases | show_tables )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==SHOW) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==DATABASES) ) {
					alt3=1;
				}
				else if ( (LA3_1==TABLES) ) {
					alt3=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:75:4: show_databases
					{
					pushFollow(FOLLOW_show_databases_in_show_statement199);
					show_databases6=show_databases();
					state._fsp--;

					 
								showStatement = show_databases6;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:78:4: show_tables
					{
					pushFollow(FOLLOW_show_tables_in_show_statement206);
					show_tables7=show_tables();
					state._fsp--;


								showStatement = show_tables7;
						
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
		return showStatement;
	}
	// $ANTLR end "show_statement"



	// $ANTLR start "show_tables"
	// src/main/sqlplus/parser/SQLPlus.g:83:1: show_tables returns [Statement showTablesStatement] : SHOW TABLES ;
	public final Statement show_tables() throws RecognitionException {
		Statement showTablesStatement = null;



				showTablesStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:87:2: ( SHOW TABLES )
			// src/main/sqlplus/parser/SQLPlus.g:87:4: SHOW TABLES
			{
			match(input,SHOW,FOLLOW_SHOW_in_show_tables229); 
			match(input,TABLES,FOLLOW_TABLES_in_show_tables231); 

						showTablesStatement = new StatementShowTables();
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return showTablesStatement;
	}
	// $ANTLR end "show_tables"



	// $ANTLR start "show_databases"
	// src/main/sqlplus/parser/SQLPlus.g:92:1: show_databases returns [Statement showDatabasesStatement] : SHOW DATABASES ;
	public final Statement show_databases() throws RecognitionException {
		Statement showDatabasesStatement = null;



				showDatabasesStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:96:2: ( SHOW DATABASES )
			// src/main/sqlplus/parser/SQLPlus.g:96:4: SHOW DATABASES
			{
			match(input,SHOW,FOLLOW_SHOW_in_show_databases255); 
			match(input,DATABASES,FOLLOW_DATABASES_in_show_databases257); 
			 
						showDatabasesStatement = new StatementShowDatabases(); 
					
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
	// src/main/sqlplus/parser/SQLPlus.g:101:1: select_statement returns [Statement selectStatement] : ( select_expression | QUESTION_MARK select_expression );
	public final Statement select_statement() throws RecognitionException {
		Statement selectStatement = null;


		Statement select_expression8 =null;


				selectStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:105:2: ( select_expression | QUESTION_MARK select_expression )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==SELECT) ) {
				alt4=1;
			}
			else if ( (LA4_0==QUESTION_MARK) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:105:4: select_expression
					{
					pushFollow(FOLLOW_select_expression_in_select_statement280);
					select_expression8=select_expression();
					state._fsp--;


								selectStatement = select_expression8;
						
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:108:4: QUESTION_MARK select_expression
					{
					match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_select_statement287); 
					pushFollow(FOLLOW_select_expression_in_select_statement289);
					select_expression();
					state._fsp--;

					 selectStatement = new StatementSelect(); 
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
		return selectStatement;
	}
	// $ANTLR end "select_statement"



	// $ANTLR start "select_expression"
	// src/main/sqlplus/parser/SQLPlus.g:111:1: select_expression returns [Statement selectExpression] : SELECT select_list ( FROM table_references )? ;
	public final Statement select_expression() throws RecognitionException {
		Statement selectExpression = null;


		List<String> select_list9 =null;


				selectExpression = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:115:2: ( SELECT select_list ( FROM table_references )? )
			// src/main/sqlplus/parser/SQLPlus.g:115:4: SELECT select_list ( FROM table_references )?
			{
			match(input,SELECT,FOLLOW_SELECT_in_select_expression312); 
			pushFollow(FOLLOW_select_list_in_select_expression314);
			select_list9=select_list();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:115:23: ( FROM table_references )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==FROM) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:115:24: FROM table_references
					{
					match(input,FROM,FOLLOW_FROM_in_select_expression317); 
					pushFollow(FOLLOW_table_references_in_select_expression319);
					table_references();
					state._fsp--;

					}
					break;

			}

			 
						selectExpression = new StatementSelectExpression(select_list9, "TODO"); 
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return selectExpression;
	}
	// $ANTLR end "select_expression"



	// $ANTLR start "select_list"
	// src/main/sqlplus/parser/SQLPlus.g:120:1: select_list returns [List<String> selectList] : (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK );
	public final List<String> select_list() throws RecognitionException {
		List<String> selectList = null;


		Token ASTERISK10=null;
		ParserRuleReturnScope column =null;


				selectList = new ArrayList<String>();
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:124:2: (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ID) ) {
				alt7=1;
			}
			else if ( (LA7_0==ASTERISK) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:124:4: column= displayed_column ( COMMA column= displayed_column )*
					{
					pushFollow(FOLLOW_displayed_column_in_select_list346);
					column=displayed_column();
					state._fsp--;


						 		selectList.add((column!=null?input.toString(column.start,column.stop):null));
							
					// src/main/sqlplus/parser/SQLPlus.g:127:3: ( COMMA column= displayed_column )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==COMMA) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:128:4: COMMA column= displayed_column
							{
							match(input,COMMA,FOLLOW_COMMA_in_select_list357); 
							pushFollow(FOLLOW_displayed_column_in_select_list361);
							column=displayed_column();
							state._fsp--;


											selectList.add((column!=null?input.toString(column.start,column.stop):null));
										
							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:132:5: ASTERISK
					{
					ASTERISK10=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_select_list374); 

								selectList.add((ASTERISK10!=null?ASTERISK10.getText():null));
							
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
		return selectList;
	}
	// $ANTLR end "select_list"


	public static class displayed_column_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "displayed_column"
	// src/main/sqlplus/parser/SQLPlus.g:137:1: displayed_column : column_spec ( alias )? ;
	public final SQLPlusParser.displayed_column_return displayed_column() throws RecognitionException {
		SQLPlusParser.displayed_column_return retval = new SQLPlusParser.displayed_column_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:138:2: ( column_spec ( alias )? )
			// src/main/sqlplus/parser/SQLPlus.g:138:4: column_spec ( alias )?
			{
			pushFollow(FOLLOW_column_spec_in_displayed_column387);
			column_spec();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:138:16: ( alias )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==AS||LA8_0==ID) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:138:17: alias
					{
					pushFollow(FOLLOW_alias_in_displayed_column390);
					alias();
					state._fsp--;

					}
					break;

			}

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
	// $ANTLR end "displayed_column"



	// $ANTLR start "table_references"
	// src/main/sqlplus/parser/SQLPlus.g:141:1: table_references : table_reference ( COMMA table_reference )* ;
	public final void table_references() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:142:2: ( table_reference ( COMMA table_reference )* )
			// src/main/sqlplus/parser/SQLPlus.g:142:4: table_reference ( COMMA table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_references403);
			table_reference();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:142:20: ( COMMA table_reference )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMMA) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:142:21: COMMA table_reference
					{
					match(input,COMMA,FOLLOW_COMMA_in_table_references406); 
					pushFollow(FOLLOW_table_reference_in_table_references408);
					table_reference();
					state._fsp--;

					}
					break;

				default :
					break loop9;
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
	// src/main/sqlplus/parser/SQLPlus.g:145:1: table_reference : table_atom ;
	public final void table_reference() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:146:2: ( table_atom )
			// src/main/sqlplus/parser/SQLPlus.g:146:4: table_atom
			{
			pushFollow(FOLLOW_table_atom_in_table_reference421);
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



	// $ANTLR start "table_atom"
	// src/main/sqlplus/parser/SQLPlus.g:165:1: table_atom : table_spec ;
	public final void table_atom() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:166:2: ( table_spec )
			// src/main/sqlplus/parser/SQLPlus.g:166:4: table_spec
			{
			pushFollow(FOLLOW_table_spec_in_table_atom448);
			table_spec();
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
	// $ANTLR end "table_atom"



	// $ANTLR start "table_spec"
	// src/main/sqlplus/parser/SQLPlus.g:194:1: table_spec : ( schema_name DOT )? table_name ;
	public final void table_spec() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:195:2: ( ( schema_name DOT )? table_name )
			// src/main/sqlplus/parser/SQLPlus.g:195:4: ( schema_name DOT )? table_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:195:4: ( schema_name DOT )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==DOT) ) {
					alt10=1;
				}
			}
			switch (alt10) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:195:5: schema_name DOT
					{
					pushFollow(FOLLOW_schema_name_in_table_spec485);
					schema_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_table_spec487); 
					}
					break;

			}

			pushFollow(FOLLOW_table_name_in_table_spec491);
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
	// src/main/sqlplus/parser/SQLPlus.g:198:1: column_spec : ( ( schema_name DOT )? table_name DOT )? column_name ;
	public final void column_spec() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:199:2: ( ( ( schema_name DOT )? table_name DOT )? column_name )
			// src/main/sqlplus/parser/SQLPlus.g:199:4: ( ( schema_name DOT )? table_name DOT )? column_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:199:4: ( ( schema_name DOT )? table_name DOT )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ID) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==DOT) ) {
					alt12=1;
				}
			}
			switch (alt12) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:199:5: ( schema_name DOT )? table_name DOT
					{
					// src/main/sqlplus/parser/SQLPlus.g:199:5: ( schema_name DOT )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ID) ) {
						int LA11_1 = input.LA(2);
						if ( (LA11_1==DOT) ) {
							int LA11_2 = input.LA(3);
							if ( (LA11_2==ID) ) {
								int LA11_3 = input.LA(4);
								if ( (LA11_3==DOT) ) {
									alt11=1;
								}
							}
						}
					}
					switch (alt11) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:199:6: schema_name DOT
							{
							pushFollow(FOLLOW_schema_name_in_column_spec504);
							schema_name();
							state._fsp--;

							match(input,DOT,FOLLOW_DOT_in_column_spec506); 
							}
							break;

					}

					pushFollow(FOLLOW_table_name_in_column_spec510);
					table_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_column_spec512); 
					}
					break;

			}

			pushFollow(FOLLOW_column_name_in_column_spec516);
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



	// $ANTLR start "alias"
	// src/main/sqlplus/parser/SQLPlus.g:210:1: alias : ( AS )? ID ;
	public final void alias() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:210:7: ( ( AS )? ID )
			// src/main/sqlplus/parser/SQLPlus.g:210:9: ( AS )? ID
			{
			// src/main/sqlplus/parser/SQLPlus.g:210:9: ( AS )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==AS) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:210:10: AS
					{
					match(input,AS,FOLLOW_AS_in_alias535); 
					}
					break;

			}

			match(input,ID,FOLLOW_ID_in_alias539); 
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
	// src/main/sqlplus/parser/SQLPlus.g:211:1: column_name : ID ;
	public final void column_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:211:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:211:15: ID
			{
			match(input,ID,FOLLOW_ID_in_column_name546); 
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
	// src/main/sqlplus/parser/SQLPlus.g:212:1: partition_name : ID ;
	public final void partition_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:212:16: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:212:18: ID
			{
			match(input,ID,FOLLOW_ID_in_partition_name553); 
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
	// src/main/sqlplus/parser/SQLPlus.g:213:1: schema_name : ID ;
	public final SQLPlusParser.schema_name_return schema_name() throws RecognitionException {
		SQLPlusParser.schema_name_return retval = new SQLPlusParser.schema_name_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:213:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:213:15: ID
			{
			match(input,ID,FOLLOW_ID_in_schema_name560); 
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
	// src/main/sqlplus/parser/SQLPlus.g:214:1: table_name : ID ;
	public final void table_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:214:12: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:214:14: ID
			{
			match(input,ID,FOLLOW_ID_in_table_name567); 
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
	// src/main/sqlplus/parser/SQLPlus.g:216:1: timing : ( BEFORE | AFTER );
	public final void timing() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:217:2: ( BEFORE | AFTER )
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
	// src/main/sqlplus/parser/SQLPlus.g:221:1: data_manipulation_language : ( INSERT | DELETE | UPDATE );
	public final void data_manipulation_language() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:222:2: ( INSERT | DELETE | UPDATE )
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
	// src/main/sqlplus/parser/SQLPlus.g:227:1: relational_operation : ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE );
	public final void relational_operation() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:228:2: ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE )
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
	// src/main/sqlplus/parser/SQLPlus.g:237:1: match_value : ( ID | QUESTION_MARK );
	public final void match_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:238:2: ( ID | QUESTION_MARK )
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
	public static final BitSet FOLLOW_timing_in_sqlplus_alert60 = new BitSet(new long[]{0x0000002000402000L});
	public static final BitSet FOLLOW_data_manipulation_language_in_sqlplus_alert62 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IN_in_sqlplus_alert64 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert66 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IF_in_sqlplus_alert68 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert70 = new BitSet(new long[]{0x0000000017068000L});
	public static final BitSet FOLLOW_relational_operation_in_sqlplus_alert72 = new BitSet(new long[]{0x0000000020080000L});
	public static final BitSet FOLLOW_match_value_in_sqlplus_alert74 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus_alert76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_statement_in_sql_statement104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_statement_in_sql_statement111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_statement_in_sql_statement118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_database_in_use_statement142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_use_database166 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_schema_name_in_use_database175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_databases_in_show_statement199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_tables_in_show_statement206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHOW_in_show_tables229 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_TABLES_in_show_tables231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHOW_in_show_databases255 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DATABASES_in_show_databases257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_expression_in_select_statement280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUESTION_MARK_in_select_statement287 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_select_expression_in_select_statement289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select_expression312 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_select_list_in_select_expression314 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_FROM_in_select_expression317 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_table_references_in_select_expression319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_displayed_column_in_select_list346 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_select_list357 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_displayed_column_in_select_list361 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ASTERISK_in_select_list374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_displayed_column387 = new BitSet(new long[]{0x0000000000080042L});
	public static final BitSet FOLLOW_alias_in_displayed_column390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_references403 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_table_references406 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_table_reference_in_table_references408 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_table_atom_in_table_reference421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_spec_in_table_atom448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_table_spec485 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DOT_in_table_spec487 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_table_name_in_table_spec491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_column_spec504 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DOT_in_column_spec506 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_table_name_in_column_spec510 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DOT_in_column_spec512 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_column_name_in_column_spec516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_alias535 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_alias539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partition_name553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_schema_name560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name567 = new BitSet(new long[]{0x0000000000000002L});
}
