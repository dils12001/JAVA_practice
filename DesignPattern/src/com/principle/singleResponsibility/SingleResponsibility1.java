package com.principle.singleResponsibility;

// 單一職責原則 Single Responsibility Principle
public class SingleResponsibility1 {
	public static void main(String[] args) {
		System.out.println("Hello");
		Vehicle vehicle = new Vehicle();
		vehicle.run("摩托車");
		vehicle.run("汽車");
		// 飛機在公路上運行
		vehicle.run("飛機");
	}
}

// 飛機不應該在公路上運行
// 應把 路上跑 和 天上飛 的職責分離
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在公路上運行");
	}
}
