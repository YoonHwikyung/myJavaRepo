package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle { // vo용 클래스. 자식 클래스
	
	// 필드부
	private int tire;		// 타이어 갯수
	
	// 생성자부
	// 기본 생성자
	public Car() {}
	// 매개변수 생성자
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
	}
	
	// 메소드부
	// setter & getter 메소드
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getTire() {
		return tire;
	}
	
	// information 메소드
	@Override
	public String toString() {
		return super.toString() + ", tire : " + tire;
	}
	
	// howToMove 메소드
	@Override
	public void howToMove() {
		System.out.println("바퀴를 굴려가며 움직인다.");
	}
	
	
	

}
