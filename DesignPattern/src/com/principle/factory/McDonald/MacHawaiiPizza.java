package com.principle.factory.McDonald;

import com.principle.factory.Pizza;

public class MacHawaiiPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("���I���");
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("���H���");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�Y ����� �� �L�¦iPizza");
	}

}
