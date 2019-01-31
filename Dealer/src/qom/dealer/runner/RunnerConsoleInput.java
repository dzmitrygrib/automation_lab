package qom.dealer.runner;

import qom.dealer.consoleinput.CarConsoleInput;
import qom.dealer.lists.CarArrayList;

public class RunnerConsoleInput {
	public static void main (String[] args) {
		CarConsoleInput in= new CarConsoleInput();
		CarArrayList list = new CarArrayList();
		list.setList(in.initCar());
		list.sortList();
		list.showList();
	}
}
