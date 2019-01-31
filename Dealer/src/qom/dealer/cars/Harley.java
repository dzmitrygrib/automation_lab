package qom.dealer.cars;

public class Harley extends Bike {

	public Harley(String name, double price, int tankVol) {
		super(name, price, tankVol);

	}

	public Harley() {

	}

	@Override
	public void display() {
		System.out.println("Truck: " + super.getName() + ". Price: " + super.getPrice() + "Capacity:" + getTankVol());

	}

}
