package com.kh.chap02.loop; //while문

import java.util.Scanner;

public class B_While {

	/*
	 * * while문
	 * 
	 * [표기법]
	 * 초기식
	 * while(조건식) { 
	 * 		반복적으로 실행할 코드;
	 * 		증감식;
	 * }
	 * 	위와 같이 while문을 for문 처럼 쓸 수 있다!
	 * 
	 * 초기식
	 * 조건식 --> true면 실행 --> 증감식
	 * 조건식 --> true면 실행 --> 증감식
	 * 조건식 --> false면 반복문 stop
	 * 
	 */
	
	// for문 예시 while문으로 변경해보는 식으로 수업 진행 (추후 while문 더 깊게 공부하자!)
	
	public void method1() {
		// "안녕하세요" 5번 출력
		
		/* for문 사용했을 시
		for(int i=1; i<=5; i++) {
			System.out.println("안녕하세요");
		}
		*/
		
		int i = 1; // => while문 전에 변수 선언 했기 때문에 method1에서 쓸 수 있다.
		while(i<=5) {
			System.out.println("안녕하세요");
			i++;
		}
		
		System.out.println(i); // => while문을 벗어나서도 변수값을 불러올수 있다!
		
		// 1 2 3 4 5 출력
		// int i = 1 => 위에 이미 있기 떄문에 오류!
		i = 1; // 위에서 최종 i값은 6이니 다시 1로 변경하자!
		
		while(i<=5) {
			System.out.print(i + " ");
			i++;
			
		}
	}
	
	public void method2() {
		// 1에서 10까지의 총 합계
		
		int sum = 0;
		
		int i = 1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("총 합계 : " + sum);
	}
	
	public void method3() {
		// 1부터 랜덤값(1~10사이) 까지의 총 합계
		int random = (int)(Math.random() * 10 + 1); // 더해지는 수 : 시작수, 곱해지는 수 : 총 몇개의 랜덤값인지. 
		
		int sum = 0;
		int i = 1;
		while(i<=random) {
			sum += i;
			i++;
		}
		System.out.println("1에서부터 " + random + "까지의 총 합계 : " + sum);
	}
	
	public void method4() {
		// 메뉴 관련
		Scanner sc = new Scanner(System.in);
		
		//-----------------------------------
		while(true) { // => 무한 반복 시키고 싶을 떄 == for(;true;)도 가능하다!
			System.out.println("\n==== 메뉴 ====");
			System.out.println("1. 안녕하세요 5번 출력");
			System.out.println("2. 1부터 10까지의 총 합계");
			System.out.println("3. 1부터 랜덤값까지의 총 합계");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 0: System.out.println("\n프로그램을 종료합니다."); return; //=> return : 메소드 자체를 빠져나간다.
			default : System.out.println("잘못입력했습니다. 다시 입력해주세요.");
			}
		}
		//------------------------------------
	}
		
		////////////////////
	/*
	 * * do-while문
	 * 
	 * [표현법]
	 * do{
	 * 		반복적으로 실행할 코드;
	 * 
	 * }while(조건식);
	 * 
	 * [do-while문을 반복적으로 수행하고 싶을 떄]
	 * 초기식;
	 * do{
	 * 		반복적으로 실행할 코드;
	 * 		증감식;
	 * }while(조건식);
	 * 
	 * [흐름]
	 * 초기식
	 *		무조건 코드 한 번 실행 --> 증감식
	 * 조건식 --> true면 실행 --> 증감식
	 * 조건식 --> true면 실행 --> 증감식
	 * 조건식 --> false면 빠져나감
	 * 
	 * while문과 다른 점은?
	 * while문은 처음 수행될 떄도 조건 검사 후 true여야 실행
	 * 단, do while문은 조건 검사 없이 무조건 한 번은 실행된다.
	 * 
	 */
	
	
	// do while문 예시
	public void method5() {
		// 애초에 조건이 맞지 않아도 반드시 한 번은 수행되는 do while문의 특징을 예시를 통해 알아보자!
		int num = 1;
		
		do {
			System.out.println(num);
			
		}while(num == 0); // num에 담긴 값이 0과 일치하는 동안에만 수행하라는 뜻
	}
	
	//
	public void method6() {
		// 1 2 3 4 5
		
		int i = 1; // for문처럼 반복시키기 위해 do while문 전에 먼저 변수 초기화
		
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=5);
	}
	
	//
	public void method7() {
		// 2단 출력하기
		// 2 x 1 = 2
		// 2 x 2 = 4
		// .....
		// 2 x 9 = 18
		
		System.out.println("=== 2단 ===");
		int su = 1;
		
		do {
			System.out.printf("2 x %d = %d\n", su, 2*su);
			su++;
		}while(su<=9);
	}
	
	// 반복문은 끝이 났다. 반복문과 같이 쓰이는 '분기문'을 공부해보자!
	
	
}
