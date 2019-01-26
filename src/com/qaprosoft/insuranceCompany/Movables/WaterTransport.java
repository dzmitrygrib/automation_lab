package com.qaprosoft.insuranceCompany.Movables;


public class WaterTransport extends MovInsuarance {
	
	public WaterTransport() {
		System.out.println("WaterTransport MovInsuarance created");
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