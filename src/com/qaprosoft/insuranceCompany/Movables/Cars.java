package com.qaprosoft.insuranceCompany.Movables;

public class Cars extends MovInsuarance {
	private String clientID;
	Cars(String insuranceReason, String insuranceObject, int cost, int price, String clientID) {
			 this.insuranceReason = insuranceReason;
			 this.insuranceObject = insuranceObject;
			 this.cost = cost;
			 this.price = price;
			 this.clientID = clientID;
			 System.out.println("Cars insuarance");
	 }
	public Cars() {
		System.out.println("Cars MovInsuarance created");
	}

	@Override
	public void insertPacket() {
		System.out.println("Packet is inserted");
	}

	@Override
	public void closePacket() {
		System.out.println("Packet closed");
	}

	@Override
	public void showPacket() {
		System.out.println("Packet shown");
	}
	  public void show(){    
	      System.out.println("The reason for insurance is" + insuranceReason + " Insurance object-" + insuranceObject+ " Insurance amount-" + cost+ " Insurance fee-" + price+ " Client's number:" + clientID);
		}
}
