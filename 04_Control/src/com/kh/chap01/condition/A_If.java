package com.kh.chap01.condition; // 학습주제 : 제어문 - 조건문 - if 단독문

import java.util.Scanner;

public class A_If {
	
	/*
	 * 프로그램은 기본적으로 위에서 아래로 순차적으로 진행
	 * 단, 이 순차적인 흐름을 바꾸고자 할 떄 "제어문"을 통해 제어할 수 있음
	 * 
	 * 선택적으로 실행 => 조건문
	 * 반복적으로 실행 => 반복문
	 * 그 외의 흐름 제어 => 분기문
	 * 
	 *  * 조건문
	 *  "조건식"을 통해 참이냐 거짓이냐를 판단해서 해당 조건이 만족하는 경우 그에 해당하는 실행문을 실행하고자 할 떄 쓰인다.
	 *  
	 *  => 조건식의 결과는 true/false
	 *  => 보통 조건식에서는 비교연산자(대소, 동등) / 논리연산자(&&, ||) 를 사용한다.
	 *  
	 *  조건문은 크게 if문 / switch문 으로 나뉜다.
	 *  
	 *  if문에서는 다시 3가지로 나뉨
	 *   1. 단독 if문
	 *   2. if-else문
	 *   3. if-else-if문
	 *  
	 *  
	 *  * 단독 if문
	 *  
	 *  실행할 코드;
	 *  실행할 코드;
	 *  
	 *  if(조건식) {
	 *  		실행할 코드;
	 *  		실행할 코드;
	 *  }
	 *   
	 *   => 조건식의 결과가 참(true)면 중괄호 안의 코드가 실행된다.
	 *   => 조건식의 결과가 거짓(false)면 중괄호 안의 코드는 무시하고 넘어간다.
	 *  
	 */
	
	
	// [단독 if문 연습 1]
	// 예시를 통해 단독 if문을 연습해보자!
	public void method1() {
		
		// 연산자 실습문제 1. 사용자가 입력한 정수값이 양수인지 아닌지 판별 후 "양수다" / "양수가 아니다"
		// 연산자 실습문제2. 사용자가 입력한 정수값이 양수인지, 0인지, 음수인지 정확히 판별 후 "양수다" / "0이다" / "음수다"
		
		// 12/21 실습문제를 이용해 if문을 공부해보자!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");	// 유도
		int num = sc.nextInt();		// 변수 
		
	
		
		if(num > 0) { 
			System.out.println("양수다");			// 이 코드를 바로 실행시키는 것이 아니라, if문을 이용해 조건이 true일 떄 실행하도록 한 것
		}
		
	
		/*
		if(num <= 0) {
			System.out.println("양수가 아니다");		// 이 코드는 if문의 조건이 false일 경우 실행되도록 설정한 것
		}
		*/
		
		
		if(num == 0) {
			System.out.println("0이다");
		}
		
		
		if(num < 0) {
			System.out.println("음수다");
		}
		
	}

	
	
	// [단독 if문 연습 2]
	public void method2() {
		
		// 연산자 실습문제 3.
		// 사용자가 입력한 정수 값이 짝수인지 홀수인지 판별 후 출력	하는 것을 조건문을 이용해서 출력해보자!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {	//짝수입니까? true면 아래 코드 실행, false면 아래 코드 무시하고 넘어감
			System.out.println("입력한 숫자는 짝수입니다.");
		}
		
		if(num %2 == 1) {	//홀수입니까? true면 아래 코드 실행, false면 아래 코드 무시하고 넘어감
			System.out.println("입력한 숫자는 홀수입니다.");
		}
		
	}
	
	
	
	// [단독 if문 연습 3. + 결과값을 담기 위한 변수를 미리 만들어 두는 방법!]
	public void method3() {
		
		// 연산자 실습문제 6.
		// 사용자가 입력한 나이값을 가지고 어린이/청소년/성인 으로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이(정수만) : ");
		int age = sc.nextInt();
		
		// 어린이(13세 이하), 청소년(13세 초과 ~ 19세 이하), 성인(19세 초과)
		
		String result = ""; // 결과값을 담기 위한 변수를 만들어 둠! (아무런 값이나 초기화도 해둠!)
		// 결과값을 담기 위한 변수를 만들어 두고, 순서대로 각각의 if 조건문이 true라면 그 결과값이 변수에 담기게 될 것!!
		
		
		if(age >= 0 && age <= 13) {	// 나이에 -10을 입력했을 때에도 "어린이"라고 나오는 결과를 방지하기 위해!
			result = "어린이";
		}
		    
		if(age > 13 && age <=19) {	// 논리 연산자 : 둘 다 만족
			result = "청소년";
		}
		
		if(age > 19) {
			result = "성인";
		}
		
		System.out.println(result);
		
	}
	
	// [단독 if문 연습 4]
	public void method4() {
		// 연산자 실습문제 8.
		// 사용자에게 입력 받은 주민번호를 가지고 남자/여자 판별 후 출력
		
		// 1. 사용자에게 주민번호 입력 받기 => ex) "928492-2284877"
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력(- 포함) : ");
		String personId = sc.nextLine();	// personId에 "928492-2284877" 담겨 있을 것
		
		// 2. 입력 받은 주민번호로 부터 성별에 해당하는 문자 하나만 뽑아놓기 ( 7번 째 인덱스 ) => ex) '2'
		char ch = personId.charAt(7);		// ch에 '2'가 담겨 있을 것
		
		
		// 3. 문자가 '1'또는 '3'일 경우 => 남자 출력
		if(ch == '1' || ch == '3') {
			System.out.println("남자");
		}
		
		//    문자가 '2'또는 '4'일 경우 => 여자 출력
		if(ch == '2' || ch == '4') {
			System.out.println("여자");
		}
		
		//	    문자가 '1', '2', '3', '4' 모두 아닐 경우 => 잘못입력했습니다 출력
		if(ch != '1' && ch != '2' && ch != '3' && ch != '4') {
			System.out.println("잘못입력하셨습니다");		// => if-else문을 배우면 더욱 간결해질 것!
		}
		

	}
	
	
	// 다음 클래스에서 if-else문을 배워보자!
	

	
	
	
	
}
