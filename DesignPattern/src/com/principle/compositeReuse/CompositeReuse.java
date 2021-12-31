package com.principle.compositeReuse;

// �X���ƥέ�h composite Reuse Principle
// �ɶq�ϥ� �X���B�E�X���覡�A�Ӥ��� �~��
public class CompositeReuse {

	public static void main(String[] args) {
		// �o�̷Q��B�� �ե� A������k�A���� B�~��A ���覡
		new B1().func(new A());
		
		B2 b2= new B2();
		b2.setA(new A());
		b2.func();
		
		new B3().func();
	}
}

class A {
	public void method() {
		System.out.println("�ɶq�ϥ� �X���B�E�X���覡�A�Ӥ��� �~��");
	}
}

// B1 �̿� A(���X�覡: �H�޼ƫ���)
class B1 {
	public void func(A a) {
		a.method();
	}
}

//A �E�X�� B2(���X�覡: ���@��A�������ܼơA���n��setA()�ɡA�~��l��A����)
class B2 {
	private A a;

	public void func() {
		a.method();
	}

	public void setA(A a) {
		this.a = a;
	}
}

//A �զX�� B3(���X�覡: ���@��A�������ܼơA�B�Ы�B3����ɡA�N������l��A����)
class B3 {
	private A a = new A();

	public void func() {
		a.method();
	}
}
