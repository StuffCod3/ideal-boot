package com.stuff.ideal.controllers;

import com.stuff.ideal.models.Calculator;
import com.stuff.ideal.models.Rate;
import com.stuff.ideal.services.CalculatorService;
import com.stuff.ideal.services.RateService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
public class UserController {

    private final CalculatorService calculateService;
    private final RateService rateService;

    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("calc", new Calculator());
        model.addAttribute("rate", rateService.showAllRate());
        return "index";
    }

    @PostMapping("/calculate")
    public String Calculate(@ModelAttribute("calc") @Valid Calculator calculator,
                            BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("rate", rateService.showAllRate());
            return "index";
        }
        model.addAttribute("rate", rateService.showAllRate());
        model.addAttribute("result", "Цена: " + calculateService.calcSum(calculator, calculator.getCity()) + " руб.");
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
