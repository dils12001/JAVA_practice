package com.principle.openClosed;

// �}����h Open Closed Principle(�̭��n!!!)
// �Ҷ��P������� �i�X�i�}��B�ק������j
// �i�H�X�i�s�����A�����ק���¦��������A�T�O�i�w�b�ϥΤ��j���¦������A���|�o�Ͱ��D
// �Ω�H���α��f�إߡi�ج[�j�A�A�Ψ�L����{�X�i�Ӹ`(�W�[�Y�ӡi�s�j�����Τ�k)

// ���D: �p�G�쥻�u�� �x�λP��ΡA���A�s�W �e�T���� ���\��
// ���F�s�WTriangle�����~�A�ٻݭn���GraphicEditor������k���e�A���ŦX�i�ק������j
public class OpenClosed1 {

	public static void main(String[] args) {
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawShape(new Rectangle());
		graphicEditor.drawShape(new Circle());
		graphicEditor.drawShape(new Triangle());
	}

}

class Shapee {
	int m_type;
}

class Rectangle extends Shapee {
	Rectangle() {
		super.m_type = 1;
	}
}

class Circle extends Shapee {
	Circle() {
		super.m_type = 2;
	}
}

class Triangle extends Shapee {
	public Triangle() {
		super.m_type = 3;
	}

}

class GraphicEditor {
	public void drawShape(Shapee s) {
		if (s.m_type == 1) {
			drawRectangle();
		} else if (s.m_type == 2) {
			drawCircle();
		} else if (s.m_type == 3) {	// �ݭק�o��if else
			drawTriangle();
		}
	}

	private void drawRectangle() {
		System.out.println("�x��");
	}

	private void drawCircle() {
		System.out.println("���");
	}

	// �ݷs�W����k
	private void drawTriangle() {
		System.out.println("�T����");
	}
}