package com.kh.chap03.branch; // 분기문 : continue

public class B_Continue {

	/*
	 *  continue : 반복문 안에서 사용하는 구문
	 *  		   continue;를 만나게 되면 그 뒤에 어떤 구문이 있든간에 실행하지 않고
	 *  		      가장 가까운 반복문으로 올라가라는 것을 의미한다.
	 *  
	 */
	
	// continue 예시
	public void method1() {
		// 1부터 10까지 홀수만을 출력
		
		/*
		// * 기존 방법을 먼저 해보자
		for(int i=1; i<=10; i++) { // 반복횟수 10회
			if(i %2 == 1) {
				System.out.print(i +" ");
			}
		}
		*/
		
		for(int i=1; i<=10; i++) {
			
			// i가 짝수일 경우 => 뒤쪽 출력문 실행하지 않고, 반복문 위로 바로 올라가보자!
			if(i %2 ==0) {
				continue; // i가 짝수일 경우 바로 반복문 위로 올라간다! 빠져나가는 것x
			}
			
			System.out.print(i + " ");
		}
	}
	
	// continue 예시. 총합 구하기
	public void method2() {
		// 1부터 100까지의 총 합계
		
		/*
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("총 합계 : " + sum);
		*/
		
		// 1부터 100까지의 총 합계
		// 단, 6의 배수는 빼고 덧셈 연산
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			
			if(i %6 == 0) { // 6의 배수일 경우 무시하자
				continue;
			}
			sum += i;
		}
		
		System.out.println("총 합계 : " + sum);
	}
	
	public void method3() {
		// 2단 ~ 9단 다 출력 하되
		// 단, 4의 배수 단은 빼고 출력하시오. (4단, 8단은 빼고 출력하자)
		
		// 바깥쪽 for문 => 단을 지정(2단 ~ 9단)
		// 안쪽 for문 => 매 단마다 반복적으로 곱해지는 수 (1~9)
		
		int dan = 2;
		
		for(dan=2; dan<=9; dan++) {
			if(dan %4 == 0) {
				continue;
			}
			System.out.println("=== " + dan + "단 ===");
		
			for(int su=1; su<=9; su++) {
				System.out.printf("%d x %d = %d\n", dan, su, dan*su);
			}
			System.out.println(); //  가독성을 위해 단 끝나고 한 줄 띄우기 위함
		}
		
		
	}
	
	
	
	
	
}
