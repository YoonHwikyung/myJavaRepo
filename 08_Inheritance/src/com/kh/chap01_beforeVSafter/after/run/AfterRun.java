package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {

		/*
		// Desktop ��ü ����
		Desktop d = new Desktop();
		
		/*
		// �⺻ �����ڷ� �� �ʱ�ȭ
		// Desktop Ŭ�������� ���� pName() �޼ҵ� ȣ���غ���
		// Desktop Ŭ�������� ��� �θ� Ŭ������ Product�� extends �صξ��⶧���� ������ ��
		d.setpName("¯¯����ũž");
		d.setpCode("d-01");
		d.setBrand("�Ｚ");
		d.setPrice(2000000);
		d.setAllInOne(true);
		*/
		
		// Desktop ��ü ������ ���ÿ� �� �ʵ忡 �ʱ�ȭ
		Desktop d = new Desktop("¯¯����ũž", "d-01", "�Ｚ", 2000000, true);
		
		// Tv ��ü  ������ ���ÿ� �� �ʵ忡 �ʱ�ȭ
		Tv t = new Tv("�÷���Ƽ��", "t-01", "����", 3500000, 60);
		
		// SmartPhone ��ü ������ ���ÿ� �� �ʵ忡 �ʱ�ȭ
		SmartPhone s = new SmartPhone("���̻�", "s-01", "����", 1500000, "KT");
		
		// ���
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		// �θ� Ŭ���� information �޼ҵ�� price������ ���´�.
		
		/*
		 * * ����� ����
		 * - ���� ���� ���� �ڵ�� ���ο� Ŭ���� �ۼ� ����
		 * - �ڵ带 ���������� �����ϱ� ������ �ڵ��� �߰�,���濡 ����
		 * - �ߺ��� �ڵ带 �ٿ��� ������ ���α׷��� ���꼺�� ���������� ũ�� �⿩��
		 * 
		 */
		
		
	}

}
