package com.mijecu25.sqlplus;

import java.io.Console;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.0.2
 *
 */
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
        
        // Get credentials from the user
        SQLPlus.createSQLPlusConnection(inputScanner);
        
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
    
    /**
     * Create an SQLPlusConnection by taking the credentials from the user.
     * 
     * @param inputScanner
     * @return
     */
    public static SQLPlusConnection createSQLPlusConnection(Scanner inputScanner) {
        // TODO use prepared statements
        // Add credentials
        System.out.print(SQLPlus.PROMPT + "Database(default " + SQLPlusConnection.getDefaultDatabase() + "): ");
        String database = inputScanner.nextLine().trim();
      
        System.out.print(SQLPlus.PROMPT + "Port (default " + SQLPlusConnection.getDefaultPort() + "): ");
        String port = inputScanner.nextLine().trim();
        
        System.out.print(SQLPlus.PROMPT + "Username: ");
        String username = inputScanner.nextLine().trim();

        // Insecure method of password entry
//        System.out.print(SQLPlus.PROMPT + "Password: ");
//        String password = inputScanner.nextLine().trim();
        
        // Create a SQLPlusConnection
        SQLPlusConnection sqlPlusConnection = null;

        // Get the console for safe password entry
        Console console = System.console();
        // Read the password without echoing the result
        char[] password = console.readPassword("%s", SQLPlus.PROMPT + "Password:");
        
        // If the password is not null
        if(password != null) {
          // If the database and port are default
          if(database.isEmpty() && port.isEmpty()) {
              sqlPlusConnection = SQLPlusConnection.getConnection(username, new String(password));
          }
          // If the database is empty
          else if(database.isEmpty()) {
              sqlPlusConnection = SQLPlusConnection.getConnection(username, new String(password), port);
          }
          // All the values were provided by the user
          else {
              sqlPlusConnection = SQLPlusConnection.getConnection(username, new String(password), database, port);
          }
          
          // Fill the password array with whitespace to minimize the lifetime of sensitive data in memory.
          java.util.Arrays.fill(password, ' ');
        }
   
        System.out.println(sqlPlusConnection);
        
        return sqlPlusConnection;
    }
    
}
