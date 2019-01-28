package com.qaprosoft.insuranceCompany.people;

public class Manager extends Client {
	public Manager() {
		System.out.println("Manager created");
	}
	
	public Manager(String clientID, String clientName, String clientOwn) { 
		super(clientID, clientName, clientOwn); 
		System.out.println("Manager " + this.getName() + " created");
	}
	
	
	public void makeClientAnManager(Client client) {
		if (this instanceof Manager) {
			Manager newManager = new Manager(client.getClientID(), client.getName(), client.getOwn()); 
		}
	}
}
