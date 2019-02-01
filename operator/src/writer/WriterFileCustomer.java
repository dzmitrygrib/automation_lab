package writer;

import people.*;
import java.io.*;
import java.util.Scanner;

public class WriterFileCustomer {
	Customer customer = new Customer();
	Scanner in = new Scanner(System.in);
	public String str;

	public WriterFileCustomer() {
	}

	public void writeFileCustomer(Customer customer) {
		try (FileWriter fileWriter = new FileWriter("CustomerList.txt", true)) {
			fileWriter.write("\n" + customer.getName());
			fileWriter.write("\n" +customer.getCellNumber());
			fileWriter.write("\n" +customer.getAdress());
			fileWriter.write("\n" +customer.getEmail());
		} catch (IOException exc) {
			System.out.println("Error.File has not writting!");
			return;
		}
	}
}
