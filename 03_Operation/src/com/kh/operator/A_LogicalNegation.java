package com.kh.operator; // 학습주제 : 논리 부정 연산자

public class A_LogicalNegation {

	public void method() {
		/*
		 * * 논리부정 연산자 (!) - 단항 연산자(값 하나만을 가지고 연산을 수행한다)
		 *   !논리값 => 논리값
		 *   
		 *   논리값(true/false)을 반대로 바꿔주는 연산자. !true = 맞지 않니? !false = 틀리지 않니?
		 */
		
		//변수 사용하지 않고 바로 결과 호출해보자~ (이번에는 담아두지 말고 바로 결과 호출하자~!)
		
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		boolean b = true;
		boolean b2 = !b;
		
		System.out.println("b2 : " + b2);
		
		
	} 
}
