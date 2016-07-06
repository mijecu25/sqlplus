// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlus.g 2016-07-06 13:35:02

	package com.mijecu25.sqlplus.parser;

	import com.mijecu25.sqlplus.compiler.core.statement.Statement;
	import com.mijecu25.sqlplus.compiler.core.statement.StatementUseDatabase;
	import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementSelectExpression;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SQLPlusParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFTER", "ALERT", "AS", "ASTERISK", 
		"BEFORE", "COLON", "COMMA", "DATABASES", "DELETE", "DOT", "EQUAL", "FROM", 
		"GREATER_THAN", "GREATER_THAN_EQUAL", "ID", "IF", "IN", "INSERT", "INTEGER_NUMBER", 
		"INTO", "LEFT_PARENTHESIS", "LESS_THAN", "LESS_THAN_EQUAL", "LIKE", "MINUS", 
		"NEWLINE", "NOT_EQUAL", "PLUS", "QUESTION_MARK", "QUOTE", "REAL_NUMBER", 
		"RIGHT_PARENTHESIS", "SELECT", "SEMICOLON", "SHOW", "TABLES", "TEXT_STRING", 
		"UNDERSCORE", "UPDATE", "USE", "VALUES", "WHERE", "WS"
	};
	public static final int EOF=-1;
	public static final int AFTER=4;
	public static final int ALERT=5;
	public static final int AS=6;
	public static final int ASTERISK=7;
	public static final int BEFORE=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int DATABASES=11;
	public static final int DELETE=12;
	public static final int DOT=13;
	public static final int EQUAL=14;
	public static final int FROM=15;
	public static final int GREATER_THAN=16;
	public static final int GREATER_THAN_EQUAL=17;
	public static final int ID=18;
	public static final int IF=19;
	public static final int IN=20;
	public static final int INSERT=21;
	public static final int INTEGER_NUMBER=22;
	public static final int INTO=23;
	public static final int LEFT_PARENTHESIS=24;
	public static final int LESS_THAN=25;
	public static final int LESS_THAN_EQUAL=26;
	public static final int LIKE=27;
	public static final int MINUS=28;
	public static final int NEWLINE=29;
	public static final int NOT_EQUAL=30;
	public static final int PLUS=31;
	public static final int QUESTION_MARK=32;
	public static final int QUOTE=33;
	public static final int REAL_NUMBER=34;
	public static final int RIGHT_PARENTHESIS=35;
	public static final int SELECT=36;
	public static final int SEMICOLON=37;
	public static final int SHOW=38;
	public static final int TABLES=39;
	public static final int TEXT_STRING=40;
	public static final int UNDERSCORE=41;
	public static final int UPDATE=42;
	public static final int USE=43;
	public static final int VALUES=44;
	public static final int WHERE=45;
	public static final int WS=46;

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
	// src/main/sqlplus/parser/SQLPlus.g:35:1: sqlplus returns [Statement statement] : ( sql_statement SEMICOLON | sqlplus_alert );
	public final Statement sqlplus() throws RecognitionException {
		Statement statement = null;


		Statement sql_statement1 =null;


				statement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:39:2: ( sql_statement SEMICOLON | sqlplus_alert )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INSERT||LA1_0==SELECT||LA1_0==USE) ) {
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
					// src/main/sqlplus/parser/SQLPlus.g:39:5: sql_statement SEMICOLON
					{
					pushFollow(FOLLOW_sql_statement_in_sqlplus47);
					sql_statement1=sql_statement();
					state._fsp--;

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sqlplus49); 

								statement = sql_statement1;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:43:4: sqlplus_alert
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
	// src/main/sqlplus/parser/SQLPlus.g:47:1: sqlplus_alert : ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON ;
	public final void sqlplus_alert() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:48:2: ( ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON )
			// src/main/sqlplus/parser/SQLPlus.g:48:4: ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON
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
	// src/main/sqlplus/parser/SQLPlus.g:54:1: sql_statement returns [Statement sqlStatement] : ( data_manipulation_statements | use_statement );
	public final Statement sql_statement() throws RecognitionException {
		Statement sqlStatement = null;


		Statement data_manipulation_statements2 =null;
		Statement use_statement3 =null;


				sqlStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:58:2: ( data_manipulation_statements | use_statement )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==INSERT||LA2_0==SELECT) ) {
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
					// src/main/sqlplus/parser/SQLPlus.g:58:6: data_manipulation_statements
					{
					pushFollow(FOLLOW_data_manipulation_statements_in_sql_statement117);
					data_manipulation_statements2=data_manipulation_statements();
					state._fsp--;


						        sqlStatement = data_manipulation_statements2;
						    
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:61:4: use_statement
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
	// src/main/sqlplus/parser/SQLPlus.g:66:1: use_statement returns [Statement useStatement] : use_database ;
	public final Statement use_statement() throws RecognitionException {
		Statement useStatement = null;


		Statement use_database4 =null;


				useStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:70:2: ( use_database )
			// src/main/sqlplus/parser/SQLPlus.g:70:4: use_database
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
	// src/main/sqlplus/parser/SQLPlus.g:75:1: use_database returns [Statement useDatabaseStatement] : USE database= schema_name ;
	public final Statement use_database() throws RecognitionException {
		Statement useDatabaseStatement = null;


		ParserRuleReturnScope database =null;


				useDatabaseStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:79:2: ( USE database= schema_name )
			// src/main/sqlplus/parser/SQLPlus.g:79:4: USE database= schema_name
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
	// src/main/sqlplus/parser/SQLPlus.g:85:1: data_manipulation_statements returns [Statement dataManipulationStatement] : ( select_statement | insert_statements );
	public final Statement data_manipulation_statements() throws RecognitionException {
		Statement dataManipulationStatement = null;


		Statement select_statement5 =null;
		Statement insert_statements6 =null;


			    dataManipulationStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:89:2: ( select_statement | insert_statements )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==SELECT) ) {
				alt3=1;
			}
			else if ( (LA3_0==INSERT) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:89:6: select_statement
					{
					pushFollow(FOLLOW_select_statement_in_data_manipulation_statements203);
					select_statement5=select_statement();
					state._fsp--;


					            dataManipulationStatement = select_statement5;
					        
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:92:9: insert_statements
					{
					pushFollow(FOLLOW_insert_statements_in_data_manipulation_statements215);
					insert_statements6=insert_statements();
					state._fsp--;


					            dataManipulationStatement = insert_statements6;
					        
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
	// src/main/sqlplus/parser/SQLPlus.g:97:1: select_statement returns [Statement selectStatement] : select_expression ;
	public final Statement select_statement() throws RecognitionException {
		Statement selectStatement = null;


		Statement select_expression7 =null;


				selectStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:101:2: ( select_expression )
			// src/main/sqlplus/parser/SQLPlus.g:101:4: select_expression
			{
			pushFollow(FOLLOW_select_expression_in_select_statement241);
			select_expression7=select_expression();
			state._fsp--;


						selectStatement = select_expression7;
					
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
	// src/main/sqlplus/parser/SQLPlus.g:106:1: insert_statements returns [Statement insertStatements] : insert_statement1 ;
	public final Statement insert_statements() throws RecognitionException {
		Statement insertStatements = null;


		Statement insert_statement18 =null;


		        insertStatements = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:110:5: ( insert_statement1 )
			// src/main/sqlplus/parser/SQLPlus.g:110:9: insert_statement1
			{
			pushFollow(FOLLOW_insert_statement1_in_insert_statements272);
			insert_statement18=insert_statement1();
			state._fsp--;


			            insertStatements = insert_statement18;
			        
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



	// $ANTLR start "select_expression"
	// src/main/sqlplus/parser/SQLPlus.g:124:1: select_expression returns [Statement selectExpression] : SELECT select_list FROM table_references ;
	public final Statement select_expression() throws RecognitionException {
		Statement selectExpression = null;


		List<String> select_list9 =null;
		List<String> table_references10 =null;


				selectExpression = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:129:2: ( SELECT select_list FROM table_references )
			// src/main/sqlplus/parser/SQLPlus.g:129:4: SELECT select_list FROM table_references
			{
			match(input,SELECT,FOLLOW_SELECT_in_select_expression303); 
			pushFollow(FOLLOW_select_list_in_select_expression305);
			select_list9=select_list();
			state._fsp--;

			match(input,FROM,FOLLOW_FROM_in_select_expression307); 
			pushFollow(FOLLOW_table_references_in_select_expression309);
			table_references10=table_references();
			state._fsp--;


						selectExpression = new StatementSelectExpression(select_list9, table_references10);
					
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
	// src/main/sqlplus/parser/SQLPlus.g:134:1: insert_statement1 returns [Statement insertStatement1] : insert_header ( column_list )? value_list_clause ;
	public final Statement insert_statement1() throws RecognitionException {
		Statement insertStatement1 = null;


		String insert_header11 =null;
		List<String> column_list12 =null;
		List<List<String>> value_list_clause13 =null;


			    insertStatement1 = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:138:2: ( insert_header ( column_list )? value_list_clause )
			// src/main/sqlplus/parser/SQLPlus.g:138:6: insert_header ( column_list )? value_list_clause
			{
			pushFollow(FOLLOW_insert_header_in_insert_statement1334);
			insert_header11=insert_header();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:139:6: ( column_list )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==LEFT_PARENTHESIS) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:139:7: column_list
					{
					pushFollow(FOLLOW_column_list_in_insert_statement1342);
					column_list12=column_list();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_value_list_clause_in_insert_statement1346);
			value_list_clause13=value_list_clause();
			state._fsp--;


				        System.out.println(insert_header11 + " " + column_list12 + " " + value_list_clause13);
				    
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



	// $ANTLR start "select_list"
	// src/main/sqlplus/parser/SQLPlus.g:153:1: select_list returns [List<String> selectList] : (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK );
	public final List<String> select_list() throws RecognitionException {
		List<String> selectList = null;


		Token ASTERISK14=null;
		ParserRuleReturnScope column =null;


				selectList = new ArrayList<String>();
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:157:2: (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			else if ( (LA6_0==ASTERISK) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:157:4: column= displayed_column ( COMMA column= displayed_column )*
					{
					pushFollow(FOLLOW_displayed_column_in_select_list376);
					column=displayed_column();
					state._fsp--;


						 		selectList.add((column!=null?input.toString(column.start,column.stop):null));
							
					// src/main/sqlplus/parser/SQLPlus.g:160:3: ( COMMA column= displayed_column )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMA) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:161:4: COMMA column= displayed_column
							{
							match(input,COMMA,FOLLOW_COMMA_in_select_list387); 
							pushFollow(FOLLOW_displayed_column_in_select_list393);
							column=displayed_column();
							state._fsp--;


											selectList.add((column!=null?input.toString(column.start,column.stop):null));
										
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:165:5: ASTERISK
					{
					ASTERISK14=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_select_list406); 

								selectList.add((ASTERISK14!=null?ASTERISK14.getText():null));
							
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
	// src/main/sqlplus/parser/SQLPlus.g:170:1: displayed_column : column_spec ( alias )? ;
	public final SQLPlusParser.displayed_column_return displayed_column() throws RecognitionException {
		SQLPlusParser.displayed_column_return retval = new SQLPlusParser.displayed_column_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:171:2: ( column_spec ( alias )? )
			// src/main/sqlplus/parser/SQLPlus.g:171:4: column_spec ( alias )?
			{
			pushFollow(FOLLOW_column_spec_in_displayed_column419);
			column_spec();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:171:16: ( alias )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==AS||LA7_0==ID) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:171:17: alias
					{
					pushFollow(FOLLOW_alias_in_displayed_column422);
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
	// src/main/sqlplus/parser/SQLPlus.g:174:1: table_references returns [List<String> tableReferences] : table= table_reference ( COMMA table= table_reference )* ;
	public final List<String> table_references() throws RecognitionException {
		List<String> tableReferences = null;


		ParserRuleReturnScope table =null;


				tableReferences = new ArrayList<String>();
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:178:2: (table= table_reference ( COMMA table= table_reference )* )
			// src/main/sqlplus/parser/SQLPlus.g:178:4: table= table_reference ( COMMA table= table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_references449);
			table=table_reference();
			state._fsp--;


						tableReferences.add((table!=null?input.toString(table.start,table.stop):null));
					
			// src/main/sqlplus/parser/SQLPlus.g:181:3: ( COMMA table= table_reference )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:182:4: COMMA table= table_reference
					{
					match(input,COMMA,FOLLOW_COMMA_in_table_references460); 
					pushFollow(FOLLOW_table_reference_in_table_references469);
					table=table_reference();
					state._fsp--;


									tableReferences.add((table!=null?input.toString(table.start,table.stop):null));
								
					}
					break;

				default :
					break loop8;
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
	// src/main/sqlplus/parser/SQLPlus.g:189:1: table_reference : table_atom ;
	public final SQLPlusParser.table_reference_return table_reference() throws RecognitionException {
		SQLPlusParser.table_reference_return retval = new SQLPlusParser.table_reference_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:190:2: ( table_atom )
			// src/main/sqlplus/parser/SQLPlus.g:190:4: table_atom
			{
			pushFollow(FOLLOW_table_atom_in_table_reference487);
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
	// src/main/sqlplus/parser/SQLPlus.g:193:1: insert_header returns [String table] : INSERT ( INTO )? table_spec ;
	public final String insert_header() throws RecognitionException {
		String table = null;


		ParserRuleReturnScope table_spec15 =null;


		        table = null;
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:197:5: ( INSERT ( INTO )? table_spec )
			// src/main/sqlplus/parser/SQLPlus.g:197:9: INSERT ( INTO )? table_spec
			{
			match(input,INSERT,FOLLOW_INSERT_in_insert_header516); 
			// src/main/sqlplus/parser/SQLPlus.g:197:16: ( INTO )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==INTO) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:197:17: INTO
					{
					match(input,INTO,FOLLOW_INTO_in_insert_header519); 
					}
					break;

			}

			pushFollow(FOLLOW_table_spec_in_insert_header523);
			table_spec15=table_spec();
			state._fsp--;


			            table = (table_spec15!=null?input.toString(table_spec15.start,table_spec15.stop):null);
			        
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
	// src/main/sqlplus/parser/SQLPlus.g:202:1: value_list_clause returns [List<List<String>> valueListClause] : VALUES value= column_value_list ( COMMA value= column_value_list )* ;
	public final List<List<String>> value_list_clause() throws RecognitionException {
		List<List<String>> valueListClause = null;


		List<String> value =null;


		        valueListClause = new ArrayList<List<String>>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:206:5: ( VALUES value= column_value_list ( COMMA value= column_value_list )* )
			// src/main/sqlplus/parser/SQLPlus.g:206:9: VALUES value= column_value_list ( COMMA value= column_value_list )*
			{
			match(input,VALUES,FOLLOW_VALUES_in_value_list_clause557); 
			pushFollow(FOLLOW_column_value_list_in_value_list_clause571);
			value=column_value_list();
			state._fsp--;


			            valueListClause.add(value);
			        
			// src/main/sqlplus/parser/SQLPlus.g:210:9: ( COMMA value= column_value_list )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:211:13: COMMA value= column_value_list
					{
					match(input,COMMA,FOLLOW_COMMA_in_value_list_clause597); 
					pushFollow(FOLLOW_column_value_list_in_value_list_clause615);
					value=column_value_list();
					state._fsp--;


					                valueListClause.add(value);
					            
					}
					break;

				default :
					break loop10;
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
	// src/main/sqlplus/parser/SQLPlus.g:218:1: column_value_list returns [List<String> columnValueList] : LEFT_PARENTHESIS expression= bit_expr ( COMMA expression= bit_expr )* RIGHT_PARENTHESIS ;
	public final List<String> column_value_list() throws RecognitionException {
		List<String> columnValueList = null;


		ParserRuleReturnScope expression =null;


		        columnValueList = new ArrayList<String>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:222:5: ( LEFT_PARENTHESIS expression= bit_expr ( COMMA expression= bit_expr )* RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:222:9: LEFT_PARENTHESIS expression= bit_expr ( COMMA expression= bit_expr )* RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_column_value_list660); 
			pushFollow(FOLLOW_bit_expr_in_column_value_list674);
			expression=bit_expr();
			state._fsp--;


			            columnValueList.add((expression!=null?input.toString(expression.start,expression.stop):null));
			        
			// src/main/sqlplus/parser/SQLPlus.g:226:9: ( COMMA expression= bit_expr )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==COMMA) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:227:13: COMMA expression= bit_expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_column_value_list700); 
					pushFollow(FOLLOW_bit_expr_in_column_value_list718);
					expression=bit_expr();
					state._fsp--;


					                columnValueList.add((expression!=null?input.toString(expression.start,expression.stop):null));
					            
					}
					break;

				default :
					break loop11;
				}
			}

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_column_value_list733); 
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



	// $ANTLR start "table_atom"
	// src/main/sqlplus/parser/SQLPlus.g:234:1: table_atom : table_spec ;
	public final void table_atom() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:235:2: ( table_spec )
			// src/main/sqlplus/parser/SQLPlus.g:235:4: table_spec
			{
			pushFollow(FOLLOW_table_spec_in_table_atom747);
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
	// src/main/sqlplus/parser/SQLPlus.g:238:1: table_spec : ( schema_name DOT )? table_name ;
	public final SQLPlusParser.table_spec_return table_spec() throws RecognitionException {
		SQLPlusParser.table_spec_return retval = new SQLPlusParser.table_spec_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:239:2: ( ( schema_name DOT )? table_name )
			// src/main/sqlplus/parser/SQLPlus.g:239:4: ( schema_name DOT )? table_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:239:4: ( schema_name DOT )?
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
					// src/main/sqlplus/parser/SQLPlus.g:239:5: schema_name DOT
					{
					pushFollow(FOLLOW_schema_name_in_table_spec759);
					schema_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_table_spec761); 
					}
					break;

			}

			pushFollow(FOLLOW_table_name_in_table_spec765);
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
	// src/main/sqlplus/parser/SQLPlus.g:242:1: column_list returns [List<String> columnList] : LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS ;
	public final List<String> column_list() throws RecognitionException {
		List<String> columnList = null;


		ParserRuleReturnScope column =null;


		        columnList = new ArrayList<String>();
		    
		try {
			// src/main/sqlplus/parser/SQLPlus.g:246:2: ( LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS )
			// src/main/sqlplus/parser/SQLPlus.g:246:6: LEFT_PARENTHESIS column= column_spec ( COMMA column= column_spec )* RIGHT_PARENTHESIS
			{
			match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_column_list791); 
			pushFollow(FOLLOW_column_spec_in_column_list802);
			column=column_spec();
			state._fsp--;


				        columnList.add((column!=null?input.toString(column.start,column.stop):null));
				    
			// src/main/sqlplus/parser/SQLPlus.g:250:9: ( COMMA column= column_spec )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:251:13: COMMA column= column_spec
					{
					match(input,COMMA,FOLLOW_COMMA_in_column_list828); 
					pushFollow(FOLLOW_column_spec_in_column_list846);
					column=column_spec();
					state._fsp--;


					                columnList.add((column!=null?input.toString(column.start,column.stop):null));
					            
					}
					break;

				default :
					break loop13;
				}
			}

			match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_column_list861); 
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
	// src/main/sqlplus/parser/SQLPlus.g:258:1: column_spec : ( ( schema_name DOT )? table_name DOT )? column_name ;
	public final SQLPlusParser.column_spec_return column_spec() throws RecognitionException {
		SQLPlusParser.column_spec_return retval = new SQLPlusParser.column_spec_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:259:2: ( ( ( schema_name DOT )? table_name DOT )? column_name )
			// src/main/sqlplus/parser/SQLPlus.g:259:4: ( ( schema_name DOT )? table_name DOT )? column_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:259:4: ( ( schema_name DOT )? table_name DOT )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==DOT) ) {
					alt15=1;
				}
			}
			switch (alt15) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:259:5: ( schema_name DOT )? table_name DOT
					{
					// src/main/sqlplus/parser/SQLPlus.g:259:5: ( schema_name DOT )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ID) ) {
						int LA14_1 = input.LA(2);
						if ( (LA14_1==DOT) ) {
							int LA14_2 = input.LA(3);
							if ( (LA14_2==ID) ) {
								int LA14_3 = input.LA(4);
								if ( (LA14_3==DOT) ) {
									alt14=1;
								}
							}
						}
					}
					switch (alt14) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:259:6: schema_name DOT
							{
							pushFollow(FOLLOW_schema_name_in_column_spec874);
							schema_name();
							state._fsp--;

							match(input,DOT,FOLLOW_DOT_in_column_spec876); 
							}
							break;

					}

					pushFollow(FOLLOW_table_name_in_column_spec880);
					table_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_column_spec882); 
					}
					break;

			}

			pushFollow(FOLLOW_column_name_in_column_spec886);
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


	public static class bit_expr_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "bit_expr"
	// src/main/sqlplus/parser/SQLPlus.g:262:1: bit_expr : simple_expr ;
	public final SQLPlusParser.bit_expr_return bit_expr() throws RecognitionException {
		SQLPlusParser.bit_expr_return retval = new SQLPlusParser.bit_expr_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:263:5: ( simple_expr )
			// src/main/sqlplus/parser/SQLPlus.g:263:9: simple_expr
			{
			pushFollow(FOLLOW_simple_expr_in_bit_expr902);
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
	// src/main/sqlplus/parser/SQLPlus.g:266:1: simple_expr : ( literal_value | column_spec );
	public final void simple_expr() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:267:5: ( literal_value | column_spec )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==INTEGER_NUMBER||LA16_0==MINUS||LA16_0==PLUS||LA16_0==REAL_NUMBER||LA16_0==TEXT_STRING) ) {
				alt16=1;
			}
			else if ( (LA16_0==ID) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:267:9: literal_value
					{
					pushFollow(FOLLOW_literal_value_in_simple_expr921);
					literal_value();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:268:9: column_spec
					{
					pushFollow(FOLLOW_column_spec_in_simple_expr931);
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
	// src/main/sqlplus/parser/SQLPlus.g:271:1: literal_value : ( string_literal | number_literal );
	public final void literal_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:272:5: ( string_literal | number_literal )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==TEXT_STRING) ) {
				alt17=1;
			}
			else if ( (LA17_0==INTEGER_NUMBER||LA17_0==MINUS||LA17_0==PLUS||LA17_0==REAL_NUMBER) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:272:9: string_literal
					{
					pushFollow(FOLLOW_string_literal_in_literal_value950);
					string_literal();
					state._fsp--;

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:273:9: number_literal
					{
					pushFollow(FOLLOW_number_literal_in_literal_value960);
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



	// $ANTLR start "string_literal"
	// src/main/sqlplus/parser/SQLPlus.g:276:1: string_literal : TEXT_STRING ;
	public final void string_literal() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:276:17: ( TEXT_STRING )
			// src/main/sqlplus/parser/SQLPlus.g:276:21: TEXT_STRING
			{
			match(input,TEXT_STRING,FOLLOW_TEXT_STRING_in_string_literal976); 
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
	// src/main/sqlplus/parser/SQLPlus.g:277:1: number_literal : ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER ) ;
	public final void number_literal() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:277:17: ( ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER ) )
			// src/main/sqlplus/parser/SQLPlus.g:277:19: ( PLUS | MINUS )? ( INTEGER_NUMBER | REAL_NUMBER )
			{
			// src/main/sqlplus/parser/SQLPlus.g:277:19: ( PLUS | MINUS )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==MINUS||LA18_0==PLUS) ) {
				alt18=1;
			}
			switch (alt18) {
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



	// $ANTLR start "alias"
	// src/main/sqlplus/parser/SQLPlus.g:279:1: alias : ( AS )? ID ;
	public final void alias() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:279:7: ( ( AS )? ID )
			// src/main/sqlplus/parser/SQLPlus.g:279:9: ( AS )? ID
			{
			// src/main/sqlplus/parser/SQLPlus.g:279:9: ( AS )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==AS) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:279:10: AS
					{
					match(input,AS,FOLLOW_AS_in_alias1008); 
					}
					break;

			}

			match(input,ID,FOLLOW_ID_in_alias1012); 
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
	// src/main/sqlplus/parser/SQLPlus.g:280:1: column_name : ID ;
	public final void column_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:280:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:280:15: ID
			{
			match(input,ID,FOLLOW_ID_in_column_name1019); 
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
	// src/main/sqlplus/parser/SQLPlus.g:281:1: partition_name : ID ;
	public final void partition_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:281:16: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:281:18: ID
			{
			match(input,ID,FOLLOW_ID_in_partition_name1026); 
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
	// src/main/sqlplus/parser/SQLPlus.g:282:1: schema_name : ID ;
	public final SQLPlusParser.schema_name_return schema_name() throws RecognitionException {
		SQLPlusParser.schema_name_return retval = new SQLPlusParser.schema_name_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:282:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:282:15: ID
			{
			match(input,ID,FOLLOW_ID_in_schema_name1033); 
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
	// src/main/sqlplus/parser/SQLPlus.g:283:1: table_name : ID ;
	public final void table_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:283:12: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:283:14: ID
			{
			match(input,ID,FOLLOW_ID_in_table_name1040); 
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



	// $ANTLR start "timing"
	// src/main/sqlplus/parser/SQLPlus.g:285:1: timing : ( BEFORE | AFTER );
	public final void timing() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:286:2: ( BEFORE | AFTER )
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
	// src/main/sqlplus/parser/SQLPlus.g:290:1: data_manipulation_language : ( INSERT | DELETE | UPDATE );
	public final void data_manipulation_language() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:291:2: ( INSERT | DELETE | UPDATE )
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
	// src/main/sqlplus/parser/SQLPlus.g:296:1: relational_operation : ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE );
	public final void relational_operation() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:297:2: ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE )
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
	// src/main/sqlplus/parser/SQLPlus.g:306:1: match_value : ( ID | QUESTION_MARK );
	public final void match_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:307:2: ( ID | QUESTION_MARK )
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

	// Delegated rules



	public static final BitSet FOLLOW_sql_statement_in_sqlplus47 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sqlplus_alert_in_sqlplus59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALERT_in_sqlplus_alert71 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_timing_in_sqlplus_alert73 = new BitSet(new long[]{0x0000040000201000L});
	public static final BitSet FOLLOW_data_manipulation_language_in_sqlplus_alert75 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IN_in_sqlplus_alert77 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert79 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_IF_in_sqlplus_alert81 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert83 = new BitSet(new long[]{0x000000004E034000L});
	public static final BitSet FOLLOW_relational_operation_in_sqlplus_alert85 = new BitSet(new long[]{0x0000000100040000L});
	public static final BitSet FOLLOW_match_value_in_sqlplus_alert87 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus_alert89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_data_manipulation_statements_in_sql_statement117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_statement_in_sql_statement124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_database_in_use_statement147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_use_database170 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_schema_name_in_use_database178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_statement_in_data_manipulation_statements203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_statements_in_data_manipulation_statements215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_expression_in_select_statement241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_statement1_in_insert_statements272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select_expression303 = new BitSet(new long[]{0x0000000000040080L});
	public static final BitSet FOLLOW_select_list_in_select_expression305 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_FROM_in_select_expression307 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_table_references_in_select_expression309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_header_in_insert_statement1334 = new BitSet(new long[]{0x0000100001000000L});
	public static final BitSet FOLLOW_column_list_in_insert_statement1342 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_value_list_clause_in_insert_statement1346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_displayed_column_in_select_list376 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_select_list387 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_displayed_column_in_select_list393 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ASTERISK_in_select_list406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_displayed_column419 = new BitSet(new long[]{0x0000000000040042L});
	public static final BitSet FOLLOW_alias_in_displayed_column422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_references449 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_table_references460 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_table_reference_in_table_references469 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_table_atom_in_table_reference487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insert_header516 = new BitSet(new long[]{0x0000000000840000L});
	public static final BitSet FOLLOW_INTO_in_insert_header519 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_table_spec_in_insert_header523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALUES_in_value_list_clause557 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_column_value_list_in_value_list_clause571 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_value_list_clause597 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_column_value_list_in_value_list_clause615 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_column_value_list660 = new BitSet(new long[]{0x0000010490440000L});
	public static final BitSet FOLLOW_bit_expr_in_column_value_list674 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_COMMA_in_column_value_list700 = new BitSet(new long[]{0x0000010490440000L});
	public static final BitSet FOLLOW_bit_expr_in_column_value_list718 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_column_value_list733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_spec_in_table_atom747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_table_spec759 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DOT_in_table_spec761 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_table_name_in_table_spec765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_column_list791 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_column_spec_in_column_list802 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_COMMA_in_column_list828 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_column_spec_in_column_list846 = new BitSet(new long[]{0x0000000800000400L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_column_list861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_column_spec874 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DOT_in_column_spec876 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_table_name_in_column_spec880 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DOT_in_column_spec882 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_column_name_in_column_spec886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_expr_in_bit_expr902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_value_in_simple_expr921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_simple_expr931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_literal_value950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_literal_in_literal_value960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_STRING_in_string_literal976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_number_literal993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_alias1008 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ID_in_alias1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name1019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partition_name1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_schema_name1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name1040 = new BitSet(new long[]{0x0000000000000002L});
}
