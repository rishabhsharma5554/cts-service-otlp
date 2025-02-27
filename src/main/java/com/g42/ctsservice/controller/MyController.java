package com.g42.ctsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MyController {

    @GetMapping("/home")
    public String getHome()
    {
        return UUID.randomUUID().toString();
    }
}
