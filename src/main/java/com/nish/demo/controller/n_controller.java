package com.nish.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class n_controller {
    @GetMapping("/hello")
    public String sayHello() {
        return "<center><h1>Hello, how are you...?</h1><center>";
    }
}
