package com.principle.singleResponsibility;

// ��@¾�d��h Single Responsibility Principle
public class SingleResponsibility1 {
	public static void main(String[] args) {
		System.out.println("Hello");
		Vehicle vehicle = new Vehicle();
		vehicle.run("������");
		vehicle.run("�T��");
		// �����b�����W�B��
		vehicle.run("����");
	}
}

// ���������Ӧb�����W�B��
// ���� ���W�] �M �ѤW�� ��¾�d����
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "�b�����W�B��");
	}
}
