package com.kh.chap04_field.run; // �ʵ�� ����� Ŭ����

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		
		// ===== FieldTest1 �׽�Ʈ =====
		
		/*
		// * ������� ���� ����
		FieldTest1 f1 = new FieldTest1();
		// ���� ��ü �����ϴ� �������� global�̶�� ������ �޸𸮻� �������( �� ���Ե� ä��)
		
		// * �������� ���� ����
		f1.test(5); 
		// f1.test �޼ҵ� ȣ�� �� ���� �޾ƾ��ϴ� (�Ű�����)�� �����Ƿ� ������ ���� �־�� �Ѵ�.
		// ���� test�޼Ҵ� ȣ���ϴ� ������ test�޼ҵ� ���� ������������ �޸𸮻� �������
		
		// * �������� �Ҹ� ����
		// �޼ҵ尡 �� ������ ���� ������������ �޸𸮻󿡼� �����
		
		// * ������� �Ҹ� ����
		f1 = null; 
		*/
		
		/*
		// ===== FieldTest2 �׽�Ʈ =====
		 * 
		FieldTest2 f2 = new FieldTest2();
		
		// public => ��𼭵� ���� ����
		System.out.println(f2.pub); // �ʵ忡 ���������� ����
		
		// protected => ���� ��Ű�� ���� ����, �ٸ� ��Ű�� ���� �Ұ�(��� �����Ͻ� ���� ����)
		// System.out.println(f2.pro); // getter �޼ҵ带 ���� ������ ���� ����
		
		
		// default => ���� ��Ű�������� ���� ����
		//System.out.println(f2.def); // getter �޼ҵ带 ���� ������ ���� ����
		
		// private => �ش� "Ŭ����"������ ���� ����
		//System.out.println(f2.pri); // getter �޼ҵ带 ���� ������ ���� ����
		*/
		
		
		// ===== FieldTest3 �׽�Ʈ =====
		
		// static Ű���尡 ���� Ŭ���������� ���� �ش� ��ü �������� �ʾƵ� �� �� �ִ�.
		// ��? �̹� �޸� ������ �����Ǿ� �ֱ� ������!
		
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest2.sta);
		// ��, � Ŭ�������ε� Ŭ������. �� ���� �����ؾ���!!
		
		FieldTest3.sta = "��������";
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.NUM);
		
		// java���� ����� ���� MathŬ����.��� �ʵ�
		System.out.println(Math.PI);
		
	

	}

}
