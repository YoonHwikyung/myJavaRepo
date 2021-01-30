package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// 다형성 적용 시켰을 때 (부모 타입 레퍼런스로 자식 객체를 받아준다)
public class ElectronicController2 {

	private Electronic[] elec = new Electronic[3];
	
	public void insert(Electronic any, int index) {
		// Electronic any = new Desktop("Samsung", "데탑", 1200000, "Geforce 1070");
		elec[index] = any;
	}
	
	public Electronic select(int index) {
		return elec[index];
	}
	
	// 통째로 돌려주는 메소드
	public Electronic[] select() {
		return elec;
	}
	
}
