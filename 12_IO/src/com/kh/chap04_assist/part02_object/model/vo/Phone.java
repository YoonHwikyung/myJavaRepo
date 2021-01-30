package com.kh.chap04_assist.part02_object.model.vo; // vo클래스

import java.io.Serializable;

public class Phone implements Serializable { // 직렬화 선언. 자바에서 제공하는 인터페이스. 강제로 오버라이딩 할 필요x
	
	// String 타입의 brand
	// int 타입의 price
	
	// 필드부
	/**
	 * 
	 */
	private static final long serialVersionUID = 3472735545236140953L;
	// 고유주소 생성하면 역질렬화시 폰 클래스를 수정해도 오류나지 않고 얼마든지 사용 가능하다!
	
	private String brand;
	private int price;
	
	// 기본생성자
	public Phone() {}
	
	// 매개변수 생성자
	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	// setter getter
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// toString
	@Override
	public String toString() {
		return "Phone[brand=" + brand + ", price=" + price + "]";
	}

}
