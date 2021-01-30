package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] st = new Student[10];
		
		int i = 0;
		
		while(i<st.length) {
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			st[i] = new Student(grade, classroom, name, kor, eng, math);
		
			System.out.print("계속 입력하시겠습니까? (y/n) : ");
			char res = sc.nextLine().charAt(0);
			if(res == 'y' || res == 'Y') {
				i++;
			}else {
				break;
			}
			
		}
		
		// 학생들의 점수 평균
		
		int average = 0;
		for(int j=0; j<=i; j++) {
			average = (st[j].getKor() + st[j].getEng() + st[j].getMath()) / 3;
			System.out.println(st[j].information() + " 평균점수:" + average);
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		// 최대 10명의 학생 정보를 기록할 수 있게 배열 할당
		Student[] sd = new Student[2];
		
		//for(int i=0; i<sd.length; i++) {
		//	sd[i] = new Student();
		//}
		
		// while문을 사용하여 학생들의 정보를 계속 입력 받고
		// 한 명씩 추가 될 때마다 카운트함
		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'면 계속 객체 추가
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int i = 0;
		while(i<sd.length) {
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			sd[i] = new Student(grade, classroom, name, kor, eng, math);
			i++;
			}
		
		
		for(int j=0; j<2; j++) {
			System.out.println(sd[i].information());
		}
		
		
		
		
	
		
		
		
		//System.out.print("계속 입력하시겠습니까? (y/n) : ");
		//char res = sc.nextLine().charAt(0);
		//if(res != 'y' && res != 'Y') {
			//break;
		*/
		
	}
	

}
