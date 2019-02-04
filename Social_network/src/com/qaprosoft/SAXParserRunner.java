package com.qaprosoft;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.qaprosoft.SAXParser.MySAXParser;
import com.qaprosoft.social_network.user.User;

public class SAXParserRunner {

	public static void main(String[] args) {
	
		File file = new File("src\\com\\qaprosoft\\social_network\\data\\Users.xml");
		
		MySAXParser mySAXParser = new MySAXParser();
		try {
			mySAXParser.ParseXML(file);
			ArrayList<User> list = mySAXParser.getList();
			
			for (User user : list) {
				System.out.println(user);
			}
			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
