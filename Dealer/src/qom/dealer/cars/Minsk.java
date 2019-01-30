package qom.dealer.cars;

public class Minsk extends Bike {

	public Minsk(String name, double price, int tankVol) {
		super(name, price, tankVol);
		
	}

	public Minsk() {
		
	}

	@Override
	public int getTankVol() {
		return (int) Math.round(super.getTankVol() * 0.8);
	}

	@Override
	public void display() {
		System.out.println("Truck: " + super.getName() + ". Price: " + super.getPrice() + "Capacity:" + getTankVol());

	}

}
