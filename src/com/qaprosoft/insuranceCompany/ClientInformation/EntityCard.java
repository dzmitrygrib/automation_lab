package com.qaprosoft.insuranceCompany.ClientInformation;

import com.qaprosoft.insuranceCompany.people.Client;

public class EntityCard extends ClientPersonalCard {
	
	Client owner;
	
	public EntityCard(Client client) {
		super(client);
		this.owner = client;
		System.out.println("Personal Entity Card " + client.getName() + " created");
	}
	
	public Client getOwner() {
		return this.owner;
	}
	
	@Override
	public void edit() {
		System.out.println("Edit Entity Card");
	}

	@Override
	public void delete() {
		System.out.println("EntityCard deleted");
	}
	
		}

