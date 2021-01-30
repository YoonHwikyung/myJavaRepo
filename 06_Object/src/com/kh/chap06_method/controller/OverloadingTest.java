package com.kh.chap06_method.controller; // 오버로딩

public class OverloadingTest {

	// 오버로딩 : 한 클래스 내에 같은 이름의 메소드명으로 여러개 정의할 수 있는 방법
	
	public void test() {
		
	}
	
	/*
	public void test() {
		
	}
	*/
	
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	/*
	public void test(int c, int d) { // 자료형이 위와 겹치기 때문에 오류!
		
	}
	=> 오류 : 매개변수명과는 상관없이 "자료형"의 갯수와 순서가 달라야 함!!
	*/
	
	public void test(int a, int b, String str) {
		
	}
	
	// 반환형이 다르면?
	/*
	public int test(int a, int b, String str) {
		
	}
	=> 오류 : 반환형이 다르다고 오버로딩이 적용되지 않는다.
			반환형이 달라도 매개변수가 같기 때문에 오류!
	*/
	
	
	/*
	 * * 결론
	 * 오버로딩 : 동일한 메소드명으로 작성할 것
	 * 		      반환형 상관없이 매개변수의 "자료형"과 갯수, 순서가 다 다르게 작성되어야 함!
	 */
	
	
	
}
