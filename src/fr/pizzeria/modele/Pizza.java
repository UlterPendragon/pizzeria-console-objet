package fr.pizzeria.modele;

public class Pizza {
	public static int nbPizza;

	public int id;
	public String code;
	public String libellee;
	public double prix;

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
	
	public CategoriePizza categorie;
	
	
	private CategoriePizza getCategorie() {
		return categorie;
	}

	private void setCategorie(CategoriePizza categorie) {
		this.categorie = categorie;
	}
	
	public Pizza(int id, String code, String libellee, CategoriePizza categorie, double prix){
		this.id = id;
		this.code = code;
		this.libellee = libellee;
		this.prix = prix;
		this.categorie = categorie;
	}
	
	public Pizza(String code, String libellee, CategoriePizza categorie, double prix){
		this.code = code;
		this.libellee = libellee;
		this.prix = prix;
		this.categorie = categorie;
	}
}



