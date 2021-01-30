package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {

		/*
		// Desktop 객체 생성
		Desktop d = new Desktop();
		
		/*
		// 기본 생성자로 값 초기화
		// Desktop 클래스에는 없는 pName() 메소드 호출해보자
		// Desktop 클래스에는 없어도 부모 클래스인 Product를 extends 해두었기때문에 가능한 것
		d.setpName("짱짱데스크탑");
		d.setpCode("d-01");
		d.setBrand("삼성");
		d.setPrice(2000000);
		d.setAllInOne(true);
		*/
		
		// Desktop 객체 생성과 동시에 각 필드에 초기화
		Desktop d = new Desktop("짱짱데스크탑", "d-01", "삼성", 2000000, true);
		
		// Tv 객체  생성과 동시에 각 필드에 초기화
		Tv t = new Tv("올레드티비", "t-01", "엘지", 3500000, 60);
		
		// SmartPhone 객체 생성과 동시에 각 필드에 초기화
		SmartPhone s = new SmartPhone("아이뽄", "s-01", "애플", 1500000, "KT");
		
		// 출력
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		// 부모 클래스 information 메소드는 price까지만 나온다.
		
		/*
		 * * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * - 코드를 공통적으로 관리하기 때문에 코드의 추가,변경에 용이
		 * - 중복된 코드를 줄였기 때문에 프로그램의 생산성과 유지보수에 크게 기여함
		 * 
		 */
		
		
	}

}
