package com.kh.run;

import java.io.IOException;

import com.kh.exception.CheckedException;
import com.kh.exception.UnCheckedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException { // ������� ���ѱ�ٸ�? JVM�� �˾Ƽ� ó������. ����x

		/*
		 * * ���� ���� 
		 * - �ý��� ���� : ��ǻ���� ���۵����� �߻��ϴ� ���� => �ҽ��ڵ�� �ذ� �Ұ�(�ɰ��� ����)
		 * - ������ ���� : �ҽ��ڵ���� ������ ���� => ���ʿ� �����ٷ� �˷���(���? �Ź� �������� ����ǰ� �ֱ� ������)
		 * 					    	   => ���ʿ� �ذ����� ������ ���α׷� �������� ���� ����
		 * - ��Ÿ�� ���� : �ڵ� �����δ� ������ ���µ� ���α׷� ����� �߻��ϴ� ����
		 * 			  => ������� �Ǽ� or �����ڰ� ���������� ��츦 ����� ó���� �� �� ���
		 * 
		 * - �� ���� : �ڵ�� ���������� ���������� �ʰ� ����ÿ��� ���� ������ ����.. �ٸ� ���α׷� �ǵ��� ���� �ʴ� ��
		 * 
		 * 
		 * �츮�� �ý��� ������ ������ ������ ����, ��Ÿ�� ����, �� ������ ���� ���� �� �ɰ��� �͵��� ������ �۾��� �ϰ� �� ��
		 * �̷��� ������ "����(Exception)"��� ��
		 * 
		 * �̷��� ���ܵ��� "�߻�"���� ���� ����ؼ�
		 * �߻����� ��� ������ ������� �����صδ� ���� "����ó��"��� ��!!
		 * 
		 * * ����ó�����
		 * 1. try~catch���� �̿�
		 * 2. throws�� �̿�(���ѱ�� == ����)
		 * 3. try~with~resource (����� ���� ���� �غ� ����)
		 *  
		 * 
		 */
		
		UnCheckedException uc = new UnCheckedException();
		
		//uc.method1();
		//uc.method2();
		//uc.method3();
		/*
		CheckedException c = new CheckedException();
		try {
			c.method1();
		}catch(IOException e) {
			System.out.println("���ܹ߻�!!");
		}
		*/
		
		
		
		
		
		
	}

}
