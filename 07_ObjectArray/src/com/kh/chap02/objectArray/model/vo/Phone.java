package com.kh.chap02.objectArray.model.vo;

public class Phone { // vo 클래스
	
	//  핸드폰 이름, 브랜드명, 가격, 시리즈
	
	// 필드부
	private String name;
	private String brand;
	private int price;
	private String series;
	
	// 생성자부
	// 기본생성자
	public Phone() { }
	// 매개변수 생성자
	public Phone(String name, String brand, int price, String series) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.series = series;
	}
	// 메소드부
	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSerise(String series) {
		this.series = series;
	}
	// getter 메소드
	public String getName() {
		return name;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getSeries() {
		return series;
	}
	
	// information 메소드
	public String information() {
		return "name = " + name + ", brand = " + brand + ", price = " + price + ", series = " + series;
	}

}
