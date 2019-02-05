package parsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class Stax {
	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
	
		//Stax
	
		XMLInputFactory factory2 = XMLInputFactory.newInstance();
		XMLStreamReader parser2 = factory2.createXMLStreamReader(new FileInputStream("src/data/CompanyPayments.xml"));
		
		while (parser2.hasNext()){
			int event = parser2.next();
			if(event == XMLStreamConstants.START_ELEMENT) {
				System.out.println(parser2.getLocalName());
			}
			if (event == XMLStreamConstants.CHARACTERS) {
				System.out.println(parser2.getText());
			}
		}
	}
}
