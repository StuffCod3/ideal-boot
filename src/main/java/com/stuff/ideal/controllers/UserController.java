package com.stuff.ideal.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class UserController {

    //Getters
    @GetMapping("/")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @GetMapping("/auto")
    public String autoPage(){
        return "auto";
    }

    @GetMapping("/air")
    public String aviaPage(){
        return "avia";
    }

    @GetMapping("/services")
    public String servicesPage(){
        return "services";
    }

    @GetMapping("/rates")
    public String ratesPage(){
        return "tarifs";
    }

    @GetMapping("/request")
    public String requestPage(){
        return "request";
    }
}
