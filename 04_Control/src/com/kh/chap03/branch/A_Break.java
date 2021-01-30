package com.kh.chap03.branch; // 제어문 - 분기문 - break

import java.util.Scanner;

public class A_Break {

	/*
	 * * break : break; 룰 만나는 순간 "가장 가까운 반복문"을 빠져나가는 구문
	 * 
	 * 주의할 점 : switch문 안의 break와는 다른 개념!
	 * 		    switch문 안의 break는 해당 switch문을 빠져나가는 용도일 뿐이다!
	 * 
	 */
	
	
	//분기문 break 예시. 랜덤값 활용. while문과 함꼐!
	public void method1() {
		// 매번 반복적으로 랜덤값(1~100)을 발생 시킨 후 출력
		// 단, 그 랜덤값이 홀수값일 경우 반복문을 빠져나가게끔 => 매번 반복적으로 짝수 랜덤값을 발생시킨 후 출력하겠다.
		
		// 먼저 랜덤값(1~100)을 발생 후 출력해보자!
		
		while(true) { // 일단 무한 반복을 시키고 그 후에 빠져나오도록 하자!
			
			int random = (int)(Math.random() * 100 + 1); // 더해지는 수 : 시작수, 곱해지는 수 : 총 몇개의 랜덤값인지. 
			System.out.println(random);
			
			if(random %2 == 1) {
				break; // => 분기문 break를 만나면 가장 가까운 반복문을 빠져나감.
			}
		}
		
		System.out.println("반복문 빠져나왔음"); // 반복문을 빠져나왔는지 확인하기 위해!
		
		/* 다양한 방법이 존재한다!
		 * while(true) { // 일단 무한 반복을 시키고 그 후에 빠져나오도록 하자!
			
			int random = (int)(Math.random() * 100 + 1); 
			
				if(random %2 == 1) {
				break; // => 분기문 break를 만나면 가장 가까운 반복문을 빠져나감.
				}
				System.out.println(random);
			}
				System.out.println("반복문 빠져나왔음");
		}
		 */
	}
	
	
	// 분기문 break 예시. while문과 함꼐!
	public void method2() {
		// 매번 사용자에게 문자열을 입력받은 후 해당 문자열의 길이 출력
		// 단, 사용자가 입력한 문자열이 "exit"과 일치할 경우 반복을 종료한다.
		// 반복횟수가 정해져있지 않으니 무한반복->break 사용하는게 편하다
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 기준 정하기 어려우니 일단 무한반복 출력하자.
			
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) { // 문자열과의 동등비교 .equals("비교하고자하는문자열")
				break; // => 먼저 걸러줘야 "break의 글자수 : 4"가 출력되지 않는다!
			}
			// xxxx의 글자수(길이) : xx
						System.out.println(str + "의 글자수(길이) : " + str.length());
		}
		
	}
	
	// 분기문 break 예시. 반복문 실습문제 2번
	public void method3() {
		// 매번 반복적으로 사용자에게 1 이상의 숫자를 입력 받은 후 1~사용자가 입력한 수 까지 출력
		// 단, 정상적인 수를 입력 했을 경우 1~사용자가 입력한 수 까지 출력 반복 종료
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { //우선 무한반복으로 돌리기
			
			System.out.print("1이상의 숫자를 입력 하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) { // 1_1. 잘 입력 했을 경우 => 1에서부터 사용자가 입력한 수 까지 출력받은 후 빠져나간다.
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
				break; // => while문 빠져나간다.  
				
			}else { // 1_2. 잘못 입력했을 경우 => "잘못입력했습니다. 다시 입력해주세요." 출력 후 다시 반복문 반복
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 분기문 break : 반복문 빠져나오는 구문!
	// 이제 분기분 continue를 배워보자!
	
	
}
