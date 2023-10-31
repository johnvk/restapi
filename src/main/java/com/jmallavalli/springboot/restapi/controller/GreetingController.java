package com.jmallavalli.springboot.restapi.controller;

import com.jmallavalli.springboot.restapi.model.GreetBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping(path = "/hello")
    public String greet() {
        return "Hello and welcome to the world of Spring Boot!";
    }

    @GetMapping(path = "/helloBean")
    public GreetBean greetBean() {
        return new GreetBean("Hello and welcome to the world of Spring Boot!");
    }

    @GetMapping(path = "/helloBean/{name}")
    public GreetBean greetBeanWithName(@PathVariable String name) {
        return new GreetBean(String.format("Hello %s, welcome to the world of Spring Boot!", name));
    }
}
