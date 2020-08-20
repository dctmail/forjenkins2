package com.example.forjenkins2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hello1")
    public String test1(){
        return "Hello World!";
    }
}
