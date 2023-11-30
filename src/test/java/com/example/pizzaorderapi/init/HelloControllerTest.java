package com.example.pizzaorderapi.init;

import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloControllerTest {

    @Inject
    HelloController helloController;

    @Test
    public void test_hello_positive() {

        String response = helloController.hello();
        assertNotNull(response);
        assertEquals("hello", response);
    }

}