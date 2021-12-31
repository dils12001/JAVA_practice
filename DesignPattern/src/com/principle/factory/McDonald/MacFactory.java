package com.principle.factory.McDonald;

import com.principle.factory.AbstractFactory;
import com.principle.factory.Beverage;
import com.principle.factory.Pizza;

public class MacFactory implements AbstractFactory {

	@Override
	public Pizza createPizza(String flavor) {

		if (flavor.equalsIgnoreCase("Hawaii")) {
			return new MacHawaiiPizza();
		} else if (flavor.equalsIgnoreCase("Cheese")) {
			return new MacCheesePizza();
		}

		return null;
	}

	@Override
	public Beverage createBeverage(String drinks) {

		if (drinks.equalsIgnoreCase("Cola")) {
			return new MacCola();
		} else if (drinks.equalsIgnoreCase("Coffee")) {
			return new MacCoffee();
		}

		return null;
	}

}
