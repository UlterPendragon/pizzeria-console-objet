package fr.pizzeria.console;

public class Pizza {
	int id;
	String code;
	String libellee;
	double prix;

	public Pizza(String code, String libellee, double prix)	{
		this.code = code;
		this.libellee = libellee;
		this.prix = prix;
	}
	
	public Pizza(int id, String code, String libellee, double prix)	{
		this.id = id;
		this.code = code;
		this.libellee = libellee;
		this.prix = prix;
	}
}



