package com.principle.factory;

import com.principle.factory.KFC.KFCFactory;
import com.principle.factory.McDonald.MacFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Mac")) {
			return new MacFactory();
		} else if (choice.equalsIgnoreCase("KFC")) {
			return new KFCFactory();
		}
		return null;
	}
}
