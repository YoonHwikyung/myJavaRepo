package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Mother extends Person implements Basic {
				 // extends - 클래스  implements - 인터페이스 상속
	

	private String babyBirth;		// 아기의 탄생 : 출산, 입양, 없음
	
	public Mother() {}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public String toString() {
		return "Mother[" + super.toString() + ", babyBirth : " + babyBirth + "]";
	}

	
	
	@Override
	public void eat() {
		// 엄마가 밥을 먹으면?
		// 기존의 몸무게에거 10증가
		super.setWeight(super.getWeight() + 10);
		
		// 기존의 건강도에서 10 감소
		super.setHealth(super.getHealth() - 10);
	
	}

	@Override
	public void sleep() {
		
		// 건강도 10 증가
		super.setHealth(super.getHealth() + 10);
		
	}

	
	
}
