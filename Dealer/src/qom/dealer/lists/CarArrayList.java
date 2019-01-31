package qom.dealer.lists;

import java.util.ArrayList;
import java.util.Collections;
import qom.dealer.cars.Car;

public class CarArrayList {
	private double price = 0.0;
	private ArrayList<Car> list = new ArrayList<Car>();
	private ArrayList<Car> purch = new ArrayList<Car>();

	public void setList(ArrayList<Car> l) {
		list.addAll(l);
	}

	public void setList(Car car) {
		try {
			list.add(car);
		} catch (NullPointerException ex) {
			System.out.println("Car hasn't added");
		}
	}

	public ArrayList<Car> getList() {
		return list;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car getPurchase(String wish) {
		int n = 0;
		if (list != null && !list.isEmpty()) {
			for (Car car : list) {
				if (car.getName().equals(wish)) {
					n++;
					purch.add(car);
				}
			}
			if (n == 0) {
				System.out.print("We haven't car you want.");
			} else if (n > 1) {
				System.out.print("Choosing the car you want guided by the price.");
				getFromSame().display();
			} else {
				return purch.get(0);
			}
		}
		return null;
	}

	private Car getFromSame() {
		if (price != 0.0) {
			for (Car car : purch) {
				if (car.getPrice() == price) {
					return car;
				}
			}
		}
		return null;
	}

	public void delete() {
		if (purch != null && purch.isEmpty()) {
			if (purch.size() == 1) {

				try {
					list.remove(purch.get(0));
					purch.removeAll(purch);
				} catch (NullPointerException ex) {
					System.out.print("It's nothing to delete.");
				}

			} else {
				list.remove(getFromSame());
			}
			list.trimToSize();
		}
	}

	public void sortList() {

		try {
			Collections.sort(list);

		} catch (NullPointerException ex) {
			System.out.println("List hasn't sorted null pointer.");

		}

	}

	public void showList() {

		try {
			for (Car car : list) {
				car.display();
			}
		} catch (NullPointerException ex) {
			System.out.println("All cars in list are nulls");
		}

	}
}
