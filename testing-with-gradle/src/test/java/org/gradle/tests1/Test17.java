package org.gradle.tests1;

import org.junit.Test;

public class Test17 {
    @Test
    public void myTest() throws Exception {
        Thread.sleep(200);
        if (false) {
           org.junit.Assert.assertTrue(false);
        }
    }
}