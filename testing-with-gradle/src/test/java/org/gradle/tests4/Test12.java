package org.gradle.tests4;

import org.junit.Test;

public class Test12 {
    @Test
    public void myTest() throws Exception {
        Thread.sleep(200);
        if (false) {
           org.junit.Assert.assertTrue(false);
        }
    }
}