package com.principle.singleResponsibility;

// 單一職責原則
public class SingleResponsibility2 {
	public static void main(String[] args) {
		System.out.println("Hello");
		RoadVehicle roadvehicle = new RoadVehicle();
		roadvehicle.run("摩托車");
		roadvehicle.run("汽車");
		// 飛機在公路上運行
		FlyVehicle flyvehicle = new FlyVehicle();
		flyvehicle.run("飛機");
	}
}

// 飛機不應該在公路上運行
// 應把 路上跑 和 天上飛 的職責分離
class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在公路上運行");
	}
}


class FlyVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在天上飛");
	}
}




