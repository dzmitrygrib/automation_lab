package myThreads;

import reader.ReaderClientFile;

public class ClientThread implements Runnable {

	public ReaderClientFile readerFile;
	SynchThread synchThread;

	public ClientThread(SynchThread synchThread) {
		this.synchThread = synchThread;
	}

	public void run() {
		System.out.println("Read base!");
		readerFile.reader();
	}

}
