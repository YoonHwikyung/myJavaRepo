package com.kh.chap01_beforeVSafter.before.model.vo;

public class Tv {
	
	// �ʵ��
	// ���� �Ӽ�
	private String pName;
	private String pCode;
	private String brand;
	private int price;
	
	// Tv���� �Ӽ�
	private int inch;
	
	
	// �����ں�
	// �⺻������
	public Tv() { }
	// �Ű����� ������
	public Tv(String pName, String pCode, String brand, int price, int inch) {
		this.pName = pName;
		this.pCode = pCode;
		this.brand = brand;
		this.price = price;
		this.inch = inch;
	}
	
	// �޼ҵ��
	// setter �޼ҵ�
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
	public void setInch(int inch) {
		this.inch = inch;
	}
	// getter �޼ҵ�
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
	public int getInch() {
		return inch;
	}
	
	// information �޼ҵ�
	public String information() {
		return "pName : " + pName + ", pCode : " +  pCode + ", brand : " + brand + ", price : " + price + ", inch : " + inch;
	}

}
