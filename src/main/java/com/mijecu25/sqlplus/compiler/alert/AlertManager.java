package com.mijecu25.sqlplus.compiler.alert;

import com.mijecu25.messages.Messages;
import com.mijecu25.sqlplus.compiler.core.expression.Expression;
import com.mijecu25.sqlplus.compiler.core.statement.dml.StatementDML;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class that managers the ALERTS created by the user.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.9
 */
public class AlertManager {

    private static AlertManager INSTANCE;
    private static List<Alert> ALERTS;

    private static final Logger logger = LogManager.getLogger(AlertManager.class);

    private AlertManager() {
        AlertManager.ALERTS = new ArrayList<Alert>();
    }

    /**
     * Get an AlertManager.
     *
     * @return a singleton AlertManager.
     */
    public static AlertManager getManager() {
        if(AlertManager.INSTANCE == null) {
            AlertManager.logger.info("Creating a new AlertManager");
            AlertManager.INSTANCE = new AlertManager();
        }

        AlertManager.logger.info("Returning an AlertManager instance");

        return AlertManager.INSTANCE;
    }

    /**
     * Add an Alert object to the list of Alert objects maintained in the current session.
     *
     * @param alert the Alert created by an Alert statement.
     */
    public void addAlert(Alert alert) {
        if(alert == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The alert passed cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        if(AlertManager.getManager().ALERTS.contains(alert)) {
            AlertManager.logger.info("This alert has already been created");
            System.out.println(Messages.ERROR + "the alert has already been created");
        }
        else {
            AlertManager.logger.info("Adding a new alert");
            AlertManager.getManager().ALERTS.add(alert);
            System.out.println("Alert created");
        }
    }

    /**
     * Print a list of all of the created Alerts.
     */
    public void listAll() {
        AlertManager.logger.info("Listing all alerts");
        for(Alert alert : AlertManager.getManager().ALERTS) {
            System.out.println(alert);
        }

    }

    /**
     * List all the alerts that match the timing variable.
     *
     * @param timing when to execute the alert.
     *
     * @return a list of alerts that happen based on the timing
     */
    public List<Alert> listByTiming(String timing) {
        AlertManager.logger.info("Listing alerts by timing");
        if(timing == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The timing passed cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        if(!timing.toLowerCase().equals(Alert.AFTER.toLowerCase()) && !timing.toLowerCase()
                .equals(Alert.BEFORE.toLowerCase())) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The timing passed " + timing + " has to be either "
                    + Alert.BEFORE + " or " + Alert.AFTER);
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        List<Alert> timingList = new ArrayList<Alert>();

        for(Alert alert : AlertManager.getManager().ALERTS) {
            if(alert.getTiming().toLowerCase().equals(timing.toLowerCase())) {
                timingList.add(alert);
            }
        }

        return timingList;
    }

    /**
     * List all the alerts that match the dml action.
     *
     * @param dml action when to execute the alert.
     *
     * @return a list of alerts that happen based on the dml action
     */
    public List<Alert> listByDML(String dml) {
        AlertManager.logger.info("Listing alerts by DML");

        if(dml == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The dml passed cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        if(!dml.toLowerCase().equals(StatementDML.INSERT.toLowerCase())
                && !dml.toLowerCase().equals(StatementDML.UPDATE.toLowerCase())
                && !dml.toLowerCase().equals(StatementDML.DELETE.toLowerCase())) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The dml passed " + dml + " can either be "
                    + StatementDML.INSERT + ", " + StatementDML.UPDATE + ", or " + StatementDML.DELETE);
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        List<Alert> dmlList = new ArrayList<Alert>();

        for(Alert alert : AlertManager.getManager().ALERTS) {
            if(alert.getDML().toLowerCase().equals(dml.toLowerCase())) {
                dmlList.add(alert);
            }
        }

        AlertManager.logger.info(dmlList);

        return dmlList;
    }

    /**
     * List all the alerts that for the given table.
     *
     * @param table related to the alert.
     *
     * @return a list of alerts for a specific table.
     */
    public List<Alert> listByTable(Expression table) {
        AlertManager.logger.info("Listing alerts by DML");
        if(table == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The table passed cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        List<Alert> tableList = new ArrayList<Alert>();

        for(Alert alert : AlertManager.getManager().ALERTS) {
            if(alert.getTable().equals(table)) {
                tableList.add(alert);
            }
        }

        return tableList;
    }

    /**
     * Filter a list of alerts based on timing.
     *
     * @param alerts the list of alerts.
     * @param timing the timing to filter the alerts.
     *
     * @return a filtered list of alerts based on timing.
     */
    public static List<Alert> filterByTiming(List<Alert> alerts, String timing) {
        if(alerts == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The list of alerts passed cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        if(timing == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The timing passed cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        if(!timing.toLowerCase().equals(Alert.AFTER.toLowerCase()) && !timing.toLowerCase()
                .equals(Alert.BEFORE.toLowerCase())) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The timing passed " + timing + " has to be either "
                    + Alert.BEFORE + " or " + Alert.AFTER);
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        AlertManager.logger.info("Filtering a list of alerts by timing");

        List<Alert> timingList = new ArrayList<Alert>();

        for(Alert alert : alerts) {
            if(alert.getTiming().toLowerCase().equals(timing.toLowerCase())) {
                timingList.add(alert);
            }
        }

        return timingList;
    }

    /**
     * Filter a list of alerts based on a dml action.
     *
     * @param alerts the list of alerts.
     * @param dml the dml action to filter the alerts.
     *
     * @return a filtered list of alerts based on a dml action.
     */
    public static List<Alert> filterByDML(List<Alert> alerts, String dml) {
        if(alerts == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The list of alerts passed cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        if(dml == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The dml passed cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        if(!dml.toLowerCase().equals(StatementDML.INSERT.toLowerCase())
                && !dml.toLowerCase().equals(StatementDML.UPDATE.toLowerCase())
                && !dml.toLowerCase().equals(StatementDML.DELETE.toLowerCase())) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The dml passed " + dml + " can either be "
                    + StatementDML.INSERT + ", " + StatementDML.UPDATE + ", or " + StatementDML.DELETE);
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        AlertManager.logger.info("Filtering a list of alerts by dml action");

        List<Alert> dmlList = new ArrayList<Alert>();

        for(Alert alert : alerts) {
            if(alert.getDML().toLowerCase().equals(dml.toLowerCase())) {
                dmlList.add(alert);
            }
        }

        return dmlList;
    }

    /**
     * Filter a list of alerts based on a table.
     *
     * @param alerts the list of alerts.
     * @param table the table to filter the alerts.
     *
     * @return a filtered list of alerts based on a table.
     */
    public static List<Alert> filterByTable(List<Alert> alerts, Expression table) {
        if(alerts == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The list of alerts passed cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        if(table == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The table passed cannot be null");
            System.out.println(Messages.FATAL + Messages.FATAL_EXCEPTION_ACTION(iae.getClass().getSimpleName()) + " "
                    + Messages.CHECK_LOG_FILES);
            AlertManager.logger.warn(Messages.WARNING + "Throwing a " + iae.getClass().getSimpleName()
                    + " to the calling class");
            throw iae;
        }

        AlertManager.logger.info("Filtering a list of alerts by table");

        List<Alert> tableList = new ArrayList<Alert>();

        for(Alert alert : alerts) {
            if(alert.getTable().toString().toLowerCase().equals(table.toString().toLowerCase())) {
                tableList.add(alert);
            }
        }

        return tableList;
    }

    /**
     * Delete all of the created Alerts.
     */
    public void clearAll() {
        AlertManager.getManager().ALERTS.clear();
        AlertManager.logger.info("Cleared alerts");
        System.out.println("Cleared alerts");
    }

    @Override
    public String toString() { return "AlertManager []"; }
}
