package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성 적용시키기 전
public class ElectronicController1 {
	
	// 용산 전자 상가에 새로 차린 가게
	private Desktop desk; // Q. import 과정. 기본자료형 뿐 만 아니라, 참조형 자료형으로도 필드부를 구성 할 수 있다.
	private NoteBook note; // NoteBook note = new Notebook(); 은 값을 담는 것
	private Tablet tab;
	// 아직 자리만 있을 뿐 제품이 있지는 않다. 납품업체에서 보내줄 것. 


	public void insert(Desktop d) { // Desktop객체를 받기 위해 매개변수 Desktop d
		// Desktop d = new Desktop("Samsung", "데탑", 1200000, "Geforce 1070");
		desk = d; // 위에 자리 잡아둔 desk자리에 d를 담을 것. 결과값을 setting하기 위한 용도이므로 void
	}
	
	public void insert(NoteBook n) {
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	// 간접적으로 접근 허용하는 메소드
	public Desktop selectDesktop() { // Desktop = 자료형
		return desk;
	}
	
	public NoteBook selectNoteBook() { // 메소드명을 모두 select로 하면 select() 로 매개변수도 같은 메소드명이므로 중복 오류!
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
	
	// setter getter 아니야!? 근데 왜 이름을 저렇게 지어!?
	// => 보통 vo용 클래스에서만 setter getter로 이름을 짓는다!
	// => 이건 기능용 클래스의 메소드
	
	
	
	
	
	
	
}
