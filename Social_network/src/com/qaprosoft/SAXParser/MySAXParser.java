package com.qaprosoft.SAXParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.qaprosoft.social_network.user.MaritalStatus;
import com.qaprosoft.social_network.user.User;

public class MySAXParser {

	private ArrayList<User> list = new ArrayList<User>();

	public void ParseXML(File file) throws SAXException, ParserConfigurationException, IOException {

		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();

		MyXMLHandler handler = new MyXMLHandler();

		parser.parse(file, handler);

	}

	private class MyXMLHandler extends DefaultHandler {

		private String userID;
		private String userName;
		private String login;
		private String password;
		private String maritalStatus;

		private String nodeName;

		@Override
		public void startDocument() throws SAXException {
			System.out.println("Starting reading XML file ...");
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes)
				throws SAXException {
			nodeName = qName;
			if (nodeName.equals("user")) {
				userID = attributes.getValue("userID");
			}
		}

		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			String nodeContents = new String(ch, start, length);
			if (!nodeContents.isEmpty()) {
				switch (nodeName) {
				case "username":
					userName = nodeContents;
					break;
				case "login":
					login = nodeContents;
					break;
				case "password":
					password = nodeContents;
					break;
				case "marital_status":
					maritalStatus = nodeContents;
					break;
				}
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			if (qName.equals("user")) {
				User user = new User();
				user.setUserID(userID);
				user.setName(userName);
				user.setLogin(login);
				user.setPassword(password);
				user.setMaritalStatus(MaritalStatus.fromString(maritalStatus));
				list.add(user);
			}
		}

		@Override
		public void endDocument() throws SAXException {
			System.out.println("End of XML file.");
			System.out.println();
		}

	}

	public ArrayList<User> getList() {
		return this.list;
	}

}
