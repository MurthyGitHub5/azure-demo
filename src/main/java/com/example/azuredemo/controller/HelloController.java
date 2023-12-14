package com.example.azuredemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to Azure Web App after Editing !!!";
    }
}
