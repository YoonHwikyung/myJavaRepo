package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		
		// �ǽ����� 1. 
		// �̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.
		
		
		//Scanner sc = new Scanner(String.in); => (System.in) �̴�!!
		Scanner sc = new Scanner(System.in);
		
		// �̸�, ����, ����, Ű
		
	
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
	
		sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("Ű " + height + "�� " + age + "�� " + gender + "�� " + name + "�� �ݰ����ϴ�^^");
				
		
	}
	
	
	
	
	
	public void method2() {
		
		// �ǽ����� 2.
		// Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, ������ �� ���� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int firstN = sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		int secondN = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (firstN + secondN));
		System.out.println("���� ��� : " + ( firstN - secondN ));
		System.out.println("���ϱ� ��� : " + ( firstN * secondN ));
		System.out.println("������ ��� : " + (firstN / secondN ));
		
		
	}
	
	public void method3() {
		
		// �ǽ����� 3.
		// Ű����� ����,���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
		// * ���� (����=����*����, �ѷ�=(����+����)*2)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double lengthN = sc.nextDouble();
		
		System.out.print("���� : ");
		double heigthN =sc.nextDouble();
		
		System.out.println("���� : " + (lengthN * heigthN));
		System.out.println("�ѷ� : " + (lengthN + heigthN) * 2);
		
		
	}
	
	
	
	
	
	public void method4() {
		
		// �ǽ����� 4.
		// ���� ���ڿ��� Ű����� �Է� �޾� ���� ���� �� ���� ����ϼ���.
		// * ��Ʈ => charAt(�ε���) �޼ҵ� Ȱ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String st = sc.nextLine();
		
		System.out.println("ù ��° ���� : " + st.charAt(0));
		System.out.println("�� ��° ���� : " + st.charAt(1));
		System.out.println("�� ��° ���� : " + st.charAt(2));
		
		
		//char word1 = sc.nextLine().charAt(0);
		//char word2 = sc.nextLine().charAt(1);
		//char word3 = sc.nextLine().charAt(2);
		
		//System.out.println("ù ��° ���� : " + word1);
		//System.out.println("�� ��° ���� : " + word2);
		//System.out.println("�� ��° ���� : " + word3);
		
		
		//System.out.println("ù ��° ���� : " + sc.nextLine().charAt(0));
		//System.out.println("�� ��° ���� : " + sc.nextLine().charAt(1));
		//System.out.println("�� ��° ���� : " + sc.nextLine().charAt(2));
		
		
		
		
	}
	
	
	
	
}
