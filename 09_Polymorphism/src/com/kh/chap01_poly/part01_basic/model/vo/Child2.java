package com.kh.chap01_poly.part01_basic.model.vo;

public class Child2 extends Parent {
	
	// �ʵ��
	private int n;
	
	// �⺻������
	public Child2() {}
	// �Ű����� ������
	public Child2(int x, int y, int n) {
		super(x, y);
		this.n = n;
	}
	
	// getter setter �޼ҵ�
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	// Child2 ���� �޼ҵ� (�������̵� x)
	public void printChild2() {
		System.out.println("�� �� ° �ڽ��̾�");
	}

	@Override
	public void print() {
		System.out.println("�� �� ° �ڽ��̾�");
	}
}
