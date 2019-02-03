package com.qaprosoft.social_network.account;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.qaprosoft.social_network.account.messages.Dialogue;
import com.qaprosoft.social_network.user.User;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalAccount")
public class PersonalAccount extends Account {
	
	private static final long serialVersionUID = 1L;
	@XmlElement
	private User owner;
	@XmlElement
	private ArrayList<Dialogue> dialogues = new ArrayList<Dialogue>();
	@XmlElement
	private ArrayList<User> friends = new ArrayList<User>();

	public PersonalAccount(User user) {
		super(user);
		this.owner = user;
		System.out.println("Personal account for " + user.getName() + " created");
	}
	
	public User getOwner() {
		return this.owner;
	}
	
	public void addDialogue(PersonalAccount pa) {
		this.dialogues.add(new Dialogue(this.owner, pa.getOwner()));
	}
	
	public ArrayList<Dialogue> getDialogueList() {
		return this.dialogues;
	}
	
	public void addFriend(User newFriend) {
		this.friends.add(newFriend);
		System.out.println("Friend " + newFriend.getName() + " added");
	}
	
	public ArrayList<User> getFriendList() {
		return this.friends;
	}
	
	@Override
	public void edit() {
		System.out.println("Edit personal page");
	}

	@Override
	public void delete() {
		System.out.println("Page deleted");
	}
	
}
