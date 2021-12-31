package com.principle.liskovSubstitution;

// 里氏替換原則 Liskov Substitution Principle
// 子類【盡量不要】重寫Override父類
// 子類別 要能替代 父類別，而且【不需要】作其他更動
// 也就是說，父類能做到的事，子類也要能做到，而不只是重寫它的方法，讓父類能做到的事(減法)，子類卻做不到了
// 在使用時，誤入陷阱
// 解決方法： 將原本的 子類與父類，繼承一個更通俗的基類，將原【繼承關係】去除，採用【依賴、聚合、組合關係】替代之
public class LiskovSubstitution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubNum2 subNum = new SubNum2();
		System.out.println("11 - 3 = " + subNum.func1(11, 3));

		System.out.println("===============================");
		Caculate2 caculate = new Caculate2();

		// 調用時，不會誤用方法
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
	// 改成 組合關係，組合SubNum2物件
	private SubNum2 subNum2 = new SubNum2();

	public int func1(int num1, int num2) {
		return num1 + num2;
	}

	public int func2(int num1, int num2) {
		return func1(num1, num2) + 9;
	}
	// 依賴SubNum2物件，使用減法
	public int func3(int num1, int num2) {
		return this.subNum2.func1(num1, num2);
	}
}