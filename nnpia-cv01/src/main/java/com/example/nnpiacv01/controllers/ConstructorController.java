package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.service.IGreetingService;

public class ConstructorController {
    private final IGreetingService greetingService;

    public ConstructorController(IGreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
