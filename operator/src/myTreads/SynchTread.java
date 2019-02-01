package myTreads;

import people.Customer;
import operations.*;
import writer.WriterFileCustomer;

public class SynchTread {
	Customer customer;
	WriteCustomerThread writer;
	ReaderFile readerFile;

	public SynchTread() {
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
		notify();
	}

}
