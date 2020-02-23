package com.vijay.springboot.restapp.model;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {
	private int userId;
	@Size(min = 6, message = "Username should have atleast 6 characters")
	private String userName;
	@Past
	private Date dob;

	public User(int userId, String userName, Date dob) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.dob = dob;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
