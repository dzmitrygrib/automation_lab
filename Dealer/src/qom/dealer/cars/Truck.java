package qom.dealer.cars;

public abstract class Truck extends AllCars {
	private int capacity;

	Truck(String name, double price, int capacity) {
		super(name, price);

	}
	Truck(){
		capacity=0;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}
}
