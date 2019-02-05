package parsers;

import java.io.File;
import java.io.IOException; 

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Sax {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	
	DefaultHandler handler = new DefaultHandler() {

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes)
				throws SAXException {
			// TODO Auto-generated method stub
			String name = attributes.getValue("numeration");
			if (name != null && !name.isEmpty()) {
				System.out.println(name);
			}
		}

		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			// TODO Auto-generated method stub
			String str = "";
			for (int i = 0; i < length; i++) {
				str += ch[start + i];
			}
			System.out.println(str);
			
		}
		
	};
		
	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser parser = factory.newSAXParser();
	parser.parse(new File("src/data/Benefits.xml"), handler);
	
	}
}
