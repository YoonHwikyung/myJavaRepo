package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		
		// 객체 생성 이전에 명심할 것!!
		// '=' 대입 연산자를 기준으로 왼쪽 오른쪽의 자료형(타입)은 같아야 함
		
		// 1. 부모 타입 레퍼런스로 부모 객체를 다루는 경우(다형성x)
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다루는 경우");
		Parent p1 = new Parent(); // 같은 자료형(타입)
		p1.printParent();
		// p1 레퍼런스로 Parent에만 접근 가능
		
		// 2. 자식 타입 레퍼런스로 자식 객체를 다루는 경우 
		System.out.println("2. 자식 타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
		// 어? Parent라는 부모클래스를 상속받고 있네? 부모 클래스를 먼저 생성시키고, 그 후에 자식 클래스 생긴다
		// c1으로 호출할수 있는 메소드의 범위
		c1.printParent(); // =((Parent).c1).printParent();
		c1.printChild1();
		// c1 레퍼런스로 Parent, Child1 둘 다 접근 가능
		
		// 다형성 적용
		// 3. 부모 타입 레퍼런스로 자식 객체를 다루는 경우
		System.out.println("부모 타입 레퍼런스로 자식 객체를 다루는 경우");
		Parent p2 = /*(Parent)*/new Child1();
		// 양쪽의 자료형이 다름에도 불구하고 잘 됨! => 자식 타입이 부모 타입으로'자동형변환' => 결국 p2는 Parent자료형.
		// 상속 구조에서는 클래스 형변환이 가능!
		p2.printParent(); // Child1을 다뤘는데도 p2 레퍼런스로 Parent에만 접근 가능
		((Child1)p2).printChild1(); // 단, Child1으로 강제형변환 후 접근 가능(메모리영역에 만들어지기는 했으니)
		
		
		/*
		 * 클래스 간에 형변환 가능 (단, 상속구조일 경우에만)
		 * 
		 * 1. UpCasting
		 *    자식 타입 => 부모 타입으로 형변환
		 *    생략 가능(자동 형변환 된다)
		 * 
		 * 2. DownCasting
		 *    부모 타입 => 자식 타입으로 형변환
		 *    생략 불가(명시적(강제)형변환 해야 함)
		 * 
		 */

		// 지금부터는
		// 다형성을 왜 쓰는지  살펴보자!!
		
		// Child1 객체 2개와 Child2 객체 2개가 필요함!
		// 다형성 배우기 전
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 1, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5, 7, 2);
		arr2[1] = new Child2(2, 3, 5);
		
		
		//
		System.out.println("========== 다형성 접목한 객체 배열 ============");
		// 다형성이 적용되면 부모타입 레퍼런스로 다양한 자식 객체들을 받아줄 수 있음
		Parent[] arr = new Parent[4]; // 부모 타입 객체배열
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(5, 7, 2);
		arr[2] = new Child2(2, 3, 5);
		arr[3] = new Child1(2, 1, 5);

		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		// 단 arr[i]는 parent메소드까지만 접근 가능하기 때문에 자식 클래스를 강제형변환 해줘야 접근 가능하다!
		
		
		// ((Child2)arr[0]).printChild2();
		// => ClassCastException 오류( 형변환 하는 순간 오류. 형변환 할 수 없다는 메시지)
		// => 실제로 참조하고 있는 자식 클래스로 강제형변환 해야한다!!
		
		
	
		
		// 그에 맞는 형변환, 출력
		
		/*
		 System.out.println("======= 반복문 이용해서 해보기 =======");
		 
		for(int i=0; i<arr.length; i++) {
			// 각 인덱스별로 실제로 참조하고 있는 자식 클래스에 맞춰서 다운캐스팅 후 메소드 호출해야 함
			if(i == 0 || i == 3) {
				((Child1)arr[i]).printChild1();
			}else { 
				((Child2)arr[i]).printChild2();
			}
		} // => 지금은 비록 객체가 4개이니 가능하지.. 100개라면?? 새로운 연산자를 배워보자!
		*/
		
		/*
		// instanceof 연산자
		// 현재 레퍼런스가 '실제로' 어떤 자식 클래스를 참조하고 있는지 확인 할 떄 사용
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] instanceof Child1) { // arr[i]가 실제로 Child1을 참조하고 있다면,
				((Child1)arr[i]).printChild1();
			}else { 
				((Child2)arr[i]).printChild2();
			}
		}
		*/
		
		// 오버라이딩을 이용해보자
		for(int i=0; i<arr.length; i++) {
			
			arr[i].print();
		}
		// 단, 오버라이딩 개념을 접목하면 보다 쉽게 실행가능함
		// 실질적으로 참조하고 있는 자식 클래스의 오버라이딩 된 메소드 찾아가서 알아서 실행됨!
		
		// 1) arr[i]는 Parent형이 맞음. 그렇기 때문에 print() 메소드를 실행시켰을 때, Parent로 갔을 것.
		// 2) arr[i]가 실제 참조하고 있는 자식 클래스에도 혹시 print() 메소드가 있나 들어가봄.
		// 3) arr[i]의 실제 참조 클래스에서 print()를 오버라이딩 하고 있다는 게 확인되면,
		// 4) arr[i]의 실제 참조 클래스인 자식 클래스의 print()가 실행된다.




		
		
		
		
	}

}
