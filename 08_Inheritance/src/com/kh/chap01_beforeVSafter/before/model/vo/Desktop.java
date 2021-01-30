package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	
	// 필드부
	// 공통 속성(Tv,SmartPhone 에서도 공통된 속성이다.)
	private String pName;
	private String pCode;
	private String brand;
	private int price;
	
	// Desktop만의 속성
	private boolean allInOne;
	
	
	// 생성자부
	// 기본생성자
	public Desktop() {}
	// 매개변수 생성자
	public Desktop(String pName, String pCode, String brand, int price, boolean allInOne) {
		this.pName = pName;
		this.pCode = pCode;
		this.brand = brand;
		this.price = price;
		this.allInOne = allInOne;
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
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
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
	// boolean 자료형 필드에 대한 'getter 메소드명'은 is~~
	public boolean isAllInOne() {
		return allInOne;
	}
	
	// information 메소드
	public String information() {
		return "pName : " + pName + ", pCode :  " + pCode + ", brand : " + brand + ", price : " + price + ", allInOne : " + allInOne;
	}

}
