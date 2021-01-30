package com.kh.chap02_inherit.model.vo;

public class Vehicle { // vo용 클래스. 부모 클래스
	
	// 필드부
	private String name;		// 이름
	private double mileage;		// 연비
	private String kind;		// 종류

	
	// 생성자부
	// 기본 생성자
	public Vehicle() {}
	// 매개변수 생성자
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}
	
	// 메소드부
	// setter & getter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getMileage() {
		return mileage;
	}
	
	public void setKine(String kind) {
		this.kind = kind;
	}
	public String kind() {
		return kind;
	}
	
	// information 메소드 => 20.01.13 오버라이딩 배웠으니 toString으로 바꾸자!
	@Override
	public String toString() {
		return "name : " + name + ", mileage : " + mileage + ", kind : " + kind;
	}
	
	public void howToMove() {
		System.out.println("그냥 움직임..");
	}

}
