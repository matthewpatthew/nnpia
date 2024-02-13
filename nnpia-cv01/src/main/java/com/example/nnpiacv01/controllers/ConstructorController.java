package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.GreetingService;
import com.example.nnpiacv01.services.IGreetingService;

public class ConstructorController {
    private final IGreetingService greetingService;

    public ConstructorController(IGreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
