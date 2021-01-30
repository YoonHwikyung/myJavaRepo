package com.kh.chap01_beforeVSafter.before.model.vo;

public class Tv {
	
	// 필드부
	// 공통 속성
	private String pName;
	private String pCode;
	private String brand;
	private int price;
	
	// Tv만의 속성
	private int inch;
	
	
	// 생성자부
	// 기본생성자
	public Tv() { }
	// 매개변수 생성자
	public Tv(String pName, String pCode, String brand, int price, int inch) {
		this.pName = pName;
		this.pCode = pCode;
		this.brand = brand;
		this.price = price;
		this.inch = inch;
	}
	
	// 메소드부
	// setter 메소드
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	// getter 메소드
	public String getpName() {
		return pName;
	}
	public String getpCode() {
		return pCode;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public int getInch() {
		return inch;
	}
	
	// information 메소드
	public String information() {
		return "pName : " + pName + ", pCode : " +  pCode + ", brand : " + brand + ", price : " + price + ", inch : " + inch;
	}

}
