package com.kh.operator; // 학습주제 : 삼항연산자

import java.util.Scanner;

public class G_Triple {

	/*
	 * * 삼항 연산자 : 3개의 항목을 가지고 연산하는 연산자
	 * 		             ㄱ ?와 :를 구분으로 세 가지 조건으로 연산
	 * [표현식] 조건식 ? 조건식이 참일 경우의 결과값 : 조건식이 거짓일 경우의 결과값
	 * 
	 */
	// 사용자가 입력한 정수를 사용해 삼항 연산자를 연습해보자!
	
	
	// (예시 1)
	public void method1() {
		// 사용자에게 입력받은 정수값이 양수인지 아닌지 판별 후 그에 해당하는 결과값 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력: ");
		int num = sc.nextInt();
		
		/*
		// 조건식 ? 참일 경우의 결과값 : 거짓일 경우의 결과값
		// (num > 0) ? "양수이다" : "양수가 아니다"; ==> 이 문자열 결과를 담아두자! 가독성을 위해!
		String result = (num > 0) ? "양수이다" : "양수가 아니다";	
		// xx은(는) xxxx : 라는 결과를 내고 싶다!
		System.out.println(num + "은(는) " + result);
		*/
		
		System.out.println(num + "은(는) " + (num > 0  ? "양수이다" : "양수가 아니다"));
		// 위와 같이 결과값을 변수에 넣어두지 않고 바로 ()안에 넣어서 결과를 도출 할 수 있다.
		// 그러나 가독성을 위해 변수에 담아두고 사용하는 것 권장
	
			
	}
	
	// (예시 2)
	public void method2() {
		
		// 사용자가 입력한 정수값이 짝수인지 아닌지 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		// (num %2 == 0) ? "짝수다" "홀수다"; // => 이 값을 바로 출력하지 않고 변수를 사용하려면
		String result = (num %2 == 0) ? "짝수다" : "홀수다"; 
		System.out.println(num + "은(는) " + result);
		
		
	}
	
	// (예시 3) 논리 연산과 함꼐!
	public void method3() {
		
		// 사용자가 입력한 영문자가 "대문자인지 아닌지" 판별한 후 출력 -> 대문자입니까? 대문자가 아닙니까?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 입력 : "); // 입력자에게 답을 유도하는 것
		char ch = sc.nextLine().charAt(0);
		
		// 어떻게 대문자/소문자를 구별하는가
		// => 아스키 코드표로 각각의 문자마다 고유의 숫자를 가지고 있다. 이를 이용해서 대소비교가 가능하다.
		
		String result = (ch >= 'A' && ch <= 'Z') ? "대문자이다" : "대문자가 아니다";
		
		System.out.println(ch + "은(는) " + result);
		
		
		
	}
	
	// (예시 4) 삼항 연산자 중첩 사용. 삼항 연산자 안에 또 다른 삼항 연산자를 쓰는 것. 세 가지 결과를 도출
	public void method4() {
		// 삼항 연산자 중첩 사용
		
		// 사용자가 입력한 정수 값이 양수인지, 음수인지, 0인지 정확히 판별 후 출력 해보자! (보다 정확하게!)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0 ? "양수이다" : (num == 0 ? "0이다" : "음수이다"));
							//=> 양수면 "양수이다"라고 출력 후 끝나지만, 첫 번째 조건이 false이면 삼항연산자가 시작 된다!
		System.out.println(num + "은(는) " + result);
			
		
	}
	
	// (예시 5) 삼항 연산자 중첩 사용2
	
	public void method5() {
		// 두 정수 값과 + 또는 -의 문자를 하나 입력받아
		// +일 경우 두 정수 값의 덧셈 연산 결과를,
		// -일 경우 두 정수 값의 뺄셈 연산의 결과를,
		// 잘못 입력했을 경우에는 "잘못입력했습니다"라는 결과를 도출해보자
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();	// =>허공에 남아있는 엔터를 제거하기 위함
		
		System.out.print("연산자 입력(+ or -) : " );
		char op = sc.nextLine().charAt(0);
		
		String result = op == '+' ? num1 + num2 + "": (op == '-' ? num1 -num2 + "" : "잘못입력했습니다");
			// -> 문자와 문자열이 같이 담겨져 있다. 한 종류로 합쳐야 변수로 저장이 가능하다.
			// 그렇기 때문에 먼저 숫자 연산 후 문자열화 하는 +""를 넣어서 String으로 넣을수 있다!
				
				
		System.out.println("결과 : " + result);
		
		
		
	}
	
	
}
