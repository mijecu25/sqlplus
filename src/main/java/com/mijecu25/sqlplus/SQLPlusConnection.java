package com.mijecu25.sqlplus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.sqlplus.logger.Messages;

/**
 * Singleton class. Default database is MySQL on port 3306.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.0.0.3
 *
 */
public class SQLPlusConnection {
    
    private static final String MYSQL_DRIVER = "jdbc";
    
    private static final String MYSQL = "mysql";
    private static final String MYSQL_PORT_NUMBER = "3306";
    
    private static final String MYSQL_USER = "user";
    private static final String MYSQL_PASSWORD = "password";
    private static final String MYSQL_HOST = "host";
    private static final String MYSQL_PORT = "port";
    
    private static final String DEFAULT_DATABASE = SQLPlusConnection.MYSQL;
    private static final String DEFAULT_PORT = SQLPlusConnection.MYSQL_PORT_NUMBER;
    
    private static final String LOCALHOST = "127.0.0.1";
    
    private static final Logger logger = LogManager.getLogger(SQLPlusConnection.class);
    
    private static SQLPlusConnection INSTANCE;
    
    private String username;
    private String password;
    private String database;
    private String port;
    
    private Connection connection;
    private Properties connectionProperties;
    
    /**
     * 
     * @param username
     * @param password
     * @param database
     * @param port
     * @throws SQLException 
     */
    private SQLPlusConnection(String username, String password, String database, String port) throws SQLException {
        SQLPlusConnection.logger.info("Creating SQLPlusConnection with username:" + username + " password:********* database:" + database
                + " port:" + port);
        this.username = username;
        this.password = password;
        this.database = database;
        this.port = port;
        
        this.connectionProperties = new Properties();
        this.connectionProperties.put(SQLPlusConnection.MYSQL_HOST, this.database);
        this.connectionProperties.put(SQLPlusConnection.MYSQL_PORT, this.port);
        this.connectionProperties.put(SQLPlusConnection.MYSQL_USER, this.username);
        this.connectionProperties.put(SQLPlusConnection.MYSQL_PASSWORD, this.password);
        
        this.connect();
    }
    
    /**
     * Create an SQLPlusConnection to a mysql database on the provided port
     * 
     * @param username
     * @param password
     * @param port
     * @throws SQLException 
     */
    private SQLPlusConnection(String username, String password, String port) throws SQLException {
        this(username, password, SQLPlusConnection.MYSQL, port);
    }
    
    /**
     * Create an SQLPlusConnection to a mysql database on port 3306.
     * 
     * @param username
     * @param password
     * @throws SQLException 
     */
    private SQLPlusConnection(String username, String password) throws SQLException {
        this(username, password, SQLPlusConnection.MYSQL, SQLPlusConnection.MYSQL_PORT_NUMBER);
    }
        
    /**
     * Get an SQLPlusConnection.
     * 
     * @param username
     * @param password
     * @param database
     * @param port
     * @return
     * @throws SQLException 
     */
    public static SQLPlusConnection getConnection(String username, String password, String database, String port) throws SQLException {
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
     * @throws SQLException 
     */
    public static SQLPlusConnection getConnection(String username, String password, String port) throws SQLException {
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
     * @throws SQLException 
     */
    public static SQLPlusConnection getConnection(String username, String password) throws SQLException {
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
            System.out.println(Messages.WARNING + "There is not an SQLPlusConnection");
        }
        
        // Return the instance
        SQLPlusConnection.logger.info("Returning SQLPlusConnection instance" + SQLPlusConnection.INSTANCE);
        return SQLPlusConnection.INSTANCE;
    }
    
    private void connect() throws SQLException {
        // TODO once connected to the database, I should delete any traces of the password in memory    

        try {
            // TODO executing this command, prints a message about ssl connection. Get rid of that
            this.connection = DriverManager.getConnection(SQLPlusConnection.MYSQL_DRIVER + ":" + SQLPlusConnection.MYSQL 
                    + "://" + SQLPlusConnection.LOCALHOST + ":" + this.port + "/", this.connectionProperties);
            
              Statement statement;
              
              String query = "show databases;";
              
              statement = connection.createStatement();
              
              ResultSet result = statement.executeQuery(query);
                
              System.out.println(result.getMetaData().getColumnCount());
              while(result.next()) {
                  System.out.println(result.getString(1));
              }
            
        } catch (SQLException sqle) {
            // TODO add a message for the user about not being able to connect
            SQLPlusConnection.logger.warn(Messages.WARNING + "Error when attempting to connect to the database", sqle);
            System.out.println(Messages.WARNING + sqle.getMessage());
            
            // TODO Auto-generated catch block
            throw new SQLException();
        }
    }
    
    /**
     * 
     */
    public void disconnect() {
        // If there is a connection
        if(this.connection != null) {
            try {
                // Close the connection to the database
                SQLPlusConnection.logger.info("Attempting to disconnect from the database");
                this.connection.close();
                SQLPlusConnection.logger.info("Disconnected from the database");
            } 
            catch (SQLException e) {
            // TODO add error to logger and maybe user
            // TODO Auto-generated catch block
            e.printStackTrace();
            }
        }
        else {
            // TODO should this be an info or warn?
            SQLPlusConnection.logger.info("Tried to disconnect from the database, but there was not a connection");
        }
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
