package com.kh.chap02_inherit.model.vo;

public class Vehicle { // vo�� Ŭ����. �θ� Ŭ����
	
	// �ʵ��
	private String name;		// �̸�
	private double mileage;		// ����
	private String kind;		// ����

	
	// �����ں�
	// �⺻ ������
	public Vehicle() {}
	// �Ű����� ������
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}
	
	// �޼ҵ��
	// setter & getter �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getMileage() {
		return mileage;
	}
	
	public void setKine(String kind) {
		this.kind = kind;
	}
	public String kind() {
		return kind;
	}
	
	// information �޼ҵ� => 20.01.13 �������̵� ������� toString���� �ٲ���!
	@Override
	public String toString() {
		return "name : " + name + ", mileage : " + mileage + ", kind : " + kind;
	}
	
	public void howToMove() {
		System.out.println("�׳� ������..");
	}

}
