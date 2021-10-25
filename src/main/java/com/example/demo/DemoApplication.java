package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    //spring change again

    @GetMapping("/hello-change")
    String greet(){
        return "Hello, Spring!";
    }

    //feature 009
    //a commit to squash

    @PostMapping("/test")
    String test(){
        return "test";
    }
}
