package qom.dealer.cars;

public class Kia extends Passanger {

	public Kia(String name, double price, int maxSpeed) {
		super(name, price, maxSpeed);

	}

	public Kia() {

	}

	@Override
	public int getMaxSpeed() {
		return (int) Math.round(super.getMaxSpeed() * 1.05);
	}

	@Override
	public void display() {
		System.out.println("Truck: " + super.getName() + ". Price: " + super.getPrice() + "Capacity:" + getMaxSpeed());

	}

}
