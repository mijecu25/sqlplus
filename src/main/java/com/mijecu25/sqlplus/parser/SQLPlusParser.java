// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlus.g 2016-07-14 21:22:21

	package com.mijecu25.sqlplus.parser;

    import java.util.Map;
    import java.util.HashMap;

	import com.mijecu25.sqlplus.compiler.core.statement.Statement;
	import com.mijecu25.sqlplus.compiler.core.statement.StatementUseDatabase;
	import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementSelectExpression;
	import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementInsertStatement1;
	import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementSingleTableUpdateStatement;
	import com.mijecu25.sqlplus.compiler.core.expression.Expression;
	import com.mijecu25.sqlplus.compiler.core.expression.ExpressionBinary;
	import com.mijecu25.sqlplus.compiler.core.expression.ExpressionLiteral;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SQLPlusParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFTER", "ALERT", "ALL", "AND", 
		"ANY", "AS", "ASTERISK", "BEFORE", "COLON", "COMMA", "DATABASES", "DEFAULT", 
		"DELETE", "DOT", "EQUAL", "EXISTS", "FALSE", "FROM", "GREATER_THAN", "GREATER_THAN_EQUAL", 
		"ID", "IF", "IN", "INSERT", "INTEGER_NUMBER", "INTO", "IS", "LEFT_PARENTHESIS", 
		"LESS_THAN", "LESS_THAN_EQUAL", "LIKE", "MINUS", "NEWLINE", "NOT", "NOT_EQUAL", 
		"NULL", "OR", "PLUS", "QUESTION_MARK", "QUOTE", "REAL_NUMBER", "RIGHT_PARENTHESIS", 
		"SELECT", "SEMICOLON", "SET", "SHOW", "TABLES", "TEXT_STRING", "TRUE", 
		"UNDERSCORE", "UPDATE", "USE", "VALUES", "WHERE", "WS", "XOR"
	};
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


		@Override
	 	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
	    	throw e;
		}

		protected void mismatch(IntStream input, int ttype, BitSet follow) throws RecognitionException {
			 throw new MismatchedTokenException(ttype, input);
		}

		protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
			throw new MismatchedTokenException(ttype, input);
		}



	// $ANTLR start "sqlplus"
	// src/main/sqlplus/parser/SQLPlus.g:43:1: sqlplus returns [Statement statement] : ( sql_statement SEMICOLON | sqlplus_alert );
	public final Statement sqlplus() throws RecognitionException {
		Statement statement = null;


		Statement sql_statement1 =null;


				statement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:47:2: ( sql_statement SEMICOLON | sqlplus_alert )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INSERT||LA1_0==SELECT||(LA1_0 >= UPDATE && LA1_0 <= USE)) ) {
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
					// src/main/sqlplus/parser/SQLPlus.g:47:5: sql_statement SEMICOLON
					{
					pushFollow(FOLLOW_sql_statement_in_sqlplus47);
					sql_statement1=sql_statement();
					state._fsp--;

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sqlplus49); 

								statement = sql_statement1;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:51:4: sqlplus_alert
					{
					pushFollow(FOLLOW_sqlplus_alert_in_sqlplus59);
					sqlplus_alert();
					state._fsp--;

					}
					break;

			}
		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return statement;
	}
	// $ANTLR end "sqlplus"



	// $ANTLR start "sqlplus_alert"
	// src/main/sqlplus/parser/SQLPlus.g:55:1: sqlplus_alert : ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON ;
	public final void sqlplus_alert() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:56:2: ( ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON )
			// src/main/sqlplus/parser/SQLPlus.g:56:4: ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON
			{
			match(input,ALERT,FOLLOW_ALERT_in_sqlplus_alert71); 
			pushFollow(FOLLOW_timing_in_sqlplus_alert73);
			timing();
			state._fsp--;

			pushFollow(FOLLOW_data_manipulation_language_in_sqlplus_alert75);
			data_manipulation_language();
			state._fsp--;

			match(input,IN,FOLLOW_IN_in_sqlplus_alert77); 
			match(input,ID,FOLLOW_ID_in_sqlplus_alert79); 
			match(input,IF,FOLLOW_IF_in_sqlplus_alert81); 
			match(input,ID,FOLLOW_ID_in_sqlplus_alert83); 
			pushFollow(FOLLOW_relational_operation_in_sqlplus_alert85);
			relational_operation();
			state._fsp--;

			pushFollow(FOLLOW_match_value_in_sqlplus_alert87);
			match_value();
			state._fsp--;

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sqlplus_alert89); 

							System.out.println("Created SQLPlus alert");
						
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sqlplus_alert"



	// $ANTLR start "sql_statement"
	// src/main/sqlplus/parser/SQLPlus.g:62:1: sql_statement returns [Statement sqlStatement] : ( data_manipulation_statements | use_statement );
	public final Statement sql_statement() throws RecognitionException {
		Statement sqlStatement = null;


		Statement data_manipulation_statements2 =null;
		Statement use_statement3 =null;


				sqlStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:66:2: ( data_manipulation_statements | use_statement )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==INSERT||LA2_0==SELECT||LA2_0==UPDATE) ) {
				alt2=1;
			}
			else if ( (LA2_0==USE) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:66:6: data_manipulation_statements
					{
					pushFollow(FOLLOW_data_manipulation_statements_in_sql_statement117);
					data_manipulation_statements2=data_manipulation_statements();
					state._fsp--;


						        sqlStatement = data_manipulation_statements2;
						    
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:69:4: use_statement
					{
					pushFollow(FOLLOW_use_statement_in_sql_statement124);
					use_statement3=use_statement();
					state._fsp--;


								sqlStatement = use_statement3;
							
					}
					break;

			}
		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return sqlStatement;
	}
	// $ANTLR end "sql_statement"



	// $ANTLR start "use_statement"
	// src/main/sqlplus/parser/SQLPlus.g:74:1: use_statement returns [Statement useStatement] : use_database ;
	public final Statement use_statement() throws RecognitionException {
		Statement useStatement = null;


		Statement use_database4 =null;


				useStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:78:2: ( use_database )
			// src/main/sqlplus/parser/SQLPlus.g:78:4: use_database
			{
			pushFollow(FOLLOW_use_database_in_use_statement147);
			use_database4=use_database();
			state._fsp--;


						useStatement = use_database4;
					
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return useStatement;
	}
	// $ANTLR end "use_statement"



	// $ANTLR start "use_database"
	// src/main/sqlplus/parser/SQLPlus.g:83:1: use_database returns [Statement useDatabaseStatement] : USE database= schema_name ;
	public final Statement use_database() throws RecognitionException {
		Statement useDatabaseStatement = null;


		ParserRuleReturnScope database =null;


				useDatabaseStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:87:2: ( USE database= schema_name )
			// src/main/sqlplus/parser/SQLPlus.g:87:4: USE database= schema_name
			{
			match(input,USE,FOLLOW_USE_in_use_database170); 
			pushFollow(FOLLOW_schema_name_in_use_database178);
			database=schema_name();
			state._fsp--;


						useDatabaseStatement = new StatementUseDatabase((database!=null?input.toString(database.start,database.stop):null));
					
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return useDatabaseStatement;
	}
	// $ANTLR end "use_database"



	// $ANTLR start "data_manipulation_statements"
	// src/main/sqlplus/parser/SQLPlus.g:93:1: data_manipulation_statements returns [Statement dataManipulationStatement] : ( select_statement | insert_statements | update_statements );
	public final Statement data_manipulation_statements() throws RecognitionException {
		Statement dataManipulationStatement = null;


		Statement select_statement5 =null;
		Statement insert_statements6 =null;
		Statement update_statements7 =null;


			    dataManipulationStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:97:2: ( select_statement | insert_statements | update_statements )
			int alt3=3;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				alt3=1;
				}
				break;
			case INSERT:
				{
				alt3=2;
				}
				break;
			case UPDATE:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:97:6: select_statement
					{
					pushFollow(FOLLOW_select_statement_in_data_manipulation_statements203);
					select_statement5=select_statement();
					state._fsp--;


					            dataManipulationStatement = select_statement5;
					        
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:100:9: insert_statements
					{
					pushFollow(FOLLOW_insert_statements_in_data_manipulation_statements215);
					insert_statements6=insert_statements();
					state._fsp--;


					            dataManipulationStatement = insert_statements6;
					        
					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:103:9: update_statements
					{
					pushFollow(FOLLOW_update_statements_in_data_manipulation_statements227);
					update_statements7=update_statements();
					state._fsp--;


					            dataManipulationStatement = update_statements7;
					    
					}
					break;

			}
		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return dataManipulationStatement;
	}
	// $ANTLR end "data_manipulation_statements"



	// $ANTLR start "select_statement"
	// src/main/sqlplus/parser/SQLPlus.g:108:1: select_statement returns [Statement selectStatement] : select_expression ;
	public final Statement select_statement() throws RecognitionException {
		Statement selectStatement = null;


		Statement select_expression8 =null;


				selectStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:112:2: ( select_expression )
			// src/main/sqlplus/parser/SQLPlus.g:112:4: select_expression
			{
			pushFollow(FOLLOW_select_expression_in_select_statement253);
			select_expression8=select_expression();
			state._fsp--;


						selectStatement = select_expression8;
					
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return selectStatement;
	}
	// $ANTLR end "select_statement"



	// $ANTLR start "insert_statements"
	// src/main/sqlplus/parser/SQLPlus.g:117:1: insert_statements returns [Statement insertStatements] : insert_statement1 ;
	public final Statement insert_statements() throws RecognitionException {
		Statement insertStatements = null;


		Statement insert_statement19 =null;


		        insertStatements = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:121:5: ( insert_statement1 )
			// src/main/sqlplus/parser/SQLPlus.g:121:9: insert_statement1
			{
			pushFollow(FOLLOW_insert_statement1_in_insert_statements284);
			insert_statement19=insert_statement1();
			state._fsp--;


			            insertStatements = insert_statement19;
			        
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return insertStatements;
	}
	// $ANTLR end "insert_statements"



	// $ANTLR start "update_statements"
	// src/main/sqlplus/parser/SQLPlus.g:126:1: update_statements returns [Statement updateStatements] : single_table_update_statement ;
	public final Statement update_statements() throws RecognitionException {
		Statement updateStatements = null;


		Statement single_table_update_statement10 =null;


				updateStatements = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:130:2: ( single_table_update_statement )
			// src/main/sqlplus/parser/SQLPlus.g:130:4: single_table_update_statement
			{
			pushFollow(FOLLOW_single_table_update_statement_in_update_statements310);
			single_table_update_statement10=single_table_update_statement();
			state._fsp--;


						updateStatements = single_table_update_statement10;
					
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return updateStatements;
	}
	// $ANTLR end "update_statements"



	// $ANTLR start "select_expression"
	// src/main/sqlplus/parser/SQLPlus.g:135:1: select_expression returns [Statement selectExpression] : SELECT select_list FROM ( table_references ( where_clause )? )? ;
	public final Statement select_expression() throws RecognitionException {
		Statement selectExpression = null;


		List<String> select_list11 =null;
		List<String> table_references12 =null;
		Expression where_clause13 =null;


				selectExpression = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:140:2: ( SELECT select_list FROM ( table_references ( where_clause )? )? )
			// src/main/sqlplus/parser/SQLPlus.g:140:4: SELECT select_list FROM ( table_references ( where_clause )? )?
			{
			match(input,SELECT,FOLLOW_SELECT_in_select_expression335); 
			pushFollow(FOLLOW_select_list_in_select_expression337);
			select_list11=select_list();
			state._fsp--;

			match(input,FROM,FOLLOW_FROM_in_select_expression339); 
			// src/main/sqlplus/parser/SQLPlus.g:140:28: ( table_references ( where_clause )? )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:140:29: table_references ( where_clause )?
					{
					pushFollow(FOLLOW_table_references_in_select_expression342);
					table_references12=table_references();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:140:46: ( where_clause )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==WHERE) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:140:47: where_clause
							{
							pushFollow(FOLLOW_where_clause_in_select_expression345);
							where_clause13=where_clause();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}


						selectExpression = new StatementSelectExpression(select_list11, table_references12, where_clause13);
					
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return selectExpression;
	}
	// $ANTLR end "select_expression"



	// $ANTLR start "insert_statement1"
	// src/main/sqlplus/parser/SQLPlus.g:145:1: insert_statement1 returns [Statement insertStatement1] : insert_header ( column_list )? value_list_clause ;
	public final Statement insert_statement1() throws RecognitionException {
		Statement insertStatement1 = null;


		String insert_header14 =null;
		List<String> column_list15 =null;
		List<List<String>> value_list_clause16 =null;


			    insertStatement1 = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:149:2: ( insert_header ( column_list )? value_list_clause )
			// src/main/sqlplus/parser/SQLPlus.g:149:6: insert_header ( column_list )? value_list_clause
			{
			pushFollow(FOLLOW_insert_header_in_insert_statement1375);
			insert_header14=insert_header();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:150:6: ( column_list )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==LEFT_PARENTHESIS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:150:7: column_list
					{
					pushFollow(FOLLOW_column_list_in_insert_statement1383);
					column_list15=column_list();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_value_list_clause_in_insert_statement1387);
			value_list_clause16=value_list_clause();
			state._fsp--;


				        insertStatement1 = new StatementInsertStatement1(insert_header14, column_list15, value_list_clause16);
				    
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return insertStatement1;
	}
	// $ANTLR end "insert_statement1"



	// $ANTLR start "single_table_update_statement"
	// src/main/sqlplus/parser/SQLPlus.g:155:1: single_table_update_statement returns [Statement singleTableUpdateStatement] : UPDATE table_reference set_columns_clause ( where_clause )? ;
	public final Statement single_table_update_statement() throws RecognitionException {
		Statement singleTableUpdateStatement = null;


		ParserRuleReturnScope table_reference17 =null;
		Map<String, Expression> set_columns_clause18 =null;
		Expression where_clause19 =null;


				singleTableUpdateStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:159:2: ( UPDATE table_reference set_columns_clause ( where_clause )? )
			// src/main/sqlplus/parser/SQLPlus.g:159:4: UPDATE table_reference set_columns_clause ( where_clause )?
			{
			match(input,UPDATE,FOLLOW_UPDATE_in_single_table_update_statement410); 
			pushFollow(FOLLOW_table_reference_in_single_table_update_statement412);
			table_reference17=table_reference();
			state._fsp--;

			pushFollow(FOLLOW_set_columns_clause_in_single_table_update_statement414);
			set_columns_clause18=set_columns_clause();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:159:46: ( where_clause )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==WHERE) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:159:47: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_single_table_update_statement417);
					where_clause19=where_clause();
					state._fsp--;

					}
					break;

			}


						singleTableUpdateStatement = new StatementSingleTableUpdateStatement((table_reference17!=null?input.toString(table_reference17.start,table_reference17.stop):null), set_columns_clause18, where_clause19);
					
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return singleTableUpdateStatement;
	}
	// $ANTLR end "single_table_update_statement"



	// $ANTLR start "select_list"
	// src/main/sqlplus/parser/SQLPlus.g:164:1: select_list returns [List<String> selectList] : (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK );
	public final List<String> select_list() throws RecognitionException {
		List<String> selectList = null;


		Token ASTERISK20=null;
		ParserRuleReturnScope column =null;


				selectList = new ArrayList<String>();
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:168:2: (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				alt9=1;
			}
			else if ( (LA9_0==ASTERISK) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:168:4: column= displayed_column ( COMMA column= displayed_column )*
					{
					pushFollow(FOLLOW_displayed_column_in_select_list446);
					column=displayed_column();
					state._fsp--;


						 		selectList.add((column!=null?input.toString(column.start,column.stop):null));
							
					// src/main/sqlplus/parser/SQLPlus.g:171:3: ( COMMA column= displayed_column )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==COMMA) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:172:4: COMMA column= displayed_column
							{
							match(input,COMMA,FOLLOW_COMMA_in_select_list457); 
							pushFollow(FOLLOW_displayed_column_in_select_list463);
							column=displayed_column();
							state._fsp--;


											selectList.add((column!=null?input.toString(column.start,column.stop):null));
										
							}
							break;

						default :
							break loop8;
						}
					}

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:176:5: ASTERISK
					{
					ASTERISK20=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_select_list476); 

								selectList.add((ASTERISK20!=null?ASTERISK20.getText():null));
							
					}
					break;

			}
		}

			catch (RecognitionException re) {
				throw re;
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
	// src/main/sqlplus/parser/SQLPlus.g:181:1: displayed_column : column_spec ( alias )? ;
	public final SQLPlusParser.displayed_column_return displayed_column() throws RecognitionException {
		SQLPlusParser.displayed_column_return retval = new SQLPlusParser.displayed_column_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:182:2: ( column_spec ( alias )? )
			// src/main/sqlplus/parser/SQLPlus.g:182:4: column_spec ( alias )?
			{
			pushFollow(FOLLOW_column_spec_in_displayed_column489);
			column_spec();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:182:16: ( alias )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==AS||LA10_0==ID) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:182:17: alias
					{
					pushFollow(FOLLOW_alias_in_displayed_column492);
					alias();
					state._fsp--;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "displayed_column"



	// $ANTLR start "table_references"
	// src/main/sqlplus/parser/SQLPlus.g:185:1: table_references returns [List<String> tableReferences] : table= table_reference ( COMMA table= table_reference )* ;
	public final List<String> table_references() throws RecognitionException {
		List<String> tableReferences = null;


		ParserRuleReturnScope table =null;


				tableReferences = new ArrayList<String>();
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:189:2: (table= table_reference ( COMMA table= table_reference )* )
			// src/main/sqlplus/parser/SQLPlus.g:189:4: table= table_reference ( COMMA table= table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_references519);
			table=table_reference();
			state._fsp--;


						tableReferences.add((table!=null?input.toString(table.start,table.stop):null));
					
			// src/main/sqlplus/parser/SQLPlus.g:192:3: ( COMMA table= table_reference )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==COMMA) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:193:4: COMMA table= table_reference
					{
					match(input,COMMA,FOLLOW_COMMA_in_table_references530); 
					pushFollow(FOLLOW_table_reference_in_table_references539);
					table=table_reference();
					state._fsp--;


									tableReferences.add((table!=null?input.toString(table.start,table.stop):null));
								
					}
					break;

				default :
					break loop11;
				}
			}

			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return tableReferences;
	}
	// $ANTLR end "table_references"


	public static class table_reference_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "table_reference"
	// src/main/sqlplus/parser/SQLPlus.g:200:1: table_reference : table_atom ;
	public final SQLPlusParser.table_reference_return table_reference() throws RecognitionException {
		SQLPlusParser.table_reference_return retval = new SQLPlusParser.table_reference_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:201:2: ( table_atom )
			// src/main/sqlplus/parser/SQLPlus.g:201:4: table_atom
			{
			pushFollow(FOLLOW_table_atom_in_table_reference557);
			table_atom();
			state._fsp--;

			}

			retval.stop = input.LT(-1);

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "table_reference"



	// $ANTLR start "insert_header"
	// src/main/sqlplus/parser/SQLPlus.g:204:1: insert_header returns [String table] : INSERT ( INTO )? table_spec ;
	public final String insert_header() throws RecognitionException {
		String table = null;


		ParserRuleReturnScope table_spec21 =null;


		        table = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:208:5: ( INSERT ( INTO )? table_spec )
			// src/main/sqlplus/parser/SQLPlus.g:208:9: INSERT ( INTO )? table_spec
			{
			match(input,INSERT,FOLLOW_INSERT_in_insert_header586); 
			// src/main/sqlplus/parser/SQLPlus.g:208:16: ( INTO )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==INTO) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:208:17: INTO
					{
					match(input,INTO,FOLLOW_INTO_in_insert_header589); 
					}
					break;

			}

			pushFollow(FOLLOW_table_spec_in_insert_header593);
			table_spec21=table_spec();
			state._fsp--;


			            table = (table_spec21!=null?input.toString(table_spec21.start,table_spec21.stop):null);
			        
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return table;
	}
	// $ANTLR end "insert_header"



	// $ANTLR start "value_list_clause"
	// src/main/sqlplus/parser/SQLPlus.g:213:1: value_list_clause returns [List<List<String>> valueListClause] : VALUES value= column_value_list ( COMMA value= column_value_list )* ;
	public final List<List<String>> value_list_clause() throws RecognitionException {
		List<List<String>> valueListClause = null;


		List<String> value =null;


		        valueListClause = new ArrayList<List<String>>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:217:5: ( VALUES value= column_value_list ( COMMA value= column_value_list )* )
			// src/main/sqlplus/parser/SQLPlus.g:217:9: VALUES value= column_value_list ( COMMA value= column_value_list )*
			{
			match(input,VALUES,FOLLOW_VALUES_in_value_list_clause627); 
			pushFollow(FOLLOW_column_value_list_in_value_list_clause641);
			value=column_value_list();
			state._fsp--;


			            valueListClause.add(value);
			        
			// src/main/sqlplus/parser/SQLPlus.g:221:9: ( COMMA value= column_value_list )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:222:13: COMMA value= column_value_list
					{
					match(input,COMMA,FOLLOW_COMMA_in_value_list_clause667); 
					pushFollow(FOLLOW_column_value_list_in_value_list_clause685);
					value=column_value_list();
					state._fsp--;


					                valueListClause.add(value);
					            
					}
					break;

				default :
					break loop13;
				}
			}

			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return valueListClause;
	}
	// $ANTLR end "value_list_clause"



	// $ANTLR start "column_value_list"
	// src/main/sqlplus/parser/SQLPlus.g:229:1: column_value_list returns [List<String> columnValueList] : LEFT_PARENTHESIS expr= bit_expr ( COMMA expr= bit_expr )* RIGHT_PARENTHESIS ;
	public final List<String> column_value_list() throws RecognitionException {
		List<String> columnValueList = null;


		ParserRuleReturnScope expr =null;


		        columnValueList = new ArrayList<String>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:233:5: ( LEFT_PARENTHESIS expr= bit_expr ( COMMA expr= bit_expr )* RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:233:9: LEFT_PARENTHESIS expr= bit_expr ( COMMA expr= bit_expr )* RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_column_value_list730); 
			pushFollow(FOLLOW_bit_expr_in_column_value_list744);
			expr=bit_expr();
			state._fsp--;


			            columnValueList.add((expr!=null?input.toString(expr.start,expr.stop):null));
			        
			// src/main/sqlplus/parser/SQLPlus.g:237:9: ( COMMA expr= bit_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:238:13: COMMA expr= bit_expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_column_value_list770); 
					pushFollow(FOLLOW_bit_expr_in_column_value_list788);
					expr=bit_expr();
					state._fsp--;


					                columnValueList.add((expr!=null?input.toString(expr.start,expr.stop):null));
					            
					}
					break;

				default :
					break loop14;
				}
			}

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_column_value_list803); 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return columnValueList;
	}
	// $ANTLR end "column_value_list"



	// $ANTLR start "set_columns_clause"
	// src/main/sqlplus/parser/SQLPlus.g:245:1: set_columns_clause returns [Map<String, Expression> columnsValuesMap] : SET columnValue= set_column_clause ( COMMA columnValue= set_column_clause )* ;
	public final Map<String, Expression> set_columns_clause() throws RecognitionException {
		Map<String, Expression> columnsValuesMap = null;


		Map<String, Expression> columnValue =null;


		        columnsValuesMap = new HashMap<String, Expression>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:249:5: ( SET columnValue= set_column_clause ( COMMA columnValue= set_column_clause )* )
			// src/main/sqlplus/parser/SQLPlus.g:249:9: SET columnValue= set_column_clause ( COMMA columnValue= set_column_clause )*
			{
			match(input,SET,FOLLOW_SET_in_set_columns_clause835); 
			pushFollow(FOLLOW_set_column_clause_in_set_columns_clause849);
			columnValue=set_column_clause();
			state._fsp--;


			            columnsValuesMap.putAll(columnValue);
			        
			// src/main/sqlplus/parser/SQLPlus.g:253:9: ( COMMA columnValue= set_column_clause )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==COMMA) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:254:13: COMMA columnValue= set_column_clause
					{
					match(input,COMMA,FOLLOW_COMMA_in_set_columns_clause875); 
					pushFollow(FOLLOW_set_column_clause_in_set_columns_clause893);
					columnValue=set_column_clause();
					state._fsp--;


					                columnsValuesMap.putAll(columnValue);
					            
					}
					break;

				default :
					break loop15;
				}
			}

			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return columnsValuesMap;
	}
	// $ANTLR end "set_columns_clause"



	// $ANTLR start "set_column_clause"
	// src/main/sqlplus/parser/SQLPlus.g:261:1: set_column_clause returns [Map<String, Expression> columnValueMap] : column_spec EQUAL ( expression | DEFAULT ) ;
	public final Map<String, Expression> set_column_clause() throws RecognitionException {
		Map<String, Expression> columnValueMap = null;


		Token DEFAULT24=null;
		ParserRuleReturnScope column_spec22 =null;
		Expression expression23 =null;


		        columnValueMap = new HashMap<String, Expression>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:265:5: ( column_spec EQUAL ( expression | DEFAULT ) )
			// src/main/sqlplus/parser/SQLPlus.g:265:7: column_spec EQUAL ( expression | DEFAULT )
			{
			pushFollow(FOLLOW_column_spec_in_set_column_clause936);
			column_spec22=column_spec();
			state._fsp--;

			match(input,EQUAL,FOLLOW_EQUAL_in_set_column_clause938); 
			// src/main/sqlplus/parser/SQLPlus.g:265:25: ( expression | DEFAULT )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ID||LA16_0==INTEGER_NUMBER||LA16_0==MINUS||LA16_0==NOT||LA16_0==PLUS||LA16_0==REAL_NUMBER||LA16_0==TEXT_STRING) ) {
				alt16=1;
			}
			else if ( (LA16_0==DEFAULT) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:266:13: expression
					{
					pushFollow(FOLLOW_expression_in_set_column_clause954);
					expression23=expression();
					state._fsp--;


					                columnValueMap.put((column_spec22!=null?input.toString(column_spec22.start,column_spec22.stop):null), expression23);
					            
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:270:13: DEFAULT
					{
					DEFAULT24=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_set_column_clause984); 

					                columnValueMap.put((column_spec22!=null?input.toString(column_spec22.start,column_spec22.stop):null), new ExpressionLiteral((DEFAULT24!=null?DEFAULT24.getText():null)));
					            
					}
					break;

			}

			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return columnValueMap;
	}
	// $ANTLR end "set_column_clause"



	// $ANTLR start "where_clause"
	// src/main/sqlplus/parser/SQLPlus.g:276:1: where_clause returns [Expression expr] : WHERE expression ;
	public final Expression where_clause() throws RecognitionException {
		Expression expr = null;


		Expression expression25 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:280:5: ( WHERE expression )
			// src/main/sqlplus/parser/SQLPlus.g:280:9: WHERE expression
			{
			match(input,WHERE,FOLLOW_WHERE_in_where_clause1028); 
			pushFollow(FOLLOW_expression_in_where_clause1030);
			expression25=expression();
			state._fsp--;

			 expr = expression25; 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "where_clause"



	// $ANTLR start "table_atom"
	// src/main/sqlplus/parser/SQLPlus.g:283:1: table_atom : table_spec ;
	public final void table_atom() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:284:2: ( table_spec )
			// src/main/sqlplus/parser/SQLPlus.g:284:4: table_spec
			{
			pushFollow(FOLLOW_table_spec_in_table_atom1046);
			table_spec();
			state._fsp--;

			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "table_atom"


	public static class table_spec_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "table_spec"
	// src/main/sqlplus/parser/SQLPlus.g:287:1: table_spec : ( schema_name DOT )? table_name ;
	public final SQLPlusParser.table_spec_return table_spec() throws RecognitionException {
		SQLPlusParser.table_spec_return retval = new SQLPlusParser.table_spec_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:288:2: ( ( schema_name DOT )? table_name )
			// src/main/sqlplus/parser/SQLPlus.g:288:4: ( schema_name DOT )? table_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:288:4: ( schema_name DOT )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ID) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==DOT) ) {
					alt17=1;
				}
			}
			switch (alt17) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:288:5: schema_name DOT
					{
					pushFollow(FOLLOW_schema_name_in_table_spec1058);
					schema_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_table_spec1060); 
					}
					break;

			}

			pushFollow(FOLLOW_table_name_in_table_spec1064);
			table_name();
			state._fsp--;

			}

			retval.stop = input.LT(-1);

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "table_spec"



	// $ANTLR start "column_list"
	// src/main/sqlplus/parser/SQLPlus.g:291:1: column_list returns [List<String> columnList] : LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS ;
	public final List<String> column_list() throws RecognitionException {
		List<String> columnList = null;


		ParserRuleReturnScope column =null;


		        columnList = new ArrayList<String>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:295:2: ( LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:295:6: LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_column_list1090); 
			pushFollow(FOLLOW_column_spec_in_column_list1101);
			column=column_spec();
			state._fsp--;


				        columnList.add((column!=null?input.toString(column.start,column.stop):null));
				    
			// src/main/sqlplus/parser/SQLPlus.g:299:9: ( COMMA column= column_spec )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:300:13: COMMA column= column_spec
					{
					match(input,COMMA,FOLLOW_COMMA_in_column_list1127); 
					pushFollow(FOLLOW_column_spec_in_column_list1145);
					column=column_spec();
					state._fsp--;


					                columnList.add((column!=null?input.toString(column.start,column.stop):null));
					            
					}
					break;

				default :
					break loop18;
				}
			}

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_column_list1160); 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return columnList;
	}
	// $ANTLR end "column_list"


	public static class column_spec_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "column_spec"
	// src/main/sqlplus/parser/SQLPlus.g:307:1: column_spec : ( ( schema_name DOT )? table_name DOT )? column_name ;
	public final SQLPlusParser.column_spec_return column_spec() throws RecognitionException {
		SQLPlusParser.column_spec_return retval = new SQLPlusParser.column_spec_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:308:2: ( ( ( schema_name DOT )? table_name DOT )? column_name )
			// src/main/sqlplus/parser/SQLPlus.g:308:6: ( ( schema_name DOT )? table_name DOT )? column_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:308:6: ( ( schema_name DOT )? table_name DOT )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ID) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==DOT) ) {
					alt20=1;
				}
			}
			switch (alt20) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:308:7: ( schema_name DOT )? table_name DOT
					{
					// src/main/sqlplus/parser/SQLPlus.g:308:7: ( schema_name DOT )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==ID) ) {
						int LA19_1 = input.LA(2);
						if ( (LA19_1==DOT) ) {
							int LA19_2 = input.LA(3);
							if ( (LA19_2==ID) ) {
								int LA19_3 = input.LA(4);
								if ( (LA19_3==DOT) ) {
									alt19=1;
								}
							}
						}
					}
					switch (alt19) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:308:8: schema_name DOT
							{
							pushFollow(FOLLOW_schema_name_in_column_spec1175);
							schema_name();
							state._fsp--;

							match(input,DOT,FOLLOW_DOT_in_column_spec1177); 
							}
							break;

					}

					pushFollow(FOLLOW_table_name_in_column_spec1181);
					table_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_column_spec1183); 
					}
					break;

			}

			pushFollow(FOLLOW_column_name_in_column_spec1187);
			column_name();
			state._fsp--;

			}

			retval.stop = input.LT(-1);

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "column_spec"



	// $ANTLR start "subquery"
	// src/main/sqlplus/parser/SQLPlus.g:311:1: subquery : LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS ;
	public final void subquery() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:312:5: ( LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:312:9: LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_subquery1203); 
			pushFollow(FOLLOW_select_statement_in_subquery1205);
			select_statement();
			state._fsp--;

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_subquery1207); 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subquery"



	// $ANTLR start "expression"
	// src/main/sqlplus/parser/SQLPlus.g:315:1: expression returns [Expression expr] : left= expr_factor1 ( OR right= expr_factor1 )* ;
	public final Expression expression() throws RecognitionException {
		Expression expr = null;


		Token OR26=null;
		Expression left =null;
		Expression right =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:319:5: (left= expr_factor1 ( OR right= expr_factor1 )* )
			// src/main/sqlplus/parser/SQLPlus.g:319:9: left= expr_factor1 ( OR right= expr_factor1 )*
			{
			pushFollow(FOLLOW_expr_factor1_in_expression1243);
			left=expr_factor1();
			state._fsp--;

			 expr = left; 
			// src/main/sqlplus/parser/SQLPlus.g:320:9: ( OR right= expr_factor1 )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==OR) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:321:13: OR right= expr_factor1
					{
					OR26=(Token)match(input,OR,FOLLOW_OR_in_expression1269); 
					pushFollow(FOLLOW_expr_factor1_in_expression1275);
					right=expr_factor1();
					state._fsp--;


					                expr = new ExpressionBinary((OR26!=null?OR26.getText():null), expr, right);
					            
					}
					break;

				default :
					break loop21;
				}
			}

			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "expression"



	// $ANTLR start "expr_factor1"
	// src/main/sqlplus/parser/SQLPlus.g:327:1: expr_factor1 returns [Expression expr] : left= expr_factor2 ( XOR right= expr_factor2 )* ;
	public final Expression expr_factor1() throws RecognitionException {
		Expression expr = null;


		Token XOR27=null;
		Expression left =null;
		Expression right =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:331:5: (left= expr_factor2 ( XOR right= expr_factor2 )* )
			// src/main/sqlplus/parser/SQLPlus.g:331:9: left= expr_factor2 ( XOR right= expr_factor2 )*
			{
			pushFollow(FOLLOW_expr_factor2_in_expr_factor11324);
			left=expr_factor2();
			state._fsp--;

			 expr = left; 
			// src/main/sqlplus/parser/SQLPlus.g:332:9: ( XOR right= expr_factor2 )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==XOR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:333:13: XOR right= expr_factor2
					{
					XOR27=(Token)match(input,XOR,FOLLOW_XOR_in_expr_factor11350); 
					pushFollow(FOLLOW_expr_factor2_in_expr_factor11356);
					right=expr_factor2();
					state._fsp--;


					                expr = new ExpressionBinary((XOR27!=null?XOR27.getText():null), expr, right);
					            
					}
					break;

				default :
					break loop22;
				}
			}

			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "expr_factor1"



	// $ANTLR start "expr_factor2"
	// src/main/sqlplus/parser/SQLPlus.g:339:1: expr_factor2 returns [Expression expr] : left= expr_factor3 ( AND right= expr_factor3 )* ;
	public final Expression expr_factor2() throws RecognitionException {
		Expression expr = null;


		Token AND28=null;
		Expression left =null;
		Expression right =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:343:5: (left= expr_factor3 ( AND right= expr_factor3 )* )
			// src/main/sqlplus/parser/SQLPlus.g:343:9: left= expr_factor3 ( AND right= expr_factor3 )*
			{
			pushFollow(FOLLOW_expr_factor3_in_expr_factor21405);
			left=expr_factor3();
			state._fsp--;

			 expr = left; 
			// src/main/sqlplus/parser/SQLPlus.g:344:9: ( AND right= expr_factor3 )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==AND) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:345:13: AND right= expr_factor3
					{
					AND28=(Token)match(input,AND,FOLLOW_AND_in_expr_factor21431); 
					pushFollow(FOLLOW_expr_factor3_in_expr_factor21437);
					right=expr_factor3();
					state._fsp--;


					                expr = new ExpressionBinary((AND28!=null?AND28.getText():null), expr, right);
					            
					}
					break;

				default :
					break loop23;
				}
			}

			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "expr_factor2"



	// $ANTLR start "expr_factor3"
	// src/main/sqlplus/parser/SQLPlus.g:351:1: expr_factor3 returns [Expression expr] : ( NOT )? expr_factor4 ;
	public final Expression expr_factor3() throws RecognitionException {
		Expression expr = null;


		Token NOT29=null;
		Expression expr_factor430 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:355:5: ( ( NOT )? expr_factor4 )
			// src/main/sqlplus/parser/SQLPlus.g:355:9: ( NOT )? expr_factor4
			{
			// src/main/sqlplus/parser/SQLPlus.g:355:9: ( NOT )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==NOT) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==ID||LA24_1==INTEGER_NUMBER||LA24_1==MINUS||LA24_1==NOT||LA24_1==PLUS||LA24_1==REAL_NUMBER||LA24_1==TEXT_STRING) ) {
					alt24=1;
				}
			}
			switch (alt24) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:355:10: NOT
					{
					NOT29=(Token)match(input,NOT,FOLLOW_NOT_in_expr_factor31483); 
					}
					break;

			}

			pushFollow(FOLLOW_expr_factor4_in_expr_factor31487);
			expr_factor430=expr_factor4();
			state._fsp--;

			 expr = new ExpressionBinary((NOT29!=null?NOT29.getText():null), null, expr_factor430); 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "expr_factor3"



	// $ANTLR start "expr_factor4"
	// src/main/sqlplus/parser/SQLPlus.g:358:1: expr_factor4 returns [Expression expr] : bool_primary ( IS ( NOT )? ( boolean_literal | NULL ) )? ;
	public final Expression expr_factor4() throws RecognitionException {
		Expression expr = null;


		Expression bool_primary31 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:362:5: ( bool_primary ( IS ( NOT )? ( boolean_literal | NULL ) )? )
			// src/main/sqlplus/parser/SQLPlus.g:362:9: bool_primary ( IS ( NOT )? ( boolean_literal | NULL ) )?
			{
			pushFollow(FOLLOW_bool_primary_in_expr_factor41521);
			bool_primary31=bool_primary();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:362:22: ( IS ( NOT )? ( boolean_literal | NULL ) )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==IS) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:362:24: IS ( NOT )? ( boolean_literal | NULL )
					{
					match(input,IS,FOLLOW_IS_in_expr_factor41525); 
					// src/main/sqlplus/parser/SQLPlus.g:362:27: ( NOT )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==NOT) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:362:28: NOT
							{
							match(input,NOT,FOLLOW_NOT_in_expr_factor41528); 
							}
							break;

					}

					// src/main/sqlplus/parser/SQLPlus.g:362:34: ( boolean_literal | NULL )
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==FALSE||LA26_0==TRUE) ) {
						alt26=1;
					}
					else if ( (LA26_0==NULL) ) {
						alt26=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}

					switch (alt26) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:362:35: boolean_literal
							{
							pushFollow(FOLLOW_boolean_literal_in_expr_factor41533);
							boolean_literal();
							state._fsp--;

							}
							break;
						case 2 :
							// src/main/sqlplus/parser/SQLPlus.g:362:53: NULL
							{
							match(input,NULL,FOLLOW_NULL_in_expr_factor41537); 
							}
							break;

					}

					}
					break;

			}

			 expr = bool_primary31; 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "expr_factor4"



	// $ANTLR start "bool_primary"
	// src/main/sqlplus/parser/SQLPlus.g:365:1: bool_primary returns [Expression expr] : (left= predicate relational_op right= predicate | predicate relational_op ( ALL | ANY )? subquery | NOT EXISTS subquery | predicate );
	public final Expression bool_primary() throws RecognitionException {
		Expression expr = null;


		Expression left =null;
		Expression right =null;
		ParserRuleReturnScope relational_op32 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:369:5: (left= predicate relational_op right= predicate | predicate relational_op ( ALL | ANY )? subquery | NOT EXISTS subquery | predicate )
			int alt29=4;
			switch ( input.LA(1) ) {
			case TEXT_STRING:
				{
				int LA29_1 = input.LA(2);
				if ( (LA29_1==EQUAL||(LA29_1 >= GREATER_THAN && LA29_1 <= GREATER_THAN_EQUAL)||(LA29_1 >= LESS_THAN && LA29_1 <= LESS_THAN_EQUAL)||LA29_1==NOT_EQUAL) ) {
					int LA29_6 = input.LA(3);
					if ( (LA29_6==ID||LA29_6==INTEGER_NUMBER||LA29_6==MINUS||LA29_6==PLUS||LA29_6==REAL_NUMBER||LA29_6==TEXT_STRING) ) {
						alt29=1;
					}
					else if ( (LA29_6==ALL||LA29_6==ANY||LA29_6==LEFT_PARENTHESIS) ) {
						alt29=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA29_1==AND||LA29_1==COMMA||LA29_1==IS||LA29_1==OR||LA29_1==RIGHT_PARENTHESIS||LA29_1==SEMICOLON||LA29_1==WHERE||LA29_1==XOR) ) {
					alt29=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MINUS:
			case PLUS:
				{
				int LA29_2 = input.LA(2);
				if ( (LA29_2==INTEGER_NUMBER||LA29_2==REAL_NUMBER) ) {
					int LA29_3 = input.LA(3);
					if ( (LA29_3==EQUAL||(LA29_3 >= GREATER_THAN && LA29_3 <= GREATER_THAN_EQUAL)||(LA29_3 >= LESS_THAN && LA29_3 <= LESS_THAN_EQUAL)||LA29_3==NOT_EQUAL) ) {
						int LA29_6 = input.LA(4);
						if ( (LA29_6==ID||LA29_6==INTEGER_NUMBER||LA29_6==MINUS||LA29_6==PLUS||LA29_6==REAL_NUMBER||LA29_6==TEXT_STRING) ) {
							alt29=1;
						}
						else if ( (LA29_6==ALL||LA29_6==ANY||LA29_6==LEFT_PARENTHESIS) ) {
							alt29=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 29, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA29_3==AND||LA29_3==COMMA||LA29_3==IS||LA29_3==OR||LA29_3==RIGHT_PARENTHESIS||LA29_3==SEMICOLON||LA29_3==WHERE||LA29_3==XOR) ) {
						alt29=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INTEGER_NUMBER:
			case REAL_NUMBER:
				{
				int LA29_3 = input.LA(2);
				if ( (LA29_3==EQUAL||(LA29_3 >= GREATER_THAN && LA29_3 <= GREATER_THAN_EQUAL)||(LA29_3 >= LESS_THAN && LA29_3 <= LESS_THAN_EQUAL)||LA29_3==NOT_EQUAL) ) {
					int LA29_6 = input.LA(3);
					if ( (LA29_6==ID||LA29_6==INTEGER_NUMBER||LA29_6==MINUS||LA29_6==PLUS||LA29_6==REAL_NUMBER||LA29_6==TEXT_STRING) ) {
						alt29=1;
					}
					else if ( (LA29_6==ALL||LA29_6==ANY||LA29_6==LEFT_PARENTHESIS) ) {
						alt29=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA29_3==AND||LA29_3==COMMA||LA29_3==IS||LA29_3==OR||LA29_3==RIGHT_PARENTHESIS||LA29_3==SEMICOLON||LA29_3==WHERE||LA29_3==XOR) ) {
					alt29=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ID:
				{
				switch ( input.LA(2) ) {
				case DOT:
					{
					int LA29_8 = input.LA(3);
					if ( (LA29_8==ID) ) {
						switch ( input.LA(4) ) {
						case DOT:
							{
							int LA29_12 = input.LA(5);
							if ( (LA29_12==ID) ) {
								int LA29_13 = input.LA(6);
								if ( (LA29_13==EQUAL||(LA29_13 >= GREATER_THAN && LA29_13 <= GREATER_THAN_EQUAL)||(LA29_13 >= LESS_THAN && LA29_13 <= LESS_THAN_EQUAL)||LA29_13==NOT_EQUAL) ) {
									int LA29_6 = input.LA(7);
									if ( (LA29_6==ID||LA29_6==INTEGER_NUMBER||LA29_6==MINUS||LA29_6==PLUS||LA29_6==REAL_NUMBER||LA29_6==TEXT_STRING) ) {
										alt29=1;
									}
									else if ( (LA29_6==ALL||LA29_6==ANY||LA29_6==LEFT_PARENTHESIS) ) {
										alt29=2;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 29, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( (LA29_13==AND||LA29_13==COMMA||LA29_13==IS||LA29_13==OR||LA29_13==RIGHT_PARENTHESIS||LA29_13==SEMICOLON||LA29_13==WHERE||LA29_13==XOR) ) {
									alt29=4;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 29, 13, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 29, 12, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case EQUAL:
						case GREATER_THAN:
						case GREATER_THAN_EQUAL:
						case LESS_THAN:
						case LESS_THAN_EQUAL:
						case NOT_EQUAL:
							{
							int LA29_6 = input.LA(5);
							if ( (LA29_6==ID||LA29_6==INTEGER_NUMBER||LA29_6==MINUS||LA29_6==PLUS||LA29_6==REAL_NUMBER||LA29_6==TEXT_STRING) ) {
								alt29=1;
							}
							else if ( (LA29_6==ALL||LA29_6==ANY||LA29_6==LEFT_PARENTHESIS) ) {
								alt29=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 29, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case AND:
						case COMMA:
						case IS:
						case OR:
						case RIGHT_PARENTHESIS:
						case SEMICOLON:
						case WHERE:
						case XOR:
							{
							alt29=4;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 29, 11, input);
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
								new NoViableAltException("", 29, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EQUAL:
				case GREATER_THAN:
				case GREATER_THAN_EQUAL:
				case LESS_THAN:
				case LESS_THAN_EQUAL:
				case NOT_EQUAL:
					{
					int LA29_6 = input.LA(3);
					if ( (LA29_6==ID||LA29_6==INTEGER_NUMBER||LA29_6==MINUS||LA29_6==PLUS||LA29_6==REAL_NUMBER||LA29_6==TEXT_STRING) ) {
						alt29=1;
					}
					else if ( (LA29_6==ALL||LA29_6==ANY||LA29_6==LEFT_PARENTHESIS) ) {
						alt29=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case AND:
				case COMMA:
				case IS:
				case OR:
				case RIGHT_PARENTHESIS:
				case SEMICOLON:
				case WHERE:
				case XOR:
					{
					alt29=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NOT:
				{
				alt29=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:369:9: left= predicate relational_op right= predicate
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1579);
					left=predicate();
					state._fsp--;

					pushFollow(FOLLOW_relational_op_in_bool_primary1589);
					relational_op32=relational_op();
					state._fsp--;

					pushFollow(FOLLOW_predicate_in_bool_primary1603);
					right=predicate();
					state._fsp--;


					            expr = new ExpressionBinary((relational_op32!=null?input.toString(relational_op32.start,relational_op32.stop):null), left, right);
					        
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:374:9: predicate relational_op ( ALL | ANY )? subquery
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1615);
					predicate();
					state._fsp--;

					pushFollow(FOLLOW_relational_op_in_bool_primary1617);
					relational_op();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:374:33: ( ALL | ANY )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==ALL||LA28_0==ANY) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:
							{
							if ( input.LA(1)==ALL||input.LA(1)==ANY ) {
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

					pushFollow(FOLLOW_subquery_in_bool_primary1630);
					subquery();
					state._fsp--;

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:375:9: NOT EXISTS subquery
					{
					match(input,NOT,FOLLOW_NOT_in_bool_primary1640); 
					match(input,EXISTS,FOLLOW_EXISTS_in_bool_primary1642); 
					pushFollow(FOLLOW_subquery_in_bool_primary1644);
					subquery();
					state._fsp--;

					}
					break;
				case 4 :
					// src/main/sqlplus/parser/SQLPlus.g:376:9: predicate
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1654);
					predicate();
					state._fsp--;

					}
					break;

			}
		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "bool_primary"



	// $ANTLR start "predicate"
	// src/main/sqlplus/parser/SQLPlus.g:379:1: predicate returns [Expression expr] : bit_expr ;
	public final Expression predicate() throws RecognitionException {
		Expression expr = null;


		ParserRuleReturnScope bit_expr33 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:383:5: ( bit_expr )
			// src/main/sqlplus/parser/SQLPlus.g:383:9: bit_expr
			{
			pushFollow(FOLLOW_bit_expr_in_predicate1686);
			bit_expr33=bit_expr();
			state._fsp--;

			 expr = new ExpressionLiteral((bit_expr33!=null?input.toString(bit_expr33.start,bit_expr33.stop):null)); 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "predicate"


	public static class bit_expr_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "bit_expr"
	// src/main/sqlplus/parser/SQLPlus.g:386:1: bit_expr : simple_expr ;
	public final SQLPlusParser.bit_expr_return bit_expr() throws RecognitionException {
		SQLPlusParser.bit_expr_return retval = new SQLPlusParser.bit_expr_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:387:5: ( simple_expr )
			// src/main/sqlplus/parser/SQLPlus.g:387:9: simple_expr
			{
			pushFollow(FOLLOW_simple_expr_in_bit_expr1707);
			simple_expr();
			state._fsp--;

			}

			retval.stop = input.LT(-1);

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bit_expr"



	// $ANTLR start "simple_expr"
	// src/main/sqlplus/parser/SQLPlus.g:390:1: simple_expr : ( literal_value | column_spec );
	public final void simple_expr() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:391:5: ( literal_value | column_spec )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==INTEGER_NUMBER||LA30_0==MINUS||LA30_0==PLUS||LA30_0==REAL_NUMBER||LA30_0==TEXT_STRING) ) {
				alt30=1;
			}
			else if ( (LA30_0==ID) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:391:9: literal_value
					{
					pushFollow(FOLLOW_literal_value_in_simple_expr1726);
					literal_value();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:392:9: column_spec
					{
					pushFollow(FOLLOW_column_spec_in_simple_expr1736);
					column_spec();
					state._fsp--;

					}
					break;

			}
		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "simple_expr"



	// $ANTLR start "literal_value"
	// src/main/sqlplus/parser/SQLPlus.g:395:1: literal_value : ( string_literal | number_literal );
	public final void literal_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:396:5: ( string_literal | number_literal )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==TEXT_STRING) ) {
				alt31=1;
			}
			else if ( (LA31_0==INTEGER_NUMBER||LA31_0==MINUS||LA31_0==PLUS||LA31_0==REAL_NUMBER) ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:396:9: string_literal
					{
					pushFollow(FOLLOW_string_literal_in_literal_value1755);
					string_literal();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:397:9: number_literal
					{
					pushFollow(FOLLOW_number_literal_in_literal_value1765);
					number_literal();
					state._fsp--;

					}
					break;

			}
		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "literal_value"


	public static class relational_op_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "relational_op"
	// src/main/sqlplus/parser/SQLPlus.g:400:1: relational_op : ( EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LESS_THAN | LESS_THAN_EQUAL | NOT_EQUAL );
	public final SQLPlusParser.relational_op_return relational_op() throws RecognitionException {
		SQLPlusParser.relational_op_return retval = new SQLPlusParser.relational_op_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:401:5: ( EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LESS_THAN | LESS_THAN_EQUAL | NOT_EQUAL )
			// src/main/sqlplus/parser/SQLPlus.g:
			{
			if ( input.LA(1)==EQUAL||(input.LA(1) >= GREATER_THAN && input.LA(1) <= GREATER_THAN_EQUAL)||(input.LA(1) >= LESS_THAN && input.LA(1) <= LESS_THAN_EQUAL)||input.LA(1)==NOT_EQUAL ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relational_op"



	// $ANTLR start "string_literal"
	// src/main/sqlplus/parser/SQLPlus.g:409:1: string_literal : TEXT_STRING ;
	public final void string_literal() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:409:17: ( TEXT_STRING )
			// src/main/sqlplus/parser/SQLPlus.g:409:21: TEXT_STRING
			{
			match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_string_literal1850); 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "string_literal"



	// $ANTLR start "number_literal"
	// src/main/sqlplus/parser/SQLPlus.g:410:1: number_literal : ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER ) ;
	public final void number_literal() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:410:17: ( ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER ) )
			// src/main/sqlplus/parser/SQLPlus.g:410:19: ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER )
			{
			// src/main/sqlplus/parser/SQLPlus.g:410:19: ( PLUS | MINUS )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==MINUS||LA32_0==PLUS) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:
					{
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
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

			if ( input.LA(1)==INTEGER_NUMBER||input.LA(1)==REAL_NUMBER ) {
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
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "number_literal"



	// $ANTLR start "boolean_literal"
	// src/main/sqlplus/parser/SQLPlus.g:411:1: boolean_literal : ( TRUE | FALSE );
	public final void boolean_literal() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:411:17: ( TRUE | FALSE )
			// src/main/sqlplus/parser/SQLPlus.g:
			{
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
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
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "boolean_literal"



	// $ANTLR start "timing"
	// src/main/sqlplus/parser/SQLPlus.g:414:1: timing : ( BEFORE | AFTER );
	public final void timing() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:415:2: ( BEFORE | AFTER )
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
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "timing"



	// $ANTLR start "data_manipulation_language"
	// src/main/sqlplus/parser/SQLPlus.g:419:1: data_manipulation_language : ( INSERT | DELETE | UPDATE );
	public final void data_manipulation_language() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:420:2: ( INSERT | DELETE | UPDATE )
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
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "data_manipulation_language"



	// $ANTLR start "relational_operation"
	// src/main/sqlplus/parser/SQLPlus.g:425:1: relational_operation : ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE );
	public final void relational_operation() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:426:2: ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE )
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
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relational_operation"



	// $ANTLR start "match_value"
	// src/main/sqlplus/parser/SQLPlus.g:435:1: match_value : ( ID | QUESTION_MARK );
	public final void match_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:436:2: ( ID | QUESTION_MARK )
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
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "match_value"



	// $ANTLR start "alias"
	// src/main/sqlplus/parser/SQLPlus.g:440:1: alias : ( AS )? ID ;
	public final void alias() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:440:7: ( ( AS )? ID )
			// src/main/sqlplus/parser/SQLPlus.g:440:9: ( AS )? ID
			{
			// src/main/sqlplus/parser/SQLPlus.g:440:9: ( AS )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==AS) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:440:10: AS
					{
					match(input,AS,FOLLOW_AS_in_alias1989); 
					}
					break;

			}

			match(input,ID,FOLLOW_ID_in_alias1993); 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "alias"



	// $ANTLR start "column_name"
	// src/main/sqlplus/parser/SQLPlus.g:441:1: column_name : ID ;
	public final void column_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:441:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:441:15: ID
			{
			match(input,ID,FOLLOW_ID_in_column_name2000); 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "column_name"



	// $ANTLR start "partition_name"
	// src/main/sqlplus/parser/SQLPlus.g:442:1: partition_name : ID ;
	public final void partition_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:442:16: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:442:18: ID
			{
			match(input,ID,FOLLOW_ID_in_partition_name2007); 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "partition_name"


	public static class schema_name_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "schema_name"
	// src/main/sqlplus/parser/SQLPlus.g:443:1: schema_name : ID ;
	public final SQLPlusParser.schema_name_return schema_name() throws RecognitionException {
		SQLPlusParser.schema_name_return retval = new SQLPlusParser.schema_name_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:443:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:443:15: ID
			{
			match(input,ID,FOLLOW_ID_in_schema_name2014); 
			}

			retval.stop = input.LT(-1);

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "schema_name"



	// $ANTLR start "table_name"
	// src/main/sqlplus/parser/SQLPlus.g:444:1: table_name : ID ;
	public final void table_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:444:12: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:444:14: ID
			{
			match(input,ID,FOLLOW_ID_in_table_name2021); 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "table_name"

	// Delegated rules



	public static final BitSet FOLLOW_sql_statement_in_sqlplus47 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sqlplus_alert_in_sqlplus59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALERT_in_sqlplus_alert71 = new BitSet(new long[]{0x0000000000000810L});
	public static final BitSet FOLLOW_timing_in_sqlplus_alert73 = new BitSet(new long[]{0x0040000008010000L});
	public static final BitSet FOLLOW_data_manipulation_language_in_sqlplus_alert75 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IN_in_sqlplus_alert77 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert79 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IF_in_sqlplus_alert81 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert83 = new BitSet(new long[]{0x0000004700C40000L});
	public static final BitSet FOLLOW_relational_operation_in_sqlplus_alert85 = new BitSet(new long[]{0x0000040001000000L});
	public static final BitSet FOLLOW_match_value_in_sqlplus_alert87 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus_alert89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_data_manipulation_statements_in_sql_statement117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_statement_in_sql_statement124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_database_in_use_statement147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_use_database170 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_schema_name_in_use_database178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_statement_in_data_manipulation_statements203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_statements_in_data_manipulation_statements215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_update_statements_in_data_manipulation_statements227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_expression_in_select_statement253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_statement1_in_insert_statements284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_table_update_statement_in_update_statements310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select_expression335 = new BitSet(new long[]{0x0000000001000400L});
	public static final BitSet FOLLOW_select_list_in_select_expression337 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_FROM_in_select_expression339 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_table_references_in_select_expression342 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_where_clause_in_select_expression345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_header_in_insert_statement1375 = new BitSet(new long[]{0x0100000080000000L});
	public static final BitSet FOLLOW_column_list_in_insert_statement1383 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_value_list_clause_in_insert_statement1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UPDATE_in_single_table_update_statement410 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_table_reference_in_single_table_update_statement412 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_set_columns_clause_in_single_table_update_statement414 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_where_clause_in_single_table_update_statement417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_displayed_column_in_select_list446 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_select_list457 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_displayed_column_in_select_list463 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ASTERISK_in_select_list476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_displayed_column489 = new BitSet(new long[]{0x0000000001000202L});
	public static final BitSet FOLLOW_alias_in_displayed_column492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_references519 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_table_references530 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_table_reference_in_table_references539 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_table_atom_in_table_reference557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insert_header586 = new BitSet(new long[]{0x0000000021000000L});
	public static final BitSet FOLLOW_INTO_in_insert_header589 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_table_spec_in_insert_header593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALUES_in_value_list_clause627 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_column_value_list_in_value_list_clause641 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_value_list_clause667 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_column_value_list_in_value_list_clause685 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_column_value_list730 = new BitSet(new long[]{0x0008120811000000L});
	public static final BitSet FOLLOW_bit_expr_in_column_value_list744 = new BitSet(new long[]{0x0000200000002000L});
	public static final BitSet FOLLOW_COMMA_in_column_value_list770 = new BitSet(new long[]{0x0008120811000000L});
	public static final BitSet FOLLOW_bit_expr_in_column_value_list788 = new BitSet(new long[]{0x0000200000002000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_column_value_list803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_columns_clause835 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_set_column_clause_in_set_columns_clause849 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_set_columns_clause875 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_set_column_clause_in_set_columns_clause893 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_column_spec_in_set_column_clause936 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQUAL_in_set_column_clause938 = new BitSet(new long[]{0x0008122811008000L});
	public static final BitSet FOLLOW_expression_in_set_column_clause954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_set_column_clause984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_where_clause1028 = new BitSet(new long[]{0x0008122811000000L});
	public static final BitSet FOLLOW_expression_in_where_clause1030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_spec_in_table_atom1046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_table_spec1058 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DOT_in_table_spec1060 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_table_name_in_table_spec1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_column_list1090 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_column_spec_in_column_list1101 = new BitSet(new long[]{0x0000200000002000L});
	public static final BitSet FOLLOW_COMMA_in_column_list1127 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_column_spec_in_column_list1145 = new BitSet(new long[]{0x0000200000002000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_column_list1160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_column_spec1175 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DOT_in_column_spec1177 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_table_name_in_column_spec1181 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DOT_in_column_spec1183 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_column_name_in_column_spec1187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_subquery1203 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_select_statement_in_subquery1205 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_subquery1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_factor1_in_expression1243 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_OR_in_expression1269 = new BitSet(new long[]{0x0008122811000000L});
	public static final BitSet FOLLOW_expr_factor1_in_expression1275 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_expr_factor2_in_expr_factor11324 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_XOR_in_expr_factor11350 = new BitSet(new long[]{0x0008122811000000L});
	public static final BitSet FOLLOW_expr_factor2_in_expr_factor11356 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_expr_factor3_in_expr_factor21405 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_AND_in_expr_factor21431 = new BitSet(new long[]{0x0008122811000000L});
	public static final BitSet FOLLOW_expr_factor3_in_expr_factor21437 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_NOT_in_expr_factor31483 = new BitSet(new long[]{0x0008122811000000L});
	public static final BitSet FOLLOW_expr_factor4_in_expr_factor31487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_primary_in_expr_factor41521 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_IS_in_expr_factor41525 = new BitSet(new long[]{0x001000A000100000L});
	public static final BitSet FOLLOW_NOT_in_expr_factor41528 = new BitSet(new long[]{0x0010008000100000L});
	public static final BitSet FOLLOW_boolean_literal_in_expr_factor41533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_expr_factor41537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1579 = new BitSet(new long[]{0x0000004300C40000L});
	public static final BitSet FOLLOW_relational_op_in_bool_primary1589 = new BitSet(new long[]{0x0008120811000000L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1615 = new BitSet(new long[]{0x0000004300C40000L});
	public static final BitSet FOLLOW_relational_op_in_bool_primary1617 = new BitSet(new long[]{0x0000000080000140L});
	public static final BitSet FOLLOW_subquery_in_bool_primary1630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_bool_primary1640 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EXISTS_in_bool_primary1642 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_subquery_in_bool_primary1644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bit_expr_in_predicate1686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_expr_in_bit_expr1707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_value_in_simple_expr1726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_simple_expr1736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_literal_value1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_literal_in_literal_value1765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_STRING_in_string_literal1850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_number_literal1867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_alias1989 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_ID_in_alias1993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name2000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partition_name2007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_schema_name2014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name2021 = new BitSet(new long[]{0x0000000000000002L});
}
