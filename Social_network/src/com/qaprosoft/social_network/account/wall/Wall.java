package com.qaprosoft.social_network.account.wall;

import java.io.Serializable;
import java.util.ArrayList;

import com.qaprosoft.social_network.account.messages.WallMessage;

public class Wall implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private ArrayList<WallMessage> wallMessages = new ArrayList<WallMessage>();
	
	public void addWallMessage(WallMessage newWallMessage) {
		this.wallMessages.add(newWallMessage);
		System.out.println("Wall message added");
	}
	
	public ArrayList<WallMessage> getWallMessageList() {
		return this.wallMessages;
	}
	
	public Wall() {
		System.out.println("Wall created");
	}

}
