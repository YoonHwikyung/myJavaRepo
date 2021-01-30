package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap05_constructor.model.vo.User;
import com.kh.chap06_method.controller.NonStaticMethodTest;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethodTest;

public class MethodRun {

	public static void main(String[] args) {
		/*
	NonStaticMethodTest ns = new NonStaticMethodTest();
	
	// 1. 매개변수와 반환값이 없는 메소드 호출
	ns.method1();
	
	// 2. 매개변수는 없지만 반환값은 있는 메소드 호출
	//String name = ns.method2(); // 메소드2를 통해 돌아오는 결과값을 name이라는 변수에 담을 수 있다.
	//System.out.println(name + "님 환영합니다^:^");
	//System.out.println(ns.method2() + "님 환영합니다^:^");
	
	// 3. 매개변수는 있고 반환값은 없는 메소드 호출
	ns.method3("메이버스", 2);
	// String str = ns.method3("메이버스", 2); => 반환값이 없기 떄문에 오류!
	
	// 4. 매개변수와 반환값 둘 다 있는 메소드 호출
	int result = ns.method4(10, 20); // 이렇게만 하면 결과값이 명시적으로 보이진 않으나 값이 반환되기는 했을 것. 출력해서 확인가능
	System.out.println("10 + 20 = " + result);
	// System.out.println("10 + 20 = " + ns.method4(10,20)); 도 같은 결과를 나타낸다
	
	
	
	// ** 추가 **
	// 매개변수로 객체를 전달할 수 있다. (객체의 주소갑을 전달 할 수 있다. (얕은 복사처럼))
	
	// User 객체 생성 ( chap05에서 만들어둔 vo클래스 이용)
	User u = new User("user01", "pass01", "홍길동");
	System.out.println(u.information());
	
	ns.method5(u);
	
	System.out.println(u.information());
	*/
		
		/////////////////////////////////////////////////////////////
		
		// 객체 생성(new) 하지 않아도 호출 가능한 static 메소드
		// 물론 import는 필요하다!
		StaticMethodTest.method1();
		
		//String str = StaticMethodTest.method2();
		// str이라는 변수에 메소드2를 호출해서 반환된 값을 담아야지
		//System.out.println(str);
		System.out.println(StaticMethodTest.method2());
		
		System.out.println(Math.random()); // => Math클래스도 위와 같이 static 메소드이기 때문에 따로 객체 생성하지 않고 바로 쓸 수 있었던  것!!!
		
		// 3. 매개변수는 있고 변환값은 없는 스태틱  메소드 호출
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		StaticMethodTest.method3(name, age);
		
		
		// 4. 매개변수도 있고 반환값도 있는 스태틱 메소드 호출
		int result = StaticMethodTest.method4(20, 10, 'x');
		System.out.println("결과 : " + result);
		
		
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(5, "ㅎㅎㅎ");
		ot.test("ㅋㅋ", 7);
		ot.test(2, 3);
		
		// 자바에서 이미 정의 되어있는 오버로딩 대표적인 예
		// 출력문
		System.out.println("안녕");
		System.out.println(10);
		System.out.println(1.54);
		
	}

}
