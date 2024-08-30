package com.example.myapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {

    @Value("${accountHolder.name}")
    private String userName;

    @Value("${accountHolder.age}")
    private String age;

    // expose a "/" endpoint that returns "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/account")
    public String getAccount() {
        return "Welcome to your Account Page: " + userName + " " + "age" + ": " + age;
    }

    @GetMapping("/contactus")
    public String getDailyWorkout() {
        return "Contact us at";
    }
}
