package com.mijecu25.sqlplus.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.messages.Messages;
import com.mijecu25.sqlplus.compiler.core.statement.Statement;

/**
 * SQLPlusConnection abstract class. Default database is MySQL on port 3306.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.17
 */
public abstract class SQLPlusConnection {
    public static final String MYSQL = "mysql";
    public static final String MYSQL_PORT_NUMBER = "3306";

    private static final String LOCALHOST = "127.0.0.1";
    private static final String JAVA_DATABASE_DRIVER = "jdbc";

    private static final String DEFAULT_DATABASE = SQLPlusConnection.MYSQL;
    private static final String DEFAULT_PORT = SQLPlusConnection.MYSQL_PORT_NUMBER;
    private static final String DEFAULT_HOST = SQLPlusConnection.LOCALHOST;
    private static final String USE_SSL = "useSSL";
    private static final String USE_SSL_DEFAULT = "false";

    private static final Logger logger = LogManager.getLogger(SQLPlusConnection.class);

    private String host;
    private String username;
    private char[] password;
    private String database;
    private String port;
    private String currentDatabase;

    private Connection connection;
    private Properties connectionProperties;

    /**
     * Constructor that instantiates several variables use to create a connection to a database.
     *
     * @param username the username used to connect to the database.
     * @param password the password associated to the user.
     * @param host the host where the server is located.
     * @param database the type of database used.
     * @param port the port used to connect to the server.
     */
    public SQLPlusConnection(String username, char[] password, String host, String database, String port) {
        SQLPlusConnection.logger.info("Instantiating the credentials that will be used to connect to a "
                + database + " database");
        this.host = host;
        this.username = username;
        this.password = password;
        this.database = database;
        this.port = port;
        this.currentDatabase = this.database.toUpperCase();

        this.connectionProperties = new Properties();
    }

    /**
     * Connect to a database with the keywords and credentials provided by the user. The keywords used are platform
     * specific and are determined by the type of database used by the user. The default database is
     * {@value #DEFAULT_DATABASE}.
     *
     * @param usernameKey the username keyword used to specify the user.
     * @param passwordKey the password keyword used to specify the password
     * @throws SQLException if there is a problem connecting to the database
     */
    public void connect(String usernameKey, String passwordKey) throws SQLException {
        SQLPlusConnection.logger.info("Adding the connection properties to connect to a " + this.database + " database");

        this.connectionProperties.put(usernameKey, this.username);
        this.connectionProperties.put(passwordKey, new String(this.password));
        this.connectionProperties.put(SQLPlusConnection.USE_SSL, SQLPlusConnection.USE_SSL_DEFAULT);

        // Delete any traces of password in memory by filling the password array with with random characters
        // to minimize the lifetime of sensitive data in memory. Then call the garbage collections
        java.util.Arrays.fill(this.password, Character.MIN_VALUE);
        System.gc();

        try {
            SQLPlusConnection.logger.info("Attempting to connect to the database: "
                    + SQLPlusConnection.JAVA_DATABASE_DRIVER + ":" + this.database + "://"
                    + this.host + ":" + this.port + "/");
            this.connection = DriverManager.getConnection(SQLPlusConnection.JAVA_DATABASE_DRIVER
                            + ":" + this.database + "://" + this.host + ":" + this.port + "/",
                    this.connectionProperties);
        } catch (SQLException sqle) {
            SQLPlusConnection.logger.warn(Messages.WARNING + "Error when attempting to connect to the "
                    + "database", sqle);
            System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                    + sqle.getMessage());

            SQLPlusConnection.logger.warn(Messages.WARNING + "Throwing a " + sqle.getClass().getSimpleName()
                    + " to the calling class");
            throw new SQLException();
        }
    }

    /**
     * Execute a sql query
     *
     * @param statement the statement that will be executed.
     */
    public void execute(Statement statement) {
        SQLPlusConnection.logger.info("Query to be executed: \"" + statement + "\"");

        try {
            statement.execute(this.connection);
        } catch (SQLException sqle) {
            SQLPlusConnection.logger.warn(Messages.WARNING + "There was an exception when executing the last command."
                    + " " + Messages.CHECK_LOG_FILES);
        }
    }

    /**
     * Disconnect from the database
     */
    public void disconnect() {
        if(this.connection != null) {
            try {
                SQLPlusConnection.logger.info("Attempting to disconnect from the database");
                this.connection.close();
                SQLPlusConnection.logger.info("Disconnected from the database");
            }
            catch (SQLException sqle) {
                // This exception might never occur, but it is good practice to handle it
                SQLPlusConnection.logger.warn(Messages.WARNING + "Error when attempting to disconnect from the "
                        + "database", sqle);
                System.out.println(Messages.WARNING + "(" + sqle.getErrorCode() + ") (" + sqle.getSQLState() + ") "
                        + sqle.getMessage());
            }
        }
        else {
            SQLPlusConnection.logger.warn("Tried to disconnect from the database, but there was not a connection");
            System.out.println(Messages.WARNING + "SQLPlus attempted to disconnect from your database but it found "
                    + "that there was not a connection." + " " + Messages.CHECK_LOG_FILES);
        }
    }

    /**
     * Return the default database.
     *
     * @return the default database.
     */
    public static String getDefaultDatabase() { return SQLPlusConnection.DEFAULT_DATABASE; }

    /**
     * Return the default port.
     *
     * @return the default port.
     */
    public static String getDefaultPort() { return SQLPlusConnection.DEFAULT_PORT; }

    /**
     * Return the default host.
     *
     * @return the default host.
     */
    public static String getDefaultHost() { return SQLPlusConnection.DEFAULT_HOST; }

    /**
     * Return the current database system.
     *
     * @return a string with the current database system.
     */
    public String getCurrentDatabase() { return this.currentDatabase; }

    @Override
    public String toString() {
        return "SQLPlusConnection [username=" + this.username + ", host=" + this.host + ", database="
                + this.database + ", port=" + this.port + "]";
    }

}
