package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		
		// Desktop 객체 생성과 동시에 초기화
		// pName, pCode, brand, price, allInOne
		Desktop d = new Desktop("짱짱데스크탑", "d-01", "삼성", 2000000, true);

		
		// Tv 객체 생성 생성과 동시에 초기화
		// pName, pCode, brand, price, inch
		Tv t = new Tv("올레드티비", "t-01", "LG", 3500000, 60);
		
		// SmartPhone 객체 생성과 동시에 초기화
		// pName, pCode, brand, price, mobileAgency
		SmartPhone s = new SmartPhone("아이뽄", "s-01", "애플", 1500000, "KT");
		
		// 주소값 출력
		//System.out.println(d);
		//System.out.println(t);
		//System.out.println(s);
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		
		/*
		 * 이 세 가지 클래스에는 매번 공통적인 필드와 메소드들이 존재함(중복된 코드가 작성되어있음)
		 * => 수정과 같은 유지보수를 하게 될 때 매번 일일히 각 클래스 찾아가서 수정해야되는 번거로움 발생
		 * 
		 * => 따라서 상속(부모-자식)관계로 정의해서 적용시켜보자!!
		 * => 공통적인 필드와 공통적인 메소드들을 단 한번만 '부모 클래스'로 정의할 거임
		 * => 각 클래스마다 따로 필요한 필드들로만 '자식 클래스'로 정의할 거임
		 * => 수정과 같은 유지보수가 필요할 떄 '부모 클래스'에 찾아가서 수정하면 전체적으로 반영된다!
		 * 새로운 패키지 after에서 확인해보자!
		 */
	}

} 
