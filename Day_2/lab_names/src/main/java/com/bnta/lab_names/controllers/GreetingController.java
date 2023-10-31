package com.bnta.lab_names.controllers;

import com.bnta.lab_names.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping(value = "/greetings")
public class GreetingController {
    @GetMapping
//    public String greeting(@RequestParam(defaultValue = "world") String name){
//        return String.format("Good afternoon %s!", name);
    public Greeting newGreeting(){
        Greeting greeting = new Greeting("Annie", LocalTime.of(15,12,30));
        return greeting;
    }
}
