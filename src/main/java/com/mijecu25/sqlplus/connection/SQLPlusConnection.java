package com.mijecu25.sqlplus.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.messages.Messages;

/**
 * SQLPlusConnection abstrac class. Default database is MySQL on port 3306.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.6
 */
public abstract class SQLPlusConnection {
    private static final String LOCALHOST = "127.0.0.1";
    private static final String JAVA_DATABASE_DRIVER = "jdbc";
        
    private static final String DEFAULT_DATABASE = SQLPlusMySQLConnection.MYSQL;
    private static final String DEFAULT_PORT = SQLPlusMySQLConnection.MYSQL_PORT_NUMBER;
    private static final String DEFAULT_HOST = SQLPlusConnection.LOCALHOST;
    
    private static final Logger logger = LogManager.getLogger(SQLPlusConnection.class);
        
    private String host;
    private String username;
    private char[] password;
    private String database;
    private String port;
    
    private Connection connection;
    private Properties connectionProperties;
    
    /**
     * Constructor that instantiates several variables use to create a connection to a database.
     * 
     * @param username
     * @param password
     * @param host
     * @param database
     * @param port
     */
    public SQLPlusConnection(String username, char[] password, String host, String database, String port) {
        SQLPlusConnection.logger.info("Instantiating the credentials that will be used to connect to a " 
                + database + " database");
        this.host = host;
        this.username = username;
        this.password = password;
        this.database = database;
        this.port = port;
        
        this.connectionProperties = new Properties();
    }

    /**
     * Connect to a database with the keywords and credentials provided by the user. The keywords used are platform
     * specific and are determined by the type of database used by the user. The default database is
     * {@value #DEFAULT_DATABASE}.
     * 
     * @param usernameKey
     * @param passwordKey
     * @param host
     * @param database
     * @param port
     * @throws SQLException
     */
    public void connect(String usernameKey, String passwordKey) throws SQLException {
        SQLPlusConnection.logger.info("Adding the connection properties to connect to a " + this.database + " database");

        // Add the properties to connect to a database
        this.connectionProperties.put(usernameKey, this.username);
        this.connectionProperties.put(passwordKey, new String(this.password));
        
        // Delete any traces of password in memory by filling the password array with with random characters
        // to minimize the lifetime of sensitive data in memory. Then call the garbage collections
        java.util.Arrays.fill(this.password, Character.MIN_VALUE);
        System.gc();
        
        try {
            SQLPlusConnection.logger.info("Attempting to connect to the database");
            // TODO executing this command, prints a message about ssl connection. Get rid of that
            this.connection = DriverManager.getConnection(SQLPlusConnection.JAVA_DATABASE_DRIVER 
                    + ":" + this.database + "://" + this.host + ":" + this.port + "/",
                    this.connectionProperties);            
        } catch (SQLException sqle) {
            SQLPlusConnection.logger.warn(Messages.WARNING + "Error when attempting to connect to the "
                    + "database", sqle);
            System.out.println(Messages.WARNING + sqle.getMessage());
            
            SQLPlusConnection.logger.warn(Messages.WARNING + "Throwing a " + sqle.getClass().getSimpleName() + " to the calling class");
            throw new SQLException();
        }
    }

    /**
     * Execute a sql query
     * 
     * @param sql
     */
    public void execute(com.mijecu25.sqlplus.compiler.core.statement.Statement statement) {
        SQLPlusConnection.logger.info("Query to be executed: \"" + statement + "\"");
                
        try {
            statement.execute(this.connection);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
//        Statement statement;        
//        try {
//            // Create a statement object
//            statement = this.connection.createStatement();
//
//            // to execute and what to display
//            if(sql.contains("show") /*|| sql.contains("describe")*/) {
//                SQLPlusConnection.logger.info("Executing QUERY statement");
//                
//                // Execute the query and grab the result set
//                ResultSet resultSet = statement.executeQuery(sql);       
//                // Get the medatadata from the result set
//                ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
//                // Get the total number of columns in the result set
//                int columnsNumber = resultSetMetaData.getColumnCount();
//                
//                int maxDatabaseNameLength = MySQLUtils.maxDatabaseNameLength((com.mysql.jdbc.Connection) this.connection);
//                int lineTotalLenght = maxDatabaseNameLength + 4;
//
//                StringBuilder line = new StringBuilder();
//                line.append("+");
//                line.append(StringUtils.repeat("-", lineTotalLenght - 2));
//                line.append("+");
//                System.out.println(line);
//                                
//                SQLPlusConnection.logger.info("Printing the labels of the columns in the result");
//                // Loop through all of the columns. SQL columns begin from 1
//                for(int i = 1; i <= columnsNumber; i++) {
//                    // If there are more than 1 column
//                    if(i > 1) {
//                        System.out.print(" ");
//                    }
//                    // Print the label of the column
//                    line = new StringBuilder();
//                    line.append("| ");
//                    line.append(resultSetMetaData.getColumnLabel(i));
//                    line.append(StringUtils.repeat(" ", lineTotalLenght - 3 - resultSetMetaData.getColumnLabel(i).length()));
//                    line.append("|");
//                    System.out.println(line);
//                }
//                
//                line = new StringBuilder();
//                line.append("+");
//                line.append(StringUtils.repeat("-", lineTotalLenght - 2));
//                line.append("+");
//                System.out.println(line);
//                
//                System.out.println("");
//                
////                // While the are more rows to process
////                while (resultSet.next()) {
////                    // Loop through each column in each row
////                    for (int i = 1; i <= columnsNumber; i++) {
////                        // If thre are more than 1 column
////                        if(i > 1) {
////                            System.out.print("|  ");
////                        }
////                        // Get and print the current row value
////                        String columnValue = resultSet.getString(i);
////                        System.out.print(columnValue);
////                    }
////
////                    System.out.println("");
////                }
//                
//            }
//            else if(sql.contains("use")) {
//                statement.execute(sql);
//            }
//            else {//if(sql.contains("insert") || sql.contains("update") || sql.contains("delete")) {
//
//                net.sf.jsqlparser.statement.Statement parsedSql = null;
//                try {
//                    parsedSql = CCJSqlParserUtil.parse(sql);
//                } catch (JSQLParserException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }                
//                if(parsedSql instanceof Select) {
//                    SQLPlusConnection.logger.info("Found a select statement");
//                }
//            }
//            
//        } catch (SQLException sqle) {
//            // This exception can occur if the user entered an invalid query
//            SQLPlusConnection.logger.warn(Messages.WARNING + "The user entered an invalid query string");
//            SQLPlusConnection.logger.warn(Messages.ERROR + "ERROR" + Messages.SPACE + sqle.getErrorCode() + Messages.SPACE + "(" 
//                    + sqle.getSQLState() + "): " + sqle.getMessage());
//            System.out.println("ERROR" + Messages.SPACE + sqle.getErrorCode() + Messages.SPACE + "(" 
//                    + sqle.getSQLState() + "): " + sqle.getMessage());
//        }       

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
                // This exception might never occur, but it is good practice to handle it
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
      
    public static String getDefaultDatabase() { return SQLPlusConnection.DEFAULT_DATABASE; }

    public static String getDefaultPort() { return SQLPlusConnection.DEFAULT_PORT; }
    
    public static String getDefaultHost() { return SQLPlusConnection.DEFAULT_HOST; }

    @Override
    public String toString() {
        return "SQLPlusConnection [username=" + this.username + ", host=" + this.host + ", database=" 
                + this.database + ", port=" + this.port + "]";
    }

}
