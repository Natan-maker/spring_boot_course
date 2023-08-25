package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    private Coach mycoach;

    //caso queira trocar o saída no site (localhost:8080/dailyworkou)
    //basta trocar "bassebal" pelo inicio da outra classe contida
    //na pasta common
    @Autowired
    public void DemoController(@Qualifier("baseballCoach") Coach theChoach) {
        mycoach = theChoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return mycoach.getDailyWorkout();
    }
}
