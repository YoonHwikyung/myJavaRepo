package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		
		// Desktop ��ü ������ ���ÿ� �ʱ�ȭ
		// pName, pCode, brand, price, allInOne
		Desktop d = new Desktop("¯¯����ũž", "d-01", "�Ｚ", 2000000, true);

		
		// Tv ��ü ���� ������ ���ÿ� �ʱ�ȭ
		// pName, pCode, brand, price, inch
		Tv t = new Tv("�÷���Ƽ��", "t-01", "LG", 3500000, 60);
		
		// SmartPhone ��ü ������ ���ÿ� �ʱ�ȭ
		// pName, pCode, brand, price, mobileAgency
		SmartPhone s = new SmartPhone("���̻�", "s-01", "����", 1500000, "KT");
		
		// �ּҰ� ���
		//System.out.println(d);
		//System.out.println(t);
		//System.out.println(s);
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		
		/*
		 * �� �� ���� Ŭ�������� �Ź� �������� �ʵ�� �޼ҵ���� ������(�ߺ��� �ڵ尡 �ۼ��Ǿ�����)
		 * => ������ ���� ���������� �ϰ� �� �� �Ź� ������ �� Ŭ���� ã�ư��� �����ؾߵǴ� ���ŷο� �߻�
		 * 
		 * => ���� ���(�θ�-�ڽ�)����� �����ؼ� ������Ѻ���!!
		 * => �������� �ʵ�� �������� �޼ҵ���� �� �ѹ��� '�θ� Ŭ����'�� ������ ����
		 * => �� Ŭ�������� ���� �ʿ��� �ʵ��θ� '�ڽ� Ŭ����'�� ������ ����
		 * => ������ ���� ���������� �ʿ��� �� '�θ� Ŭ����'�� ã�ư��� �����ϸ� ��ü������ �ݿ��ȴ�!
		 * ���ο� ��Ű�� after���� Ȯ���غ���!
		 */
	}

} 
