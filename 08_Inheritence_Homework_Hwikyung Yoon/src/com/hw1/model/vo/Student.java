package com.hw1.model.vo;

public class Student extends Person { // vo�� Ŭ����. �ڽ�Ŭ����
	
	// �ʵ��
	private int grade;
	private String major;
	
	// �⺻������
	public Student() {}
	// �Ű����� ������
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	// setter & getter �޼ҵ�
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
	
	// information �޼ҵ�
	@Override
	public String toString() {
		return super.toString() + ", grade : " + grade + ", major : " + major;
	}

}
