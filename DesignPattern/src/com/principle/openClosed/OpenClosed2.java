package com.principle.openClosed;

// �}����h Open Closed Principle(�̭��n!!!)
// �Ҷ��P������� �i�X�i�}��B�ק������j
// �i�H�X�i�s�����A�����ק���¦��������A�T�O�i�w�b�ϥΤ��j���¦������A���|�o�Ͱ��D
// �Ω�H���α��f�إߡi�ج[�j�A�A�Ψ�L����{�X�i�Ӹ`(�W�[�Y�ӡi�s�j�����Τ�k)

// ���D: �p�G�쥻�u�� �x�λP��ΡA���A�s�W �e�T���� ���\��
// ���F�s�WTriangle�����~�A�ٻݭn���GraphicEditor������k���e�A���ŦX�i�ק������j

// �ѨM: �s�W�s�ϧήɡA�u�n�A�s�W�@����Triangle2�A�쥻��GraphicEditor2���A�ä��|������ק�
public class OpenClosed2 {

	public static void main(String[] args) {
		GraphicEditor2 graphicEditor = new GraphicEditor2();
		graphicEditor.drawShape(new Rectangle2());
		graphicEditor.drawShape(new Circle2());
		graphicEditor.drawShape(new Triangle2());
	}

}

abstract class Shapee2 {
	int m_type;
	// �إߤ@�Ӯج[�A���ެO����ϧΡA���n�ۤv��{�o�Ӥ�k
	public abstract void draw();
}

class Rectangle2 extends Shapee2 {
	Rectangle2() {
		super.m_type = 1;
	}

	@Override
	public void draw() {
		System.out.println("�x��");
	}
}

class Circle2 extends Shapee2 {
	Circle2() {
		super.m_type = 2;
	}

	@Override
	public void draw() {
		System.out.println("���");
	}
}

class Triangle2 extends Shapee2 {
	public Triangle2() {
		super.m_type = 3;
	}

	@Override
	public void draw() {
		System.out.println("�T����");
	}
}

class GraphicEditor2 {
	// �o��Χ󰪼h��������޼�(�h�A)�A�C�ӹϧγ����ݩ�ۤv��draw��k
	public void drawShape(Shapee2 s) {
		s.draw();
	}
}