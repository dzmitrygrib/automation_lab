package com.qaprosoft.social_network.user;

public class Admin extends User {
	
	public Admin() {
		System.out.println("Admin created");
	}
	
	public Admin(String userID, String userName, String login, String password) {
		super(userID, userName, login, password);
		System.out.println("Admin " + this.getName() + " created");
	}
	
	
	public void makeUserAnAdmin(User user) {
		if (this instanceof Admin) {
			Admin newAdmin = new Admin(user.getUserID(), user.getName(), user.getLogin(), user.getPassword());
		}
	}
	
}
