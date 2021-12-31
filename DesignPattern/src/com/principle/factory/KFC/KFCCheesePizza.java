package com.principle.factory.KFC;

import com.principle.factory.Pizza;

public class KFCCheesePizza extends Pizza {

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
		System.out.println("吃 肯德基 的 起司Pizza");
	}

}
