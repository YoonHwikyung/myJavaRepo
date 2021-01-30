package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	
	// �ǽ����� 1.
	public void practice1() {
		
		// �Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ "�����޴��Դϴ�."��,
		// ���� ��ȣ�� ������ "���α׷��� ����˴ϴ�."�� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("9. ����");
		
		System.out.print("�޴� ��ȣ�� �Է��ϼ���. : ");
		
		char num = sc.nextLine().charAt(0);
		
		if(num == '1') {
			System.out.println("�Է� �޴��Դϴ�."); // menu + "�޴��Դϴ�"
		}else if(num == '2') {
			System.out.println("���� �޴��Դϴ�.");
		}else if(num == '3') {
			System.out.println("��ȸ �޴��Դϴ�.");
		}else if(num == '4') {
			System.out.println("���� �޴��Դϴ�.");
		}else if(num == '9') {
			System.out.println("���α׷��� ����˴ϴ�.");
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �õ����ֽʽÿ�.");
		}
		
	}
	
	// �ǽ����� 2. if-else if ��ø���
	public void practice2() {
		
		// Ű����� �Է� ���� ������ ����̸鼭 ¦���� ���� "¦����"�� ����ϰ�,
		// ¦���� �ƴϸ� "Ȧ����"�� ����ϼ���.
		// ����� �ƴϸ� "����� �Է����ּ���."�� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("����� �Է����ּ���.");
		}else {	
			if(num %2 ==0) {
				System.out.println("¦����");
			}else {
				System.out.println("Ȧ����");
			}
		}
	}
	
	
	
	// �ǽ����� 3.
	public void practice3() {
		
		// ����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�� ����� ����ϰ�
		// �հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���.
		// (�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���)
		// �հ� ���� ��� ���� �� ������ �հ�, ���, "�����մϴ�, �հ��Դϴ�!"�� ����ϰ�
		// ���հ��� ��쿡�� "���հ��Դϴ�."�� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int lc = sc.nextInt();
		
		System.out.print("�������� : ");
		int ec = sc.nextInt();
		
		System.out.print("�������� : ");
		int mc = sc.nextInt();
		
		int sum = lc + ec + mc;
		double average = (lc + ec + mc) / 3;
		
		if(lc < 40) { // ���հ� �κ� ��� ������
			System.out.println("���հ��Դϴ�."); 
		}else if(ec < 40) {
			System.out.println("���հ��Դϴ�.");
		}else if(mc < 40) { //
			System.out.println("���հ��Դϴ�.");
		}else if(average >= 60) {
			System.out.println("���� : " + lc);
			System.out.println("���� : " + ec);
			System.out.println("���� : " + mc);
			System.out.println("�հ� : " + sum);
			System.out.println("���  : " + average);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}
		
	}
	
	
	
	// �ǽ����� 4. switch��(+break �κ� ���)
	public void practice4() {
		
		// ���� �ڷ�(7page)���� if������ �Ǿ��ִ� ��, ����, ����, �ܿ� ������
		// switch������ �ٲ㼭 ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		// 1, 2, 12��  => "�ܿ�"
		// 3, 4, 5��  => "��"
		// 6, 7, 8�� => "����"
		// 9, 10, 11�� => "����"
		// �߸� �Է����� ��� => "���� �߸� �Էµ� ���Դϴ�."
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 12: System.out.println(month + "���� �ܿ��Դϴ�."); break;
		case 3:
		case 4:
		case 5: System.out.println(month + "���� ���Դϴ�."); break;
		case 6:
		case 7:
		case 8: System.out.println(month + "���� �����Դϴ�."); break;
		case 9:
		case 10:
		case 11: System.out.println(month + "���� �����Դϴ�."); break;
		default: System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}
		
	}
	
	
	
	// �ǽ����� 5.
	public void practice5( ) {
		
		// ���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
		// �α��� ���� �� "�α��� ����",
		// ���̵� Ʋ���� �� "���̵� Ʋ�Ƚ��ϴ�."
		// ��й�ȣ�� Ʋ���� �� "��й�ȣ�� Ʋ�Ƚ��ϴ�."�� ����ϼ���.
	
		Scanner sc = new Scanner(System.in);
		
	    // ���̵� : mavis / ��й�ȣ : 1234
		
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String pw = sc.nextLine();
		
		if(id != "mavis") {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}else if(pw != "1234") {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else {
			System.out.println("�α��� ����");
		}
	
	
	
	}
		
	

	// �ǽ����� 6. switch��(+break �κ� ���)
	public void practice6() {
		//����ڿ��� ������, ȸ��,��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ� ������ ����ϼ���.
		// ��, �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�,
		// ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
		// ��ȸ���� �Խñ� ��ȸ�� �����մϴ�.
		// (��, �߸� �Է��Ͽ��� ��� "�߸� �Է��߽��ϴ�."��� ��¹��� �ǵ���)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ��� : ");
		String level = sc.nextLine();
		
		switch(level) {
		case "������": System.out.println("ȸ������, �Խñ� ����");
		case "ȸ��" : System.out.println("�Խñ� �ۼ�, ��� �ۼ�");
		case "��ȸ��" : System.out.println("�Խñ� ��ȸ"); break;
		default: System.out.println("�߸� �Է��߽��ϴ�.");
		}
		
	}
	
	
	
	// �ǽ����� 7. 
	public void practice7() {
		// Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� ��� ����� ����
		// ��ü�� / ����ü�� / ��ü�� / ���� ����ϼ���.
		// BMI = ������ / (Ű(m) * Ű(m))
		// BMI�� 18.5 �̸��� ��� ��ü�� / 18.5 �̻� 23 �̸��� ��� ����ü��
		// BMI�� 23 �̻� 25 �̸��� ��� ��ü�� / 25 �̻� 30 �̸��� ��� ��
		// BMI�� 30 �̻��� ��� �� ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ���. : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI ���� : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("��ü��");
		}else if(bmi < 23) {
			System.out.println("����ü��");
		}else if(bmi < 25) {
			System.out.println("��ü��");
		}else if(bmi < 30) {
			System.out.println("��");
		}else if(bmi > 30) {
			System.out.println("����");
		}
		
	}
	
	
	
	// Q �ǽ����� 8. => ���ǿ��� ����
	public void practice8() {
		// Ű����� �� ���� ����� ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ����ϼ���.
		// (��, ����� �ƴ� ���� �Է��ϰų� ���õǾ� ���� ���� ���� ��ȣ�� �Է� ���� ��
		// "�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�." ���)
		// (printf()���� �̿��Ͽ� ������ ��¹��� �ۼ��غ��ÿ�.)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
	
		// ��ȿ�� üũ. �� ���� ��� ������� �ƴ��� �Ǻ�
		if(num1 > 0 && num2 > 0) {	// ��� ����� �� �Է����� ���
			
			
			int result = 0; // ��������� ����� ��� ������ ����
			
			switch(ch) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return;	
			}
			
			// xx x xx = xxx
			System.out.printf("%d %c %d = %d" , num1, ch, num2, result);
			
		}else {	//�߸��� ������ �Է� ���� ���
			System.out.println("����� �ƴ� ���� �Է��߽��ϴ�. ���α׷��� �����մϴ�.");
		}
		
	}
	
	
	
	//�ǽ����� 9.
	public void practice9() {
		// �տ� ������ �ǽ������� �����Ͽ� ������ �� �ִ� �޴�ȭ���� �����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		
		System.out.print("���� : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: practice1(); break;
		case 2: practice2(); break;
		case 3: practice3(); break;
		case 4: practice4(); break;
		case 5: practice5(); break;
		case 6: practice6(); break;
		case 7: practice7(); break;
		case 8: practice8(); break;
		default: System.out.println("�߸��� �޴��� �����߽��ϴ�.");
		}
		
	}








}


