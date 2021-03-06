package fr.pizzeria.service;

public class MenuServiceFactory {

	public static MenuService getService(int choix){
		switch(choix){
		case 1:
			return new ListerPizzaService();	
		case 2:
			return new AjouterPizzaService();
		case 3:
			return new ModifierPizzaService();
		case 4:
			return new SupprimerPizzaService();
		case 5:
			return new CodeExistant();
		}
		return null;
	}
}
