package edu.mum.mscs.fpp.project.pos.model;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	String size;
	ArrayList toppings = new ArrayList();

	String prepare() {
		String str = "";
		str = str + "Preparing " + name;
		str = str + "\n";
		str = str + "Tossing dough...";
		str = str + "\n";
		str = str + "Adding sauce...";
		str = str + "\n";
		str = str + "Adding toppings: ";
		for (int i = 0; i < toppings.size(); i++) {
			str = str + toppings.get(i);
		}
		return str;
	}

	String bake() {
		return  "Bake for 25 minutes at 350";
	}

	String cut() {
		return "Cutting the pizza into diagonal slices";
	}

	String box() {
		return "Place pizza in official PizzaStore box";
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String) toppings.get(i) + "\n");
		}
		return display.toString();
	}
}
