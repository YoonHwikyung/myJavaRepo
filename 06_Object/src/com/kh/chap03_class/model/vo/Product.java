package com.kh.chap03_class.model.vo;

// Ŭ������ �ۼ� ������ ���� ������ => public, default
// default => class Product {
// default class => ���� ��Ű�� �������� ȣ�� �����ϴ�!

public class Product { 

	// ������Ʈ ���� ? ��ǰ
	// �Ӽ�? ��ǰ��, ��ǰ����, ��ǰ �귣��
	// � �ڷ���? ��ǰ��(String), ��ǰ����(), ��ǰ �귣��(String)
	
	// �ʵ��
	private String pName;
	private int price;
	private String brand;
	
	
	// �����ں�
	
	// �޼ҵ��
	
	// * setter �޼ҵ�
	public void setpName(String pName) { // �ʵ�� : �ִ� �״�� ���̸� ��! ex) psName -> PsName
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	// * getter �޼ҵ�
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	
}
