package com.sujata.controllers;

import com.sujata.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {
    @Autowired
    private GreetService greetService;

    @RequestMapping("/")
    public ModelAndView myFirstController(){
        String message=greetService.greet();

        ModelAndView modelAndView=new ModelAndView();

        modelAndView.addObject("message",message);
        modelAndView.setViewName("output");

        return modelAndView;
    }

    @RequestMapping("/second")
    public ModelAndView mySecondController(){
        String message=greetService.greet();

        ModelAndView modelAndView=new ModelAndView();

        modelAndView.addObject("message","hello from second controller");
        modelAndView.setViewName("output");

        return modelAndView;
    }
}
