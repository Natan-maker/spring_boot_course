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
    private Coach anothercoach;

    //caso queira trocar a saída no site (localhost:8080/dailyworkout)
    //basta trocar "bassebal" pelo inicio da outra classe contida
    //na pasta common
    @Autowired
    public void DemoController(@Qualifier("cricketCoach") Coach theChoach,
                               @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In Constructor=" + getClass().getSimpleName());
        mycoach = theChoach;
        anothercoach = theAnotherCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return mycoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: my coach == anotherCoach " + (mycoach == anothercoach);
    }
}


