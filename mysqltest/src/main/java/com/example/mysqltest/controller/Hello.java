package com.example.mysqltest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {
	
	@GetMapping(path="/welcome")
	public String welcome() {
		return "hi";
	}

}
