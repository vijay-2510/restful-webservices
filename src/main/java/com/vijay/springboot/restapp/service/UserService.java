package com.vijay.springboot.restapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vijay.springboot.restapp.model.User;

@Repository
public class UserService {
	static List<User> users = new ArrayList<>();
	static int idCount = 0;

	static {
		users.add(new User(++idCount, "Vijay", new Date()));
		users.add(new User(++idCount, "Aakash", new Date()));
		users.add(new User(++idCount, "Rahul", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		user.setUserId(++idCount);
		users.add(user);
		return user;
	}

	public User findOne(int id) {
		for (User u : users) {
			if (u.getUserId() == id) {
				return u;
			}

		}
		return null;
	}

	public User deleteById(int id) {
		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			User user = (User) it.next();
			if (user.getUserId() == id) {
				users.remove(user);
				return user;
			}
		}
		return null;

	}
}
