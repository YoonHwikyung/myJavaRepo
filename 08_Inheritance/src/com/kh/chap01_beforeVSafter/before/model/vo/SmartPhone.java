package com.kh.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {

	// 필드부
	// 공통속성
	private String pName;
	private String pCode;
	private String brand;
	private int price;
	
	// SmartPhone만의 속성
	private String mobileAgency;
	
	// 생성자부
	// 기본생성자
	public SmartPhone() { }
	// 매개변수 생성자
	public SmartPhone(String pName, String pCode, String brand, int price, String mobileAgency) {
		this.pName = pName;
		this.pCode = pCode;
		this.brand = brand;
		this.price = price;
		this.mobileAgency = mobileAgency;
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
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
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
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	// information 메소드
	public String information() {
		return "pName : " + pName + ", pCode : " + pCode + ", brand : " + brand + ", price : " + price + ", mobileAgency : " + mobileAgency;
	}
}
