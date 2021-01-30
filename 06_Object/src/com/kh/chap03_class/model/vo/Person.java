package com.kh.chap03_class.model.vo; // 나만의 자료형

// VO(Value Object) : 객체의 값들을 보관하기 위한 용도의 클래스
public class Person {
	
	// 필드부
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email; 
	
	// 생성자부 ( 2021.01.08. 생성자부를 배웠으니 업그레이드 해보자!)
	// 기본 생성자
	public Person() {
		
	}
	
	// 매개변수 생성자 (모든 필드 값 초기화)
	public Person(String name, int age, char gender, String phone, String email) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	
	
	
	// 메소드부
	// * setter 메소드 (전달값 받아서 각 필드에 대입하는 메소드)
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
	// => 5개의 피드를 초기화 시킬 수 있는 5개의 setter 메소드를 만든것!
	
	
	// * getter 메소드 (각 필드에 담긴 값 돌려주는 메소드)
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
