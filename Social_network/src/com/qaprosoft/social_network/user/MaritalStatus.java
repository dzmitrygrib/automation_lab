package com.qaprosoft.social_network.user;

public enum MaritalStatus {

	SINGLE ("single"),
	MARRIED ("married"),
	DIVORCED ("divorced");
	
	String name;
	
	private MaritalStatus(String name) {
		this.name = name;
	}
	
	public String getValue() {
		return this.name;
	}
	
}
