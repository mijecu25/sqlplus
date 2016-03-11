package com.mijecu25.sqlplus.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.sqlplus.logger.Messages;

/**
 * SQLPlusConnection abstrac class. Default database is MySQL on port 3306.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.0.0.4
 *
 */
public abstract class SQLPlusConnection {
    
    private static final String LOCALHOST = "127.0.0.1";
    private static final String JAVA_DATABASE_DRIVER = "jdbc";
        
    private static final String DEFAULT_DATABASE = SQLPlusMySQLConnection.MYSQL;
    private static final String DEFAULT_PORT = SQLPlusMySQLConnection.MYSQL_PORT_NUMBER;
    
    private static final Logger logger = LogManager.getLogger(SQLPlusConnection.class);
        
    private String username;
    private String password;
    private String database;
    private String port;
    
    private Connection connection;
    private Properties connectionProperties;
    
    /**
     * Constructor that instantiates several variables use to create a connection to a database.
     * 
     * @param username
     * @param password
     * @param database
     * @param port
     */
    public SQLPlusConnection(String username, String password, String database, String port) {
        SQLPlusConnection.logger.info("Instantiating the credentials that will be used to connect to a " 
                + database + " database");
        this.username = username;
        this.password = password;
        this.database = database;
        this.port = port;
        
        this.connectionProperties = new Properties();
    }

    /**
     * Connect to a database with the keywords and credentials provided by the user. The keywords used are platform
     * specific and are determined by the type of host/database used by the user. The default host/database is
     * {@value #DEFAULT_DATABASE}.
     * 
     * @param username
     * @param password
     * @param host
     * @param port
     * @throws SQLException
     */
    public void connect(String username, String password, String host, String port) throws SQLException {
        // TODO once connected to the database, I should delete any traces of the password in memory  
        SQLPlusConnection.logger.info("Adding the connection properties to connect to a " + this.database + " database");
        this.connectionProperties.put(host, this.database);
        this.connectionProperties.put(port, this.port);
        this.connectionProperties.put(username, this.username);
        this.connectionProperties.put(password, this.password);
        
        try {
            SQLPlusConnection.logger.info("Attempting to connect to the database");
            // TODO executing this command, prints a message about ssl connection. Get rid of that
            this.connection = DriverManager.getConnection(SQLPlusConnection.JAVA_DATABASE_DRIVER 
                    + ":" + SQLPlusMySQLConnection.MYSQL + "://" + SQLPlusConnection.LOCALHOST + ":" 
                    + this.port + "/", this.connectionProperties);            
        } catch (SQLException sqle) {
            SQLPlusConnection.logger.warn(Messages.WARNING + "Error when attempting to connect to the "
                    + "database", sqle);
            System.out.println(Messages.WARNING + sqle.getMessage());
            
            SQLPlusConnection.logger.info("Throwing a " + sqle.getClass().getSimpleName() + " to the calling class");
            throw new SQLException();
        }
    }

    public void execute(String query) {
        // TODO Auto-generated method stub
        
    }

    /**
     * Disconnect from the database
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
            catch (SQLException sqle) {
                SQLPlusConnection.logger.warn(Messages.WARNING + "Error when attempting to disconnect from the "
                        + "database", sqle);
                System.out.println(Messages.WARNING + sqle.getMessage());
            }
        }
        else {
            // TODO should this be an info or warn?
            SQLPlusConnection.logger.info("Tried to disconnect from the database, but there was not a connection");
        }
    }
    
    public String getUsername() { return this.username; }

    // TODO delete this
    public String getPassword() { return password; }

    public String getDatabase() { return database; }

    public String getPort() { return port; }
    
    public static String getDefaultDatabase() { return SQLPlusConnection.DEFAULT_DATABASE; }

    public static String getDefaultPort() { return SQLPlusConnection.DEFAULT_PORT; }

    @Override
    public String toString() {
        // TODO delete password
        return "SQLPlusConnection [username=" + username + ", password=" + password + ", database="
                + database + ", port=" + port + "]";
    }

}
