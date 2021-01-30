package com.kh.chap01_Abstraction.model.vo;

/*
 * * 클래스의 구조
 * 
 * public class 클래스명 {
 * 
 * 		// 필드부
 * 
 * 		// 생성자부
 * 
 * 		// 메소드부
 * 
 * }
 */

// 학생을 추상화해서 만든 클래스
// 우선 이름, 나이 , 키 값을 보관하기 위한 class를 세팅해보자
public class Student {
	
	// 이름 값을 보관할 필드를 만들어보자
	// 필드부
	// 접근제한자 [예약여] 자료형 변수명; (예약어 생략가능, 메소드 영역안이 아닌 클래스 영역에 바로 변수 선언한다)
	
	// * 접근제한자 : 여기에 접근할 수 있는 범위를 제한 할 수 있음
	//			  (public > protected > default > private)
	
	public String name; // 선언만 해두고 나중에 원하는 값 담을 것.
	public int age;
	public double height;
	
	// 생성자부
	
	// 메소드부  
	


}
