package reader;

import service.*;
import java.util.*;
import java.util.regex.Pattern;

//import people.Client;

import java.io.*;

public class ReaderToursFile {
	private int num = 0;
	protected String line;

	ArrayList<TourService> mass = new ArrayList<TourService>();

	public ReaderToursFile() {

	}

	public void reader() {
		BufferedReader readFromFile = null;
		try {
			readFromFile = new BufferedReader(new FileReader("Tours.txt"));
			line = readFromFile.readLine();
			Pattern pattern = Pattern.compile("\t");
			while (line!= null) {
				TourService newTour = new TourService();
				String[] words = pattern.split(line);
				newTour.setCountry(words[0]);
				newTour.setCity(words[1]);
				newTour.setNameOfTour((words[2]));
				newTour.setHotel((words[3]));
				int stars = Integer.parseInt((words[4]));
				newTour.setNumberOfStars(stars);
				newTour.setTypeOfTour(words[5]);
				num = Integer.parseInt((words[6]));
				newTour.setTimeTravelling(num);
				num = Integer.parseInt((words[7]));
				newTour.setPriceService(num);
				mass.add(newTour);
				line = readFromFile.readLine();
			}
						
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (readFromFile != null)
				try {
					readFromFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

	public void printFile() {
		for (TourService tour : mass) {
			System.out.print(tour.getCountry() + "/t");
			System.out.print(tour.getCity() + "/t");
			System.out.print(tour.getNameOfTour() + " || ");
			System.out.print(tour.getHotel() + " || ");
			System.out.print(tour.getNumberOfStars() + " || ");
			System.out.print(tour.getTypeOfTour() + " || ");
			System.out.print(tour.getTimeTravelling() + " || ");
			System.out.println(tour.getPriceService());
		}

	}

}
