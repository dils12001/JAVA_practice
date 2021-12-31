package com.principle.demeter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// 迪米特法則 Demeter Principle
// 一個對象應對其它對象保持【最少的了解】，只與【直接朋友】通信
// 直接朋友: A類與B類耦合，B出現在A類的【成員變量、方法參數、方法返回值】中
// 反之，B出現在A類的【局部變量】則不是直接朋友
// 總結，【陌生類(不是直接朋友)】不要以【局部變量】形式出現在類內部
public class Demeter1 {

	public static void main(String[] args) {
		SchoolManager schoolManager = new SchoolManager();
		schoolManager.printAllEmployee(new CollegeManager());

	}

}

// 學校總部員工
class Employee {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

// 學院員工
class CollegeEmployee {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

// 管理 學院員工
class CollegeManager {
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<>();
		// 增加 10個學院員工
		for (int i = 0; i < 10; i++) {
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("學院員工id = " + i);
			list.add(emp);
		}
		return list;
	}
}

// 管理 學校總部員工
// 分析 直接朋友 有哪些?Employee、CollegeManager
// 不是 直接朋友 有哪些?CollegeEmployee，違背 迪米特原則
class SchoolManager {
	// 直接朋友 Employee
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<>();
		// 增加 5個學校總部員工
		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee();
			emp.setId("學院總部員工id = " + i);
			list.add(emp);
		}
		return list;
	}
	
	// 打印 學校總部 和 學院員工 的信息
	void printAllEmployee(CollegeManager sub) {
		// 獲取學院員工
		List<CollegeEmployee> list1 = sub.getAllEmployee();
		System.out.println("-----------學院員工---------");
		for (CollegeEmployee e:list1) {
			System.out.println(e.getId());
		}
		
		
		// 獲取學校總部員工
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("-----------學校總部員工---------");
		for (Employee e:list2) {
			System.out.println(e.getId());
		}
		
		
	}
}

