package com.qaprosoft.social_network.user;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String userID = "DefaultID";
	private String userName = "DefaultName";
	private String login = "DefaultLogin";
	private String password = "DefaultPassword";
	
	private MaritalStatus maritalStatus = MaritalStatus.SINGLE;
	
	public User() {
		System.out.println("Default user created");
	}
	
	public User(String userID, String userName, String login, String password) {
		this.userID = userID;
		this.userName = userName;
		this.login = login;
		this.password = password;
		System.out.println("User " + this.userName + " created");
	}
	
	public String getUserID() {
		return this.userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getName() {
		return this.userName;
	}
	public void setName(String userName) {
		this.userName = userName;
		System.out.println("User name set to " + userName);
	}
	
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public MaritalStatus getMaritalStatus() {
		return this.maritalStatus;
	}
	
	@Override
	public String toString() {
		return "User " + this.userName + " with name: " + this.userName;
	}
}
