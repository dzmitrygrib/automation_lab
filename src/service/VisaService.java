package service;

import java.util.ArrayList;
import java.util.Scanner;

public class VisaService extends Service {
	public VisaService() {
	}

	public VisaService(int priceService) {
		super();
	}

	public void addChange() {
		System.out.println("Add changes in information");
	}

	public void getVisaWish() {
		try (Scanner in = new Scanner(System.in)) {
			VisaService visaWish = new VisaService();
			System.out.println("Which country would you like to go to?");
			String str = in.nextLine();
			visaWish.setCountry(str);
		} catch (RuntimeException ex) {
			System.out.println("Problems with closing the stream!");
		}
	}

	public void compareWish(String str, ArrayList<VisaService> visaService, VisaService vService) {
		if (vService.country == str) {
			for (VisaService vs : visaService) {
				if (vs.country == str)
					vs.print(vService);
			}
		} else
			System.out.println("We can not help you apply for a visa to this country!");
	}

	public void print(VisaService visa) {
		System.out.print("You go to " + visa.getCountry() + "! ");
		System.out.println("Ñonsular fee (price) -  " + visa.getPriceService());
	}
}