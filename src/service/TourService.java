package service;

import java.util.Scanner;

public class TourService extends Service {
	public String nameOfTour = "Default";
	protected String typeOfTour = "Default";
	protected String city = "Default";
	protected String hotel = "Default";
	protected int numberOfStars = 0;

	public TourService() {
		super();
	}

	public void setNameOfTour(String nameOfTour) {
		this.nameOfTour = nameOfTour;
	}

	public String getNameOfTour() {
		return this.nameOfTour;
	}

	public void setTypeOfTour(String typeOfTour) {
		this.typeOfTour = typeOfTour;
	}

	public String getTypeOfTour() {
		return this.typeOfTour;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public String getHotel() {
		return this.hotel;
	}

	public void setNumberOfStars(int numberOfStars) {
		this.numberOfStars = numberOfStars;
	}

	public int getNumberOfStars() {
		return this.numberOfStars;
	}

	public void addChange() {
		System.out.println("Add changes in information");
	}

	public void getTourWish() {
		try (Scanner in = new Scanner(System.in)) {
			TourService clientWishTour = new TourService();
			System.out.println("Which country would you like to go to?");
			String str = in.nextLine();
			clientWishTour.setCountry(str);
			System.out.println("Which city would you like to go to?");
			str = in.nextLine();
			clientWishTour.setCity(str);
			System.out.println("Would you like to fly a plane / take a bus / sea cruise?");
			System.out.println("Please enter avia/bus/cruise!");
			str = in.nextLine();
			System.out.println("How many stars does the hotel have?");
			int stars = in.nextInt();
			clientWishTour.setNumberOfStars(stars);
			in.close();
		} catch (RuntimeException ex) {
			System.out.println("Problems with closing the stream!");
		}
	}
}
