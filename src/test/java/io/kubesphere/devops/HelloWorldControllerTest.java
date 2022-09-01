package io.kubesphere.devops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("======= (｡･ω･｡)ﾉ♡ =====Really appreciate your star, that's the power of our life.====== (ง •̀_•́)ง ======The aroma of JAVA always cheers us up====== (~_~;) ======.", new HelloWorldController().sayHello());
    }
}
