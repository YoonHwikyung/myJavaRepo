package com.kh.chap03_class.model.vo; // ������ �ڷ���

// VO(Value Object) : ��ü�� ������ �����ϱ� ���� �뵵�� Ŭ����
public class Person {
	
	// �ʵ��
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email; 
	
	// �����ں� ( 2021.01.08. �����ںθ� ������� ���׷��̵� �غ���!)
	// �⺻ ������
	public Person() {
		
	}
	
	// �Ű����� ������ (��� �ʵ� �� �ʱ�ȭ)
	public Person(String name, int age, char gender, String phone, String email) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	
	
	
	// �޼ҵ��
	// * setter �޼ҵ� (���ް� �޾Ƽ� �� �ʵ忡 �����ϴ� �޼ҵ�)
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	// => 5���� �ǵ带 �ʱ�ȭ ��ų �� �ִ� 5���� setter �޼ҵ带 �����!
	
	
	// * getter �޼ҵ� (�� �ʵ忡 ��� �� �����ִ� �޼ҵ�)
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}

	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}

	
	
	
	
	
	
	
	
	
}
