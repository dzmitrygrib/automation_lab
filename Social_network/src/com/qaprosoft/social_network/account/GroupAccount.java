package com.qaprosoft.social_network.account;

import java.util.LinkedList;

import com.qaprosoft.social_network.user.User;

public class GroupAccount extends Account {
	
	private static final long serialVersionUID = 1L;
	private LinkedList<User> admins = new LinkedList<User>();
	private LinkedList<User> members = new LinkedList<User>();
	
	public GroupAccount(User user) {
		super(user);
		this.admins.add(user);
		System.out.println("Group account for " + user.getName() + " created");
	}
	
	public void addAdmin(User newAdmin) {
		this.admins.add(newAdmin);
		System.out.println("Admin " + newAdmin.getName() + " added");
	}
	
	public LinkedList<User> getAdminList() {
		return this.admins;
	}
	
	public void addMember(User newMember) {
		this.members.add(newMember);
		System.out.println("Member " + newMember.getName() + " added");
	}
	
	public LinkedList<User> getMemberList() {
		return this.members;
	}

	@Override
	public void edit() {
		System.out.println("Edit group page");
	}

	@Override
	public void delete() {
		System.out.println("Page deleted");
	}

}
