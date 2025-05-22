package com.ourfirstapp.first_spring_app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@ResponseBody
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/sample1")
    public String getSample1(){
        System.out.println("First API sample1");
        return "Our first Sample1 API";
    }

    @GetMapping("/sample2")
    public String getSample2(){
        System.out.println("First API sample2");
        return "Our first Sample2 API";
    }
}
