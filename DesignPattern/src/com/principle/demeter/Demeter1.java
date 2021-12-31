package com.principle.demeter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// �}�̯S�k�h Demeter Principle
// �@�ӹ�H����䥦��H�O���i�̤֪��F�ѡj�A�u�P�i�����B�͡j�q�H
// �����B��: A���PB�����X�AB�X�{�bA�����i�����ܶq�B��k�ѼơB��k��^�ȡj��
// �Ϥ��AB�X�{�bA�����i�����ܶq�j�h���O�����B��
// �`���A�i������(���O�����B��)�j���n�H�i�����ܶq�j�Φ��X�{�b������
public class Demeter1 {

	public static void main(String[] args) {
		SchoolManager schoolManager = new SchoolManager();
		schoolManager.printAllEmployee(new CollegeManager());

	}

}

// �Ǯ��`�����u
class Employee {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

// �ǰ|���u
class CollegeEmployee {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

// �޲z �ǰ|���u
class CollegeManager {
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<>();
		// �W�[ 10�Ӿǰ|���u
		for (int i = 0; i < 10; i++) {
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("�ǰ|���uid = " + i);
			list.add(emp);
		}
		return list;
	}
}

// �޲z �Ǯ��`�����u
// ���R �����B�� ������?Employee�BCollegeManager
// ���O �����B�� ������?CollegeEmployee�A�H�I �}�̯S��h
class SchoolManager {
	// �����B�� Employee
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<>();
		// �W�[ 5�ӾǮ��`�����u
		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee();
			emp.setId("�ǰ|�`�����uid = " + i);
			list.add(emp);
		}
		return list;
	}
	
	// ���L �Ǯ��`�� �M �ǰ|���u ���H��
	void printAllEmployee(CollegeManager sub) {
		// ����ǰ|���u
		List<CollegeEmployee> list1 = sub.getAllEmployee();
		System.out.println("-----------�ǰ|���u---------");
		for (CollegeEmployee e:list1) {
			System.out.println(e.getId());
		}
		
		
		// ����Ǯ��`�����u
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("-----------�Ǯ��`�����u---------");
		for (Employee e:list2) {
			System.out.println(e.getId());
		}
		
		
	}
}

