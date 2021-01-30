package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {

		/*
		 * * java.util.Date
		 * - ��¥�� �ð��� ���� ������ ���� �� �ִ� Ŭ����
		 * - �ڹ� ���� ��â�⿡ ���ϰ� ���� �ϼ����� ���� ���� Ŭ���� (�ٱ������� ���� ����x)
		 * 
		 * 
		 */
		
		// �⺻ �����ڸ� ���� Date ��ü ���� => ���� ��¥(�ý��۳�¥) �� �ð� ������ ��
		Date today = new Date();
		System.out.println("�⺻������ : " + today);
		
		// ���� ���ϴ� ��¥ (2020�� 6�� 19��)
		// 1) �Ű����� �����ڸ� ����
		//Date date1 = new Date(2020, 6, 19); => Depercated : �������� ����
		// ���������� ���� ������ �⵵ + 1900		=> �����ϰ����ϴ³�-1900
		//		     ���� ������ �� + 1			=> �����ϰ����ϴ¿�-1
		
		Date date1 = new Date(2020-1900, 6-1, 19, 19, 15, 30);
		System.out.println("�Ű����� ������ : " + date1/*toString()*/);
		
		
		// ""2020�� 06�� 19�� 19�� 15�� 30��"
		// �� �Ը���� ����(����)�� ������ ���ڿ��� �ް��� �� ��
		// java.text.SimpleDateFormat
		
		// 1. ������ �����ϸ鼭 SimpleDateFormat ��ü ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		
		// 2. sdf ��ü���� �����ϴ� format�޼ҵ� ȣ�� �� Date��ü ���� => ���������� String ���ƿ�
		//    sdf.format(Date��ü) : String
		//String formatDate = sdf.format(date1);
		//System.out.println(formatDate);
		
		String formatDate = sdf.format(today);
		System.out.println(formatDate);
		
	}

}
