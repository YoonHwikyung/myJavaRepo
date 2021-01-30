package com.hw1.model.vo;

public class Employee extends Person { // vo용 클래스. 자식클래스
	
	// 필드부
	private int salary;
	private String dept;
	
	// 기본생성자
	public Employee() {}
	// 매개변수 생성자
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.name = name ;
		this.salary = salary;
		this.dept = dept;
	}
	
	// setter & getter 메소드
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	
	// information 메소드
	@Override
	public String toString() {
		return super.toString() + ", salary : " + salary + ", dept : " + dept;
	}
	
	
}
