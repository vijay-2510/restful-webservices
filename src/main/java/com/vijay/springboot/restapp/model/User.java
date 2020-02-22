package com.vijay.springboot.restapp.model;

import java.util.Date;

public class User {
	private int userId;
	private String userName;
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
