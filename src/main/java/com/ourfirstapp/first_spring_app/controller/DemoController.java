package com.ourfirstapp.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@ResponseBody
@RequestMapping("/demo/apis")
public class DemoController {

    @GetMapping("/demo1")
    public String getDemo1(){
        System.out.println("First API demo1");
        return "Our first Demo1 API";
    }

    @GetMapping("/demo2")
    public String getDemo2(){
        System.out.println("First API demo2");
        return "Our first Demo2 API";
    }
}
