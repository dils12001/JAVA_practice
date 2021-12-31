package com.principle.dependenceInversion;

// �̿�����h Dependence Inversion Principle
// ���h�Ҷ� ���̿� ��H���α��f�A���V ���f�Ω�H���s�{
public class DependenceInversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 person = new Person2();
		person.receive(new Email2());
		// �Ȥ�ݷs�W�F Line�\��A�g�k�S�ܡA�u�O�ѼƬO�� Line����
		person.receive(new Line());
	}

}

interface MessageReceiver{
	String getInfo();
}

class Email2 implements MessageReceiver{
	public String getInfo() {
		return "Email�T��: Hello";
	}
}

class Line implements MessageReceiver{
	public String getInfo() {
		return "Line�T��: �w�w";
	}
}

class Person2 {
	// �����̿� Email���A�Y�����٭n�W�[�@�ӷs�\��A�p ����Line�A���N�n�A�W�[�@�Ӥ�k receive(Line line)
	// �o�̰ѼƧ�� ���f�Ω�H��(�h�A�S��)
	// ���A�̿��誺��(��@�Ӹ`)�A�Ө̿�󰪼h���� MessageReceiver���f(��H)
	public void receive(MessageReceiver receiver) {
		System.out.println(receiver.getInfo());
	}
}
