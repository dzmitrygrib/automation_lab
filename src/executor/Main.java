package executor;

import java.util.*;
import myThreads.ClientThread;
import myThreads.SynchThread;
import myThreads.WriteClientThread;
import nonStringResultException.NonStringResultException;
//import java.io.*;
import travelagency.*;
import reader.*;
import service.TourService;
import service.VisaService;
import writer.*;
//import stream.*;
import people.*;

public class Main {
	public static void main(String[] args) {
		String str;
		TravelAgency travelAgency = new TravelAgency();
		travelAgency.name = "Light";
		System.out.println("Travel agency: " + travelAgency.name);
		travelAgency.address = "MINSK, ALAIBALAIYA ST.,98";
		System.out.println("Address: " + travelAgency.address);
		travelAgency.number = "8(017)3214569";
		System.out.println("Phone number: " + travelAgency.number);
		System.out.println("------------------------------");

		ArrayList<Client> clientsBase = new ArrayList<Client>();
		ReaderClientFile readerClientFile = new ReaderClientFile(clientsBase);
		readerClientFile.reader();
		readerClientFile.printFile();
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Hello! Are you our new customer? Please, enter yes/no.");
			str = in.nextLine();
			if (str != null && (str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("no"))) {
				switch (str.toLowerCase()) {
				case "yes":
					System.out.println("New client!");
					Client client = new Client();
					client.enterNewClient();
					WriterFileClient newClient = new WriterFileClient();
					newClient.writeFileClient(client);
					break;
				

				case "no":
					System.out.println("Not new client!");
					break;
				}

				System.out.println("Do you need a tour or visa services? Please, enter tour/visa.");
				str = in.nextLine();
				if (str != null && (str.equalsIgnoreCase("tour") || str.equalsIgnoreCase("visa"))) {
					// choose tour
					switch (str.toLowerCase()) {
					case "tour":
						TourService clientWishTour = new TourService();
						clientWishTour.getTourWish();
						ReaderToursFile readerFile = new ReaderToursFile();
						readerFile.reader();

						break;

					case "visa":
						VisaService clientWishVisa = new VisaService();
						clientWishVisa.getVisaWish();
						// clientWishVisa.compareWish(clientWishVisa.getCountry(), baseVisa);
						break;

					default:
						System.out.println("Sorry, you did not enter the required information!");
						break;
					}
				} else {
					System.out.println("Sorry, you did not enter the required information!");
				}

			} else {
				System.out.println("Sorry, you did not enter the required information!");
			}
			in.close();
		}

		catch (NonStringResultException exc) {
			System.out.println("Error! You did not enter a data!");
			return;
		} catch (RuntimeException exc) {
			System.out.println("Problems with closing the stream!");
		}
		SynchThread synchThread = new SynchThread();
		ClientThread clientThread = new ClientThread(synchThread);
		WriteClientThread writeClientThread = new WriteClientThread(synchThread);
		new Thread(clientThread).start();
		new Thread(writeClientThread).start();
		
	}
	
}