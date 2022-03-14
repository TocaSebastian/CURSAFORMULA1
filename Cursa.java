package Data;

import java.io.IOException;
import java.util.Vector;

import XML.AfisareXml;

public class Cursa {
	
	Pista pista;
	Vector<Pilot> piloti;
	
	public Cursa(int nr_piloti)
	{
		piloti=new Vector<Pilot>(nr_piloti);
		pista=new Pista(nr_piloti);
		
	}
	public void Afisare() {
	System.out.println("Cursa contine");
	
	}
	 

	


	public static void main(String[] args) throws IOException {
	Cursa cursa =new Cursa(1);
	cursa.Afisare();
	AfisareXml.afisare_xml();

	
		

	}

}
