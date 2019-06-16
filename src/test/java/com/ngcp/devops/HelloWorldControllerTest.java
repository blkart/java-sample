package com.ngcp.devops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("Hello,world!",new HelloWorldController().sayHello());
    }
}
