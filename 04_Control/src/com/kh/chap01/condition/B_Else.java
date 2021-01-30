package com.kh.chap01.condition; // 학습주제 : 제어문 - 조건문 - if-else문

import java.util.Scanner;

public class B_Else {

	/*
	 * * if-else 문
	 * 
	 * if(조건식) {
	 * 		실행 코드1; if의 조건식이 true일 경우
	 * }else {
	 * 		실행 코드2; if의 조건식이 false이 경우
	 * }
	 * 
	 * 조건식의 결과가 true일 경우 실행코드1만을 수행하고 if-else문 자체를 빠져나감
	 * 단, 조건식이 false일 경우 무조건 실행코드2를 수행함
	 * 
	 * 
	 * * if-else if문
	 * 같은 비교 대상으로 여러개의 조건을 제시할 경우
	 * 
	 * if(조건식1) {
	 * 		실행코드1;
	 * }else if(조건식2) {
	 * 		실행코드2;
	 * }else if(조건식3) {
	 * 		실행 코드3;
	 * }[else {
	 * 		위의 조건들이 다 false일 경우 반드시 실행할 코드;
	 * }] ==> [생략 가능]
	 * 
	 * 조건식 1의 결과가 true일 경우 => 실행코드1만을 실행하고 코드 세트 자체를 빠져나감
	 * 단, false일 경우  => 조건식 2 실행
	 * 조건식 2의 결과가 true일 경우 => 실행코드2만을 실행하고 코드 세트 자체를 빠져나감
	 * 단, false일 경우 => 조건식 3 실행
	 * .....
	 * 마지막에 else문이 제시되어있을 경우 위의 조건들이 다 false일 경우 무조건 else구문 실행
	 * 
	 */
	
	//예시를 통해 어떤 상황에서 if-else / if-else if를 활용할지 공부해보자!
	
	// 예시1) ef-else 를 사용해야하는 경우
	public void method1() {
		
		// 사용자가 입력한 정수 값이 짝수/홀수 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.println("짝수입니다."); // 조건식1이 true라면 "짝수입니다." false라면 "홀수입니다."
		}else {
			System.out.println("홀수입니다.");
		}
		
	}
	
	// 예시2) if-else if 를 사용해야하는 경우
	public void method2() {
		
		// 사용자가 입력한 정수 값이 양수/0/음수인지 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}else if(num == 0){
			System.out.println("0이다");
		}else {
			System.out.println("음수다");
		} 
		
	}
	
	// if-else if 중첩사용
	public void method3() {
		
		// 어린이 / 청소년  /어른
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이(정수만) : ");
		int age = sc.nextInt();
		
		// 어린이(0이상 13이하) / 청소년(13초과 19이하) / 성인(19초과)
		
		/*
		if(age >= 0 && age <= 13) {
			System.out.println("어린이");
		}else if(age > 13 && age <= 19) {
			System.out.println("청소년");
		}else if(age > 19) {
			System.out.println("성인");
			// => 마지막을 else로 했을 경우 : -10을 입력을 했어도 "성인"으로 뜸. 그렇기 때문에 else가 아닌 else if로 정확한 조건을 작성!
			// => else로 꼭 마무리를 해야하는 것은 아니다!
		}else {
			System.out.println("잘못입력하셨습니다");
		}
		*/
		
		// 위와 같은 결과를 도출하지만 if-else if [중첩사용] 해보자!
		if(age < 0) { // 나이값을 입력해야 하는데 음수를 입력했을 경우=>잘못 입력했을 경우
			System.out.println("잘못입력하셨습니다.");
		}else { // 잘 입력했을 경우 => 0 이상의 값을 잘 입력한 경우
			
			if(age <= 13) { // 이미 0 이상 값을 잘 입력했기 때문에 넘어온 단계 : 조건문에 age >=0 쓰지 않아도 된다.
				System.out.println("어린이");
			}else if(age <= 19) { //이미 위에서 age가 13초과여서 넘어왔기 때문에 age > 13 쓰지 않아도 된다.
				System.out.println("청소년");
			}else { // 위에서 이미 0이상 값을 잘 입력해서 온 단계이기 때문에 else로 마무리해도 오류를 범할 가능성이 없다!
				System.out.println("성인");
			}
			// == > 이미 제시되어 있던 것은 불필요한 것은 쓸 필요가 없다!
		}
		
	}
	
	// if-else if 중첩사용 연습문제
	public void method4() {
		
		// 사용자에게 점수를 입력 받아
		// 점수별로 등급을 나눠 출력
		
		// 90점 이상일 경우 "A등급"
		// 90점 미만, 80점 이상일 경우 "B등급"
		// 80점 미만, 70점 이상일 경우 "C등급"
		// 70점 미만, 60점 이상일 경우 "D등급"
		// 60점 미만일 경우, "F등급"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		String grade = ""; // => 결과값을 담을 변수
		
		if(score >= 90) {
			grade = "A등급";
		}else if(score >= 80) {
			grade = "B등급";
		}else if(score >= 70) {
			grade = "C등급";
		}else if(score >= 60) {
			grade = "D등급";
		}else {
			grade = "F등급";
		}
		
		// 당신의 점수는 xx점이고, 등급은 xxx입니다.
		System.out.println("당신의 점수는 " + score +"점이고, 등급은 " + grade + "입니다.");
		
		/*if(score < 0 || score > 100) {
			System.out.println("잘못입력하셨습니다.");
			
			else {
				
				if(score >= 90) {
					System.out.println("A등급");
				}else if(score >= 80) {
					System.out.println("B등급");
				}else if(score >= 70) {
					System.out.println("C등급");
				}else if(score >=60) {
					System.out.println("D등급");
				}else {
					System.out.println("F등급");
				}
			}
		}
		*/
		
	}
	
	 // is else 연습 (문자열 동등비교)
	public void method5() {
		
		// 사용자에게 이름을 입력 받은 후 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		
		// 그 이름이 "윤휘경"이라는 문자열과 일치할 경우 => "본인입니다."
		//						    일치하지 않을 경우 => "본인이 아닙니다. 돌아가주세요."
		
		/*
		
		if(name == "윤휘경") {
			System.out.println("본인입니다. 어서오세요.");
		}else {
			System.out.println("본인이 아닙니다. 돌아가주세요."); // string 변수에 담아서 결과 오류!
		}
		*/
		
		// 기본자료형들 끼리 동등비교(==, !=) 잘 수행이 된다.
		// 단, String 기본 자료형이 아닌 참조 자료형(종특)임!! => 동등비교연산자가 제대로 수행되지 않음!!
		// => 문자열 간의 동등비교를 하려면, equals(비교하고자하는문자열) 메소드를 이용해야 한다!
		
		// [사용법] 변수.equals("비교하고자하는문자열")
		if(name.equals("윤휘경")) {
			System.out.println("본인입니다. 어서오세요.");
		}else {
			System.out.println("본인이 아닙니다. 돌아가주세요.");
		}
	
	}
	
	
}
