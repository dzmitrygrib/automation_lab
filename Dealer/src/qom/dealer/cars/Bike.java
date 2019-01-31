package qom.dealer.cars;

public abstract class Bike extends AllCars {
	private int tankVol;

	public Bike(String name, double price, int tankVol) {
		super(name, price);
		this.tankVol = tankVol;
	}

	public Bike() {

	}

	public void setTankVol(int tankVol) {
		this.tankVol = tankVol;
	}

	public int getTankVol() {
		return tankVol;
	}
}
