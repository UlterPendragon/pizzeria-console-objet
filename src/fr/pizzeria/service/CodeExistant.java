package fr.pizzeria.service;
import fr.pizzeria.modele.Pizza;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;

public class CodeExistant extends MenuService {

	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) throws StockageException{

		System.out.println("Tapez le code de la pizza dont vous souhaitez les informations");
		String codePizzaAVerifier = scanner.next();
		if(pizzaDao.pizzaExists(codePizzaAVerifier)){
			Pizza p = pizzaDao.findPizzaByCode(codePizzaAVerifier);
			System.out.println(codePizzaAVerifier + " est reconnu. Voici les informations : \n" + p.code + " " + p.libellee + " " + p.categorie + " " + p.prix);

		}else{
			System.out.println("code non reconnu : ");
			executeUC(pizzaDao, scanner);
		}
	}
}
