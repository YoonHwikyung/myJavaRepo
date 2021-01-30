package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent { // vo용 부모클래스
	
	// 필드부
	private int x;
	private int y;
	
	// 기본생성자
	public Parent() {}
	// 매개변수 생성자
	public Parent(int x, int y) {
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
	
	// 이번에는 toString메소드는 만들지 않을 것
	// 다른 단순한 메소드 추가
	public void printParent() {
		System.out.println("나는 부모야");
	}
	
	public void print() {
		System.out.println("나 부모야");
	}

}
