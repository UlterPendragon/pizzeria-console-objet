package fr.pizzeria.service;

import java.util.List;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.modele.Pizza;

public class ListerPizzaService extends MenuService {

	@Override
	public void executeUC(IPizzaDao pizzaDao, Scanner scanner) {

		List<Pizza> pizzas = pizzaDao.findAllPizzas();
		System.out.println("Liste des pizzas:");
		for (Pizza p: pizzas){

		System.out.println(p.code + " -> " + p.libellee + " (" + p.prix + " )");
		
		}
	

	}

}
