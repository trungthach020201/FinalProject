package com.project.finalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class customerController {
    @GetMapping("/customer")
    public ModelAndView logInCustomer() {
        ModelAndView modelAndView=new ModelAndView("logInCustomer");
        return modelAndView;
    }
}
