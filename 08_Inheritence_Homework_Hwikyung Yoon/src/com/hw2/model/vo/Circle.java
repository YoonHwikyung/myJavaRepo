package com.hw2.model.vo;

public class Circle extends Point { //vo.자식
	
	// 필드부
	private int radius;
	
	// 기본생성자
	public Circle() {}
	// 매개변수 생성자
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	// getter setter 메소드
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// draw 메소드
	public void draw() {
		super.draw();
		double extent = Math.PI * radius * radius;
		double circum = Math.PI * radius * 2;
		System.out.printf("면적 : %.1f\n", extent);
		System.out.printf("둘레 : %.1f\n", circum);
		
	}

}
