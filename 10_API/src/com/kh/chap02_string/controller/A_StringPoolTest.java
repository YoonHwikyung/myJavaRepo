package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	// String은 불변 클래스 => 수정하는 순간 기존의 값이 담겨있던 공간에서 수정되지 않는다.
	
	// 1. 생성자를 통해 문자열 담기
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2); // 결과 : false(주소값 비교이기 때문)
		
		System.out.println(str1);
		System.out.println(str2/*.toString()*/);
		// toString() => String 클래스에 이미 오버라이딩 되어있음 (실제 담겨있는 문자열 반환)
		
		System.out.println(str1.equals(str2));
		// Object 클래스의 equals 메소드는 주소값 간의 비교 이기 때문에 원래는 false가 나와야 함
		// 하지만, String 클래스에 이미 equals()메소드가 오버라이딩 되어있다! (문자열 비교가 되도록)
		// 그렇기 때문에, 주소값 비교가 아닌 실제 담긴 문자열간 비교가 이루어진다!
		
		// 나는 주소값을 나타내고 싶은데? 그럼 해쉬코드를 보면 되겠다!
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// ? 두 개의 해쉬코드 값이 같게 나와..
		// Obeject클래스의 해쉬코드 메소드를 String 클래스가 또 오버라이딩 해두었다.
		// (주소값 기반이 아닌 실제 담긴 문자열 기반으로 해쉬코드값 만들어서 반환하도록)
		
		// 정말 정말 실제 주소값을 보고 싶어!!!!
		// System.identityHashOde(레퍼런스)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// 이제서야 주소값이 다르다는 것을 눈으로 확인 할 수 있다!
		
	
	}
	
	// 2. 문자열을 리터럴로 생성
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";
		// 리터털 제시시 StringPool(상수풀) 영역에 올라감
		// StringPool 특징 : 동일한 문자열 존재 불가
		
		System.out.println(str1 == str2); // 결과 : true(주소값 일치)
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// 정말 정말 실제 주소값을 보고 싶어!!
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	
	// 불변클래스
	public void method3() {
		
		String str = "hello";
		System.out.println(System.identityHashCode(str));
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str));
		
		str += "abc"; // str = str + "abc";
		System.out.println(System.identityHashCode(str));
		
		// 불변 이라고해서 수정이 아예 불가능한 것이 아니라
		// 기존의 그 자리에서 수정되는 개념이 아니다!!
		// => 매번 새로운 주소값을 참조하게 된다!
	}

}
