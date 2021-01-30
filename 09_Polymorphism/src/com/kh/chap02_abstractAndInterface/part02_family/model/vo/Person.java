package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public abstract class Person { //vo.�θ�
	
	// �ʵ�� : �ǰ����� ���α׷�
	private String name;		// �̸�
	private double weight;		// ������
	private int health;			// �ǰ���
	
	// �⺻������
	public Person() {}
	// �Ű����� ������
	public Person(String name,  double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	// getter setter �޼ҵ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	// toString �޼ҵ�
	@Override
	public String toString() {
		return "name : " + name + ", weight : " + weight + ", health : " + health;
	}
	
	
	// �߻�޼ҵ�(�̿ϼ��޼ҵ�) �߰�
	//public abstract void eat();
	//public abstract void sleep();
	// => �������̽����� �ۼ��غ���!
	
	
	
	

}
