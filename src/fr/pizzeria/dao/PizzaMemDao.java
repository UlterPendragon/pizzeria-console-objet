package fr.pizzeria.dao;

import java.util.*;

import fr.pizzeria.modele.Pizza;



public class PizzaMemDao implements IPizzaDao{

	private ArrayList<Pizza> listePizza = new ArrayList<Pizza>();

	public PizzaMemDao(){
		Pizza p0 = new Pizza(0, "PEP", "Pépéroni", 12.50);
		listePizza.add(p0);
		Pizza p1 = new Pizza(1, "MAR", "Margherita", 14.00);
		listePizza.add(p1);
		Pizza p2 = new Pizza(2, "REIN", "La Reine", 11.50);
		listePizza.add(p2);
		Pizza p3 = new Pizza(3, "FRO", "La 4 fromages", 12.00);
		listePizza.add(p3);
		Pizza p4 = new Pizza(4, "CAN", "La cannibale", 12.50);
		listePizza.add(p4);
		Pizza p5 = new Pizza(5, "SAV", "La savoyarde", 13.00);
		listePizza.add(p5);
		Pizza p6 = new Pizza(6, "ORI", "L'orientale", 13.50);
		listePizza.add(p6);
		Pizza p7 = new Pizza(7, "IND", "L'indienne", 14.00);
		listePizza.add(p7);
	} 

	// pour lister les pizzas
	@Override
	public List<Pizza> findAllPizzas() {
		Iterator<Pizza> iteratorPizza = listePizza.iterator();
		while (iteratorPizza.hasNext()){
			Pizza maPizza = iteratorPizza.next();
		}
		return listePizza;
	}

	// pour enregistrer de nouvelles les pizzas
	@Override
	public void saveNewPizza(Pizza pizza) {
		listePizza.add(pizza);
	}

	// pour mettre à jour des pizzas
	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		Pizza pizzaToUpdate = findPizzaByCode(codePizza);
		
		listePizza.set(listePizza.indexOf(pizzaToUpdate), pizza);
		
	}

	// pour supprimer des pizzas
	@Override
	// Iterator pour dérouler la liste
	public void deletePizza(String codePizza) {
		Iterator<Pizza> iteratorPizza = listePizza.iterator();
		while (iteratorPizza.hasNext()){
			Pizza maPizza = iteratorPizza.next();
			// condition si code entré correspond à un object pizza (une des pizzas) de la liste
			if (codePizza.equals(maPizza.code)){
				iteratorPizza.remove();
			}
		}
	}

	// pour chercher des pizza avec le code
	@Override
	public Pizza findPizzaByCode(String codePizza) {
		Iterator<Pizza> iteratorPizza = listePizza.iterator();
		while (iteratorPizza.hasNext()){
			Pizza maPizza = iteratorPizza.next();
			if (codePizza.equals(maPizza.code)){
				iteratorPizza.next();
				return maPizza;
			}
		}
		return null;
	}

	/* 
	ATTENTION : Ce Code n'est pas initialisé dans MenuServiceFactory (car cas 5 actuellement inexistant)
	
	// pour vérifier que le code de la pizza existe 
	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
			Iterator<Pizza> iteratorPizza = listePizza.iterator();
			while (iteratorPizza.hasNext()){
				Pizza maPizza = iteratorPizza.next();
				if (codePizza.equals(maPizza.code)){
				}
				return true;
			}
		return false;
	}
	*/
}
