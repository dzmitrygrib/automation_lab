package parsers;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.soap.Text;

import java.io.File;
import java.io.IOException;

public class Dom {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File("src/data/Benefits.xml"));

		Element element = document.getDocumentElement();
		printElements(element.getChildNodes(), 0);

		System.out.println(element.getTagName());
		NodeList nodeList = element.getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			if (nodeList.item(i) instanceof Element)
				System.out.println(((Element) nodeList.item(i)).getTagName());
		}
	}

	static void printElements(NodeList nodeList, int tabs) {
		for (int i = 0; i < nodeList.getLength(); i++) {
			if (nodeList.item(i) instanceof Element) {
				String value = "";
				if (!nodeList.item(i).getTextContent().isEmpty()) {
					Text text = (Text) nodeList.item(i).getFirstChild();
					value += " - " + text.getData();
				}
				System.out.println(getTab(tabs) + nodeList.item(i).getNodeName() + value);

				NamedNodeMap attributes = nodeList.item(i).getAttributes();
				for (int j = 0; j < attributes.getLength(); j++) {
					Node attribute = attributes.item(j);
					String name = attribute.getNodeName();
					String val = attribute.getNodeValue();
					System.out.println(getTab(tabs) + "Atributes: " + name + " = " + val);
				}

//				System.out.println(getTab(tabs) + ((Element) nodeList.item(i)).getTagName());
//				if (((Element) nodeList.item(i)).hasAttribute("Finance")) {
//					System.out.println(((Element) nodeList.item(i)).getAttribute("Finance"));
//				}
				if (nodeList.item(i).hasChildNodes()) {
					printElements(nodeList.item(i).getChildNodes(), ++tabs);
				}
			}
		}
	}

	static String getTab(int tabs) {
		String str = "";
		for (int i = 0; i < tabs; i++) {
			str += "\t";
		}
		return str;
	}
}
