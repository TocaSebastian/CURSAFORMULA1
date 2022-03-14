package XML;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CitireXml {
	public static void citire_xml() {
		try {
			
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document dom = builder.parse("citire_cursa.xml");
			
			dom.getDocumentElement().normalize();
			
			System.out.println(dom.getDocumentElement().getNodeName());
			
			NodeList lista = dom.getElementsByTagName("pilot");

	        for (int i = 0; i < lista.getLength(); i++) {
	              Node nod = lista.item(i);
	              
	              if (nod.getNodeType() == Node.ELEMENT_NODE) {
	                  
	            	  Element element = (Element) nod;
	                 
	                  String nume = element.getElementsByTagName("nume").item(0).getTextContent();
	                  String nume_echipa = element.getElementsByTagName("nume_echipa").item(0).getTextContent();
	                  String numar_participant = element.getElementsByTagName("numar_participare").item(0).getTextContent();
	                  
	                  System.out.println("Numele pilotului: " + nume);
	                  System.out.println("Numele echipei : " + nume_echipa);
	                  System.out.println("Numar participare : " + numar_participant);
	              }
	          }
	        }
		
		 catch (Exception ex) {
			ex.printStackTrace();
		}		
	}
}

