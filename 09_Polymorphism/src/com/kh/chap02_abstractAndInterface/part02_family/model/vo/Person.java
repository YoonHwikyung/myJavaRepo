package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public abstract class Person { //vo.부모
	
	// 필드부 : 건강관리 프로그램
	private String name;		// 이름
	private double weight;		// 몸무게
	private int health;			// 건강도
	
	// 기본생성자
	public Person() {}
	// 매개변수 생성자
	public Person(String name,  double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	// getter setter 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	// toString 메소드
	@Override
	public String toString() {
		return "name : " + name + ", weight : " + weight + ", health : " + health;
	}
	
	
	// 추상메소드(미완성메소드) 추가
	//public abstract void eat();
	//public abstract void sleep();
	// => 인터페이스에서 작성해보자!
	
	
	
	

}
