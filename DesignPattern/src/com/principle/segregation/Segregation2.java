package com.principle.segregation;

// ���f�j����h Interface Segregation Principle
public class Segregation2 {
	public static void main(String[] args) {
		A a = new A();
		C c = new C();
		a.depend1(new B());
		c.depend4(new D());
		// A���u�|�Ψ�B������ 1, 2, 3 ��k�A��B���o�ݭn�� Interface1 �� 1~5��k ����{(4, 5�S��)
		// C���u�|�Ψ�D������ 1, 4, 5 ��k�A��D���o�ݭn�� Interface1 �� 1~5��k ����{(2, 3�S��)
		// �]�N�O��Interface1�i�H�b����A�إߡi�̤p�j���f
	}
}

interface InterfaceOnly1 {
	void operation1();
}

interface Interface23 {
	void operation2();

	void operation3();

}

interface Interface45 {
	void operation4();

	void operation5();
}

class B2 implements InterfaceOnly1, Interface23 {
	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		System.out.println("B��{��k1");
	}

	@Override
	public void operation2() {
		// TODO Auto-generated method stub
		System.out.println("B��{��k2");
	}

	@Override
	public void operation3() {
		// TODO Auto-generated method stub
		System.out.println("B��{��k3");
	}
}

class D2 implements InterfaceOnly1, Interface45 {
	
	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		System.out.println("D��{��k1");
	}

	@Override
	public void operation4() {
		// TODO Auto-generated method stub
		System.out.println("D��{��k4");
	}

	@Override
	public void operation5() {
		// TODO Auto-generated method stub
		System.out.println("D��{��k5");
	}
}

// A���u�|�Ψ�B������ 1, 2, 3 ��k
class A2 {
	public void depend1(B2 b) {
		System.out.println("A�� �̿�(�ϥ�) B��");
		b.operation1();
	}

	public void depend2(B2 b) {
		System.out.println("A�� �̿�(�ϥ�) B��");
		b.operation2();
	}

	public void depend3(B2 b) {
		System.out.println("A�� �̿�(�ϥ�) B��");
		b.operation3();
	}
}

// C���u�|�Ψ�D������ 1, 4, 5 ��k
class C2 {
	public void depend1(D2 d) {
		System.out.println("C�� �̿�(�ϥ�) D��");
		d.operation1();
	}

	public void depend4(D2 d) {
		System.out.println("C�� �̿�(�ϥ�) D��");
		d.operation4();
	}

	public void depend5(D2 d) {
		System.out.println("C�� �̿�(�ϥ�) D��");
		d.operation5();
	}
}
