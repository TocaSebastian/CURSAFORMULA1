package Data;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Pilot implements java.io.Serializable  {

	Masina masina;
	String nume;
	String nume_echipa;
	int numar_participare;
	static String SEPARATOR = " ";
	

	public Pilot()
	{
		nume = new String();
		nume_echipa =  new String("");
		numar_participare = 0;
	
	}
	

	public Pilot(String nume,String nume_echipa,int numar_participare)
	{
		this.nume=nume;
		this.nume_echipa=nume_echipa;
		this.numar_participare=numar_participare;
	}
    
	
	
	
	public String toString()
	{
		return nume + SEPARATOR + nume_echipa + SEPARATOR + numar_participare;
	}
	
	public boolean equals(Object obj)
	{
		Pilot p = (Pilot)obj;
		return this.nume.equals(p.nume);
	}
	


	
	

	

	
	

	
		
	}
	

