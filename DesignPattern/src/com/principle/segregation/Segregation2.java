package com.principle.segregation;

// 接口隔離原則 Interface Segregation Principle
public class Segregation2 {
	public static void main(String[] args) {
		A a = new A();
		C c = new C();
		a.depend1(new B());
		c.depend4(new D());
		// A類只會用到B類中的 1, 2, 3 方法，但B類卻需要把 Interface1 的 1~5方法 都實現(4, 5沒用)
		// C類只會用到D類中的 1, 4, 5 方法，但D類卻需要把 Interface1 的 1~5方法 都實現(2, 3沒用)
		// 也就是說Interface1可以在拆分，建立【最小】接口
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
		System.out.println("B實現方法1");
	}

	@Override
	public void operation2() {
		// TODO Auto-generated method stub
		System.out.println("B實現方法2");
	}

	@Override
	public void operation3() {
		// TODO Auto-generated method stub
		System.out.println("B實現方法3");
	}
}

class D2 implements InterfaceOnly1, Interface45 {
	
	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		System.out.println("D實現方法1");
	}

	@Override
	public void operation4() {
		// TODO Auto-generated method stub
		System.out.println("D實現方法4");
	}

	@Override
	public void operation5() {
		// TODO Auto-generated method stub
		System.out.println("D實現方法5");
	}
}

// A類只會用到B類中的 1, 2, 3 方法
class A2 {
	public void depend1(B2 b) {
		System.out.println("A類 依賴(使用) B類");
		b.operation1();
	}

	public void depend2(B2 b) {
		System.out.println("A類 依賴(使用) B類");
		b.operation2();
	}

	public void depend3(B2 b) {
		System.out.println("A類 依賴(使用) B類");
		b.operation3();
	}
}

// C類只會用到D類中的 1, 4, 5 方法
class C2 {
	public void depend1(D2 d) {
		System.out.println("C類 依賴(使用) D類");
		d.operation1();
	}

	public void depend4(D2 d) {
		System.out.println("C類 依賴(使用) D類");
		d.operation4();
	}

	public void depend5(D2 d) {
		System.out.println("C類 依賴(使用) D類");
		d.operation5();
	}
}
