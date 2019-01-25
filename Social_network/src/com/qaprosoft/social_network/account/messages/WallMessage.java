package com.qaprosoft.social_network.account.messages;

import com.qaprosoft.social_network.user.User;

public class WallMessage extends Message {
	
	private static final long serialVersionUID = 1L;

	public WallMessage(String contents) {
		super(contents);
		
	}

	@Override
	public void send() {
		System.out.println("Wall message " + this.getContents() + " posted");
	}
	
	@Override
	public void edit() {
		System.out.println("Wall message edited");
	}

	@Override
	public void delete() {
		System.out.println("Wall message deleted");		
	}
	
	public void comment() {
		System.out.println("Leave a comment");
	}

}
