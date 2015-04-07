package edu.mum.mscs.fpp.project.pos.model;

import java.util.ArrayList;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza(String dough, String size, ArrayList toppings) {
		this.dough = dough;
		this.size = size;
		this.toppings = toppings;
		name = "Pepperoni Pizza";
		sauce = "Marinara sauce";
	}
}
