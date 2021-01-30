package com.kh.chap03_class.model.vo; // default 클래스 테스트

public class Test {

	public static void main(String[] args) {
		
	Product p = new Product();
	// 같은 패키지 내에 있는 
	// default 클래스 'class Product'를 호출할 수 있다.
	
	
	/*
	 *  public class xxxx => 같은 패키지든 다른 패키지든 얼마든지 가져다 쓸 수 있음
	 *  					  단, 다른 패키지 같은 경우는 import를 통해 선언해야 쓸 수 있음
	 *  
	 *   class xxxx => 같은 패키지에서만 가져다 쓸 수 있다!
	 *   			   (절대 다른 패키지에서는 쓸 수 없다. import한다 해도 불가능)
	 */

	}

}
