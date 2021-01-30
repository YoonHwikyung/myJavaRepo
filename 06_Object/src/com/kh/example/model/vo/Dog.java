package com.kh.example.model.vo;

public class Dog { // 나만의 자료형
	
	// 필드부
	private String kind;
	private String name;
	private int age;
	private String color;
	
	// 생성자부
	
	// 메소드부
	// setter 메소드
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
	// getter 메소드
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
		String info1 = "종류 : " + kind + "\n나이 : " + age + "살\n털 색깔 : " + color;
		return info1;
	}
	
	public String information2() {
		String info2 = name +"는 " + age + "살 " + color + " " + kind + "입니다.";
		return info2;
	}
	
	
	
	
	
}
