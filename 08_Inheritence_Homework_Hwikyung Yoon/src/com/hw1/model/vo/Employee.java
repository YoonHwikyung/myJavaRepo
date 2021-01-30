package com.hw1.model.vo;

public class Employee extends Person { // vo�� Ŭ����. �ڽ�Ŭ����
	
	// �ʵ��
	private int salary;
	private String dept;
	
	// �⺻������
	public Employee() {}
	// �Ű����� ������
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.name = name ;
		this.salary = salary;
		this.dept = dept;
	}
	
	// setter & getter �޼ҵ�
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
	
	// information �޼ҵ�
	@Override
	public String toString() {
		return super.toString() + ", salary : " + salary + ", dept : " + dept;
	}
	
	
}
