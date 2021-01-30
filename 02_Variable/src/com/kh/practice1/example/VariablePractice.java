package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		
		// 실습문제 1. 
		// 이름, 나이, 성별, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
		
		
		//Scanner sc = new Scanner(String.in); => (System.in) 이다!!
		Scanner sc = new Scanner(System.in);
		
		// 이름, 성별, 나이, 키
		
	
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
	
		sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
				
		
	}
	
	
	
	
	
	public void method2() {
		
		// 실습문제 2.
		// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기 한 몫을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int firstN = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int secondN = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (firstN + secondN));
		System.out.println("빼기 결과 : " + ( firstN - secondN ));
		System.out.println("곱하기 결과 : " + ( firstN * secondN ));
		System.out.println("나누기 결과 : " + (firstN / secondN ));
		
		
	}
	
	public void method3() {
		
		// 실습문제 3.
		// 키보드로 가로,세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		// * 참고 (면적=가로*세로, 둘레=(가로+세로)*2)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double lengthN = sc.nextDouble();
		
		System.out.print("세로 : ");
		double heigthN =sc.nextDouble();
		
		System.out.println("면적 : " + (lengthN * heigthN));
		System.out.println("둘레 : " + (lengthN + heigthN) * 2);
		
		
	}
	
	
	
	
	
	public void method4() {
		
		// 실습문제 4.
		// 영어 문자열을 키보드로 입력 받아 앞의 문자 세 개를 출력하세요.
		// * 힌트 => charAt(인덱스) 메소드 활용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String st = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + st.charAt(0));
		System.out.println("두 번째 문자 : " + st.charAt(1));
		System.out.println("세 번째 문자 : " + st.charAt(2));
		
		
		//char word1 = sc.nextLine().charAt(0);
		//char word2 = sc.nextLine().charAt(1);
		//char word3 = sc.nextLine().charAt(2);
		
		//System.out.println("첫 번째 문자 : " + word1);
		//System.out.println("두 번째 문자 : " + word2);
		//System.out.println("세 번째 문자 : " + word3);
		
		
		//System.out.println("첫 번째 문자 : " + sc.nextLine().charAt(0));
		//System.out.println("두 번째 문자 : " + sc.nextLine().charAt(1));
		//System.out.println("세 번째 문자 : " + sc.nextLine().charAt(2));
		
		
		
		
	}
	
	
	
	
}
