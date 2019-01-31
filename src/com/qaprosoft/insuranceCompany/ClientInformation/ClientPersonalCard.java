package com.qaprosoft.insuranceCompany.ClientInformation;

import com.qaprosoft.insuranceCompany.Health.HealthInsurance;
import com.qaprosoft.insuranceCompany.Movables.Cars;
import com.qaprosoft.insuranceCompany.Movables.Motorcycles;
import com.qaprosoft.insuranceCompany.Movables.MovInsuarance;
import com.qaprosoft.insuranceCompany.Realty.Apartments;
import com.qaprosoft.insuranceCompany.Realty.Houses;
import com.qaprosoft.insuranceCompany.Realty.RealtyInsuarance;
import com.qaprosoft.insuranceCompany.people.Client;

public abstract class ClientPersonalCard {

	private String ID;
	private String name;
	private HealthInsurance healthInsuarance;
	private Cars cars;
	private Motorcycles motorcycles;
	private Apartments apartments;
	private Houses houses;
	
	
	public ClientPersonalCard(Client client)
	{
		this.motorcycles = new Motorcycles();
		this.cars = new Cars();
		this.apartments = new Apartments();
		this.houses = new Houses();
		this.healthInsuarance = new HealthInsurance();
	}
	
	public abstract void edit();
	public abstract void delete();
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void addPhoto() {
		System.out.println("Photo added");
	}
}
