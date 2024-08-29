package com.example.getstring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class MyController {

    @GetMapping("/")
    public String welcomemsg() {
        return "Welcome to Spring Boot";
    }

    @GetMapping("/name")
    public String welcomename() {
        return "Ashok Kumar";
    }

}