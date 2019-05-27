package com.linkk.uc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uc")
public class UserController {
    @RequestMapping("test")
    public String test(){
        return "UC test!";
    }
}
