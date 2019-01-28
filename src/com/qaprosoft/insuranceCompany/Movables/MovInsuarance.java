package com.qaprosoft.insuranceCompany.Movables;

public abstract class MovInsuarance {
	
	private String movInsuaranceID = "DefaultMovInsuaranceClientID";
	private String movInsuaranceClient = "DefaultMovInsuaranceClientName";
	String insuranceReason; //insurance reason - insured risk
    String insuranceObject; // insurance object
   	int cost; // cost-sum insured
	int price; // price - insurance premium (insurance premiums) based on the insurance rate
	
	
	public MovInsuarance() {
		System.out.println("Abstract MovInsuarance created");
	}
	
	public void setMovInsuaranceID(String movInsuaranceID) {
		this.movInsuaranceID = movInsuaranceID;
	}
	public String getMovInsuaranceID() {
		return this.movInsuaranceID;
	}
	
	public void setMovInsuaranceClientName(String movInsuaranceClientName) {
		this.movInsuaranceClient = movInsuaranceClientName;
	}
	public String getMovInsuaranceClientName() {
		return this.movInsuaranceClient;
	}
	

	public abstract void insertPacket();
	public abstract void closePacket();
	public abstract void showPacket();
}

