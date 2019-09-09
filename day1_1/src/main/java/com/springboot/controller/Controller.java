package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/a")
    public  String getlist(){
        System.out.println(1/0);
        return "世界和平";
    }
}
