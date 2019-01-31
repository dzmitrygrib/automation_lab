package com.qaprosoft.insuranceCompany.Movables;

public class Motorcycles extends MovInsuarance {
	private String clientID;
	Motorcycles(String insuranceReason, String insuranceObject, int cost, int price, String clientID) {
			 this.insuranceReason = insuranceReason;
			 this.insuranceObject = insuranceObject;
			 this.cost = cost;
			 this.price = price;
			 this.clientID = clientID;
			 System.out.println("Motorcycles insuarance");
	}
	public Motorcycles() {
		System.out.println("Motorcycles MovInsuarance created");
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

}