package qom.dealer.creator;

import qom.dealer.cars.*;

public class CarCreator {

	public  Car createPassenger(String name, double price, int maxSpeed) {
		switch (name) {
		case "Audi":
			return new Audi(name, price, maxSpeed);
		case "Kia":
			return new Kia(name, price, maxSpeed);
		case "Honda":
			return new Honda(name, price, maxSpeed);
		default:
			System.out.print("Wrong name");
			return null;
		}
	}

	public  Car createTruck(String name, double price, int capacity) {
		switch (name) {
		case "Iveco":
			return new Iveco(name, price, capacity);
		case "Scania":
			return new Scania(name, price, capacity);
		case "Maz":
			return new Maz(name, price, capacity);
		default:
			System.out.print("Wrong name");
			return null;
		}
	}

	public  Car createBike(String name, double price, int tankVol) {
		switch (name) {
		case "Bmw":
			return new Bmw(name, price, tankVol);
		case "Harley":
			return new Harley(name, price, tankVol);
		case "Minsk":
			return new Minsk(name, price, tankVol);
		default:
			System.out.print("Wrong name");
			return null;
		}
	}
}
