package com.example.pizzaorderapi.init;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.springframework.stereotype.Component;

@Path("/hello")
@Component
public class HelloController {

    @GET()
    @Produces("Application/json")
    public String hello(){
        return "hello";
    }
}
