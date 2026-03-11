package com.mylearning.awsbeanstalkgitcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot App Running on AWS Elastic Beanstalk 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }
}