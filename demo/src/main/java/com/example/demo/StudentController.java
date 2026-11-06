package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Rohit, tuza pahila project successful run zala!";
    }
}