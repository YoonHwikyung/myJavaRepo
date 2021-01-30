package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle { // vo�� Ŭ����. �ڽ� Ŭ����
	
	// �ʵ��
	private int propeller;		// �����緯 ����
	
	// �����ں�
	// �⺻ ������
	public Ship() {}
	// �Ű����� ������
	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}
	
	// �޼ҵ��
	// setter & getter �޼ҵ�
	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	public int getPropeller() {
		return propeller;
	}
	
	// information �޼ҵ�
	@Override
	public String toString() {
		return super.toString() + ", propeller : " + propeller;
	}
	
	// howToMove �޼ҵ�
	@Override
	public void howToMove() {
		System.out.println("�����緯�� �������鼭 �����δ�.");
	}

}
