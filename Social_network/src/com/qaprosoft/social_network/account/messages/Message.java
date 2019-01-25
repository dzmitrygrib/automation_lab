package com.qaprosoft.social_network.account.messages;

import java.io.Serializable;

import com.qaprosoft.social_network.account.account_interfaces.*;

public abstract class Message implements Sendable, Editable, Serializable {
	
	private static final long serialVersionUID = 1L;
	private String contents = "DefaultMessage";
	
	//Default constructor
	public Message() {
	}
	
	public Message(String contents) {
		this.contents = contents;
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getContents() {
		return this.contents;
	}

	@Override
	public abstract void send();
	
	@Override
	public abstract void edit();
	
	public void show() {
		System.out.println(this.contents);
	}
}
