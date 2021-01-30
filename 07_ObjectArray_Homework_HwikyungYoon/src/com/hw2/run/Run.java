package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] st = new Student[10];
		
		int i = 0;
		
		while(i<st.length) {
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			System.out.print("�� : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�������� : ");
			int kor = sc.nextInt();
			System.out.print("�������� : ");
			int eng = sc.nextInt();
			System.out.print("�������� : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			st[i] = new Student(grade, classroom, name, kor, eng, math);
		
			System.out.print("��� �Է��Ͻðڽ��ϱ�? (y/n) : ");
			char res = sc.nextLine().charAt(0);
			if(res == 'y' || res == 'Y') {
				i++;
			}else {
				break;
			}
			
		}
		
		// �л����� ���� ���
		
		int average = 0;
		for(int j=0; j<=i; j++) {
			average = (st[j].getKor() + st[j].getEng() + st[j].getMath()) / 3;
			System.out.println(st[j].information() + " �������:" + average);
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		// �ִ� 10���� �л� ������ ����� �� �ְ� �迭 �Ҵ�
		Student[] sd = new Student[2];
		
		//for(int i=0; i<sd.length; i++) {
		//	sd[i] = new Student();
		//}
		
		// while���� ����Ͽ� �л����� ������ ��� �Է� �ް�
		// �� �� �߰� �� ������ ī��Ʈ��
		// ��� �߰��� ������ �����, ��ҹ��� ������� 'y'�� ��� ��ü �߰�
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int i = 0;
		while(i<sd.length) {
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			System.out.print("�� : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�������� : ");
			int kor = sc.nextInt();
			System.out.print("�������� : ");
			int eng = sc.nextInt();
			System.out.print("�������� : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			sd[i] = new Student(grade, classroom, name, kor, eng, math);
			i++;
			}
		
		
		for(int j=0; j<2; j++) {
			System.out.println(sd[i].information());
		}
		
		
		
		
	
		
		
		
		//System.out.print("��� �Է��Ͻðڽ��ϱ�? (y/n) : ");
		//char res = sc.nextLine().charAt(0);
		//if(res != 'y' && res != 'Y') {
			//break;
		*/
		
	}
	

}
