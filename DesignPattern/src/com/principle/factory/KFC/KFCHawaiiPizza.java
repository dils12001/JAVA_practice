package com.principle.factory.KFC;

import com.principle.factory.Pizza;

public class KFCHawaiiPizza extends Pizza {

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
		System.out.println("�Y �ּw�� �� �L�¦iPizza");
	}

}
