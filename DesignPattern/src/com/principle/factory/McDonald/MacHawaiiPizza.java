package com.principle.factory.McDonald;

import com.principle.factory.Pizza;

public class MacHawaiiPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("¨ÓÂI»ñ±ù");
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("¤Á¸H»ñ±ù");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("¦Y ³Á·í³Ò ªº ®L«Â¦iPizza");
	}

}
