package com.harwi.java.SprintBootAppDEmo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCon {
	
	@GetMapping("/home")
	public String home()
	{
		return "This is harwi";
	}
}
