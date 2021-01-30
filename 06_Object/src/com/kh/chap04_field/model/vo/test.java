package com.kh.chap04_field.model.vo;

// protected, default 필드는
// 같은 패키지에서 접근 가능하다!
// 정말 그런지 FieldTest2와 같은 패키지에 실행용 클래스를 만들어서
// 테스트 해보자!

// 같은 패키지에 있기 때문에 import하지 않아도 된다!
public class test {

	public static void main(String[] args) {
		// ===== FieldTest2 테스트 =====
		FieldTest2 f2 = new FieldTest2();
				
		// public => 어디서든 접근 가능
		System.out.println(f2.pub); // 필드에 직접적으로 접근
				
		// protected => 같은 패키지 접근 가능, 다른 패키지 접근 불가(상속 구조일시 접근 가능)
		System.out.println(f2.pro); // getter 메소드를 통해 간접적 접근 가능
				
				
		// default => 같은 패키지에서만 접근 가능
		System.out.println(f2.def); // getter 메소드를 통해 간접적 접근 가능
				
		// private => 해당 "클래스"에서만 접근 가능
		//System.out.println(f2.pri); // getter 메소드를 통해 간접적 접근 가능
				
		

	}

}
