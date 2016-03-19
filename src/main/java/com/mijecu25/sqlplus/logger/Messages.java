package com.mijecu25.sqlplus.logger;

/**
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
 *
 */
public abstract class Messages {
    
    public static final String SPACE = " ";
    public static final String WARNING = "WARNING: ";
    public static final String ERROR = "ERROR: ";
    public static final String FATAL = "FATAL: ";
    public static final String CHECK_LOG_FILES = "Please check the log files.";
    public static final String QUIT_ERROR = "Quitting SQLPlus because of an error";
    
    /**
     * 
     * @param exception
     * @return
     */
    public static final String FATAL_EXCEPTION_ACTION(String exception) {
        return "There was a " + exception + " when your last action was executed.";
    }
    
    /**
     * 
     * @param exception
     * @return
     */
    public static final String FATAL_EXIT(String exception) {
        return "Exiting SQLPlus because of a " + exception;
    }
}
