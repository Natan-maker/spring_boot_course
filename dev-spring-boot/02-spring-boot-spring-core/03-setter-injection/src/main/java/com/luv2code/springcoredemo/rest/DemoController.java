package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    private Coach mycoach;

    @Autowired
    public void seCoach(Coach theChoach) {
        mycoach = theChoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return mycoach.getDailyWorkout();
    }
}
