package people;

public class Employee extends People implements ChangeablePeopleData {
	String post = "Default";

	public Employee() {
		super();
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getPost(String post) {
		return this.post;
	}

	public void print() {
		System.out.println("Print information about new employer");
	}

	public void addNewInfomation() {
		System.out.println("Add information about new employer");
	}

	@Override
	public void printNewPeople(String namePeople, String numberPeople) {
		System.out.println("New employee:");
		System.out.println("NAME:" + namePeople);
		System.out.println("SEX: " + getSex());
		System.out.println("PasportID: " + pasportID);
		System.out.println("ADRESS: " + getAddressPeople());
		System.out.println("NUMBER: " + getNumberPhonePeople());
		System.out.println("EMAIL: " + getEmailPeople());
		System.out.println("STUDENT: " + getStudent());
	}

	public void addChange() {
		System.out.println("Data is changed!");
	}
}
