package com.principle.factory.KFC;

import com.principle.factory.AbstractFactory;
import com.principle.factory.Beverage;
import com.principle.factory.Pizza;

public class KFCFactory implements AbstractFactory {

	@Override
	public Pizza createPizza(String flavor) {

		if (flavor.equalsIgnoreCase("Hawaii")) {
			return new KFCHawaiiPizza();
		} else if (flavor.equalsIgnoreCase("Cheese")) {
			return new KFCCheesePizza();
		}

		return null;
	}

	@Override
	public Beverage createBeverage(String drinks) {

		if (drinks.equalsIgnoreCase("Cola")) {
			return new KFCCola();
		} else if (drinks.equalsIgnoreCase("Coffee")) {
			return new KFCCoffee();
		}

		return null;
	}

}
