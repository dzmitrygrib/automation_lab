package com.qaprosoft.social_network.input_output;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import com.qaprosoft.social_network.AccountStorage;
import com.qaprosoft.social_network.user_exceptions.StreamClosedException;

public class IO {

	private static BufferedReader consoleReader;
	public static PrintStream printConsoleToFile;

	public static void openContinuousStreams() {

		consoleReader = new BufferedReader(new InputStreamReader(System.in));

		File consoleOutputFile = new File("src\\com\\qaprosoft\\social_network\\resources", "ConsoleOutput.txt");
		try {
			FileOutputStream consoleOutputStream = new FileOutputStream(consoleOutputFile, true);
			printConsoleToFile = new PrintStream(consoleOutputStream);
		} catch (FileNotFoundException e1) {
			System.out.println("File for console output not found");
			e1.printStackTrace();
		}
	}

	public static void closeContinuousStreams() {

		try {
			if (consoleReader != null) {
				consoleReader.close();
				throw new StreamClosedException("UserException. Input stream from console is closed");	
			}
		} catch (IOException e) {
			println("Closing stream error");
		} catch (StreamClosedException sce) {
			println(sce.getMessage());
		}
		
		try {
			if (printConsoleToFile != null) {
				println("Output stream to file is closed");
				printConsoleToFile.close();
			}
		} catch (NullPointerException e) {
			println("Closing stream error");
		}
		
	}

	/* This method reads lines from console and stores them in the ArrayList */
	public static ArrayList<String> readNamesFromConsole() {

		ArrayList<String> names = new ArrayList<String>();
		boolean stopReading = false;

		try {
			println("Start entering names now. Enter empty line to finish input");
			while (!stopReading) {
				String str = consoleReader.readLine();
				if (!str.isEmpty()) {
					names.add(str);
				} else {
					stopReading = true;
				}
			}
			return names;
		} catch (IOException e) {
			println("Read from console error");
			e.printStackTrace();
			return names;
		}
	}

	/* This method reads lines from file and stores them in the ArrayList */
	public static ArrayList<String> readNamesFromFile() {

		ArrayList<String> names = new ArrayList<String>();
		boolean stopReading = false;

		File inputFile = new File("src\\com\\qaprosoft\\social_network\\resources", "AccountNamesInput.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(inputFile));
		} catch (FileNotFoundException e1) {
			println("File not found");
			e1.printStackTrace();
		}

		try {
			println("Reading names from file");
			while (!stopReading) {
				String str;
				if ((str = reader.readLine()) != null) {
					names.add(str);
				} else {
					stopReading = true;
				}
			}
			println("Names read successfully");
			reader.close();
			println("Input stream from file is closed");
			return names;
		} catch (IOException e) {
			println("Read from file error");
			return names;
		}

	}

	public static void saveAccountsToFile(AccountStorage accountStorage) {

		File file = new File("src\\com\\qaprosoft\\social_network\\resources", "Accounts.dat");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, false));
			oos.writeObject(accountStorage);
			println("Accounts saved");
			oos.close();
		} catch (FileNotFoundException e) {
			println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			println("Save to file error");
			e.printStackTrace();
		}

	}

	public static AccountStorage loadAccountsFromFile() {

		AccountStorage accountStorage = new AccountStorage();

		File file = new File("src\\com\\qaprosoft\\social_network\\resources", "Accounts.dat");

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			accountStorage = (AccountStorage) ois.readObject();
			println("Accounts loaded");
			ois.close();
			println("Input stream from file closed");

		} catch (FileNotFoundException e) {
			println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			println("Load from file error");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			println("Class not found during loading from file");
			e.printStackTrace();
		}

		return accountStorage;
	}

	/* This method checks if a user wants to use console or file */
	public static boolean fromConsole() {
		try {
			switch (consoleReader.readLine()) {
			case "Y":
				return true;
			case "y":
				return true;
			case "N":
				return false;
			case "n":
				return false;
			default:
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void print(String str) {
		System.out.print(str);
		printConsoleToFile.print(str);
	}

	public static void println(String str) {
		System.out.println(str);
		printConsoleToFile.println(str);
	}

	public static void println() {
		System.out.println();
		printConsoleToFile.println();
	}
	
	
	
	public static void saveObjectToXML(Object obj) {
		
		try {
			File fileXML = new File("src\\com\\qaprosoft\\social_network\\resources", "Object.xml");
			XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(fileXML)));
			encoder.writeObject(obj);
			encoder.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
