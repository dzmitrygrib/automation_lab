package com.qaprosoft.insuranceCompany.ClientInformation;

import com.qaprosoft.insuranceCompany.people.Client;

public class IndividualCard extends ClientPersonalCard {
	Client owner;
	
	public IndividualCard(Client client) {
		super(client);
		this.owner = client;
		System.out.println("Personal Individual Card " + client.getName() + " created");
	}
	
	public Client getOwner() {
		return this.owner;
	}
	
	@Override
	public void edit() {
		System.out.println("Edit Individual Card");
	}

	@Override
	public void delete() {
		System.out.println("Individual Card deleted");
	}
}	