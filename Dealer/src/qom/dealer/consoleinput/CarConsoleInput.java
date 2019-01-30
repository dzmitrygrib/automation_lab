package qom.dealer.consoleinput;

import java.util.ArrayList;
import java.util.Scanner;
import qom.dealer.cars.*;

public class CarConsoleInput {
	private ArrayList<Car> list = new ArrayList<Car>();
	private String name = "Default";
	private double price = 0.0;
	private int capacity = 0;
	private int maxSpeed = 0;
	private int tankVol = 0;
	private String answer = "y";

	private Scanner enter() {
		return new Scanner(System.in);
	}

	private void enterName() {
		System.out.print("Enter brand of car: ");
		name = enter().nextLine();
	}

	private void enterPrice() {
		System.out.print("Enter price of car: ");
		price = enter().nextDouble();
	}

	private void enterCapacity() {
		System.out.print("Enter capacity: ");
		capacity = enter().nextInt();
	}

	private void enterMaxSpeed() {
		System.out.print("Enter max speed: ");
		maxSpeed = enter().nextInt();
	}

	private void enterTankVol() {
		System.out.print("Enter volume of tank: ");
		tankVol = enter().nextInt();
	}

	private void enterAnswer() {
		System.out.print("Do you want to create a new car? ");
		answer = enter().nextLine();
	}

	private void enterCarParametres() {
		enterName();
		enterPrice();
		if (name.equals("Audi") || name.equals("Kia") || name.equals("Hinda")) {
			enterMaxSpeed();
		} else if (name.equals("Scania") || name.equals("Iveco") || name.equals("Maz")) {
			enterCapacity();
		} else if (name.equals("Bmw") || name.equals("Minsk") || name.equals("Harley")) {
			enterTankVol();
		} else {
			System.out.print("Car can't be created.");
		}
	}

	private Car getCar() {
		switch (name) {
		case "Audi":
			return new Audi(name, price, maxSpeed);
		case "Honda":
			return new Honda(name, price, maxSpeed);
		case "Kia":
			return new Kia(name, price, maxSpeed);
		case "Maz":
			return new Maz(name, price, capacity);
		case "Iveco":
			return new Iveco(name, price, capacity);
		case "Scania":
			return new Scania(name, price, capacity);
		case "Bmw":
			return new Bmw(name, price, tankVol);
		case "Harley":
			return new Harley(name, price, tankVol);
		case "Minsk":
			return new Minsk(name, price, tankVol);
		default:
			return null;
		}
	}

	public  ArrayList<Car> initCar() {
		while (answer.equals("y")) {
			enterCarParametres();
			list.add(getCar());
			enterAnswer();
		}
		return list;
	}
}
