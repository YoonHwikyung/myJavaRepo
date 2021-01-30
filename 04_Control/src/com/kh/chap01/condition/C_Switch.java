package com.kh.chap01.condition; // �н����� : ��� - ���ǹ� - switch��

import java.util.Scanner;

public class C_Switch {
	
	/*
	 * switch���� if���� ������
	 * if���� (���ǽ�) => ���ǽ� �����ϰԵ� �������, ���� ���� ����
	 * switch ���ǽ�x => Ȯ���� ���� ���Ǹ� ��� (����� ���� ����)
	 * 
	 * * switch�� [ǥ����]
	 * 
	 * switch(������Ҵ����) {
	 * case ��1: �����ڵ�1; break;
	 * case ��2: �����ڵ�2; break;
	 * case ��3: �����ڵ�3; break;
	 * .....
	 * default: ���� ������ �� ��ġ���� ���� ��� ���� �ڵ�;
	 * }
	 * 
	 * * switch���� ���ǻ���
	 * break�� ������ switch ���� �������� �� ����
	 * 
	 */
	
	//switch�� ����
	public void method1() {
		// ����ڿ��� 1~3������ ������ �Է� �޾�
		// 1�� ��� "�������Դϴ�" ���
		// 2�� ��� "�Ķ����Դϴ�" ���
		// 3�� ��� "�ʷϺ��Դϴ�" ���
		// �߸� �Է����� ��� "�߸� �Է��ϼ̽��ϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(1~3) : ");
		int num = sc.nextInt();
		
		/* ������ if-else if�����ε� ����������, �񱳴���� ����(num) �����(==)�� ����ϴ� switch�����ε� �����ϴ�!
		if(num == 1) {
			
		}else if(num == 2) {
			
		}else if(num == 3) {
			
		}else {
			
		}
		*/
		
		/*
		switch(num) {
		case 1: System.out.println("�������Դϴ�."); break;
		case 2: System.out.println("�Ķ����Դϴ�."); break;
		case 3: System.out.println("�ʷϺ��Դϴ�."); break;
		default: System.out.println("�߸��Է��ϼ̽��ϴ�."); 
		}
		*/
		// => ������ Ȱ���ؼ� ���� �� �����ϰ� ������!
		
		String result = "";
		
		switch(num) {
		case 1: result = "������"; break; // =>switch ���� ��������!
		case 2: result = "�Ķ���"; break;
		case 3: result = "�ʷϺ�"; break;
		default: System.out.println("�߸��Է��ϼ̽��ϴ�."); return; // => �޼ҵ� ��ü�� ��������!
		}
		//=> return; => return ������ ���� ������ ���� �� �޼ҵ� ��ü�� ����������.
		
		System.out.println(result + "�Դϴ�.");
		
	}
	
	
	//switch�� ����
	public void method2() {
		// ����ڿ��� ����(���, �ٳ���, ������)�� �Է� �޾�
		// �� ���ϸ����� ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���� �Է�(���, �ٳ���, ������) : ");
		
		String fruit = sc.nextLine();
		
		int price = 0;
		switch(fruit) {
		case "���": price = 1000; break; // fruit�� "���"�� ��ġ�� ��� ����
		case "�ٳ���": price = 3000; break;
		case "������": price = 5000; break;
		default: System.out.println("���� ���Կ��� �Ǹ��ϴ� ������ �ƴմϴ�. �ȳ���������."); return;
		}
		
		System.out.println(fruit + "�� ������ " + price +"�� �Դϴ�.");
		
	}
	
	// break�� ����  switch���� ���� ����1.
	public void method3() {
		
		// ��޺� ����
		// 3���(�Ŵ���)  => �� �б� ���� �־�, �� �۾��� ���� �־�, �� ���� ���� �־�.
		// 2���(�Ϲ�ȸ��) => �� �б� ���� �־�, �� �۾��� ���� �־�
		// 1���(����ȸ��) => �� �б� ���� �־�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���(1/2/3) �Է� : ");
		
		int level = sc.nextInt();
		
		switch(level) {
		case 3: System.out.println("�� ���� ���� �־�.");
		case 2: System.out.println("�� �۾��� ���� �־�.");
		case 1: System.out.println("�� �б� ���� �־�.");
		}
		
	}
	
	
	// break�� ����  switch���� ���� ����1.
	public void method4() {
		// ����ڿ��� 1��~12�� ������ ���� �Է� �޾�
		// �ش� ���� ������ ��¥�� ��� (30��/31��/28�� �Ǵ� 29��)
		
		// 1, 3, 5, 7, 8, 10, 12�� => "�ش� ���� 31�ϱ��� �Դϴ�."
		// 4, 6, 9, 11�� => "�ش� ���� 30�ϱ��� �Դϴ�."
		// 2�� => "�ش� ���� 28�� �Ǵ� 29�ϱ��� �Դϴ�."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�� ~12������ �� �ϳ��� �Է��ϼ���(����) : ");
		
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("�ش� ���� 31�ϱ��� �Դϴ�."); break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("�ش� ���� 30�ϱ��� �Դϴ�."); break;
		case 2: System.out.println("�ش� ���� 28�� Ȥ�� 29�ϱ��� �Դϴ�."); break;
		default: System.out.println("�ݵ�� 1��~12�� �� �ϳ��� ������ �Է��ؾ��մϴ�.");
		}

		
	}
	
	

}
