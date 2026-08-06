package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from the sandbox";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name;
    }

    @GetMapping("/farewell/{name}")
    public String farewell(@PathVariable String name) {
        return "Goodbye, " + name;
    }

    @GetMapping("/shout/{name}")
    public String shout(@PathVariable String name) {
        return name.toUpperCase() + "!";
    }

}
