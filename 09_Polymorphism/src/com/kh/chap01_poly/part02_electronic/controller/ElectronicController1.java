package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// ������ �����Ű�� ��
public class ElectronicController1 {
	
	// ��� ���� �󰡿� ���� ���� ����
	private Desktop desk; // Q. import ����. �⺻�ڷ��� �� �� �ƴ϶�, ������ �ڷ������ε� �ʵ�θ� ���� �� �� �ִ�.
	private NoteBook note; // NoteBook note = new Notebook(); �� ���� ��� ��
	private Tablet tab;
	// ���� �ڸ��� ���� �� ��ǰ�� ������ �ʴ�. ��ǰ��ü���� ������ ��. 


	public void insert(Desktop d) { // Desktop��ü�� �ޱ� ���� �Ű����� Desktop d
		// Desktop d = new Desktop("Samsung", "��ž", 1200000, "Geforce 1070");
		desk = d; // ���� �ڸ� ��Ƶ� desk�ڸ��� d�� ���� ��. ������� setting�ϱ� ���� �뵵�̹Ƿ� void
	}
	
	public void insert(NoteBook n) {
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	// ���������� ���� ����ϴ� �޼ҵ�
	public Desktop selectDesktop() { // Desktop = �ڷ���
		return desk;
	}
	
	public NoteBook selectNoteBook() { // �޼ҵ���� ��� select�� �ϸ� select() �� �Ű������� ���� �޼ҵ���̹Ƿ� �ߺ� ����!
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
	
	// setter getter �ƴϾ�!? �ٵ� �� �̸��� ������ ����!?
	// => ���� vo�� Ŭ���������� setter getter�� �̸��� ���´�!
	// => �̰� ��ɿ� Ŭ������ �޼ҵ�
	
	
	
	
	
	
	
}
