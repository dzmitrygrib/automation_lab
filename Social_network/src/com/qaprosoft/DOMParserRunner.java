package com.qaprosoft;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.qaprosoft.DOMParser.MyDOMParser;
import com.qaprosoft.social_network.user.User;

public class DOMParserRunner {

	public static void main(String[] args) {

		File file = new File("src\\com\\qaprosoft\\social_network\\data\\Admins.xml");

		MyDOMParser myDOMParser = new MyDOMParser();
		
		try {
			myDOMParser.ParseXML(file);
			
			ArrayList<User> list = myDOMParser.getList();
			
			for (User user : list) {
				System.out.println(user);
			}
			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

	}

}
