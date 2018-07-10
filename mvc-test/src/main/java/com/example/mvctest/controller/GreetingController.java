package com.example.mvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        // with spring boot no need to write dispather servlet. view resolver is under templates        
        // look for template in templates folder 
        //  http://localhost:8080/greeting?name=User. 
        return "greeting";
    }

}