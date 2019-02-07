package fr.pizzeria.service;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.modele.Pizza;

public class ListerPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) {

		Pizza[] pizzas = pizzaDao.findAllPizzas();
		System.out.println("Liste des pizzas:");
		for (int i = 0; i < pizzas.length; i++){
			System.out.println(pizzas[i].code + " -> " + pizzas[i].libellee + " (" + pizzas[i].prix + " )");
		}

	}

}
