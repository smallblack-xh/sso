package com.linkk.server2.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/s2")
public class S2Controller {

    @RequestMapping("test")
    public String test(){
        return "S2 TEST!";
    }
}
