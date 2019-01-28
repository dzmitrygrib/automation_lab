package com.qaprosoft.social_network.threads;

public class ConsumerThread implements Runnable {
	
	private Processor processor;
	
	public ConsumerThread(Processor processor) {
		this.processor = processor;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		processor.consume();
	}

}
