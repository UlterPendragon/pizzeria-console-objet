package fr.pizzeria.dao;

import java.util.List;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.modele.Pizza;

// interface de menu des pizzas
public interface IPizzaDao {

	List<Pizza> findAllPizzas();  
	void saveNewPizza(Pizza pizza) throws SavePizzaException;
	void updatePizza(String codePizza, Pizza pizza) throws UpdatePizzaException;  
	void deletePizza(String codePizza) throws DeletePizzaException;
	Pizza findPizzaByCode(String codePizza) throws StockageException;
	boolean pizzaExists(String codePizza);
}
