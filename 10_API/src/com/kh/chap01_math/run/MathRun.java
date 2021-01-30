package com.kh.chap01_math.run;

// import java.lang.*;
// �˰Ը𸣰� ��� ��Ű������ java.lang.* �� import �Ǿ��ִ�.
// java.lang�� ���õ� �͵��� ���� import ���� �ʾƵ� �ȴ�! (�������� ������ �̹� �Ǿ�����!)
// ex. Object, String, Math, ... ,


public class MathRun {

	public static void main(String[] args) {

		// Math Ŭ����(���� ����)���� �����ϰ� �ִ� ������ ��ɵ��� ���캸��
		
		// ���� => ����ʵ�
		System.out.println("���� : " + Math.PI);
		
		// �ø� : Math.ceil(double) : double
		//							�� : double������ �����شٴ� ��
		// ceil�̶�� �޼ҵ� ��ü�� �ۺ����� ���ǵǾ��ֱ� ������ .���� ���� ����!
		double num1 = 4.349;
		System.out.println("�ø� : " + Math.ceil(num1));
		System.out.println("�ø� : " + (int)Math.ceil(num1));
		
		
		// �ݿø� => Math.round(double) : long
		System.out.println("�ݿø� : " + Math.round(num1));
		
		// ���� => Math.floor(double) : double
		System.out.println("���� : " + Math.floor(num1));
		
		// ���밪 => Math.abs(int) : int (�����ε� �Ǿ�����)
		int num2 = -10;
		System.out.println("���밪 : " + Math.abs(num2));
		
		// �ּҰ� => Math.min(int, int) : int
		System.out.println("�ּҰ� : " + Math.min(5, 10));
		
		// �ִ밪 => Math.max(int, int) : int
		System.out.println("�ִ밪 : " + Math.max(5, 10));
		
		// ������(��Ʈ) => Math.sqrt(double) : double (int ���� �־ ���� ���� ū ������ ���� ������ �ڵ� ����ȯ�� �ȴ�)
		System.out.println("4�� ������ : " + Math.sqrt(4));
		System.out.println("10�� ������ : " + (int)Math.sqrt(10));
		
		// ����
		System.out.println("2�� 10���� : " + Math.pow(2, 10));
		
		// Math m = new Math(); -> �Ұ���!
		
		/*
		 *  * java.lang.Math Ư¡
		 *  ��� �ʵ� => ����ʵ�
		 *  ��� �޼ҵ� =? static �޼ҵ�
		 *  
		 *  ���� �� static�̱� ������ Math.�� ���� ����(��ü ������ �ʿ�x)
		 *  => ������ private == �����Ұ�
		 *  
		 *  ���α׷� ����� ���ÿ� �޸� ������ �÷����� �����ϴ� ���� == �̱��� ����
		 *  
		 */
		
		
		
	}

}
