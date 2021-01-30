package com.kh.variable; // 학습내용 : 출력문 중 마지막 printf

public class E_Printf {

	public void printfMethod() {
		
		/*
		 * [이전에 배웠던 println, print]
		 * System.out.println(출력하고자하는값); => 값 출력 후 한 줄 띄어쓰기
		 * System.out.print(출력하고자하는값); => 값을 출력만 하고 끝
		 * 
		 * [printf]
		 * System.out.printf("출력하고자하는형식(포멧)", 순서대로 출력하고자하는 값, 값, 값, ...);
		 * => 포멧(형식)에 맞춰서 값들이 출력만 하고 끝
		 * 
		 * -공간을 확보할 때 쓰이는 문구-
		 * %d : 정수
		 * %f : 실수
		 * %c : 문자(한글자)
		 * %s : 문자열
		 * 
		 */
		
		// 적용시켜 보기 위해 세팅을 해보자! int 변수에 숫자를 담아두고 printf를 사용해보자!
		int iNum1 = 10;
		int iNum2 = 20;
		
		// xx, xx (출력하고자 하는 형식)
		// 이전 방법으로 해보자! (println 사용해보자!)
		System.out.println(iNum1 + ", " + iNum2);
		// printf 를 사용해보자!
		//System.out.printf("%d, %d", iNum1, iNum2);
		//줄바꿈 원하는 
		System.out.printf("%d, %d\n", iNum1, iNum2);
		
		// xx + xx = xxx(출력하고자 하는 형식)
		// 이전 방법으로 해보자! (println 사용해보자!)
		System.out.println(iNum1 + " + " + iNum2 + " = " +(iNum1 + iNum2));
		// printf 를 사용해보자!
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2);
		
		System.out.printf("%5d\n", iNum1);
						//5칸을 띄우고 그 공간 중  오른쪽 정렬
		System.out.printf("%-5d\n", iNum1);
						//5칸을 띄우고 그 공간 중 왼쪽 정렬
		
		double dNum = 4.57;
		
		System.out.printf("%f\n", dNum); //%f - 소수점 아래 6째 자리까지 보여줌!
		System.out.printf("%.1f\n", dNum); // %.1f - 소수점아래 첫 째 자리 까지 보여줌! (반올림)
		System.out.printf("%.2f\n", dNum); // %.2f - 소수점아래 둘 째자리 까지 보여줌!
											// 소수점 아래 몇 쨰 자리까지 나오게 할지 지정(반올림)
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n", ch, str); // 공간 두 개 확보, 두 개의 값 제시한 것
		System.out.printf("%C %S\n", ch, str); // %C, %S 대문자로도 출력 가능하다.	
				
		
		// xx살 xxx님 반갑습니다!
		//System.out.printf("%d살  %s\n", iNum1, "휘경씨 반갑습니다");
		
		// xxxx년에 꼭 뉴질랜드를 가길 바래요!
		//System.out.printf("%s %d년 %s\n", "휘경씨! ", 2021, "에 뉴질랜드를 꼭 가길 바래요!");
		
		
	} 
	

	
	
}
