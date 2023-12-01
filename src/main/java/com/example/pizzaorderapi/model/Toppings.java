package com.example.pizzaorderapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "pizza_toppings")
public class Toppings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long toppingId;
    String topping_name;
    String price;
    Long cheese_level;
    Boolean well_done;
}
