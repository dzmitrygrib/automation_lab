package qom.dealer.streams;

public class MyThread extends Thread {
	public MyThread (Runnable target) {
		super(target);
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
