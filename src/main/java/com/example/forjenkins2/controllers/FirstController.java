package com.example.forjenkins2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hello1")
    public String test1(){
        return "Hello World!";
    }

    @GetMapping("/hello2")
    public String test2(){
        return "Hello World --- 2 !";
    }

    @GetMapping("/hello3")
    public String test3(){
        return "Hello World --- 3 !";
    }
}
