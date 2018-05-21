package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/toRegister")
    public String  TestController(){
    	System.out.print("test success");
    	return "success";
    }
}
