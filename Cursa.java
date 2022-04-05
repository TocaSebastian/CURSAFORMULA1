package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
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
		pista=Pista.CrearePista();
	}
    

	public boolean AdaugaPilot(Pilot p)
	{
		boolean rez = piloti.add(p);
		
		Iterator<Observator>it1=observatori.iterator();
		while(it1.hasNext())
		{
			it1.next().update(p);
		}
		
		
	/*	for(int i = 0; i < observatori.size();i++)
	 * 
		{
			observatori.get(i).update(p);
		} */
		
		return rez;
	}
	
	public boolean ScoatePilot(Pilot p)
	{
		
		boolean rez = piloti.remove(p);
		Iterator<Observator> it=observatori.iterator();
		while(it.hasNext())
		{
			it.next().update(p);
		}
		
		
	/*	for(int i = 0; i < observatori.size();i++)
		{
			observatori.get(i).update(p);
		}*/
		
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
	
	Pista pista=Pista.CrearePista();
	cursa.pista=pista;
	
	FactoryCursa c=new FactoryCursa();
	Cursa cursa1=c.CreateCursa();
	Cursa cursa2=c.CreateCursa();
	
	
	Pilot p1 = new Pilot.Builder().SeteazaNume("Ion").SeteazaNume_echipa("RedBull").SeteazaNumar_participare(4).build();
     cursa.AdaugaPilot(p1);
 	Pilot p2 = new Pilot.Builder().SeteazaNume("Andrei").SeteazaNume_echipa("RedBull").SeteazaNumar_participare(1).build();
    cursa.AdaugaPilot(p2);
	Pilot p3 = new Pilot.Builder().SeteazaNume("Mihai").SeteazaNume_echipa("Audi").SeteazaNumar_participare(2).build();
    cursa.AdaugaPilot(p3);
	Pilot p4 = new Pilot.Builder().SeteazaNume("Mircea").SeteazaNume_echipa("RedBull").SeteazaNumar_participare(6).build();
    cursa.AdaugaPilot(p4);

 

}
}
    	
     
	 
	 
     
	
		



