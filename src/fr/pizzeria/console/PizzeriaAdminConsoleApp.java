package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.modele.Pizza;
import fr.pizzeria.service.AjouterPizzaService;
import fr.pizzeria.service.ListerPizzaService;
import fr.pizzeria.service.MenuService;
import fr.pizzeria.service.MenuServiceFactory;
import fr.pizzeria.service.ModifierPizzaService;
import fr.pizzeria.service.SupprimerPizzaService;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner choiceMenu = new Scanner(System.in);
		int choice = 0;
		
		PizzaMemDao pizzaDao = new PizzaMemDao();
		
		while (true) {

			System.out.println("****Pizza Administration**** :");
			System.out.println("Choose an option :");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajout d'une nouvelle pizza");
			System.out.println("3. Mise à jour d'une pizza");
			System.out.println("4. Suppression d’une pizza");
			System.out.println("5. Le code de la pizza existe t-il ? ");
			System.out.println("99.Exit.");

			choice = choiceMenu.nextInt();

			MenuService service = MenuServiceFactory.getService(choice);
			if(service != null){
				service.executeUC(pizzaDao, choiceMenu);	
			}
			

		}

	}

}

