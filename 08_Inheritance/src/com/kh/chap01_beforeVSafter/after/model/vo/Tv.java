package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product { // vo용 클래스. 자식 클래스
	
	// '상속'으로 '부모 클래스' 만든 후 Tv 클래스 작성
	
	// Tv만의 고유한 속성을 작성
	
	// 필드부
	private int inch;
	
	// 생성자부
	// 기본생성자
	public Tv() {}
	
	// 매개변수 생성자
	public Tv(String pName, String pCode, String brand, int price, int inch) {
		super(pName, pCode, brand, price);
		this.inch = inch;
	}
	
	// 메소드부
	// setter & getter 메소드
	public void setInch(int inch) {
		this.inch = inch;
	}
	public int getInch() {
		return inch;
	}
	
	// information 메소드 (오버라이딩)
	public String information() {
		return super.information() + ", inch : " + inch;
	}

}
