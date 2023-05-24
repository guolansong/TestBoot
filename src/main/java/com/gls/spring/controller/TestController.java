package com.gls.spring.controller;

import com.gls.spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService ts;

    @RequestMapping("/find")
    public ModelAndView find(){
        ModelAndView modelAndView = new ModelAndView();

        ts.find();

        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping("/hello")
    public ModelAndView hello(){
        System.out.println("Hello");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");

        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login(){
        System.out.println("Login");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
}
