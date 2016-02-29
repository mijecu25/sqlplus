package com.mijecu25.sqlplus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Singleton class. Default database is MySQL on port 3306.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.0.2 
 *
 */
public class SQLPlusConnection {
    
    private static final String JDBC = "jdbc";
    
    private static final String MYSQL_DRIVER = "mysql";
    private static final String MYSQL_PORT = "3306";
    
    private static final String DEFAULT_DATABASE = SQLPlusConnection.MYSQL_DRIVER;
    private static final String DEFAULT_PORT = SQLPlusConnection.MYSQL_PORT;
    
    private static final Logger logger = LogManager.getLogger(SQLPlusConnection.class);
    
    private static SQLPlusConnection INSTANCE;
    
    private String username;
    private String password;
    private String database;
    private String port;
    
    /**
     * 
     * @param username
     * @param password
     * @param database
     * @param port
     */
    private SQLPlusConnection(String username, String password, String database, String port) {
        SQLPlusConnection.logger.info("Creating SQLPlusConnection with username:" + username + " password:********* database:" + database
                + " port:" + port);
        this.username = username;
        this.password = password;
        this.database = database;
        this.port = port;
    }
    
    /**
     * Create an SQLPlusConnection to a mysql database on the provided port
     * 
     * @param username
     * @param password
     * @param port
     */
    private SQLPlusConnection(String username, String password, String port) {
        this(username, password, SQLPlusConnection.MYSQL_DRIVER, port);
    }
    
    /**
     * Create an SQLPlusConnection to a mysql database on port 3306.
     * 
     * @param username
     * @param password
     */
    private SQLPlusConnection(String username, String password) {
        this(username, password, SQLPlusConnection.MYSQL_DRIVER, SQLPlusConnection.MYSQL_PORT);
    }
    
    /**
     * Get an SQLPlusConnection.
     * 
     * @param username
     * @param password
     * @param database
     * @param port
     * @return
     */
    public static SQLPlusConnection getConnection(String username, String password, String database, String port) {
        // If there is not an instance
        if(SQLPlusConnection.INSTANCE == null) {
            SQLPlusConnection.logger.info("Creating a new SQLPlusConnection instance with username:" + username 
                    + " password:********* database:" + database + " port:" + port);
            // Create an SQLPlusConnection to database with the info provided by the user
            SQLPlusConnection.INSTANCE = new SQLPlusConnection(username, password, database, port);
        }
        
        // Return the instance
        SQLPlusConnection.logger.info("Returning SQLPlusConnection instance " + SQLPlusConnection.INSTANCE);
        return SQLPlusConnection.INSTANCE;
    }
    
    /**
     * Get an SQLPlusConnection. By not providing information about the port, SQLPlus default to a 
     * MySQL database.
     * 
     * @param username
     * @param password
     * @param port
     * @return
     */
    public static SQLPlusConnection getConnection(String username, String password, String port) {
        // If there is not an instance
        if(SQLPlusConnection.INSTANCE == null) {
            SQLPlusConnection.logger.info("Creating a new SQLPlusConnection instance with username:" + username 
                    + " password:********* port:" + port);
            // Create an SQLPlusConnection to database with the info provided by the user
            SQLPlusConnection.INSTANCE = new SQLPlusConnection(username, password, port);
        }
        
        // Return the instance
        SQLPlusConnection.logger.info("Returning SQLPlusConnection instance" + SQLPlusConnection.INSTANCE);
        return SQLPlusConnection.INSTANCE;
    }
    
    /**
     * Get an SQLPlusConnection. By not providing information about the database and port, SQLPlus default those values
     * to a MySQL database on port 3306.
     * 
     * @param username
     * @param password
     * @return
     */
    public static SQLPlusConnection getConnection(String username, String password) {
        // If there is not an instance
        if(SQLPlusConnection.INSTANCE == null) {
            SQLPlusConnection.logger.info("Creating a new SQLPlusConnection instance with username:" + username 
                    + " password:*********");
            // Create an SQLPlusConnection to a MySQL database on port 3306
            SQLPlusConnection.INSTANCE = new SQLPlusConnection(username, password);
        }
        
        // Return the instance
        SQLPlusConnection.logger.info("Returning SQLPlusConnection instance" + SQLPlusConnection.INSTANCE);
        return SQLPlusConnection.INSTANCE;
    }
    
    /**
     * Default method to get an SQLPlusConnection. This method prints an error message if there is no SQLPlusConnection.
     * 
     * @return
     */
    public static SQLPlusConnection getConnection() {
        // If there is not an instance
        if(SQLPlusConnection.INSTANCE == null) {
            SQLPlusConnection.logger.warn("There is not an SQLPlusConnection");
            // Print an error message since we cannot implement a default constructor since we need the user to
            // gives an username and password to connect to a database
            System.out.println("WARNING: There is not an SQLPlusConnection");
        }
        
        // Return the instance
        SQLPlusConnection.logger.info("Returning SQLPlusConnection instance" + SQLPlusConnection.INSTANCE);
        return SQLPlusConnection.INSTANCE;
    }
    
    public Connection connect() {
        // TODO once connected to the database, I should delete any traces of the password in memory
        Connection connection = null;
        
        Properties connectionProperties = new Properties();
        connectionProperties.put("user", "root");
        
        try {
            connection = DriverManager.getConnection(SQLPlusConnection.JDBC + ":mysql://127.0.0.1:3306/", connectionProperties);
            
            Statement statement;
            
            String query = "show databases;";
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(query);
              
            System.out.println(result.getMetaData().getColumnCount());
            while(result.next()) {
                System.out.println(result.getString(1));
            }
        }
        catch(SQLException sqle) {
            
        }
                        
        return connection;
    }
    
    public void disconnect() {;
    }
    
    /**
     * TODO delete this method.
     * WARNING! This method is for testing purposes only. Delete the SQLPlusConnection instance. 
     */
    public static void destroyInstance() {
        SQLPlusConnection.INSTANCE = null;
    }

    public String getUsername() { return this.username; }

    public String getPassword() { return password; }

    public String getDatabase() { return database; }

    public String getPort() { return port; }

    public static String getDefaultDatabase() { return SQLPlusConnection.DEFAULT_DATABASE; }

    public static String getDefaultPort() { return SQLPlusConnection.DEFAULT_PORT; }

    @Override
    public String toString() {
        // TODO When displaying the password, use *****
        return "SQLPlusConnection [username=" + username + ", password=" + password + ", database="
                + database + ", port=" + port + "]";
    }

}
