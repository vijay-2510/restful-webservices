package com.vijay.springboot.restapp.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vijay.springboot.restapp.exception.UserNotFoundException;
import com.vijay.springboot.restapp.model.User;
import com.vijay.springboot.restapp.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(path = "/users")
	public List<User> retrieveAllUsers() {
		return userService.findAll();
	}

	@GetMapping(path = "/users/{id}")
	public User retrieveUserById(@PathVariable int id) throws UserNotFoundException {
		
		User user = userService.findOne(id);
		if(user == null) {
			throw new UserNotFoundException("User Id: "+id+" not found");
		}
		
		
		return  user;
	}

	@PostMapping(path = "/users")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User savedUser = userService.save(user);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getUserId())
				.toUri();
		
		return ResponseEntity.created(uri).build();
	}

}
