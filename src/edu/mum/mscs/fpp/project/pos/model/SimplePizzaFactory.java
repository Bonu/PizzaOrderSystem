package edu.mum.mscs.fpp.project.pos.model;

import java.util.ArrayList;

public class SimplePizzaFactory {

	public Pizza createPizza(String type, String dough, String size, ArrayList toppings) {
		Pizza pizza = null;
		if (type.equals("rdbtnCheesePizza")) {
			pizza = new CheesePizza(dough, size, toppings);
		} else if (type.equals("rdbtnWhiteGarlicSauce")) {
			pizza = new PepperoniPizza(dough, size, toppings);
		} else if (type.equals("rdbtnClamPizza")) {
			pizza = new ClamPizza(dough, size, toppings);
		} else if (type.equals("rdbtnMarinaraSauce")) {
			pizza = new VeggiePizza(dough, size, toppings);
		}
		return pizza;
	}
}
