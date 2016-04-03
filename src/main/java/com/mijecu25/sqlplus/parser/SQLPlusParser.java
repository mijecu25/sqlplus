// $ANTLR 3.5.2 src/main/sqlplus/parser/SQLPlus.g 2016-04-03 14:01:11

	package com.mijecu25.sqlplus.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SQLPlusParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFTER", "ALERT", "BEFORE", "COLON", 
		"DASH", "DELETE", "EQUAL", "GREATER_THAN", "GREATER_THAN_EQUAL", "ID", 
		"IF", "IN", "INSERT", "LESS_THAN", "LESS_THAN_EQUAL", "LIKE", "NEWLINE", 
		"NOT_EQ", "QUESTION_MARK", "QUOTE", "SEMICOLON", "UNDERSCORE", "UPDATE", 
		"WHERE", "WS"
	};
	public static final int EOF=-1;
	public static final int AFTER=4;
	public static final int ALERT=5;
	public static final int BEFORE=6;
	public static final int COLON=7;
	public static final int DASH=8;
	public static final int DELETE=9;
	public static final int EQUAL=10;
	public static final int GREATER_THAN=11;
	public static final int GREATER_THAN_EQUAL=12;
	public static final int ID=13;
	public static final int IF=14;
	public static final int IN=15;
	public static final int INSERT=16;
	public static final int LESS_THAN=17;
	public static final int LESS_THAN_EQUAL=18;
	public static final int LIKE=19;
	public static final int NEWLINE=20;
	public static final int NOT_EQ=21;
	public static final int QUESTION_MARK=22;
	public static final int QUOTE=23;
	public static final int SEMICOLON=24;
	public static final int UNDERSCORE=25;
	public static final int UPDATE=26;
	public static final int WHERE=27;
	public static final int WS=28;

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



	// $ANTLR start "sqlplus_alert"
	// src/main/sqlplus/parser/SQLPlus.g:10:1: sqlplus_alert : ( ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON ) ;
	public final void sqlplus_alert() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:14:2: ( ( ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON ) )
			// src/main/sqlplus/parser/SQLPlus.g:14:4: ( ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON )
			{
			// src/main/sqlplus/parser/SQLPlus.g:14:4: ( ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON )
			// src/main/sqlplus/parser/SQLPlus.g:14:5: ALERT timing data_manipulation_language IN ID IF ID relational_operation match_value SEMICOLON
			{
			match(input,ALERT,FOLLOW_ALERT_in_sqlplus_alert30); 
			pushFollow(FOLLOW_timing_in_sqlplus_alert32);
			timing();
			state._fsp--;

			pushFollow(FOLLOW_data_manipulation_language_in_sqlplus_alert34);
			data_manipulation_language();
			state._fsp--;

			match(input,IN,FOLLOW_IN_in_sqlplus_alert36); 
			match(input,ID,FOLLOW_ID_in_sqlplus_alert38); 
			match(input,IF,FOLLOW_IF_in_sqlplus_alert40); 
			match(input,ID,FOLLOW_ID_in_sqlplus_alert42); 
			pushFollow(FOLLOW_relational_operation_in_sqlplus_alert44);
			relational_operation();
			state._fsp--;

			pushFollow(FOLLOW_match_value_in_sqlplus_alert46);
			match_value();
			state._fsp--;

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sqlplus_alert48); 
			 
							System.out.println("Created SQLPlus alert"); 
						
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
	// $ANTLR end "sqlplus_alert"



	// $ANTLR start "timing"
	// src/main/sqlplus/parser/SQLPlus.g:22:1: timing : ( BEFORE | AFTER );
	public final void timing() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:23:2: ( BEFORE | AFTER )
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
	// src/main/sqlplus/parser/SQLPlus.g:28:1: data_manipulation_language : ( INSERT | DELETE | UPDATE );
	public final void data_manipulation_language() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:29:2: ( INSERT | DELETE | UPDATE )
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
	// src/main/sqlplus/parser/SQLPlus.g:34:1: relational_operation : ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | LESS_THAN | GREATER_THAN | LIKE );
	public final void relational_operation() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:35:2: ( EQUAL | LESS_THAN_EQUAL | GREATER_THAN_EQUAL | LESS_THAN | GREATER_THAN | LIKE )
			// src/main/sqlplus/parser/SQLPlus.g:
			{
			if ( (input.LA(1) >= EQUAL && input.LA(1) <= GREATER_THAN_EQUAL)||(input.LA(1) >= LESS_THAN && input.LA(1) <= LIKE) ) {
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
	// src/main/sqlplus/parser/SQLPlus.g:43:1: match_value : ( ID | QUESTION_MARK );
	public final void match_value() throws RecognitionException {
		try {
			// src/main/sqlplus/parser/SQLPlus.g:44:2: ( ID | QUESTION_MARK )
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



	public static final BitSet FOLLOW_ALERT_in_sqlplus_alert30 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_timing_in_sqlplus_alert32 = new BitSet(new long[]{0x0000000004010200L});
	public static final BitSet FOLLOW_data_manipulation_language_in_sqlplus_alert34 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_sqlplus_alert36 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert38 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IF_in_sqlplus_alert40 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_sqlplus_alert42 = new BitSet(new long[]{0x00000000000E1C00L});
	public static final BitSet FOLLOW_relational_operation_in_sqlplus_alert44 = new BitSet(new long[]{0x0000000000402000L});
	public static final BitSet FOLLOW_match_value_in_sqlplus_alert46 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sqlplus_alert48 = new BitSet(new long[]{0x0000000000000002L});
}
