package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

// 추상클래스 : 미완성된 메소드가 하나라도 있는 순간, 클래스도 추상클래스!
// 접근제한자 abstract class 클래스명
public abstract class Sports { // vo.부모
	
	private int people;		// 스포츠에 참여하는 선수 명 수
	
	public Sports() {}

	public Sports(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	public void setPeople() {
		this.people = people;
	}
	
	
	
	@Override
	public String toString() {
		return "people : " + people;
	}
	
	/*
	 * * 추상메소드
	 * <표현법> 접근제한자 abstract 반환형 메소드명();
	 * 
	 * 몸통부가 존재하지 않는
	 * 즉, 미완성된 메소드 == 추상메소드
	 * 
	 * 메소드 정의시 abstract 예약어 사용
	 * 
	 * 뿐만 아니라 추상 메소드가 존재하면
	 * 해당 클래스 또한 무조건 추상 클래스로 작성해야 함!
	 * 
	 */
	
	// 추상메소드(미완성 메소드)  
	public abstract void rule(); // 어짜피 자식 클래스에서 재정의해서 쓸 테니 머리부만 쓰고 몸통부는 쓰지 않을래-> 그럼 예약어를 써!
	
	
	

}
