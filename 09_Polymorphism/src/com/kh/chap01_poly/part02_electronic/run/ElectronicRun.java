package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {

		// ���� �������� �����Ű�� ������
		// ���� 1. �θ� Ÿ���� ���۷����� �پ��� �ڽİ�ü�� �޾��� �� �ִ�. � �ڽ� ��ü�� �ϳ��� �迭�� �����ϰ�ʹ�? �θ� ��ü���� ������ �� �ִ�.
			// �� 2021.01.13 ����
		// ���� 2. �޼ҵ��� �Ű������� �������� �����ų ��� (�θ� Ÿ�� ���۷����� �ڽİ�ü�� �޾���)
		
		
		// ��ɿ� Ŭ������ �ϳ� �� ������.
		
		// ��ǰ��ü��� ��������!!
		
		///// ������ ���� ��
		/*
		// 1. ������ ���� ������ ��� (ElectronicController1)
		ElectronicController1 ec = new ElectronicController1();
		// �����ϴ� ���� �ش� Ŭ������ �ʵ���� �޸� ������ �ö�!
		
		// ���Կ� ��ǰ ����
		ec.insert(new Desktop("Samsung", "��ž", 1200000, "Geforce 1070")); // Desktop��ü�� �����ϸ鼭 ���� ����ä�� ����
		ec.insert(new NoteBook("LG", "�׷�", 2000000, 4));
		ec.insert(new Tablet("Apple", "�����е�", 800000, false));
		
		// ���Կ� �ִ� ��ǰ ������ ������ͼ� ��ȸ�� �� ����
		Desktop d = ec.selectDesktop(); // ����ũ�� ��ü�� ���ƿ� ���̱� ������ ����ũž �ڷ����� ��Ƶ���
		NoteBook n = ec.selectNoteBook();
		Tablet t = ec.selectTablet();
		
		
		// �մԿ��� ���� ���
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		
		///// ������ ���� ��
		// 2. ������ �������� ��(ElectronicController2)
		ElectronicController2 ec = new ElectronicController2();
		
		ec.insert(new Desktop("Samsung", "��ž", 1200000, "Geforce 1070"), 0); // Desktop��ü�� �����ϸ鼭 ���� ����ä�� ����
		ec.insert(new NoteBook("LG", "�׷�", 2000000, 4), 1);
		ec.insert(new Tablet("Apple", "�����е�", 800000, false), 2);
		// �� �̹����� ��ü�� ���� ���� �ε��� ���� ���� ����
		
		/*
		Desktop d = (Desktop)ec.select(0); // DownCasting : Electronic�ڷ����� ���ƿԱ� ������ ��������ȯ �ʿ�
		NoteBook n = (NoteBook)ec.select(1);
		Tablet t = (Tablet)ec.select(2);
		
		
		System.out.println(n);
		System.out.println(t);
		*/ //�� �ϳ��ϳ� �� �����ͼ� ���
		
		// ��°�� �����ͼ� ���
		Electronic[] elec = ec.select();
		
		for(int i=0; i<elec.length; i++) {
			System.out.println(elec[i]);
		}
		
		
		/*
		 * �������� ����ϴ� ����
		 * 1. �θ�Ÿ���� ��ü�迭�� �پ��� �ڽĵ��� �޾��� �� ����
		 *    => �θ�Ÿ�� �ϳ������� �پ��� �ڽ� ��ü���� �ٷ� �� ����
		 * 2. �޼ҵ��� �Ű������� ��ȯ���� �������� �����ϰ� �Ǹ� �޼ҵ� ������ Ȯ �پ���
		 * 
		 */
	}

}
