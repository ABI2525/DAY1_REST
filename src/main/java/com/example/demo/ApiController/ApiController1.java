package com.example.demo.ApiController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController1 {
    @Value("${var}")
    private String name;
    @GetMapping("/welcome")
    public String Welcome()
    {
       return name;
    }
}
