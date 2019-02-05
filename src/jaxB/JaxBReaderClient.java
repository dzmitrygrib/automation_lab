package jaxB;

import java.io.File;
import java.rmi.UnmarshalException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


import com.qaprosoft.insuranceCompany.people.Client;


public class JaxBReaderClient {
	public static void main(String[] args) throws JAXBException, UnmarshalException{
	File file = new File("src/data/ClientPhantom.xml");
	JAXBContext context = JAXBContext.newInstance(com.qaprosoft.insuranceCompany.people.Client.class);
	
	Unmarshaller unmarshaller = context.createUnmarshaller();
	Client client = (Client) unmarshaller.unmarshal(file);
	System.out.println(client.getClientID());
	System.out.println(client.getName());
	System.out.println(client.getOwn());

}
}
