package people;

public class Worker extends People {
public	Worker(){
		super();
	}
	
	public void printData(String name, String cellNumber, String adress, String email) {
		System.out.println("Data of Worker:");
		System.out.println(name);
		System.out.println(cellNumber);
		System.out.println(adress);
		System.out.println(email);
	}
}
