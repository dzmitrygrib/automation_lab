package qom.dealer.cars;

public class Iveco extends Truck {

	public Iveco(String name, double price, int capacity) {
		super(name, price, capacity);

	}

	public Iveco() {

	}

	@Override
	public double getPrice() {
		return super.getPrice() * 1.02;
	}

	@Override
	public int getCapacity() {
		return (int) Math.round(super.getCapacity() * 0.8);

	}

	@Override
	public void display() {
		System.out.println("Truck: " + super.getName() + ". Price: " + getPrice() + "Capacity:" + getCapacity());
	}

}
