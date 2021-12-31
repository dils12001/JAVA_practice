package com.principle.segregation;

// ���f�j����h Interface Segregation Principle
public class Segregation1 {
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

interface Interface1 {
	void operation1();

	void operation2();

	void operation3();

	void operation4();

	void operation5();
}

class B implements Interface1 {
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

	@Override
	public void operation4() {
		// TODO Auto-generated method stub
		System.out.println("B��{��k4");
	}

	@Override
	public void operation5() {
		// TODO Auto-generated method stub
		System.out.println("B��{��k5");
	}
}

class D implements Interface1 {
	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		System.out.println("D��{��k1");
	}

	@Override
	public void operation2() {
		// TODO Auto-generated method stub
		System.out.println("D��{��k2");
	}

	@Override
	public void operation3() {
		// TODO Auto-generated method stub
		System.out.println("D��{��k3");
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
class A {
	public void depend1(B b) {
		System.out.println("A�� �̿�(�ϥ�) B��");
		b.operation1();
	}

	public void depend2(B b) {
		System.out.println("A�� �̿�(�ϥ�) B��");
		b.operation2();
	}

	public void depend3(B b) {
		System.out.println("A�� �̿�(�ϥ�) B��");
		b.operation3();
	}
}

// C���u�|�Ψ�D������ 1, 4, 5 ��k
class C {
	public void depend1(D d) {
		System.out.println("C�� �̿�(�ϥ�) D��");
		d.operation1();
	}

	public void depend4(D d) {
		System.out.println("C�� �̿�(�ϥ�) D��");
		d.operation4();
	}

	public void depend5(D d) {
		System.out.println("C�� �̿�(�ϥ�) D��");
		d.operation5();
	}
}
