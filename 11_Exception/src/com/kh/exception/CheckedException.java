package com.kh.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ������ ����ó���������� ó���ؾ��ϴ� ���
public class CheckedException {

	/*
	 * CheckedException : �ݵ�� ����ó���� ����� �ϴ� ���ܵ�
	 * ����, ��� ���ܰ� �߻��� �� ���� ���ϱ� ������ �̸� ����ó�� ������ �ۼ��ص־���!
	 * �ַ� �ܺ� �Ű�ü�� ������� �� �� �߻�
	 * 
	 */
	
	
	public void method1() throws IOException {
		
		/*
		try {
			method2();
		}catch(IOException e) {
			System.out.println("���ܹ߻�!!");
		}
		*/
		
		method2();
		
	}
	
	public void method2() throws IOException {
		
		// Scanner sc = new Scnanner(System.in);
		
		// Ű����� �� �Է� �޴� ��� BufferedReader �� �̿��ؼ��� ����!!
		// ��, ���ڿ��θ� ����
		// �̶� �ݵ�� ����ó���� �ؾ߸� �ϴ� ��찡 �����!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* ����ó�� ��� 1. try~catch�� : �� �ڸ����� �ٷ� ���� �߻��� ��Ƽ� ó���ϰڴ�
		System.out.print("�ƹ� ���ڿ��� �Է����ּ���  :");
		try {
			String str = br.readLine(); // �� �޼ҵ� ����� IOException�� �߻��� ���� ����!
										// ������ ������ �˷���! => �ݵ�� ����ó��(���ܹ߻��� ������ ���� ����)�ؾ� ��!
			System.out.println(str);
		}catch(IOException e) {
			System.out.println("���ܹ߻�!!");
		}
		*/
		
		
		// * ����ó�� ��� 2. throws : ���ѱ�� ���(�����ϴ� ���)
		//						    ���� ���⼭ ���� ����ó���� ���� �ʰ� �� �޼ҵ带 ȣ���� ������ ����ó���� ���ѱ�ڴ�!!
		String str = br.readLine();
		System.out.println(str);
		
		
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
	}
	
	
	/*
	 * 						���ܹ߻� ����			����ó��
	 * RuntimeException		��Ÿ�ӿ���(�����Ͽ���x)	����	  => ������ ����(���ǹ�/����ó��)	unCheckedException
	 * RuntimeException ��	�����Ͽ���				�ʼ�	  => �ݵ�� ����ó��			    CheckedException
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
}
