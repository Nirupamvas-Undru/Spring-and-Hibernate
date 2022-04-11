package com.nirupam.springdemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component // default bean id
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
