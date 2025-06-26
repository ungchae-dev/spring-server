package com.example.spring_server;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AppController {
    
    @GetMapping("/")
    public String home() {
        return "Hello World~";
    }
    

}
