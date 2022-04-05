package Data;

import Data.Masina.Builder;

public class Pilot   {


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
    
	
	private Pilot(Builder b)
	{
		this.nume=b.nume;
		this.nume_echipa=b.nume_echipa;
		this.numar_participare=b.numar_participare;

	}
	
	public static class Builder
	{
		String nume;
		String nume_echipa;
		int numar_participare;
	    
	
	 
	public Builder SeteazaNume(String nume)
	{
		this.nume=nume;
		return this;
		
	}
	
	public Builder SeteazaNume_echipa(String nume_echipa)
	{
		this.nume_echipa=nume_echipa;
		return this;
	}
	
	public Builder SeteazaNumar_participare(int numar_participare)
	{
		this.numar_participare=numar_participare;
		return this;
	}
	
	public Pilot build()
	{
		return new Pilot(this);
	}
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
	

