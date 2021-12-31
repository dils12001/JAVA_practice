package com.principle.factory.McDonald;

import com.principle.factory.Pizza;

public class MacCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("來點起司");
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("切碎起司");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃 麥當勞 的 起司Pizza");
	}

}
