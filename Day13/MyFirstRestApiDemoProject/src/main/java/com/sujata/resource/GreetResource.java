package com.sujata.resource;

import com.sujata.service.GreetWelcome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetResource {

    @Autowired
    private GreetWelcome greetWelcome;

    @GetMapping(path = "/greetOne",produces = MediaType.TEXT_PLAIN_VALUE)
    public String wishResource(){
        return greetWelcome.wish();
    }

    @GetMapping(path = "/greetTwo",produces = MediaType.TEXT_HTML_VALUE)
    public String wishResourceTwo(){
        return greetWelcome.wish();
    }
}
