package qom.dealer.cars;

public abstract class Passanger extends AllCars {
	private int maxSpeed;

	Passanger(String name, double price, int maxSpeed) {
		super(name, price);
		this.maxSpeed = maxSpeed;
	}

	Passanger() {
		maxSpeed = 0;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
}
