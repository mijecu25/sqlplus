package com.mijecu25.sqlplus;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.sqlplus.connection.SQLPlusConnection;
import com.mijecu25.sqlplus.connection.SQLPlusMySQLConnection;
import com.mijecu25.utils.messages.Messages;

import jline.TerminalFactory;
import jline.console.ConsoleReader;

/**
 * SQLPlus add alerts to your sql queries.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.6
 */
public class SQLPlus {

//    private static final int    UILENGTH = 80;
    private static final String EXIT = "exit";
    private static final String QUIT = "quit";
    private static final String PROMPT = "sqlplus> ";   
    private static final char END_OF_COMMAND = ';'; 
    private static final String WAIT_FOR_END_OF_COMMAND = "      -> "; 
    private static final String LICENSE_FILE = "LICENSE";
    private static final String APPLICATION_PROPERTIES_FILE = "application.properties";
    private static final String APPLICATION_PROPERTIES_FILE_VERSION = "application.version";
    
    private static SQLPlusConnection sqlPlusConnection;
    private static ConsoleReader console;
    
    private static final Logger logger = LogManager.getLogger(SQLPlus.class);
    
    public static void main(String[] args) throws IOException {
     // Create and load the properties from the application properties file
        Properties properties = new Properties();
        properties.load(SQLPlus.class.getClassLoader().getResourceAsStream(SQLPlus.APPLICATION_PROPERTIES_FILE));
        
        
        SQLPlus.logger.info("Initializing SQLPlus version " + properties.getProperty(SQLPlus.APPLICATION_PROPERTIES_FILE_VERSION));
        
        // Check if the user is using a valid console (i.e. not from Eclipse)
        if(System.console() == null) {
            // The Console object for the JVM could not be found. Alert the user 
            SQLPlus.logger.fatal(Messages.FATAL + "A JVM Console object was not found. Try running SQLPlus "
                    + "from the command line");
            System.out.println(Messages.FATAL + "SQLPlus was not able to find your JVM's Console object. "
                    + "Try running SQLPlus from the command line.");
            
            SQLPlus.exitSQLPlus();
          
            SQLPlus.logger.fatal(Messages.FATAL + Messages.QUIT_ERROR);
            return ;
        }
                        
        // UI intro
        System.out.println("Welcome to SQLPlus! This program allows you to add alerts to your sql queries.");
        System.out.println("Be sure to use SQLPlus from the command line.");
        System.out.println();
        
        // Get the version
        System.out.println("Version: " + properties.getProperty(SQLPlus.APPLICATION_PROPERTIES_FILE_VERSION));
        System.out.println();
        
        // Read the license file
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader(SQLPlus.LICENSE_FILE));

        // Read a line
        String line = bufferedReader.readLine();
        
        // While the line is not null
        while (line != null) {
            System.out.println(line);
        
            // Read a new lines
            line = bufferedReader.readLine();
        }

        // Close the buffer
        bufferedReader.close();        
        System.out.println();

        // Create the jline console that allows us to remember commands and use arrow keys
        SQLPlus.console = new ConsoleReader();
        
        try {
            // Get credentials from the user
            SQLPlus.logger.info("Create SQLPlusConnection");
            SQLPlus.sqlPlusConnection = SQLPlus.createSQLPlusConnection();
            System.out.println("");
        } 
        catch(NullPointerException npe) {
            // This exception can occur if the user is running the program where the JVM Console
            // object cannot be found
            SQLPlus.logger.fatal(Messages.FATAL + Messages.FATAL_EXIT(npe.getClass().getName()));
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(npe.getClass().getSimpleName())
                    + Messages.SPACE + Messages.CHECK_LOG_FILES);
            SQLPlus.exitSQLPlus();
            
            SQLPlus.logger.fatal(Messages.FATAL + Messages.QUIT_ERROR);
            return ;
        }
        catch(SQLException sqle) {
            // This exception can occur when trying to establish a connection
            SQLPlus.logger.fatal(Messages.FATAL + Messages.FATAL_EXIT(sqle.getClass().getName()));
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(sqle.getClass().getSimpleName())
                    + Messages.SPACE + Messages.CHECK_LOG_FILES);
            SQLPlus.exitSQLPlus();
            
            SQLPlus.logger.fatal(Messages.FATAL + Messages.QUIT_ERROR);
            return ;
        }
        catch(IllegalArgumentException iae) {
            // This exception can occur when trying to establish a connection
            SQLPlus.logger.fatal(Messages.FATAL + Messages.FATAL_EXIT(iae.getClass().getName()));
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName())
                    + Messages.SPACE + Messages.CHECK_LOG_FILES);
            SQLPlus.exitSQLPlus();
            
            SQLPlus.logger.fatal(Messages.FATAL + Messages.QUIT_ERROR);
            return ;
        }
        
        System.out.println("Connection established! Commands end with " + SQLPlus.END_OF_COMMAND);
        System.out.println("Type " + SQLPlus.EXIT + " or " + SQLPlus.QUIT + " to exit the application ");
               
        // Execute the input scanner
        while(true) {
            // Get a line from the user until the hit enter (carriage return, line feed/ new line). 
            System.out.print(SQLPlus.PROMPT);
            line = console.readLine().trim();

            // If the user did not enter anything 
            if(line.isEmpty()) {
                // Continue to the next iteration
                continue;
            }
            
            // Logic to quit
            if(line.equals(SQLPlus.QUIT) || line.equals(SQLPlus.EXIT)) {
                SQLPlus.logger.info("The user wants to quit SQLPlus");
                SQLPlus.exitSQLPlus();
                break;
            }      
            
            // Use a StringBuilder since jline works weird when it has read a line. The issue we were having was with the 
            // end of command logic. jline does not keep the input from the user in the variable that was stored in. Each 
            // time jline reads a new line, the variable is empty 
            StringBuilder query = new StringBuilder();
            query.append(line);
            
            // While the user does not finish the command with the SQLPlus.END_OF_COMMAND
            while(query.charAt(query.length()-1) != SQLPlus.END_OF_COMMAND) {
                // Print the wait for command prompt and get the next line for the user
                System.out.print(SQLPlus.WAIT_FOR_END_OF_COMMAND);
                query.append(" ");
                line = StringUtils.stripEnd(console.readLine(), null);
                query.append(line);
            }
            
            // Execute the query from the user
            SQLPlus.logger.info("Will execute a query from the user");
            SQLPlus.sqlPlusConnection.execute(query.toString());
        }
        
    }
    
    /**
     * Create an SQLPlusConnection by taking the credentials from the user.
     *
     * @return
     * @throws IOException
     * @throws SQLException
     */
    private static SQLPlusConnection createSQLPlusConnection() throws IOException, SQLException {                
//        System.out.println("You will now enter the credentials to connect to your database");
//
//        // Add credentials
//        System.out.print(SQLPlus.PROMPT + "Host(default " + SQLPlusConnection.getDefaultHost() + "): ");
//        String host = console.readLine().trim();
//        SQLPlus.logger.info("User entered host:" + host);
//        
//        // TODO remove this later when other hosts are supported
//        if(!host.isEmpty()) {
//            // The Console object for the JVM could not be found. Alert the user and throw a
//            // NullPointerException that the caller will handle
//            SQLPlus.logger.fatal(Messages.FATAL + "The user wants to use a host that is not supported");
//            System.out.println(Messages.ERROR + "SQLPlus does not support the host that you entered");
//            
//            SQLPlus.logger.info("Throwing a " + IllegalArgumentException.class.getSimpleName() + " to the "
//                    + "calling class");
//            throw new IllegalArgumentException();  
//        }
//        
//        System.out.print(SQLPlus.PROMPT + "Database(default " + SQLPlusConnection.getDefaultDatabase() + "): ");
//        String database = console.readLine().trim();
//        SQLPlus.logger.info("User entered database:" + database);
//      
//        String port = "";
//        
//        // While the port is not numeric
//        while(!StringUtils.isNumeric(port)) {
//            System.out.print(SQLPlus.PROMPT + "Port (default " + SQLPlusConnection.getDefaultPort() + "): ");
//            port = console.readLine().trim();
//            SQLPlus.logger.info("Port entered: " + port);
//            SQLPlus.logger.info("Port string length: " + port.length());
//            
//            // If the port is empty
//            if(port.isEmpty()) {
//                // Assume that the user wants to use the default port. Continue to the next step
//                break;
//            }
//            
//            // If the port has more than 5 numbers or is not numberic 
//            if(port.length() > 5 || !StringUtils.isNumeric(port)) {
//                SQLPlus.logger.warn("The user provided an invalid port number: " + port);
//                System.out.println(Messages.WARNING + "You need to provided a valid port number "
//                        + "from 0 to 65535");
//                
//                // Set the port to the empty string to ask the user again
//                port = "";
//            }
//        }
//        SQLPlus.logger.info("User entered port:" + port);
//        
//        String username = "";
//        
//        // While the username is empty
//        while(username.isEmpty()) {
//            System.out.print(SQLPlus.PROMPT + "Username: ");
//            username = console.readLine().trim();
//            
//            // If the username is empty
//            if(username.isEmpty()) {
//                SQLPlus.logger.warn("The user did not provide a username");
//                System.out.println(Messages.WARNING + "You cannot have an empty username");
//            }
//        }
//        SQLPlus.logger.info("User entered username:" + username);
//        
//        // Create a SQLPlusConnection
//        SQLPlusMySQLConnection sqlPlusConnection = null;
//        // Reset the jline console since we are going to use the regular console to securely get the password
//        SQLPlus.resetConsole();
//        
//        // Get the console for safe password entry
//        Console javaConsole = System.console();
//        
//        // If the console is null
//        if(javaConsole == null) {
//            // The Console object for the JVM could not be found. Alert the user and throw a
//            // NullPointerException that the caller will handle
//            SQLPlus.logger.fatal("A JVM Console object to enter a password was not found");
//            System.out.println(Messages.ERROR + "SQLPlus was not able to find your JVM's Console object. "
//                    + "Try running SQLPlus from the command line.");
//            
//            SQLPlus.logger.info("Throwing a " + NullPointerException.class.getSimpleName() + " to the "
//                    + "calling class");
//            throw new NullPointerException();            
//        }
//        
//        // Read the password without echoing the result
//        char[] password = javaConsole.readPassword("%s", SQLPlus.PROMPT + "Password:");
//                
//        // If the password is null
//        if(password == null) {
//            // The Console object for the JVM could not be found. Alert the user and throw a
//            // NullPointerException that the caller will handle
//            SQLPlus.logger.fatal("The password captured by the JVM Console object returned null");
//            System.out.println(Messages.ERROR + "SQLPlus was not able to get the password you entered from"
//                    + "your JVM's Console object. Try running SQLPlus from the command line or a different"
//                    + "terminal program");
//            
//            SQLPlus.logger.info("Throwing a " + NullPointerException.class.getSimpleName() + " to the "
//                    + "calling class");
//            throw new NullPointerException(); 
//        }
//        SQLPlus.logger.info("User entered some password"); 
//        System.out.println();
//
//        // TODO handle different databases
//        // If the database and port are default
//        if(database.isEmpty() && port.isEmpty()) {
//            SQLPlus.logger.info("Connection with username, password, and host");
//            sqlPlusConnection = SQLPlusMySQLConnection.getConnection(username, password, SQLPlusConnection.getDefaultHost());
//        }
//        // If the database is empty but the port is not empty 
//        else if(database.isEmpty() && !port.isEmpty()) {
//            SQLPlus.logger.info("Connection with username, password, host, and port");
//            sqlPlusConnection = SQLPlusMySQLConnection.getConnection(username, password, SQLPlusConnection.getDefaultHost(), port);
//        }
//        // If the port is empty but the database is not empty 
//        else if(port.isEmpty() && !database.isEmpty()) {
//            SQLPlus.logger.info("Connection with username, password, host, and database");
//            sqlPlusConnection = SQLPlusMySQLConnection.getConnection(username, password, SQLPlusConnection.getDefaultHost(), database, SQLPlusMySQLConnection.getDefaultPort());
//        }
//        // All the values were provided by the user
//        else {
//            SQLPlus.logger.info("Connection with all credentials");
//                sqlPlusConnection = SQLPlusMySQLConnection.getConnection(username, password, SQLPlusConnection.getDefaultHost(), database, port);
//        }
//  
//        // Delete any traces of password in memory by filling the password array with with random characters
//        // to minimize the lifetime of sensitive data in memory. Then call the garbage collections
//        java.util.Arrays.fill(password, Character.MIN_VALUE);
//        System.gc();
//        
//        // Recreate the jline console
//        SQLPlus.console = new ConsoleReader();
        
        
        // TODO remove this which is for testing
        SQLPlus.logger.info("Connection with username, password, and host");
        SQLPlusMySQLConnection sqlPlusConnection = SQLPlusMySQLConnection.getConnection("root", new char[0], SQLPlusConnection.getDefaultHost());

        // TODO do I want to return or just assign the value to the instance varaible? 
        SQLPlus.logger.info("Created and returning a SQLPlusConnection " + sqlPlusConnection);     
        return sqlPlusConnection;
    }
    
    /**
     * Exit SQLPlus.
     */
    private static void exitSQLPlus() {
        // If there is a SQLPlusConnection
        if(SQLPlus.sqlPlusConnection != null) {
            // Disconnect from the database
            SQLPlus.logger.info("Attempting to disconnect the SQLPlusConnection");
            SQLPlus.sqlPlusConnection.disconnect();
            SQLPlus.logger.info("Disconnected the SQLPlusConnection");
        }
        
        // Reset the console from jline
        SQLPlus.logger.info("Reset the console from jline");
        SQLPlus.resetConsole();
        
        SQLPlus.logger.info("Quitting SQLPlus");
        System.out.println("Bye");
    }
    
    /**
     * Reset the console from the changes that jline has done.
     */
    private static void resetConsole() {
        // Reset the console
        try {
            SQLPlus.logger.info("About to reset the console from jline");
            TerminalFactory.get().restore();
            SQLPlus.logger.info("Reset the console from jline");
        } 
        catch(Exception e) {
            // This exception might never occur, but it is good practice to handle it
            SQLPlus.logger.warn(Messages.WARNING + "Error when attempting to reset the console from the changes made by jline", e);
            System.out.println(Messages.WARNING + "There was a error when trying to reset your console to its normal state");
            System.out.println(e.getMessage());
            System.out.println(Messages.WARNING + "Close this console window and open a new one to avoid any issues");
        }
    }
        
}
