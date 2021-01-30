package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person implements Basic {
	
	// �ʵ��
	
	// �⺻������
	public Baby() {}
	
	// �Ű����� ������
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	// getter setter �޼ҵ�
	
	@Override
	public String toString() {
		return "Baby[" + super.toString() + "]";
	}

	@Override
	public void eat() {
		// ������ 3 ����
		super.setWeight(super.getWeight() + 3);
		// �ǰ��� 1 ����
		super.setHealth(super.getHealth() + 1);
		
	}

	@Override
	public void sleep() {
		// �ǰ��� 3 ����
		super.setHealth(super.getHealth() + 3);
		
	}

}
