package service;

public abstract class Service implements ChangeableServiceData {
	protected int priceService = 0;
	protected String country = "Default";
	protected int timeTravelling = 0;

	public Service() {
	}

	public void setPriceService(int priceService) {
		this.priceService = priceService;
	}

	public int getPriceService() {
		return this.priceService;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	public void setTimeTravelling(int timeTravelling) {
		this.timeTravelling = timeTravelling;
	}

	public int getTimeTravelling() {
		return this.timeTravelling;
	}

	public void addChange() {
		System.out.println("Add changes in information");
	}
	public void print() {
		System.out.println("Print something");
	}
	
	public void addNewInfomation() {
		System.out.println("Add new information");
	}
}
