package io.kubesphere.devops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("Really appreciate your star, that's the power of our life.And if you are not happy now , go and try coding Java.", new HelloWorldController().sayHello());
    }
}
