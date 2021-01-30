package com.kh.chap01_poly.part01_basic.model.vo;

public class Child2 extends Parent {
	
	// 필드부
	private int n;
	
	// 기본생성자
	public Child2() {}
	// 매개변수 생성자
	public Child2(int x, int y, int n) {
		super(x, y);
		this.n = n;
	}
	
	// getter setter 메소드
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	// Child2 만의 메소드 (오버라이딩 x)
	public void printChild2() {
		System.out.println("나 둘 째 자식이야");
	}

	@Override
	public void print() {
		System.out.println("나 둘 째 자식이야");
	}
}
