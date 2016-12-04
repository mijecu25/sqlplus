// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlus.g 2016-07-22 15:01:12

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
	import com.mijecu25.sqlplus.compiler.core.expression.ExpressionTable;
	import com.mijecu25.sqlplus.compiler.core.expression.ExpressionColumn;
	import com.mijecu25.sqlplus.compiler.core.expression.ExpressionConstantInteger;
	import com.mijecu25.sqlplus.compiler.core.expression.ExpressionConstantFloat;
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
		"AND", "ANY", "AS", "ASTERISK", "BEFORE", "CLEAR", "COLON", "COMMA", "DATABASES", 
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
	public static final int CLEAR=13;
	public static final int COLON=14;
	public static final int COMMA=15;
	public static final int DATABASES=16;
	public static final int DEFAULT=17;
	public static final int DELETE=18;
	public static final int DOT=19;
	public static final int EQUAL=20;
	public static final int EXISTS=21;
	public static final int FALSE=22;
	public static final int FROM=23;
	public static final int GREATER_THAN=24;
	public static final int GREATER_THAN_EQUAL=25;
	public static final int ID=26;
	public static final int IF=27;
	public static final int IN=28;
	public static final int INSERT=29;
	public static final int INTEGER_NUMBER=30;
	public static final int INTO=31;
	public static final int IS=32;
	public static final int LEFT_PARENTHESIS=33;
	public static final int LESS_THAN=34;
	public static final int LESS_THAN_EQUAL=35;
	public static final int LIKE=36;
	public static final int LIST=37;
	public static final int MINUS=38;
	public static final int NEWLINE=39;
	public static final int NOT=40;
	public static final int NOT_EQUAL=41;
	public static final int NULL=42;
	public static final int OR=43;
	public static final int PLUS=44;
	public static final int QUESTION_MARK=45;
	public static final int QUOTE=46;
	public static final int REAL_NUMBER=47;
	public static final int RIGHT_PARENTHESIS=48;
	public static final int SELECT=49;
	public static final int SEMICOLON=50;
	public static final int SET=51;
	public static final int SHOW=52;
	public static final int TABLES=53;
	public static final int TEXT_STRING=54;
	public static final int TRUE=55;
	public static final int UNDERSCORE=56;
	public static final int UPDATE=57;
	public static final int USE=58;
	public static final int VALUES=59;
	public static final int WHERE=60;
	public static final int WS=61;
	public static final int XOR=62;

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
	// src/main/sqlplus/parser/SQLPlus.g:50:1: sqlplus returns [Statement statement] : ( sql_statement SEMICOLON | sqlplus_statement SEMICOLON );
	public final Statement sqlplus() throws RecognitionException {
		Statement statement = null;


		Statement sql_statement1 =null;
		Statement sqlplus_statement2 =null;


				statement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:54:2: ( sql_statement SEMICOLON | sqlplus_statement SEMICOLON )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INSERT||LA1_0==SELECT||(LA1_0 >= UPDATE && LA1_0 <= USE)) ) {
				alt1=1;
			}
			else if ( (LA1_0==ALERT||LA1_0==CLEAR||LA1_0==LIST) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:54:5: sql_statement SEMICOLON
					{
					pushFollow(FOLLOW_sql_statement_in_sqlplus47);
					sql_statement1=sql_statement();
					state._fsp--;

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sqlplus49); 

								statement = sql_statement1;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:57:4: sqlplus_statement SEMICOLON
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
	// src/main/sqlplus/parser/SQLPlus.g:62:1: sqlplus_statement returns [Statement sqlplusStatement] : ( sqlplus_alert | sqlplus_list_alert | CLEAR ALERTS );
	public final Statement sqlplus_statement() throws RecognitionException {
		Statement sqlplusStatement = null;


		Statement sqlplus_alert3 =null;
		Statement sqlplus_list_alert4 =null;


		        sqlplusStatement = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:66:5: ( sqlplus_alert | sqlplus_list_alert | CLEAR ALERTS )
			int alt2=3;
			switch ( input.LA(1) ) {
			case ALERT:
				{
				alt2=1;
				}
				break;
			case LIST:
				{
				alt2=2;
				}
				break;
			case CLEAR:
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
					// src/main/sqlplus/parser/SQLPlus.g:66:9: sqlplus_alert
					{
					pushFollow(FOLLOW_sqlplus_alert_in_sqlplus_statement89);
					sqlplus_alert3=sqlplus_alert();
					state._fsp--;


					            sqlplusStatement = sqlplus_alert3;
					        
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:69:9: sqlplus_list_alert
					{
					pushFollow(FOLLOW_sqlplus_list_alert_in_sqlplus_statement101);
					sqlplus_list_alert4=sqlplus_list_alert();
					state._fsp--;


					            sqlplusStatement = sqlplus_list_alert4;
					        
					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:72:9: CLEAR ALERTS
					{
					match(input,CLEAR,FOLLOW_CLEAR_in_sqlplus_statement113); 
					match(input,ALERTS,FOLLOW_ALERTS_in_sqlplus_statement115); 

					            AlertManager.getManager().clearAll();
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
	// src/main/sqlplus/parser/SQLPlus.g:78:1: sqlplus_alert returns [Statement alert] : ALERT timing data_manipulation_language IN table_reference where_clause ;
	public final Statement sqlplus_alert() throws RecognitionException {
		Statement alert = null;


		ParserRuleReturnScope timing5 =null;
		ParserRuleReturnScope data_manipulation_language6 =null;
		ExpressionTable table_reference7 =null;
		Expression where_clause8 =null;


		        alert = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:84:5: ( ALERT timing data_manipulation_language IN table_reference where_clause )
			// src/main/sqlplus/parser/SQLPlus.g:84:9: ALERT timing data_manipulation_language IN table_reference where_clause
			{
			match(input,ALERT,FOLLOW_ALERT_in_sqlplus_alert159); 
			pushFollow(FOLLOW_timing_in_sqlplus_alert161);
			timing5=timing();
			state._fsp--;

			pushFollow(FOLLOW_data_manipulation_language_in_sqlplus_alert163);
			data_manipulation_language6=data_manipulation_language();
			state._fsp--;

			match(input,IN,FOLLOW_IN_in_sqlplus_alert165); 
			pushFollow(FOLLOW_table_reference_in_sqlplus_alert167);
			table_reference7=table_reference();
			state._fsp--;

			pushFollow(FOLLOW_where_clause_in_sqlplus_alert169);
			where_clause8=where_clause();
			state._fsp--;


			            alert = new Alert((timing5!=null?input.toString(timing5.start,timing5.stop):null), (data_manipulation_language6!=null?input.toString(data_manipulation_language6.start,data_manipulation_language6.stop):null), table_reference7, where_clause8);
			        
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



	// $ANTLR start "sqlplus_list_alert"
	// src/main/sqlplus/parser/SQLPlus.g:89:1: sqlplus_list_alert returns [Statement listAlert] : LIST ALERTS ;
	public final Statement sqlplus_list_alert() throws RecognitionException {
		Statement listAlert = null;



		        listAlert = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:93:5: ( LIST ALERTS )
			// src/main/sqlplus/parser/SQLPlus.g:93:9: LIST ALERTS
			{
			match(input,LIST,FOLLOW_LIST_in_sqlplus_list_alert203); 
			match(input,ALERTS,FOLLOW_ALERTS_in_sqlplus_list_alert205); 

			            AlertManager.getManager().listAll();
			            listAlert = new AlertDefault();
			        
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return listAlert;
	}
	// $ANTLR end "sqlplus_list_alert"



	// $ANTLR start "sql_statement"
	// src/main/sqlplus/parser/SQLPlus.g:99:1: sql_statement returns [Statement sqlStatement] : ( data_manipulation_statements | use_statement );
	public final Statement sql_statement() throws RecognitionException {
		Statement sqlStatement = null;


		Statement data_manipulation_statements9 =null;
		Statement use_statement10 =null;


				sqlStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:103:2: ( data_manipulation_statements | use_statement )
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
					// src/main/sqlplus/parser/SQLPlus.g:103:6: data_manipulation_statements
					{
					pushFollow(FOLLOW_data_manipulation_statements_in_sql_statement233);
					data_manipulation_statements9=data_manipulation_statements();
					state._fsp--;


						        sqlStatement = data_manipulation_statements9;
						    
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:106:4: use_statement
					{
					pushFollow(FOLLOW_use_statement_in_sql_statement240);
					use_statement10=use_statement();
					state._fsp--;


								sqlStatement = use_statement10;
							
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
	// src/main/sqlplus/parser/SQLPlus.g:111:1: use_statement returns [Statement useStatement] : use_database ;
	public final Statement use_statement() throws RecognitionException {
		Statement useStatement = null;


		Statement use_database11 =null;


				useStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:115:2: ( use_database )
			// src/main/sqlplus/parser/SQLPlus.g:115:4: use_database
			{
			pushFollow(FOLLOW_use_database_in_use_statement263);
			use_database11=use_database();
			state._fsp--;


						useStatement = use_database11;
					
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
	// src/main/sqlplus/parser/SQLPlus.g:120:1: use_database returns [Statement useDatabaseStatement] : USE database= schema_name ;
	public final Statement use_database() throws RecognitionException {
		Statement useDatabaseStatement = null;


		ParserRuleReturnScope database =null;


				useDatabaseStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:124:2: ( USE database= schema_name )
			// src/main/sqlplus/parser/SQLPlus.g:124:4: USE database= schema_name
			{
			match(input,USE,FOLLOW_USE_in_use_database286); 
			pushFollow(FOLLOW_schema_name_in_use_database294);
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
	// src/main/sqlplus/parser/SQLPlus.g:130:1: data_manipulation_statements returns [Statement dataManipulationStatement] : ( select_statement | insert_statements | update_statements );
	public final Statement data_manipulation_statements() throws RecognitionException {
		Statement dataManipulationStatement = null;


		Statement select_statement12 =null;
		Statement insert_statements13 =null;
		Statement update_statements14 =null;


			    dataManipulationStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:134:2: ( select_statement | insert_statements | update_statements )
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
					// src/main/sqlplus/parser/SQLPlus.g:134:6: select_statement
					{
					pushFollow(FOLLOW_select_statement_in_data_manipulation_statements319);
					select_statement12=select_statement();
					state._fsp--;


					            dataManipulationStatement = select_statement12;
					        
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:137:9: insert_statements
					{
					pushFollow(FOLLOW_insert_statements_in_data_manipulation_statements331);
					insert_statements13=insert_statements();
					state._fsp--;


					            dataManipulationStatement = insert_statements13;
					        
					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:140:9: update_statements
					{
					pushFollow(FOLLOW_update_statements_in_data_manipulation_statements343);
					update_statements14=update_statements();
					state._fsp--;


					            dataManipulationStatement = update_statements14;
					    
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
	// src/main/sqlplus/parser/SQLPlus.g:145:1: select_statement returns [Statement selectStatement] : select_expression ;
	public final Statement select_statement() throws RecognitionException {
		Statement selectStatement = null;


		Statement select_expression15 =null;


				selectStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:149:2: ( select_expression )
			// src/main/sqlplus/parser/SQLPlus.g:149:4: select_expression
			{
			pushFollow(FOLLOW_select_expression_in_select_statement369);
			select_expression15=select_expression();
			state._fsp--;


						selectStatement = select_expression15;
					
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
	// src/main/sqlplus/parser/SQLPlus.g:154:1: insert_statements returns [Statement insertStatements] : insert_statement1 ;
	public final Statement insert_statements() throws RecognitionException {
		Statement insertStatements = null;


		Statement insert_statement116 =null;


		        insertStatements = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:158:5: ( insert_statement1 )
			// src/main/sqlplus/parser/SQLPlus.g:158:9: insert_statement1
			{
			pushFollow(FOLLOW_insert_statement1_in_insert_statements400);
			insert_statement116=insert_statement1();
			state._fsp--;


			            insertStatements = insert_statement116;
			        
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
	// src/main/sqlplus/parser/SQLPlus.g:163:1: update_statements returns [Statement updateStatements] : single_table_update_statement ;
	public final Statement update_statements() throws RecognitionException {
		Statement updateStatements = null;


		Statement single_table_update_statement17 =null;


				updateStatements = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:167:2: ( single_table_update_statement )
			// src/main/sqlplus/parser/SQLPlus.g:167:4: single_table_update_statement
			{
			pushFollow(FOLLOW_single_table_update_statement_in_update_statements426);
			single_table_update_statement17=single_table_update_statement();
			state._fsp--;


						updateStatements = single_table_update_statement17;
					
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
	// src/main/sqlplus/parser/SQLPlus.g:172:1: select_expression returns [Statement selectExpression] : SELECT select_list FROM ( table_references ( where_clause )? )? ;
	public final Statement select_expression() throws RecognitionException {
		Statement selectExpression = null;


		List<Expression> select_list18 =null;
		List<ExpressionTable> table_references19 =null;
		Expression where_clause20 =null;


				selectExpression = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:176:2: ( SELECT select_list FROM ( table_references ( where_clause )? )? )
			// src/main/sqlplus/parser/SQLPlus.g:176:4: SELECT select_list FROM ( table_references ( where_clause )? )?
			{
			match(input,SELECT,FOLLOW_SELECT_in_select_expression449); 
			pushFollow(FOLLOW_select_list_in_select_expression451);
			select_list18=select_list();
			state._fsp--;

			match(input,FROM,FOLLOW_FROM_in_select_expression453); 
			// src/main/sqlplus/parser/SQLPlus.g:176:28: ( table_references ( where_clause )? )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:176:29: table_references ( where_clause )?
					{
					pushFollow(FOLLOW_table_references_in_select_expression456);
					table_references19=table_references();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:176:46: ( where_clause )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==WHERE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:176:47: where_clause
							{
							pushFollow(FOLLOW_where_clause_in_select_expression459);
							where_clause20=where_clause();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}


						selectExpression = new StatementSelectExpression(select_list18, table_references19, where_clause20);
					
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
	// src/main/sqlplus/parser/SQLPlus.g:181:1: insert_statement1 returns [Statement insertStatement1] : insert_header ( column_list )? value_list_clause ;
	public final Statement insert_statement1() throws RecognitionException {
		Statement insertStatement1 = null;


		ExpressionTable insert_header21 =null;
		List<ExpressionColumn> column_list22 =null;
		List<List<Expression>> value_list_clause23 =null;


			    insertStatement1 = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:185:2: ( insert_header ( column_list )? value_list_clause )
			// src/main/sqlplus/parser/SQLPlus.g:185:6: insert_header ( column_list )? value_list_clause
			{
			pushFollow(FOLLOW_insert_header_in_insert_statement1489);
			insert_header21=insert_header();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:186:6: ( column_list )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LEFT_PARENTHESIS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:186:7: column_list
					{
					pushFollow(FOLLOW_column_list_in_insert_statement1497);
					column_list22=column_list();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_value_list_clause_in_insert_statement1501);
			value_list_clause23=value_list_clause();
			state._fsp--;


				        insertStatement1 = new StatementInsertStatement1(insert_header21, column_list22, value_list_clause23);
				    
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
	// src/main/sqlplus/parser/SQLPlus.g:191:1: single_table_update_statement returns [Statement singleTableUpdateStatement] : UPDATE table_reference set_columns_clause ( where_clause )? ;
	public final Statement single_table_update_statement() throws RecognitionException {
		Statement singleTableUpdateStatement = null;


		ExpressionTable table_reference24 =null;
		Map<ExpressionColumn, Expression> set_columns_clause25 =null;
		Expression where_clause26 =null;


				singleTableUpdateStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:195:2: ( UPDATE table_reference set_columns_clause ( where_clause )? )
			// src/main/sqlplus/parser/SQLPlus.g:195:4: UPDATE table_reference set_columns_clause ( where_clause )?
			{
			match(input,UPDATE,FOLLOW_UPDATE_in_single_table_update_statement524); 
			pushFollow(FOLLOW_table_reference_in_single_table_update_statement526);
			table_reference24=table_reference();
			state._fsp--;

			pushFollow(FOLLOW_set_columns_clause_in_single_table_update_statement528);
			set_columns_clause25=set_columns_clause();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:195:46: ( where_clause )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==WHERE) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:195:47: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_single_table_update_statement531);
					where_clause26=where_clause();
					state._fsp--;

					}
					break;

			}


						singleTableUpdateStatement = new StatementSingleTableUpdateStatement(table_reference24, set_columns_clause25, where_clause26);
					
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
	// src/main/sqlplus/parser/SQLPlus.g:200:1: select_list returns [List<Expression> selectList] : (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK );
	public final List<Expression> select_list() throws RecognitionException {
		List<Expression> selectList = null;


		Token ASTERISK27=null;
		Expression column =null;


				selectList = new ArrayList<Expression>();
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:204:2: (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK )
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
					// src/main/sqlplus/parser/SQLPlus.g:204:4: column= displayed_column ( COMMA column= displayed_column )*
					{
					pushFollow(FOLLOW_displayed_column_in_select_list560);
					column=displayed_column();
					state._fsp--;


						 		selectList.add(column);
							
					// src/main/sqlplus/parser/SQLPlus.g:207:3: ( COMMA column= displayed_column )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:208:4: COMMA column= displayed_column
							{
							match(input,COMMA,FOLLOW_COMMA_in_select_list571); 
							pushFollow(FOLLOW_displayed_column_in_select_list577);
							column=displayed_column();
							state._fsp--;


											selectList.add(column);
										
							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:212:5: ASTERISK
					{
					ASTERISK27=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_select_list590); 

								selectList.add(new ExpressionLiteral((ASTERISK27!=null?ASTERISK27.getText():null)));
							
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



	// $ANTLR start "displayed_column"
	// src/main/sqlplus/parser/SQLPlus.g:217:1: displayed_column returns [Expression displayedColumn] : column_spec ( alias )? ;
	public final Expression displayed_column() throws RecognitionException {
		Expression displayedColumn = null;


		ExpressionColumn column_spec28 =null;


		        displayedColumn = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:221:2: ( column_spec ( alias )? )
			// src/main/sqlplus/parser/SQLPlus.g:221:4: column_spec ( alias )?
			{
			pushFollow(FOLLOW_column_spec_in_displayed_column616);
			column_spec28=column_spec();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:221:16: ( alias )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==AS||LA11_0==ID) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:221:17: alias
					{
					pushFollow(FOLLOW_alias_in_displayed_column619);
					alias();
					state._fsp--;

					}
					break;

			}

			 displayedColumn = column_spec28; 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return displayedColumn;
	}
	// $ANTLR end "displayed_column"



	// $ANTLR start "table_references"
	// src/main/sqlplus/parser/SQLPlus.g:224:1: table_references returns [List<ExpressionTable> tableReferences] : table= table_reference ( COMMA table= table_reference )* ;
	public final List<ExpressionTable> table_references() throws RecognitionException {
		List<ExpressionTable> tableReferences = null;


		ExpressionTable table =null;


				tableReferences = new ArrayList<ExpressionTable>();
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:228:2: (table= table_reference ( COMMA table= table_reference )* )
			// src/main/sqlplus/parser/SQLPlus.g:228:4: table= table_reference ( COMMA table= table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_references648);
			table=table_reference();
			state._fsp--;


						tableReferences.add(table);
					
			// src/main/sqlplus/parser/SQLPlus.g:231:3: ( COMMA table= table_reference )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==COMMA) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:232:4: COMMA table= table_reference
					{
					match(input,COMMA,FOLLOW_COMMA_in_table_references659); 
					pushFollow(FOLLOW_table_reference_in_table_references668);
					table=table_reference();
					state._fsp--;


									tableReferences.add(table);
								
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



	// $ANTLR start "table_reference"
	// src/main/sqlplus/parser/SQLPlus.g:239:1: table_reference returns [ExpressionTable tableReference] : table_atom ;
	public final ExpressionTable table_reference() throws RecognitionException {
		ExpressionTable tableReference = null;


		ExpressionTable table_atom29 =null;


		        tableReference = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:243:2: ( table_atom )
			// src/main/sqlplus/parser/SQLPlus.g:243:4: table_atom
			{
			pushFollow(FOLLOW_table_atom_in_table_reference699);
			table_atom29=table_atom();
			state._fsp--;

			 tableReference = table_atom29; 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return tableReference;
	}
	// $ANTLR end "table_reference"



	// $ANTLR start "insert_header"
	// src/main/sqlplus/parser/SQLPlus.g:246:1: insert_header returns [ExpressionTable table] : INSERT ( INTO )? table_spec ;
	public final ExpressionTable insert_header() throws RecognitionException {
		ExpressionTable table = null;


		ExpressionTable table_spec30 =null;


		        table = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:250:5: ( INSERT ( INTO )? table_spec )
			// src/main/sqlplus/parser/SQLPlus.g:250:9: INSERT ( INTO )? table_spec
			{
			match(input,INSERT,FOLLOW_INSERT_in_insert_header730); 
			// src/main/sqlplus/parser/SQLPlus.g:250:16: ( INTO )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==INTO) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:250:17: INTO
					{
					match(input,INTO,FOLLOW_INTO_in_insert_header733); 
					}
					break;

			}

			pushFollow(FOLLOW_table_spec_in_insert_header737);
			table_spec30=table_spec();
			state._fsp--;


			            table = table_spec30;
			        
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
	// src/main/sqlplus/parser/SQLPlus.g:255:1: value_list_clause returns [List<List<Expression>> valueListClause] : VALUES value= column_value_list ( COMMA value= column_value_list )* ;
	public final List<List<Expression>> value_list_clause() throws RecognitionException {
		List<List<Expression>> valueListClause = null;


		List<Expression> value =null;


		        valueListClause = new ArrayList<List<Expression>>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:259:5: ( VALUES value= column_value_list ( COMMA value= column_value_list )* )
			// src/main/sqlplus/parser/SQLPlus.g:259:9: VALUES value= column_value_list ( COMMA value= column_value_list )*
			{
			match(input,VALUES,FOLLOW_VALUES_in_value_list_clause771); 
			pushFollow(FOLLOW_column_value_list_in_value_list_clause785);
			value=column_value_list();
			state._fsp--;


			            valueListClause.add(value);
			        
			// src/main/sqlplus/parser/SQLPlus.g:263:9: ( COMMA value= column_value_list )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:264:13: COMMA value= column_value_list
					{
					match(input,COMMA,FOLLOW_COMMA_in_value_list_clause811); 
					pushFollow(FOLLOW_column_value_list_in_value_list_clause829);
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
	// src/main/sqlplus/parser/SQLPlus.g:271:1: column_value_list returns [List<Expression> columnValueList] : LEFT_PARENTHESIS expr= bit_expr ( COMMA expr= bit_expr )* RIGHT_PARENTHESIS ;
	public final List<Expression> column_value_list() throws RecognitionException {
		List<Expression> columnValueList = null;


		Expression expr =null;


		        columnValueList = new ArrayList<Expression>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:275:5: ( LEFT_PARENTHESIS expr= bit_expr ( COMMA expr= bit_expr )* RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:275:9: LEFT_PARENTHESIS expr= bit_expr ( COMMA expr= bit_expr )* RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_column_value_list874); 
			pushFollow(FOLLOW_bit_expr_in_column_value_list888);
			expr=bit_expr();
			state._fsp--;


			            columnValueList.add(expr);
			        
			// src/main/sqlplus/parser/SQLPlus.g:279:9: ( COMMA expr= bit_expr )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==COMMA) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:280:13: COMMA expr= bit_expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_column_value_list914); 
					pushFollow(FOLLOW_bit_expr_in_column_value_list932);
					expr=bit_expr();
					state._fsp--;


					                columnValueList.add(expr);
					            
					}
					break;

				default :
					break loop15;
				}
			}

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_column_value_list955); 
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
	// src/main/sqlplus/parser/SQLPlus.g:288:1: set_columns_clause returns [Map<ExpressionColumn, Expression> columnsValuesMap] : SET columnValue= set_column_clause ( COMMA columnValue= set_column_clause )* ;
	public final Map<ExpressionColumn, Expression> set_columns_clause() throws RecognitionException {
		Map<ExpressionColumn, Expression> columnsValuesMap = null;


		Map<ExpressionColumn, Expression> columnValue =null;


		        columnsValuesMap = new HashMap<ExpressionColumn, Expression>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:292:5: ( SET columnValue= set_column_clause ( COMMA columnValue= set_column_clause )* )
			// src/main/sqlplus/parser/SQLPlus.g:292:9: SET columnValue= set_column_clause ( COMMA columnValue= set_column_clause )*
			{
			match(input,SET,FOLLOW_SET_in_set_columns_clause987); 
			pushFollow(FOLLOW_set_column_clause_in_set_columns_clause1001);
			columnValue=set_column_clause();
			state._fsp--;


			            columnsValuesMap.putAll(columnValue);
			        
			// src/main/sqlplus/parser/SQLPlus.g:296:9: ( COMMA columnValue= set_column_clause )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:297:13: COMMA columnValue= set_column_clause
					{
					match(input,COMMA,FOLLOW_COMMA_in_set_columns_clause1027); 
					pushFollow(FOLLOW_set_column_clause_in_set_columns_clause1045);
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
	// src/main/sqlplus/parser/SQLPlus.g:304:1: set_column_clause returns [Map<ExpressionColumn, Expression> columnValueMap] : column_spec EQUAL ( expression | DEFAULT ) ;
	public final Map<ExpressionColumn, Expression> set_column_clause() throws RecognitionException {
		Map<ExpressionColumn, Expression> columnValueMap = null;


		Token DEFAULT33=null;
		ExpressionColumn column_spec31 =null;
		Expression expression32 =null;


		        columnValueMap = new HashMap<ExpressionColumn, Expression>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:308:5: ( column_spec EQUAL ( expression | DEFAULT ) )
			// src/main/sqlplus/parser/SQLPlus.g:308:7: column_spec EQUAL ( expression | DEFAULT )
			{
			pushFollow(FOLLOW_column_spec_in_set_column_clause1088);
			column_spec31=column_spec();
			state._fsp--;

			match(input,EQUAL,FOLLOW_EQUAL_in_set_column_clause1090); 
			// src/main/sqlplus/parser/SQLPlus.g:308:25: ( expression | DEFAULT )
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
					// src/main/sqlplus/parser/SQLPlus.g:309:13: expression
					{
					pushFollow(FOLLOW_expression_in_set_column_clause1106);
					expression32=expression();
					state._fsp--;


					                columnValueMap.put(column_spec31, expression32);
					            
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:313:13: DEFAULT
					{
					DEFAULT33=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_set_column_clause1136); 

					                columnValueMap.put(column_spec31, new ExpressionLiteral((DEFAULT33!=null?DEFAULT33.getText():null)));
					            
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
	// src/main/sqlplus/parser/SQLPlus.g:319:1: where_clause returns [Expression expr] : WHERE expression ;
	public final Expression where_clause() throws RecognitionException {
		Expression expr = null;


		Expression expression34 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:323:5: ( WHERE expression )
			// src/main/sqlplus/parser/SQLPlus.g:323:9: WHERE expression
			{
			match(input,WHERE,FOLLOW_WHERE_in_where_clause1180); 
			pushFollow(FOLLOW_expression_in_where_clause1182);
			expression34=expression();
			state._fsp--;

			 expr = expression34; 
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
	// src/main/sqlplus/parser/SQLPlus.g:326:1: table_atom returns [ExpressionTable tableAtom] : table_spec ;
	public final ExpressionTable table_atom() throws RecognitionException {
		ExpressionTable tableAtom = null;


		ExpressionTable table_spec35 =null;


		        tableAtom = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:330:2: ( table_spec )
			// src/main/sqlplus/parser/SQLPlus.g:330:4: table_spec
			{
			pushFollow(FOLLOW_table_spec_in_table_atom1211);
			table_spec35=table_spec();
			state._fsp--;

			 tableAtom = table_spec35; 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return tableAtom;
	}
	// $ANTLR end "table_atom"



	// $ANTLR start "table_spec"
	// src/main/sqlplus/parser/SQLPlus.g:333:1: table_spec returns [ExpressionTable tableSpec] : ( schema_name DOT )? table_name ;
	public final ExpressionTable table_spec() throws RecognitionException {
		ExpressionTable tableSpec = null;


		ParserRuleReturnScope schema_name36 =null;
		ParserRuleReturnScope table_name37 =null;


		        tableSpec = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:337:2: ( ( schema_name DOT )? table_name )
			// src/main/sqlplus/parser/SQLPlus.g:337:4: ( schema_name DOT )? table_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:337:4: ( schema_name DOT )?
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
					// src/main/sqlplus/parser/SQLPlus.g:337:5: schema_name DOT
					{
					pushFollow(FOLLOW_schema_name_in_table_spec1238);
					schema_name36=schema_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_table_spec1240); 
					}
					break;

			}

			pushFollow(FOLLOW_table_name_in_table_spec1244);
			table_name37=table_name();
			state._fsp--;

			 tableSpec = new ExpressionTable((schema_name36!=null?input.toString(schema_name36.start,schema_name36.stop):null), (table_name37!=null?input.toString(table_name37.start,table_name37.stop):null)); 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return tableSpec;
	}
	// $ANTLR end "table_spec"



	// $ANTLR start "column_list"
	// src/main/sqlplus/parser/SQLPlus.g:340:1: column_list returns [List<ExpressionColumn> columnList] : LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS ;
	public final List<ExpressionColumn> column_list() throws RecognitionException {
		List<ExpressionColumn> columnList = null;


		ExpressionColumn column =null;


		        columnList = new ArrayList<ExpressionColumn>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:344:2: ( LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:344:6: LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_column_list1272); 
			pushFollow(FOLLOW_column_spec_in_column_list1283);
			column=column_spec();
			state._fsp--;


				        columnList.add(column);
				    
			// src/main/sqlplus/parser/SQLPlus.g:348:9: ( COMMA column= column_spec )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:349:13: COMMA column= column_spec
					{
					match(input,COMMA,FOLLOW_COMMA_in_column_list1309); 
					pushFollow(FOLLOW_column_spec_in_column_list1327);
					column=column_spec();
					state._fsp--;


					                columnList.add(column);
					            
					}
					break;

				default :
					break loop19;
				}
			}

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_column_list1350); 
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



	// $ANTLR start "column_spec"
	// src/main/sqlplus/parser/SQLPlus.g:357:1: column_spec returns [ExpressionColumn columnSpec] : ( ( schema_name DOT )? table_name DOT )? column_name ;
	public final ExpressionColumn column_spec() throws RecognitionException {
		ExpressionColumn columnSpec = null;


		ParserRuleReturnScope schema_name38 =null;
		ParserRuleReturnScope table_name39 =null;
		ParserRuleReturnScope column_name40 =null;


		        columnSpec = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:361:2: ( ( ( schema_name DOT )? table_name DOT )? column_name )
			// src/main/sqlplus/parser/SQLPlus.g:361:6: ( ( schema_name DOT )? table_name DOT )? column_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:361:6: ( ( schema_name DOT )? table_name DOT )?
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
					// src/main/sqlplus/parser/SQLPlus.g:361:7: ( schema_name DOT )? table_name DOT
					{
					// src/main/sqlplus/parser/SQLPlus.g:361:7: ( schema_name DOT )?
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
							// src/main/sqlplus/parser/SQLPlus.g:361:8: schema_name DOT
							{
							pushFollow(FOLLOW_schema_name_in_column_spec1378);
							schema_name38=schema_name();
							state._fsp--;

							match(input,DOT,FOLLOW_DOT_in_column_spec1380); 
							}
							break;

					}

					pushFollow(FOLLOW_table_name_in_column_spec1384);
					table_name39=table_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_column_spec1386); 
					}
					break;

			}

			pushFollow(FOLLOW_column_name_in_column_spec1390);
			column_name40=column_name();
			state._fsp--;


				        columnSpec = new ExpressionColumn((schema_name38!=null?input.toString(schema_name38.start,schema_name38.stop):null), (table_name39!=null?input.toString(table_name39.start,table_name39.stop):null), (column_name40!=null?input.toString(column_name40.start,column_name40.stop):null));
			        
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return columnSpec;
	}
	// $ANTLR end "column_spec"



	// $ANTLR start "subquery"
	// src/main/sqlplus/parser/SQLPlus.g:366:1: subquery : LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS ;
	public final void subquery() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:367:5: ( LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:367:9: LEFT_PARENTHESIS select_statement RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_subquery1408); 
			pushFollow(FOLLOW_select_statement_in_subquery1410);
			select_statement();
			state._fsp--;

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_subquery1412); 
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
	// src/main/sqlplus/parser/SQLPlus.g:370:1: expression returns [Expression expr] : left= expr_factor1 ( OR right= expr_factor1 )* ;
	public final Expression expression() throws RecognitionException {
		Expression expr = null;


		Token OR41=null;
		Expression left =null;
		Expression right =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:374:5: (left= expr_factor1 ( OR right= expr_factor1 )* )
			// src/main/sqlplus/parser/SQLPlus.g:374:9: left= expr_factor1 ( OR right= expr_factor1 )*
			{
			pushFollow(FOLLOW_expr_factor1_in_expression1448);
			left=expr_factor1();
			state._fsp--;

			 expr = left; 
			// src/main/sqlplus/parser/SQLPlus.g:375:9: ( OR right= expr_factor1 )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==OR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:376:13: OR right= expr_factor1
					{
					OR41=(Token)match(input,OR,FOLLOW_OR_in_expression1474); 
					pushFollow(FOLLOW_expr_factor1_in_expression1480);
					right=expr_factor1();
					state._fsp--;


					                expr = new ExpressionBinary((OR41!=null?OR41.getText():null), expr, right);
					            
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
	// src/main/sqlplus/parser/SQLPlus.g:382:1: expr_factor1 returns [Expression expr] : left= expr_factor2 ( XOR right= expr_factor2 )* ;
	public final Expression expr_factor1() throws RecognitionException {
		Expression expr = null;


		Token XOR42=null;
		Expression left =null;
		Expression right =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:386:5: (left= expr_factor2 ( XOR right= expr_factor2 )* )
			// src/main/sqlplus/parser/SQLPlus.g:386:9: left= expr_factor2 ( XOR right= expr_factor2 )*
			{
			pushFollow(FOLLOW_expr_factor2_in_expr_factor11529);
			left=expr_factor2();
			state._fsp--;

			 expr = left; 
			// src/main/sqlplus/parser/SQLPlus.g:387:9: ( XOR right= expr_factor2 )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==XOR) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:388:13: XOR right= expr_factor2
					{
					XOR42=(Token)match(input,XOR,FOLLOW_XOR_in_expr_factor11555); 
					pushFollow(FOLLOW_expr_factor2_in_expr_factor11561);
					right=expr_factor2();
					state._fsp--;


					                expr = new ExpressionBinary((XOR42!=null?XOR42.getText():null), expr, right);
					            
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
	// src/main/sqlplus/parser/SQLPlus.g:394:1: expr_factor2 returns [Expression expr] : left= expr_factor3 ( AND right= expr_factor3 )* ;
	public final Expression expr_factor2() throws RecognitionException {
		Expression expr = null;


		Token AND43=null;
		Expression left =null;
		Expression right =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:398:5: (left= expr_factor3 ( AND right= expr_factor3 )* )
			// src/main/sqlplus/parser/SQLPlus.g:398:9: left= expr_factor3 ( AND right= expr_factor3 )*
			{
			pushFollow(FOLLOW_expr_factor3_in_expr_factor21610);
			left=expr_factor3();
			state._fsp--;

			 expr = left; 
			// src/main/sqlplus/parser/SQLPlus.g:399:9: ( AND right= expr_factor3 )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==AND) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:400:13: AND right= expr_factor3
					{
					AND43=(Token)match(input,AND,FOLLOW_AND_in_expr_factor21636); 
					pushFollow(FOLLOW_expr_factor3_in_expr_factor21642);
					right=expr_factor3();
					state._fsp--;


					                expr = new ExpressionBinary((AND43!=null?AND43.getText():null), expr, right);
					            
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
	// src/main/sqlplus/parser/SQLPlus.g:406:1: expr_factor3 returns [Expression expr] : ( NOT )? expr_factor4 ;
	public final Expression expr_factor3() throws RecognitionException {
		Expression expr = null;


		Token NOT44=null;
		Expression expr_factor445 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:410:5: ( ( NOT )? expr_factor4 )
			// src/main/sqlplus/parser/SQLPlus.g:410:9: ( NOT )? expr_factor4
			{
			// src/main/sqlplus/parser/SQLPlus.g:410:9: ( NOT )?
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
					// src/main/sqlplus/parser/SQLPlus.g:410:10: NOT
					{
					NOT44=(Token)match(input,NOT,FOLLOW_NOT_in_expr_factor31688); 
					}
					break;

			}

			pushFollow(FOLLOW_expr_factor4_in_expr_factor31692);
			expr_factor445=expr_factor4();
			state._fsp--;

			 expr = new ExpressionBinary((NOT44!=null?NOT44.getText():null), null, expr_factor445); 
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
	// src/main/sqlplus/parser/SQLPlus.g:413:1: expr_factor4 returns [Expression expr] : bool_primary ( IS ( NOT )? ( boolean_literal | NULL ) )? ;
	public final Expression expr_factor4() throws RecognitionException {
		Expression expr = null;


		Expression bool_primary46 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:417:5: ( bool_primary ( IS ( NOT )? ( boolean_literal | NULL ) )? )
			// src/main/sqlplus/parser/SQLPlus.g:417:9: bool_primary ( IS ( NOT )? ( boolean_literal | NULL ) )?
			{
			pushFollow(FOLLOW_bool_primary_in_expr_factor41726);
			bool_primary46=bool_primary();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:417:22: ( IS ( NOT )? ( boolean_literal | NULL ) )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==IS) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:417:24: IS ( NOT )? ( boolean_literal | NULL )
					{
					match(input,IS,FOLLOW_IS_in_expr_factor41730); 
					// src/main/sqlplus/parser/SQLPlus.g:417:27: ( NOT )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==NOT) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:417:28: NOT
							{
							match(input,NOT,FOLLOW_NOT_in_expr_factor41733); 
							}
							break;

					}

					// src/main/sqlplus/parser/SQLPlus.g:417:34: ( boolean_literal | NULL )
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
							// src/main/sqlplus/parser/SQLPlus.g:417:35: boolean_literal
							{
							pushFollow(FOLLOW_boolean_literal_in_expr_factor41738);
							boolean_literal();
							state._fsp--;

							}
							break;
						case 2 :
							// src/main/sqlplus/parser/SQLPlus.g:417:53: NULL
							{
							match(input,NULL,FOLLOW_NULL_in_expr_factor41742); 
							}
							break;

					}

					}
					break;

			}

			 expr = bool_primary46; 
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
	// src/main/sqlplus/parser/SQLPlus.g:420:1: bool_primary returns [Expression expr] : (left= predicate relational_op right= predicate | predicate relational_op ( ALL | ANY )? subquery | NOT EXISTS subquery | predicate );
	public final Expression bool_primary() throws RecognitionException {
		Expression expr = null;


		Expression left =null;
		Expression right =null;
		ParserRuleReturnScope relational_op47 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:424:5: (left= predicate relational_op right= predicate | predicate relational_op ( ALL | ANY )? subquery | NOT EXISTS subquery | predicate )
			int alt30=4;
			switch ( input.LA(1) ) {
			case TEXT_STRING:
				{
				int LA30_1 = input.LA(2);
				if ( (LA30_1==EQUAL||(LA30_1 >= GREATER_THAN && LA30_1 <= GREATER_THAN_EQUAL)||(LA30_1 >= LESS_THAN && LA30_1 <= LESS_THAN_EQUAL)||LA30_1==NOT_EQUAL) ) {
					int LA30_7 = input.LA(3);
					if ( (LA30_7==ID||LA30_7==INTEGER_NUMBER||LA30_7==MINUS||LA30_7==PLUS||LA30_7==REAL_NUMBER||LA30_7==TEXT_STRING) ) {
						alt30=1;
					}
					else if ( (LA30_7==ALL||LA30_7==ANY||LA30_7==LEFT_PARENTHESIS) ) {
						alt30=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 7, input);
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
				if ( (LA30_2==INTEGER_NUMBER) ) {
					int LA30_3 = input.LA(3);
					if ( (LA30_3==EQUAL||(LA30_3 >= GREATER_THAN && LA30_3 <= GREATER_THAN_EQUAL)||(LA30_3 >= LESS_THAN && LA30_3 <= LESS_THAN_EQUAL)||LA30_3==NOT_EQUAL) ) {
						int LA30_7 = input.LA(4);
						if ( (LA30_7==ID||LA30_7==INTEGER_NUMBER||LA30_7==MINUS||LA30_7==PLUS||LA30_7==REAL_NUMBER||LA30_7==TEXT_STRING) ) {
							alt30=1;
						}
						else if ( (LA30_7==ALL||LA30_7==ANY||LA30_7==LEFT_PARENTHESIS) ) {
							alt30=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 30, 7, input);
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
				else if ( (LA30_2==REAL_NUMBER) ) {
					int LA30_4 = input.LA(3);
					if ( (LA30_4==EQUAL||(LA30_4 >= GREATER_THAN && LA30_4 <= GREATER_THAN_EQUAL)||(LA30_4 >= LESS_THAN && LA30_4 <= LESS_THAN_EQUAL)||LA30_4==NOT_EQUAL) ) {
						int LA30_7 = input.LA(4);
						if ( (LA30_7==ID||LA30_7==INTEGER_NUMBER||LA30_7==MINUS||LA30_7==PLUS||LA30_7==REAL_NUMBER||LA30_7==TEXT_STRING) ) {
							alt30=1;
						}
						else if ( (LA30_7==ALL||LA30_7==ANY||LA30_7==LEFT_PARENTHESIS) ) {
							alt30=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 30, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA30_4==AND||LA30_4==COMMA||LA30_4==IS||LA30_4==OR||LA30_4==RIGHT_PARENTHESIS||LA30_4==SEMICOLON||LA30_4==WHERE||LA30_4==XOR) ) {
						alt30=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 4, input);
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
				{
				int LA30_3 = input.LA(2);
				if ( (LA30_3==EQUAL||(LA30_3 >= GREATER_THAN && LA30_3 <= GREATER_THAN_EQUAL)||(LA30_3 >= LESS_THAN && LA30_3 <= LESS_THAN_EQUAL)||LA30_3==NOT_EQUAL) ) {
					int LA30_7 = input.LA(3);
					if ( (LA30_7==ID||LA30_7==INTEGER_NUMBER||LA30_7==MINUS||LA30_7==PLUS||LA30_7==REAL_NUMBER||LA30_7==TEXT_STRING) ) {
						alt30=1;
					}
					else if ( (LA30_7==ALL||LA30_7==ANY||LA30_7==LEFT_PARENTHESIS) ) {
						alt30=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 7, input);
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
			case REAL_NUMBER:
				{
				int LA30_4 = input.LA(2);
				if ( (LA30_4==EQUAL||(LA30_4 >= GREATER_THAN && LA30_4 <= GREATER_THAN_EQUAL)||(LA30_4 >= LESS_THAN && LA30_4 <= LESS_THAN_EQUAL)||LA30_4==NOT_EQUAL) ) {
					int LA30_7 = input.LA(3);
					if ( (LA30_7==ID||LA30_7==INTEGER_NUMBER||LA30_7==MINUS||LA30_7==PLUS||LA30_7==REAL_NUMBER||LA30_7==TEXT_STRING) ) {
						alt30=1;
					}
					else if ( (LA30_7==ALL||LA30_7==ANY||LA30_7==LEFT_PARENTHESIS) ) {
						alt30=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA30_4==AND||LA30_4==COMMA||LA30_4==IS||LA30_4==OR||LA30_4==RIGHT_PARENTHESIS||LA30_4==SEMICOLON||LA30_4==WHERE||LA30_4==XOR) ) {
					alt30=4;
				}

				else {
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
			case ID:
				{
				switch ( input.LA(2) ) {
				case DOT:
					{
					int LA30_9 = input.LA(3);
					if ( (LA30_9==ID) ) {
						switch ( input.LA(4) ) {
						case DOT:
							{
							int LA30_13 = input.LA(5);
							if ( (LA30_13==ID) ) {
								int LA30_14 = input.LA(6);
								if ( (LA30_14==EQUAL||(LA30_14 >= GREATER_THAN && LA30_14 <= GREATER_THAN_EQUAL)||(LA30_14 >= LESS_THAN && LA30_14 <= LESS_THAN_EQUAL)||LA30_14==NOT_EQUAL) ) {
									int LA30_7 = input.LA(7);
									if ( (LA30_7==ID||LA30_7==INTEGER_NUMBER||LA30_7==MINUS||LA30_7==PLUS||LA30_7==REAL_NUMBER||LA30_7==TEXT_STRING) ) {
										alt30=1;
									}
									else if ( (LA30_7==ALL||LA30_7==ANY||LA30_7==LEFT_PARENTHESIS) ) {
										alt30=2;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 30, 7, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( (LA30_14==AND||LA30_14==COMMA||LA30_14==IS||LA30_14==OR||LA30_14==RIGHT_PARENTHESIS||LA30_14==SEMICOLON||LA30_14==WHERE||LA30_14==XOR) ) {
									alt30=4;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 30, 14, input);
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
										new NoViableAltException("", 30, 13, input);
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
							int LA30_7 = input.LA(5);
							if ( (LA30_7==ID||LA30_7==INTEGER_NUMBER||LA30_7==MINUS||LA30_7==PLUS||LA30_7==REAL_NUMBER||LA30_7==TEXT_STRING) ) {
								alt30=1;
							}
							else if ( (LA30_7==ALL||LA30_7==ANY||LA30_7==LEFT_PARENTHESIS) ) {
								alt30=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 30, 7, input);
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
									new NoViableAltException("", 30, 12, input);
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
								new NoViableAltException("", 30, 9, input);
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
					int LA30_7 = input.LA(3);
					if ( (LA30_7==ID||LA30_7==INTEGER_NUMBER||LA30_7==MINUS||LA30_7==PLUS||LA30_7==REAL_NUMBER||LA30_7==TEXT_STRING) ) {
						alt30=1;
					}
					else if ( (LA30_7==ALL||LA30_7==ANY||LA30_7==LEFT_PARENTHESIS) ) {
						alt30=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 7, input);
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
							new NoViableAltException("", 30, 5, input);
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
					// src/main/sqlplus/parser/SQLPlus.g:424:9: left= predicate relational_op right= predicate
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1784);
					left=predicate();
					state._fsp--;

					pushFollow(FOLLOW_relational_op_in_bool_primary1794);
					relational_op47=relational_op();
					state._fsp--;

					pushFollow(FOLLOW_predicate_in_bool_primary1808);
					right=predicate();
					state._fsp--;


					            expr = new ExpressionBinary((relational_op47!=null?input.toString(relational_op47.start,relational_op47.stop):null), left, right);
					        
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:429:9: predicate relational_op ( ALL | ANY )? subquery
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1820);
					predicate();
					state._fsp--;

					pushFollow(FOLLOW_relational_op_in_bool_primary1822);
					relational_op();
					state._fsp--;

					// src/main/sqlplus/parser/SQLPlus.g:429:33: ( ALL | ANY )?
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

					pushFollow(FOLLOW_subquery_in_bool_primary1835);
					subquery();
					state._fsp--;

					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:430:9: NOT EXISTS subquery
					{
					match(input,NOT,FOLLOW_NOT_in_bool_primary1845); 
					match(input,EXISTS,FOLLOW_EXISTS_in_bool_primary1847); 
					pushFollow(FOLLOW_subquery_in_bool_primary1849);
					subquery();
					state._fsp--;

					}
					break;
				case 4 :
					// src/main/sqlplus/parser/SQLPlus.g:431:9: predicate
					{
					pushFollow(FOLLOW_predicate_in_bool_primary1859);
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
	// src/main/sqlplus/parser/SQLPlus.g:434:1: predicate returns [Expression expr] : bit_expr ;
	public final Expression predicate() throws RecognitionException {
		Expression expr = null;


		Expression bit_expr48 =null;


		        expr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:438:5: ( bit_expr )
			// src/main/sqlplus/parser/SQLPlus.g:438:9: bit_expr
			{
			pushFollow(FOLLOW_bit_expr_in_predicate1891);
			bit_expr48=bit_expr();
			state._fsp--;

			 expr = bit_expr48; 
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



	// $ANTLR start "bit_expr"
	// src/main/sqlplus/parser/SQLPlus.g:441:1: bit_expr returns [Expression bitExpr] : simple_expr ;
	public final Expression bit_expr() throws RecognitionException {
		Expression bitExpr = null;


		Expression simple_expr49 =null;


		        bitExpr = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:445:5: ( simple_expr )
			// src/main/sqlplus/parser/SQLPlus.g:445:9: simple_expr
			{
			pushFollow(FOLLOW_simple_expr_in_bit_expr1925);
			simple_expr49=simple_expr();
			state._fsp--;

			 bitExpr = simple_expr49; 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return bitExpr;
	}
	// $ANTLR end "bit_expr"



	// $ANTLR start "simple_expr"
	// src/main/sqlplus/parser/SQLPlus.g:448:1: simple_expr returns [Expression simpleExpression] : ( literal_value | column_spec );
	public final Expression simple_expr() throws RecognitionException {
		Expression simpleExpression = null;


		Expression literal_value50 =null;


		        simpleExpression = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:452:5: ( literal_value | column_spec )
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
					// src/main/sqlplus/parser/SQLPlus.g:452:9: literal_value
					{
					pushFollow(FOLLOW_literal_value_in_simple_expr1959);
					literal_value50=literal_value();
					state._fsp--;

					 simpleExpression = literal_value50; 
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:453:9: column_spec
					{
					pushFollow(FOLLOW_column_spec_in_simple_expr1971);
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
		return simpleExpression;
	}
	// $ANTLR end "simple_expr"



	// $ANTLR start "literal_value"
	// src/main/sqlplus/parser/SQLPlus.g:456:1: literal_value returns [Expression literalValue] : ( string_literal | number_literal );
	public final Expression literal_value() throws RecognitionException {
		Expression literalValue = null;


		Expression string_literal51 =null;
		Expression number_literal52 =null;


		        literalValue = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:460:5: ( string_literal | number_literal )
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
					// src/main/sqlplus/parser/SQLPlus.g:460:9: string_literal
					{
					pushFollow(FOLLOW_string_literal_in_literal_value2004);
					string_literal51=string_literal();
					state._fsp--;

					 literalValue = string_literal51; 
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:461:9: number_literal
					{
					pushFollow(FOLLOW_number_literal_in_literal_value2016);
					number_literal52=number_literal();
					state._fsp--;

					 literalValue = number_literal52; 
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
		return literalValue;
	}
	// $ANTLR end "literal_value"


	public static class relational_op_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "relational_op"
	// src/main/sqlplus/parser/SQLPlus.g:464:1: relational_op : ( EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LESS_THAN | LESS_THAN_EQUAL | NOT_EQUAL );
	public final SQLPlusParser.relational_op_return relational_op() throws RecognitionException {
		SQLPlusParser.relational_op_return retval = new SQLPlusParser.relational_op_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:465:5: ( EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | LESS_THAN | LESS_THAN_EQUAL | NOT_EQUAL )
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
	// src/main/sqlplus/parser/SQLPlus.g:473:1: string_literal returns [Expression stringLiteral] : TEXT_STRING ;
	public final Expression string_literal() throws RecognitionException {
		Expression stringLiteral = null;


		Token TEXT_STRING53=null;


		        stringLiteral = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:477:5: ( TEXT_STRING )
			// src/main/sqlplus/parser/SQLPlus.g:477:9: TEXT_STRING
			{
			TEXT_STRING53=(Token)match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_string_literal2120); 
			 stringLiteral = new ExpressionLiteral((TEXT_STRING53!=null?TEXT_STRING53.getText():null)); 
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return stringLiteral;
	}
	// $ANTLR end "string_literal"



	// $ANTLR start "number_literal"
	// src/main/sqlplus/parser/SQLPlus.g:479:1: number_literal returns [Expression numberLiteral] : ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER ) ;
	public final Expression number_literal() throws RecognitionException {
		Expression numberLiteral = null;


		Token INTEGER_NUMBER54=null;
		Token REAL_NUMBER55=null;


		        numberLiteral = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:483:5: ( ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER ) )
			// src/main/sqlplus/parser/SQLPlus.g:483:7: ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER )
			{
			// src/main/sqlplus/parser/SQLPlus.g:483:7: ( PLUS | MINUS )?
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

			// src/main/sqlplus/parser/SQLPlus.g:484:9: ( INTEGER_NUMBER | REAL_NUMBER )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==INTEGER_NUMBER) ) {
				alt34=1;
			}
			else if ( (LA34_0==REAL_NUMBER) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:485:13: INTEGER_NUMBER
					{
					INTEGER_NUMBER54=(Token)match(input,INTEGER_NUMBER,FOLLOW_INTEGER_NUMBER_in_number_literal2183); 
					 numberLiteral = new ExpressionConstantInteger(Integer.parseInt((INTEGER_NUMBER54!=null?INTEGER_NUMBER54.getText():null))); 
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:487:13: REAL_NUMBER
					{
					REAL_NUMBER55=(Token)match(input,REAL_NUMBER,FOLLOW_REAL_NUMBER_in_number_literal2209); 
					 numberLiteral = new ExpressionConstantFloat(Float.parseFloat((REAL_NUMBER55!=null?REAL_NUMBER55.getText():null))); 
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
		return numberLiteral;
	}
	// $ANTLR end "number_literal"



	// $ANTLR start "boolean_literal"
	// src/main/sqlplus/parser/SQLPlus.g:491:1: boolean_literal : ( TRUE | FALSE );
	public final void boolean_literal() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:491:17: ( TRUE | FALSE )
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
	// src/main/sqlplus/parser/SQLPlus.g:494:1: timing : ( BEFORE | AFTER );
	public final SQLPlusParser.timing_return timing() throws RecognitionException {
		SQLPlusParser.timing_return retval = new SQLPlusParser.timing_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:495:2: ( BEFORE | AFTER )
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
	// src/main/sqlplus/parser/SQLPlus.g:499:1: data_manipulation_language : ( INSERT | DELETE | UPDATE );
	public final SQLPlusParser.data_manipulation_language_return data_manipulation_language() throws RecognitionException {
		SQLPlusParser.data_manipulation_language_return retval = new SQLPlusParser.data_manipulation_language_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:500:2: ( INSERT | DELETE | UPDATE )
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
	// src/main/sqlplus/parser/SQLPlus.g:505:1: relational_operation : ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE );
	public final void relational_operation() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:506:2: ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE )
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
	// src/main/sqlplus/parser/SQLPlus.g:515:1: match_value : ( ID | QUESTION_MARK );
	public final void match_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:516:2: ( ID | QUESTION_MARK )
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
	// src/main/sqlplus/parser/SQLPlus.g:520:1: alias : ( AS )? ID ;
	public final void alias() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:520:7: ( ( AS )? ID )
			// src/main/sqlplus/parser/SQLPlus.g:520:9: ( AS )? ID
			{
			// src/main/sqlplus/parser/SQLPlus.g:520:9: ( AS )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==AS) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:520:10: AS
					{
					match(input,AS,FOLLOW_AS_in_alias2343); 
					}
					break;

			}

			match(input,ID,FOLLOW_ID_in_alias2347); 
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


	public static class column_name_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "column_name"
	// src/main/sqlplus/parser/SQLPlus.g:521:1: column_name : ID ;
	public final SQLPlusParser.column_name_return column_name() throws RecognitionException {
		SQLPlusParser.column_name_return retval = new SQLPlusParser.column_name_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:521:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:521:15: ID
			{
			match(input,ID,FOLLOW_ID_in_column_name2354); 
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
	// $ANTLR end "column_name"



	// $ANTLR start "partition_name"
	// src/main/sqlplus/parser/SQLPlus.g:522:1: partition_name : ID ;
	public final void partition_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:522:16: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:522:18: ID
			{
			match(input,ID,FOLLOW_ID_in_partition_name2361); 
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
	// src/main/sqlplus/parser/SQLPlus.g:523:1: schema_name : ID ;
	public final SQLPlusParser.schema_name_return schema_name() throws RecognitionException {
		SQLPlusParser.schema_name_return retval = new SQLPlusParser.schema_name_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:523:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:523:15: ID
			{
			match(input,ID,FOLLOW_ID_in_schema_name2368); 
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


	public static class table_name_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "table_name"
	// src/main/sqlplus/parser/SQLPlus.g:524:1: table_name : ID ;
	public final SQLPlusParser.table_name_return table_name() throws RecognitionException {
		SQLPlusParser.table_name_return retval = new SQLPlusParser.table_name_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:524:12: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:524:14: ID
			{
			match(input,ID,FOLLOW_ID_in_table_name2375); 
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
	// $ANTLR end "table_name"

	// Delegated rules



	public static final BitSet FOLLOW_sql_statement_in_sqlplus47 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sqlplus_statement_in_sqlplus56 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sqlplus_alert_in_sqlplus_statement89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sqlplus_list_alert_in_sqlplus_statement101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLEAR_in_sqlplus_statement113 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ALERTS_in_sqlplus_statement115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALERT_in_sqlplus_alert159 = new BitSet(new long[]{0x0000000000001010L});
	public static final BitSet FOLLOW_timing_in_sqlplus_alert161 = new BitSet(new long[]{0x0200000020040000L});
	public static final BitSet FOLLOW_data_manipulation_language_in_sqlplus_alert163 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_IN_in_sqlplus_alert165 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_table_reference_in_sqlplus_alert167 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_where_clause_in_sqlplus_alert169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_sqlplus_list_alert203 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ALERTS_in_sqlplus_list_alert205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_data_manipulation_statements_in_sql_statement233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_statement_in_sql_statement240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_database_in_use_statement263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_use_database286 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_schema_name_in_use_database294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_statement_in_data_manipulation_statements319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_statements_in_data_manipulation_statements331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_update_statements_in_data_manipulation_statements343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_expression_in_select_statement369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_statement1_in_insert_statements400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_table_update_statement_in_update_statements426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select_expression449 = new BitSet(new long[]{0x0000000004000800L});
	public static final BitSet FOLLOW_select_list_in_select_expression451 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_FROM_in_select_expression453 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_table_references_in_select_expression456 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_where_clause_in_select_expression459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_header_in_insert_statement1489 = new BitSet(new long[]{0x0800000200000000L});
	public static final BitSet FOLLOW_column_list_in_insert_statement1497 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_value_list_clause_in_insert_statement1501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UPDATE_in_single_table_update_statement524 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_table_reference_in_single_table_update_statement526 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_set_columns_clause_in_single_table_update_statement528 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_where_clause_in_single_table_update_statement531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_displayed_column_in_select_list560 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_COMMA_in_select_list571 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_displayed_column_in_select_list577 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_ASTERISK_in_select_list590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_displayed_column616 = new BitSet(new long[]{0x0000000004000402L});
	public static final BitSet FOLLOW_alias_in_displayed_column619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_references648 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_COMMA_in_table_references659 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_table_reference_in_table_references668 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_table_atom_in_table_reference699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insert_header730 = new BitSet(new long[]{0x0000000084000000L});
	public static final BitSet FOLLOW_INTO_in_insert_header733 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_table_spec_in_insert_header737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALUES_in_value_list_clause771 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_column_value_list_in_value_list_clause785 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_COMMA_in_value_list_clause811 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_column_value_list_in_value_list_clause829 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_column_value_list874 = new BitSet(new long[]{0x0040904044000000L});
	public static final BitSet FOLLOW_bit_expr_in_column_value_list888 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_COMMA_in_column_value_list914 = new BitSet(new long[]{0x0040904044000000L});
	public static final BitSet FOLLOW_bit_expr_in_column_value_list932 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_column_value_list955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set_columns_clause987 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_set_column_clause_in_set_columns_clause1001 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_COMMA_in_set_columns_clause1027 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_set_column_clause_in_set_columns_clause1045 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_column_spec_in_set_column_clause1088 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_EQUAL_in_set_column_clause1090 = new BitSet(new long[]{0x0040914044020000L});
	public static final BitSet FOLLOW_expression_in_set_column_clause1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_set_column_clause1136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_where_clause1180 = new BitSet(new long[]{0x0040914044000000L});
	public static final BitSet FOLLOW_expression_in_where_clause1182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_spec_in_table_atom1211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_table_spec1238 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DOT_in_table_spec1240 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_table_name_in_table_spec1244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_column_list1272 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_column_spec_in_column_list1283 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_COMMA_in_column_list1309 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_column_spec_in_column_list1327 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_column_list1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_column_spec1378 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DOT_in_column_spec1380 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_table_name_in_column_spec1384 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DOT_in_column_spec1386 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_column_name_in_column_spec1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_subquery1408 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_select_statement_in_subquery1410 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_subquery1412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_factor1_in_expression1448 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_OR_in_expression1474 = new BitSet(new long[]{0x0040914044000000L});
	public static final BitSet FOLLOW_expr_factor1_in_expression1480 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_expr_factor2_in_expr_factor11529 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_XOR_in_expr_factor11555 = new BitSet(new long[]{0x0040914044000000L});
	public static final BitSet FOLLOW_expr_factor2_in_expr_factor11561 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_expr_factor3_in_expr_factor21610 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_AND_in_expr_factor21636 = new BitSet(new long[]{0x0040914044000000L});
	public static final BitSet FOLLOW_expr_factor3_in_expr_factor21642 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_NOT_in_expr_factor31688 = new BitSet(new long[]{0x0040914044000000L});
	public static final BitSet FOLLOW_expr_factor4_in_expr_factor31692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_primary_in_expr_factor41726 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_IS_in_expr_factor41730 = new BitSet(new long[]{0x0080050000400000L});
	public static final BitSet FOLLOW_NOT_in_expr_factor41733 = new BitSet(new long[]{0x0080040000400000L});
	public static final BitSet FOLLOW_boolean_literal_in_expr_factor41738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_expr_factor41742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1784 = new BitSet(new long[]{0x0000020C03100000L});
	public static final BitSet FOLLOW_relational_op_in_bool_primary1794 = new BitSet(new long[]{0x0040904044000000L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1820 = new BitSet(new long[]{0x0000020C03100000L});
	public static final BitSet FOLLOW_relational_op_in_bool_primary1822 = new BitSet(new long[]{0x0000000200000280L});
	public static final BitSet FOLLOW_subquery_in_bool_primary1835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_bool_primary1845 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_EXISTS_in_bool_primary1847 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_subquery_in_bool_primary1849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_bool_primary1859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bit_expr_in_predicate1891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_expr_in_bit_expr1925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_value_in_simple_expr1959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_simple_expr1971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_literal_value2004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_literal_in_literal_value2016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_STRING_in_string_literal2120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_NUMBER_in_number_literal2183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REAL_NUMBER_in_number_literal2209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_alias2343 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_alias2347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name2354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partition_name2361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_schema_name2368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name2375 = new BitSet(new long[]{0x0000000000000002L});
}
