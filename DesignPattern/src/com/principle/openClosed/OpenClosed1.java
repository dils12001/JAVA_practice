package com.principle.openClosed;

// 開閉原則 Open Closed Principle(最重要!!!)
// 模塊與函數應對 【擴展開放、修改關閉】
// 可以擴展新部分，但不修改到舊有的部分，確保【已在使用中】的舊有部分，不會發生問題
// 用抽象類或接口建立【框架】，再用其他類實現擴展細節(增加某個【新】的類或方法)

// 問題: 如果原本只有 矩形與圓形，欲再新增 畫三角形 的功能
// 除了新增Triangle類之外，還需要更改GraphicEditor里的方法內容，不符合【修改關閉】
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
		} else if (s.m_type == 3) {	// 需修改這個if else
			drawTriangle();
		}
	}

	private void drawRectangle() {
		System.out.println("矩形");
	}

	private void drawCircle() {
		System.out.println("圓形");
	}

	// 需新增此方法
	private void drawTriangle() {
		System.out.println("三角形");
	}
}