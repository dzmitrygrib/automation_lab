package people;

public abstract class People{
	protected String namePeople = "Default";
	protected String sex = "Default";
	protected String pasportID = "Default";
	protected String addressPeople = "Default";
	protected String numberPhonePeople = "Default";
	protected String emailPeople = "Default";
	protected String student = "Default";
	protected String numberPeople = "Default";

	public People() {
	}

	public People(String namePeople, String pasportID) {
		this.namePeople = namePeople;
		this.pasportID = pasportID;
	}
	public void setNamePeople(String namePeople) {
		this.namePeople = namePeople;
	}

	public String getNamePeople() {
		return namePeople;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setPasportID(String pasportID) {
		this.pasportID = pasportID;
	}

	public String getPasportID() {
		return pasportID;
	}
	public void setAddressPeople(String addressPeople) {
		this.addressPeople = addressPeople;
	}

	public String getAddressPeople() {
		return addressPeople;
	}

	public void setNumberPhonePeople(String numberPhonePeople) {
		this.numberPhonePeople = numberPhonePeople;
	}

	public String getNumberPhonePeople() {
		return numberPhonePeople;
	}

	public void setEmailPeople(String emailPeople) {
		this.emailPeople = emailPeople;
	}

	public String getEmailPeople() {
		return emailPeople;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getStudent() {
		return student;
	}
	
	//public abstract void enterNewPeople();
	//public abstract void deletePeople();
	//public abstract void addToBlackList();
	
	public void printNewPeople(String namePeople, String numberPeople ) {
		System.out.println("New people:");
		System.out.println("NAME:" + namePeople);
		System.out.println("SEX: " + sex);
		System.out.println("PasportID: " + pasportID);
		System.out.println("ADRESS: " + addressPeople);
		System.out.println("NUMBER: " + numberPhonePeople);
		System.out.println("EMAIL: " + emailPeople);
		System.out.println("STUDENT: " + student);
			
	}
}