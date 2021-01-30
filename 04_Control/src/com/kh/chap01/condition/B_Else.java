package com.kh.chap01.condition; // �н����� : ��� - ���ǹ� - if-else��

import java.util.Scanner;

public class B_Else {

	/*
	 * * if-else ��
	 * 
	 * if(���ǽ�) {
	 * 		���� �ڵ�1; if�� ���ǽ��� true�� ���
	 * }else {
	 * 		���� �ڵ�2; if�� ���ǽ��� false�� ���
	 * }
	 * 
	 * ���ǽ��� ����� true�� ��� �����ڵ�1���� �����ϰ� if-else�� ��ü�� ��������
	 * ��, ���ǽ��� false�� ��� ������ �����ڵ�2�� ������
	 * 
	 * 
	 * * if-else if��
	 * ���� �� ������� �������� ������ ������ ���
	 * 
	 * if(���ǽ�1) {
	 * 		�����ڵ�1;
	 * }else if(���ǽ�2) {
	 * 		�����ڵ�2;
	 * }else if(���ǽ�3) {
	 * 		���� �ڵ�3;
	 * }[else {
	 * 		���� ���ǵ��� �� false�� ��� �ݵ�� ������ �ڵ�;
	 * }] ==> [���� ����]
	 * 
	 * ���ǽ� 1�� ����� true�� ��� => �����ڵ�1���� �����ϰ� �ڵ� ��Ʈ ��ü�� ��������
	 * ��, false�� ���  => ���ǽ� 2 ����
	 * ���ǽ� 2�� ����� true�� ��� => �����ڵ�2���� �����ϰ� �ڵ� ��Ʈ ��ü�� ��������
	 * ��, false�� ��� => ���ǽ� 3 ����
	 * .....
	 * �������� else���� ���õǾ����� ��� ���� ���ǵ��� �� false�� ��� ������ else���� ����
	 * 
	 */
	
	//���ø� ���� � ��Ȳ���� if-else / if-else if�� Ȱ������ �����غ���!
	
	// ����1) ef-else �� ����ؾ��ϴ� ���
	public void method1() {
		
		// ����ڰ� �Է��� ���� ���� ¦��/Ȧ�� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.println("¦���Դϴ�."); // ���ǽ�1�� true��� "¦���Դϴ�." false��� "Ȧ���Դϴ�."
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
	}
	
	// ����2) if-else if �� ����ؾ��ϴ� ���
	public void method2() {
		
		// ����ڰ� �Է��� ���� ���� ���/0/�������� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�����");
		}else if(num == 0){
			System.out.println("0�̴�");
		}else {
			System.out.println("������");
		} 
		
	}
	
	// if-else if ��ø���
	public void method3() {
		
		// ��� / û�ҳ�  /�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(������) : ");
		int age = sc.nextInt();
		
		// ���(0�̻� 13����) / û�ҳ�(13�ʰ� 19����) / ����(19�ʰ�)
		
		/*
		if(age >= 0 && age <= 13) {
			System.out.println("���");
		}else if(age > 13 && age <= 19) {
			System.out.println("û�ҳ�");
		}else if(age > 19) {
			System.out.println("����");
			// => �������� else�� ���� ��� : -10�� �Է��� �߾ "����"���� ��. �׷��� ������ else�� �ƴ� else if�� ��Ȯ�� ������ �ۼ�!
			// => else�� �� �������� �ؾ��ϴ� ���� �ƴϴ�!
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�");
		}
		*/
		
		// ���� ���� ����� ���������� if-else if [��ø���] �غ���!
		if(age < 0) { // ���̰��� �Է��ؾ� �ϴµ� ������ �Է����� ���=>�߸� �Է����� ���
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}else { // �� �Է����� ��� => 0 �̻��� ���� �� �Է��� ���
			
			if(age <= 13) { // �̹� 0 �̻� ���� �� �Է��߱� ������ �Ѿ�� �ܰ� : ���ǹ��� age >=0 ���� �ʾƵ� �ȴ�.
				System.out.println("���");
			}else if(age <= 19) { //�̹� ������ age�� 13�ʰ����� �Ѿ�Ա� ������ age > 13 ���� �ʾƵ� �ȴ�.
				System.out.println("û�ҳ�");
			}else { // ������ �̹� 0�̻� ���� �� �Է��ؼ� �� �ܰ��̱� ������ else�� �������ص� ������ ���� ���ɼ��� ����!
				System.out.println("����");
			}
			// == > �̹� ���õǾ� �ִ� ���� ���ʿ��� ���� �� �ʿ䰡 ����!
		}
		
	}
	
	// if-else if ��ø��� ��������
	public void method4() {
		
		// ����ڿ��� ������ �Է� �޾�
		// �������� ����� ���� ���
		
		// 90�� �̻��� ��� "A���"
		// 90�� �̸�, 80�� �̻��� ��� "B���"
		// 80�� �̸�, 70�� �̻��� ��� "C���"
		// 70�� �̸�, 60�� �̻��� ��� "D���"
		// 60�� �̸��� ���, "F���"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int score = sc.nextInt();
		
		String grade = ""; // => ������� ���� ����
		
		if(score >= 90) {
			grade = "A���";
		}else if(score >= 80) {
			grade = "B���";
		}else if(score >= 70) {
			grade = "C���";
		}else if(score >= 60) {
			grade = "D���";
		}else {
			grade = "F���";
		}
		
		// ����� ������ xx���̰�, ����� xxx�Դϴ�.
		System.out.println("����� ������ " + score +"���̰�, ����� " + grade + "�Դϴ�.");
		
		/*if(score < 0 || score > 100) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			
			else {
				
				if(score >= 90) {
					System.out.println("A���");
				}else if(score >= 80) {
					System.out.println("B���");
				}else if(score >= 70) {
					System.out.println("C���");
				}else if(score >=60) {
					System.out.println("D���");
				}else {
					System.out.println("F���");
				}
			}
		}
		*/
		
	}
	
	 // is else ���� (���ڿ� �����)
	public void method5() {
		
		// ����ڿ��� �̸��� �Է� ���� �� 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		
		// �� �̸��� "���ְ�"�̶�� ���ڿ��� ��ġ�� ��� => "�����Դϴ�."
		//						    ��ġ���� ���� ��� => "������ �ƴմϴ�. ���ư��ּ���."
		
		/*
		
		if(name == "���ְ�") {
			System.out.println("�����Դϴ�. �������.");
		}else {
			System.out.println("������ �ƴմϴ�. ���ư��ּ���."); // string ������ ��Ƽ� ��� ����!
		}
		*/
		
		// �⺻�ڷ����� ���� �����(==, !=) �� ������ �ȴ�.
		// ��, String �⺻ �ڷ����� �ƴ� ���� �ڷ���(��Ư)��!! => ����񱳿����ڰ� ����� ������� ����!!
		// => ���ڿ� ���� ����񱳸� �Ϸ���, equals(���ϰ����ϴ¹��ڿ�) �޼ҵ带 �̿��ؾ� �Ѵ�!
		
		// [����] ����.equals("���ϰ����ϴ¹��ڿ�")
		if(name.equals("���ְ�")) {
			System.out.println("�����Դϴ�. �������.");
		}else {
			System.out.println("������ �ƴմϴ�. ���ư��ּ���.");
		}
	
	}
	
	
}
