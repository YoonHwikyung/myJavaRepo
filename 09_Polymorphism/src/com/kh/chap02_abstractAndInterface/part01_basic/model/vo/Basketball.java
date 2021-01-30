package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class Basketball extends Sports { // vo.자식
	
	// 미완성된 클래스인 추상클래스를 상속 받게되면
	// 부모 클래스에 있는 추상메소드를 강제로 오버라이딩을 통해 완성시켜야 함!
	
	
	@Override
	public void rule() {
		System.out.println("손으로 공을 던져 링에 넣어야 한다.");
	}

}
