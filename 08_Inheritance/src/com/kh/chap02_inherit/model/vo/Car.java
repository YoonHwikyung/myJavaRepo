package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle { // vo�� Ŭ����. �ڽ� Ŭ����
	
	// �ʵ��
	private int tire;		// Ÿ�̾� ����
	
	// �����ں�
	// �⺻ ������
	public Car() {}
	// �Ű����� ������
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
	}
	
	// �޼ҵ��
	// setter & getter �޼ҵ�
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getTire() {
		return tire;
	}
	
	// information �޼ҵ�
	@Override
	public String toString() {
		return super.toString() + ", tire : " + tire;
	}
	
	// howToMove �޼ҵ�
	@Override
	public void howToMove() {
		System.out.println("������ �������� �����δ�.");
	}
	
	
	

}
