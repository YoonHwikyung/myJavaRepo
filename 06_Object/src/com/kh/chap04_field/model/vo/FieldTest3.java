package com.kh.chap04_field.model.vo; //클래스 변수

// 클래스변수(static변수) 테스트 하기위한 클래스
// 전역 변수 중 하나
public class FieldTest3 {

	// 접근제한자[예약어] 자료형 변수명;
	
	// 전역변수의 일종인 클래스변수 => static 예약어가 붙은 변수
	public static String sta = "FieldTest3의 static변수";
	// 생성시점 : 프로그램 실행과 동시에 메모리(static 영역)에 생성됨! (굳이 객체 생성 하지 않아도!)
	// 소멸시점 : 프로그램 종료시 소멸됨
	
	// static 공유의 개념이 강함!!
	// 프로그램 실행과 동시에 메모리에 올려놓고 공유해서 쓰자 라는 것임!
	
	
	
	
	/*
	 * 상수 필드
	 * public static final 자료형 변수명;
	 * public final static 자료형 변수명;
	 * 			ㄴ예약어끼리는 순서 바꿔도 상관없음!
	 * 
	 * static - 공유의 개념
	 * final  - 상수의 개념. 한 번 지정된 값 변경 x
	 * 
	 * 프로그램 실행과 동시에 값이 변경되서는 안되는 고정적인 값을 메모리 상에 올려두고
	 * 공유하면서 사용할 목적으로 사용됨!
	 * 
	 */
	
	public static final int NUM = 10; // 상수필드는 무조건 초기화 해줘야함!
	
}
