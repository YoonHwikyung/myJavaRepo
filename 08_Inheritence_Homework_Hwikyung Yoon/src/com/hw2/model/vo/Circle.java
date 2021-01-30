package com.hw2.model.vo;

public class Circle extends Point { //vo.�ڽ�
	
	// �ʵ��
	private int radius;
	
	// �⺻������
	public Circle() {}
	// �Ű����� ������
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	// getter setter �޼ҵ�
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// draw �޼ҵ�
	public void draw() {
		super.draw();
		double extent = Math.PI * radius * radius;
		double circum = Math.PI * radius * 2;
		System.out.printf("���� : %.1f\n", extent);
		System.out.printf("�ѷ� : %.1f\n", circum);
		
	}

}
