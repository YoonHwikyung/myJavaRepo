package com.hw2.model.vo;

public class Student { // vo용 클래스
	
	// 필드부
	private int grade;
	private int classroom;
	private String name;
	private int kor;
	private int eng;
	private int math;

	
	// 생성자부
	// 기본 생성자
	public Student() { }
	// 매개변수 생성자
	public Student(int grade, int classroom, String name, int kor, int eng, int math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 메소드부
	// setter 메소드
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// getter 메소드
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
	// information 메소드
	public String information() {
		return grade + "학년 " + classroom + "반 " + name + " / 국어점수:" + kor + " 영어점수:" + eng + " 수학점수:" + math;
	}

}
