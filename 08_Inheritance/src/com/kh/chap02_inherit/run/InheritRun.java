package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class InheritRun /*extends Object*/{

	public static void main(String[] args) {
	
		// Car ��ü ����&�ʱ�ȭ
		Car c = new Car("��Ʋ��", 12.5, "����", 4);
		
		// Ship ��ü ����&�ʱ�ȭ
		Ship s = new Ship("���ù�", 0.1, "�", 1);
		
		// Airplane ��ä ����&�ʱ�ȭ
		Airplane a = new Airplane("�����", 0.021, "��Ʈ��", 16, 4);
		
		
		/*
		 �������̵� ����� 
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		*/
		
		// �������̵� �� ���
		System.out.println(c);
		System.out.println(s);
		System.out.println(a);
		
		
		c.howToMove();
		s.howToMove();
		a.howToMove(); 
	}

}
