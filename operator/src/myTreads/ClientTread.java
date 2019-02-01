package myTreads;

import operations.ReaderFile;

public class ClientTread implements Runnable {

	public ReaderFile readerFile;
	SynchTread synchTread;

	public ClientTread(SynchTread synchTread) {
		this.synchTread = synchTread;
	}

	public void run() {
		System.out.println("Read base!");
		readerFile.reader();
	}

}
