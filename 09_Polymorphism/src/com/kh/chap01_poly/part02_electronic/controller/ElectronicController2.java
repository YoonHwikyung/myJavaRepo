package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// ������ ���� ������ �� (�θ� Ÿ�� ���۷����� �ڽ� ��ü�� �޾��ش�)
public class ElectronicController2 {

	private Electronic[] elec = new Electronic[3];
	
	public void insert(Electronic any, int index) {
		// Electronic any = new Desktop("Samsung", "��ž", 1200000, "Geforce 1070");
		elec[index] = any;
	}
	
	public Electronic select(int index) {
		return elec[index];
	}
	
	// ��°�� �����ִ� �޼ҵ�
	public Electronic[] select() {
		return elec;
	}
	
}
