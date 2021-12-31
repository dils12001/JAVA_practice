package com.principle.demeter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// 迪米特法則 Demeter Principle
// 一個對象應對其它對象保持【最少的了解】，我們只與【直接朋友】通信
// 直接朋友: A類與B類耦合，B出現在A類的【成員變量、方法參數、方法返回值】中
// 反之，B出現在A類的【局部變量】則不是直接朋友
// 總結，【陌生類(不是直接朋友)】不要以【局部變量】形式出現在類內部
public class Demeter2 {

	public static void main(String[] args) {
		// 打印 學校總部 和 學院員工 的信息
		new CollegeManager2().printCollegeEmployee();
		new SchoolManager2().printEmployee();
	}

}

// 學校總部員工
class Employee2 {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

// 學院員工
class CollegeEmployee2 {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

// 管理 學院員工
class CollegeManager2 {
	public List<CollegeEmployee2> getAllEmployee() {
		List<CollegeEmployee2> list = new ArrayList<>();
		// 增加 10個學院員工
		for (int i = 0; i < 10; i++) {
			CollegeEmployee2 emp = new CollegeEmployee2();
			emp.setId("學院員工id = " + i);
			list.add(emp);
		}
		return list;
	}

	public void printCollegeEmployee() {
		// 獲取學院員工
		List<CollegeEmployee2> list1 = this.getAllEmployee();
		System.out.println("-----------學院員工---------");
		for (CollegeEmployee2 e : list1) {
			System.out.println(e.getId());
		}
	}
}

// 管理 學校總部員工
// 分析 直接朋友 有哪些?Employee2
class SchoolManager2 {
	// 直接朋友 Employee
	public List<Employee2> getAllEmployee() {
		List<Employee2> list = new ArrayList<>();
		// 增加 5個學校總部員工
		for (int i = 0; i < 5; i++) {
			Employee2 emp = new Employee2();
			emp.setId("學院總部員工id = " + i);
			list.add(emp);
		}
		return list;
	}

	public void printEmployee() {
		// 獲取學校總部員工
		List<Employee2> list2 = this.getAllEmployee();
		System.out.println("-----------學校總部員工---------");
		for (Employee2 e : list2) {
			System.out.println(e.getId());
		}
	}

}

// 局部變量用陌生類，就代表你在用一個跟你沒那麼相關的類(物件)，屬於另一個人的業務邏輯，本應它在自家中處理，它卻搬來你家用==
// 把各自的打印方法，移到各自的Manager身上
// 這樣也符合單一職責原則，原本 SchoolManager 幹嘛 打印CollegeEmployee 這件不相關的事

