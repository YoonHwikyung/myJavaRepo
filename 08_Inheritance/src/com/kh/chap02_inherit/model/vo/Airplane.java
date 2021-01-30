package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle { // vo용 클래스. 자식클래스
	
	// 필드부
	private int tire;
	private int wing;
	
	// 생성자부
	// 기본 생성자
	public Airplane() {}
	// 매개변수 생성자
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	
	// 메소드부
	// setter 메소드
	public void setTire(int tire) {
		this.tire = tire;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	// getter 메소드
	public int getTire() {
		return tire;
	}
	public int getWing() {
		return wing;
	}
	
	// information 메소드
	@Override // 나 이거 부모 클래스에 있는 메소드를 재정의한거야~(오타 검수 가능, 필수는 아님)
	public String toString() {
		return super.toString() + ", tire : " + tire + ", wing : " + wing;
	}
	
	
	// howToMove 메소드
	@Override // 나 이거 부모 클래스에 있는 메소드를 재정의한거야~
	public void howToMove() {
		System.out.println("바퀴를 굴려가다가 날개를 휘저으며 음직인다.");
	}

}
