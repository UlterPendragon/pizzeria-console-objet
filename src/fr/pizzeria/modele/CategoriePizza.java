package fr.pizzeria.modele;

public enum CategoriePizza {

	VIANDE("Viande"),
	POISSON("Poission"),
	SANS_VIANDE("Sans Viande");
	
	
	private String categorie;

	private CategoriePizza(String categorie){
		this.setCategorie(categorie);
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
}
