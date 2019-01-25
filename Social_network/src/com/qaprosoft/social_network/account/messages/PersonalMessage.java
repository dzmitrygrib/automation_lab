package com.qaprosoft.social_network.account.messages;

public class PersonalMessage extends Message {
	
	private static final long serialVersionUID = 1L;

	//Default constructor
	public PersonalMessage() {
	}
	
	public PersonalMessage(String contents) {
		super(contents);
	}

	@Override
	public void send() {
		System.out.println("Personal message " + this.getContents() + " sent");
	}
	
	@Override
	public void edit() {
		System.out.println("Personal message edited");
	}

	@Override
	public void delete() {
		System.out.println("Personal message deleted");		
	}

}
