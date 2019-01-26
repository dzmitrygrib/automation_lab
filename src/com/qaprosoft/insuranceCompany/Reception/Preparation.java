package com.qaprosoft.insuranceCompany.Reception;

import com.qaprosoft.insuranceCompany.myExceptions.InsuaranceIsNotAvailableException;

public class Preparation {

	String name;
	public boolean isPassportTake;
	public boolean isPayAbility;
	public boolean isConditionsAccepted;
	//client.getName();
	
	
	public Preparation(String name) {
	       this.name = name;  //Client.getName;
	   }

	public void takePassport() {

		System.out.println("All necessary identification documents in stock.");
		this.isPassportTake = true;
	}

	public void takeAbilityToPay() {

		System.out.println("Ñustomer is solvent.");
		this.isPayAbility = true;
	}

	public void takeAgreementOfConditions() {
		System.out.println("The client has decided on the object and terms of insurance.");
		this.isConditionsAccepted = true;
	}

	public void communication() throws InsuaranceIsNotAvailableException {

		System.out.println("The client is going to insure property and health.");
		if (isPassportTake && isPayAbility && isConditionsAccepted) {
			System.out.println("All is well, " + name + ", please go to the insurance manager.");
		} else {
			throw new InsuaranceIsNotAvailableException("Client" + name + " not ready for insurance! Check the availability of documents and solvency.");
		}
	}

}
