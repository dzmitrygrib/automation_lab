package qom.dealer.runner;

import qom.dealer.creator.CarCreator;
import qom.dealer.lists.CarArrayList;
import qom.dealer.lists.CarHashSet;

public class RunnerHashSet {
	public static void main(String[] args) {
		CarCreator car = new CarCreator();
		CarArrayList list = new CarArrayList();
		CarHashSet set = new CarHashSet();
		list.setList(car.createBike("Bmw", 5000, 5));
		list.setList(car.createBike("Bmw", 4000, 5));
		list.setList(car.createBike("Bmw", 3000, 5));
		list.setList(car.createTruck("Scania", 25000.500, 600));
		list.setList(car.createPassenger("Audi", 5000, 220));
		list.sortList();
		set.setHashSet(list.getList());
		set.showHashSet();
	}
}
