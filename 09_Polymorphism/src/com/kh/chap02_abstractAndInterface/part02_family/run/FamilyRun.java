package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;

public class FamilyRun {

	public static void main(String[] args) {

		/*
		//Person p = new Person();
		
		Person p1 = new Mother("김엄마", 50, 70, "출산");
		Person p2 = new Baby("강아기", 3.5, 70);
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.eat();		// 엄마 : 몸무게 +10  건강도 -10
		p2.eat();		// 아기 : 몸무게 +3    건강도 +1
		p1.sleep();		// 엄마 : 건강도 +10
		p2.sleep();		// 아기 : 건강도 +3
		
		System.out.println("=== 다음날 ===");
		System.out.println(p1);
		System.out.println(p2);
		*/
		
		/// interface
		// Basic b = new Basic(); => 객체 생성 불가
		Basic b1 = new Mother("김엄마", 50, 70, "출산"); // => 다형성 적용 가능
		Basic b2 = new Baby("강아기", 3.5, 70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		b1.sleep();
		b2.sleep();
		
		System.out.println("=== 다음날 ===");
		System.out.println(b1);
		System.out.println(b2);
		
		/*
		 *  extends 일반클래스 --> extends 추상클래스 --> implements 인터페이스
		 *  ------------------------------------------------------->
		 *  				강제성이 더 짙어짐 (규약 강화)
		 *  
		 *  클래스 간의 상속                    : 클래스 extends 클래스 (단일 상속)							/ 화살표 : 실선
		 *  클래스와 인터페이스 간의 상속 : 클래스 implements 인터페이스, 인터페이스, .. , (다중 상속 가능)	/ 화살표 : 점선
		 *  인터페이스 간의 상속              : 인터페이스 extends 인터페이스, 인터페이스, .. , (다중 상속 가능)	/ 화살표 : 실선
		 *  
		 */
		
	}

}
