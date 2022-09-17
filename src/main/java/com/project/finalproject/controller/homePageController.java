package com.project.finalproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homePageController {
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView=new ModelAndView("index");
        return modelAndView;
    }

    @RequestMapping("/signInCus")
    public String viewSignInCus() {
        return "signInCustomer";
    }


    @RequestMapping("/signInRe")
    public String viewSignInRe() {
        return "signInRecruiter";
    }

    @RequestMapping("/registerCus")
    public String viewRegisterCus() {
        return "registerCustomer";
    }

    @RequestMapping("/registerRe")
    public String registerRe() {
        return "registerRecruiter";
    }
}
