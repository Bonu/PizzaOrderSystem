package edu.mum.mscs.fpp.project.pos.model;

import java.util.ArrayList;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		ArrayList toppings = new ArrayList();
		toppings.add("Mozerrella");
		Pizza pizza = store.orderPizza("cheese", "Crush", "regular", toppings);
		System.out.println("We ordered a " + pizza.getName() + "\n");
 
		pizza = store.orderPizza("veggie", "Regular Crush", "Small", toppings);
		System.out.println("We ordered a " + pizza.getName() + "\n");
		
		pizza = store.orderPizza("clam", "Regular Crush", "Small", toppings);
		System.out.println("We ordered a " + pizza.getName() + "\n");
		
		pizza = store.orderPizza("pepperoni", "Regular Crush", "Small", toppings);
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}
}
