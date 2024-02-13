package com.example.nnpiacv01.services;

import com.example.nnpiacv01.services.IGreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Greeting from service";
    }
}
