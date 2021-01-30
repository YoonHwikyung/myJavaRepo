package com.hw2.model.vo;

public class Point { // vo.부모
	
	// 필드부
	private int x;
	private int y;
	
	// 기본생성자
	public Point() {}
	// 매개변수 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// getter setter 메소드
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
	
	// draw()메소드
	public void draw() {
		System.out.println("(x, y) : " + "(" + x + ", " + y + ")");
	}

}
