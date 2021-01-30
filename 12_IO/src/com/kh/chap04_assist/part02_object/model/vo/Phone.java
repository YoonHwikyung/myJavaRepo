package com.kh.chap04_assist.part02_object.model.vo; // voŬ����

import java.io.Serializable;

public class Phone implements Serializable { // ����ȭ ����. �ڹٿ��� �����ϴ� �������̽�. ������ �������̵� �� �ʿ�x
	
	// String Ÿ���� brand
	// int Ÿ���� price
	
	// �ʵ��
	/**
	 * 
	 */
	private static final long serialVersionUID = 3472735545236140953L;
	// �����ּ� �����ϸ� ������ȭ�� �� Ŭ������ �����ص� �������� �ʰ� �󸶵��� ��� �����ϴ�!
	
	private String brand;
	private int price;
	
	// �⺻������
	public Phone() {}
	
	// �Ű����� ������
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
