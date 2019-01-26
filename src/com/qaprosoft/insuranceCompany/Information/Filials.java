package com.qaprosoft.insuranceCompany.Information;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Filials {
	static String[] citiesFilials = { "Minsk", "Brest", "Grodno", "Vitebsk", "Mogilyov", "Bobruisk", "Orsha", "Pinsk" };
	int i, y;
	public ArrayList citieslist = new ArrayList();

	private void includeCities(String[] citiesFilials) // method adds items citiesFilials in citieslist
	{

		for (i = 0; i < citiesFilials.length; i++) { // adding elements one by one from the array citiesFilials

			citieslist.add(citiesFilials[i]);
			printCities(i);
		}
		// adding elements by specifying positions
		citieslist.add(5, "Gomel");
		citieslist.add(4, "Borisov");
		Scanner scanner = new Scanner(System.in);
			for (y = 0; y <= 4; y++) {
				String s = scanner.nextLine();
				citieslist.add(s); // (citiesFilials.length+2+y,s)
			}
	}

//show show items at specified position
	private void printCities(int i) {
		System.out.println("Cities with filiates " + (i + 1) + ":" + citieslist.get(i));
	}

	// show all elements
	private void printCities() {
		System.out.println("\n"); // means line feed
		for (int i = 0; i < citieslist.size(); i++) {
			System.out.println("Cities with filiates " + (i + 1) + ":" + citieslist.get(i));
		}
	}

	private int sizeofCitiesList() {
		System.out.println("\n");
		System.out.println("Total No of Cities in Array:" + citiesFilials.length);
		System.out.println("Total No of Cities in List:" + citieslist.size());
		return citieslist.size();

	}

	public static void main(String args[]) throws Exception {
		Filials cities = new Filials();
		cities.includeCities(citiesFilials);
		cities.printCities();
		int size = cities.sizeofCitiesList();

//        File file = new File("Filials.txt");
//        file.createNewFile();
//        FileWriter writer = new FileWriter(file); 
//        writer.write(citieslist);
//        
//       
//        writer.flush();
//        writer.close();

//        try{
//            
//            File file = new File("Filials.txt");
//            file.createNewFile();
//            FileWriter writer = new FileWriter(file); 

		try (FileWriter fw = new FileWriter("myfile.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw))

		{

			for (String line : citiesFilials) {
				out.write(line);
				out.write(System.getProperty("line.separator"));

			}

			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

//        //      cities.sizeofCitiesList();
//        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
//        System.setOut(out);

	}
}