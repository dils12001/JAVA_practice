package com.principle.factory.KFC;

import java.util.Scanner;

import com.principle.factory.AbstractFactory;
import com.principle.factory.Beverage;
import com.principle.factory.FactoryProducer;
import com.principle.factory.Pizza;

public class FactoryDemo {

	public static void main(String[] args) {
		System.out.print("��J�ө��G");
		Scanner sc = new Scanner(System.in); // System.in �����L��J

		AbstractFactory factory = FactoryProducer.getFactory(sc.next());
		while (factory == null) {
			System.out.println("�S���o�a���A�Э��s��J");
			factory = FactoryProducer.getFactory(sc.next());
		}
		
		System.out.println("�n�ܤ���?");
		Beverage beverage = factory.createBeverage(sc.next());

		System.out.println("�n�Y����Pizza?");
		Pizza pizza = factory.createPizza(sc.next());

		if (beverage != null) {
			beverage.drink();
		} else {
			System.out.println("�S���o�ض���");
		}

		if (pizza != null) {
			pizza.eat();
		} else {
			System.out.println("�S����pizza");
		}

		sc.close();

	}

}
