package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {

		// 언제 다형성을 적용시키면 좋은지
		// 목적 1. 부모 타입의 레퍼런스로 다양한 자식객체를 받아줄 수 있다. 어떤 자식 객체든 하나의 배열로 관리하고싶다? 부모 객체에서 관리할 수 있다.
			// ㄴ 2021.01.13 수업
		// 목적 2. 메소드의 매개변수에 다형성을 적용시킬 경우 (부모 타입 레퍼런스로 자식객체를 받아줌)
		
		
		// 기능용 클래스를 하나 더 만들자.
		
		// 납품업체라고 생각하자!!
		
		///// 다형성 적용 전
		/*
		// 1. 다형성 적용 안했을 경우 (ElectronicController1)
		ElectronicController1 ec = new ElectronicController1();
		// 생성하는 순간 해당 클래스의 필드들이 메모리 영역에 올라감!
		
		// 가게에 제품 세팅
		ec.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce 1070")); // Desktop객체를 생성하면서 값을 담은채로 전달
		ec.insert(new NoteBook("LG", "그램", 2000000, 4));
		ec.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		// 가게에 있는 제품 정보를 가지고와서 조회해 올 것임
		Desktop d = ec.selectDesktop(); // 데스크답 객체가 돌아올 것이기 때문에 데스크탑 자료형에 담아두자
		NoteBook n = ec.selectNoteBook();
		Tablet t = ec.selectTablet();
		
		
		// 손님에게 정보 출력
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		
		///// 다형성 적용 후
		// 2. 다형성 적용했을 떄(ElectronicController2)
		ElectronicController2 ec = new ElectronicController2();
		
		ec.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce 1070"), 0); // Desktop객체를 생성하면서 값을 담은채로 전달
		ec.insert(new NoteBook("LG", "그램", 2000000, 4), 1);
		ec.insert(new Tablet("Apple", "아이패드", 800000, false), 2);
		// ㄴ 이번에는 객체에 담을 값과 인덱스 값도 같이 전달
		
		/*
		Desktop d = (Desktop)ec.select(0); // DownCasting : Electronic자료형이 돌아왔기 때문에 강제형변환 필요
		NoteBook n = (NoteBook)ec.select(1);
		Tablet t = (Tablet)ec.select(2);
		
		
		System.out.println(n);
		System.out.println(t);
		*/ //ㄴ 하나하나 씩 가져와서 출력
		
		// 통째로 가져와서 출력
		Electronic[] elec = ec.select();
		
		for(int i=0; i<elec.length; i++) {
			System.out.println(elec[i]);
		}
		
		
		/*
		 * 다형성을 사용하는 이유
		 * 1. 부모타입의 객체배열로 다양한 자식들을 받아줄 수 있음
		 *    => 부모타입 하나만으로 다양한 자식 객체들을 다룰 수 있음
		 * 2. 메소드의 매개변수나 반환형에 다형성을 적용하게 되면 메소드 갯수가 확 줄어든다
		 * 
		 */
	}

}
