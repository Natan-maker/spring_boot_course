package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TenninCoach implements  Coach{
    public TenninCoach() {
        System.out.println("In Constructor=" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }
}
