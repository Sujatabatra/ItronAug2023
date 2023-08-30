package com.sujata.controller;

import com.sujata.bean.MovieDetails;
import com.sujata.service.MovieRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MovieRatingController {

    @Autowired
    MovieRatingService movieRatingService;

    @RequestMapping("/")
    public ModelAndView getMainPageController(){
        return new ModelAndView("InputPage");
    }

    @RequestMapping("/showDetails")
    public ModelAndView showMovieRatingDetailsController(HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
        List<MovieDetails> movieDetailsList=movieRatingService.getMovieDetails(request.getParameter("userId"));

        modelAndView.addObject("movieRatingDetails",movieDetailsList);
        modelAndView.setViewName("ShowDetails");

        return modelAndView;
    }

}
