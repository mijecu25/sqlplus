// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlus.g 2016-06-14 18:49:45

	package com.mijecu25.sqlplus.parser;

	import com.mijecu25.sqlplus.compiler.core.statement.Statement;
	import com.mijecu25.sqlplus.compiler.core.statement.StatementShowDatabases;
	import com.mijecu25.sqlplus.compiler.core.statement.StatementUseDatabase;
	import com.mijecu25.sqlplus.compiler.core.statement.StatementShowTables;
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
	// src/main/sqlplus/parser/SQLPlus.g:37:1: sqlplus returns [Statement statement] : ( sql_statement SEMICOLON | sqlplus_alert );
	public final Statement sqlplus() throws RecognitionException {
		Statement statement = null;


		Statement sql_statement1 =null;


				statement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:41:2: ( sql_statement SEMICOLON | sqlplus_alert )
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
					// src/main/sqlplus/parser/SQLPlus.g:41:5: sql_statement SEMICOLON
					{
					pushFollow(FOLLOW_sql_statement_in_sqlplus47);
					sql_statement1=sql_statement();
					state._fsp--;

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sqlplus49); 

								statement = sql_statement1;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:45:4: sqlplus_alert
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
	// src/main/sqlplus/parser/SQLPlus.g:49:1: sqlplus_alert : ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON ;
	public final void sqlplus_alert() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:50:2: ( ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON )
			// src/main/sqlplus/parser/SQLPlus.g:50:4: ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON
			{
			match(input,ALERT,FOLLOW_ALERT_in_sqlplus_alert72); 
			pushFollow(FOLLOW_timing_in_sqlplus_alert74);
			timing();
			state._fsp--;

			pushFollow(FOLLOW_data_manipulation_language_in_sqlplus_alert76);
			data_manipulation_language();
			state._fsp--;

			match(input,IN,FOLLOW_IN_in_sqlplus_alert78); 
			match(input,ID,FOLLOW_ID_in_sqlplus_alert80); 
			match(input,IF,FOLLOW_IF_in_sqlplus_alert82); 
			match(input,ID,FOLLOW_ID_in_sqlplus_alert84); 
			pushFollow(FOLLOW_relational_operation_in_sqlplus_alert86);
			relational_operation();
			state._fsp--;

			pushFollow(FOLLOW_match_value_in_sqlplus_alert88);
			match_value();
			state._fsp--;

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sqlplus_alert90); 
			 
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
	// src/main/sqlplus/parser/SQLPlus.g:56:1: sql_statement returns [Statement sqlStatement] : ( select_statement | show_statement | use_statement );
	public final Statement sql_statement() throws RecognitionException {
		Statement sqlStatement = null;


		Statement select_statement2 =null;
		Statement show_statement3 =null;
		Statement use_statement4 =null;


				sqlStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:60:2: ( select_statement | show_statement | use_statement )
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
					// src/main/sqlplus/parser/SQLPlus.g:60:4: select_statement
					{
					pushFollow(FOLLOW_select_statement_in_sql_statement118);
					select_statement2=select_statement();
					state._fsp--;


								sqlStatement = select_statement2;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:63:4: show_statement
					{
					pushFollow(FOLLOW_show_statement_in_sql_statement125);
					show_statement3=show_statement();
					state._fsp--;


								sqlStatement = show_statement3;
							
					}
					break;
				case 3 :
					// src/main/sqlplus/parser/SQLPlus.g:66:4: use_statement
					{
					pushFollow(FOLLOW_use_statement_in_sql_statement132);
					use_statement4=use_statement();
					state._fsp--;


								sqlStatement = use_statement4;
							
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
	// src/main/sqlplus/parser/SQLPlus.g:71:1: use_statement returns [Statement useStatement] : use_database ;
	public final Statement use_statement() throws RecognitionException {
		Statement useStatement = null;


		Statement use_database5 =null;


				useStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:75:2: ( use_database )
			// src/main/sqlplus/parser/SQLPlus.g:75:4: use_database
			{
			pushFollow(FOLLOW_use_database_in_use_statement156);
			use_database5=use_database();
			state._fsp--;


						useStatement = use_database5;
					
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
	// src/main/sqlplus/parser/SQLPlus.g:80:1: use_database returns [Statement useDatabaseStatement] : USE database= schema_name ;
	public final Statement use_database() throws RecognitionException {
		Statement useDatabaseStatement = null;


		ParserRuleReturnScope database =null;


				useDatabaseStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:84:2: ( USE database= schema_name )
			// src/main/sqlplus/parser/SQLPlus.g:84:4: USE database= schema_name
			{
			match(input,USE,FOLLOW_USE_in_use_database180); 
			pushFollow(FOLLOW_schema_name_in_use_database189);
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



	// $ANTLR start "show_statement"
	// src/main/sqlplus/parser/SQLPlus.g:90:1: show_statement returns [Statement showStatement] : ( show_databases | show_tables );
	public final Statement show_statement() throws RecognitionException {
		Statement showStatement = null;


		Statement show_databases6 =null;
		Statement show_tables7 =null;


				showStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:94:2: ( show_databases | show_tables )
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
					// src/main/sqlplus/parser/SQLPlus.g:94:4: show_databases
					{
					pushFollow(FOLLOW_show_databases_in_show_statement213);
					show_databases6=show_databases();
					state._fsp--;

					 
								showStatement = show_databases6;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:97:4: show_tables
					{
					pushFollow(FOLLOW_show_tables_in_show_statement220);
					show_tables7=show_tables();
					state._fsp--;


								showStatement = show_tables7;
						
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
		return showStatement;
	}
	// $ANTLR end "show_statement"



	// $ANTLR start "show_tables"
	// src/main/sqlplus/parser/SQLPlus.g:102:1: show_tables returns [Statement showTablesStatement] : SHOW TABLES ;
	public final Statement show_tables() throws RecognitionException {
		Statement showTablesStatement = null;



				showTablesStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:106:2: ( SHOW TABLES )
			// src/main/sqlplus/parser/SQLPlus.g:106:4: SHOW TABLES
			{
			match(input,SHOW,FOLLOW_SHOW_in_show_tables243); 
			match(input,TABLES,FOLLOW_TABLES_in_show_tables245); 

						showTablesStatement = new StatementShowTables();
				
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return showTablesStatement;
	}
	// $ANTLR end "show_tables"



	// $ANTLR start "show_databases"
	// src/main/sqlplus/parser/SQLPlus.g:111:1: show_databases returns [Statement showDatabasesStatement] : SHOW DATABASES ;
	public final Statement show_databases() throws RecognitionException {
		Statement showDatabasesStatement = null;



				showDatabasesStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:115:2: ( SHOW DATABASES )
			// src/main/sqlplus/parser/SQLPlus.g:115:4: SHOW DATABASES
			{
			match(input,SHOW,FOLLOW_SHOW_in_show_databases269); 
			match(input,DATABASES,FOLLOW_DATABASES_in_show_databases271); 
			 
						showDatabasesStatement = new StatementShowDatabases(); 
					
			}

		}

			catch (RecognitionException re) {
				throw re;
			}

		finally {
			// do for sure before leaving
		}
		return showDatabasesStatement;
	}
	// $ANTLR end "show_databases"



	// $ANTLR start "select_statement"
	// src/main/sqlplus/parser/SQLPlus.g:120:1: select_statement returns [Statement selectStatement] : select_expression ;
	public final Statement select_statement() throws RecognitionException {
		Statement selectStatement = null;


		Statement select_expression8 =null;


				selectStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:124:2: ( select_expression )
			// src/main/sqlplus/parser/SQLPlus.g:124:4: select_expression
			{
			pushFollow(FOLLOW_select_expression_in_select_statement294);
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



	// $ANTLR start "select_expression"
	// src/main/sqlplus/parser/SQLPlus.g:129:1: select_expression returns [Statement selectExpression] : SELECT select_list FROM table_references ;
	public final Statement select_expression() throws RecognitionException {
		Statement selectExpression = null;


		List<String> select_list9 =null;
		List<String> table_references10 =null;


				selectExpression = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:134:2: ( SELECT select_list FROM table_references )
			// src/main/sqlplus/parser/SQLPlus.g:134:4: SELECT select_list FROM table_references
			{
			match(input,SELECT,FOLLOW_SELECT_in_select_expression319); 
			pushFollow(FOLLOW_select_list_in_select_expression321);
			select_list9=select_list();
			state._fsp--;

			match(input,FROM,FOLLOW_FROM_in_select_expression323); 
			pushFollow(FOLLOW_table_references_in_select_expression325);
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



	// $ANTLR start "select_list"
	// src/main/sqlplus/parser/SQLPlus.g:139:1: select_list returns [List<String> selectList] : (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK );
	public final List<String> select_list() throws RecognitionException {
		List<String> selectList = null;


		Token ASTERISK11=null;
		ParserRuleReturnScope column =null;


				selectList = new ArrayList<String>();
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:143:2: (column= displayed_column ( COMMA column= displayed_column )* | ASTERISK )
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
					// src/main/sqlplus/parser/SQLPlus.g:143:4: column= displayed_column ( COMMA column= displayed_column )*
					{
					pushFollow(FOLLOW_displayed_column_in_select_list352);
					column=displayed_column();
					state._fsp--;


						 		selectList.add((column!=null?input.toString(column.start,column.stop):null));
							
					// src/main/sqlplus/parser/SQLPlus.g:146:3: ( COMMA column= displayed_column )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMA) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:147:4: COMMA column= displayed_column
							{
							match(input,COMMA,FOLLOW_COMMA_in_select_list363); 
							pushFollow(FOLLOW_displayed_column_in_select_list369);
							column=displayed_column();
							state._fsp--;


											selectList.add((column!=null?input.toString(column.start,column.stop):null));
										
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:151:5: ASTERISK
					{
					ASTERISK11=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_select_list382); 

								selectList.add((ASTERISK11!=null?ASTERISK11.getText():null));
							
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
	// src/main/sqlplus/parser/SQLPlus.g:156:1: displayed_column : column_spec ( alias )? ;
	public final SQLPlusParser.displayed_column_return displayed_column() throws RecognitionException {
		SQLPlusParser.displayed_column_return retval = new SQLPlusParser.displayed_column_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:157:2: ( column_spec ( alias )? )
			// src/main/sqlplus/parser/SQLPlus.g:157:4: column_spec ( alias )?
			{
			pushFollow(FOLLOW_column_spec_in_displayed_column395);
			column_spec();
			state._fsp--;

			// src/main/sqlplus/parser/SQLPlus.g:157:16: ( alias )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==AS||LA6_0==ID) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:157:17: alias
					{
					pushFollow(FOLLOW_alias_in_displayed_column398);
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
	// src/main/sqlplus/parser/SQLPlus.g:160:1: table_references returns [List<String> tableReferences] : table= table_reference ( COMMA table= table_reference )* ;
	public final List<String> table_references() throws RecognitionException {
		List<String> tableReferences = null;


		ParserRuleReturnScope table =null;


				tableReferences = new ArrayList<String>();
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:164:2: (table= table_reference ( COMMA table= table_reference )* )
			// src/main/sqlplus/parser/SQLPlus.g:164:4: table= table_reference ( COMMA table= table_reference )*
			{
			pushFollow(FOLLOW_table_reference_in_table_references425);
			table=table_reference();
			state._fsp--;


						tableReferences.add((table!=null?input.toString(table.start,table.stop):null));
					
			// src/main/sqlplus/parser/SQLPlus.g:167:3: ( COMMA table= table_reference )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:168:4: COMMA table= table_reference
					{
					match(input,COMMA,FOLLOW_COMMA_in_table_references436); 
					pushFollow(FOLLOW_table_reference_in_table_references442);
					table=table_reference();
					state._fsp--;


									tableReferences.add((table!=null?input.toString(table.start,table.stop):null));
								
					}
					break;

				default :
					break loop7;
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
	// src/main/sqlplus/parser/SQLPlus.g:174:1: table_reference : table_atom ;
	public final SQLPlusParser.table_reference_return table_reference() throws RecognitionException {
		SQLPlusParser.table_reference_return retval = new SQLPlusParser.table_reference_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:175:2: ( table_atom )
			// src/main/sqlplus/parser/SQLPlus.g:175:4: table_atom
			{
			pushFollow(FOLLOW_table_atom_in_table_reference460);
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



	// $ANTLR start "table_atom"
	// src/main/sqlplus/parser/SQLPlus.g:194:1: table_atom : table_spec ;
	public final void table_atom() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:195:2: ( table_spec )
			// src/main/sqlplus/parser/SQLPlus.g:195:4: table_spec
			{
			pushFollow(FOLLOW_table_spec_in_table_atom487);
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



	// $ANTLR start "table_spec"
	// src/main/sqlplus/parser/SQLPlus.g:223:1: table_spec : ( schema_name DOT )? table_name ;
	public final void table_spec() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:224:2: ( ( schema_name DOT )? table_name )
			// src/main/sqlplus/parser/SQLPlus.g:224:4: ( schema_name DOT )? table_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:224:4: ( schema_name DOT )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==DOT) ) {
					alt8=1;
				}
			}
			switch (alt8) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:224:5: schema_name DOT
					{
					pushFollow(FOLLOW_schema_name_in_table_spec524);
					schema_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_table_spec526); 
					}
					break;

			}

			pushFollow(FOLLOW_table_name_in_table_spec530);
			table_name();
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
	// $ANTLR end "table_spec"



	// $ANTLR start "column_spec"
	// src/main/sqlplus/parser/SQLPlus.g:227:1: column_spec : ( ( schema_name DOT )? table_name DOT )? column_name ;
	public final void column_spec() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:228:2: ( ( ( schema_name DOT )? table_name DOT )? column_name )
			// src/main/sqlplus/parser/SQLPlus.g:228:4: ( ( schema_name DOT )? table_name DOT )? column_name
			{
			// src/main/sqlplus/parser/SQLPlus.g:228:4: ( ( schema_name DOT )? table_name DOT )?
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
					// src/main/sqlplus/parser/SQLPlus.g:228:5: ( schema_name DOT )? table_name DOT
					{
					// src/main/sqlplus/parser/SQLPlus.g:228:5: ( schema_name DOT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==ID) ) {
						int LA9_1 = input.LA(2);
						if ( (LA9_1==DOT) ) {
							int LA9_2 = input.LA(3);
							if ( (LA9_2==ID) ) {
								int LA9_3 = input.LA(4);
								if ( (LA9_3==DOT) ) {
									alt9=1;
								}
							}
						}
					}
					switch (alt9) {
						case 1 :
							// src/main/sqlplus/parser/SQLPlus.g:228:6: schema_name DOT
							{
							pushFollow(FOLLOW_schema_name_in_column_spec543);
							schema_name();
							state._fsp--;

							match(input,DOT,FOLLOW_DOT_in_column_spec545); 
							}
							break;

					}

					pushFollow(FOLLOW_table_name_in_column_spec549);
					table_name();
					state._fsp--;

					match(input,DOT,FOLLOW_DOT_in_column_spec551); 
					}
					break;

			}

			pushFollow(FOLLOW_column_name_in_column_spec555);
			column_name();
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
	// $ANTLR end "column_spec"



	// $ANTLR start "alias"
	// src/main/sqlplus/parser/SQLPlus.g:239:1: alias : ( AS )? ID ;
	public final void alias() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:239:7: ( ( AS )? ID )
			// src/main/sqlplus/parser/SQLPlus.g:239:9: ( AS )? ID
			{
			// src/main/sqlplus/parser/SQLPlus.g:239:9: ( AS )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==AS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:239:10: AS
					{
					match(input,AS,FOLLOW_AS_in_alias574); 
					}
					break;

			}

			match(input,ID,FOLLOW_ID_in_alias578); 
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
	// src/main/sqlplus/parser/SQLPlus.g:240:1: column_name : ID ;
	public final void column_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:240:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:240:15: ID
			{
			match(input,ID,FOLLOW_ID_in_column_name585); 
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
	// src/main/sqlplus/parser/SQLPlus.g:241:1: partition_name : ID ;
	public final void partition_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:241:16: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:241:18: ID
			{
			match(input,ID,FOLLOW_ID_in_partition_name592); 
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
	// src/main/sqlplus/parser/SQLPlus.g:242:1: schema_name : ID ;
	public final SQLPlusParser.schema_name_return schema_name() throws RecognitionException {
		SQLPlusParser.schema_name_return retval = new SQLPlusParser.schema_name_return();
		retval.start = input.LT(1);

		try {
			// src/main/sqlplus/parser/SQLPlus.g:242:13: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:242:15: ID
			{
			match(input,ID,FOLLOW_ID_in_schema_name599); 
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
	// src/main/sqlplus/parser/SQLPlus.g:243:1: table_name : ID ;
	public final void table_name() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:243:12: ( ID )
			// src/main/sqlplus/parser/SQLPlus.g:243:14: ID
			{
			match(input,ID,FOLLOW_ID_in_table_name606); 
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
	// src/main/sqlplus/parser/SQLPlus.g:245:1: timing : ( BEFORE | AFTER );
	public final void timing() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:246:2: ( BEFORE | AFTER )
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
	// src/main/sqlplus/parser/SQLPlus.g:250:1: data_manipulation_language : ( INSERT | DELETE | UPDATE );
	public final void data_manipulation_language() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:251:2: ( INSERT | DELETE | UPDATE )
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
	// src/main/sqlplus/parser/SQLPlus.g:256:1: relational_operation : ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE );
	public final void relational_operation() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:257:2: ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | NOT_EQUAL | LESS_THAN | GREATER_THAN | LIKE )
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
	// src/main/sqlplus/parser/SQLPlus.g:266:1: match_value : ( ID | QUESTION_MARK );
	public final void match_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:267:2: ( ID | QUESTION_MARK )
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



	public static final BitSet FOLLOW_sql_statement_in_sqlplus47 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sqlplus_alert_in_sqlplus59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALERT_in_sqlplus_alert72 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_timing_in_sqlplus_alert74 = new BitSet(new long[]{0x0000002000402000L});
	public static final BitSet FOLLOW_data_manipulation_language_in_sqlplus_alert76 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IN_in_sqlplus_alert78 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert80 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IF_in_sqlplus_alert82 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert84 = new BitSet(new long[]{0x0000000017068000L});
	public static final BitSet FOLLOW_relational_operation_in_sqlplus_alert86 = new BitSet(new long[]{0x0000000020080000L});
	public static final BitSet FOLLOW_match_value_in_sqlplus_alert88 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus_alert90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_statement_in_sql_statement118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_statement_in_sql_statement125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_statement_in_sql_statement132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_database_in_use_statement156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_use_database180 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_schema_name_in_use_database189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_databases_in_show_statement213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_tables_in_show_statement220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHOW_in_show_tables243 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_TABLES_in_show_tables245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHOW_in_show_databases269 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DATABASES_in_show_databases271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_expression_in_select_statement294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select_expression319 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_select_list_in_select_expression321 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_FROM_in_select_expression323 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_table_references_in_select_expression325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_displayed_column_in_select_list352 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_select_list363 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_displayed_column_in_select_list369 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ASTERISK_in_select_list382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_spec_in_displayed_column395 = new BitSet(new long[]{0x0000000000080042L});
	public static final BitSet FOLLOW_alias_in_displayed_column398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_reference_in_table_references425 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_table_references436 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_table_reference_in_table_references442 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_table_atom_in_table_reference460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_spec_in_table_atom487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_table_spec524 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DOT_in_table_spec526 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_table_name_in_table_spec530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_schema_name_in_column_spec543 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DOT_in_column_spec545 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_table_name_in_column_spec549 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DOT_in_column_spec551 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_column_name_in_column_spec555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_alias574 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_alias578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partition_name592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_schema_name599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name606 = new BitSet(new long[]{0x0000000000000002L});
}
