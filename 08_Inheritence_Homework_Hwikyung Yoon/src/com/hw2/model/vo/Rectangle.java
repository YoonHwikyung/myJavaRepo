package com.hw2.model.vo;

public class Rectangle extends Point { //vo.자식
	
	// 필드부
	private int width;
	private int height;
	
	// 기본생성자
	public Rectangle() {}
	// 매개변수 생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	// getter setter 메소드
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
	
	// draw 메소드
	public void draw() {
		super.draw();
		double extent = width * height;
		double circum = 2 * (width + height);
		System.out.printf("면적 : %.0f\n", extent);
		System.out.printf("둘레 : %.0f\n", circum);
	}

}
