package com.principle.dependenceInversion;

// 依賴倒轉原則 Dependence Inversion Principle
// 高層模塊 應依賴 抽象類或接口，面向 接口或抽象類編程
public class DependenceInversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 person = new Person2();
		person.receive(new Email2());
		// 客戶端新增了 Line功能，寫法沒變，只是參數是用 Line物件
		person.receive(new Line());
	}

}

interface MessageReceiver{
	String getInfo();
}

class Email2 implements MessageReceiver{
	public String getInfo() {
		return "Email訊息: Hello";
	}
}

class Line implements MessageReceiver{
	public String getInfo() {
		return "Line訊息: 安安";
	}
}

class Person2 {
	// 直接依賴 Email類，若之後還要增加一個新功能，如 接收Line，那就要再增加一個方法 receive(Line line)
	// 這裡參數改用 接口或抽象類(多態特性)
	// 不再依賴實質的類(實作細節)，而依賴更高層次的 MessageReceiver接口(抽象)
	public void receive(MessageReceiver receiver) {
		System.out.println(receiver.getInfo());
	}
}
