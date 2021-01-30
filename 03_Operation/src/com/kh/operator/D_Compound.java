package com.kh.operator; // 학습주제 : 복합대입연산자

public class D_Compound {

	/*
	 * 복합대입연산자 : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * 			      연산처리 속도가 훨씬 빠르므로 사용을 권장함
	 * 
	 * 	종류 : += -= *= /= %=
	 * 
	 *  예시) a값에 +3 값을 증가 시키고 싶을 떄
	 *	a = a + 3; 	==복합대입연산자를 사용 하면==> a += 3;
	 *	
	 *	a = a -3; 	==복합대입연산자를 사용 하면==> a -= 3;
	 *	. . . .
	 * 
	 */
	
	public void method() { //테스트를 위해 메소드를 생성해서 복합대입연산자를 연습해보자
		
		int num = 12;
		
		System.out.println("현재 num : " + num);
		
		// [+=]
		 // num을 3 증가 시키는 방법 (일반 방법)
		num = num + 3;
		System.out.println("3 증가시킨 num : " + num);
		
		// num을 다시 또 3 증가 시키기 (복합대입연산자 사용)
		num += 3;
		System.out.println("또 3 증가시킨 num : " + num);
		
		// 계속해서 복합대입연산자를 연습해보자!
		
		// num을 5 감소 시키기
		num -= 5; // num = num - 5;
		System.out.println("5 감소시킨 num : " + num);
		
		// 이제 곱셈 연산도 함께 있는 것을 연습해보자!
		// num을 6배 증가 시키기
		num *= 6; // num = num * 6; 과 같은 것
		System.out.println("6배 증가시킨 num : " + num);
		
		// num을 2배 감소 시키기
		num /= 2;
		System.out.println("2배 감소시킨 num : " + num);
		
		// num을 4로 나눴을 때의 나머지 값 구하기
		num %= 4; // num = num % 4;
		System.out.println("num을 4로 나눴을 때의 나머지 : " + num);
		
		
		// => 복합대입 연산자를 사용하면 내가 원하는 만큼 증감 시킬 수 있다!
		
		//---------------------------------------------------------------
		// 문자열은 그 이외의 연산자와 연산이 가능하다! => 문자열 화 된다! 이를 연습해보자!
		String str = "Hello";
		System.out.println("str : " + str);
		
		// 기존 방법 : str = str + "World";
		//복합대입 연산자를 사용해 문자열과 연산자와의 연산을 해보자!
		str += "World";
		System.out.println("최종 str : " + str);
		
		
		// 지금까지 복합대입연산자를 배워봤다!
		// 이제 비교연산자를 공부해보자! (다른 클래스에서~)
		
	}
	
	
	
}
