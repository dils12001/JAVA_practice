package com.principle.liskovSubstitution;

// ���������h Liskov Substitution Principle
// �l���i�ɶq���n�j���gOverride����
// �l���O �n����N �����O�A�ӥB�i���ݭn�j�@��L���
// �]�N�O���A�����వ�쪺�ơA�l���]�n�వ��A�Ӥ��u�O���g������k�A�������వ�쪺��(��k)�A�l���o������F
// �b�ϥήɡA�~�J����
public class LiskovSubstitution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubNum subNum = new SubNum();
		System.out.println("11 - 3 = " + subNum.func1(11, 3));

		System.out.println("===============================");
		Caculate caculate = new Caculate();
		// �]��Calcaulate �~�Ӧ� SubNum�A�ϥΪ̷Q���i���ӬO��k�\��j�A�G���G�P�Q�k���P
		System.out.println("11 - 3 = " + caculate.func1(11, 3));
		System.out.println("11 + 3 + 9 = " + caculate.func2(11, 3));
		
	}

}

class SubNum {
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

class Caculate extends SubNum {
	// �L�N�����g�F func1()�A������ϥΤ��M�H��func1�٬O��k
	@Override
	public int func1(int num1, int num2) {
		return num1 + num2;
	}

	public int func2(int num1, int num2) {
		return func1(num1, num2) + 9;
	}
}