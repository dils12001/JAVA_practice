package com.principle.compositeReuse;

// 合成複用原則 composite Reuse Principle
// 盡量使用 合成、聚合的方式，而不用 繼承
public class CompositeReuse {

	public static void main(String[] args) {
		// 這裡想用B類 調用 A類的方法，不用 B繼承A 的方式
		new B1().func(new A());
		
		B2 b2= new B2();
		b2.setA(new A());
		b2.func();
		
		new B3().func();
	}
}

class A {
	public void method() {
		System.out.println("盡量使用 合成、聚合的方式，而不用 繼承");
	}
}

// B1 依賴 A(耦合方式: 以引數型式)
class B1 {
	public void func(A a) {
		a.method();
	}
}

//A 聚合到 B2(耦合方式: 有一個A的成員變數，但要等setA()時，才初始化A物件)
class B2 {
	private A a;

	public void func() {
		a.method();
	}

	public void setA(A a) {
		this.a = a;
	}
}

//A 組合到 B3(耦合方式: 有一個A的成員變數，且創建B3物件時，就直接初始化A物件)
class B3 {
	private A a = new A();

	public void func() {
		a.method();
	}
}
