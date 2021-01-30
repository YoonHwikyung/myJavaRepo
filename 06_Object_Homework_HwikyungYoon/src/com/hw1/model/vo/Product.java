package com.hw1.model.vo;

public class Product { // vo클래스(나만의 자료형)
	
	// 필드부
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	// 생성자부
	// 기본생성자
	public Product() {
		
	}
	// 매개변수 생성자
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	// 메소드부
	// setter 메소드
	public void setProductId(String getProductId) {
		this.productId = getProductId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	// getter 메소드
	public String getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductArea() {
		return productArea;
	}
	public int getPrice() {
		return price;
	}
	public double getTax() {
		return tax;
	}
	// information 메소드
	public String information() {
		String info = productId + " " + productName + " " + productArea + " " + price + " " + tax;
		return info;
	}
	
	// 실제가격 = 가격 + (가격 * 부가세율) 메소드
	public void rPrice() {
		System.out.println("상품명 = " + productName);
		System.out.printf("부가세 포함 가격 = %d원\n", (int)(price + (price * tax)));
	}
	
	public int pPrice() {
		int pPrice = (int)(price + price * tax);
		return pPrice;
	}
	
	
	
	
}
