package com.kh.chap04_field.run; // 필드부 실행용 클래스

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		
		// ===== FieldTest1 테스트 =====
		
		/*
		// * 멤버변수 생성 시점
		FieldTest1 f1 = new FieldTest1();
		// 위의 객체 생성하는 구문에서 global이라는 변수가 메모리상에 만들어짐( 값 대입된 채로)
		
		// * 지역변수 생성 시점
		f1.test(5); 
		// f1.test 메소드 호출 시 값을 받아야하는 (매개변수)가 있으므로 무조건 값을 넣어야 한다.
		// 위의 test메소느 호출하는 구문에 test메소드 안의 지역변수들이 메모리상에 만들어짐
		
		// * 지역변수 소멸 시점
		// 메소드가 다 끝나고 나면 지역변수들은 메모리상에서 사라짐
		
		// * 멤버변수 소멸 시점
		f1 = null; 
		*/
		
		/*
		// ===== FieldTest2 테스트 =====
		 * 
		FieldTest2 f2 = new FieldTest2();
		
		// public => 어디서든 접근 가능
		System.out.println(f2.pub); // 필드에 직접적으로 접근
		
		// protected => 같은 패키지 접근 가능, 다른 패키지 접근 불가(상속 구조일시 접근 가능)
		// System.out.println(f2.pro); // getter 메소드를 통해 간접적 접근 가능
		
		
		// default => 같은 패키지에서만 접근 가능
		//System.out.println(f2.def); // getter 메소드를 통해 간접적 접근 가능
		
		// private => 해당 "클래스"에서만 접근 가능
		//System.out.println(f2.pri); // getter 메소드를 통해 간접적 접근 가능
		*/
		
		
		// ===== FieldTest3 테스트 =====
		
		// static 키워드가 붙은 클래스변수는 굳이 해당 객체 생성하지 않아도 쓸 수 있다.
		// 왜? 이미 메모리 영역에 생성되어 있기 때문에!
		
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest2.sta);
		// 단, 어떤 클래스꺼인디 클래스명. 을 통해 접근해야함!!
		
		FieldTest3.sta = "ㅋㅋㅋㅋ";
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.NUM);
		
		// java에서 만들어 놓은 Math클래스.상수 필드
		System.out.println(Math.PI);
		
	

	}

}
