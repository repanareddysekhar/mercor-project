package com.mercor.mercorproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/greet")
public class GreetController {

    @GetMapping
    public Map<String, String> greet() {
        return Map.of("message", "Hello from Spring Boot!");
    }
}
