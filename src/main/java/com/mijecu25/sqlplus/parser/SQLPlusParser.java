// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlus.g 2016-07-19 19:16:35

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
	import com.mijecu25.sqlplus.compiler.alert.AlertManager;
	import com.mijecu25.sqlplus.compiler.alert.AlertDefault;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SQLPlusParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFTER", "ALERT", "ALERTS", "ALL", 
		"AND", "ANY", "AS", "ASTERISK", "BEFORE", "COLON", "COMMA", "DATABASES", 
		"DEFAULT", "DELETE", "DOT", "EQUAL", "EXISTS", "FALSE", "FROM", "GREATER_THAN", 
		"GREATER_THAN_EQUAL", "ID", "IF", "IN", "INSERT", "INTEGER_NUMBER", "INTO", 
		"IS", "LEFT_PARENTHESIS", "LESS_THAN", "LESS_THAN_EQUAL", "LIKE", "LIST", 
		"MINUS", "NEWLINE", "NOT", "NOT_EQUAL", "NULL", "OR", "PLUS", "QUESTION_MARK", 
		"QUOTE", "REAL_NUMBER", "RIGHT_PARENTHESIS", "SELECT", "SEMICOLON", "SET", 
		"SHOW", "TABLES", "TEXT_STRING", "TRUE", "UNDERSCORE", "UPDATE", "USE", 
		"VALUES", "WHERE", "WS", "XOR"
	};
	public static final int EOF=-1;
	public static final int AFTER=4;
	public static final int ALERT=5;
	public static final int ALERTS=6;
	public static final int ALL=7;
	public static final int AND=8;
	public static final int ANY=9;
	public static final int AS=10;
	public static final int ASTERISK=11;
	public static final int BEFORE=12;
	public static final int COLON=13;
	public static final int COMMA=14;
	public static final int DATABASES=15;
	public static final int DEFAULT=16;
	public static final int DELETE=17;
	public static final int DOT=18;
	public static final int EQUAL=19;
	public static final int EXISTS=20;
	public static final int FALSE=21;
	public static final int FROM=22;
	public static final int GREATER_THAN=23;
	public static final int GREATER_THAN_EQUAL=24;
	public static final int ID=25;
	public static final int IF=26;
	public static final int IN=27;
	public static final int INSERT=28;
	public static final int INTEGER_NUMBER=29;
	public static final int INTO=30;
	public static final int IS=31;
	public static final int LEFT_PARENTHESIS=32;
	public static final int LESS_THAN=33;
	public static final int LESS_THAN_EQUAL=34;
	public static final int LIKE=35;
	public static final int LIST=36;
	public static final int MINUS=37;
	public static final int NEWLINE=38;
	public static final int NOT=39;
	public static final int NOT_EQUAL=40;
	public static final int NULL=41;
	public static final int OR=42;
	public static final int PLUS=43;
	public static final int QUESTION_MARK=44;
	public static final int QUOTE=45;
	public static final int REAL_NUMBER=46;
	public static final int RIGHT_PARENTHESIS=47;
	public static final int SELECT=48;
	public static final int SEMICOLON=49;
	public static final int SET=50;
	public static final int SHOW=51;
	public static final int TABLES=52;
	public static final int TEXT_STRING=53;
	public static final int TRUE=54;
	public static final int UNDERSCORE=55;
	public static final int UPDATE=56;
	public static final int USE=57;
	public static final int VALUES=58;
	public static final int WHERE=59;
	public static final int WS=60;
	public static final int XOR=61;

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
	// src/main/sqlplus/parser/SQLPlus.g:46:1: sqlplus returns [Statement statement] : ( sql_statement SEMICOLON | sqlplus_statement SEMICOLON );
	public final Statement sqlplus() throws RecognitionException {
		Statement statement = null;


		Statement sql_statement1 =null;
		Statement sqlplus_statement2 =null;


				statement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:50:2: ( sql_statement SEMICOLON | sqlplus_statement SEMICOLON )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INSERT||LA1_0==SELECT||(LA1_0 >= UPDATE && LA1_0 <= USE)) ) {
				alt1=1;
			}
			else if ( (LA1_0==ALERT||LA1_0==LIST) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:50:5: sql_statement SEMICOLON
					{
					pushFollow(FOLLOW_sql_statement_in_sqlplus47);
					sql_statement1=sql_statement();
					state._fsp--;

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sqlplus49); 

								statement = sql_statement1;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:53:4: sqlplus_statement SEMICOLON
					{
					pushFollow(FOLLOW_sqlplus_statement_in_sqlplus56);
					sqlplus_statement2=sqlplus_statement();
					state._fsp--;

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sqlplus58); 

						        statement = sqlplus_statement2;
					        
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



	// $ANTLR start "sqlplus_statement"
	// src/main/sqlplus/parser/SQLPlus.g:58:1: sqlplus_statement returns [Statement sqlplusStatement] : ( sqlplus_alert | LIST ALERTS );
	public final Statement sqlplus_statement() throws RecognitionException {
		Statement sqlplusStatement = null;


		Statement sqlplus_alert3 =null;


		        sqlplusStatement = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:62:5: ( sqlplus_alert | LIST ALERTS )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ALERT) ) {
				alt2=1;
			}
			else if ( (LA2_0==LIST) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:62:9: sqlplus_alert
					{
					pushFollow(FOLLOW_sqlplus_alert_in_sqlplus_statement89);
					sqlplus_alert3=sqlplus_alert();
					state._fsp--;


					            sqlplusStatement = sqlplus_alert3;
					        
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:65:9: LIST ALERTS
					{
					match(input,LIST,FOLLOW_LIST_in_sqlplus_statement101); 
					match(input,ALERTS,FOLLOW_ALERTS_in_sqlplus_statement103); 

					            AlertManager.getManager().listAll();
					            sqlplusStatement = new AlertDefault();
					        
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
		return sqlplusStatement;
	}
	// $ANTLR end "sqlplus_statement"



	// $ANTLR start "sqlplus_alert"
	// src/main/sqlplus/parser/SQLPlus.g:71:1: sqlplus_alert returns [Statement alert] : ALERT timing data_manipulation_language IN table_reference where_clause ;
	public final Statement sqlplus_alert() throws RecognitionException {
		Statement alert = null;


		ParserRuleReturnScope timing4 =null;
		ParserRuleReturnScope data_manipulation_language5 =null;
		ParserRuleReturnScope table_reference6 =null;
		Expression where_clause7 =null;


		        alert = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:76:5: ( ALERT timing data_manipulation_language IN table_reference where_clause )
			// src/main/sqlplus/parser/SQLPlus.g:76:9: ALERT timing data_manipulation_language IN table_reference where_clause
			{
			match(input,ALERT,FOLLOW_ALERT_in_sqlplus_alert142); 
			pushFollow(FOLLOW_timing_in_sqlplus_alert144);
			timing4=timing();
			state._fsp--;

			pushFollow(FOLLOW_data_manipulation_language_in_sqlplus_alert146);
			data_manipulation_language5=data_manipulation_language();
			state._fsp--;

			match(input,IN,FOLLOW_IN_in_sqlplus_alert148); 
			pushFollow(FOLLOW_table_reference_in_sqlplus_alert150);
			table_reference6=table_reference();
			state._fsp--;

			pushFollow(FOLLOW_where_clause_in_sqlplus_alert152);
			where_clause7=where_clause();
			state._fsp--;


			            alert = new Alert((timing4!=null?input.toString(timing4.start,timing4.stop):null), (data_manipulation_language5!=null?input.toString(data_manipulation_language5.start,data_manipulation_language5.stop):null), (table_reference6!=null?input.toString(table_reference6.start,table_reference6.stop):null), where_clause7);
			        
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
	// src/main/sqlplus/parser/SQLPlus.g:81:1: sql_statement returns [Statement sqlStatement] : ( data_manipulation_statements | use_statement );
	public final Statement sql_statement() throws RecognitionException {
		Statement sqlStatement = null;


		Statement data_manipulation_statements8 =null;
		Statement use_statement9 =null;


				sqlStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:85:2: ( data_manipulation_statements | use_statement )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==INSERT||LA3_0==SELECT||LA3_0==UPDATE) ) {
				alt3=1;
			}
			else if ( (LA3_0==USE) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:85:6: data_manipulation_statements
					{
					pushFollow(FOLLOW_data_manipulation_statements_in_sql_statement182);
					data_manipulation_statements8=data_manipulation_statements();
					state._fsp--;


						        sqlStatement = data_manipulation_statements8;
						    
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:88:4: use_statement
					{
					pushFollow(FOLLOW_use_statement_in_sql_statement189);
					use_statement9=use_statement();
					state._fsp--;


								sqlStatement = use_statement9;
							
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
	// src/main/sqlplus/parser/SQLPlus.g:93:1: use_statement returns [Statement useStatement] : use_database ;
	public final Statement use_statement() throws RecognitionException {
		Statement useStatement = null;


		Statement use_database10 =null;


				useStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:97:2: ( use_database )
			// src/main/sqlplus/parser/SQLPlus.g:97:4: use_database
			{
			pushFollow(FOLLOW_use_database_in_use_statement212);
			use_database10=use_database();
			state._fsp--;


						useStatement = use_database10;
					
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
	// src/main/sqlplus/parser/SQLPlus.g:102:1: use_database returns [Statement useDatabaseStatement] : USE database= schema_name ;
	public final Statement use_database() throws RecognitionException {
		Statement useDatabaseStatement = null;


		ParserRuleReturnScope database =null;


				useDatabaseStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:106:2: ( USE database= schema_name )
			// src/main/sqlplus/parser/SQLPlus.g:106:4: USE database= schema_name
			{
			match(input,USE,FOLLOW_USE_in_use_database235); 
			pushFollow(FOLLOW_schema_name_in_use_database243);
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
	// src/main/sqlplus/parser/SQLPlus.g:112:1: data_manipulation_statements returns [Statement dataManipulationStatement] : ( select_statement | insert_statements | update_statements );
	public final Statement data_manipulation_statements() throws RecognitionException {
		Statement dataManipulationStatement = null;


		Statement select_statement11 =null;
		Statement insert_statements12 =null;
		Statement update_statements13 =null;


			    dataManipulationStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:116:2: ( select_statement | insert_statements | update_statements )
			int alt4=3;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				alt4=1;
				}
				break;
			case INSERT:
				{
				alt4=2;
				}
				break;
			case UPDATE:
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
					// src/main/sqlplus/parser/SQLPlus.g:116:6: select_statement
					{
					pushFollow(FOLLOW_select_statement_in_data_manipulation_statements268);
					select_statement11=select_statement();
					state._fsp--;


					            dataManipulationStatement = select_statement11;
					        
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:119:9: insert_statements
					{
					pushFollow(FOLLOW_insert_statements_in_data_manipulation_statements280);
					insert_statements12=insert_statements();
					state._fsp--;


					            dataManipulationStatement = insert_statements12;
					        
					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:122:9: update_statements
					{
					pushFollow(FOLLOW_update_statements_in_data_manipulation_statements292);
					update_statements13=update_statements();
					state._fsp--;


					            dataManipulationStatement = update_statements13;
					    
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
	// src/main/sqlplus/parser/SQLPlus.g:127:1: select_statement returns [Statement selectStatement] : select_expression ;
	public final Statement select_statement() throws RecognitionException {
		Statement selectStatement = null;


		Statement select_expression14 =null;


				selectStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:131:2: ( select_expression )
			// src/main/sqlplus/parser/SQLPlus.g:131:4: select_expression
			{
			pushFollow(FOLLOW_select_expression_in_select_statement318);
			select_expression14=select_expression();
			state._fsp--;


						selectStatement = select_expression14;
					
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
	// src/main/sqlplus/parser/SQLPlus.g:136:1: insert_statements returns [Statement insertStatements] : insert_statement1 ;
	public final Statement insert_statements() throws RecognitionException {
		Statement insertStatements = null;


		Statement insert_statement115 =null;


		        insertStatements = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:140:5: ( insert_statement1 )
			// src/main/sqlplus/parser/SQLPlus.g:140:9: insert_statement1
			{
			pushFollow(FOLLOW_insert_statement1_in_insert_statements349);
			insert_statement115=insert_statement1();
			state._fsp--;


			            insertStatements = insert_statement115;
			        
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
	// src/main/sqlplus/parser/SQLPlus.g:145:1: update_statements returns [Statement updateStatements] : single_table_update_statement ;
	public final Statement update_statements() throws RecognitionException {
		Statement updateStatements = null;


		Statement single_table_update_statement16 =null;


				updateStatements = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:149:2: ( single_table_update_statement )
			// src/main/sqlplus/parser/SQLPlus.g:149:4: single_table_update_statement
			{
			pushFollow(FOLLOW_single_table_update_statement_in_update_statements375);
			single_table_update_statement16=single_table_update_statement();
			state._fsp--;


						updateStatements = single_table_update_statement16;
					
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
	// src/main/sqlplus/parser/SQLPlus.g:154:1: select_expression returns [Statement selectExpression] : SELECT select_list FROM ( table_references ( where_clause )? )? ;
	public final Statement select_expression() throws RecognitionException {
		Statement selectExpression = null;


		List<String> select_list17 =null;
		List<String> table_references18 =null;
		Expression where_clause19 =null;


				selectExpression = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:158:2: ( SELECT select_list FROM ( table_references ( where_clause )? )? )
			// src/main/sqlplus/parser/SQLPlus.g:158:4: SELECT select_list FROM ( table_references ( where_clause )? )?
			{
			match(input,SELECT,FOLLOW_SELECT_in_select_expression398); 
			pushFollow(FOLLOW_select_list_in_select_expression400);
			select_list17=select_list();
			state._fsp--;

			match(input,FROM,FOLLOW_FROM_in_select_expression402); 
			// src/main/sqlplus/parser/SQLPlus.g:158:28: ( table_references ( where_clause )? )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:158:29: table_references ( where_clause )?
					{
					pushFollow(FOLLOW_table_references_in_select_expression405);
					table_references18=table_references();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:158:46: ( where_clause )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==WHERE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:158:47: where_clause
							{
							pushFollow(FOLLOW_where_clause_in_select_expression408);
							where_clause19=where_clause();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}


						selectExpression = new StatementSelectExpression(select_list17, table_references18, where_clause19);
					
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
	// src/main/sqlplus/parser/SQLPlus.g:163:1: insert_statement1 returns [Statement insertStatement1] : insert_header ( column_list )? value_list_clause ;
	public final Statement insert_statement1() throws RecognitionException {
		Statement insertStatement1 = null;


		String insert_header20 =null;
		List<String> column_list21 =null;
		List<List<String>> value_list_clause22 =null;


			    insertStatement1 = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:167:2: ( insert_header ( column_list )? value_list_clause )
			// src/main/sqlplus/parser/SQLPlus.g:167:6: insert_header ( column_list )? value_list_clause
			{
			pushFollow(FOLLOW_insert_header_in_insert_statement1438);
			insert_header20=insert_header();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:168:6: ( column_list )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LEFT_PARENTHESIS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:168:7: column_list
					{
					pushFollow(FOLLOW_column_list_in_insert_statement1446);
					column_list21=column_list();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_value_list_clause_in_insert_statement1450);
			value_list_clause22=value_list_clause();
			state._fsp--;


				        insertStatement1 = new StatementInsertStatement1(insert_header20, column_list21, value_list_clause22);
				    
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
	// src/main/sqlplus/parser/SQLPlus.g:173:1: single_table_update_statement returns [Statement singleTableUpdateStatement] : UPDATE table_reference set_columns_clause ( where_clause )? ;
	public final Statement single_table_update_statement() throws RecognitionException {
		Statement singleTableUpdateStatement = null;


		ParserRuleReturnScope table_reference23 =null;
		Map<String, Expression> set_columns_clause24 =null;
		Expression where_clause25 =null;


				singleTableUpdateStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:177:2: ( UPDATE table_reference set_columns_clause ( where_clause )? )
			// src/main/sqlplus/parser/SQLPlus.g:177:4: UPDATE table_reference set_columns_clause ( where_clause )?
			{
			match(input,UPDATE,FOLLOW_UPDATE_in_single_table_update_statement473); 
			pushFollow(FOLLOW_table_reference_in_single_table_update_statement475);
			table_reference23=table_reference();
			state._fsp--;

			pushFollow(FOLLOW_set_columns_clause_in_single_table_update_statement477);
			set_columns_clause24=set_columns_clause();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:177:46: ( where_clause )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==WHERE) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:177:47: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_single_table_update_statement480);
					where_clause25=where_clause();
					state._fsp--;

					}
					break;

			}


						singleTableUpdateStatement = new StatementSingleTableUpdateStatement((table_reference23!=null?input.toString(table_reference23.start,table_reference23.stop):null), set_columns_clause24, where_clause25);
					
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
	// src/main/sqlplus/parser/SQLPlus.g:182:1: select_list returns [List<String> selectList] : (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK );
	public final List<String> select_list() throws RecognitionException {
		List<String> selectList = null;


		Token ASTERISK26=null;
		ParserRuleReturnScope column =null;


				selectList = new ArrayList<String>();
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:186:2: (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				alt10=1;
			}
			else if ( (LA10_0==ASTERISK) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:186:4: column= displayed_column ( COMMA column= displayed_column )*
					{
					pushFollow(FOLLOW_displayed_column_in_select_list509);
					column=displayed_column();
					state._fsp--;


						 		selectList.add((column!=null?input.toString(column.start,column.stop):null));
							
					// src/main/sqlplus/parser/SQLPlus.g:189:3: ( COMMA column= displayed_column )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:190:4: COMMA column= displayed_column
							{
							match(input,COMMA,FOLLOW_COMMA_in_select_list520); 
							pushFollow(FOLLOW_displayed_column_in_select_list526);
							column=displayed_column();
							state._fsp--;


											selectList.add((column!=null?input.toString(column.start,column.stop):null));
										
							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:194:5: ASTERISK
					{
					ASTERISK26=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_select_list539); 

								selectList.add((ASTERISK26!=null?ASTERISK26.getText():null));
							
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
	// src/main/sqlplus/parser/SQLPlus.g:199:1: displayed_column : column_spec ( alias )? ;
	public final SQLPlusParser.displayed_column_return displayed_column() throws RecognitionException {
		SQLPlusParser.displayed_column_return retval = new SQLPlusParser.displayed_column_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:200:2: ( column_spec ( alias )? )
			// src/main/sqlplus/parser/SQLPlus.g:200:4: column_spec ( alias )?
			{
			pushFollow(FOLLOW_column_spec_in_displayed_column552);
			column_spec();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:200:16: ( alias )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==AS||LA11_0==ID) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:200:17: alias
					{
					pushFollow(FOLLOW_alias_in_displayed_column555);
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
	// src/main/sqlplus/parser/SQLPlus.g:203:1: table_references returns [List<String> tableReferences] : table= table_reference ( COMMA table= table_reference )* ;
	public final List<String> table_references() throws RecognitionException {
		List<String> tableReferences = null;


		ParserRuleReturnScope table =null;


				tableReferences = new ArrayList<String>();
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:207:2: (table= table_reference ( COMMA table= table_reference )* )
			// src/main/sqlplus/parser/SQLPlus.g:207:4: table= table_reference ( COMMA table= table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_references582);
			table=table_reference();
			state._fsp--;


						tableReferences.add((table!=null?input.toString(table.start,table.stop):null));
					
			// src/main/sqlplus/parser/SQLPlus.g:210:3: ( COMMA table= table_reference )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==COMMA) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:211:4: COMMA table= table_reference
					{
					match(input,COMMA,FOLLOW_COMMA_in_table_references593); 
					pushFollow(FOLLOW_table_reference_in_table_references602);
					table=table_reference();
					state._fsp--;


									tableReferences.add((table!=null?input.toString(table.start,table.stop):null));
								
					}
					break;

				default :
					break loop12;
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
	// src/main/sqlplus/parser/SQLPlus.g:218:1: table_reference : table_atom ;
	public final SQLPlusParser.table_reference_return table_reference() throws RecognitionException {
		SQLPlusParser.table_reference_return retval = new SQLPlusParser.table_reference_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:219:2: ( table_atom )
			// src/main/sqlplus/parser/SQLPlus.g:219:4: table_atom
			{
			pushFollow(FOLLOW_table_atom_in_table_reference620);
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
	// src/main/sqlplus/parser/SQLPlus.g:222:1: insert_header returns [String table] : INSERT ( INTO )? table_spec ;
	public final String insert_header() throws RecognitionException {
		String table = null;


		ParserRuleReturnScope table_spec27 =null;


		        table = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:226:5: ( INSERT ( INTO )? table_spec )
			// src/main/sqlplus/parser/SQLPlus.g:226:9: INSERT ( INTO )? table_spec
			{
			match(input,INSERT,FOLLOW_INSERT_in_insert_header649); 
			// src/main/sqlplus/parser/SQLPlus.g:226:16: ( INTO )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==INTO) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:226:17: INTO
					{
					match(input,INTO,FOLLOW_INTO_in_insert_header652); 
					}
					break;

			}

			pushFollow(FOLLOW_table_spec_in_insert_header656);
			table_spec27=table_spec();
			state._fsp--;


			            table = (table_spec27!=null?input.toString(table_spec27.start,table_spec27.stop):null);
			        
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
	// src/main/sqlplus/parser/SQLPlus.g:231:1: value_list_clause returns [List<List<String>> valueListClause] : VALUES value= column_value_list ( COMMA value= column_value_list )* ;
	public final List<List<String>> value_list_clause() throws RecognitionException {
		List<List<String>> valueListClause = null;


		List<String> value =null;


		        valueListClause = new ArrayList<List<String>>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:235:5: ( VALUES value= column_value_list ( COMMA value= column_value_list )* )
			// src/main/sqlplus/parser/SQLPlus.g:235:9: VALUES value= column_value_list ( COMMA value= column_value_list )*
			{
			match(input,VALUES,FOLLOW_VALUES_in_value_list_clause690); 
			pushFollow(FOLLOW_column_value_list_in_value_list_clause704);
			value=column_value_list();
			state._fsp--;


			            valueListClause.add(value);
			        
			// src/main/sqlplus/parser/SQLPlus.g:239:9: ( COMMA value= column_value_list )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:240:13: COMMA value= column_value_list
					{
					match(input,COMMA,FOLLOW_COMMA_in_value_list_clause730); 
					pushFollow(FOLLOW_column_value_list_in_value_list_clause748);
					value=column_value_list();
					state._fsp--;


					                valueListClause.add(value);
					            
					}
					break;

				default :
					break loop14;
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
	// src/main/sqlplus/parser/SQLPlus.g:247:1: column_value_list returns [List<String> columnValueList] : LEFT_PARENTHESIS expr= bit_expr ( COMMA expr= bit_expr )* RIGHT_PARENTHESIS ;
	public final List<String> column_value_list() throws RecognitionException {
		List<String> columnValueList = null;


		ParserRuleReturnScope expr =null;


		        columnValueList = new ArrayList<String>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:251:5: ( LEFT_PARENTHESIS expr= bit_expr ( COMMA expr= bit_expr )* RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:251:9: LEFT_PARENTHESIS expr= bit_expr ( COMMA expr= bit_expr )* RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_column_value_list793); 
			pushFollow(FOLLOW_bit_expr_in_column_value_list807);
			expr=bit_expr();
			state._fsp--;


			            columnValueList.add((expr!=null?input.toString(expr.start,expr.stop):null));
			        
			// src/main/sqlplus/parser/SQLPlus.g:255:9: ( COMMA expr= bit_expr )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==COMMA) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:256:13: COMMA expr= bit_expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_column_value_list833); 
					pushFollow(FOLLOW_bit_expr_in_column_value_list851);
					expr=bit_expr();
					state._fsp--;


					                columnValueList.add((expr!=null?input.toString(expr.start,expr.stop):null));
					            
					}
					break;

				default :
					break loop15;
				}
			}

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_column_value_list874); 
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
	// src/main/sqlplus/parser/SQLPlus.g:264:1: set_columns_clause returns [Map<String, Expression> columnsValuesMap] : SET columnValue= set_column_clause ( COMMA columnValue= set_column_clause )* ;
	public final Map<String, Expression> set_columns_clause() throws RecognitionException {
		Map<String, Expression> columnsValuesMap = null;


		Map<String, Expression> columnValue =null;


		        columnsValuesMap = new HashMap<String, Expression>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:268:5: ( SET columnValue= set_column_clause ( COMMA columnValue= set_column_clause )* )
			// src/main/sqlplus/parser/SQLPlus.g:268:9: SET columnValue= set_column_clause ( COMMA columnValue= set_column_clause )*
			{
			match(input,SET,FOLLOW_SET_in_set_columns_clause906); 
			pushFollow(FOLLOW_set_column_clause_in_set_columns_clause920);
			columnValue=set_column_clause();
			state._fsp--;


			            columnsValuesMap.putAll(columnValue);
			        
			// src/main/sqlplus/parser/SQLPlus.g:272:9: ( COMMA columnValue= set_column_clause )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:273:13: COMMA columnValue= set_column_clause
					{
					match(input,COMMA,FOLLOW_COMMA_in_set_columns_clause946); 
					pushFollow(FOLLOW_set_column_clause_in_set_columns_clause964);
					columnValue=set_column_clause();
					state._fsp--;


					                columnsValuesMap.putAll(columnValue);
					            
					}
					break;

				default :
					break loop16;
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
	// src/main/sqlplus/parser/SQLPlus.g:280:1: set_column_clause returns [Map<String, Expression> columnValueMap] : column_spec EQUAL ( expression | DEFAULT ) ;
	public final Map<String, Expression> set_column_clause() throws RecognitionException {
		Map<String, Expression> columnValueMap = null;


		Token DEFAULT30=null;
		ParserRuleReturnScope column_spec28 =null;
		Expression expression29 =null;


		        columnValueMap = new HashMap<String, Expression>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:284:5: ( column_spec EQUAL ( expression | DEFAULT ) )
			// src/main/sqlplus/parser/SQLPlus.g:284:7: column_spec EQUAL ( expression | DEFAULT )
			{
			pushFollow(FOLLOW_column_spec_in_set_column_clause1007);
			column_spec28=column_spec();
			state._fsp--;

			match(input,EQUAL,FOLLOW_EQUAL_in_set_column_clause1009); 
			// src/main/sqlplus/parser/SQLPlus.g:284:25: ( expression | DEFAULT )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ID||LA17_0==INTEGER_NUMBER||LA17_0==MINUS||LA17_0==NOT||LA17_0==PLUS||LA17_0==REAL_NUMBER||LA17_0==TEXT_STRING) ) {
				alt17=1;
			}
			else if ( (LA17_0==DEFAULT) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:285:13: expression
					{
					pushFollow(FOLLOW_expression_in_set_column_clause1025);
					expression29=expression();
					state._fsp--;


					                columnValueMap.put((column_spec28!=null?input.toString(column_spec28.start,column_spec28.stop):null), expression29);
					            
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:289:13: DEFAULT
					{
					DEFAULT30=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_set_column_clause1055); 

					                columnValueMap.put((column_spec28!=null?input.toString(column_spec28.start,column_spec28.stop):null), new ExpressionLiteral((DEFAULT30!=null?DEFAULT30.getText():null)));
					            
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
	// src/main/sqlplus/parser/SQLPlus.g:295:1: where_clause returns [Expression expr] : WHERE expression ;
	public final Expression where_clause() throws RecognitionException {
		Expression expr = null;


		Expression expression31 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:299:5: ( WHERE expression )
			// src/main/sqlplus/parser/SQLPlus.g:299:9: WHERE expression
			{
			match(input,WHERE,FOLLOW_WHERE_in_where_clause1099); 
			pushFollow(FOLLOW_expression_in_where_clause1101);
			expression31=expression();
			state._fsp--;

			 expr = expression31; 
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
	// src/main/sqlplus/parser/SQLPlus.g:302:1: table_atom : table_spec ;
	public final void table_atom() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:303:2: ( table_spec )
			// src/main/sqlplus/parser/SQLPlus.g:303:4: table_spec
			{
			pushFollow(FOLLOW_table_spec_in_table_atom1117);
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
	// src/main/sqlplus/parser/SQLPlus.g:306:1: table_spec : ( schema_name DOT )? table_name ;
	public final SQLPlusParser.table_spec_return table_spec() throws RecognitionException {
		SQLPlusParser.table_spec_return retval = new SQLPlusParser.table_spec_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:307:2: ( ( schema_name DOT )? table_name )
			// src/main/sqlplus/parser/SQLPlus.g:307:4: ( schema_name DOT )? table_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:307:4: ( schema_name DOT )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ID) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==DOT) ) {
					alt18=1;
				}
			}
			switch (alt18) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:307:5: schema_name DOT
					{
					pushFollow(FOLLOW_schema_name_in_table_spec1129);
					schema_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_table_spec1131); 
					}
					break;

			}

			pushFollow(FOLLOW_table_name_in_table_spec1135);
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
	// src/main/sqlplus/parser/SQLPlus.g:310:1: column_list returns [List<String> columnList] : LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS ;
	public final List<String> column_list() throws RecognitionException {
		List<String> columnList = null;


		ParserRuleReturnScope column =null;


		        columnList = new ArrayList<String>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:314:2: ( LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:314:6: LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_column_list1161); 
			pushFollow(FOLLOW_column_spec_in_column_list1172);
			column=column_spec();
			state._fsp--;


				        columnList.add((column!=null?input.toString(column.start,column.stop):null));
				    
			// src/main/sqlplus/parser/SQLPlus.g:318:9: ( COMMA column= column_spec )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:319:13: COMMA column= column_spec
					{
					match(input,COMMA,FOLLOW_COMMA_in_column_list1198); 
					pushFollow(FOLLOW_column_spec_in_column_list1216);
					column=column_spec();
					state._fsp--;


					                columnList.add((column!=null?input.toString(column.start,column.stop):null));
					            
					}
					break;

				default :
					break loop19;
				}
			}

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_column_list1239); 
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
	// src/main/sqlplus/parser/SQLPlus.g:327:1: column_spec : ( ( schema_name DOT )? table_name DOT )? column_name ;
	public final SQLPlusParser.column_spec_return column_spec() throws RecognitionException {
		SQLPlusParser.column_spec_return retval = new SQLPlusParser.column_spec_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:328:2: ( ( ( schema_name DOT )? table_name DOT )? column_name )
			// src/main/sqlplus/parser/SQLPlus.g:328:6: ( ( schema_name DOT )? table_name DOT )? column_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:328:6: ( ( schema_name DOT )? table_name DOT )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==ID) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==DOT) ) {
					alt21=1;
				}
			}
			switch (alt21) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:328:7: ( schema_name DOT )? table_name DOT
					{
					// src/main/sqlplus/parser/SQLPlus.g:328:7: ( schema_name DOT )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==ID) ) {
						int LA20_1 = input.LA(2);
						if ( (LA20_1==DOT) ) {
							int LA20_2 = input.LA(3);
							if ( (LA20_2==ID) ) {
								int LA20_3 = input.LA(4);
								if ( (LA20_3==DOT) ) {
									alt20=1;
								}
							}
						}
					}
					switch (alt20) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:328:8: schema_name DOT
							{
							pushFollow(FOLLOW_schema_name_in_column_spec1254);
							schema_name();
							state._fsp--;

							match(input,DOT,FOLLOW_DOT_in_column_spec1256); 
							}
							break;

					}

					pushFollow(FOLLOW_table_name_in_column_spec1260);
					table_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_column_spec1262); 
					}
					break;

			}

			pushFollow(FOLLOW_column_name_in_column_spec1266);
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
	// src/main/sqlplus/parser/SQLPlus.g:331:1: subquery : LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS ;
	public final void subquery() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:332:5: ( LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:332:9: LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_subquery1282); 
			pushFollow(FOLLOW_select_statement_in_subquery1284);
			select_statement();
			state._fsp--;

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_subquery1286); 
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
	// src/main/sqlplus/parser/SQLPlus.g:335:1: expression returns [Expression expr] : left= expr_factor1 ( OR right= expr_factor1 )* ;
	public final Expression expression() throws RecognitionException {
		Expression expr = null;


		Token OR32=null;
		Expression left =null;
		Expression right =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:339:5: (left= expr_factor1 ( OR right= expr_factor1 )* )
			// src/main/sqlplus/parser/SQLPlus.g:339:9: left= expr_factor1 ( OR right= expr_factor1 )*
			{
			pushFollow(FOLLOW_expr_factor1_in_expression1322);
			left=expr_factor1();
			state._fsp--;

			 expr = left; 
			// src/main/sqlplus/parser/SQLPlus.g:340:9: ( OR right= expr_factor1 )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==OR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:341:13: OR right= expr_factor1
					{
					OR32=(Token)match(input,OR,FOLLOW_OR_in_expression1348); 
					pushFollow(FOLLOW_expr_factor1_in_expression1354);
					right=expr_factor1();
					state._fsp--;


					                expr = new ExpressionBinary((OR32!=null?OR32.getText():null), expr, right);
					            
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
	// $ANTLR end "expression"



	// $ANTLR start "expr_factor1"
	// src/main/sqlplus/parser/SQLPlus.g:347:1: expr_factor1 returns [Expression expr] : left= expr_factor2 ( XOR right= expr_factor2 )* ;
	public final Expression expr_factor1() throws RecognitionException {
		Expression expr = null;


		Token XOR33=null;
		Expression left =null;
		Expression right =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:351:5: (left= expr_factor2 ( XOR right= expr_factor2 )* )
			// src/main/sqlplus/parser/SQLPlus.g:351:9: left= expr_factor2 ( XOR right= expr_factor2 )*
			{
			pushFollow(FOLLOW_expr_factor2_in_expr_factor11403);
			left=expr_factor2();
			state._fsp--;

			 expr = left; 
			// src/main/sqlplus/parser/SQLPlus.g:352:9: ( XOR right= expr_factor2 )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==XOR) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:353:13: XOR right= expr_factor2
					{
					XOR33=(Token)match(input,XOR,FOLLOW_XOR_in_expr_factor11429); 
					pushFollow(FOLLOW_expr_factor2_in_expr_factor11435);
					right=expr_factor2();
					state._fsp--;


					                expr = new ExpressionBinary((XOR33!=null?XOR33.getText():null), expr, right);
					            
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
	// $ANTLR end "expr_factor1"



	// $ANTLR start "expr_factor2"
	// src/main/sqlplus/parser/SQLPlus.g:359:1: expr_factor2 returns [Expression expr] : left= expr_factor3 ( AND right= expr_factor3 )* ;
	public final Expression expr_factor2() throws RecognitionException {
		Expression expr = null;


		Token AND34=null;
		Expression left =null;
		Expression right =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:363:5: (left= expr_factor3 ( AND right= expr_factor3 )* )
			// src/main/sqlplus/parser/SQLPlus.g:363:9: left= expr_factor3 ( AND right= expr_factor3 )*
			{
			pushFollow(FOLLOW_expr_factor3_in_expr_factor21484);
			left=expr_factor3();
			state._fsp--;

			 expr = left; 
			// src/main/sqlplus/parser/SQLPlus.g:364:9: ( AND right= expr_factor3 )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==AND) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:365:13: AND right= expr_factor3
					{
					AND34=(Token)match(input,AND,FOLLOW_AND_in_expr_factor21510); 
					pushFollow(FOLLOW_expr_factor3_in_expr_factor21516);
					right=expr_factor3();
					state._fsp--;


					                expr = new ExpressionBinary((AND34!=null?AND34.getText():null), expr, right);
					            
					}
					break;

				default :
					break loop24;
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
	// src/main/sqlplus/parser/SQLPlus.g:371:1: expr_factor3 returns [Expression expr] : ( NOT )? expr_factor4 ;
	public final Expression expr_factor3() throws RecognitionException {
		Expression expr = null;


		Token NOT35=null;
		Expression expr_factor436 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:375:5: ( ( NOT )? expr_factor4 )
			// src/main/sqlplus/parser/SQLPlus.g:375:9: ( NOT )? expr_factor4
			{
			// src/main/sqlplus/parser/SQLPlus.g:375:9: ( NOT )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==NOT) ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1==ID||LA25_1==INTEGER_NUMBER||LA25_1==MINUS||LA25_1==NOT||LA25_1==PLUS||LA25_1==REAL_NUMBER||LA25_1==TEXT_STRING) ) {
					alt25=1;
				}
			}
			switch (alt25) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:375:10: NOT
					{
					NOT35=(Token)match(input,NOT,FOLLOW_NOT_in_expr_factor31562); 
					}
					break;

			}

			pushFollow(FOLLOW_expr_factor4_in_expr_factor31566);
			expr_factor436=expr_factor4();
			state._fsp--;

			 expr = new ExpressionBinary((NOT35!=null?NOT35.getText():null), null, expr_factor436); 
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
	// src/main/sqlplus/parser/SQLPlus.g:378:1: expr_factor4 returns [Expression expr] : bool_primary ( IS ( NOT )? ( boolean_literal | NULL ) )? ;
	public final Expression expr_factor4() throws RecognitionException {
		Expression expr = null;


		Expression bool_primary37 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:382:5: ( bool_primary ( IS ( NOT )? ( boolean_literal | NULL ) )? )
			// src/main/sqlplus/parser/SQLPlus.g:382:9: bool_primary ( IS ( NOT )? ( boolean_literal | NULL ) )?
			{
			pushFollow(FOLLOW_bool_primary_in_expr_factor41600);
			bool_primary37=bool_primary();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:382:22: ( IS ( NOT )? ( boolean_literal | NULL ) )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==IS) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:382:24: IS ( NOT )? ( boolean_literal | NULL )
					{
					match(input,IS,FOLLOW_IS_in_expr_factor41604); 
					// src/main/sqlplus/parser/SQLPlus.g:382:27: ( NOT )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==NOT) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:382:28: NOT
							{
							match(input,NOT,FOLLOW_NOT_in_expr_factor41607); 
							}
							break;

					}

					// src/main/sqlplus/parser/SQLPlus.g:382:34: ( boolean_literal | NULL )
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==FALSE||LA27_0==TRUE) ) {
						alt27=1;
					}
					else if ( (LA27_0==NULL) ) {
						alt27=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}

					switch (alt27) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:382:35: boolean_literal
							{
							pushFollow(FOLLOW_boolean_literal_in_expr_factor41612);
							boolean_literal();
							state._fsp--;

							}
							break;
						case 2 :
							// src/main/sqlplus/parser/SQLPlus.g:382:53: NULL
							{
							match(input,NULL,FOLLOW_NULL_in_expr_factor41616); 
							}
							break;

					}

					}
					break;

			}

			 expr = bool_primary37; 
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
	// src/main/sqlplus/parser/SQLPlus.g:385:1: bool_primary returns [Expression expr] : (left= predicate relational_op right= predicate | predicate relational_op ( ALL | ANY )? subquery | NOT EXISTS subquery | predicate );
	public final Expression bool_primary() throws RecognitionException {
		Expression expr = null;


		Expression left =null;
		Expression right =null;
		ParserRuleReturnScope relational_op38 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:389:5: (left= predicate relational_op right= predicate | predicate relational_op ( ALL | ANY )? subquery | NOT EXISTS subquery | predicate )
			int alt30=4;
			switch ( input.LA(1) ) {
			case TEXT_STRING:
				{
				int LA30_1 = input.LA(2);
				if ( (LA30_1==EQUAL||(LA30_1 >= GREATER_THAN && LA30_1 <= GREATER_THAN_EQUAL)||(LA30_1 >= LESS_THAN && LA30_1 <= LESS_THAN_EQUAL)||LA30_1==NOT_EQUAL) ) {
					int LA30_6 = input.LA(3);
					if ( (LA30_6==ID||LA30_6==INTEGER_NUMBER||LA30_6==MINUS||LA30_6==PLUS||LA30_6==REAL_NUMBER||LA30_6==TEXT_STRING) ) {
						alt30=1;
					}
					else if ( (LA30_6==ALL||LA30_6==ANY||LA30_6==LEFT_PARENTHESIS) ) {
						alt30=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA30_1==AND||LA30_1==COMMA||LA30_1==IS||LA30_1==OR||LA30_1==RIGHT_PARENTHESIS||LA30_1==SEMICOLON||LA30_1==WHERE||LA30_1==XOR) ) {
					alt30=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 1, input);
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
				int LA30_2 = input.LA(2);
				if ( (LA30_2==INTEGER_NUMBER||LA30_2==REAL_NUMBER) ) {
					int LA30_3 = input.LA(3);
					if ( (LA30_3==EQUAL||(LA30_3 >= GREATER_THAN && LA30_3 <= GREATER_THAN_EQUAL)||(LA30_3 >= LESS_THAN && LA30_3 <= LESS_THAN_EQUAL)||LA30_3==NOT_EQUAL) ) {
						int LA30_6 = input.LA(4);
						if ( (LA30_6==ID||LA30_6==INTEGER_NUMBER||LA30_6==MINUS||LA30_6==PLUS||LA30_6==REAL_NUMBER||LA30_6==TEXT_STRING) ) {
							alt30=1;
						}
						else if ( (LA30_6==ALL||LA30_6==ANY||LA30_6==LEFT_PARENTHESIS) ) {
							alt30=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 30, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA30_3==AND||LA30_3==COMMA||LA30_3==IS||LA30_3==OR||LA30_3==RIGHT_PARENTHESIS||LA30_3==SEMICOLON||LA30_3==WHERE||LA30_3==XOR) ) {
						alt30=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 3, input);
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
							new NoViableAltException("", 30, 2, input);
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
				int LA30_3 = input.LA(2);
				if ( (LA30_3==EQUAL||(LA30_3 >= GREATER_THAN && LA30_3 <= GREATER_THAN_EQUAL)||(LA30_3 >= LESS_THAN && LA30_3 <= LESS_THAN_EQUAL)||LA30_3==NOT_EQUAL) ) {
					int LA30_6 = input.LA(3);
					if ( (LA30_6==ID||LA30_6==INTEGER_NUMBER||LA30_6==MINUS||LA30_6==PLUS||LA30_6==REAL_NUMBER||LA30_6==TEXT_STRING) ) {
						alt30=1;
					}
					else if ( (LA30_6==ALL||LA30_6==ANY||LA30_6==LEFT_PARENTHESIS) ) {
						alt30=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA30_3==AND||LA30_3==COMMA||LA30_3==IS||LA30_3==OR||LA30_3==RIGHT_PARENTHESIS||LA30_3==SEMICOLON||LA30_3==WHERE||LA30_3==XOR) ) {
					alt30=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 3, input);
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
					int LA30_8 = input.LA(3);
					if ( (LA30_8==ID) ) {
						switch ( input.LA(4) ) {
						case DOT:
							{
							int LA30_12 = input.LA(5);
							if ( (LA30_12==ID) ) {
								int LA30_13 = input.LA(6);
								if ( (LA30_13==EQUAL||(LA30_13 >= GREATER_THAN && LA30_13 <= GREATER_THAN_EQUAL)||(LA30_13 >= LESS_THAN && LA30_13 <= LESS_THAN_EQUAL)||LA30_13==NOT_EQUAL) ) {
									int LA30_6 = input.LA(7);
									if ( (LA30_6==ID||LA30_6==INTEGER_NUMBER||LA30_6==MINUS||LA30_6==PLUS||LA30_6==REAL_NUMBER||LA30_6==TEXT_STRING) ) {
										alt30=1;
									}
									else if ( (LA30_6==ALL||LA30_6==ANY||LA30_6==LEFT_PARENTHESIS) ) {
										alt30=2;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 30, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( (LA30_13==AND||LA30_13==COMMA||LA30_13==IS||LA30_13==OR||LA30_13==RIGHT_PARENTHESIS||LA30_13==SEMICOLON||LA30_13==WHERE||LA30_13==XOR) ) {
									alt30=4;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 30, 13, input);
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
										new NoViableAltException("", 30, 12, input);
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
							int LA30_6 = input.LA(5);
							if ( (LA30_6==ID||LA30_6==INTEGER_NUMBER||LA30_6==MINUS||LA30_6==PLUS||LA30_6==REAL_NUMBER||LA30_6==TEXT_STRING) ) {
								alt30=1;
							}
							else if ( (LA30_6==ALL||LA30_6==ANY||LA30_6==LEFT_PARENTHESIS) ) {
								alt30=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 30, 6, input);
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
							alt30=4;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 30, 11, input);
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
								new NoViableAltException("", 30, 8, input);
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
					int LA30_6 = input.LA(3);
					if ( (LA30_6==ID||LA30_6==INTEGER_NUMBER||LA30_6==MINUS||LA30_6==PLUS||LA30_6==REAL_NUMBER||LA30_6==TEXT_STRING) ) {
						alt30=1;
					}
					else if ( (LA30_6==ALL||LA30_6==ANY||LA30_6==LEFT_PARENTHESIS) ) {
						alt30=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 6, input);
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
					alt30=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NOT:
				{
				alt30=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:389:9: left= predicate relational_op right= predicate
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1658);
					left=predicate();
					state._fsp--;

					pushFollow(FOLLOW_relational_op_in_bool_primary1668);
					relational_op38=relational_op();
					state._fsp--;

					pushFollow(FOLLOW_predicate_in_bool_primary1682);
					right=predicate();
					state._fsp--;


					            expr = new ExpressionBinary((relational_op38!=null?input.toString(relational_op38.start,relational_op38.stop):null), left, right);
					        
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:394:9: predicate relational_op ( ALL | ANY )? subquery
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1694);
					predicate();
					state._fsp--;

					pushFollow(FOLLOW_relational_op_in_bool_primary1696);
					relational_op();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:394:33: ( ALL | ANY )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==ALL||LA29_0==ANY) ) {
						alt29=1;
					}
					switch (alt29) {
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

					pushFollow(FOLLOW_subquery_in_bool_primary1709);
					subquery();
					state._fsp--;

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:395:9: NOT EXISTS subquery
					{
					match(input,NOT,FOLLOW_NOT_in_bool_primary1719); 
					match(input,EXISTS,FOLLOW_EXISTS_in_bool_primary1721); 
					pushFollow(FOLLOW_subquery_in_bool_primary1723);
					subquery();
					state._fsp--;

					}
					break;
				case 4 :
					// src/main/sqlplus/parser/SQLPlus.g:396:9: predicate
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1733);
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
	// src/main/sqlplus/parser/SQLPlus.g:399:1: predicate returns [Expression expr] : bit_expr ;
	public final Expression predicate() throws RecognitionException {
		Expression expr = null;


		ParserRuleReturnScope bit_expr39 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:403:5: ( bit_expr )
			// src/main/sqlplus/parser/SQLPlus.g:403:9: bit_expr
			{
			pushFollow(FOLLOW_bit_expr_in_predicate1765);
			bit_expr39=bit_expr();
			state._fsp--;

			 expr = new ExpressionLiteral((bit_expr39!=null?input.toString(bit_expr39.start,bit_expr39.stop):null)); 
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
	// src/main/sqlplus/parser/SQLPlus.g:406:1: bit_expr : simple_expr ;
	public final SQLPlusParser.bit_expr_return bit_expr() throws RecognitionException {
		SQLPlusParser.bit_expr_return retval = new SQLPlusParser.bit_expr_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:407:5: ( simple_expr )
			// src/main/sqlplus/parser/SQLPlus.g:407:9: simple_expr
			{
			pushFollow(FOLLOW_simple_expr_in_bit_expr1786);
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
	// src/main/sqlplus/parser/SQLPlus.g:410:1: simple_expr : ( literal_value | column_spec );
	public final void simple_expr() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:411:5: ( literal_value | column_spec )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==INTEGER_NUMBER||LA31_0==MINUS||LA31_0==PLUS||LA31_0==REAL_NUMBER||LA31_0==TEXT_STRING) ) {
				alt31=1;
			}
			else if ( (LA31_0==ID) ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:411:9: literal_value
					{
					pushFollow(FOLLOW_literal_value_in_simple_expr1805);
					literal_value();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:412:9: column_spec
					{
					pushFollow(FOLLOW_column_spec_in_simple_expr1815);
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
	// src/main/sqlplus/parser/SQLPlus.g:415:1: literal_value : ( string_literal | number_literal );
	public final void literal_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:416:5: ( string_literal | number_literal )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==TEXT_STRING) ) {
				alt32=1;
			}
			else if ( (LA32_0==INTEGER_NUMBER||LA32_0==MINUS||LA32_0==PLUS||LA32_0==REAL_NUMBER) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:416:9: string_literal
					{
					pushFollow(FOLLOW_string_literal_in_literal_value1834);
					string_literal();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:417:9: number_literal
					{
					pushFollow(FOLLOW_number_literal_in_literal_value1844);
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
	// src/main/sqlplus/parser/SQLPlus.g:420:1: relational_op : ( EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LESS_THAN | LESS_THAN_EQUAL | NOT_EQUAL );
	public final SQLPlusParser.relational_op_return relational_op() throws RecognitionException {
		SQLPlusParser.relational_op_return retval = new SQLPlusParser.relational_op_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:421:5: ( EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LESS_THAN | LESS_THAN_EQUAL | NOT_EQUAL )
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
	// src/main/sqlplus/parser/SQLPlus.g:429:1: string_literal : TEXT_STRING ;
	public final void string_literal() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:429:17: ( TEXT_STRING )
			// src/main/sqlplus/parser/SQLPlus.g:429:21: TEXT_STRING
			{
			match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_string_literal1929); 
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
	// src/main/sqlplus/parser/SQLPlus.g:430:1: number_literal : ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER ) ;
	public final void number_literal() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:430:17: ( ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER ) )
			// src/main/sqlplus/parser/SQLPlus.g:430:19: ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER )
			{
			// src/main/sqlplus/parser/SQLPlus.g:430:19: ( PLUS | MINUS )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==MINUS||LA33_0==PLUS) ) {
				alt33=1;
			}
			switch (alt33) {
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
	// src/main/sqlplus/parser/SQLPlus.g:431:1: boolean_literal : ( TRUE | FALSE );
	public final void boolean_literal() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:431:17: ( TRUE | FALSE )
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
	// src/main/sqlplus/parser/SQLPlus.g:434:1: timing : ( BEFORE | AFTER );
	public final SQLPlusParser.timing_return timing() throws RecognitionException {
		SQLPlusParser.timing_return retval = new SQLPlusParser.timing_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:435:2: ( BEFORE | AFTER )
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
	// src/main/sqlplus/parser/SQLPlus.g:439:1: data_manipulation_language : ( INSERT | DELETE | UPDATE );
	public final SQLPlusParser.data_manipulation_language_return data_manipulation_language() throws RecognitionException {
		SQLPlusParser.data_manipulation_language_return retval = new SQLPlusParser.data_manipulation_language_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:440:2: ( INSERT | DELETE | UPDATE )
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
	// src/main/sqlplus/parser/SQLPlus.g:445:1: relational_operation : ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE );
	public final void relational_operation() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:446:2: ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE )
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
	// src/main/sqlplus/parser/SQLPlus.g:455:1: match_value : ( ID | QUESTION_MARK );
	public final void match_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:456:2: ( ID | QUESTION_MARK )
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
	// src/main/sqlplus/parser/SQLPlus.g:460:1: alias : ( AS )? ID ;
	public final void alias() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:460:7: ( ( AS )? ID )
			// src/main/sqlplus/parser/SQLPlus.g:460:9: ( AS )? ID
			{
			// src/main/sqlplus/parser/SQLPlus.g:460:9: ( AS )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==AS) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:460:10: AS
					{
					match(input,AS,FOLLOW_AS_in_alias2068); 
					}
					break;

			}

			match(input,ID,FOLLOW_ID_in_alias2072); 
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
	// src/main/sqlplus/parser/SQLPlus.g:461:1: column_name : ID ;
	public final void column_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:461:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:461:15: ID
			{
			match(input,ID,FOLLOW_ID_in_column_name2079); 
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
	// src/main/sqlplus/parser/SQLPlus.g:462:1: partition_name : ID ;
	public final void partition_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:462:16: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:462:18: ID
			{
			match(input,ID,FOLLOW_ID_in_partition_name2086); 
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
	// src/main/sqlplus/parser/SQLPlus.g:463:1: schema_name : ID ;
	public final SQLPlusParser.schema_name_return schema_name() throws RecognitionException {
		SQLPlusParser.schema_name_return retval = new SQLPlusParser.schema_name_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:463:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:463:15: ID
			{
			match(input,ID,FOLLOW_ID_in_schema_name2093); 
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
	// src/main/sqlplus/parser/SQLPlus.g:464:1: table_name : ID ;
	public final void table_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:464:12: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:464:14: ID
			{
			match(input,ID,FOLLOW_ID_in_table_name2100); 
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



	public static final BitSet FOLLOW_sql_statement_in_sqlplus47 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sqlplus_statement_in_sqlplus56 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sqlplus_alert_in_sqlplus_statement89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_sqlplus_statement101 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ALERTS_in_sqlplus_statement103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALERT_in_sqlplus_alert142 = new BitSet(new long[]{0x0000000000001010L});
	public static final BitSet FOLLOW_timing_in_sqlplus_alert144 = new BitSet(new long[]{0x0100000010020000L});
	public static final BitSet FOLLOW_data_manipulation_language_in_sqlplus_alert146 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IN_in_sqlplus_alert148 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_table_reference_in_sqlplus_alert150 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_where_clause_in_sqlplus_alert152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_data_manipulation_statements_in_sql_statement182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_statement_in_sql_statement189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_database_in_use_statement212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_use_database235 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_schema_name_in_use_database243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_statement_in_data_manipulation_statements268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_statements_in_data_manipulation_statements280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_update_statements_in_data_manipulation_statements292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_expression_in_select_statement318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_statement1_in_insert_statements349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_table_update_statement_in_update_statements375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select_expression398 = new BitSet(new long[]{0x0000000002000800L});
	public static final BitSet FOLLOW_select_list_in_select_expression400 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_FROM_in_select_expression402 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_table_references_in_select_expression405 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_where_clause_in_select_expression408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_header_in_insert_statement1438 = new BitSet(new long[]{0x0400000100000000L});
	public static final BitSet FOLLOW_column_list_in_insert_statement1446 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_value_list_clause_in_insert_statement1450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UPDATE_in_single_table_update_statement473 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_table_reference_in_single_table_update_statement475 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_set_columns_clause_in_single_table_update_statement477 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_where_clause_in_single_table_update_statement480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_displayed_column_in_select_list509 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_select_list520 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_displayed_column_in_select_list526 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_ASTERISK_in_select_list539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_displayed_column552 = new BitSet(new long[]{0x0000000002000402L});
	public static final BitSet FOLLOW_alias_in_displayed_column555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_references582 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_table_references593 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_table_reference_in_table_references602 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_table_atom_in_table_reference620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insert_header649 = new BitSet(new long[]{0x0000000042000000L});
	public static final BitSet FOLLOW_INTO_in_insert_header652 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_table_spec_in_insert_header656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALUES_in_value_list_clause690 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_column_value_list_in_value_list_clause704 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_value_list_clause730 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_column_value_list_in_value_list_clause748 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_column_value_list793 = new BitSet(new long[]{0x0020482022000000L});
	public static final BitSet FOLLOW_bit_expr_in_column_value_list807 = new BitSet(new long[]{0x0000800000004000L});
	public static final BitSet FOLLOW_COMMA_in_column_value_list833 = new BitSet(new long[]{0x0020482022000000L});
	public static final BitSet FOLLOW_bit_expr_in_column_value_list851 = new BitSet(new long[]{0x0000800000004000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_column_value_list874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_columns_clause906 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_set_column_clause_in_set_columns_clause920 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_set_columns_clause946 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_set_column_clause_in_set_columns_clause964 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_column_spec_in_set_column_clause1007 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQUAL_in_set_column_clause1009 = new BitSet(new long[]{0x002048A022010000L});
	public static final BitSet FOLLOW_expression_in_set_column_clause1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_set_column_clause1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_where_clause1099 = new BitSet(new long[]{0x002048A022000000L});
	public static final BitSet FOLLOW_expression_in_where_clause1101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_spec_in_table_atom1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_table_spec1129 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DOT_in_table_spec1131 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_table_name_in_table_spec1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_column_list1161 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_column_spec_in_column_list1172 = new BitSet(new long[]{0x0000800000004000L});
	public static final BitSet FOLLOW_COMMA_in_column_list1198 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_column_spec_in_column_list1216 = new BitSet(new long[]{0x0000800000004000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_column_list1239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_column_spec1254 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DOT_in_column_spec1256 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_table_name_in_column_spec1260 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DOT_in_column_spec1262 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_column_name_in_column_spec1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_subquery1282 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_select_statement_in_subquery1284 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_subquery1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_factor1_in_expression1322 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_OR_in_expression1348 = new BitSet(new long[]{0x002048A022000000L});
	public static final BitSet FOLLOW_expr_factor1_in_expression1354 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_expr_factor2_in_expr_factor11403 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_XOR_in_expr_factor11429 = new BitSet(new long[]{0x002048A022000000L});
	public static final BitSet FOLLOW_expr_factor2_in_expr_factor11435 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_expr_factor3_in_expr_factor21484 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_AND_in_expr_factor21510 = new BitSet(new long[]{0x002048A022000000L});
	public static final BitSet FOLLOW_expr_factor3_in_expr_factor21516 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_NOT_in_expr_factor31562 = new BitSet(new long[]{0x002048A022000000L});
	public static final BitSet FOLLOW_expr_factor4_in_expr_factor31566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_primary_in_expr_factor41600 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_IS_in_expr_factor41604 = new BitSet(new long[]{0x0040028000200000L});
	public static final BitSet FOLLOW_NOT_in_expr_factor41607 = new BitSet(new long[]{0x0040020000200000L});
	public static final BitSet FOLLOW_boolean_literal_in_expr_factor41612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_expr_factor41616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1658 = new BitSet(new long[]{0x0000010601880000L});
	public static final BitSet FOLLOW_relational_op_in_bool_primary1668 = new BitSet(new long[]{0x0020482022000000L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1694 = new BitSet(new long[]{0x0000010601880000L});
	public static final BitSet FOLLOW_relational_op_in_bool_primary1696 = new BitSet(new long[]{0x0000000100000280L});
	public static final BitSet FOLLOW_subquery_in_bool_primary1709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_bool_primary1719 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_EXISTS_in_bool_primary1721 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_subquery_in_bool_primary1723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bit_expr_in_predicate1765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_expr_in_bit_expr1786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_value_in_simple_expr1805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_simple_expr1815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_literal_value1834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_literal_in_literal_value1844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_STRING_in_string_literal1929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_number_literal1946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_alias2068 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_alias2072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name2079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partition_name2086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_schema_name2093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name2100 = new BitSet(new long[]{0x0000000000000002L});
}
