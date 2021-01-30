package com.kh.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {

	// �ʵ��
	// ����Ӽ�
	private String pName;
	private String pCode;
	private String brand;
	private int price;
	
	// SmartPhone���� �Ӽ�
	private String mobileAgency;
	
	// �����ں�
	// �⺻������
	public SmartPhone() { }
	// �Ű����� ������
	public SmartPhone(String pName, String pCode, String brand, int price, String mobileAgency) {
		this.pName = pName;
		this.pCode = pCode;
		this.brand = brand;
		this.price = price;
		this.mobileAgency = mobileAgency;
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
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
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
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	// information �޼ҵ�
	public String information() {
		return "pName : " + pName + ", pCode : " + pCode + ", brand : " + brand + ", price : " + price + ", mobileAgency : " + mobileAgency;
	}
}
