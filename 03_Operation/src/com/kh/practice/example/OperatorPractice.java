package com.kh.practice.example; // 연산자 실습문제

import java.util.Scanner;

public class OperatorPractice {

	// 실습문제 1.
	public void practice1() {
		
		// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다",
		// 양수가 아니면 "양수가 아니다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : "양수가 아니다";
		
		System.out.println(result);
		
		
	}
	
	
	
	
	
	// 실습문제 2. 삼항연산자 중첩사용
	public void practice2() {
		
		// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다"
		// 양수가 아닌 경우 중에서 0이면 "0이다", 0이 아니면 "음수다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : (num == 0) ? "0이다" : "음수다";
		
		System.out.println(result);
		

		
	}
	
	
	
	
	// 실습문제 3. 연산자 - 산술연산&비교연산
	public void practice3() {
		
		// 키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다",
		// 짝수가 아니면 "홀수다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		
		int num = sc.nextInt();
		
		String result = num %2 == 0 ? "짝수다" : "홀수다";
		
		System.out.println(result);
		
		
	}
	
	
	
	
	
	// 실습문제 4. 
	public void practice4() {
		
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다.
		// 인원 수와 사탕 개수를 키보들 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");	
		int pNum = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int cNum = sc.nextInt();
		
		int dNum = cNum / pNum;
		int rNum = cNum % pNum;
		
		System.out.println("1인당 사탕 개수 : " + dNum);
		System.out.println("남는 사탕 개수 : " + rNum);
		
		
	}
	
	
	
	
	 // 실습문제 5. 삼항연산자 (+ sc.nextLine();, printf 활용)
	public void practice5() {
		
		// 키보드로 입력 받은 값들을 변수에 기록하고
		// 저장된 변수 값을 화면에 출력하여 확인하세요.
		// 이 때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 처리 하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classN = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		
		String result = gender == 'M' ? "남학생" : "여학생";
		
		//System.out.println(grade + "학년 " + classN + "반 " + num + "번 " + name+ " " + result + "의 성적은 " + score + "이다. ");
		 
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, classN, num, name, result, score);
		
		
	}
	
	
	
	
	// 실습문제 6. 삼항연산자 중첩사용 
	public void practice6() {
		
		// 나이를 키보드로 입력 받아 어린이(13세 이하)인지,
		// 청소년(13세 초과 ~ 19세 이하)인지,
		// 성인(19세 초과)인지 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		
		int age = sc.nextInt();
		
		String result = age <= 13 ? "어린이" : age <= 19 ? "청소년" : "성인";
		
		System.out.println(result);
		
		
	}
	
	
	
	
	// Q 실습문제 7. 
	public void practice7() {
		
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		// 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3)을 구하세요.
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int lScore = sc.nextInt();
		
		System.out.print("영어 : ");
		int eScore = sc.nextInt();
		
		System.out.print("수학 : ");
		int mScore = sc.nextInt();
		
		int sum = lScore + eScore + mScore;
		
		int everage = sum /3;
		
		//lScore >= 40 $$ eScore >=40 $$ mScore >=40
		// 세 과목 점수가 각각 40점 이상이냐
		
		
		//lScore >= 40 $$ eScore >=40 $$ mScore
		
				
		//String result = (lScore >= 40 $$ eScore >=40 $$ mScore >=40) $$ average >= 60 ? "합격" : "불합격";
		
	}
	
	
	
	
	// 실습문제 8
	public void practice8() {
		
		// 주민번호를 이용하여 여자인지 남자인지 구분하여 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		
		// String str = sc.nextLine();
		
		// char ch = str.charAt(7);
		
		// String result = ch == '2' ? "여자" : "남자";
		
		// System.out.println(result);
		
	
		char ch = sc.nextLine().charAt(7);
		
		String result = ch == '2' ? "여자" : "남자";
		
		System.out.println(result);
		
		
		
		
	}
	
	
	
	
	// 실습문제 9.
	public void practice9() {
		
		// 키보들 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		// 그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면
		// true를 출력하고 아니면 false를 출력하세요.
		// (단, 입력할 때 num1은 num2보다 작아야 함)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3 <= num1) || (num3 > num2);
		
		System.out.println(result);
		
		// Q. '입력할 때 num1은 num2보다 작아야 함'에 있어서 따로 설정해야하는 부분이 있다면?
		
		
		
	}
	
	
	
	
	// 실습문제 10. 논리연산자.&&(and)연산자
	public void practice10() {
		
		// 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면
		// true, 아니면 false 를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 3 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num2 == num3;
		
		System.out.println(result);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
