package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
	
	/*
	 * Desktop, Tv, mobilePhone
	 * 세 클래스가 모두 '공통적으로 가지고 있는 요소들을 정의해두자 => '부모 클래스'
	 */
	
	// 공통 필드부
	private String pName;
	private String pCode;
	private String brand;
	private int price;
	
	// 공통 기본 생성자
	public Product() {}
	// 공통 매개변수 생성자
	public Product(String pName, String pCode, String brand, int price) {
		this.pName = pName;
		this.pCode = pCode;
		this.brand = brand;
		this.price = price;
	}
	
	// 공통 메소드부
	// 공통 setter & getter 메소드
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpName() {
		return pName;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpCode() {
		return pCode;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	// 공통 information 메소드
	public String information() {
		return "brand : " + brand + ", pCode : " + pCode + ", pName : " + pName + ", price : " + price;
				
	}

}
