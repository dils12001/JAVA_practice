package com.principle.factory.KFC;

import java.util.Scanner;

import com.principle.factory.AbstractFactory;
import com.principle.factory.Beverage;
import com.principle.factory.FactoryProducer;
import com.principle.factory.Pizza;

public class FactoryDemo {

	public static void main(String[] args) {
		System.out.print("輸入商店：");
		Scanner sc = new Scanner(System.in); // System.in 表示鍵盤輸入

		AbstractFactory factory = FactoryProducer.getFactory(sc.next());
		while (factory == null) {
			System.out.println("沒有這家店，請重新輸入");
			factory = FactoryProducer.getFactory(sc.next());
		}
		
		System.out.println("要喝什麼?");
		Beverage beverage = factory.createBeverage(sc.next());

		System.out.println("要吃什麼Pizza?");
		Pizza pizza = factory.createPizza(sc.next());

		if (beverage != null) {
			beverage.drink();
		} else {
			System.out.println("沒有這種飲料");
		}

		if (pizza != null) {
			pizza.eat();
		} else {
			System.out.println("沒有種pizza");
		}

		sc.close();

	}

}
