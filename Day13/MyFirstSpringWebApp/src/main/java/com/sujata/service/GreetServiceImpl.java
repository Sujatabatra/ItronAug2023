package com.sujata.service;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceImpl implements GreetService{

    @Override
    public String greet() {
        return "Welcome to the world of Spring MVC";
    }
}
