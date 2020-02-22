package com.vijay.springboot.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.springboot.restapp.model.User;
import com.vijay.springboot.restapp.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/users")
	public List<User> retrieveAllUsers(){
		return userService.findAll();
	}
	
	@GetMapping(path="/users/{id}")
	public User retrieveUserById(@PathVariable int id) {
		return userService.findOne(id);
	}
	
	
}
