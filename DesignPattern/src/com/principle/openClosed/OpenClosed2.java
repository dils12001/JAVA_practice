package com.principle.openClosed;

// 開閉原則 Open Closed Principle(最重要!!!)
// 模塊與函數應對 【擴展開放、修改關閉】
// 可以擴展新部分，但不修改到舊有的部分，確保【已在使用中】的舊有部分，不會發生問題
// 用抽象類或接口建立【框架】，再用其他類實現擴展細節(增加某個【新】的類或方法)

// 問題: 如果原本只有 矩形與圓形，欲再新增 畫三角形 的功能
// 除了新增Triangle類之外，還需要更改GraphicEditor里的方法內容，不符合【修改關閉】

// 解決: 新增新圖形時，只要再新增一個類Triangle2，原本的GraphicEditor2類，並不會做任何修改
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
	// 建立一個框架，不管是什麼圖形，都要自己實現這個方法
	public abstract void draw();
}

class Rectangle2 extends Shapee2 {
	Rectangle2() {
		super.m_type = 1;
	}

	@Override
	public void draw() {
		System.out.println("矩形");
	}
}

class Circle2 extends Shapee2 {
	Circle2() {
		super.m_type = 2;
	}

	@Override
	public void draw() {
		System.out.println("圓形");
	}
}

class Triangle2 extends Shapee2 {
	public Triangle2() {
		super.m_type = 3;
	}

	@Override
	public void draw() {
		System.out.println("三角形");
	}
}

class GraphicEditor2 {
	// 這邊用更高層次的類當引數(多態)，每個圖形都有屬於自己的draw方法
	public void drawShape(Shapee2 s) {
		s.draw();
	}
}