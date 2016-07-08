help:
	@grep '^[^#[:space:]].*:' Makefile | sort
	
generate-code:
	java org.antlr.Tool -fo src/main/java/com/mijecu25/sqlplus/parser src/main/sqlplus/parser/SQLPlusLex.g 
	java org.antlr.Tool -fo src/main/java/com/mijecu25/sqlplus/parser src/main/sqlplus/parser/SQLPlus.g
	
run:
	@java -cp "./target/sqlplus-0.1.0-SNAPSHOT-complete.jar:$CLASSPATH" com.mijecu25.sqlplus.SQLPlus 
	
package:
	mvn package -DskipTests=true
