package qom.dealer.lists;

import java.util.ArrayList;
import java.util.HashSet;

import qom.dealer.cars.Car;

public class CarHashSet {
	private HashSet<Car> set = new HashSet<Car>();
	private String wish;

	public void setHashSet(ArrayList<Car> list) {
		set.addAll(list);
	}

	public void setHashSet(Car car) {
		set.add(car);
	}

	public HashSet<Car> getHashSet() {
		return set;
	}

	public void showHashSet() {
		try {
			if (!set.isEmpty()) {
				for (Car car : set) {
					car.display();
				}
			}
		} catch (NullPointerException ex) {
			System.out.println("One or All cars are null");
			ex.printStackTrace();
		}
	}

	public void setWish(String wish) {
		this.wish = wish;
	}

	public Car getPurchase() {
		if (!set.isEmpty()) {
			for (Car car : set) {
				if (car.getName().equals(wish)) {
					car.display();
					return car;
				}
			}
		}
		return null;
	}

	public void delete() {
		try {
			if (getPurchase() != null) {
				set.remove(getPurchase());
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
	}
}
