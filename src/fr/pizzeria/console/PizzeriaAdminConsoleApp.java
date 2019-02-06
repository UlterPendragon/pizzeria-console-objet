package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner choiceMenu = new Scanner(System.in);

		Pizza[] pizzaArray = new Pizza[8];

		int choice = 0;

		pizzaArray[0]  = new Pizza(0, "PEP", "Pépéroni", 12.50);
		pizzaArray[1]  = new Pizza(1, "MAR", "Margherita", 14.00);
		pizzaArray[2]  = new Pizza(2, "REIN", "La Reine", 11.50);
		pizzaArray[3]  = new Pizza(3, "FRO", "La 4 fromages", 12.00);
		pizzaArray[4]  = new Pizza(4, "CAN", "La cannibale", 12.50);
		pizzaArray[5]  = new Pizza(5, "SAV", "La savoyarde", 13.00);
		pizzaArray[6]  = new Pizza(6, "ORI", "L'orientale", 13.50);
		pizzaArray[7]  = new Pizza(7, "IND", "L'indienne", 14.00);

		while (true) {

			System.out.println("****Pizza Administration**** :");
			System.out.println("Choose an option :");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajout d'une nouvelle pizza");
			System.out.println("3. Mise à jour d'une pizza");
			System.out.println("4. Suppression d’une pizza");
			System.out.println("99.Exit.");

			choice = choiceMenu.nextInt();

			switch (choice){

			case 1:
				
				System.out.println("Liste des pizzas:");
				for (int i = 0; i < pizzaArray.length; i++){
				System.out.println(pizzaArray[i].code + " -> " + pizzaArray[i].libellee + " (" + pizzaArray[i].prix + " )");
				}
				System.out.println();
				break;
				
			case 2:
				choiceMenu.nextLine();
				System.out.println("Veuillez saisir un code : ");
				String newPizzaCode = choiceMenu.nextLine();
				
				System.out.println("Veuillez saisir le nom : ");
				String newPizzaName = choiceMenu.nextLine();
				
				System.out.println("Veuillez saisir le prix : ");
				int newPizzaPrice = choiceMenu.nextInt();
				
				int length = pizzaArray.length;
				int newLength = length + 1;
				Pizza[] newArray = new Pizza[newLength];
				for(int i = 0; i< length; i++){
					newArray[i] = pizzaArray[i];
				}

				newArray[newLength - 1] = new Pizza(newPizzaCode, newPizzaName, newPizzaPrice);
				pizzaArray = newArray;
				break;
			case 3:
				choiceMenu.nextLine(); //pour éviter le bug du clavier
				
				// rappel du tableau intégrant la liste des pizzas
				for (int i = 0; i < pizzaArray.length; i++){
				System.out.println(pizzaArray[i].code + " -> " + pizzaArray[i].libellee + " (" + pizzaArray[i].prix + " )");
				}
				
				//variable qui permet de selectionner le code à modifier
				System.out.println("Veuillez choisir le code la pizza à modifier : ");
				String codePizzaToModify = choiceMenu.nextLine();
									
				//variable qui permet de saisir un nouveau code
				System.out.println("Veuillez saisir un nouveau code : ");
				String modifPizzaCode = choiceMenu.nextLine();
				
				//variable qui permet de saisir un nouveau nom
				System.out.println("Veuillez saisir le nouveau nom : ");
				String modifPizzaName = choiceMenu.nextLine();
				
				//variable qui permet de saisir un nouveau prix
				System.out.println("Veuillez saisir le nouveau prix : ");
				int modifPizzaPrice = choiceMenu.nextInt();
				
				for (int i = 0; i < pizzaArray.length; i++){   // on parcours le tableau dans la liste des pizzas
					if (codePizzaToModify.equals(pizzaArray[i].code)){
						System.out.println("code est bien existant");
						pizzaArray[i].code = modifPizzaCode;
						pizzaArray[i].libellee = modifPizzaName;
						pizzaArray[i].prix = modifPizzaPrice;
					}
					
				}											
				break;
			case 4:
				choiceMenu.nextLine(); //pour éviter le bug du clavier
				
				
				//tableau temporaire qui reprend la taille totale moins la case à suppr
				Pizza[] pizzaArrayTemp = new Pizza[pizzaArray.length -1];
				
				// rappel du tableau intégrant la liste des pizzas
				for (int i = 0; i < pizzaArray.length; i++){
				System.out.println(pizzaArray[i].code + " -> " + pizzaArray[i].libellee);
				}
				
				//variable qui permet de taper le code à supprimer
				System.out.println("Veuillez choisir le code la pizza à modifier : ");
				String codePizzaToDelete = choiceMenu.nextLine();
				
				// on parcours le tableau dans la liste des pizzas
				int newIndex = 0;
				for (int i = 0; i < pizzaArray.length; i++){   
					// si code qu'on entre est diferrent code d'une pizza dans le tableau
					if (!codePizzaToDelete.equals(pizzaArray[i].code)){ 
						pizzaArrayTemp[newIndex] = pizzaArray[i];
						newIndex ++;
					}
				} 
				pizzaArray = pizzaArrayTemp;	
				
				break;
			case 99: 

			}

		}

	}

}

