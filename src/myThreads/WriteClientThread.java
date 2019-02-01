package myThreads;

import java.io.FileWriter;
import java.io.IOException;

import nonStringResultException.NonStringResultException;
import people.Client;
import writer.WriterFileClient;

public class WriteClientThread implements Runnable {
	Client client;
	WriterFileClient writer;
	SynchThread synchTread;
	
	public WriteClientThread(SynchThread synchTread) {
		this.synchTread = synchTread;
	}

	public void run() {
		System.out.println("Please wait, we add you to base!");
		try {
			client.enterNewClient();
			writer.writeFileClient(client);
		} catch (NonStringResultException e) {
			System.out.println("Error! Client did't add to base!");
		}
	}

	protected boolean isCompletelyWritten() {
		FileWriter file = null;
		try {
			file = new FileWriter("PeopleClients.txt", true);
			return true;
		} catch (Exception e) {
			System.out.println("Error!");
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					System.out.println("Error!");
				}
			}
		}
		return false;
	}

}
