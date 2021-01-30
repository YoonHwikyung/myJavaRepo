package com.kh.chap01_poly.part02_electronic.model.vo;

public class Tablet extends Electronic { // vo.자식
	
	// 필드부
	private boolean penFlag;
	
	// 기본생성자
	public Tablet() {}
	// 매개변수 생성자
	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}
	
	// getter setter 메소드
	public boolean isPenFlag() {
		return penFlag;
	}
	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}
	
	// toString 메소드
	@Override
	public String toString() {
		return super.toString() + ", penFlag : " + (penFlag ? "있음" : "없음"); // 삼항연산자. penFlag가 true일 경우 "있음" false일 경우 "없음"
	}

}
