package com.vijay.springboot.restapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/hello-world")
	public String sayHelloWorld() {
		return "Hello-world";
	}
}
