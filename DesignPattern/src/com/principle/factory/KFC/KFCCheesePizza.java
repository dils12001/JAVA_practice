package com.principle.factory.KFC;

import com.principle.factory.Pizza;

public class KFCCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("���I�_�q");
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("���H�_�q");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�Y �ּw�� �� �_�qPizza");
	}

}
