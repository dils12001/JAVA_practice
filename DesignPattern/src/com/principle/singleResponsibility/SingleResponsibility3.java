package com.principle.singleResponsibility;

// ��@¾�d��h
public class SingleResponsibility3 {
	public static void main(String[] args) {
		System.out.println("Hello");
		Vehicle2 vehicle = new Vehicle2();
		vehicle.runRoad("������");
		vehicle.runRoad("�T��");
		vehicle.runAir("����");
		vehicle.runWater("�l��");
	}
}

// ����������@¾�d�A��N�O���������ŧO
// ���]�o�̤�k�֥B²��A�����Τ�k�i��¾�d����
class Vehicle2 {
	public void runRoad(String vehicle) {
		System.out.println(vehicle + "�b�����W�B��");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle + "�b���W�e�i");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle + "�b�ѤW��");
	}
}





