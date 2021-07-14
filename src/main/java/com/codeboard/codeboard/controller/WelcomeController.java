package com.codeboard.codeboard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/getname")
	public String getName()
	{
		return "Welcome ..";
	}

}
