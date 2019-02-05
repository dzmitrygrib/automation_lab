package com.qaprosoft;

import java.io.File;

import com.qaprosoft.JAXB.Lists;
import com.qaprosoft.JAXB.MyMarshaller;
import com.qaprosoft.social_network.user.User;

public class MarshalUnmarshalRunner {

	public static void main(String[] args) {

		//Creating a list of Users, which will be marshaled into XML
		Lists outputList = new Lists();
		for (int i = 0; i < 5; i++) {
			outputList.getList().add(new User());
		}

		//XML file for storing marshaled list of Users
		File xmlMarshallingFile = new File("src\\com\\qaprosoft\\social_network\\data"
				+ "\\marshalling\\UsersMarshalling.xml");
		
		MyMarshaller mm = new MyMarshaller();

		mm.marshal(outputList, xmlMarshallingFile);
		
		//XML file with User objects awaiting unmarshalling
		File xmlUnmarshallingFile = new File("src\\com\\qaprosoft\\social_network\\data"
				+ "\\marshalling\\UsersForUnmarshalling.xml");
		
		//List for storing unmarshaled Users.
		//Method "unmarshal" returns instance of Lists class
		Lists inputList = new Lists();
		inputList = mm.unmarshal(xmlUnmarshallingFile);
		
		//Printing unmarshaled Users
		for (Object obj : inputList.getList()) {
			System.out.println(obj.toString());
		}
	}

}
