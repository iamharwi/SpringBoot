package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
 class HelloController {
	
	public Student c;
	
	@GetMapping("/hello")
	public String hello()
	{
		return "This is controller Hello";
	}
	@GetMapping
	public String hi()
	{
		return "This is controller Hi";
	}
	@GetMapping("/login")
	public String login()
	{
		return "You are logged in ";
	}
	@GetMapping("/loggout")
	public String loggout()
	{
		return "You are logged out now";
	}
	
}
