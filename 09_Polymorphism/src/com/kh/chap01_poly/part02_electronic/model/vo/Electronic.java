package com.kh.chap01_poly.part02_electronic.model.vo;

public class Electronic { // vo.부모
	
	// 필드부
	private String brand;
	private String name;
	private int price;
	
	// 기본 생성자
	public Electronic() {}
	// 매개변수 생성자
	public Electronic(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	// getter setter 메소드
	public String getbrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// toString 메소드
	@Override
	public String toString() {
		return "brand : " + brand + ", name : " + name + ", price : " + price;
	}
	

}
