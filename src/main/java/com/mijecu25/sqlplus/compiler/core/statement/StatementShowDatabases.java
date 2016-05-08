package com.mijecu25.sqlplus.compiler.core.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mijecu25.messages.Messages;
import com.mijecu25.utils.sql.mysql.MySQLUtils;

/**
 * This class represents the "show databases" SQL statements. It prints the databases found in the server.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.3
 */
public class StatementShowDatabases extends Statement {
    
    private ResultSet resultSet;
    
    private static final String STATEMENT = "show databases";
    
    private static final Logger logger = LogManager.getLogger(StatementShowDatabases.class);
    
    public StatementShowDatabases() {
        super(StatementShowDatabases.STATEMENT);
        StatementShowDatabases.logger.info("Parsed and created a ShowDatabasesStatement");
        this.resultSet = null;
    }
    
    @Override
    public void execute(Connection connection) throws SQLException {
        StatementShowDatabases.logger.info("Will execute the code to show the databases");
        
        // If the connection is null
        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            StatementShowDatabases.logger.fatal(Messages.FATAL + "The connection passed to execute the statement "
                    + "cannot be null");
            System.out.println(Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + Messages.SPACE
                    + "The connection passed to execute the statement cannot be null." + Messages.SPACE 
                    + Messages.CHECK_LOG_FILES);
            throw iae;
        }
                
        this.setConnection(connection);
        
        try {
            java.sql.Statement statement = this.getConnection().createStatement();
            this.resultSet = statement.executeQuery(this.getStatement());
            
            if(this.resultSet == null) {
                throw new SQLException();
            }
            // TODO add some checks to see if we should proceed to printing
            // TODO check how to handle the exception
            
            this.printResult();
            
            this.resultSet.close();
        }
        catch(SQLException sqle) {
            
        }
        

    }
    
    @Override
    protected void printResult() {
        StatementShowDatabases.logger.info("Printing the labels of the columns in the result");
        try{
            // Get the medatadata from the result set
            ResultSetMetaData resultSetMetaData;
            resultSetMetaData = this.resultSet.getMetaData(); 
        
            // Get the maximum database name length
            int maxDatabaseNameLength = MySQLUtils.maxDatabaseNameLength(this.getConnection());
            // The total length is added by 4 for the 2 borders and the 2 spaces on either side
            int lineTotalLenght = maxDatabaseNameLength + 4;
            // Print the horizontal border based on the length
            this.printHorizontalBorder(lineTotalLenght);
    
            // Print the label of the column
            StringBuilder line = new StringBuilder();
            String label = resultSetMetaData.getColumnLabel(1);
            
            line.append(StatementShowDatabases.VERTICAL_BORDERL + " ");
            line.append(label);
            line.append(StringUtils.repeat(" ", lineTotalLenght - 3 - label.length()));
            line.append(StatementShowDatabases.VERTICAL_BORDERL);
            
            System.out.println(line);
    
            // Print a border after the name of the column
            this.printHorizontalBorder(lineTotalLenght);
        
            // While the are more rows to process
            while (resultSet.next()) {
                // Get and print the current row value
                line = new StringBuilder();
                String row = this.resultSet.getString(1);
                
                line.append(StatementShowDatabases.VERTICAL_BORDERL + " ");
                line.append(row);
                line.append(StringUtils.repeat(" ", lineTotalLenght - 3 - row.length()));
                line.append(StatementShowDatabases.VERTICAL_BORDERL);
                
                System.out.println(line);
            }

            // Print a border after the all of the rows
            this.printHorizontalBorder(lineTotalLenght);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ShowDatabasesStatement [statement=" + this.getStatement() + "]";
    }

}
