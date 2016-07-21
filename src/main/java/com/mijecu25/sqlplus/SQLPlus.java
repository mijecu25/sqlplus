package com.mijecu25.sqlplus;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import com.mijecu25.sqlplus.compiler.alert.AlertManager;
import com.mijecu25.sqlplus.compiler.core.statement.StatementDefault;
import jline.console.UserInterruptException;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.messages.Messages;
import com.mijecu25.sqlplus.compiler.core.statement.Statement;
import com.mijecu25.sqlplus.connection.SQLPlusConnection;
import com.mijecu25.sqlplus.connection.SQLPlusMySQLConnection;
import com.mijecu25.sqlplus.parser.SQLPlusLex;
import com.mijecu25.sqlplus.parser.SQLPlusParser;

import jline.TerminalFactory;
import jline.console.ConsoleReader;

/**
 * SQLPlus add alerts to your sql queries.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.35
 */
public class SQLPlus {

    public static final String PROGRAM_NAME = "SQLPlus";
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
    private static AlertManager alertManager;

    private static final Logger logger = LogManager.getLogger(SQLPlus.class);

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(SQLPlus.class.getClassLoader().getResourceAsStream(SQLPlus.APPLICATION_PROPERTIES_FILE));


        SQLPlus.logger.info("Initializing " + SQLPlus.PROGRAM_NAME + " version " + properties.getProperty(SQLPlus.APPLICATION_PROPERTIES_FILE_VERSION));

        // Check if the user is using a valid console (i.e. not from Eclipse)
//        if (System.console() == null) {
//            SQLPlus.logger.fatal(Messages.FATAL + "A JVM Console object was not found. Try running " + SQLPlus.PROGRAM_NAME
//                    + "from the command line");
//            System.out.println(Messages.FATAL + SQLPlus.PROGRAM_NAME + " was not able to find your JVM's Console object. "
//                    + "Try running " + SQLPlus.PROGRAM_NAME + " from the command line.");
//
//            SQLPlus.exitSQLPlus();
//
//            SQLPlus.logger.fatal(Messages.FATAL + Messages.QUIT_PROGRAM_ERROR(PROGRAM_NAME));
//            return;
//        }

        System.out.println("Welcome to " + SQLPlus.PROGRAM_NAME + "! This program has a DSL to add alerts to various SQL DML events.");
        System.out.println("Be sure to use " + SQLPlus.PROGRAM_NAME + " from the command line.");
        System.out.println();

        System.out.println("Version: " + properties.getProperty(SQLPlus.APPLICATION_PROPERTIES_FILE_VERSION));
        System.out.println();

        BufferedReader bufferedReader;
        bufferedReader = new BufferedReader(new FileReader(SQLPlus.LICENSE_FILE));

        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);

            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        System.out.println();

        // Create the jline console that allows us to remember commands, use arrow keys, and catch interruptions
        // from the user
        SQLPlus.console = new ConsoleReader();
        SQLPlus.console.setHandleUserInterrupt(true);

        try {
            SQLPlus.logger.info("Create SQLPlusConnection");
            SQLPlus.createSQLPlusConnection();
        }
        catch (NullPointerException | SQLException | IllegalArgumentException e) {
            // NPE: This exception can occur if the user is running the program where the JVM Console
            // object cannot be found.
            // SQLE: TODO should I add here the error code?
            // This exception can occur when trying to establish a connection
            // IAE: This exception can occur when trying to establish a connection
            SQLPlus.logger.fatal(Messages.FATAL + Messages.FATAL_EXIT(SQLPlus.PROGRAM_NAME, e.getClass().getName()));
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(e.getClass().getSimpleName())
                    + " " + Messages.CHECK_LOG_FILES);
            SQLPlus.exitSQLPlus();

            SQLPlus.logger.fatal(Messages.FATAL + Messages.QUIT_PROGRAM_ERROR(SQLPlus.PROGRAM_NAME));
            return;
        }
        catch (UserInterruptException uie) {
            SQLPlus.logger.warn(Messages.WARNING + "The user typed an interrupt instruction.");
            SQLPlus.exitSQLPlus();

            return;
        }

        SQLPlus.alertManager = AlertManager.getManager();

        System.out.println("Connection established! Commands end with " + SQLPlus.END_OF_COMMAND);
        System.out.println("Type " + SQLPlus.EXIT + " or " + SQLPlus.QUIT + " to exit the application ");

        try {
            while (true) {
                System.out.print(SQLPlus.PROMPT);
                try {
                    line = SQLPlus.console.readLine().trim();
                }
                catch (NullPointerException npe) {
                    // TODO test this behavior
                    SQLPlus.logger.warn(Messages.WARNING + "The input from the user is null. It is very likely that" +
                            "the user entered the end of line command and they want to quit.");
                    SQLPlus.exitSQLPlus();

                    return;
                }

                if (line.isEmpty()) { continue; }

                // TODO DELETE
                if(line.equals("a")) {
                    line = "alert after insert in cards where name = " + Math.random() + ";";
                }

                if(line.equals("b")) {
                    line = "alert before insert in cards where name = " + Math.random() + ";";
                }

                if(line.equals("l")) {
                    line = "alert before insert in cards where name = 1;";
                }

                if(line.equals("u")) {
                    line = "alert BEFORE insert in cards where name = 1;";
                }

                if(line.equals("i")) {
                    line = "insert into cards (id,name) values (0,1);";
                }

                if (line.equals("1")) {
                    line = "select * from t where a = 1;";
                }

                if (line.equals("2")) {
                    line = "select * from t where a = 1 or b = 2;";
                }

                if (line.equals("3")) {
                    line = "select * from t where a = 1 or b = 2 or c = 3;";
                }

                if (line.equals(".")) {
                    line = "use courses;";
                }

                if (line.equals("-")) {
                    line = "select created_at from classes;";
                }

                if (line.equals("--")) {
                    line = "select name, year from classes;";
                }

                if (line.equals("*")) {
                    line = "select * from classes;";
                }

                if (line.equals("x")) {
                    line = "select name from classes, classes;";
                }

                if (line.equals("e")) {
                    line = "select * feom classes;";
                }

                if (line.equals(SQLPlus.QUIT) || line.equals(SQLPlus.EXIT)) {
                    SQLPlus.logger.info("The user wants to quit " + SQLPlus.PROGRAM_NAME);
                    SQLPlus.exitSQLPlus();
                    break;
                }

                // Use a StringBuilder since jline works weird when it has read a line. The issue we were having was with the
                // end of command logic. jline does not keep the input from the user in the variable that was stored in. Each
                // time jline reads a new line, the variable is empty
                StringBuilder query = new StringBuilder();
                query.append(line);

                while (query.charAt(query.length() - 1) != SQLPlus.END_OF_COMMAND) {
                    System.out.print(SQLPlus.WAIT_FOR_END_OF_COMMAND);
                    query.append(" ");
                    line = StringUtils.stripEnd(SQLPlus.console.readLine(), null);
                    query.append(line);
                }

                SQLPlus.logger.info("Raw input from the user: " + query);

                try {
                    Statement statement;

                    try {
                        SQLPlus.logger.info("Will parse the user input to determine what to execute");
                        ANTLRStringStream input = new ANTLRStringStream(query.toString());
                        SQLPlusLex lexer = new SQLPlusLex(input);
                        CommonTokenStream tokens = new CommonTokenStream(lexer);
                        SQLPlusParser parser = new SQLPlusParser(tokens);

                        statement = parser.sqlplus();
                        // TODO check if null so that we catch the exception
                    }
                    catch (RecognitionException re) {
                        // TODO move this to somehwere else
//                        String message = Messages.WARNING + "You have an error in your SQL syntax. Check the manual"
//                                + " that corresponds to your " + SQLPlus.sqlPlusConnection.getCurrentDatabase()
//                                + " server or " + SQLPlus.PROGRAM_NAME + " for the correct syntax";
//                        SQLPlus.logger.warn(message);
//                        System.out.println(message);
                        statement = new StatementDefault();
                    }

                    statement.setStatement(query.toString());
                    SQLPlus.sqlPlusConnection.execute(statement);
                }
                catch (UnsupportedOperationException uoe) {
                    // This exception can occur when the user entered a command allowed by the parsers, but not currently
                    // supported by SQLPlus. This can occur because the parser is written in such a way that supports
                    // the addition of features.
                    SQLPlus.logger.warn(Messages.WARNING + uoe);
                    System.out.println(Messages.WARNING + Messages.FATAL_EXCEPTION_ACTION(uoe.getClass().getSimpleName())
                            + " " + Messages.CHECK_LOG_FILES);
                    SQLPlus.logger.warn(Messages.WARNING + "The previous command is not currently supported.");
                }

            }
        }
        catch (IllegalArgumentException iae) {
            // This exception can occur when a command is executed but it had illegal arguments. Most likely
            // it is a programmer's error and should be addressed by the developer.
            SQLPlus.logger.fatal(Messages.FATAL + Messages.FATAL_EXIT(SQLPlus.PROGRAM_NAME, iae.getClass().getName()));
            SQLPlus.exitSQLPlus();

            SQLPlus.logger.fatal(Messages.FATAL + Messages.QUIT_PROGRAM_ERROR(SQLPlus.PROGRAM_NAME));
        }
        catch (UserInterruptException uie) {
            SQLPlus.logger.warn(Messages.WARNING + "The user typed an interrupt instruction.");
            SQLPlus.exitSQLPlus();
        }
    }

    /**
     * Create an SQLPlusConnection by taking the credentials from the user.
     *
     * @throws IOException  if there is an I/O error while reading input from the user.
     * @throws SQLException if there is an error while establishing a connection.
     */
    private static void createSQLPlusConnection() throws IOException, SQLException {
        if (false) {
            System.out.println("You will now enter the credentials to connect to your database");

            System.out.print(SQLPlus.PROMPT + "Host(default " + SQLPlusConnection.getDefaultHost() + "): ");
            String host = SQLPlus.console.readLine().trim();
            SQLPlus.logger.info("User entered host:" + host);
            // TODO validate host

//        if(!host.isEmpty()) {
//            // The Console object for the JVM could not be found. Alert the user and throw a
//            // NullPointerException that the caller will handle
//            SQLPlus.logger.fatal(Messages.FATAL + "The user wants to use a host that is not supported");
//            System.out.println(Messages.ERROR + SQLPlus.PROGRAM_NAME + " does not support the host that you entered");
//
//            SQLPlus.logger.info("Throwing a " + IllegalArgumentException.class.getSimpleName() + " to the "
//                    + "calling class");
//            throw new IllegalArgumentException();
//        }

            System.out.print(SQLPlus.PROMPT + "Database(default " + SQLPlusConnection.getDefaultDatabase() + "): ");
            String database = SQLPlus.console.readLine().trim();
            SQLPlus.logger.info("User entered database:" + database);

            if (database.isEmpty()) {
                database = SQLPlusConnection.getDefaultDatabase();
                SQLPlus.logger.info("Using default database:" + database);
            }

            String port = "";

            while (!StringUtils.isNumeric(port)) {
                System.out.print(SQLPlus.PROMPT + "Port (default " + SQLPlusConnection.getDefaultPort() + "): ");
                port = SQLPlus.console.readLine().trim();
                SQLPlus.logger.info("Port entered: " + port);
                SQLPlus.logger.info("Port string length: " + port.length());

                if (port.isEmpty()) { break; }

                if (port.length() > 5 || !StringUtils.isNumeric(port)) {
                    SQLPlus.logger.warn("The user provided an invalid port number: " + port);
                    System.out.println(Messages.WARNING + "You need to provided a valid port number "
                            + "from 0 to 65535");

                    port = "";
                }
            }
            SQLPlus.logger.info("User entered port:" + port);

            String username = "";

            while (username.isEmpty()) {
                System.out.print(SQLPlus.PROMPT + "Username: ");
                username = SQLPlus.console.readLine().trim();

                if (username.isEmpty()) {
                    SQLPlus.logger.warn("The user did not provide a username");
                    System.out.println(Messages.WARNING + "You cannot have an empty username");
                }
            }
            SQLPlus.logger.info("User entered username:" + username);

            // Reset the jline console since we are going to use the regular console to securely get the password
            SQLPlus.resetConsole();

            Console javaConsole = System.console();

            if (javaConsole == null) {
                SQLPlus.logger.fatal("A JVM Console object to enter a password was not found");
                System.out.println(Messages.ERROR + SQLPlus.PROGRAM_NAME + " was not able to find your JVM's Console object. "
                        + "Try running " + SQLPlus.PROGRAM_NAME + " from the command line.");

                SQLPlus.logger.info("Throwing a " + NullPointerException.class.getSimpleName() + " to the "
                        + "calling class");
                throw new NullPointerException();
            }

            // Read the password without echoing the result
            char[] password = javaConsole.readPassword("%s", SQLPlus.PROMPT + "Password:");

            if (password == null) {
                SQLPlus.logger.fatal("The password captured by the JVM Console object returned null");
                System.out.println(Messages.ERROR + SQLPlus.PROGRAM_NAME + " was not able to get the password you entered from"
                        + "your JVM's Console object. Try running " + SQLPlus.PROGRAM_NAME + " from the command line or a different"
                        + "terminal program");

                SQLPlus.logger.info("Throwing a " + NullPointerException.class.getSimpleName() + " to the "
                        + "calling class");
                throw new NullPointerException();
            }

            SQLPlus.logger.info("User entered some password");
            System.out.println();

            switch (database) {
                case SQLPlusMySQLConnection.MYSQL:
                    if (port.isEmpty() && host.isEmpty()) {
                        SQLPlus.logger.info("Connection with username, password");
                        sqlPlusConnection = SQLPlusMySQLConnection.getConnection(username, password);
                    }
                    else if (port.isEmpty()) {
                        SQLPlus.logger.info("Connection with username, password, and host");
                        sqlPlusConnection = SQLPlusMySQLConnection.getConnection(username, password, host);
                    }
                    else {
                        SQLPlus.logger.info("Connection with all credentials");
                        sqlPlusConnection = SQLPlusMySQLConnection.getConnection(username, password, host, port);
                    }
                    break;
                default:
                    SQLPlus.logger.fatal(Messages.FATAL + "The database system " + database + " is not supported");
                    System.out.println(Messages.ERROR + SQLPlus.PROGRAM_NAME + " does not support the database that you entered");

                    SQLPlus.logger.info("Throwing a " + IllegalArgumentException.class.getSimpleName() + " to the "
                            + "calling class");
                    throw new IllegalArgumentException();
            }

            // Delete any traces of password in memory by filling the password array with with random characters
            // to minimize the lifetime of sensitive data in memory. Then call the garbage collections
            java.util.Arrays.fill(password, Character.MIN_VALUE);
            System.gc();

            SQLPlus.console = new ConsoleReader();
            SQLPlus.console.setHandleUserInterrupt(true);
        }

        // TODO remove this which is for testing
        SQLPlus.logger.info("Connection with username, password, and host");
        SQLPlusConnection sqlPlusConnection = SQLPlusMySQLConnection.getConnection("sqlplus", new char[0], SQLPlusConnection.getDefaultHost());

        // TODO this does have to be in the final code
        SQLPlus.logger.info("Created and returning a SQLPlusConnection " + sqlPlusConnection);
        SQLPlus.sqlPlusConnection = sqlPlusConnection;
    }

    /**
     * Exit SQLPlus.
     */
    private static void exitSQLPlus() {
        if (SQLPlus.sqlPlusConnection != null) {
            SQLPlus.logger.info("Attempting to disconnect the SQLPlusConnection");
            SQLPlus.sqlPlusConnection.disconnect();
            SQLPlus.logger.info("Disconnected the SQLPlusConnection");
        }

        SQLPlus.logger.info("Reset the console from jline");
        SQLPlus.resetConsole();

        SQLPlus.logger.info("Quitting " + SQLPlus.PROGRAM_NAME);
        System.out.println("Bye");
    }

    /**
     * Reset the console from the changes that jline has done.
     */
    private static void resetConsole() {
        try {
            SQLPlus.logger.info("About to reset the console from jline");
            TerminalFactory.get().restore();
            SQLPlus.logger.info("Reset the console from jline");
        }
        catch (Exception e) {
            // This exception might never occur, but it is good practice to handle it
            SQLPlus.logger.warn(Messages.WARNING + "Error when attempting to reset the console from the changes made by jline", e);
            System.out.println(Messages.WARNING + "There was a error when trying to reset your console to its normal state");
            System.out.println(e.getMessage());
            System.out.println(Messages.WARNING + "Close this console window and open a new one to avoid any issues");
        }
    }

}
