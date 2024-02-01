package com.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	private String userName;
	private String email;
	private long contact;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String email, long contact, String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.contact = contact;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", contact=" + contact
				+ ", password=" + password + "]";
	}
	
}
