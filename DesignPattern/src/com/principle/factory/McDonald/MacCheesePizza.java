package com.principle.factory.McDonald;

import com.principle.factory.Pizza;

public class MacCheesePizza extends Pizza {

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
		System.out.println("�Y ����� �� �_�qPizza");
	}

}
