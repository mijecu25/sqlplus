// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlus.g 2016-07-18 18:06:33

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
	import com.mijecu25.sqlplus.compiler.alert.Alert;


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
	// src/main/sqlplus/parser/SQLPlus.g:44:1: sqlplus returns [Statement statement] : ( sql_statement SEMICOLON | sqlplus_alert SEMICOLON );
	public final Statement sqlplus() throws RecognitionException {
		Statement statement = null;


		Statement sql_statement1 =null;
		Statement sqlplus_alert2 =null;


				statement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:48:2: ( sql_statement SEMICOLON | sqlplus_alert SEMICOLON )
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
					// src/main/sqlplus/parser/SQLPlus.g:48:5: sql_statement SEMICOLON
					{
					pushFollow(FOLLOW_sql_statement_in_sqlplus47);
					sql_statement1=sql_statement();
					state._fsp--;

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sqlplus49); 

								statement = sql_statement1;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:51:4: sqlplus_alert SEMICOLON
					{
					pushFollow(FOLLOW_sqlplus_alert_in_sqlplus56);
					sqlplus_alert2=sqlplus_alert();
					state._fsp--;

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sqlplus58); 

						        statement = sqlplus_alert2;
					        
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
	// src/main/sqlplus/parser/SQLPlus.g:57:1: sqlplus_alert returns [Statement alert] : ALERT timing data_manipulation_language IN table_reference where_clause ;
	public final Statement sqlplus_alert() throws RecognitionException {
		Statement alert = null;


		ParserRuleReturnScope timing3 =null;
		ParserRuleReturnScope data_manipulation_language4 =null;
		ParserRuleReturnScope table_reference5 =null;
		Expression where_clause6 =null;


		        alert = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:62:5: ( ALERT timing data_manipulation_language IN table_reference where_clause )
			// src/main/sqlplus/parser/SQLPlus.g:62:9: ALERT timing data_manipulation_language IN table_reference where_clause
			{
			match(input,ALERT,FOLLOW_ALERT_in_sqlplus_alert95); 
			pushFollow(FOLLOW_timing_in_sqlplus_alert97);
			timing3=timing();
			state._fsp--;

			pushFollow(FOLLOW_data_manipulation_language_in_sqlplus_alert99);
			data_manipulation_language4=data_manipulation_language();
			state._fsp--;

			match(input,IN,FOLLOW_IN_in_sqlplus_alert101); 
			pushFollow(FOLLOW_table_reference_in_sqlplus_alert103);
			table_reference5=table_reference();
			state._fsp--;

			pushFollow(FOLLOW_where_clause_in_sqlplus_alert105);
			where_clause6=where_clause();
			state._fsp--;


			            alert = new Alert((timing3!=null?input.toString(timing3.start,timing3.stop):null), (data_manipulation_language4!=null?input.toString(data_manipulation_language4.start,data_manipulation_language4.stop):null), (table_reference5!=null?input.toString(table_reference5.start,table_reference5.stop):null), where_clause6);
			        
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return alert;
	}
	// $ANTLR end "sqlplus_alert"



	// $ANTLR start "sql_statement"
	// src/main/sqlplus/parser/SQLPlus.g:67:1: sql_statement returns [Statement sqlStatement] : ( data_manipulation_statements | use_statement );
	public final Statement sql_statement() throws RecognitionException {
		Statement sqlStatement = null;


		Statement data_manipulation_statements7 =null;
		Statement use_statement8 =null;


				sqlStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:71:2: ( data_manipulation_statements | use_statement )
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
					// src/main/sqlplus/parser/SQLPlus.g:71:6: data_manipulation_statements
					{
					pushFollow(FOLLOW_data_manipulation_statements_in_sql_statement135);
					data_manipulation_statements7=data_manipulation_statements();
					state._fsp--;


						        sqlStatement = data_manipulation_statements7;
						    
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:74:4: use_statement
					{
					pushFollow(FOLLOW_use_statement_in_sql_statement142);
					use_statement8=use_statement();
					state._fsp--;


								sqlStatement = use_statement8;
							
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
	// src/main/sqlplus/parser/SQLPlus.g:79:1: use_statement returns [Statement useStatement] : use_database ;
	public final Statement use_statement() throws RecognitionException {
		Statement useStatement = null;


		Statement use_database9 =null;


				useStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:83:2: ( use_database )
			// src/main/sqlplus/parser/SQLPlus.g:83:4: use_database
			{
			pushFollow(FOLLOW_use_database_in_use_statement165);
			use_database9=use_database();
			state._fsp--;


						useStatement = use_database9;
					
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
	// src/main/sqlplus/parser/SQLPlus.g:88:1: use_database returns [Statement useDatabaseStatement] : USE database= schema_name ;
	public final Statement use_database() throws RecognitionException {
		Statement useDatabaseStatement = null;


		ParserRuleReturnScope database =null;


				useDatabaseStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:92:2: ( USE database= schema_name )
			// src/main/sqlplus/parser/SQLPlus.g:92:4: USE database= schema_name
			{
			match(input,USE,FOLLOW_USE_in_use_database188); 
			pushFollow(FOLLOW_schema_name_in_use_database196);
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
	// src/main/sqlplus/parser/SQLPlus.g:98:1: data_manipulation_statements returns [Statement dataManipulationStatement] : ( select_statement | insert_statements | update_statements );
	public final Statement data_manipulation_statements() throws RecognitionException {
		Statement dataManipulationStatement = null;


		Statement select_statement10 =null;
		Statement insert_statements11 =null;
		Statement update_statements12 =null;


			    dataManipulationStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:102:2: ( select_statement | insert_statements | update_statements )
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
					// src/main/sqlplus/parser/SQLPlus.g:102:6: select_statement
					{
					pushFollow(FOLLOW_select_statement_in_data_manipulation_statements221);
					select_statement10=select_statement();
					state._fsp--;


					            dataManipulationStatement = select_statement10;
					        
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:105:9: insert_statements
					{
					pushFollow(FOLLOW_insert_statements_in_data_manipulation_statements233);
					insert_statements11=insert_statements();
					state._fsp--;


					            dataManipulationStatement = insert_statements11;
					        
					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:108:9: update_statements
					{
					pushFollow(FOLLOW_update_statements_in_data_manipulation_statements245);
					update_statements12=update_statements();
					state._fsp--;


					            dataManipulationStatement = update_statements12;
					    
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
	// src/main/sqlplus/parser/SQLPlus.g:113:1: select_statement returns [Statement selectStatement] : select_expression ;
	public final Statement select_statement() throws RecognitionException {
		Statement selectStatement = null;


		Statement select_expression13 =null;


				selectStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:117:2: ( select_expression )
			// src/main/sqlplus/parser/SQLPlus.g:117:4: select_expression
			{
			pushFollow(FOLLOW_select_expression_in_select_statement271);
			select_expression13=select_expression();
			state._fsp--;


						selectStatement = select_expression13;
					
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
	// src/main/sqlplus/parser/SQLPlus.g:122:1: insert_statements returns [Statement insertStatements] : insert_statement1 ;
	public final Statement insert_statements() throws RecognitionException {
		Statement insertStatements = null;


		Statement insert_statement114 =null;


		        insertStatements = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:126:5: ( insert_statement1 )
			// src/main/sqlplus/parser/SQLPlus.g:126:9: insert_statement1
			{
			pushFollow(FOLLOW_insert_statement1_in_insert_statements302);
			insert_statement114=insert_statement1();
			state._fsp--;


			            insertStatements = insert_statement114;
			        
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
	// src/main/sqlplus/parser/SQLPlus.g:131:1: update_statements returns [Statement updateStatements] : single_table_update_statement ;
	public final Statement update_statements() throws RecognitionException {
		Statement updateStatements = null;


		Statement single_table_update_statement15 =null;


				updateStatements = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:135:2: ( single_table_update_statement )
			// src/main/sqlplus/parser/SQLPlus.g:135:4: single_table_update_statement
			{
			pushFollow(FOLLOW_single_table_update_statement_in_update_statements328);
			single_table_update_statement15=single_table_update_statement();
			state._fsp--;


						updateStatements = single_table_update_statement15;
					
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
	// src/main/sqlplus/parser/SQLPlus.g:140:1: select_expression returns [Statement selectExpression] : SELECT select_list FROM ( table_references ( where_clause )? )? ;
	public final Statement select_expression() throws RecognitionException {
		Statement selectExpression = null;


		List<String> select_list16 =null;
		List<String> table_references17 =null;
		Expression where_clause18 =null;


				selectExpression = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:145:2: ( SELECT select_list FROM ( table_references ( where_clause )? )? )
			// src/main/sqlplus/parser/SQLPlus.g:145:4: SELECT select_list FROM ( table_references ( where_clause )? )?
			{
			match(input,SELECT,FOLLOW_SELECT_in_select_expression353); 
			pushFollow(FOLLOW_select_list_in_select_expression355);
			select_list16=select_list();
			state._fsp--;

			match(input,FROM,FOLLOW_FROM_in_select_expression357); 
			// src/main/sqlplus/parser/SQLPlus.g:145:28: ( table_references ( where_clause )? )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:145:29: table_references ( where_clause )?
					{
					pushFollow(FOLLOW_table_references_in_select_expression360);
					table_references17=table_references();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:145:46: ( where_clause )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==WHERE) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:145:47: where_clause
							{
							pushFollow(FOLLOW_where_clause_in_select_expression363);
							where_clause18=where_clause();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}


						selectExpression = new StatementSelectExpression(select_list16, table_references17, where_clause18);
					
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
	// src/main/sqlplus/parser/SQLPlus.g:150:1: insert_statement1 returns [Statement insertStatement1] : insert_header ( column_list )? value_list_clause ;
	public final Statement insert_statement1() throws RecognitionException {
		Statement insertStatement1 = null;


		String insert_header19 =null;
		List<String> column_list20 =null;
		List<List<String>> value_list_clause21 =null;


			    insertStatement1 = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:154:2: ( insert_header ( column_list )? value_list_clause )
			// src/main/sqlplus/parser/SQLPlus.g:154:6: insert_header ( column_list )? value_list_clause
			{
			pushFollow(FOLLOW_insert_header_in_insert_statement1393);
			insert_header19=insert_header();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:155:6: ( column_list )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==LEFT_PARENTHESIS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:155:7: column_list
					{
					pushFollow(FOLLOW_column_list_in_insert_statement1401);
					column_list20=column_list();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_value_list_clause_in_insert_statement1405);
			value_list_clause21=value_list_clause();
			state._fsp--;


				        insertStatement1 = new StatementInsertStatement1(insert_header19, column_list20, value_list_clause21);
				    
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
	// src/main/sqlplus/parser/SQLPlus.g:160:1: single_table_update_statement returns [Statement singleTableUpdateStatement] : UPDATE table_reference set_columns_clause ( where_clause )? ;
	public final Statement single_table_update_statement() throws RecognitionException {
		Statement singleTableUpdateStatement = null;


		ParserRuleReturnScope table_reference22 =null;
		Map<String, Expression> set_columns_clause23 =null;
		Expression where_clause24 =null;


				singleTableUpdateStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:164:2: ( UPDATE table_reference set_columns_clause ( where_clause )? )
			// src/main/sqlplus/parser/SQLPlus.g:164:4: UPDATE table_reference set_columns_clause ( where_clause )?
			{
			match(input,UPDATE,FOLLOW_UPDATE_in_single_table_update_statement428); 
			pushFollow(FOLLOW_table_reference_in_single_table_update_statement430);
			table_reference22=table_reference();
			state._fsp--;

			pushFollow(FOLLOW_set_columns_clause_in_single_table_update_statement432);
			set_columns_clause23=set_columns_clause();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:164:46: ( where_clause )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==WHERE) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:164:47: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_single_table_update_statement435);
					where_clause24=where_clause();
					state._fsp--;

					}
					break;

			}


						singleTableUpdateStatement = new StatementSingleTableUpdateStatement((table_reference22!=null?input.toString(table_reference22.start,table_reference22.stop):null), set_columns_clause23, where_clause24);
					
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
	// src/main/sqlplus/parser/SQLPlus.g:169:1: select_list returns [List<String> selectList] : (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK );
	public final List<String> select_list() throws RecognitionException {
		List<String> selectList = null;


		Token ASTERISK25=null;
		ParserRuleReturnScope column =null;


				selectList = new ArrayList<String>();
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:173:2: (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK )
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
					// src/main/sqlplus/parser/SQLPlus.g:173:4: column= displayed_column ( COMMA column= displayed_column )*
					{
					pushFollow(FOLLOW_displayed_column_in_select_list464);
					column=displayed_column();
					state._fsp--;


						 		selectList.add((column!=null?input.toString(column.start,column.stop):null));
							
					// src/main/sqlplus/parser/SQLPlus.g:176:3: ( COMMA column= displayed_column )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==COMMA) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:177:4: COMMA column= displayed_column
							{
							match(input,COMMA,FOLLOW_COMMA_in_select_list475); 
							pushFollow(FOLLOW_displayed_column_in_select_list481);
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
					// src/main/sqlplus/parser/SQLPlus.g:181:5: ASTERISK
					{
					ASTERISK25=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_select_list494); 

								selectList.add((ASTERISK25!=null?ASTERISK25.getText():null));
							
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
	// src/main/sqlplus/parser/SQLPlus.g:186:1: displayed_column : column_spec ( alias )? ;
	public final SQLPlusParser.displayed_column_return displayed_column() throws RecognitionException {
		SQLPlusParser.displayed_column_return retval = new SQLPlusParser.displayed_column_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:187:2: ( column_spec ( alias )? )
			// src/main/sqlplus/parser/SQLPlus.g:187:4: column_spec ( alias )?
			{
			pushFollow(FOLLOW_column_spec_in_displayed_column507);
			column_spec();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:187:16: ( alias )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==AS||LA10_0==ID) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:187:17: alias
					{
					pushFollow(FOLLOW_alias_in_displayed_column510);
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
	// src/main/sqlplus/parser/SQLPlus.g:190:1: table_references returns [List<String> tableReferences] : table= table_reference ( COMMA table= table_reference )* ;
	public final List<String> table_references() throws RecognitionException {
		List<String> tableReferences = null;


		ParserRuleReturnScope table =null;


				tableReferences = new ArrayList<String>();
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:194:2: (table= table_reference ( COMMA table= table_reference )* )
			// src/main/sqlplus/parser/SQLPlus.g:194:4: table= table_reference ( COMMA table= table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_references537);
			table=table_reference();
			state._fsp--;


						tableReferences.add((table!=null?input.toString(table.start,table.stop):null));
					
			// src/main/sqlplus/parser/SQLPlus.g:197:3: ( COMMA table= table_reference )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==COMMA) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:198:4: COMMA table= table_reference
					{
					match(input,COMMA,FOLLOW_COMMA_in_table_references548); 
					pushFollow(FOLLOW_table_reference_in_table_references557);
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
	// src/main/sqlplus/parser/SQLPlus.g:205:1: table_reference : table_atom ;
	public final SQLPlusParser.table_reference_return table_reference() throws RecognitionException {
		SQLPlusParser.table_reference_return retval = new SQLPlusParser.table_reference_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:206:2: ( table_atom )
			// src/main/sqlplus/parser/SQLPlus.g:206:4: table_atom
			{
			pushFollow(FOLLOW_table_atom_in_table_reference575);
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
	// src/main/sqlplus/parser/SQLPlus.g:209:1: insert_header returns [String table] : INSERT ( INTO )? table_spec ;
	public final String insert_header() throws RecognitionException {
		String table = null;


		ParserRuleReturnScope table_spec26 =null;


		        table = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:213:5: ( INSERT ( INTO )? table_spec )
			// src/main/sqlplus/parser/SQLPlus.g:213:9: INSERT ( INTO )? table_spec
			{
			match(input,INSERT,FOLLOW_INSERT_in_insert_header604); 
			// src/main/sqlplus/parser/SQLPlus.g:213:16: ( INTO )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==INTO) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:213:17: INTO
					{
					match(input,INTO,FOLLOW_INTO_in_insert_header607); 
					}
					break;

			}

			pushFollow(FOLLOW_table_spec_in_insert_header611);
			table_spec26=table_spec();
			state._fsp--;


			            table = (table_spec26!=null?input.toString(table_spec26.start,table_spec26.stop):null);
			        
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
	// src/main/sqlplus/parser/SQLPlus.g:218:1: value_list_clause returns [List<List<String>> valueListClause] : VALUES value= column_value_list ( COMMA value= column_value_list )* ;
	public final List<List<String>> value_list_clause() throws RecognitionException {
		List<List<String>> valueListClause = null;


		List<String> value =null;


		        valueListClause = new ArrayList<List<String>>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:222:5: ( VALUES value= column_value_list ( COMMA value= column_value_list )* )
			// src/main/sqlplus/parser/SQLPlus.g:222:9: VALUES value= column_value_list ( COMMA value= column_value_list )*
			{
			match(input,VALUES,FOLLOW_VALUES_in_value_list_clause645); 
			pushFollow(FOLLOW_column_value_list_in_value_list_clause659);
			value=column_value_list();
			state._fsp--;


			            valueListClause.add(value);
			        
			// src/main/sqlplus/parser/SQLPlus.g:226:9: ( COMMA value= column_value_list )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:227:13: COMMA value= column_value_list
					{
					match(input,COMMA,FOLLOW_COMMA_in_value_list_clause685); 
					pushFollow(FOLLOW_column_value_list_in_value_list_clause703);
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
	// src/main/sqlplus/parser/SQLPlus.g:234:1: column_value_list returns [List<String> columnValueList] : LEFT_PARENTHESIS expr= bit_expr ( COMMA expr= bit_expr )* RIGHT_PARENTHESIS ;
	public final List<String> column_value_list() throws RecognitionException {
		List<String> columnValueList = null;


		ParserRuleReturnScope expr =null;


		        columnValueList = new ArrayList<String>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:238:5: ( LEFT_PARENTHESIS expr= bit_expr ( COMMA expr= bit_expr )* RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:238:9: LEFT_PARENTHESIS expr= bit_expr ( COMMA expr= bit_expr )* RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_column_value_list748); 
			pushFollow(FOLLOW_bit_expr_in_column_value_list762);
			expr=bit_expr();
			state._fsp--;


			            columnValueList.add((expr!=null?input.toString(expr.start,expr.stop):null));
			        
			// src/main/sqlplus/parser/SQLPlus.g:242:9: ( COMMA expr= bit_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:243:13: COMMA expr= bit_expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_column_value_list788); 
					pushFollow(FOLLOW_bit_expr_in_column_value_list806);
					expr=bit_expr();
					state._fsp--;


					                columnValueList.add((expr!=null?input.toString(expr.start,expr.stop):null));
					            
					}
					break;

				default :
					break loop14;
				}
			}

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_column_value_list821); 
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
	// src/main/sqlplus/parser/SQLPlus.g:250:1: set_columns_clause returns [Map<String, Expression> columnsValuesMap] : SET columnValue= set_column_clause ( COMMA columnValue= set_column_clause )* ;
	public final Map<String, Expression> set_columns_clause() throws RecognitionException {
		Map<String, Expression> columnsValuesMap = null;


		Map<String, Expression> columnValue =null;


		        columnsValuesMap = new HashMap<String, Expression>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:254:5: ( SET columnValue= set_column_clause ( COMMA columnValue= set_column_clause )* )
			// src/main/sqlplus/parser/SQLPlus.g:254:9: SET columnValue= set_column_clause ( COMMA columnValue= set_column_clause )*
			{
			match(input,SET,FOLLOW_SET_in_set_columns_clause853); 
			pushFollow(FOLLOW_set_column_clause_in_set_columns_clause867);
			columnValue=set_column_clause();
			state._fsp--;


			            columnsValuesMap.putAll(columnValue);
			        
			// src/main/sqlplus/parser/SQLPlus.g:258:9: ( COMMA columnValue= set_column_clause )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==COMMA) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:259:13: COMMA columnValue= set_column_clause
					{
					match(input,COMMA,FOLLOW_COMMA_in_set_columns_clause893); 
					pushFollow(FOLLOW_set_column_clause_in_set_columns_clause911);
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
	// src/main/sqlplus/parser/SQLPlus.g:266:1: set_column_clause returns [Map<String, Expression> columnValueMap] : column_spec EQUAL ( expression | DEFAULT ) ;
	public final Map<String, Expression> set_column_clause() throws RecognitionException {
		Map<String, Expression> columnValueMap = null;


		Token DEFAULT29=null;
		ParserRuleReturnScope column_spec27 =null;
		Expression expression28 =null;


		        columnValueMap = new HashMap<String, Expression>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:270:5: ( column_spec EQUAL ( expression | DEFAULT ) )
			// src/main/sqlplus/parser/SQLPlus.g:270:7: column_spec EQUAL ( expression | DEFAULT )
			{
			pushFollow(FOLLOW_column_spec_in_set_column_clause954);
			column_spec27=column_spec();
			state._fsp--;

			match(input,EQUAL,FOLLOW_EQUAL_in_set_column_clause956); 
			// src/main/sqlplus/parser/SQLPlus.g:270:25: ( expression | DEFAULT )
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
					// src/main/sqlplus/parser/SQLPlus.g:271:13: expression
					{
					pushFollow(FOLLOW_expression_in_set_column_clause972);
					expression28=expression();
					state._fsp--;


					                columnValueMap.put((column_spec27!=null?input.toString(column_spec27.start,column_spec27.stop):null), expression28);
					            
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:275:13: DEFAULT
					{
					DEFAULT29=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_set_column_clause1002); 

					                columnValueMap.put((column_spec27!=null?input.toString(column_spec27.start,column_spec27.stop):null), new ExpressionLiteral((DEFAULT29!=null?DEFAULT29.getText():null)));
					            
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
	// src/main/sqlplus/parser/SQLPlus.g:281:1: where_clause returns [Expression expr] : WHERE expression ;
	public final Expression where_clause() throws RecognitionException {
		Expression expr = null;


		Expression expression30 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:285:5: ( WHERE expression )
			// src/main/sqlplus/parser/SQLPlus.g:285:9: WHERE expression
			{
			match(input,WHERE,FOLLOW_WHERE_in_where_clause1046); 
			pushFollow(FOLLOW_expression_in_where_clause1048);
			expression30=expression();
			state._fsp--;

			 expr = expression30; 
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
	// src/main/sqlplus/parser/SQLPlus.g:288:1: table_atom : table_spec ;
	public final void table_atom() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:289:2: ( table_spec )
			// src/main/sqlplus/parser/SQLPlus.g:289:4: table_spec
			{
			pushFollow(FOLLOW_table_spec_in_table_atom1064);
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
	// src/main/sqlplus/parser/SQLPlus.g:292:1: table_spec : ( schema_name DOT )? table_name ;
	public final SQLPlusParser.table_spec_return table_spec() throws RecognitionException {
		SQLPlusParser.table_spec_return retval = new SQLPlusParser.table_spec_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:293:2: ( ( schema_name DOT )? table_name )
			// src/main/sqlplus/parser/SQLPlus.g:293:4: ( schema_name DOT )? table_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:293:4: ( schema_name DOT )?
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
					// src/main/sqlplus/parser/SQLPlus.g:293:5: schema_name DOT
					{
					pushFollow(FOLLOW_schema_name_in_table_spec1076);
					schema_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_table_spec1078); 
					}
					break;

			}

			pushFollow(FOLLOW_table_name_in_table_spec1082);
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
	// src/main/sqlplus/parser/SQLPlus.g:296:1: column_list returns [List<String> columnList] : LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS ;
	public final List<String> column_list() throws RecognitionException {
		List<String> columnList = null;


		ParserRuleReturnScope column =null;


		        columnList = new ArrayList<String>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:300:2: ( LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:300:6: LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_column_list1108); 
			pushFollow(FOLLOW_column_spec_in_column_list1119);
			column=column_spec();
			state._fsp--;


				        columnList.add((column!=null?input.toString(column.start,column.stop):null));
				    
			// src/main/sqlplus/parser/SQLPlus.g:304:9: ( COMMA column= column_spec )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:305:13: COMMA column= column_spec
					{
					match(input,COMMA,FOLLOW_COMMA_in_column_list1145); 
					pushFollow(FOLLOW_column_spec_in_column_list1163);
					column=column_spec();
					state._fsp--;


					                columnList.add((column!=null?input.toString(column.start,column.stop):null));
					            
					}
					break;

				default :
					break loop18;
				}
			}

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_column_list1178); 
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
	// src/main/sqlplus/parser/SQLPlus.g:312:1: column_spec : ( ( schema_name DOT )? table_name DOT )? column_name ;
	public final SQLPlusParser.column_spec_return column_spec() throws RecognitionException {
		SQLPlusParser.column_spec_return retval = new SQLPlusParser.column_spec_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:313:2: ( ( ( schema_name DOT )? table_name DOT )? column_name )
			// src/main/sqlplus/parser/SQLPlus.g:313:6: ( ( schema_name DOT )? table_name DOT )? column_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:313:6: ( ( schema_name DOT )? table_name DOT )?
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
					// src/main/sqlplus/parser/SQLPlus.g:313:7: ( schema_name DOT )? table_name DOT
					{
					// src/main/sqlplus/parser/SQLPlus.g:313:7: ( schema_name DOT )?
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
							// src/main/sqlplus/parser/SQLPlus.g:313:8: schema_name DOT
							{
							pushFollow(FOLLOW_schema_name_in_column_spec1193);
							schema_name();
							state._fsp--;

							match(input,DOT,FOLLOW_DOT_in_column_spec1195); 
							}
							break;

					}

					pushFollow(FOLLOW_table_name_in_column_spec1199);
					table_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_column_spec1201); 
					}
					break;

			}

			pushFollow(FOLLOW_column_name_in_column_spec1205);
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
	// src/main/sqlplus/parser/SQLPlus.g:316:1: subquery : LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS ;
	public final void subquery() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:317:5: ( LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:317:9: LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_subquery1221); 
			pushFollow(FOLLOW_select_statement_in_subquery1223);
			select_statement();
			state._fsp--;

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_subquery1225); 
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
	// src/main/sqlplus/parser/SQLPlus.g:320:1: expression returns [Expression expr] : left= expr_factor1 ( OR right= expr_factor1 )* ;
	public final Expression expression() throws RecognitionException {
		Expression expr = null;


		Token OR31=null;
		Expression left =null;
		Expression right =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:324:5: (left= expr_factor1 ( OR right= expr_factor1 )* )
			// src/main/sqlplus/parser/SQLPlus.g:324:9: left= expr_factor1 ( OR right= expr_factor1 )*
			{
			pushFollow(FOLLOW_expr_factor1_in_expression1261);
			left=expr_factor1();
			state._fsp--;

			 expr = left; 
			// src/main/sqlplus/parser/SQLPlus.g:325:9: ( OR right= expr_factor1 )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==OR) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:326:13: OR right= expr_factor1
					{
					OR31=(Token)match(input,OR,FOLLOW_OR_in_expression1287); 
					pushFollow(FOLLOW_expr_factor1_in_expression1293);
					right=expr_factor1();
					state._fsp--;


					                expr = new ExpressionBinary((OR31!=null?OR31.getText():null), expr, right);
					            
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
	// src/main/sqlplus/parser/SQLPlus.g:332:1: expr_factor1 returns [Expression expr] : left= expr_factor2 ( XOR right= expr_factor2 )* ;
	public final Expression expr_factor1() throws RecognitionException {
		Expression expr = null;


		Token XOR32=null;
		Expression left =null;
		Expression right =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:336:5: (left= expr_factor2 ( XOR right= expr_factor2 )* )
			// src/main/sqlplus/parser/SQLPlus.g:336:9: left= expr_factor2 ( XOR right= expr_factor2 )*
			{
			pushFollow(FOLLOW_expr_factor2_in_expr_factor11342);
			left=expr_factor2();
			state._fsp--;

			 expr = left; 
			// src/main/sqlplus/parser/SQLPlus.g:337:9: ( XOR right= expr_factor2 )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==XOR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:338:13: XOR right= expr_factor2
					{
					XOR32=(Token)match(input,XOR,FOLLOW_XOR_in_expr_factor11368); 
					pushFollow(FOLLOW_expr_factor2_in_expr_factor11374);
					right=expr_factor2();
					state._fsp--;


					                expr = new ExpressionBinary((XOR32!=null?XOR32.getText():null), expr, right);
					            
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
	// src/main/sqlplus/parser/SQLPlus.g:344:1: expr_factor2 returns [Expression expr] : left= expr_factor3 ( AND right= expr_factor3 )* ;
	public final Expression expr_factor2() throws RecognitionException {
		Expression expr = null;


		Token AND33=null;
		Expression left =null;
		Expression right =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:348:5: (left= expr_factor3 ( AND right= expr_factor3 )* )
			// src/main/sqlplus/parser/SQLPlus.g:348:9: left= expr_factor3 ( AND right= expr_factor3 )*
			{
			pushFollow(FOLLOW_expr_factor3_in_expr_factor21423);
			left=expr_factor3();
			state._fsp--;

			 expr = left; 
			// src/main/sqlplus/parser/SQLPlus.g:349:9: ( AND right= expr_factor3 )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==AND) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:350:13: AND right= expr_factor3
					{
					AND33=(Token)match(input,AND,FOLLOW_AND_in_expr_factor21449); 
					pushFollow(FOLLOW_expr_factor3_in_expr_factor21455);
					right=expr_factor3();
					state._fsp--;


					                expr = new ExpressionBinary((AND33!=null?AND33.getText():null), expr, right);
					            
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
	// src/main/sqlplus/parser/SQLPlus.g:356:1: expr_factor3 returns [Expression expr] : ( NOT )? expr_factor4 ;
	public final Expression expr_factor3() throws RecognitionException {
		Expression expr = null;


		Token NOT34=null;
		Expression expr_factor435 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:360:5: ( ( NOT )? expr_factor4 )
			// src/main/sqlplus/parser/SQLPlus.g:360:9: ( NOT )? expr_factor4
			{
			// src/main/sqlplus/parser/SQLPlus.g:360:9: ( NOT )?
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
					// src/main/sqlplus/parser/SQLPlus.g:360:10: NOT
					{
					NOT34=(Token)match(input,NOT,FOLLOW_NOT_in_expr_factor31501); 
					}
					break;

			}

			pushFollow(FOLLOW_expr_factor4_in_expr_factor31505);
			expr_factor435=expr_factor4();
			state._fsp--;

			 expr = new ExpressionBinary((NOT34!=null?NOT34.getText():null), null, expr_factor435); 
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
	// src/main/sqlplus/parser/SQLPlus.g:363:1: expr_factor4 returns [Expression expr] : bool_primary ( IS ( NOT )? ( boolean_literal | NULL ) )? ;
	public final Expression expr_factor4() throws RecognitionException {
		Expression expr = null;


		Expression bool_primary36 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:367:5: ( bool_primary ( IS ( NOT )? ( boolean_literal | NULL ) )? )
			// src/main/sqlplus/parser/SQLPlus.g:367:9: bool_primary ( IS ( NOT )? ( boolean_literal | NULL ) )?
			{
			pushFollow(FOLLOW_bool_primary_in_expr_factor41539);
			bool_primary36=bool_primary();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:367:22: ( IS ( NOT )? ( boolean_literal | NULL ) )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==IS) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:367:24: IS ( NOT )? ( boolean_literal | NULL )
					{
					match(input,IS,FOLLOW_IS_in_expr_factor41543); 
					// src/main/sqlplus/parser/SQLPlus.g:367:27: ( NOT )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==NOT) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:367:28: NOT
							{
							match(input,NOT,FOLLOW_NOT_in_expr_factor41546); 
							}
							break;

					}

					// src/main/sqlplus/parser/SQLPlus.g:367:34: ( boolean_literal | NULL )
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
							// src/main/sqlplus/parser/SQLPlus.g:367:35: boolean_literal
							{
							pushFollow(FOLLOW_boolean_literal_in_expr_factor41551);
							boolean_literal();
							state._fsp--;

							}
							break;
						case 2 :
							// src/main/sqlplus/parser/SQLPlus.g:367:53: NULL
							{
							match(input,NULL,FOLLOW_NULL_in_expr_factor41555); 
							}
							break;

					}

					}
					break;

			}

			 expr = bool_primary36; 
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
	// src/main/sqlplus/parser/SQLPlus.g:370:1: bool_primary returns [Expression expr] : (left= predicate relational_op right= predicate | predicate relational_op ( ALL | ANY )? subquery | NOT EXISTS subquery | predicate );
	public final Expression bool_primary() throws RecognitionException {
		Expression expr = null;


		Expression left =null;
		Expression right =null;
		ParserRuleReturnScope relational_op37 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:374:5: (left= predicate relational_op right= predicate | predicate relational_op ( ALL | ANY )? subquery | NOT EXISTS subquery | predicate )
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
					// src/main/sqlplus/parser/SQLPlus.g:374:9: left= predicate relational_op right= predicate
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1597);
					left=predicate();
					state._fsp--;

					pushFollow(FOLLOW_relational_op_in_bool_primary1607);
					relational_op37=relational_op();
					state._fsp--;

					pushFollow(FOLLOW_predicate_in_bool_primary1621);
					right=predicate();
					state._fsp--;


					            expr = new ExpressionBinary((relational_op37!=null?input.toString(relational_op37.start,relational_op37.stop):null), left, right);
					        
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:379:9: predicate relational_op ( ALL | ANY )? subquery
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1633);
					predicate();
					state._fsp--;

					pushFollow(FOLLOW_relational_op_in_bool_primary1635);
					relational_op();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:379:33: ( ALL | ANY )?
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

					pushFollow(FOLLOW_subquery_in_bool_primary1648);
					subquery();
					state._fsp--;

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:380:9: NOT EXISTS subquery
					{
					match(input,NOT,FOLLOW_NOT_in_bool_primary1658); 
					match(input,EXISTS,FOLLOW_EXISTS_in_bool_primary1660); 
					pushFollow(FOLLOW_subquery_in_bool_primary1662);
					subquery();
					state._fsp--;

					}
					break;
				case 4 :
					// src/main/sqlplus/parser/SQLPlus.g:381:9: predicate
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1672);
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
	// src/main/sqlplus/parser/SQLPlus.g:384:1: predicate returns [Expression expr] : bit_expr ;
	public final Expression predicate() throws RecognitionException {
		Expression expr = null;


		ParserRuleReturnScope bit_expr38 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:388:5: ( bit_expr )
			// src/main/sqlplus/parser/SQLPlus.g:388:9: bit_expr
			{
			pushFollow(FOLLOW_bit_expr_in_predicate1704);
			bit_expr38=bit_expr();
			state._fsp--;

			 expr = new ExpressionLiteral((bit_expr38!=null?input.toString(bit_expr38.start,bit_expr38.stop):null)); 
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
	// src/main/sqlplus/parser/SQLPlus.g:391:1: bit_expr : simple_expr ;
	public final SQLPlusParser.bit_expr_return bit_expr() throws RecognitionException {
		SQLPlusParser.bit_expr_return retval = new SQLPlusParser.bit_expr_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:392:5: ( simple_expr )
			// src/main/sqlplus/parser/SQLPlus.g:392:9: simple_expr
			{
			pushFollow(FOLLOW_simple_expr_in_bit_expr1725);
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
	// src/main/sqlplus/parser/SQLPlus.g:395:1: simple_expr : ( literal_value | column_spec );
	public final void simple_expr() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:396:5: ( literal_value | column_spec )
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
					// src/main/sqlplus/parser/SQLPlus.g:396:9: literal_value
					{
					pushFollow(FOLLOW_literal_value_in_simple_expr1744);
					literal_value();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:397:9: column_spec
					{
					pushFollow(FOLLOW_column_spec_in_simple_expr1754);
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
	// src/main/sqlplus/parser/SQLPlus.g:400:1: literal_value : ( string_literal | number_literal );
	public final void literal_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:401:5: ( string_literal | number_literal )
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
					// src/main/sqlplus/parser/SQLPlus.g:401:9: string_literal
					{
					pushFollow(FOLLOW_string_literal_in_literal_value1773);
					string_literal();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:402:9: number_literal
					{
					pushFollow(FOLLOW_number_literal_in_literal_value1783);
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
	// src/main/sqlplus/parser/SQLPlus.g:405:1: relational_op : ( EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LESS_THAN | LESS_THAN_EQUAL | NOT_EQUAL );
	public final SQLPlusParser.relational_op_return relational_op() throws RecognitionException {
		SQLPlusParser.relational_op_return retval = new SQLPlusParser.relational_op_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:406:5: ( EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LESS_THAN | LESS_THAN_EQUAL | NOT_EQUAL )
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
	// src/main/sqlplus/parser/SQLPlus.g:414:1: string_literal : TEXT_STRING ;
	public final void string_literal() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:414:17: ( TEXT_STRING )
			// src/main/sqlplus/parser/SQLPlus.g:414:21: TEXT_STRING
			{
			match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_string_literal1868); 
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
	// src/main/sqlplus/parser/SQLPlus.g:415:1: number_literal : ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER ) ;
	public final void number_literal() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:415:17: ( ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER ) )
			// src/main/sqlplus/parser/SQLPlus.g:415:19: ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER )
			{
			// src/main/sqlplus/parser/SQLPlus.g:415:19: ( PLUS | MINUS )?
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
	// src/main/sqlplus/parser/SQLPlus.g:416:1: boolean_literal : ( TRUE | FALSE );
	public final void boolean_literal() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:416:17: ( TRUE | FALSE )
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


	public static class timing_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "timing"
	// src/main/sqlplus/parser/SQLPlus.g:419:1: timing : ( BEFORE | AFTER );
	public final SQLPlusParser.timing_return timing() throws RecognitionException {
		SQLPlusParser.timing_return retval = new SQLPlusParser.timing_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:420:2: ( BEFORE | AFTER )
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
	// $ANTLR end "timing"


	public static class data_manipulation_language_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "data_manipulation_language"
	// src/main/sqlplus/parser/SQLPlus.g:424:1: data_manipulation_language : ( INSERT | DELETE | UPDATE );
	public final SQLPlusParser.data_manipulation_language_return data_manipulation_language() throws RecognitionException {
		SQLPlusParser.data_manipulation_language_return retval = new SQLPlusParser.data_manipulation_language_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:425:2: ( INSERT | DELETE | UPDATE )
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
	// $ANTLR end "data_manipulation_language"



	// $ANTLR start "relational_operation"
	// src/main/sqlplus/parser/SQLPlus.g:430:1: relational_operation : ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE );
	public final void relational_operation() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:431:2: ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE )
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
	// src/main/sqlplus/parser/SQLPlus.g:440:1: match_value : ( ID | QUESTION_MARK );
	public final void match_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:441:2: ( ID | QUESTION_MARK )
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
	// src/main/sqlplus/parser/SQLPlus.g:445:1: alias : ( AS )? ID ;
	public final void alias() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:445:7: ( ( AS )? ID )
			// src/main/sqlplus/parser/SQLPlus.g:445:9: ( AS )? ID
			{
			// src/main/sqlplus/parser/SQLPlus.g:445:9: ( AS )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==AS) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:445:10: AS
					{
					match(input,AS,FOLLOW_AS_in_alias2007); 
					}
					break;

			}

			match(input,ID,FOLLOW_ID_in_alias2011); 
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
	// src/main/sqlplus/parser/SQLPlus.g:446:1: column_name : ID ;
	public final void column_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:446:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:446:15: ID
			{
			match(input,ID,FOLLOW_ID_in_column_name2018); 
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
	// src/main/sqlplus/parser/SQLPlus.g:447:1: partition_name : ID ;
	public final void partition_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:447:16: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:447:18: ID
			{
			match(input,ID,FOLLOW_ID_in_partition_name2025); 
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
	// src/main/sqlplus/parser/SQLPlus.g:448:1: schema_name : ID ;
	public final SQLPlusParser.schema_name_return schema_name() throws RecognitionException {
		SQLPlusParser.schema_name_return retval = new SQLPlusParser.schema_name_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:448:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:448:15: ID
			{
			match(input,ID,FOLLOW_ID_in_schema_name2032); 
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
	// src/main/sqlplus/parser/SQLPlus.g:449:1: table_name : ID ;
	public final void table_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:449:12: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:449:14: ID
			{
			match(input,ID,FOLLOW_ID_in_table_name2039); 
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
	public static final BitSet FOLLOW_sqlplus_alert_in_sqlplus56 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALERT_in_sqlplus_alert95 = new BitSet(new long[]{0x0000000000000810L});
	public static final BitSet FOLLOW_timing_in_sqlplus_alert97 = new BitSet(new long[]{0x0040000008010000L});
	public static final BitSet FOLLOW_data_manipulation_language_in_sqlplus_alert99 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IN_in_sqlplus_alert101 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_table_reference_in_sqlplus_alert103 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_where_clause_in_sqlplus_alert105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_data_manipulation_statements_in_sql_statement135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_statement_in_sql_statement142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_database_in_use_statement165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_use_database188 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_schema_name_in_use_database196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_statement_in_data_manipulation_statements221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_statements_in_data_manipulation_statements233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_update_statements_in_data_manipulation_statements245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_expression_in_select_statement271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_statement1_in_insert_statements302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_table_update_statement_in_update_statements328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select_expression353 = new BitSet(new long[]{0x0000000001000400L});
	public static final BitSet FOLLOW_select_list_in_select_expression355 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_FROM_in_select_expression357 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_table_references_in_select_expression360 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_where_clause_in_select_expression363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_header_in_insert_statement1393 = new BitSet(new long[]{0x0100000080000000L});
	public static final BitSet FOLLOW_column_list_in_insert_statement1401 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_value_list_clause_in_insert_statement1405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UPDATE_in_single_table_update_statement428 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_table_reference_in_single_table_update_statement430 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_set_columns_clause_in_single_table_update_statement432 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_where_clause_in_single_table_update_statement435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_displayed_column_in_select_list464 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_select_list475 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_displayed_column_in_select_list481 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ASTERISK_in_select_list494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_displayed_column507 = new BitSet(new long[]{0x0000000001000202L});
	public static final BitSet FOLLOW_alias_in_displayed_column510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_references537 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_table_references548 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_table_reference_in_table_references557 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_table_atom_in_table_reference575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insert_header604 = new BitSet(new long[]{0x0000000021000000L});
	public static final BitSet FOLLOW_INTO_in_insert_header607 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_table_spec_in_insert_header611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALUES_in_value_list_clause645 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_column_value_list_in_value_list_clause659 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_value_list_clause685 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_column_value_list_in_value_list_clause703 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_column_value_list748 = new BitSet(new long[]{0x0008120811000000L});
	public static final BitSet FOLLOW_bit_expr_in_column_value_list762 = new BitSet(new long[]{0x0000200000002000L});
	public static final BitSet FOLLOW_COMMA_in_column_value_list788 = new BitSet(new long[]{0x0008120811000000L});
	public static final BitSet FOLLOW_bit_expr_in_column_value_list806 = new BitSet(new long[]{0x0000200000002000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_column_value_list821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_columns_clause853 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_set_column_clause_in_set_columns_clause867 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_set_columns_clause893 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_set_column_clause_in_set_columns_clause911 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_column_spec_in_set_column_clause954 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQUAL_in_set_column_clause956 = new BitSet(new long[]{0x0008122811008000L});
	public static final BitSet FOLLOW_expression_in_set_column_clause972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_set_column_clause1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_where_clause1046 = new BitSet(new long[]{0x0008122811000000L});
	public static final BitSet FOLLOW_expression_in_where_clause1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_spec_in_table_atom1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_table_spec1076 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DOT_in_table_spec1078 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_table_name_in_table_spec1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_column_list1108 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_column_spec_in_column_list1119 = new BitSet(new long[]{0x0000200000002000L});
	public static final BitSet FOLLOW_COMMA_in_column_list1145 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_column_spec_in_column_list1163 = new BitSet(new long[]{0x0000200000002000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_column_list1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_column_spec1193 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DOT_in_column_spec1195 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_table_name_in_column_spec1199 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DOT_in_column_spec1201 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_column_name_in_column_spec1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_subquery1221 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_select_statement_in_subquery1223 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_subquery1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_factor1_in_expression1261 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_OR_in_expression1287 = new BitSet(new long[]{0x0008122811000000L});
	public static final BitSet FOLLOW_expr_factor1_in_expression1293 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_expr_factor2_in_expr_factor11342 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_XOR_in_expr_factor11368 = new BitSet(new long[]{0x0008122811000000L});
	public static final BitSet FOLLOW_expr_factor2_in_expr_factor11374 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_expr_factor3_in_expr_factor21423 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_AND_in_expr_factor21449 = new BitSet(new long[]{0x0008122811000000L});
	public static final BitSet FOLLOW_expr_factor3_in_expr_factor21455 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_NOT_in_expr_factor31501 = new BitSet(new long[]{0x0008122811000000L});
	public static final BitSet FOLLOW_expr_factor4_in_expr_factor31505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_primary_in_expr_factor41539 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_IS_in_expr_factor41543 = new BitSet(new long[]{0x001000A000100000L});
	public static final BitSet FOLLOW_NOT_in_expr_factor41546 = new BitSet(new long[]{0x0010008000100000L});
	public static final BitSet FOLLOW_boolean_literal_in_expr_factor41551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_expr_factor41555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1597 = new BitSet(new long[]{0x0000004300C40000L});
	public static final BitSet FOLLOW_relational_op_in_bool_primary1607 = new BitSet(new long[]{0x0008120811000000L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1633 = new BitSet(new long[]{0x0000004300C40000L});
	public static final BitSet FOLLOW_relational_op_in_bool_primary1635 = new BitSet(new long[]{0x0000000080000140L});
	public static final BitSet FOLLOW_subquery_in_bool_primary1648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_bool_primary1658 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EXISTS_in_bool_primary1660 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_subquery_in_bool_primary1662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bit_expr_in_predicate1704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_expr_in_bit_expr1725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_value_in_simple_expr1744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_simple_expr1754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_literal_value1773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_literal_in_literal_value1783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_STRING_in_string_literal1868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_number_literal1885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_alias2007 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_ID_in_alias2011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name2018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partition_name2025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_schema_name2032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name2039 = new BitSet(new long[]{0x0000000000000002L});
}
