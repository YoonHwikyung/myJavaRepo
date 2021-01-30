package com.kh.chap03_class.model.vo;

// 클래스에 작성 가능한 접근 제한자 => public, default
// default => class Product {
// default class => 같은 패키지 내에서만 호출 가능하다!

public class Product { 

	// 프로젝트 주제 ? 제품
	// 속성? 제품명, 제품가격, 제품 브랜드
	// 어떤 자료형? 제품명(String), 제품가격(), 제품 브랜드(String)
	
	// 필드부
	private String pName;
	private int price;
	private String brand;
	
	
	// 생성자부
	
	// 메소드부
	
	// * setter 메소드
	public void setpName(String pName) { // 필드명 : 있는 그대로 붙이면 됌! ex) psName -> PsName
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	// * getter 메소드
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	
}
