package com.rogelio.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello") //Get request to http://localhost:8080/hello?name=Rogelio
    public String sayHello(@RequestParam(defaultValue = "World") String name, Model model){
        model.addAttribute("user",name);
        return "welcome"; //view is src/main/resources/templates/welcome.html
    }
}
