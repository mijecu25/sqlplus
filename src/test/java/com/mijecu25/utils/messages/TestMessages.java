package com.mijecu25.utils.messages;

import org.junit.Assert;
import org.junit.Test;

import com.mijecu25.utils.messages.Messages;

/**
 * Test for Messages class.
 * 
 * @author Miguel Velez - miguelvelezmj25
 * @version 0.1.0.1
 */
public class TestMessages {
    
    /**
     * Test FATAL_EXCEPTION_ACTION.
     */
    @Test
    public void message1() {
        // Assert that the method returns something
        Assert.assertNotNull(Messages.FATAL_EXCEPTION_ACTION("Some exception"));
    }
    
    /**
     * Test FATAL_EXIT
     */
    @Test
    public void message2() {
        // Assert that the method returns something
        Assert.assertNotNull(Messages.FATAL_EXIT("Some exception"));
    }

}
