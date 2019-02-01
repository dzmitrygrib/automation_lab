package people;

import java.io.IOException;
import java.util.Scanner;

import myException.MyException;

public class Customer extends People {

	double money = 0;
	String wish = "default";
	String wishSp = "default";

	public Customer() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setWishSp(String wishSp) {
		this.wishSp = wishSp;
	}

	public String getWishSp() {
		return wishSp;
	}

	public void setWish(String wish) {
		this.wish = wish;
	}

	public String getWish() {
		return wish;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void compareWish(String str) {
		if(str.contains("yes")){
			addCustomer();
		}else {
			System.out.print("Sorry< we can't help you ");
		}
	}
	public void inputCustomer() throws MyException{
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("What is your name? ");
			String str = in.nextLine();
			if(str.isEmpty()) 
				throw new MyException();
			else				
				setName(str);
			System.out.print("You want connect Tariff or buy phone? ");
			wish = in.nextLine();
			if (wish.equals("tariff")) {
				System.out.print("What tariff you want? ");
				wishSp = in.nextLine();
			}
			if (wish.equals("phone")) {
				System.out.print("What phone you want? ");
				wishSp = in.nextLine();
			}
			System.out.print("How much money you have?");
			money = in.nextDouble();
		}
		catch(MyException e) {
			System.out.print("Empty string!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void addCustomer() {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter your phone number: ");
			setCellNumber(in.nextLine());
			System.out.print("Enter you adress: ");
			setAdress(in.nextLine());
			System.out.print("Enter you Email: ");
			setEmail(in.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
