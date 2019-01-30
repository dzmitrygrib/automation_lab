package qom.dealer.runner;

import qom.dealer.creator.CarCreator;
import qom.dealer.human.Client;
import qom.dealer.lists.CarArrayList;
import qom.dealer.reader.MyReader;
import qom.dealer.writer.*;

public class RunnerFileReadWrite {
	public static void main(String[] args) {
		workWithClients();
		workWithCars();
	}
	
	 static	void workWithCars() {
		CarCreator car = new CarCreator();
		CarArrayList list = new CarArrayList();
		CarWriter writer = new CarWriter ();
		
		list.setList(car.createBike("Bmw", 5000, 5));
		list.setList(car.createTruck("Scania", 25000.500, 600));
		list.setList(car.createPassenger("Audi", 5000, 220));
		writer.setCar(list.getList());
		writer.writeFile();
		new MyReader(writer.getLocation());
		writer.clean();
	}
	static void workWithClients() {
		Client client = new Client("Alex","Audi","BM2067895");
		ClientWriter writer1 = new ClientWriter();
		writer1.setClient(client);
		writer1.writeFile();
		new MyReader(writer1.getLocation());
		writer1.clean();
	}
}
