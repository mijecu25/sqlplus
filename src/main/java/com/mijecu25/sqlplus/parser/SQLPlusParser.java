// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlus.g 2016-04-27 13:32:59

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
		"BEFORE", "COLON", "COMMA", "DASH", "DATABASES", "DELETE", "DOT", "EQUAL", 
		"FROM", "GREATER_THAN", "GREATER_THAN_EQUAL", "ID", "IF", "IN", "INSERT", 
		"LEFT_PARENTHESIS", "LESS_THAN", "LESS_THAN_EQUAL", "LIKE", "NEWLINE", 
		"NOT_EQUAL", "QUESTION_MARK", "QUOTE", "RIGHT_PARENTHESIS", "SELECT", 
		"SEMICOLON", "SHOW", "UNDERSCORE", "UPDATE", "USE", "WHERE", "WS"
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
	public static final int UNDERSCORE=35;
	public static final int UPDATE=36;
	public static final int USE=37;
	public static final int WHERE=38;
	public static final int WS=39;

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
			if ( (LA1_0==SHOW||LA1_0==USE) ) {
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
	// src/main/sqlplus/parser/SQLPlus.g:33:1: sql_statement returns [Statement sqlStatement] : ( show_statement | use_statement );
	public final Statement sql_statement() throws RecognitionException {
		Statement sqlStatement = null;


		Statement show_statement2 =null;
		Statement use_statement3 =null;


				sqlStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:37:2: ( show_statement | use_statement )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SHOW) ) {
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
					// src/main/sqlplus/parser/SQLPlus.g:38:8: show_statement
					{
					pushFollow(FOLLOW_show_statement_in_sql_statement108);
					show_statement2=show_statement();
					state._fsp--;


								sqlStatement = show_statement2;
							
					}
					break;
				case 2 :
					// src/main/sqlplus/parser/SQLPlus.g:41:4: use_statement
					{
					pushFollow(FOLLOW_use_statement_in_sql_statement115);
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
			pushFollow(FOLLOW_use_database_in_use_statement139);
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
			match(input,USE,FOLLOW_USE_in_use_database163); 
			pushFollow(FOLLOW_schema_name_in_use_database172);
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
	// src/main/sqlplus/parser/SQLPlus.g:65:1: show_statement returns [Statement showStatement] : show_databases ;
	public final Statement show_statement() throws RecognitionException {
		Statement showStatement = null;


		Statement show_databases5 =null;


				showStatement = null;
			
		try {
			// src/main/sqlplus/parser/SQLPlus.g:69:2: ( show_databases )
			// src/main/sqlplus/parser/SQLPlus.g:69:4: show_databases
			{
			pushFollow(FOLLOW_show_databases_in_show_statement196);
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
			match(input,SHOW,FOLLOW_SHOW_in_show_databases223); 
			match(input,DATABASES,FOLLOW_DATABASES_in_show_databases225); 
			 
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



	// $ANTLR start "alias"
	// src/main/sqlplus/parser/SQLPlus.g:174:1: alias : ( AS )? ID ;
	public final void alias() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:174:7: ( ( AS )? ID )
			// src/main/sqlplus/parser/SQLPlus.g:174:9: ( AS )? ID
			{
			// src/main/sqlplus/parser/SQLPlus.g:174:9: ( AS )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==AS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// src/main/sqlplus/parser/SQLPlus.g:174:10: AS
					{
					match(input,AS,FOLLOW_AS_in_alias329); 
					}
					break;

			}

			match(input,ID,FOLLOW_ID_in_alias333); 
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
			match(input,ID,FOLLOW_ID_in_column_name340); 
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
			match(input,ID,FOLLOW_ID_in_partition_name347); 
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
			match(input,ID,FOLLOW_ID_in_schema_name354); 
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
			match(input,ID,FOLLOW_ID_in_table_name361); 
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
	public static final BitSet FOLLOW_timing_in_sqlplus_alert60 = new BitSet(new long[]{0x0000001000402000L});
	public static final BitSet FOLLOW_data_manipulation_language_in_sqlplus_alert62 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IN_in_sqlplus_alert64 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert66 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IF_in_sqlplus_alert68 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert70 = new BitSet(new long[]{0x0000000017068000L});
	public static final BitSet FOLLOW_relational_operation_in_sqlplus_alert72 = new BitSet(new long[]{0x0000000020080000L});
	public static final BitSet FOLLOW_match_value_in_sqlplus_alert74 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus_alert76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_statement_in_sql_statement108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_statement_in_sql_statement115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_database_in_use_statement139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_use_database163 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_schema_name_in_use_database172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_databases_in_show_statement196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHOW_in_show_databases223 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DATABASES_in_show_databases225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_alias329 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_alias333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partition_name347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_schema_name354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name361 = new BitSet(new long[]{0x0000000000000002L});
}
