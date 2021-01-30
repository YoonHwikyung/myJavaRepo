package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person implements Basic {
	
	// 필드부
	
	// 기본생성자
	public Baby() {}
	
	// 매개변수 생성자
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	// getter setter 메소드
	
	@Override
	public String toString() {
		return "Baby[" + super.toString() + "]";
	}

	@Override
	public void eat() {
		// 몸무게 3 증가
		super.setWeight(super.getWeight() + 3);
		// 건강도 1 증가
		super.setHealth(super.getHealth() + 1);
		
	}

	@Override
	public void sleep() {
		// 건강도 3 증가
		super.setHealth(super.getHealth() + 3);
		
	}

}
