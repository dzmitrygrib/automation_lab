package people;

public abstract class People {
	protected String name = "default";
	protected String cellNumber = "default";
	protected String adress = "default";
	protected String email = "default";
	
	public People (String name, String cellNumber, String adress, String email) {
		this.name = name;
		this.cellNumber = cellNumber;
		this.adress = adress;
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}
	
	public String getCellNumber() {
		return cellNumber;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getAdress() {
		return adress;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public People () {
	}
	
	
	public void printData(String nameCustomer, String cellNumber, String adress, String email) {
		System.out.println(nameCustomer);
		System.out.println(cellNumber);
		System.out.println(adress);
		System.out.println(email);
	}
}
