package com.kh.example.run;

import com.kh.example.model.vo.Student;

public class ExampleRun {
	
	public static void main(String[] args) {
		
		// 홍길동 학생의 정보
		// 객체 생성
		Student hong = new Student();
		// 초기화
		hong.setGrade(5);
		hong.setClassroom(3);
		hong.setName("홍길동");
		hong.setHeight(169.3);
		hong.setGender('남');
		// 출력
		System.out.println("== " + hong.getName()+ "학생의 정보 ==");
		System.out.println(hong.information1());
		
	
		// 박재범 학생의 정보
		// 객체 생성
		Student park = new Student();
		// 초기화
		park.setGrade(3);
		park.setClassroom(1);
		park.setName("박재범");
		park.setHeight(175.9);
		park.setGender('남');
		// 출력
		System.out.println("\n== " + park.getName() + "학생의 정보 == ");
		System.out.println(park.information1());
		
		
		// 아이유 학생의 정보
		// 객체 생성
		Student iu = new Student();
		// 초기화
		iu.setGrade(6);
		iu.setClassroom(6);
		iu.setName("아이유");
		iu.setHeight(160.2);
		iu.setGender('여');
		// 출력
		System.out.println("\n== " + iu.getName() + "학생의 정보 ==");
		System.out.println(iu.information1());
		
		
		
		

		
	}

}
