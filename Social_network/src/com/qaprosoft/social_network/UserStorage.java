package com.qaprosoft.social_network;

import java.util.ArrayList;

import com.qaprosoft.social_network.user.User;

public class UserStorage {
	
	private volatile ArrayList<User> userList = new ArrayList<User>();
	
	public void addUser(User user) {
		this.userList.add(user);
	}
	
	public ArrayList<User> getUserList() {
		return this.userList;
	}

}
