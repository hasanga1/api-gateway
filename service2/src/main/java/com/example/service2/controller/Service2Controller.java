package com.example.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Service 2!";
    }
}