package com.kh.operator; // 학습 주제 : 논리 연산자

import java.util.Scanner;

public class F_Logical {

	/*
	 * * 논리 연산자
	 * - 두 개의 논리값을 연산하는 연산자
	 * - 논리값 (논리연산자) 논리값		=> 논리값			// true/false (논리연산자) true/false ==> true/false 도출
	 * 
	 *  [논리 연산자 종류]
	 * 1. 논리값 && 논리값 : 왼 쪽, 오른 쪽 둘 다 true일 경우 => 최종적인 결과도 true ( 둘 중 하나라도 false면 결과도 false)
	 *      ㄴ앤드
	 * 2. 논리갑 || 논리값 : 왼 쪽, 오른 쪽 둘 중에 하나라도 true => 최종적인 결과도 true ( 둘 중 하나라도 true면 결과도 true)
	 * 		ㄴ오아
	 * 
	 */
	
	
	
		// and 연산자를 공부해보자! 논리갑 && 논리값
	public void method1() {
		// 사용자가 입력한 정수값이 양수"이면서(이고)" 짝수인지 확인하고자 한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 값 한 개 입력 : ");
		int num = sc.nextInt();
		
		// 사용자가 입력한 num값이 양수이면서 짝수입니까? 그 결과를 boolean에 넣어두자.
		boolean result = (num > 0) && (num % 2 == 0);
			// && 의미 : 그리고, ~이고, ~이면서, 동시에
		
		System.out.println("사용자가 입력한 값이 양수이면서 짝수입니까 : " + result);
		
		
	}
	// 좀 더 예시를 들어 연습해보자!
	public void method2() {
		//사용자가 입력한 정수 값이 1 이상 100이의 값인지 확인하고자 한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 한 개 입력 : ");
		int num = sc.nextInt();
		
		//사용자가 입력한 정수 값이 1 이상"이고" 100 이하인지에 대한 결과값을 변수에 담아보자! 가독성!
		// boolean result = ( 1 <= num <= 100 ) => 자바에서는 없는 문법. 반드시 두개의 조건을 제시하고 엮어줘야 함
		boolean result = (num >= 1) && (num <= 100);

		System.out.println("사용자가 입력한 값이 1 이상, 100 이하 입니까 : " + result); // => 사용자가 입력하는 값에 따라 연산 결과가 달라진다. 
		
		/* 정리
		 * && (and) : 두 개의 조건이 모두 true여아만 &&의 결과값은 최종적으로 true
		 * 			     둘 중 하나라도 false가 된다면 && 연산의 결과값은 false
		 * 
		 */
		
		
		
	}
	
		// 이제 or연산자를 공부해보자! 논리갑 || 논리값
	public void method3( ) {
		
		//사용자가 입력한 값이 y"이거나(또는)" Y인지 확인하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계속 하시려면 y 또는 Y를 입력하세요 : ");
		
		char ch = sc.nextLine().charAt(0);
		
		//사용자가 입력한 값이 y 또는 Y
		// boolean result = 'y' == ch =='Y'; =>불가능. 한 번씩 끊어주고 엮어야 한다!
		boolean result = (ch == 'y') || (ch == 'Y');
		// || (or) : 또는, ~이거나
		
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까 : " + result);
		
		/* 정리
		 * || (or) :  두 개의 조건 중 하나라도 true일 경우  => 최종 결과값 true
		 * 			     두 개의 조건 모두 false일 경우 => 최종 결과값 false
		 * 
		 */
		
		// 이 연산자를 추후 배울 조건문에서 많이 사용한다!
		// 많이 어렵기 때문에 실제로 입으로 내뱉으며 제시를 하면 조금 더 수월할 것!
		
	}
	
	
	// and ($$) or (||) 최종 정리
	/*
	 *  && : 두 개의 조건이 모두 true여야 결과값이 true이다. (AND)
	 *  	true && true		=> true
	 *  	true && false		=> false
	 *  	false && true		=> false
	 *  	false && false		=> false
	 *  
	 * 		=> && 연산자를 기준으로 앞의 결과가 false값이 나온다면 뒤의 조건은 굳이 연산하지 않는다.
	 * 
	 * 
	 *  || : 두 개의 조건 중 하나라도 true면 결과값도 true이다. (OR)
	 *  	true || true		=> true
	 *  	true || false		=> true
	 *  	false || true		=> true
	 *  	false || false		=> false
	 *  
	 *  	=> || 연산자를 기준으로 앞의 결과가  true값이 나온다면 뒤의 조건은 굳이 연산하지 않는다.
	 *  
	 */
	
		//위의 정리가 맞는지 증명해보자!
	public void method4() {
		
		int num1 = 10;
		
		boolean result1 = (num1 <= 5) && (++num1 > 0);
		
		System.out.println("result1 : " + result1); // => false
		System.out.println("&& 연산 후 num1 : " + num1); // => 10
			// => &&연산에서 앞의 조건이 false이기 때문에 뒤의 조건은 연산하지 않았다.
			// => 그렇기 때문에 &&연산 후 num1의 값은 10이다!
			// 만약 앞의 조건이 true였다면 &&연산 후 num1의 값은 11일 것!
		
		
		int num2 = 10;
		
		boolean result2 = (num2 <20) || (++num2 > 0);
		
		System.out.println("result 2 : " + result2);
		System.out.println("|| 연산 후 num2 :" + num2);
			// => ||연산에서 앞의 조건이 true가 나왔기 때문에 뒤의 조건은 연산하지 않는다.
			// => 그렇기 때문에 ||연산 후 num2의 값은 10이다!
			// => 만약 앞의 조건이 false였다면 ||연산 후 num1의 값은 11일 것!
	
		// 연산자는 거의 다 배웠다! 마지막으로 삼항 연산자를 배워보자!
		
	}
	
}
