package com.sujata.controller;

import com.sujata.entity.User;
import com.sujata.service.UserService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@SessionAttributes({"user"})
public class UserController {

    @Autowired
    private UserService userService;
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/")
    public ModelAndView getLoginPageController(){

        logger.info("Showing Login Page for login by the user");
        return new ModelAndView("login","command",new User());
    }

    @RequestMapping("/login")
    public ModelAndView loginCheckController(@ModelAttribute("command") User usr/*, HttpSession session*/){
        ModelAndView modelAndView=new ModelAndView();
//        User usr=new User(request.getParameter("uname"),request.getParameter("pwd"));
        User user=userService.loginUser(usr);
        if(user!=null){
            modelAndView.addObject("user",user);  //request scope
//            session.setAttribute("user",user);
            modelAndView.setViewName("menu");
            logger.info("Login sucessful and showing menu page");
        }
        else{
            modelAndView.addObject("message","Login Failed");
            modelAndView.setViewName("login");
            logger.error("Login failed");
        }
//    @RequestMapping("/login")
//    public ModelAndView loginCheckController(HttpServletRequest request, HttpSession session){
//        ModelAndView modelAndView=new ModelAndView();
//        User usr=new User(request.getParameter("uname"),request.getParameter("pwd"));
//        User user=userService.loginUser(usr);
//        if(user!=null){
//            modelAndView.addObject("user",user);  //request scope
//            session.setAttribute("user",user);
//            modelAndView.setViewName("menu");
//        }
//        else{
//            modelAndView.addObject("message","Login Failed");
//            modelAndView.setViewName("login");
//        }



        return modelAndView;
    }
}