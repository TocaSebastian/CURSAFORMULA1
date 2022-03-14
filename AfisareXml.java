package XML;


import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;  

public class AfisareXml {

	public static void afisare_xml() {
		try {
			
	    	    DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
	    	    Document dom = builder.newDocument();

	    	    Element cursa = dom.createElement("Cursa");
	    	    dom.appendChild(cursa);
	    	    
	    	    Element pilot = dom.createElement("pilot");
	    	    Element nume = dom.createElement("nume");
	    	    nume.setTextContent("Hamilton");
	    	    Element nume_echipa = dom.createElement("nume_echipa");
	    	    nume_echipa.setTextContent("Mercedes");
	    	    Element numar_participare = dom.createElement("numar_participare");
	    	    numar_participare.setTextContent("5");
	    	    
	    	    pilot.appendChild(nume);
	    	    pilot.appendChild(nume_echipa);
	    	    pilot.appendChild(numar_participare);
	    	    cursa.appendChild(pilot);

	    	    Transformer tr = TransformerFactory.newInstance().newTransformer();
	    	    tr.setOutputProperty(OutputKeys.INDENT, "yes");
	    	    tr.transform(new DOMSource(dom), new StreamResult(new File("afisare_cursaF1")));

	    	} catch (Exception ex) {
	    	    ex.printStackTrace();
	    	}	
	}
}
