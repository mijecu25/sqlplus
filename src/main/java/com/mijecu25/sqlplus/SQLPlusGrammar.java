package com.mijecu25.sqlplus;

import java.util.Scanner;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import com.mijecu25.sqlplus.parser.SQLPlusLex;
import com.mijecu25.sqlplus.parser.SQLPlusParser;

/**
 * Test class for the SQLPlus grammar
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
 */
public class SQLPlusGrammar {

    public static void main(String[] args)  {
        Scanner inputScanner = new Scanner(System.in);

        while(true) {
            String line = inputScanner.nextLine().trim();

            if(line.equals("quit")) {
                break;
            }

            ANTLRStringStream input = new ANTLRStringStream(line);
            SQLPlusLex lexer = new SQLPlusLex(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SQLPlusParser parser = new SQLPlusParser(tokens);

            try {
                parser.sqlplus();
            } catch (RecognitionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        


        inputScanner.close();

        System.out.println("DONE");

    }

}
