package com.kh.variable; // 학습주제 : 상수

public class C_Constant {

	public void finalConstant() {
		// 변수 : 새로운 값 담아서 값 변경 가능
		int age = 20;	// 변수를 먼저 연습해보자! // 담아보자!
		System.out.println("age : " + age); // 호출해보자!
		
		//age = 21;	// 한 해가 흘렀을 때는 age 값을 변경한다. (변할 수 있는 수)
		age = age + 1;
		System.out.println("변경된 age : " + age);
		
		// 상수 : 새로운 값을 담아서 값 변경 불가
		//		=> 한 번 담긴 값은 변경이 불가능하다! (고정인 값을 담아둘 때 사용)
		// 상수명 권장사항 => 다 대문자
		final String BAN = "I클래스";
		// BAN = "A클래스"; => 오류! 한 번 담은 값 변경 불가능 하기 때문에  오류가 생긴다!
		System.out.println("반 : " + BAN);
		
		
	}
}
