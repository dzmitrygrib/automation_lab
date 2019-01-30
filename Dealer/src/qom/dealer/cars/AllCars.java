package qom.dealer.cars;

public abstract class AllCars implements Car {
	private String name;
	private double price;

	AllCars(String name, double price) {
		this.name = name;
		this.price = price;
	}

	AllCars() {
		name = "Default";
		price = 0.0;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public int compareTo(Car car) {
		return name.compareTo(car.getName());
	}

	@Override
	public boolean equals(Object o) {
		Car c = (Car) o;
		return getName().equals(c.getName());
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
