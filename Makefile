help: # List all the targets of the Makefile
	@grep '^[^#[:space:]].*:' Makefile | sort
	
generate-code: # Create the parser and lexer for the SQLPlus language
	java org.antlr.Tool -fo src/main/java/com/mijecu25/sqlplus/parser src/main/sqlplus/parser/SQLPlusLex.g 
	java org.antlr.Tool -fo src/main/java/com/mijecu25/sqlplus/parser src/main/sqlplus/parser/SQLPlus.g
	
run: # Execute the SQLPlus client
	@java -cp "./target/sqlplus-0.1.0-SNAPSHOT-complete.jar:$CLASSPATH" com.mijecu25.sqlplus.SQLPlus 
	
package: # Package an executable jar file
	mvn package -DskipTests=true