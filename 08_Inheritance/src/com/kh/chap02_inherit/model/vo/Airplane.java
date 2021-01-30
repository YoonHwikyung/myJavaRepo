package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle { // vo�� Ŭ����. �ڽ�Ŭ����
	
	// �ʵ��
	private int tire;
	private int wing;
	
	// �����ں�
	// �⺻ ������
	public Airplane() {}
	// �Ű����� ������
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	
	// �޼ҵ��
	// setter �޼ҵ�
	public void setTire(int tire) {
		this.tire = tire;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	// getter �޼ҵ�
	public int getTire() {
		return tire;
	}
	public int getWing() {
		return wing;
	}
	
	// information �޼ҵ�
	@Override // �� �̰� �θ� Ŭ������ �ִ� �޼ҵ带 �������Ѱž�~(��Ÿ �˼� ����, �ʼ��� �ƴ�)
	public String toString() {
		return super.toString() + ", tire : " + tire + ", wing : " + wing;
	}
	
	
	// howToMove �޼ҵ�
	@Override // �� �̰� �θ� Ŭ������ �ִ� �޼ҵ带 �������Ѱž�~
	public void howToMove() {
		System.out.println("������ �������ٰ� ������ �������� �����δ�.");
	}

}
