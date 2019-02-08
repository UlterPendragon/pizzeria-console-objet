package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.modele.Pizza;

public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) throws StockageException {
				
		scanner.nextLine();
		System.out.println("Veuillez saisir un code : ");
		String newPizzaCode = scanner.nextLine();
		
		System.out.println("Veuillez saisir le nom : ");
		String newPizzaName = scanner.nextLine();
		
		System.out.println("Veuillez saisir le prix : ");
		int newPizzaPrice = scanner.nextInt();
		
		pizzaDao.saveNewPizza(new Pizza(newPizzaCode, newPizzaName, newPizzaPrice));
		
	}

}
