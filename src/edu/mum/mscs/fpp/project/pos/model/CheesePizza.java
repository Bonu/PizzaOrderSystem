package edu.mum.mscs.fpp.project.pos.model;

import java.util.ArrayList;

public class CheesePizza extends Pizza {
	public CheesePizza(String dough, String size, ArrayList toppings) {
		this.dough = dough;
		this.size = size;
		this.toppings = toppings;
		name = "Cheese Pizza";
		sauce = "Marinara Pizza Sauce";
	}
}
