package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent {
	
	// �ʵ��
	private int z;
	
	// �⺻������
	public Child1() {}
	// �Ű����� ������
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// getter setter �޼ҵ�
	public int getZ() {
		return z;
	}
	public void setZ() {
		this.z = z;
	}
	
	// Child1 ���� �޼ҵ�(�������̵�x)
	public void printChild1() {
		System.out.println("�� ù �� �ڽ��̾�");
	}
	
	@Override
	public void print() {
		System.out.println("�� ù �� �ڽ��̾�");
	}
	

}
