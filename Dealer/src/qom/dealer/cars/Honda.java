package qom.dealer.cars;

public class Honda extends Passanger {

	public Honda(String name, double price, int maxSpeed) {
		super(name, price, maxSpeed);

	}

	public Honda() {

	}

	@Override
	public int getMaxSpeed() {
		return (int) Math.round(super.getMaxSpeed() * 1.1);
	}

	@Override
	public void display() {
		System.out.println("Truck: " + super.getName() + ". Price: " + super.getPrice() + "Capacity:" + getMaxSpeed());

	}

}
