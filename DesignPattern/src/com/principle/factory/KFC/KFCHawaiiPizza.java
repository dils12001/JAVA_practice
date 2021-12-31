package com.principle.factory.KFC;

import com.principle.factory.Pizza;

public class KFCHawaiiPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("來點鳳梨");
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("切碎鳳梨");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃 肯德基 的 夏威夷Pizza");
	}

}
