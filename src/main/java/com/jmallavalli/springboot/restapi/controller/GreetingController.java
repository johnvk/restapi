package com.jmallavalli.springboot.restapi.controller;

import com.jmallavalli.springboot.restapi.model.GreetBean;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class GreetingController {

    private final MessageSource messageSource;

    public GreetingController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping(path = "/hello")
    public String greet() {
        return "Hello and welcome to the world of Spring Boot!";
    }

    @GetMapping(path = "/hellov2")
    public String greetI18n() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("greeting.msg", null, "Default Greeting Message", locale);
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
