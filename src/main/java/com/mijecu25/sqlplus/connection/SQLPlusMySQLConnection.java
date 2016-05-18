package com.mijecu25.sqlplus.connection;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.messages.Messages;

/**
 * Singleton class. Default database is MySQL on port 3306.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.5
 *
 */
public class SQLPlusMySQLConnection extends SQLPlusConnection {
        
    private static final String MYSQL_USER = "user";
    private static final String MYSQL_PASSWORD = "password";
    
    private static final Logger logger = LogManager.getLogger(SQLPlusMySQLConnection.class);
    
    private static SQLPlusMySQLConnection INSTANCE;
        
    public static final String MYSQL = "mysql";
    public static final String MYSQL_PORT_NUMBER = "3306";

    /**
     * Create an SQLPlusMySQLConnection to a mysql database on the provided port
     *
     * @param username the username used to connect to the database.
     * @param password the password associated to the user.
     * @param host the host where the server is located.
     * @param port the port used to connect to the server.
     *
     * @throws SQLException if there is a problem connecting to the mysql database.
     */
    private SQLPlusMySQLConnection(String username, char[] password, String host, String port) throws SQLException {
        super(username, password, host, SQLPlusMySQLConnection.MYSQL, port);
        SQLPlusMySQLConnection.logger.info("Creating SQLPlusMySQLConnection with username:" + username
                + " password:********* host: " + host + " database:" + SQLPlusMySQLConnection.MYSQL + " port:" + port);

        // Connect to the database using the mysql keywords
        SQLPlusMySQLConnection.logger.info("Will connect to a MySQL database using the credentials provided");
        this.connect(SQLPlusMySQLConnection.MYSQL_USER, SQLPlusMySQLConnection.MYSQL_PASSWORD);
    }
    
    /**
     * Create an SQLPlusMySQLConnection to a mysql database on port 3306.
     *
     * @param username the username used to connect to the database.
     * @param password the password associated to the user.
     * @param host the host where the server is located.
     *
     * @throws SQLException if there is a problem connecting to the mysql database.
     */
    private SQLPlusMySQLConnection(String username, char[] password, String host) throws SQLException {
        this(username, password, host, SQLPlusMySQLConnection.MYSQL_PORT_NUMBER);
    }

    /**
     * Get an SQLPlusMySQLConnection.
     *
     * @param username the username used to connect to the database.
     * @param password the password associated to the user.
     * @param host the host where the server is located.
     * @param port the port used to connect to the server.
     *
     * @return a singleton SQLPlusMySQLConnection.
     *
     * @throws SQLException if there is a problem getting a connection.
     */
    public static SQLPlusMySQLConnection getConnection(String username, char[] password, String host,  
            String port) throws SQLException {
        // If there is not an instance
        if(SQLPlusMySQLConnection.INSTANCE == null) {
            SQLPlusMySQLConnection.logger.info("Creating a new SQLPlusMySQLConnection instance with username:" + username 
                    + " password:********* host:" + host + " port:" + port);
            // Create an SQLPlusMySQLConnection to database with the info provided by the user
            SQLPlusMySQLConnection.INSTANCE = new SQLPlusMySQLConnection(username, password, host, port);
        }
        
        // Return the instance
        SQLPlusMySQLConnection.logger.info("Returning a SQLPlusMySQLConnection instance " + SQLPlusMySQLConnection.INSTANCE);
        return SQLPlusMySQLConnection.INSTANCE;
    }
    
    /**
     * Get an SQLPlusMySQLConnection. By not providing information about the port, SQLPlus default
     * those values to port 3306.
     *
     * @param username the username used to connect to the database.
     * @param password the password associated to the user.
     * @param host the host where the server is located.
     *
     * @return a singleton SQLPlusMySQLConnection.
     *
     * @throws SQLException if there is a problem getting a connection.
     */
    public static SQLPlusMySQLConnection getConnection(String username, char[] password, String host) throws SQLException {
        // If there is not an instance
        if(SQLPlusMySQLConnection.INSTANCE == null) {
            SQLPlusMySQLConnection.logger.info("Creating a new SQLPlusMySQLConnection instance with username:" + username 
                    + " password:********* host:" + host);
            // Create an SQLPlusMySQLConnection to a MySQL database on port 3306
            SQLPlusMySQLConnection.INSTANCE = new SQLPlusMySQLConnection(username, password, host);
        }
        
        // Return the instance
        SQLPlusMySQLConnection.logger.info("Returning a SQLPlusMySQLConnection instance " + SQLPlusMySQLConnection.INSTANCE);
        return SQLPlusMySQLConnection.INSTANCE;
    }
        
    /**
     * Default method to get an SQLPlusMySQLConnection. This method prints an error message if there is 
     * no SQLPlusMySQLConnection.
     *
     * @return a singleton SQLPlusMySQLConnection.
     */
    public static SQLPlusMySQLConnection getConnection() {
        // If there is not an instance
        if(SQLPlusMySQLConnection.INSTANCE == null) {
            SQLPlusMySQLConnection.logger.warn("There is not an SQLPlusMySQLConnection");
            // Print an error message since we cannot implement a default constructor since we need the user to
            // gives an username and password to connect to a database
            System.out.println(Messages.WARNING + "There is not an SQLPlusMySQLConnection");
        }
        
        // Return the instance
        SQLPlusMySQLConnection.logger.info("Returning a SQLPlusMySQLConnection instance " + SQLPlusMySQLConnection.INSTANCE);
        return SQLPlusMySQLConnection.INSTANCE;
    }
            
    /**
     * TODO delete this method.
     * WARNING! This method is for testing purposes only. Delete the SQLPlusMySQLConnection instance. 
     */
    public static void destroyInstance() {
        SQLPlusMySQLConnection.INSTANCE = null;
    }
       
}
