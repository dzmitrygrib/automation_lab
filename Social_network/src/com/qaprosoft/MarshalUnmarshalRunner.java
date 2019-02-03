package com.qaprosoft;

import java.io.File;

import com.qaprosoft.JAXB.Lists;
import com.qaprosoft.JAXB.MyMarshaller;
import com.qaprosoft.social_network.user.User;

public class MarshalUnmarshalRunner {

	public static void main(String[] args) {

		Lists outputList = new Lists();
		for (int i = 0; i < 5; i++) {
			outputList.getList().add(new User());
		}

		File xmlMarshallingFile = new File("src\\com\\qaprosoft\\social_network\\data"
				+ "\\marshalling\\UsersMarshalling.xml");
		
		MyMarshaller mm = new MyMarshaller();

		mm.marshal(outputList, xmlMarshallingFile);
		
		
		File xmlUnmarshallingFile = new File("src\\com\\qaprosoft\\social_network\\data"
				+ "\\marshalling\\UsersForUnmarshalling.xml");
		
		Lists inputList = new Lists();
		inputList = mm.unmarshal(xmlUnmarshallingFile);
		
		for (Object obj : inputList.getList()) {
			System.out.println(obj.toString());
		}
	}

}
