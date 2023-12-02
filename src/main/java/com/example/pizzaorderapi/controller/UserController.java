package com.example.pizzaorderapi.controller;

import com.example.pizzaorderapi.service.UserService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Path("/user")
public class UserController {

    @Inject
    UserService userService;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseEntity<?> GetAllUser(){

        return ResponseEntity.ok().build();
    }
}
