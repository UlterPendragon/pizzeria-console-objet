package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.modele.CategoriePizza;
import fr.pizzeria.modele.Pizza;

public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) throws UpdatePizzaException {
		// TODO Auto-generated method stub
		scanner.nextLine(); //pour éviter le bug du clavier

		//variable qui permet de selectionner le code à modifier 
		System.out.println("Veuillez choisir le code la pizza à modifier : ");
		String codePizzaToModify = scanner.nextLine();

		if(!pizzaDao.pizzaExists(codePizzaToModify)){
			throw new UpdatePizzaException("la pizza n'existe pas");
		}

		//variable qui permet de saisir un nouveau code
		System.out.println("Veuillez saisir un nouveau code : ");
		String modifPizzaCode = scanner.nextLine();

		//variable qui permet de saisir un nouveau nom
		System.out.println("Veuillez saisir le nouveau nom : ");
		String modifPizzaName = scanner.nextLine();

		//variable qui permet de saisir un chiffre de la selection affichée pour les catégories (entre viande, poisson, sans viande) enum.
		System.out.println("Veuillez sélectionner le chiffre d'une catégorie parmis les suivantes : ");
		System.out.println("1. VIANDE");
		System.out.println("2. POISSON");
		System.out.println("3. SANS_VIANDE");
	
		int modifPizzaCategorie = scanner.nextInt();
		CategoriePizza categorie = null;	
		switch(modifPizzaCategorie){
			case 1:
				categorie =  CategoriePizza.VIANDE;
				break;
			case 2:
				categorie =  CategoriePizza.POISSON;
				break;
			case 3:
				categorie = CategoriePizza.SANS_VIANDE;
				break;
			default:
				
			}
		
		//variable qui permet de saisir un nouveau prix
		System.out.println("Veuillez saisir le nouveau prix : ");
		int modifPizzaPrice = scanner.nextInt();

		Pizza modifiedPizza = new Pizza(modifPizzaCode, modifPizzaName,categorie, modifPizzaPrice);
		pizzaDao.updatePizza(codePizzaToModify,modifiedPizza);
	}
}


