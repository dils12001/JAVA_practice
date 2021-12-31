package com.principle.liskovSubstitution;

// ���������h Liskov Substitution Principle
// �l���i�ɶq���n�j���gOverride����
// �l���O �n����N �����O�A�ӥB�i���ݭn�j�@��L���
// �]�N�O���A�����వ�쪺�ơA�l���]�n�వ��A�Ӥ��u�O���g������k�A�������వ�쪺��(��k)�A�l���o������F
// �b�ϥήɡA�~�J����
// �ѨM��k�G �N�쥻�� �l���P�����A�~�Ӥ@�ӧ�q�U�������A�N��i�~�����Y�j�h���A�ĥΡi�̿�B�E�X�B�զX���Y�j���N��
public class LiskovSubstitution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubNum2 subNum = new SubNum2();
		System.out.println("11 - 3 = " + subNum.func1(11, 3));

		System.out.println("===============================");
		Caculate2 caculate = new Caculate2();

		// �եήɡA���|�~�Τ�k
		System.out.println("11 - 3 = " + caculate.func3(11, 3));
		System.out.println("11 + 3 = " + caculate.func1(11, 3));
		System.out.println("11 + 3 + 9 = " + caculate.func2(11, 3));

	}

}

class Base {

}

class SubNum2 extends Base {
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

class Caculate2 extends Base {
	// �令 �զX���Y�A�զXSubNum2����
	private SubNum2 subNum2 = new SubNum2();

	public int func1(int num1, int num2) {
		return num1 + num2;
	}

	public int func2(int num1, int num2) {
		return func1(num1, num2) + 9;
	}
	// �̿�SubNum2����A�ϥδ�k
	public int func3(int num1, int num2) {
		return this.subNum2.func1(num1, num2);
	}
}