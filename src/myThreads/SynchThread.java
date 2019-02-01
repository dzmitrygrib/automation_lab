package myThreads;

import people.Client;
import reader.ReaderClientFile;

public class SynchThread {
	Client client;
	WriteClientThread writer;
	ReaderClientFile readerFile;

	public SynchThread() {
	}

	public synchronized void runTogether() {
		if (writer.isCompletelyWritten()) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		} else {
			readerFile.reader();
		}
		//notify();
	}

}
