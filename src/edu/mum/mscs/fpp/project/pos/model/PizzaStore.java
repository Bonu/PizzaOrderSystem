package edu.mum.mscs.fpp.project.pos.model;

import java.util.ArrayList;

public class PizzaStore {
	SimplePizzaFactory factory;
 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type, String dough, String size, ArrayList toppings) {
		Pizza pizza;
 
		pizza = factory.createPizza(type, dough, size, toppings );
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
