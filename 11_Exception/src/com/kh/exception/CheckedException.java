package com.kh.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 무조건 예외처리구문으로 처리해야하는 경우
public class CheckedException {

	/*
	 * CheckedException : 반드시 예외처리를 해줘야 하는 예외들
	 * 언제, 어디서 예외가 발생될 지 예측 블가하기 때문에 미리 예외처리 구문을 작성해둬야함!
	 * 주로 외부 매개체와 입출력을 할 때 발생
	 * 
	 */
	
	
	public void method1() throws IOException {
		
		/*
		try {
			method2();
		}catch(IOException e) {
			System.out.println("예외발생!!");
		}
		*/
		
		method2();
		
	}
	
	public void method2() throws IOException {
		
		// Scanner sc = new Scnanner(System.in);
		
		// 키보드로 값 입력 받는 방법 BufferedReader 를 이용해서도 가능!!
		// 단, 문자열로만 가능
		// 이때 반드시 예외처리를 해야만 하는 경우가 생긴다!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* 예외처리 방법 1. try~catch문 : 이 자리에서 바로 예외 발생시 잡아서 처리하겠다
		System.out.print("아무 문자열을 입력해주세요  :");
		try {
			String str = br.readLine(); // 이 메소드 실행시 IOException이 발생할 수도 있음!
										// 컴파일 에러로 알려줌! => 반드시 예외처리(예외발생시 실행할 내용 정의)해야 함!
			System.out.println(str);
		}catch(IOException e) {
			System.out.println("예외발생!!");
		}
		*/
		
		
		// * 예외처리 방법 2. throws : 떠넘기는 방법(위임하는 방법)
		//						    지금 여기서 당장 예외처리를 하지 않고 이 메소드를 호출한 곳으로 예외처리를 떠넘기겠다!!
		String str = br.readLine();
		System.out.println(str);
		
		
		
		System.out.println("프로그램이 종료되었습니다.");
		
	}
	
	
	/*
	 * 						예외발생 시점			예외처리
	 * RuntimeException		런타임에러(컴파일에러x)	세모	  => 개발자 마음(조건문/예외처리)	unCheckedException
	 * RuntimeException 외	컴파일에러				필수	  => 반드시 예외처리			    CheckedException
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
}
