package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController 
{
	@RequestMapping("/homePage")
	public String homePage()
	{
		return "home";
	}
}
