package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent {
	
	// 필드부
	private int z;
	
	// 기본생성자
	public Child1() {}
	// 매개변수 생성자
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// getter setter 메소드
	public int getZ() {
		return z;
	}
	public void setZ() {
		this.z = z;
	}
	
	// Child1 만의 메소드(오버라이딩x)
	public void printChild1() {
		System.out.println("나 첫 쨰 자식이야");
	}
	
	@Override
	public void print() {
		System.out.println("나 첫 쨰 자식이야");
	}
	

}
