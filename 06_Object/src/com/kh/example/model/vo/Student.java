package com.kh.example.model.vo;

public class Student { // ������ �ڷ��� 
	
	// �ʵ��
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	// �����ں�
	
	// �޼ҵ��
	// setter �޼ҵ�
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	// getter �޼ҵ�
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
	
	public String information1() {
		String info = grade + "�г� " + classroom +"�� " + gender +"�� "
					+ name + "�л��� Ű�� " + height +"cm�Դϴ�.";
		return info;
	}
	
	
	
	
	
	
	
	
}