package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.GreetingService;
import com.example.nnpiacv01.services.IGreetingService;

public class MyController {
    private final IGreetingService greetingService;

    public MyController(IGreetingService greetingService){
        this.greetingService = greetingService;
    }

    public MyController(){
        greetingService = new GreetingService();
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
