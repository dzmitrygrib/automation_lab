package mobileoperator;
import myTreads.*;
import java.io.*;
import java.util.*;
import writer.*;
import base.*;
import operations.*;
import people.*;
import service.*;
import myException.MyException;

public class Executor {
	public static void main(String[] args) throws MyException {
		Customer customer = new Customer();

		BasePhone phone = new BasePhone();
		BaseTariff tariff = new BaseTariff();
		customer.inputCustomer();
		phone.read();
		tariff.read();

		switch (customer.getWish()) {
		case "tariff":
			tariff.wantTariff(customer);
			System.out.println("Do you get what you wish? Yes/no");
			Scanner in= new Scanner(System.in);
			String str = in.nextLine();
			customer.compareWish(str);
			break;
		case "phone":
			phone.wantPhone(customer);
			break;
		default:
			System.out.println("Sorry. We can't help you(");
		}
		
		WriterFileCustomer writerFileCustomer = new WriterFileCustomer();
		writerFileCustomer.writeFileCustomer(customer);
		
		// basePhone.add();
		// basePhone.print();
		SynchTread synchTread = new SynchTread();
		ClientTread clientTread = new ClientTread(synchTread);
		WriteCustomerThread writeCustomerThread = new WriteCustomerThread(synchTread);
		new Thread(clientTread).start();
		new Thread(writeCustomerThread).start();
	}



}
