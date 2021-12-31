package com.principle.liskovSubstitution;

// 里氏替換原則 Liskov Substitution Principle
// 子類【盡量不要】重寫Override父類
// 子類別 要能替代 父類別，而且【不需要】作其他更動
// 也就是說，父類能做到的事，子類也要能做到，而不只是重寫它的方法，讓父類能做到的事(減法)，子類卻做不到了
// 在使用時，誤入陷阱
public class LiskovSubstitution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubNum subNum = new SubNum();
		System.out.println("11 - 3 = " + subNum.func1(11, 3));

		System.out.println("===============================");
		Caculate caculate = new Caculate();
		// 因為Calcaulate 繼承自 SubNum，使用者想說【應該是減法功能】，故結果與想法不同
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
	// 無意中重寫了 func1()，但之後使用仍然以為func1還是減法
	@Override
	public int func1(int num1, int num2) {
		return num1 + num2;
	}

	public int func2(int num1, int num2) {
		return func1(num1, num2) + 9;
	}
}