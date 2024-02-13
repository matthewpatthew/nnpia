package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterController {
    private IGreetingService greetingService;

    @Autowired
    public void setGreetingService(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
