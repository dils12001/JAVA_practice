package com.principle.singleResponsibility;

// ��@¾�d��h
public class SingleResponsibility2 {
	public static void main(String[] args) {
		System.out.println("Hello");
		RoadVehicle roadvehicle = new RoadVehicle();
		roadvehicle.run("������");
		roadvehicle.run("�T��");
		// �����b�����W�B��
		FlyVehicle flyvehicle = new FlyVehicle();
		flyvehicle.run("����");
	}
}

// ���������Ӧb�����W�B��
// ���� ���W�] �M �ѤW�� ��¾�d����
class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "�b�����W�B��");
	}
}


class FlyVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "�b�ѤW��");
	}
}




