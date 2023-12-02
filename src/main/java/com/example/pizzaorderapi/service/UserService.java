package com.example.pizzaorderapi.service;

import com.example.pizzaorderapi.model.UserModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {

    public List<UserModel> getAllUsers();
}
