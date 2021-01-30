package com.hw1.model.vo;

public class Product { // voŬ����(������ �ڷ���)
	
	// �ʵ��
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	// �����ں�
	// �⺻������
	public Product() {
		
	}
	// �Ű����� ������
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	// �޼ҵ��
	// setter �޼ҵ�
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
	// getter �޼ҵ�
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
	// information �޼ҵ�
	public String information() {
		String info = productId + " " + productName + " " + productArea + " " + price + " " + tax;
		return info;
	}
	
	// �������� = ���� + (���� * �ΰ�����) �޼ҵ�
	public void rPrice() {
		System.out.println("��ǰ�� = " + productName);
		System.out.printf("�ΰ��� ���� ���� = %d��\n", (int)(price + (price * tax)));
	}
	
	public int pPrice() {
		int pPrice = (int)(price + price * tax);
		return pPrice;
	}
	
	
	
	
}
