package com.kh.chap06_method.controller; // static 메소드

public class StaticMethodTest {

	// 1. 매개변수도 없고 반환값도 없는 메소드
	public static void method1() {
		System.out.println("매개변수도 없고 반환값도 없는 static 메소드");
		
	} 
	
	// 2. 매개변수는 없고 반환값은 있는 메소드
	public static String method2() {
		System.out.println("매개변수는 없지만 반환값은 있는 메소드");
		return "안녕하세요";
	}
	
	// 3. 매개변수는 있고 반환값은 없는 메소드
	public static void method3(String name, int age) {
		System.out.println(age + "살의 " + name + "님 환영합니다~!");
		
	}
	
	// 4. 매개변수도 있고 반환값도 있는 메소드
	public static int method4(int num1, int num2, char op) {
		
		int result = 0;
		
		if(op == '+') {
			result = num1 + num2;
			
		}else if(op == '-') {
			result = num1 - num2;
			
		}else if(op == '*' || op == 'x') {
			result = num1 * num2;
			
		}else if(op == '/') {
			result = num1 / num2;
			
		}
		
		return result;
	}
	
	
	// => static 메소드는 객체 생성 없이 사용 가능하다!
	
}
