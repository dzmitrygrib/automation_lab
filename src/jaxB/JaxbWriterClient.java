package jaxB;

import java.io.File;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.qaprosoft.insuranceCompany.people.Client;

public class JaxbWriterClient {
public static void main(String[] args) throws JAXBException, FileNotFoundException {
	Client client = new Client();
	client.setClientID("654651321");
	client.setName("Phantom Phantom");
	client.setOwn("House");
	
	File file = new File("src/data/ClientPhantom.xml");
	JAXBContext context = JAXBContext.newInstance(Client.class);
	Marshaller marshaller = context.createMarshaller();
	
	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  // format hierarchy xml-file
	
	marshaller.marshal(client, file);
	marshaller.marshal(client, System.out);
	
//	marshaller.marshal(context, new File("src/data/ClientPhantom.xml"));
	

	
}
}
