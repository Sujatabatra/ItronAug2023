package com.sujata.service;

import org.springframework.stereotype.Service;

@Service
public class GreetWelcome implements Greet{
    @Override
    public String wish() {
        return "<h1>Welcome to the world of Rest API<h1>";
    }
}
