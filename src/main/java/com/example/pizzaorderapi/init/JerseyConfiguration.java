package com.example.pizzaorderapi.init;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/api/v1")
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        register(HelloController.class);
    }
}
