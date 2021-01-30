package com.kh.operator; // 학습주제 : 산술 연산자

public class B_Arithmetic {
	
	public void method() {
		
		// 산술 연산자를 위해 변수에 담아두자
		int num1 = 10;
		int num2 = 3;
		
		// System.out.println("num1 + num2 = " + num1 + num2); -> "10" + 3 = 103이 출력된다.
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("\nnum1 - num2 = " + (num1 - num2));
		System.out.println();
		System.out.println("num1 x num2 = " + (num1 * num2)); // 곱하기가 더하기보다 우선순위기 때문에 괄호로 묶지 않아도 된다, 가독성을 위해 묶어두기 권장!
		System.out.println("num1 / num2 = " + (num1 / num2)); // 나누기의 몫으로만 결과 도출
		System.out.println("num1 % num2 = " + (num1 % num2)); // 나누기의 나머지 (나머지연산자)
		
		
	}

}
