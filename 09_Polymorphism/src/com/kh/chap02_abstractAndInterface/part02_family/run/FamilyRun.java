package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;

public class FamilyRun {

	public static void main(String[] args) {

		/*
		//Person p = new Person();
		
		Person p1 = new Mother("�����", 50, 70, "���");
		Person p2 = new Baby("���Ʊ�", 3.5, 70);
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.eat();		// ���� : ������ +10  �ǰ��� -10
		p2.eat();		// �Ʊ� : ������ +3    �ǰ��� +1
		p1.sleep();		// ���� : �ǰ��� +10
		p2.sleep();		// �Ʊ� : �ǰ��� +3
		
		System.out.println("=== ������ ===");
		System.out.println(p1);
		System.out.println(p2);
		*/
		
		/// interface
		// Basic b = new Basic(); => ��ü ���� �Ұ�
		Basic b1 = new Mother("�����", 50, 70, "���"); // => ������ ���� ����
		Basic b2 = new Baby("���Ʊ�", 3.5, 70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		b1.sleep();
		b2.sleep();
		
		System.out.println("=== ������ ===");
		System.out.println(b1);
		System.out.println(b2);
		
		/*
		 *  extends �Ϲ�Ŭ���� --> extends �߻�Ŭ���� --> implements �������̽�
		 *  ------------------------------------------------------->
		 *  				�������� �� £���� (�Ծ� ��ȭ)
		 *  
		 *  Ŭ���� ���� ���                    : Ŭ���� extends Ŭ���� (���� ���)							/ ȭ��ǥ : �Ǽ�
		 *  Ŭ������ �������̽� ���� ��� : Ŭ���� implements �������̽�, �������̽�, .. , (���� ��� ����)	/ ȭ��ǥ : ����
		 *  �������̽� ���� ���              : �������̽� extends �������̽�, �������̽�, .. , (���� ��� ����)	/ ȭ��ǥ : �Ǽ�
		 *  
		 */
		
	}

}
