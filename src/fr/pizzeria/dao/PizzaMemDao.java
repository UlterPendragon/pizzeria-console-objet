package fr.pizzeria.dao;

import fr.pizzeria.modele.Pizza;

public class PizzaMemDao implements IPizzaDao{

	private Pizza[] pizzaArray;


	public PizzaMemDao(){
		pizzaArray = new Pizza[8];
		pizzaArray[0]  = new Pizza(0, "PEP", "Pépéroni", 12.50);
		pizzaArray[1]  = new Pizza(1, "MAR", "Margherita", 14.00);
		pizzaArray[2]  = new Pizza(2, "REIN", "La Reine", 11.50);
		pizzaArray[3]  = new Pizza(3, "FRO", "La 4 fromages", 12.00);
		pizzaArray[4]  = new Pizza(4, "CAN", "La cannibale", 12.50);
		pizzaArray[5]  = new Pizza(5, "SAV", "La savoyarde", 13.00);
		pizzaArray[6]  = new Pizza(6, "ORI", "L'orientale", 13.50);
		pizzaArray[7]  = new Pizza(7, "IND", "L'indienne", 14.00);

	}

	// pour lister les pizzas
	@Override
	public Pizza[] findAllPizzas() {
		return pizzaArray;
	}

	// pour enregistrer de nouvelles les pizzas
	@Override
	public void saveNewPizza(Pizza pizza) {

		int length = pizzaArray.length;
		int newLength = length + 1;
		Pizza[] newArray = new Pizza[newLength];
		for(int i = 0; i< length; i++){
			newArray[i] = pizzaArray[i];
		}
		newArray[newLength - 1] = pizza;
		pizzaArray = newArray;
	}

	// pour mettre à jour des pizzas
	@Override
	public void updatePizza(String codePizza, Pizza pizza) {

		for (int i = 0; i < pizzaArray.length; i++){   // on parcours le tableau dans la liste des pizzas
			if (codePizza.equals(pizzaArray[i].code)){
				System.out.println("code est bien existant");
				pizzaArray[i] = pizza;
			}
		}	
	}

	// pour supprimer des pizzas
	@Override
	public void deletePizza(String codePizza) {

		//tableau temporaire qui reprend la taille totale moins la case à suppr
		Pizza[] pizzaArrayTemp = new Pizza[pizzaArray.length -1];

		// on parcours le tableau dans la liste des pizzas
		int newIndex = 0;
		for (int i = 0; i < pizzaArray.length; i++){   
			// si le code qu'on rentre est different du code d'une pizza dans le tableau
			if (!codePizza.equals(pizzaArray[i].code)){ 
				//alors on copie la pizza dans le nouveau tableau car ce n'est pas celle la qu'il faut supprimer
				pizzaArrayTemp[newIndex] = pizzaArray[i];
				newIndex ++;
			}
		} 
		pizzaArray = pizzaArrayTemp;
	}

	// pour chercher des pizza avec le code
	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		for (int i = 0; i < pizzaArray.length; i++){   // on parcours le tableau dans la liste des pizzas
			if (codePizza.equals(pizzaArray[i].code)){
				return pizzaArray[i];
			} 
		}
		return null;
	}

	// pour vérifier que le code de la pizza existe
	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		for (int i = 0; i < pizzaArray.length; i++){   // on parcours le tableau dans la liste des pizzas
			if (codePizza.equals(pizzaArray[i].code)){
				return true;
			}
		}
		return false;
	}
}
