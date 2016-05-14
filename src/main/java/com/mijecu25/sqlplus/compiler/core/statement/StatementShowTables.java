package com.mijecu25.sqlplus.compiler.core.statement;

import com.mijecu25.messages.Messages;
import com.mijecu25.utils.sql.mysql.MySQLUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class StatementShowTables extends Statement {

    private ResultSet resultSet;

    private static final String STATEMENT = "show tables";

    private static final Logger logger = LogManager.getLogger(StatementShowTables.class);

    public StatementShowTables() {
        super(StatementShowTables.STATEMENT);
        StatementShowTables.logger.info("Parsed and created a ShowTablesStatement");
        this.resultSet = null;
    }

    @Override
    public void execute(Connection connection) throws SQLException {
        StatementShowTables.logger.info("Will execute the code to show the databases");

        // If the connection is null
        if(connection == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            StatementShowTables.logger.fatal(Messages.FATAL + "The connection passed to execute the statement "
                    + "cannot be null");
            System.out.println(Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + Messages.SPACE
                    + "The connection passed to execute the statement cannot be null." + Messages.SPACE
                    + Messages.CHECK_LOG_FILES);
            throw iae;
        }

        // Set the connection
        this.setConnection(connection);

        try {
            java.sql.Statement statement = this.getConnection().createStatement();
            this.resultSet = statement.executeQuery(this.getStatement());

            if(this.resultSet == null) {
                throw new SQLException();
            }

            this.printResult();

            this.resultSet.close();
        }
        catch(SQLException sqle) {
            // This
            StatementShowTables.logger.warn(Messages.WARNING + "Error when executing " + this, sqle);
            System.out.println(Messages.WARNING + sqle.getMessage());

            StatementShowTables.logger.warn(Messages.WARNING + "Throwing a " + sqle.getClass().getSimpleName() + " to the calling class");
            throw new SQLException();
        }
    }

    @Override
    protected void printResult() {
        try{
            // Get the metadata from the result set
            ResultSetMetaData resultSetMetaData;
            resultSetMetaData = this.resultSet.getMetaData();

            String label = resultSetMetaData.getColumnLabel(1);

            // Get the maximum database name length
            int maxDatabaseNameLength = MySQLUtils.maxTableNameLength(this.getConnection());

            maxDatabaseNameLength = Math.max(maxDatabaseNameLength, label.length());

            // The total length is added by 4 for the 2 borders and the 2 spaces on either side
            int lineTotalLenght = maxDatabaseNameLength + 4;
            // Print the horizontal border based on the length
            this.printHorizontalBorder(lineTotalLenght);

            // Print the label of the column
            StringBuilder line = new StringBuilder();


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
}
