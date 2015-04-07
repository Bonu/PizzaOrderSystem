package edu.mum.mscs.fpp.project.pos.model;

import java.util.ArrayList;

public class VeggiePizza extends Pizza {
	public VeggiePizza(String dough, String size, ArrayList toppings) {
		name = "Veggie Pizza";
		sauce = "Marinara sauce";
		this.dough = dough;
		this.size = size;
		this.toppings = toppings;
//		toppings.add("Shredded mozzarella");
//		toppings.add("Grated parmesan");
//		toppings.add("Diced onion");
//		toppings.add("Sliced mushrooms");
//		toppings.add("Sliced red pepper");
//		toppings.add("Sliced black olives");
	}
}
