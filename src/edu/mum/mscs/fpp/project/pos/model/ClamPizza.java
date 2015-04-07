package edu.mum.mscs.fpp.project.pos.model;

import java.util.ArrayList;

public class ClamPizza extends Pizza {
	public ClamPizza(String dough, String size, ArrayList toppings) {
		this.dough = dough;
		this.size = size;
		this.toppings = toppings;
		name = "Clam Pizza";
		sauce = "White garlic sauce";
	}
}
