package org.example.testtasktelros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Добро пожаловать на главную страницу!";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
