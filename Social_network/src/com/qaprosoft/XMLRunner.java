package com.qaprosoft;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class XMLRunner {

	public static void main(String[] args) {
			
		File xmlFile = new File("src\\com\\qaprosoft\\social_network\\resources", "Object.xml");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(xmlFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		XMLEncoder encoder = new XMLEncoder(fos);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list1.add(i);
		}
		
		encoder.writeObject(list1);
		System.out.println("Object written to XML");
		
		encoder.close();
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(xmlFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		XMLDecoder decoder = new XMLDecoder(fis);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2 = (ArrayList<Integer>) decoder.readObject();
		
		for (int i : list2) {
			System.out.println(i);
		}
		
		decoder.close();
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
