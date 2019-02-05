package com.qaprosoft.DOMParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.qaprosoft.social_network.user.Admin;
import com.qaprosoft.social_network.user.MaritalStatus;
import com.qaprosoft.social_network.user.User;

public class MyDOMParser {

	private ArrayList<User> list = new ArrayList<User>();
	
	public void ParseXML(File file) throws SAXException, IOException, ParserConfigurationException {
		
		String userID;
		String userName;
		String login;
		String password;
		String maritalStatus;
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		System.out.println("Starting reading XML file ...");
		System.out.println();
		
		Document document = builder.parse(file);
		
		NodeList nodeList = document.getElementsByTagName("admin");
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				userID = element.getAttribute("userID");
				userName = element.getElementsByTagName("username").item(0).getTextContent();
				login = element.getElementsByTagName("login").item(0).getTextContent();
				password = element.getElementsByTagName("password").item(0).getTextContent();
				maritalStatus = element.getElementsByTagName("marital_status").item(0).getTextContent();
				
				User user = new Admin();
				user.setUserID(userID);
				user.setName(userName);
				user.setLogin(login);
				user.setPassword(password);
				user.setMaritalStatus(MaritalStatus.fromString(maritalStatus));
				
				list.add(user);
				
				System.out.println();
				
			}
		}
	
		System.out.println("End of XML file.");
		System.out.println();
	}
	
	public ArrayList<User> getList() {
		return list;
	}
	
}
