package qom.dealer.streams;

import qom.dealer.human.Client;

public class MyRunnable2 implements Runnable {

	@Override
	public void run() {
		Client jack =new Client("Tom","Bmw","BM523025");
		jack.say();
	}

}
