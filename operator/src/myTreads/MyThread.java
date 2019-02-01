package myTreads;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MyThread extends Thread implements Runnable {
	public String thrdName;

	public MyThread(String name) {
		thrdName = name;
	}

	@Override
	public void run() {
		System.out.println(thrdName + " - started");
		try {
			for (int count=0; count<10; count++) {
				Thread.sleep(400);
		System.out.println("In "+thrdName+" counter: "+count);
			}
		}
		catch(InterruptedException exc) {
			System.out.println(thrdName + " - interrupted");
		}
		System.out.println(thrdName + " - completed");
	}
	
	
}
