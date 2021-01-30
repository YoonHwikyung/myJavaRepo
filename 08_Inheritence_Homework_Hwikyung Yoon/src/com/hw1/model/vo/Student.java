package com.hw1.model.vo;

public class Student extends Person { // vo용 클래스. 자식클래스
	
	// 필드부
	private int grade;
	private String major;
	
	// 기본생성자
	public Student() {}
	// 매개변수 생성자
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	// setter & getter 메소드
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	
	// information 메소드
	@Override
	public String toString() {
		return super.toString() + ", grade : " + grade + ", major : " + major;
	}

}
