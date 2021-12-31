package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myRestService {

    @GetMapping("/greet/{Name}")
    public Greeting displayMessage(@PathVariable  String Name)
    {
        return new Greeting(Name);
    }
}
