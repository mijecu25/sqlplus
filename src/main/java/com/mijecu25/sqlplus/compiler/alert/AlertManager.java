package com.mijecu25.sqlplus.compiler.alert;

import com.mijecu25.messages.Messages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class that managers the ALERTS created by the user.
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.8
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
     * TODO
     * @param timing
     * @return
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

        List<Alert> timingList = new ArrayList<Alert>();

        for(Alert alert : AlertManager.getManager().ALERTS) {
            if(alert.getTiming().toLowerCase().equals(timing.toLowerCase())) {
                timingList.add(alert);
            }
        }

        return timingList;
    }

    /**
     * TODO
     * @param dml
     * @return
     */
    public List<Alert> listByDML(String dml) {
        AlertManager.logger.info("Listing alerts by DML");
        if(dml == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            AlertManager.logger.fatal(Messages.FATAL + "The DML passed cannot be null");
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
     * TODO
     * @param table
     * @return
     */
    public List<Alert> listByTable(String table) {
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
