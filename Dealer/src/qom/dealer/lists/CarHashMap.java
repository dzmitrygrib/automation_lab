package qom.dealer.lists;

import java.util.ArrayList;
import java.util.HashMap;

import qom.dealer.cars.Car;

public class CarHashMap {
	HashMap<String, Car> map = new HashMap<String, Car>();
	private String wish;

	public void setHashMap(Car car) {
		if (car != null) {
			map.put(car.getName(), car);
		}
	}

	public void setHashMap(ArrayList<Car> list) {
		if (!list.isEmpty()) {
			for (Car car : list) {
				map.put(car.getName(), car);
			}
		}
	}

	public void setWish(String wish) {
		this.wish = wish;
	}

	public Car getPurchase() {
		return map.get(wish);
	}

	public void delete() {
		map.remove(wish, getPurchase());
	}
}
