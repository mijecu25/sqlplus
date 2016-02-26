package com.mijecu25.sqlplus;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class SQLPlus {

    private static final String EXIT = "exit";
    private static final String QUIT = "quit";
    private static final int    UILENGTH = 80;
    private static final String PROMPT = "sqlplus> ";
    
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner inputScanner = new Scanner(System.in);
        
        // UI intro
        System.out.println(StringUtils.center("", SQLPlus.UILENGTH, '-'));
        System.out.println(StringUtils.center(" Welcome to SQLPlus ", SQLPlus.UILENGTH, '-'));
        System.out.println(StringUtils.center("", SQLPlus.UILENGTH, '-'));
        System.out.println(StringUtils.center(" Type " + SQLPlus.EXIT + " or " + SQLPlus.QUIT + " to exit the application ", SQLPlus.UILENGTH, '-'));
        System.out.println(StringUtils.center("", SQLPlus.UILENGTH, '-'));

        // Execute the input scanner
        while(true) {
            // Get a line from the user until the hit enter (carriage return, line feed/ new line)
            System.out.print(SQLPlus.PROMPT);
            String input = inputScanner.nextLine().trim();
            
            // If the user did not enter anything 
            if(input.isEmpty()) {
                // Continue to the next iteration
                continue;
            }
                        
            // Logic to quit
            if(input.equals(SQLPlus.QUIT) || input.equals(SQLPlus.EXIT)) {
                System.out.println("Bye");
                break;
            }
            
            // TODO this is for test. REMOVE
            System.out.println("You entered: " + input);
        }
        
        // Close the input scanner
        inputScanner.close();
    }
    
}
