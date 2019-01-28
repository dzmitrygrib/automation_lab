package com.qaprosoft.social_network.threads;

public class ProducerThread extends Thread {
	
	private Processor processor;
	
	public ProducerThread(Processor processor) {
		this.processor = processor;
	}
	
	@Override
	public void run() {
		processor.produce();
	}

}
