package com.mijecu25.sqlplus.connection;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.messages.Messages;

/**
 * Singleton class. Default database is MySQL on port 3306.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.8
 *
 */
public class SQLPlusMySQLConnection extends SQLPlusConnection {

    private static final String MYSQL_USER = "user";
    private static final String MYSQL_PASSWORD = "password";

    private static final Logger logger = LogManager.getLogger(SQLPlusMySQLConnection.class);

    private static SQLPlusMySQLConnection INSTANCE;

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
                + " password:********* host: " + host + " port:" + port);

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
     * Create an SQLPlusMySQLConnection to a mysql database on port 3306 and localhost.
     *
     * @param username the username used to connect to the database.
     * @param password the password associated to the user.
     *
     * @throws SQLException if there is a problem connecting to the mysql database.
     */
    private SQLPlusMySQLConnection(String username, char[] password) throws SQLException {
        this(username, password, SQLPlusConnection.getDefaultHost(), SQLPlusMySQLConnection.MYSQL_PORT_NUMBER);
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
        if(SQLPlusMySQLConnection.INSTANCE == null) {
            SQLPlusMySQLConnection.logger.info("Creating a new SQLPlusMySQLConnection instance with username:" + username
                    + " password:********* host:" + host + " port:" + port);
            SQLPlusMySQLConnection.INSTANCE = new SQLPlusMySQLConnection(username, password, host, port);
        }

        SQLPlusMySQLConnection.logger.info("Returning a SQLPlusMySQLConnection instance " + SQLPlusMySQLConnection.INSTANCE);
        return SQLPlusMySQLConnection.INSTANCE;
    }

    /**
     * Get an SQLPlusMySQLConnection. By not providing information about the port, SQLPlus defaults
     * to port 3306.
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
        if(SQLPlusMySQLConnection.INSTANCE == null) {
            SQLPlusMySQLConnection.logger.info("Creating a new SQLPlusMySQLConnection instance with username:" + username
                    + " password:********* host:" + host);
            SQLPlusMySQLConnection.INSTANCE = new SQLPlusMySQLConnection(username, password, host);
        }

        SQLPlusMySQLConnection.logger.info("Returning a SQLPlusMySQLConnection instance " + SQLPlusMySQLConnection.INSTANCE);
        return SQLPlusMySQLConnection.INSTANCE;
    }

    /**
     * Get an SQLPlusMySQLConnection. By not providing information about the port and the host, SQLPlus defaults
     * those values to port 3306 and localhost.
     *
     * @param username the username used to connect to the database.
     * @param password the password associated to the user.
     *
     * @return a singleton SQLPlusMySQLConnection.
     *
     * @throws SQLException if there is a problem getting a connection.
     */
    public static SQLPlusMySQLConnection getConnection(String username, char[] password) throws SQLException {
        if(SQLPlusMySQLConnection.INSTANCE == null) {
            SQLPlusMySQLConnection.logger.info("Creating a new SQLPlusMySQLConnection instance with username:" + username
                    + " password:*********");
            SQLPlusMySQLConnection.INSTANCE = new SQLPlusMySQLConnection(username, password);
        }

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
        if(SQLPlusMySQLConnection.INSTANCE == null) {
            // Print an error message since we cannot implement a default constructor since we need the user to
            // gives an username and password to connect to a database
            SQLPlusMySQLConnection.logger.warn("There is not an SQLPlusMySQLConnection");
            System.out.println(Messages.WARNING + "There is not an SQLPlusMySQLConnection");
        }

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
