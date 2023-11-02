package com.bnta.lab_names.models;

import java.time.LocalTime;

public class Greeting {
    private String name;
    private LocalTime timeOfDay;


    //my constructor

    public Greeting(String name, LocalTime timeOfDay) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    //default constructor

    public Greeting() {
    }


    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(LocalTime timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
