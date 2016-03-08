package com.mijecu25.sqlplus;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;

import com.mijecu25.sqlplus.logger.Messages;

/**
 * SQLPlus.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.0.7
 *
 */
public class SQLPlus {

    private static final String EXIT = "exit";
    private static final String QUIT = "quit";
//    private static final int    UILENGTH = 80;
    private static final String PROMPT = "sqlplus> ";    
    private static final String LICENSE_FILE = "LICENSE";
    
    private static final Logger logger = LogManager.getLogger(SQLPlus.class);
    
    public static void main(String[] args) throws IOException {
        SQLPlus.logger.info("Initializing SQLPlus");
        
        // Check if the user is using a valid console (i.e. not from Eclipse)
        if(System.console() == null) {
            // The Console object for the JVM could not be found. Alert the user 
            SQLPlus.logger.fatal("A JVM Console object was not found");
            System.out.println(Messages.ERROR + "SQLPlus was not able to find your JVM's Console object. "
                    + "Try running SQLPlus from the command line.");
            
            SQLPlus.exitSQLPlus();
            
            return ;
        }
        
        // Create a scanner to get user input
        Scanner inputScanner = new Scanner(System.in);
        
        // UI intro
        System.out.println("Welcome to SQLPlus! This program allows you to add alerts to your sql queries.");
        System.out.println("Be sure to use SQLPlus from the command line.");
        System.out.println();
        // TODO get the version
        System.out.println("Version: TODO");
        System.out.println();
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader(SQLPlus.LICENSE_FILE));

        String line = bufferedReader.readLine();
        
        while (line != null) {
          System.out.println(line);
          
          line = bufferedReader.readLine();
        }

        bufferedReader.close();        
        System.out.println();

        try {
            // Get credentials from the user
            SQLPlus.logger.info("Create SQLPlusConnection");
            SQLPlus.createSQLPlusConnection(inputScanner);
            System.out.println("");
        } 
        catch(NullPointerException npe) {
            // This exception can occur if the user is running the program where the JVM Console
            // object cannot be found
            SQLPlus.exitSQLPlus();
            
            return ;
        }
        
        // TODO this actually is not true. Have not written code to create the connection
        System.out.println("Connection established! Commands end with ;");
        System.out.println("Type " + SQLPlus.EXIT + " or " + SQLPlus.QUIT + " to exit the application ");
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
                SQLPlus.exitSQLPlus();
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
    private static SQLPlusConnection createSQLPlusConnection(Scanner inputScanner) {
        SQLPlus.logger.info("Will create a SQLPlusConnection");
        
        System.out.println("You will now enter the credentials to connect to your database");
        // TODO use prepared statements
        // Add credentials
        System.out.print(SQLPlus.PROMPT + "Database(default " + SQLPlusConnection.getDefaultDatabase() + "): ");
        String database = inputScanner.nextLine().trim();
        SQLPlus.logger.info("User entered database:" + database);
      
        String port = "";
        
        // While the port is not numeric
        while(!StringUtils.isNumeric(port)) {
            System.out.print(SQLPlus.PROMPT + "Port (default " + SQLPlusConnection.getDefaultPort() + "): ");
            port = inputScanner.nextLine().trim();
            
            // If the port is empty
            if(port.isEmpty()) {
                // Assume that the user wants to use the default port. Continue to the next step
                break;
            }
            
            // If the port has more than 5 numbers or is not numberic 
            if(port.length() > 5 || !StringUtils.isNumeric(port)) {
                SQLPlus.logger.warn("The user provided an invalid port number: " + port);
                System.out.println(Messages.WARNING + "You need to provided a valid port number "
                        + "from 0 to 65535");
                
                // Set the port to the empty string to ask the user again
                port = "";
            }
        }
        SQLPlus.logger.info("User entered port:" + port);
        
        String username = "";
        
        // While the username is empty
        while(username.isEmpty()) {
            System.out.print(SQLPlus.PROMPT + "Username: ");
            username = inputScanner.nextLine().trim();
            
            // If the username is empty
            if(username.isEmpty()) {
                SQLPlus.logger.warn("The user did not provide a username");
                System.out.println(Messages.WARNING + "You cannot have an empty username");
            }
        }
        SQLPlus.logger.info("User entered username:" + username);

        // Insecure method of password entry
//        System.out.print(SQLPlus.PROMPT + "Password: ");
//        String password = inputScanner.nextLine().trim();
        
        // Create a SQLPlusConnection
        SQLPlusConnection sqlPlusConnection = null;

        // Get the console for safe password entry
        Console console = System.console();
        
        // If the console is null
        if(console == null) {
            // The Console object for the JVM could not be found. Alert the user and throw a
            // NullPointerException that the caller will handle
            SQLPlus.logger.fatal("A JVM Console object to enter a password was not found");
            System.out.println(Messages.ERROR + "SQLPlus was not able to find your JVM's Console object. "
                    + "Try running SQLPlus from the command line.");
            
            throw new NullPointerException();            
        }
        
        // Read the password without echoing the result
        char[] password = console.readPassword("%s", SQLPlus.PROMPT + "Password:");
        
        // If the password is not null
        if(password != null) {
            SQLPlus.logger.info("User entered a some password");  
            // If the database and port are default
            if(database.isEmpty() && port.isEmpty()) {
                SQLPlus.logger.info("Connection with username and password");
                sqlPlusConnection = SQLPlusConnection.getConnection(username, new String(password));
            }
            // If the database is empty  
            else if(database.isEmpty()) {
                SQLPlus.logger.info("Connection with username, password, and port");
                sqlPlusConnection = SQLPlusConnection.getConnection(username, new String(password), port);
            }
            // All the values were provided by the user
            else {
                SQLPlus.logger.info("Connection with all credentials");
                sqlPlusConnection = SQLPlusConnection.getConnection(username, new String(password), database, port);
            }
  
            // Fill the password array with whitespace to minimize the lifetime of sensitive data in memory.  
            java.util.Arrays.fill(password, ' ');
        }
   
        SQLPlus.logger.info("Created SQLPlusConnection " + sqlPlusConnection);     
        SQLPlus.logger.info("Returning created SQLPlusConnection");
        return sqlPlusConnection;
    }
    
    /**
     * 
     */
    private static void exitSQLPlus() {
        SQLPlus.logger.info("Quitting SQLPlus");
        System.out.println("Bye");
    }
        
}
