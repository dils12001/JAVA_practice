package com.principle.dependenceInversion;

// 依賴倒轉原則 Dependence Inversion Principle
// 高層模塊 應依賴 抽象類或接口，面向 接口或抽象類編程
public class DependenceInversion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.receive(new Email());
	}

}

class Email {
	public String getInfo() {
		return "電子郵件訊息: Hello";
	}
}


class Person {
	// 直接依賴 Email類，若之後還要增加一個新功能，如 接收Line，那就要再增加一個方法 receive(Line line)
	public void receive(Email email) {
		System.out.println(email.getInfo());
	}
}
