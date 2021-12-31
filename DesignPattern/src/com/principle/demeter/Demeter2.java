package com.principle.demeter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// �}�̯S�k�h Demeter Principle
// �@�ӹ�H����䥦��H�O���i�̤֪��F�ѡj�A�ڭ̥u�P�i�����B�͡j�q�H
// �����B��: A���PB�����X�AB�X�{�bA�����i�����ܶq�B��k�ѼơB��k��^�ȡj��
// �Ϥ��AB�X�{�bA�����i�����ܶq�j�h���O�����B��
// �`���A�i������(���O�����B��)�j���n�H�i�����ܶq�j�Φ��X�{�b������
public class Demeter2 {

	public static void main(String[] args) {
		// ���L �Ǯ��`�� �M �ǰ|���u ���H��
		new CollegeManager2().printCollegeEmployee();
		new SchoolManager2().printEmployee();
	}

}

// �Ǯ��`�����u
class Employee2 {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

// �ǰ|���u
class CollegeEmployee2 {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

// �޲z �ǰ|���u
class CollegeManager2 {
	public List<CollegeEmployee2> getAllEmployee() {
		List<CollegeEmployee2> list = new ArrayList<>();
		// �W�[ 10�Ӿǰ|���u
		for (int i = 0; i < 10; i++) {
			CollegeEmployee2 emp = new CollegeEmployee2();
			emp.setId("�ǰ|���uid = " + i);
			list.add(emp);
		}
		return list;
	}

	public void printCollegeEmployee() {
		// ����ǰ|���u
		List<CollegeEmployee2> list1 = this.getAllEmployee();
		System.out.println("-----------�ǰ|���u---------");
		for (CollegeEmployee2 e : list1) {
			System.out.println(e.getId());
		}
	}
}

// �޲z �Ǯ��`�����u
// ���R �����B�� ������?Employee2
class SchoolManager2 {
	// �����B�� Employee
	public List<Employee2> getAllEmployee() {
		List<Employee2> list = new ArrayList<>();
		// �W�[ 5�ӾǮ��`�����u
		for (int i = 0; i < 5; i++) {
			Employee2 emp = new Employee2();
			emp.setId("�ǰ|�`�����uid = " + i);
			list.add(emp);
		}
		return list;
	}

	public void printEmployee() {
		// ����Ǯ��`�����u
		List<Employee2> list2 = this.getAllEmployee();
		System.out.println("-----------�Ǯ��`�����u---------");
		for (Employee2 e : list2) {
			System.out.println(e.getId());
		}
	}

}

// �����ܶq�έ������A�N�N��A�b�Τ@�Ӹ�A�S�����������(����)�A�ݩ�t�@�ӤH���~���޿�A�������b�ۮa���B�z�A���o�h�ӧA�a��==
// ��U�۪����L��k�A����U�۪�Manager���W
// �o�ˤ]�ŦX��@¾�d��h�A�쥻 SchoolManager �F�� ���LCollegeEmployee �o�󤣬�������

