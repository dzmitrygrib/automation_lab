package com.qaprosoft.social_network.user;

import java.io.Serializable;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@XmlAttribute(required = true)
	private String userID = "DefaultID";
	@XmlElement(name = "username")
	private String userName = "DefaultName";
	@XmlElement
	private String login = "DefaultLogin";
	@XmlElement
	private String password = "DefaultPassword";
	@XmlElement(name = "marital_status")
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
		System.out.println("User ID set to: " + userID);
	}
	
	public String getName() {
		return this.userName;
	}
	public void setName(String userName) {
		this.userName = userName;
		System.out.println("User name set to: " + userName);
	}
	
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
		System.out.println("User login set to: " + login);
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
		System.out.println("User password set to: " + password);
	}
	
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
		System.out.println("User marital status set to: " + maritalStatus);
	}
	public MaritalStatus getMaritalStatus() {
		return this.maritalStatus;
	}

	@Override
	public String toString() {
		return "User [userID = " + userID + ", userName = " + userName + ", login = " + login
				+ ", password = " + password
				+ ", maritalStatus = " + maritalStatus + "]";
	}
	
}
