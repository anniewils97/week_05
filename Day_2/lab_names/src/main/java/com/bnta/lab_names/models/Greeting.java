package com.bnta.lab_names.models;

import java.time.LocalTime;

public class Greeting {
    private String name;
    private LocalTime timeOfDay;

    //default constructor



    //my constructor

    public Greeting(String name, LocalTime timeOfDay) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

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
