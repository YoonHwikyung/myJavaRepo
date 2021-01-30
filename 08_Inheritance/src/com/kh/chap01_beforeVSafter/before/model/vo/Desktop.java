package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	
	// �ʵ��
	// ���� �Ӽ�(Tv,SmartPhone ������ ����� �Ӽ��̴�.)
	private String pName;
	private String pCode;
	private String brand;
	private int price;
	
	// Desktop���� �Ӽ�
	private boolean allInOne;
	
	
	// �����ں�
	// �⺻������
	public Desktop() {}
	// �Ű����� ������
	public Desktop(String pName, String pCode, String brand, int price, boolean allInOne) {
		this.pName = pName;
		this.pCode = pCode;
		this.brand = brand;
		this.price = price;
		this.allInOne = allInOne;
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
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
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
	// boolean �ڷ��� �ʵ忡 ���� 'getter �޼ҵ��'�� is~~
	public boolean isAllInOne() {
		return allInOne;
	}
	
	// information �޼ҵ�
	public String information() {
		return "pName : " + pName + ", pCode :  " + pCode + ", brand : " + brand + ", price : " + price + ", allInOne : " + allInOne;
	}

}
