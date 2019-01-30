package qom.dealer.cars;

public class Audi extends Passanger {

	public Audi(String name, double price, int maxSpeed) {
		super(name, price, maxSpeed);

	}

	public Audi() {

	}

	@Override
	public int getMaxSpeed() {
		return (int) Math.round(super.getMaxSpeed() * 1.2);
	}

	@Override
	public void display() {
		System.out.println("Truck: " + super.getName() + ". Price: " + super.getPrice() + "Capacity:" + getMaxSpeed());

	}

}
