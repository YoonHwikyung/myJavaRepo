package com.hw2.model.vo;

public class Point { // vo.�θ�
	
	// �ʵ��
	private int x;
	private int y;
	
	// �⺻������
	public Point() {}
	// �Ű����� ������
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// getter setter �޼ҵ�
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// draw()�޼ҵ�
	public void draw() {
		System.out.println("(x, y) : " + "(" + x + ", " + y + ")");
	}

}
