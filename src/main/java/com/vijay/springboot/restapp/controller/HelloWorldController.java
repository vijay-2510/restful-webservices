package com.vijay.springboot.restapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.springboot.restapp.model.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/hello-world")
	public String sayHelloWorld() {
		return "Hello-world";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean getHelloWorldBean() {
		return new HelloWorldBean("Hello-World-Bean");
	}
	
	@GetMapping(path = "/hello-world-path-variable/{name}")
	public HelloWorldBean getHelloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Path-Variable: %s", name));
	}
	
	
}
