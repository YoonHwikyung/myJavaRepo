package com.kh.operator; // 학습주제 : 증감연산자 (단항연산자 중 하나)

public class C_InDecrease {

	/*
	 *  * 증감연산자 (++, --)
	 *  ++ : 값을 1 증가 시키는 연산자
	 *  	 ++값 (전위증가 연산자), 값++ (후위증가 연산자)
	 *  
	 *  -- : 값을 1 감소 시키는 연산자
	 *  	 --값 (전위감소 연산자), 값-- (후위감소 연산자)
	 *  
	 * (증감연산자)값 : 전위 연산 => 선증감 후처리 (먼저 증가/감소 시키고 후에 처리)
	 * 값(증감연산자) : 후위 연산 => 선처리 후증감 (먼저 처리하고 후에 증가/감소 한다)
	 * 
	 */
	 // 이를 테스트 하기 위해 여러가지 메소드를 활용해보자
	
	public void method1() {
		
		// 전위 연산
		int a = 10; // => 메모리에 a라는 박스가 생기고 그 안에 10이라는 값이 담겼을 것
		int b = ++a; // a = a+1  ==> b = a
		
		 // a++;
		 // ++a;
		// a : xx, b : xx
		System.out.println("a : " + a + ", b : " + b);
		// 결과 => a : 11, b : 11 =이유=> 전위 연산 : 먼저 증감을 시키고, 그 후에 대입시키겠다.
		
		
		// 후위 연산
		int c = 10;
		int d = c++; // d = c => c = c + 1  == 후위 연산 : 대입 먼저 하고, 그 후에 증감시키겠다.
		
		// c : xx, d : xx ---> xx는 변수 값을 칭하는 것
		// 이번에는 printf 를 이용해보자!
		System.out.printf("c : %d, d: %d\n", c, d);
		// 결과 => c : 11, d: 10  =이유=> 후위 연산 : 대입 먼저 하고, 그 후에 증감시키겠다.
		
		System.out.println("==============="); // => 새로운 내용이라는 구분선을 위한 것
	
		int num = 20;
		
		System.out.println("현재 num : " + num);  // num=20
		System.out.println("++num : " + ++num); // num=21
		System.out.println("num++ : " + num++); // num=21(22) tip : 지금 당장은 21로 출력되지만 나중에는 22로 증가 시키겠다. (다음 값부터)
		System.out.println("--num : " + --num); // num=21
		System.out.println("num-- : " + num--); // num=21(20) tip : 지금 당장은 21로 출력되지만 나중에는 20으로 감소 시키겠다. (다음 값부터)
		System.out.println("최종 num : " + num);  // num=20
		
		
	}
	
	public void method2() {
		
		int num1 = 20;
		int result1 = num1++ * 3; // 20(21) * 3 = 60 / tip : 지금 당장은 20으로 계산 하겠지만 다음부터는 21로 증가 시키겠다.
								  // result1 = 60, num1은 나중에 21이 될 것
		
		System.out.println("num1 : " + num1); // num1=21
		System.out.println("result1 : " + result1); // result1=60
		
		int num2 = 20;
		int result2 = ++num2 *3; // 21 * 3
								 // result2 = 63, num2 = 21
		
		System.out.println("num2 : " + num2); // num2 : 21
		System.out.println("result2 : " + result2); // result2 : 63
		
		
	}
	
	public void method3() { // 위의 증감연산자를 혼자서 연습해보는 시간
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // a=10(11)	=> 10 출력 (지금 당장 출력되는건 10이겠지만 그 다음에 a값은 11로 증가시킬거야.)
		
		System.out.println((++a) + (b++)); // a=12, b=20(21)	=> 32 출력
		
		System.out.println((a++) + (--b) + (--c)); // a=12(13), b=20, c=29	=> 61 출력
		
		System.out.println("a : " + a); // a : 13
		System.out.println("b : " + b); // b : 20
		System.out.println("c : " + c); // c : 29
		
		// 2씩, 10씩 증가시켜야 하는 경우도 있을 것이다. 이제 그것을 배워보자. (새로운 클래스에서!)
	
		
	}
	
	
}
