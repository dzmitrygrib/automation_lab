package reader;

import people.*;
import java.util.*;
import java.io.*;
//import java.lang.*;
import java.util.regex.Pattern;

public class ReaderClientFile {
	int i = 1;
	String line;
	ArrayList<Client> clientsBase = new ArrayList<Client>();

	public ReaderClientFile(ArrayList<Client> clientsBase) {

	}

	public void reader() {
		BufferedReader readFromFile = null;

		try {
			readFromFile = new BufferedReader(new FileReader("PeopleClients.txt"));
			line = readFromFile.readLine();
			Pattern pattern = Pattern.compile("\t");
			while (line != null) {
				Client newUser = new Client();
				String[] words = pattern.split(line);
				newUser.setNamePeople(words[0]);
				newUser.setSex(words[1]);
				newUser.setPasportID(words[2]);
				newUser.setNumberPhonePeople(words[3]);
				newUser.setAddressPeople(words[4]);
				newUser.setEmailPeople(words[5]);
				newUser.setLPMember(words[6]);
				newUser.setNumberClient(i);
				clientsBase.add(newUser);
				line = readFromFile.readLine();
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} /*
			 * finally { if (readFromFile = null) try { readFromFile.close(); } catch
			 * (IOException e) { e.printStackTrace(); } }
			 */

	}

	public void printFile() {
		for (Client people : clientsBase) {
			System.out.print(people.getNamePeople() + "\t");
			System.out.print(people.getPasportID() + "\t");
			System.out.print(people.getSex() + "\t");
			System.out.print(people.getAddressPeople() + "\t");
			System.out.print(people.getEmailPeople() + "\t");
			System.out.print(people.getNumberPhonePeople() + "\t");
			System.out.print(people.getLPMember() + "\t");
			System.out.println(people.getNumberClient());
		}

	}

}
