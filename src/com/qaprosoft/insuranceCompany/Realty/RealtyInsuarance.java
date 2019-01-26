package com.qaprosoft.insuranceCompany.Realty;

public abstract class RealtyInsuarance {
	
	private String realtyInsuaranceID = "DefaultRealtyInsuaranceClientID";
	private String realtyInsuaranceClient = "DefaultRealtyInsuaranceClientName";
	String insuranceReason; //insurance reason - insured risk
    String insuranceObject; // insurance object
   	int cost; // cost-sum insured
	int price; // price - insurance premium (insurance premiums) based on the insurance rate
	
	public RealtyInsuarance() {
		System.out.println("Abstract RealtyInsuarance created");
	}
	
	public void setRealtyInsuaranceID(String realtyInsuaranceID) {
		this.realtyInsuaranceID = realtyInsuaranceID;
	}
	public String getRealtyInsuaranceID() {
		return this.realtyInsuaranceID;
	}
	
	public void setRealtyInsuaranceClientName(String realtyInsuaranceClientName) {
		this.realtyInsuaranceClient = realtyInsuaranceClientName;
	}
	public String getRealtyInsuaranceName() {
		return this.realtyInsuaranceClient;
	}
	
	public abstract void insertPacket();
	public abstract void closePacket();
	public abstract void showPacket();
	
}