package com.kh.chap02.objectArray.model.vo;

public class Phone { // vo Ŭ����
	
	//  �ڵ��� �̸�, �귣���, ����, �ø���
	
	// �ʵ��
	private String name;
	private String brand;
	private int price;
	private String series;
	
	// �����ں�
	// �⺻������
	public Phone() { }
	// �Ű����� ������
	public Phone(String name, String brand, int price, String series) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.series = series;
	}
	// �޼ҵ��
	// setter �޼ҵ�
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
	// getter �޼ҵ�
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
	
	// information �޼ҵ�
	public String information() {
		return "name = " + name + ", brand = " + brand + ", price = " + price + ", series = " + series;
	}

}
