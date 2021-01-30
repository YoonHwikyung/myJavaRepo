package com.kh.practice.example; // ������ �ǽ�����

import java.util.Scanner;

public class OperatorPractice {

	// �ǽ����� 1.
	public void practice1() {
		
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����",
		// ����� �ƴϸ� "����� �ƴϴ�"�� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : "����� �ƴϴ�";
		
		System.out.println(result);
		
		
	}
	
	
	
	
	
	// �ǽ����� 2. ���׿����� ��ø���
	public void practice2() {
		
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����"
		// ����� �ƴ� ��� �߿��� 0�̸� "0�̴�", 0�� �ƴϸ� "������"�� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : (num == 0) ? "0�̴�" : "������";
		
		System.out.println(result);
		

		
	}
	
	
	
	
	// �ǽ����� 3. ������ - �������&�񱳿���
	public void practice3() {
		
		// Ű����� �Է� ���� �ϳ��� ������ ¦���̸� "¦����",
		// ¦���� �ƴϸ� "Ȧ����"�� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		
		int num = sc.nextInt();
		
		String result = num %2 == 0 ? "¦����" : "Ȧ����";
		
		System.out.println(result);
		
		
	}
	
	
	
	
	
	// �ǽ����� 4. 
	public void practice4() {
		
		// ��� ����� ������ ���� ������������ �Ѵ�.
		// �ο� ���� ���� ������ Ű���� �Է� �ް�
		// 1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");	
		int pNum = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int cNum = sc.nextInt();
		
		int dNum = cNum / pNum;
		int rNum = cNum % pNum;
		
		System.out.println("1�δ� ���� ���� : " + dNum);
		System.out.println("���� ���� ���� : " + rNum);
		
		
	}
	
	
	
	
	 // �ǽ����� 5. ���׿����� (+ sc.nextLine();, printf Ȱ��)
	public void practice5() {
		
		// Ű����� �Է� ���� ������ ������ ����ϰ�
		// ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
		// �� �� ������ 'M'�̸� ���л�, 'M'�� �ƴϸ� ���л����� ��� ó�� �ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
		int classN = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : ");
		double score = sc.nextDouble();
		
		
		String result = gender == 'M' ? "���л�" : "���л�";
		
		//System.out.println(grade + "�г� " + classN + "�� " + num + "�� " + name+ " " + result + "�� ������ " + score + "�̴�. ");
		 
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", grade, classN, num, name, result, score);
		
		
	}
	
	
	
	
	// �ǽ����� 6. ���׿����� ��ø��� 
	public void practice6() {
		
		// ���̸� Ű����� �Է� �޾� ���(13�� ����)����,
		// û�ҳ�(13�� �ʰ� ~ 19�� ����)����,
		// ����(19�� �ʰ�)���� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		
		int age = sc.nextInt();
		
		String result = age <= 13 ? "���" : age <= 19 ? "û�ҳ�" : "����";
		
		System.out.println(result);
		
		
	}
	
	
	
	
	// Q �ǽ����� 7. 
	public void practice7() {
		
		// ����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�,
		// �� ���� ���� �հ�(����+����+����)�� ���(�հ�/3)�� ���ϼ���.
		// �� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
		// �� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int lScore = sc.nextInt();
		
		System.out.print("���� : ");
		int eScore = sc.nextInt();
		
		System.out.print("���� : ");
		int mScore = sc.nextInt();
		
		int sum = lScore + eScore + mScore;
		
		int everage = sum /3;
		
		//lScore >= 40 $$ eScore >=40 $$ mScore >=40
		// �� ���� ������ ���� 40�� �̻��̳�
		
		
		//lScore >= 40 $$ eScore >=40 $$ mScore
		
				
		//String result = (lScore >= 40 $$ eScore >=40 $$ mScore >=40) $$ average >= 60 ? "�հ�" : "���հ�";
		
	}
	
	
	
	
	// �ǽ����� 8
	public void practice8() {
		
		// �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		
		// String str = sc.nextLine();
		
		// char ch = str.charAt(7);
		
		// String result = ch == '2' ? "����" : "����";
		
		// System.out.println(result);
		
	
		char ch = sc.nextLine().charAt(7);
		
		String result = ch == '2' ? "����" : "����";
		
		System.out.println(result);
		
		
		
		
	}
	
	
	
	
	// �ǽ����� 9.
	public void practice9() {
		
		// Ű���� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
		// �׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸�
		// true�� ����ϰ� �ƴϸ� false�� ����ϼ���.
		// (��, �Է��� �� num1�� num2���� �۾ƾ� ��)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3 <= num1) || (num3 > num2);
		
		System.out.println(result);
		
		// Q. '�Է��� �� num1�� num2���� �۾ƾ� ��'�� �־ ���� �����ؾ��ϴ� �κ��� �ִٸ�?
		
		
		
	}
	
	
	
	
	// �ǽ����� 10. ��������.&&(and)������
	public void practice10() {
		
		// 3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������
		// true, �ƴϸ� false �� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է� 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է� 3 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num2 == num3;
		
		System.out.println(result);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
