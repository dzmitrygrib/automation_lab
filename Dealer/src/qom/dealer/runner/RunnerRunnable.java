package qom.dealer.runner;

import qom.dealer.streams.MyRunnable1;
import qom.dealer.streams.MyRunnable2;
import qom.dealer.streams.MyThread;

public class RunnerRunnable {
	public static void main(String []args)  {
		MyRunnable1 r = new MyRunnable1();
		MyRunnable2 runner = new MyRunnable2();
		MyThread thread = new MyThread (r);
		thread.start();
		System.out.println(thread.isDaemon());
		try {
			Thread.sleep(2000);
			}catch (InterruptedException ex) {
				ex.getMessage();
			}
		try {
			thread.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread= new MyThread(runner);
		thread.start();
		try {
			Thread.sleep(2000);
			}catch (InterruptedException ex) {
				ex.getMessage();
			}
		System.out.println("Method");
	}
}
