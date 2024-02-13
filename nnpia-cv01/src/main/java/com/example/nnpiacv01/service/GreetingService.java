package com.example.nnpiacv01.service;

public class GreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Greeting from service";
    }
}
