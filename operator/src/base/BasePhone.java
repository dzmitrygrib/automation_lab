package base;

import java.io.*;
import java.util.*;
import service.*;
import people.*;

public class BasePhone implements Base {

	String line;
	ArrayList<Phone> phone = new ArrayList<Phone>();
	Customer cus = new Customer();

	public void read() {
		BufferedReader readFromFile = null;
		try {
			readFromFile = new BufferedReader(new FileReader("phone.txt"));
			while ((line = readFromFile.readLine()) != null) {
				Phone newPhone = new Phone();
				newPhone.setName(line);
				line = readFromFile.readLine();
				double cost = Double.parseDouble(line);
				newPhone.setCost(cost);
				line = readFromFile.readLine();
				newPhone.setScreen(line);
				line = readFromFile.readLine();
				newPhone.setCamera(line);
				phone.add(newPhone);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (readFromFile != null)
				try {
					readFromFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

	@Override
	public void add() {
		Scanner inp = new Scanner(System.in);
		Phone PhoneNew = new Phone();
		try {
			System.out.print("Add name new phone: ");
			PhoneNew.setName(inp.nextLine());
			System.out.print("Cost: ");
			PhoneNew.setCost(inp.nextDouble());
			System.out.print("Screen: ");
			PhoneNew.setScreen(inp.nextLine());
			System.out.print("Camera: ");
			PhoneNew.setCamera(inp.nextLine());
			phone.add(PhoneNew);
		} finally {
			inp.close();
		}

	}

	@Override
	public void delete() {

	}

	public void wantPhone(Customer cus) {

		int n = 0;
		
		for (Phone mobile : phone) {
			if (mobile.getName().equals(cus.getWishSp())) {
				System.out.print("Phone: " + mobile.getName() + ", ");
				System.out.print("Cost: " + mobile.getCost() + ", ");
				System.out.print("Screen: " + mobile.getScreen() + ", ");
				System.out.println("Camera: " + mobile.getCamera() + ".");
				n = n + 1;
			}

		}

		if (n == 0) {
			System.out.println("We havn't phone you want");

		}

	}

	public void printBase() {
		for (Phone mobile : phone) {
			System.out.print("Phone: " + mobile.getName() + ", ");
			System.out.print("Cost: " + mobile.getCost() + ", ");
			System.out.print("Screen: " + mobile.getScreen() + ", ");
			System.out.println("Camera: " + mobile.getCamera() + ".");
		}

	}

}
