package qom.dealer.streams;

import qom.dealer.human.Client;

public class MyRunnable1 implements Runnable {

	@Override
	public void run() {
		Client jack =new Client("Jack","Audi","BM523025");
		jack.say();
	}

}
