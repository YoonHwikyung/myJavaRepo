package com.kh.example.model.vo;

public class Dog { // ������ �ڷ���
	
	// �ʵ��
	private String kind;
	private String name;
	private int age;
	private String color;
	
	// �����ں�
	
	// �޼ҵ��
	// setter �޼ҵ�
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// getter �޼ҵ�
	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public int setAge() {
		return age;
	}
	public String setColor() {
		return color;
	}
	
	public String information1() {
		String info1 = "���� : " + kind + "\n���� : " + age + "��\n�� ���� : " + color;
		return info1;
	}
	
	public String information2() {
		String info2 = name +"�� " + age + "�� " + color + " " + kind + "�Դϴ�.";
		return info2;
	}
	
	
	
	
	
}
