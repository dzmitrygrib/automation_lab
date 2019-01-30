package qom.dealer.human;

import qom.dealer.lists.CarArrayList;

public class Manager implements Human {

	private String name = "Default";
	private int persNum = 0;

	Manager(String name, int num) {
		this.name = name;
		this.persNum = num;
	}

	Manager() {
		generateNum();
	}

	private void generateNum() {
		persNum = (int) (Math.random() * 100);
	}

	public int getPersNum() {
		return persNum;
	}

	public void makeOffer(String wish, CarArrayList list) {
		list.getPurchase(wish).display();

	}

	@Override
	public void say() {
		System.out.print("Manager: " + name);

	}

	@Override
	public String getName() {
		return name;
	}

}
