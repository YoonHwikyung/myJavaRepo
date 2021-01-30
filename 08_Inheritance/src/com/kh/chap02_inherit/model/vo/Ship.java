package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle { // vo용 클래스. 자식 클래스
	
	// 필드부
	private int propeller;		// 프로펠러 갯수
	
	// 생성자부
	// 기본 생성자
	public Ship() {}
	// 매개변수 생성자
	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}
	
	// 메소드부
	// setter & getter 메소드
	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	public int getPropeller() {
		return propeller;
	}
	
	// information 메소드
	@Override
	public String toString() {
		return super.toString() + ", propeller : " + propeller;
	}
	
	// howToMove 메소드
	@Override
	public void howToMove() {
		System.out.println("프로펠러를 돌려가면서 움직인다.");
	}

}
