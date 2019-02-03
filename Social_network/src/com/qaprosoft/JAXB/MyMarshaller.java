package com.qaprosoft.JAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.qaprosoft.social_network.user.User;

public class MyMarshaller {

	public void marshal(Lists list, File xmlMarshallingFile) {

		if (list != null && !list.getList().isEmpty()) {
			try {
				JAXBContext jc = JAXBContext.newInstance(list.getClass(), list.getList().get(0).getClass());
				Marshaller marshaller = jc.createMarshaller();
				marshaller.marshal(list, xmlMarshallingFile);
				System.out.println("Objects have been marshalled");
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
	}

	public Lists unmarshal(File file) {
		
		Lists list = new Lists();
		
		try {
			JAXBContext jc = JAXBContext.newInstance(list.getClass(), User.class);
			Unmarshaller marshaller = jc.createUnmarshaller();
			list = (Lists) marshaller.unmarshal(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}