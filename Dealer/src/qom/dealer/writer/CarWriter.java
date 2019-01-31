package qom.dealer.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import qom.dealer.cars.Car;

public class CarWriter implements Writer {

	private ArrayList<Car> list = new ArrayList<Car>();
	private Car car;
	private static final String LOCATION = "src\\qom\\dealer\\resources\\Cars.txt";

	public void setCar(ArrayList<Car> list) {
		this.list = list;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void clean() {
		try {
			FileWriter writer = new FileWriter(LOCATION);
			writer.write("");
			writer.close();
		} catch (IOException ex) {
			ex.getStackTrace();
		} catch (NullPointerException ex) {
			ex.getStackTrace();
		}

	}

	@Override
	public void writeFile() {
		try {
			if (list != null && !list.isEmpty()) {

				FileWriter writer = new FileWriter(LOCATION, true);
				for (Car car : list) {
					writer.write(car.getName() + " " + car.getPrice());
					writer.append("\n");
				}
				writer.close();

			}
			if (car != null) {

				FileWriter writer = new FileWriter(LOCATION, true);
				writer.write(car.getName() + " " + car.getPrice());
				writer.append("\n");
				writer.close();

			}

		} catch (IOException ex) {
			ex.getStackTrace();
		} catch (NullPointerException ex) {
			ex.getStackTrace();
		}
	}

	@Override
	public String getLocation() {
		return LOCATION;
	}
}
