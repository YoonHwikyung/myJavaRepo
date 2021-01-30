package com.kh.chap06_method.controller; // 메소드

import java.util.Scanner;

import com.kh.chap05_constructor.model.vo.User;

public class NonStaticMethodTest {

	/*
	 * * 메소드
	 * <표현법>
	 * 접근제한자 [예약어] 반환할값의자료형 메소드명([매개변수, 매개변수, ...]) {
	 * 		메소드 실행(호출)시 실행할 코드;
	 * 		...
	 * 		[return 반환값;]
	 * }
	 */ 
	
	// 여러가지 메소드를 생성해 공부해보자!
	
	// 1. 매개변수도 없고 반환값도 없는 메소드 
	public void method1() {
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드");
		
		//return; // 사실상 모든 메소드에 return이 있음 (JVM이 자동으로 생성해줌)
				  // 단, 반환값이 있는 메소드인 경우 return 결과값; 구문을 명시적으로 써야함!
	}
	
	// 2. 매개변수는 없고 반환값은 있는 메소드
	public String method2() {
		
		System.out.println("매개변수는 없지만 반환값은 있는 메소드");
		
		// 사용자가 입력한 이름을 돌려주자
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		
		//String name = sc.nextLine();
		//return name;
		return sc.nextLine();
		
	}
	
	// 3. 매개변수는 있고 반환값은 없는 메소드
	public void method3(String name, int age) {
		
	
		System.out.println("매개변수는 있지만 반환값은 없는 메소드");
		System.out.printf("%s님의 나이는 %d살입니다.\n", name, age);
	}
	
	// 4. 매개변수도 있고 반환값도 있는 메소드
	public int method4(int num1, int num2) {
		
		System.out.println("매개변수와 반환값 둘 다 있는 메소드");
		return num1 + num2;
	}
	
	
	// ** 추가 **
	// 매개변수로 객체도 전달 받을 수 있다!
	public void method5(User a) { // User a = u; // import 해줘야 함
		a.setAge(20); // 
	
	}
	
	// 앞으로 배울 것 
	// 오버 로딩
	// 한 클래스 내에 동일한 메소드명 사용할 수 있다.
	
	
}
