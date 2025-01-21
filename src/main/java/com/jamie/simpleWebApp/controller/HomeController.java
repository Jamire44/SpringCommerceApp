package com.jamie.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String Hello() {
        return "Welcome to Home Page!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "The about page";
    }

}
