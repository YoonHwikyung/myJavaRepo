package com.hw1.model.vo;

public class Person { // vo�� Ŭ����. �θ� Ŭ����
	
	// �ʵ��
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	// �⺻ ������
	public Person() {}
	// �Ű����� ������
	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// setter & getter �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	// information �޼ҵ�
	@Override
	public String toString() {
		return "name : " + name + ", age : " + age + ", height : " + height + ", weight : " + weight;
		
	}
	
	
	

}
