package people;

import java.util.*;

import nonStringResultException.NonStringResultException;

public class Client extends People implements ChangeablePeopleData {
	private String loyalityProgramMember = "Default";
	private int numberClient = 0;

	public Client() {
	}

	public Client(String namePeople, String pasportID) {
		super(namePeople, pasportID);
	}

	public void setLPMember(String loyalityProgramMember) {
		this.loyalityProgramMember = loyalityProgramMember;
	}

	public String getLPMember() {
		return this.loyalityProgramMember;
	}

	public void setNumberClient(int numberClient) {
		this.numberClient = numberClient;
	}

	public int getNumberClient() {
		return this.numberClient;
	}

	public void print() {
		System.out.println("Print information about new client");
	}

	public void addNewInfomation() {
		System.out.println("Add information about new client");
	}

	@Override
	public void printNewPeople(String namePeople, String numberPeople) {
		System.out.println("New client:");
		System.out.println("NAME:" + namePeople);
		System.out.println("SEX: " + getSex());
		System.out.println("PasportID: " + pasportID);
		System.out.println("ADRESS: " + getAddressPeople());
		System.out.println("NUMBER: " + getNumberPhonePeople());
		System.out.println("EMAIL: " + getEmailPeople());
		System.out.println("STUDENT: " + getStudent());
	}

	@SuppressWarnings("resource")
	public void enterNewClient() throws NonStringResultException {
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Input information about new client!");
			System.out.println("Input name new client:");
			String str = in.nextLine();
			if (str.isEmpty())
				throw new NonStringResultException();
			else
				setNamePeople(str);
			System.out.println("Input sex new client:");
			str = in.nextLine();
			if (str.isEmpty())
				throw new NonStringResultException();
			else
				setSex(in.nextLine());
			System.out.println("Input pasportID new client:");
			str = in.nextLine();
			if (str.isEmpty())
				throw new NonStringResultException();
			else
				setPasportID(str);
			System.out.println("Input phone number new client:");
			str = in.nextLine();
			if (str.isEmpty())
				throw new NonStringResultException();
			else
				setNumberPhonePeople(str);
			System.out.println("Input adress new client:");
			str = in.nextLine();
			if (str.isEmpty())
				throw new NonStringResultException();
			else
				setAddressPeople(str);
			System.out.println("Input email new client:");
			str = in.nextLine();
			if (str.isEmpty())
				throw new NonStringResultException();
			else
				setEmailPeople(str);
			System.out.println("Is new client program loyality member?");
			str = in.nextLine();
			if (str.isEmpty())
				throw new NonStringResultException();
			else
				setLPMember(str);
			in.close();
		} catch (NonStringResultException exc) {
			System.out.println("Error! You did not enter a data!");
			return;
		}
	}

	public void addChange() {
		System.out.println("Data is changed!");
	}
}