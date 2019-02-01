package base;

import java.io.*;
import java.util.*;

import people.Customer;
import service.Tariff;

public class BaseTariff implements Base{

	
	String line;
	ArrayList<Tariff> tariff = new ArrayList<Tariff>();
	Customer cus = new Customer();
	public void read() {
		BufferedReader readFromFile = null;
		try {
			readFromFile = new BufferedReader(new FileReader("tariff.txt"));
			while ((line = readFromFile.readLine()) != null) {
				Tariff newTariff = new Tariff();
				newTariff.setName(line);
				line = readFromFile.readLine();
				double cost = Double.parseDouble(line);
				newTariff.setCost(cost);
				line = readFromFile.readLine();
				int numMinutes = Integer.parseInt(line);
				newTariff.setNumMinutes(numMinutes);
				line = readFromFile.readLine();
				int numMb = Integer.parseInt(line);
				newTariff.setNumMb(numMb);
				tariff.add(newTariff);
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
		Tariff TariffNew = new Tariff();
		try {
			System.out.print("Add name new tariff: ");
			TariffNew.setName(inp.nextLine());
			System.out.print("Cost: ");
			TariffNew.setCost(inp.nextDouble());
			System.out.print("Number of Minutes: ");
			TariffNew.setNumMinutes(inp.nextInt());
			System.out.print("Number of Mb: ");
			TariffNew.setNumMb(inp.nextInt());
			tariff.add(TariffNew);
		} finally {
			inp.close();
		}

	}

	@Override
	public void delete() {

	}

	public void wantTariff(Customer cus) {

		int n = 0;
		try {
			for (Tariff mobile : tariff) {
				if (mobile.getName().equals(cus.getWishSp()) && mobile.getCost()<=cus.getMoney()) {
					System.out.print("Tariff: " + mobile.getName() + ", ");
					System.out.print("Cost: " + mobile.getCost() + ", ");
					System.out.print("Number of Minutes: " + mobile.getNumMinutes() + ", ");
					System.out.println("Number of Mb: " + mobile.getNumMb() + ".");
					n = n + 1;
				}

			}

		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.getMessage();
		}
		if (n == 0) {
			System.out.println("We havn't tariff you want");

		}

	}

	public void printBase() {
		for (Tariff mobile : tariff) {
			System.out.print("Phone: " + mobile.getName() + ", ");
			System.out.print("Cost: " + mobile.getCost() + ", ");
			System.out.print("Number of Minutes: " + mobile.getNumMinutes() + ", ");
			System.out.println("Number of Mb: " + mobile.getNumMb() + ".");
		}

	}

}
