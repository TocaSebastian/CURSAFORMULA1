package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import XML.AfisareXml;
import XML.CitireXml;
import view.GUI_aplicatie;
import view.Observator;



public class Cursa {
	
	Pista pista;
	Vector<Masina> masini;
	Vector<Pilot> piloti;
	Vector<Observator> observatori;

	
	public Cursa(int nr_masini ,int nr_piloti)
	{
		masini=new Vector<Masina>(nr_masini);
		piloti=new Vector<Pilot>(nr_piloti);
		observatori=new Vector<Observator>();
		
	}

	 
	public boolean AdaugaPilot(Pilot p)
	{
		boolean rez = piloti.add(p);
		
		for(int i = 0; i < observatori.size();i++)
		{
			observatori.get(i).update(p);
		}
		
		return rez;
	}
	
	public boolean ScoatePilot(Pilot p)
	{
		boolean rez = piloti.remove(p);
		
		for(int i = 0; i < observatori.size();i++)
		{
			observatori.get(i).update(p);
		}
		
		return rez;
	}
	
	
	public Vector<Pilot> getCursa()
	{
		return piloti;
	}
	
	public void adaugaObservator(Observator o)
	{
		observatori.add(o);
	}
	
	public void scoateObservator(Observator o)
	{
		observatori.remove(o);
	}
	
	

public static void main(String args[])
{
	Cursa cursa = new Cursa(4,4);
	
	GUI_aplicatie gui = new GUI_aplicatie(cursa);
	
	cursa.adaugaObservator(gui);
	
	Pilot p1 = new Pilot("Charles", "Ferrari", 7);
     cursa.AdaugaPilot(p1);
 	Pilot p2 = new Pilot("Russel", "Mercedes", 6);
    cursa.AdaugaPilot(p2);
	Pilot p3 = new Pilot("Sainz", "Ferrari", 4);
    cursa.AdaugaPilot(p3);
	Pilot p4 = new Pilot("Ricciardo", "Mercedes", 1);
    cursa.AdaugaPilot(p4);


	
}


}

    	
     
	 
	 
     
	
		



