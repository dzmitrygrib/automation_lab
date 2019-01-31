package qom.dealer.cars;

public class Scania extends Truck {

	public Scania(String name, double price, int capacity) {
		super(name, price, capacity);

	}

	public Scania() {

	}

	@Override
	public double getPrice() {
		return super.getPrice() * 1.2;
	}

	@Override
	public int getCapacity() {
		return (int) Math.round(super.getCapacity() * 0.86);
	}

	@Override
	public void display() {
		System.out.println("Truck: " + super.getName() + ". Price: " + getPrice() + "Capacity:" + getCapacity());
	}

}
