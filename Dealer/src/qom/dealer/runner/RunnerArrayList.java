package qom.dealer.runner;

import qom.dealer.creator.CarCreator;
import qom.dealer.lists.CarArrayList;

public class RunnerArrayList {

	public static void main(String[] args) {
		CarCreator car = new CarCreator();
		CarArrayList list = new CarArrayList();
		list.setList(car.createBike("Bmw", 5000, 5));
		list.setList(car.createTruck("Scania", 25000.500, 600));
		list.setList(car.createPassenger("Audi", 5000, 220));
		list.sortList();
		list.showList();
	}

}
