package org.gradle.tests3;

import org.junit.Test;

public class Test14 {
    @Test
    public void myTest() throws Exception {
        Thread.sleep(200);
        if (false) {
           org.junit.Assert.assertTrue(false);
        }
    }
}