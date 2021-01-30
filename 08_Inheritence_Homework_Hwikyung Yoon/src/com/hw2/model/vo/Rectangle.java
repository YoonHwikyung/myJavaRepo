package com.hw2.model.vo;

public class Rectangle extends Point { //vo.�ڽ�
	
	// �ʵ��
	private int width;
	private int height;
	
	// �⺻������
	public Rectangle() {}
	// �Ű����� ������
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	// getter setter �޼ҵ�
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	// draw �޼ҵ�
	public void draw() {
		super.draw();
		double extent = width * height;
		double circum = 2 * (width + height);
		System.out.printf("���� : %.0f\n", extent);
		System.out.printf("�ѷ� : %.0f\n", circum);
	}

}
