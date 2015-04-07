package edu.mum.mscs.fpp.project.pos.model;

import java.io.IOException;
import java.util.ArrayList;

import edu.mum.mscs.fpp.project.pos.ui.ReadyToEat;

public class PizzaStore {
	SimplePizzaFactory factory;
 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type, String dough, String size, ArrayList toppings) {
		Pizza pizza;
		String str = "";
		pizza = factory.createPizza(type, dough, size, toppings );
 
		str += pizza.prepare();
		str += pizza.bake();
		str += pizza.cut();
		str += pizza.box();
		try {
			ReadyToEat mp = new ReadyToEat(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pizza;
	}

}
