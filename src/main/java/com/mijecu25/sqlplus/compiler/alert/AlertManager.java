package com.mijecu25.sqlplus.compiler.alert;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class that managers the alerts created by the user.s
 *
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.2
 */
public class AlertManager {

    private static AlertManager INSTANCE;

    public static List<Alert> alerts;

    private static final Logger logger = LogManager.getLogger(AlertManager.class);

    private AlertManager() {
        AlertManager.alerts = new ArrayList<Alert>();
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

        AlertManager.logger.info("Returning an AlertManager instance " + AlertManager.INSTANCE);

        return AlertManager.INSTANCE;
    }

    // TODO list all
    // TODO clear all
}
