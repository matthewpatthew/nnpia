package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.service.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorControllerTest {

    ConstructorController constructorController;

    @BeforeEach
    void setUp() {
        constructorController = new ConstructorController(new GreetingService());
    }

    @Test
    void sayHello() {
        System.out.println(constructorController.sayHello());
    }
}