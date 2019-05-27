package com.linkk.server1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/s1")
public class S2Controller {
    
    @RequestMapping("test")
    public String test(){
        return "S1 TEST!";
    }
}
