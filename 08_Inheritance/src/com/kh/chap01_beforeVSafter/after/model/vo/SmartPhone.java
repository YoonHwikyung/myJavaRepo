package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product { // vo�� Ŭ����. �ڽ� Ŭ����

	// '���'���� '�θ� Ŭ����' ���� �� SmartPhone Ŭ���� �ۼ�
	
	// SmartPhone���� ������ �Ӽ��� �ۼ�
	
	// �ʵ��
	private String mobileAgency;
	
	// �����ں�
	// �⺻������
	public SmartPhone() {}
	// �Ű����� ������
	public SmartPhone(String pName, String pCode, String brand, int price, String mobileAgency) {
		super(pName, pCode, brand, price);
		this.mobileAgency = mobileAgency;
	}
	
	// �޼ҵ��
	// setter & getter �޼ҵ�
	public void setMoblieAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	// information �޼ҵ� (�������̵�)
	public String information() {
		return super.information() + ", mobileAgency : " + mobileAgency;
	}
}
