package com.qaprosoft.social_network.account.messages;

import java.io.Serializable;
import java.util.ArrayList;

import com.qaprosoft.social_network.account.account_interfaces.Editable;
import com.qaprosoft.social_network.user.User;

public class Dialogue implements Editable, Serializable {

	private static final long serialVersionUID = 1L;
	private String dialogueID = "defaultID";
	private User sender = null;
	private User receiver = null;
	private ArrayList<PersonalMessage> personalMessages = new ArrayList<PersonalMessage>();
	
	public Dialogue() {
		System.out.println("Dialogue " + this.dialogueID + " created");
	}
	
	public Dialogue(User sender, User receiver) {
		this.sender = sender;
		this.receiver = receiver;
		this.dialogueID = sender.getName() + "_" + receiver.getName();
		System.out.println("Dialogue for " + sender.getName() + " with " + receiver.getName() + " created. "
				+ "ID = " + this.dialogueID);
	}
	
	public void addPersonalMessage(PersonalMessage newPersonalMessage) {
		this.personalMessages.add(newPersonalMessage);
		System.out.println("Personal message added");
	}
	
	public ArrayList<PersonalMessage> getPersonalMessageList() {
		return this.personalMessages;
	}

	@Override
	public void edit() {
		System.out.println("Dialogue " + this.dialogueID + " edited");		
	}

	@Override
	public void delete() {
		System.out.println("Dialogue " + this.dialogueID + " deleted");		
	}
	
}
