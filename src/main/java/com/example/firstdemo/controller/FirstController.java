package com.example.firstdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping("/test")
    public String test(String id) {
        return "hello,springboot, id:" + id;
    }
}
