package qom.dealer.cars;

import java.lang.Comparable;

public interface Car extends Comparable<Car> {
	void display();

	String getName();

	double getPrice();
}
