package com.qaprosoft.insuranceCompany.people;

public class Client {
	private String clientID = "DefaultID";
	private String clientName = "DefaultName";
	private String clientOwn = "DefaultOwn";
	
	public Client() {
		System.out.println("Default client created");
	}
	
	public Client(String clientID, String clientName, String clientOwn) { 
		this.clientID = clientID;
		this.clientName = clientName;
		this.clientOwn = clientOwn;
		System.out.println("Client " + this.clientName + " created");
	}
	
	public String getClientID() {
		return this.clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	
	public String getName() {
		return this.clientName;
	}
	public void setName(String clientName) {
		this.clientName = clientName;
	}
	
	public String getOwn() {
		return this.clientOwn;
	}
	public void setOwn(String clientOwn) {
		this.clientOwn = clientOwn;
	}

	@Override
	public String toString() {
		return "Client " + this.clientName + " with ID: " + this.clientID;
	}
	
	
	
	
}
