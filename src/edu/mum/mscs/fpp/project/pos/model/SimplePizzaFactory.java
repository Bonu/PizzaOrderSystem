package edu.mum.mscs.fpp.project.pos.model;

import java.util.ArrayList;

public class SimplePizzaFactory {

	public Pizza createPizza(String type, String dough, String size, ArrayList toppings) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza(dough, size, toppings);
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(dough, size, toppings);
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(dough, size, toppings);
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(dough, size, toppings);
		}
		return pizza;
	}
}
