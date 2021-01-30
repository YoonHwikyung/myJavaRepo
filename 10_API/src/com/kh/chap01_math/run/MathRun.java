package com.kh.chap01_math.run;

// import java.lang.*;
// 알게모르게 모든 패키지에는 java.lang.* 이 import 되어있다.
// java.lang과 관련된 것들은 굳이 import 하지 않아도 된다! (보이지는 않지만 이미 되어있음!)
// ex. Object, String, Math, ... ,


public class MathRun {

	public static void main(String[] args) {

		// Math 클래스(수학 관련)에서 제공하고 있는 유용한 기능들을 살펴보자
		
		// 파이 => 상수필드
		System.out.println("파이 : " + Math.PI);
		
		// 올림 : Math.ceil(double) : double
		//							ㄴ : double형으로 돌려준다는 뜻
		// ceil이라는 메소드 자체가 퍼블릭으로 정의되어있기 때문에 .으로 접근 가능!
		double num1 = 4.349;
		System.out.println("올림 : " + Math.ceil(num1));
		System.out.println("올림 : " + (int)Math.ceil(num1));
		
		
		// 반올림 => Math.round(double) : long
		System.out.println("반올림 : " + Math.round(num1));
		
		// 버림 => Math.floor(double) : double
		System.out.println("버림 : " + Math.floor(num1));
		
		// 절대값 => Math.abs(int) : int (오버로딩 되어있음)
		int num2 = -10;
		System.out.println("절대값 : " + Math.abs(num2));
		
		// 최소값 => Math.min(int, int) : int
		System.out.println("최소값 : " + Math.min(5, 10));
		
		// 최대값 => Math.max(int, int) : int
		System.out.println("최대값 : " + Math.max(5, 10));
		
		// 제곱근(루트) => Math.sqrt(double) : double (int 값을 넣어도 작은 값이 큰 값으로 들어가기 때문에 자동 형변환이 된다)
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		System.out.println("10의 제곱근 : " + (int)Math.sqrt(10));
		
		// 제곱
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
		
		// Math m = new Math(); -> 불가능!
		
		/*
		 *  * java.lang.Math 특징
		 *  모든 필드 => 상수필드
		 *  모든 메소드 =? static 메소드
		 *  
		 *  모든게 다 static이기 때문에 Math.로 접근 가능(객체 생성할 필요x)
		 *  => 생성자 private == 생성불가
		 *  
		 *  프로그램 실행과 동시에 메모리 영역에 올려놓고 재사용하는 개념 == 싱글톤 패턴
		 *  
		 */
		
		
		
	}

}
