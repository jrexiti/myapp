package com.example.myapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FunRestController {

    // expose a "/" endpoint that returns "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/account")
    public String getAccount() {
        return "Welcome to your Account Page";
    }

    @GetMapping("/contactus")
    public String getDailyWorkout() {
        return "Contact us at";
    }
}
