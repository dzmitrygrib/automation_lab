package qom.dealer.cars;

public class Maz extends Truck {

	public Maz(String name, double price, int capacity) {
		super(name, price, capacity);

	}

	public Maz() {

	}

	@Override
	public void display() {
		System.out.println("Truck: " + super.getName() + ". Price: " + super.getPrice() + "Capacity:" + super.getCapacity());

	}

}
