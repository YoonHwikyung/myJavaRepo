package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	
	// 실습문제 1.
	public void practice1() {
		
		// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "ㅇㅇ메뉴입니다."룰,
		// 종료 번호를 누르면 "프로그램이 종료됩니다."를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요. : ");
		
		char num = sc.nextLine().charAt(0);
		
		if(num == '1') {
			System.out.println("입력 메뉴입니다."); // menu + "메뉴입니다"
		}else if(num == '2') {
			System.out.println("수정 메뉴입니다.");
		}else if(num == '3') {
			System.out.println("조회 메뉴입니다.");
		}else if(num == '4') {
			System.out.println("삭제 메뉴입니다.");
		}else if(num == '9') {
			System.out.println("프로그램이 종료됩니다.");
		}else {
			System.out.println("잘못 입력하셨습니다. 다시 시도해주십시오.");
		}
		
	}
	
	// 실습문제 2. if-else if 중첩사용
	public void practice2() {
		
		// 키보드로 입력 받은 정수가 양수이면서 짝수일 떄만 "짝수다"를 출력하고,
		// 짝수가 아니면 "홀수다"를 출력하세요.
		// 양수가 아니면 "양수만 입력해주세요."를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("양수만 입력해주세요.");
		}else {	
			if(num %2 ==0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}
	}
	
	
	
	// 실습문제 3.
	public void practice3() {
		
		// 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		// 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		// (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		// 합격 했을 경우 과목 별 점수와 합계, 평균, "축하합니다, 합격입니다!"를 출력하고
		// 불합격인 경우에는 "불합격입니다."를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int lc = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int ec = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int mc = sc.nextInt();
		
		int sum = lc + ec + mc;
		double average = (lc + ec + mc) / 3;
		
		if(lc < 40) { // 불합격 부분 결과 오류남
			System.out.println("불합격입니다."); 
		}else if(ec < 40) {
			System.out.println("불합격입니다.");
		}else if(mc < 40) { //
			System.out.println("불합격입니다.");
		}else if(average >= 60) {
			System.out.println("국어 : " + lc);
			System.out.println("영어 : " + ec);
			System.out.println("수학 : " + mc);
			System.out.println("합계 : " + sum);
			System.out.println("평균  : " + average);
			System.out.println("축하합니다, 합격입니다!");
		}
		
	}
	
	
	
	// 실습문제 4. switch문(+break 부분 사용)
	public void practice4() {
		
		// 수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 에제를
		// switch문으로 바꿔서 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		// 1, 2, 12월  => "겨울"
		// 3, 4, 5월  => "봄"
		// 6, 7, 8월 => "여름"
		// 9, 10, 11월 => "가을"
		// 잘못 입력했을 경우 => "월은 잘못 입력된 달입니다."
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 12: System.out.println(month + "월은 겨울입니다."); break;
		case 3:
		case 4:
		case 5: System.out.println(month + "월은 봄입니다."); break;
		case 6:
		case 7:
		case 8: System.out.println(month + "월은 여름입니다."); break;
		case 9:
		case 10:
		case 11: System.out.println(month + "월은 가을입니다."); break;
		default: System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
	}
	
	
	
	// 실습문제 5.
	public void practice5( ) {
		
		// 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		// 로그인 성공 시 "로그인 성공",
		// 아이디가 틀렸을 시 "아이디가 틀렸습니다."
		// 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다."를 출력하세요.
	
		Scanner sc = new Scanner(System.in);
		
	    // 아이디 : mavis / 비밀번호 : 1234
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if(id != "mavis") {
			System.out.println("아이디가 틀렸습니다.");
		}else if(pw != "1234") {
			System.out.println("비밀번호가 틀렸습니다.");
		}else {
			System.out.println("로그인 성공");
		}
	
	
	
	}
		
	

	// 실습문제 6. switch문(+break 부분 사용)
	public void practice6() {
		//사용자에게 관리자, 회원,비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		// 단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고,
		// 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		// 비회원은 게시글 조회만 가능합니다.
		// (단, 잘못 입력하였을 경우 "잘못 입력했습니다."라는 출력문이 되도록)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 등급 : ");
		String level = sc.nextLine();
		
		switch(level) {
		case "관리자": System.out.println("회원관리, 게시글 관리");
		case "회원" : System.out.println("게시글 작성, 댓글 작성");
		case "비회원" : System.out.println("게시글 조회"); break;
		default: System.out.println("잘못 입력했습니다.");
		}
		
	}
	
	
	
	// 실습문제 7. 
	public void practice7() {
		// 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		// 저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
		// BMI = 몸무게 / (키(m) * 키(m))
		// BMI가 18.5 미만일 경우 저체중 / 18.5 이상 23 미만일 경우 정상체중
		// BMI가 23 이상 25 미만일 경우 과체중 / 25 이상 30 미만일 경우 비만
		// BMI가 30 이상일 경우 고도 비만
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요. : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi < 25) {
			System.out.println("과체중");
		}else if(bmi < 30) {
			System.out.println("비만");
		}else if(bmi > 30) {
			System.out.println("고도비만");
		}
		
	}
	
	
	
	// Q 실습문제 8. => 강의에서 진행
	public void practice8() {
		// 키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		// (단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
		// "잘못 입력하셨습니다. 프로그램을 종료합니다." 출력)
		// (printf()문을 이용하여 마지막 출력문을 작성해보시오.)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
	
		// 유효성 체크. 두 정수 모두 양수인지 아닌지 판별
		if(num1 > 0 && num2 > 0) {	// 모두 양수로 잘 입력했을 경우
			
			
			int result = 0; // 산술연산한 결과를 잠시 보관할 변수
			
			switch(ch) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다."); return;	
			}
			
			// xx x xx = xxx
			System.out.printf("%d %c %d = %d" , num1, ch, num2, result);
			
		}else {	//잘못된 정수를 입력 했을 경우
			System.out.println("양수가 아닌 값을 입력했습니다. 프로그램을 종료합니다.");
		}
		
	}
	
	
	
	//실습문제 9.
	public void practice9() {
		// 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		
		System.out.print("선택 : ");
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
		default: System.out.println("잘못된 메뉴를 선택했습니다.");
		}
		
	}








}


