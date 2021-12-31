package com.principle.factory;

public interface AbstractFactory {

	public abstract Pizza createPizza(String flavor);

	public abstract Beverage createBeverage(String drinks);
}
