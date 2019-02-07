package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;

public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) {
		// TODO Auto-generated method stub
		scanner.nextLine(); //pour �viter le bug du clavier
		
		//variable qui permet de taper le code � supprimer
		System.out.println("Veuillez choisir le code la pizza � supprimer : ");
		String codePizzaToDelete = scanner.nextLine();
					
		pizzaDao.deletePizza(codePizzaToDelete);	
	}

}
