package myTreads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import myException.MyException;
import people.Customer;
import writer.WriterFileCustomer;

public class WriteCustomerThread implements Runnable {
	Customer customer;
	WriterFileCustomer writer;
	SynchTread synchTread;
	
	public WriteCustomerThread(SynchTread synchTread) {
		this.synchTread = synchTread;
	}

	public void run() {
		System.out.println("Please wait, we add you to base!");
		try {
			customer.inputCustomer();
			writer.writeFileCustomer(customer);
		} catch (MyException e) {
			System.out.println("Error! Client did't add to base!");
		}
	}

	protected boolean isCompletelyWritten() {
		FileWriter file = null;
		try {
			file = new FileWriter("CustomerList.txt", true);
			return true;
		} catch (Exception e) {
			System.out.println("Error!");
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					System.out.println("Error!");
				}
			}
		}
		return false;
	}

}
