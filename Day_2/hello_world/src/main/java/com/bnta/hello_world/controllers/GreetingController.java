package com.bnta.hello_world.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greeting") //localhost:8080/greeting?name=Annie
    public String greeting(@RequestParam (defaultValue = "world") String name){

        return "Hello " + name;
    }
}
