package org.gradle.tests0;

import org.junit.Test;

public class Test10 {
    @Test
    public void myTest() throws Exception {
        Thread.sleep(5);
        if (false) {
           org.junit.Assert.assertTrue(false);
        }
    }
}