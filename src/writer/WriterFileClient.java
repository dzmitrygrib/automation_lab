package writer;

import people.Client;
import java.io.*;
import java.util.Scanner;

public class WriterFileClient {
	Client client = new Client();
	Scanner in = new Scanner(System.in);
	public String str;

	public WriterFileClient() {
	}

	public void writeFileClient(Client client) {
		try (FileWriter fileWriter = new FileWriter("PeopleClients.txt", true)) {
			fileWriter.write("\n" + client.getNamePeople() + "\t");
			fileWriter.write(client.getSex() + "\t");
			fileWriter.write(client.getPasportID() + "\t");
			fileWriter.write(client.getNumberPhonePeople() + "\t");
			fileWriter.write(client.getAddressPeople() + "\t");
			fileWriter.write(client.getEmailPeople() + "\t");
			fileWriter.write(client.getLPMember() + "\t");
		} catch (IOException exc) {
			System.out.println("Error.File has not writting!");
			return;
		}
	}
}
