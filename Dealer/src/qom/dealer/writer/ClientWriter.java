package qom.dealer.writer;

import java.io.FileWriter;
import java.io.IOException;

import qom.dealer.human.Client;

public class ClientWriter implements Writer {
	private Client client;
	private static final String LOCATION = "src\\qom\\dealer\\resources\\Clients.txt";

	public void setClient(Client client) {
		this.client = client;
	}

	public void clean() {
		try {
			FileWriter writer = new FileWriter(LOCATION);
			writer.write("");
			writer.close();
		} catch (IOException ex) {
			ex.getStackTrace();
		} catch (NullPointerException ex) {
			ex.getStackTrace();
		}

	}

	@Override
	public void writeFile() {
		try {
			FileWriter writer = new FileWriter(LOCATION, true);
			writer.write(client.getName() + " " + client.getWish());
			writer.append("\n");
			writer.close();
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
		} catch (NullPointerException ex) {
			System.out.println(ex.getStackTrace());
		}

	}

	@Override
	public String getLocation() {
		return LOCATION;
	}
}
