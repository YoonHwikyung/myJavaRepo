package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent { // vo�� �θ�Ŭ����
	
	// �ʵ��
	private int x;
	private int y;
	
	// �⺻������
	public Parent() {}
	// �Ű����� ������
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// getter setter �޼ҵ�
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// �̹����� toString�޼ҵ�� ������ ���� ��
	// �ٸ� �ܼ��� �޼ҵ� �߰�
	public void printParent() {
		System.out.println("���� �θ��");
	}
	
	public void print() {
		System.out.println("�� �θ��");
	}

}
