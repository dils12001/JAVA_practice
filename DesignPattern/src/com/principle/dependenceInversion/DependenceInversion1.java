package com.principle.dependenceInversion;

// �̿�����h Dependence Inversion Principle
// ���h�Ҷ� ���̿� ��H���α��f�A���V ���f�Ω�H���s�{
public class DependenceInversion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.receive(new Email());
	}

}

class Email {
	public String getInfo() {
		return "�q�l�l��T��: Hello";
	}
}


class Person {
	// �����̿� Email���A�Y�����٭n�W�[�@�ӷs�\��A�p ����Line�A���N�n�A�W�[�@�Ӥ�k receive(Line line)
	public void receive(Email email) {
		System.out.println(email.getInfo());
	}
}
