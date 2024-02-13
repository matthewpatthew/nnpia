package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.service.IGreetingService;

public class PropertyController {

    IGreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
