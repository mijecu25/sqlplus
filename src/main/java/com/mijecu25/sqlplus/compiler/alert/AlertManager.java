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
 * @version 0.1.0.6
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
        System.out.println(AlertManager.getManager().ALERTS);
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
