package com.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {

	@RequestMapping("/customDate")
	public String CustomDate(Date date){
		System.out.println("date="+date);
		return "success";
	}

}
