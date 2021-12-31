package com.principle.singleResponsibility;

// 單一職責原則
public class SingleResponsibility3 {
	public static void main(String[] args) {
		System.out.println("Hello");
		Vehicle2 vehicle = new Vehicle2();
		vehicle.runRoad("摩托車");
		vehicle.runRoad("汽車");
		vehicle.runAir("飛機");
		vehicle.runWater("郵輪");
	}
}

// 不完全的單一職責，原意是分離到類級別
// 但因這裡方法少且簡單，直接用方法進行職責分離
class Vehicle2 {
	public void runRoad(String vehicle) {
		System.out.println(vehicle + "在公路上運行");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle + "在水上前進");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle + "在天上飛");
	}
}





