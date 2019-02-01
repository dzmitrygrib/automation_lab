package operations;

import people.*;
import java.util.*;
import java.io.*;

public class ReaderFile {
	String line;
	ArrayList<Customer> customer = new ArrayList<Customer>();

	public ReaderFile() {

	}

	public void reader() {
		BufferedReader readFromFile = null;
		try {
			readFromFile = new BufferedReader(new FileReader("CustomerList.txt"));
			while ((line = readFromFile.readLine()) != null) {
				Customer newCustomer = new Customer();
				newCustomer.setName(line);
				line = readFromFile.readLine();
				newCustomer.setCellNumber(line);
				line = readFromFile.readLine();
				newCustomer.setAdress(line);
				line = readFromFile.readLine();
				newCustomer.setEmail(line);
				customer.add(newCustomer);
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
	
	

	public void add1() {
		Customer customerNew = new Customer();
		customerNew.setName("vtfgbyhnj");

		customer.add(customerNew);

	}

	public void print() {
		for (Customer people : customer) {
			System.out.print("Name: " + people.getName() + ", ");
			System.out.print("CellNumber: " + people.getCellNumber() + ", ");
			System.out.print("Adress: " + people.getAdress() + ", ");
			System.out.print("Email: " + people.getEmail() + ", ");
		}

	}

}
