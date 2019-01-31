package com.qaprosoft.insuranceCompany.Realty;


public class Apartments extends RealtyInsuarance {
	private String clientID;
	Apartments(String insuranceReason, String insuranceObject, int cost, int price, String clientID) {
			 this.insuranceReason = insuranceReason;
			 this.insuranceObject = insuranceObject;
			 this.cost = cost;
			 this.price = price;
			 this.clientID = clientID;
			 System.out.println("Realty Insuarance");
	 }
	public Apartments() {
		System.out.println("Apartments Realty Insuarance created");
	}
	@Override
	public void insertPacket() {
		System.out.println("Insuarance packet inserted");
	}

	@Override
	public void closePacket() {
		System.out.println("Insuarance packet closed");
	}

	@Override
	public void showPacket() {
		System.out.println("Insuarance packet shown");
	}

		  public void show(){    
	      System.out.println("The reason for insurance is" + insuranceReason + " Insurance object-" + insuranceObject+ " Insurance amount-" + cost+ " Insurance fee-" + price+ " Client's number:" + clientID);
		}
} 