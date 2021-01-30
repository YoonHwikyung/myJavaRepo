package com.kh.chap02.practice.example; // 반복문 실습문제

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		// 만일 1 미만의 숫자가 입력됐다면 "잘못 입력하셨습니다."를 출력하세요.
		// (For문 이용)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			
			}
		}
		 
	}
	//////////
	public void practice2() {
		// practice1() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		// "잘못 입력하셨습니다. 다시 입력해주세요." 가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for(int i=1; i<=num; i++) {
					System.out.print(i + " " );
				}
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

	
		}



	
	
	//////////
	public void practice3() {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for(int i=num; i>=1; i--) {
				System.out.print(i + " ");
			}
		}
		
		
		
	}
	
	//////////
	public void practice4() {
		// practice3() 문제와 동일하나, 1미만의 숫자가 입력됐다면
		// "잘못 입력하셨습니다. 다시 입력해주세요." 가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요. : ");
			int num = sc.nextInt();
			
			if(num>=1) {
				for(int i=num; i>=1; i--) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		
		
		
	}
	// QQQQQQ
	/////////
	public void practice5() {
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		// (for문 이용)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
			System.out.print(i + " + ");
		
		}
		System.out.println("=" + sum);
		

		
		
	}
	// QQQQQQQQQ
	//////////
	public void practice6() {
		// 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 "1이상의 숫자만을 입력해주세요"를 출력하세요.
		// (for문 이용)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int fN = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int sN = sc.nextInt();
		
		if(fN <= 0 || sN <= 0) {
			System.out.println("1 이상의 숫자만을 입력해주세요.");
		}else {
			
				
			}
		}
		
	
	
	//////////
	public void practice7() {
		// 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		// "1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		
	}
	//////////
	public void practice8() {
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		// (for문 이용)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("==== " + dan +"단 =====");
		for(int su=1; su<=9; su++) {
			System.out.printf("%d * %d = %d\n", dan, su, dan*su);
		}
		
	}
	//////////
	public void practice9() {
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		// 단, 2~9 사이의 숫자가 아닌 경우 "2~9 사이의 숫자만 입력해주세요"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}else {
			for(int dan=num; dan<=9; dan++ ) {
				System.out.println("==== " + dan + "단 ====");
				for(int su=1; su<=9; su++) {
					System.out.printf("%d * %d = %d\n", dan, su, dan*su);
				}
				System.out.println();
			}
			
		}
	}
	//////////
	public void practice10() {
		// practice9() 문제와 동일하나, 2~9사이의 숫자가 아닌 값이 입력됐다면
		// "2~9 사이의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			
			if(dan >= 2 && dan <= 9) { 
	
				for(; dan<=9; dan++) {
					System.out.println("==== " + dan + "단 ====");
					
					for(int su=1; su<=9; su++) {
					System.out.printf("%d * %d = %d\n", dan, su, dan*su);
					}
					System.out.println();
				}
				break;
	
			}else {
				System.out.println("2~9사이의 숫자를 입력해주세요.");
			}
			
		}
		
		
		
		
		
	}
	//////////
	public void practice11() {
		// 사용자로부터 시작 숫자와 공차를 입력 받아
		// 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		// 단, 출력되는 숫자는 총 10개입니다.
		
		// *'공차'는 숫자들 사이에서 일정한 숫자의 차가 준재하는 것을 말한다.
		// ex) 2, 7, 12, 17, 22 ...
		// 		5	5	5	5 => 여기서 공차는 5
		// (for문 이용)
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("시작 숫자 : ");
		 int start = sc.nextInt();
		 
		 System.out.print("공차 : ");
		 int num = sc.nextInt();
		 
		 // 일단 반복되는 횟수만 지정해보자. 
		 for(int i=0; i<10; i++) { // 0에서부터 9까지 매번 1씩 증가하는 동안 반복(10회)
			 
			 System.out.print(start + " ");
			 start += num; // => start = start + num;
			 
		 }
		
		
		
		/* 내가 푼 것
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) { 
		}
		*/
		
		
	}
	//////////
	public void practice12() {
		// 정수 두 개와 연산자(문자열로 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
		// 단, 해당 프로그램은 연산자 입력에 "exit"라는 값이 들어올 때까지 무한 반복하며
		// exit가 들어오면 "프로그램을 종료합니다."를 출력하고 종료합니다.
		// 또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
		// "0으로 나눌 수 없습니다. 다시 입력 해주세요."를 출력하며,
		// 없는 연산자가 들어올 시 "없는 연산자입니다. 다시 입력햊쉐요."라고 출력하고
		// 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			// 1. 연산자 입력 받기 (+, -, *, /, $, %) + exit => exit 이라는 문자열도 받아야 하니! 문자열형으로 받기!
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine(); // "+", "-", "*",..."exit" , "^"
			
			// => 사용자가 "exit"를 입력했을 경우 => "프로그램을 종료합니다" 출력 후 반복문 빠져나가야 한다!
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break; // if가 아닌 가장 가까운 반복분 while을 빠져나간다! 뒤의 내용 수행하지 않고! return으로 하면 메소드 자체를 빠져나가니 그것도 가능!
			}
			
			
			// 2. 두 개의 정수 입력 받기
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine(); // => 버퍼에 남아있는 /n를 지워줘야함! => 무한반복으로 그 다음이 nextLine이기 때문에!
			
			// >> 사용자가 / 또는 %와 같은 연산기호를 입력함과 동시에 두 번째 정수가 0일 경우
			// => "0으로 나눌 수 없습니다. 다시 입력해주세요."를 출력 후 반복문 다시 실행!
			
			if(op.equals("/") || op.equals("%") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
				continue; // 뒤 쪽 내용은 실행되지 않고 곧바로 반복문 위로 올라간다! > 반복문이 다시 실행된다!
			}
			
			
			// 3. 산술연산 하기 => 산술연산한 결과 바로 출력x => 결과를 변수에 기록해둘 것
			int result = 0; // 산술결과를 담아둘 변수를 세팅한 것
			 
			switch(op) {
			case "+": result = num1 + num2; break; // switch문의 break는 switch문만 빠져나가는 것!!
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2; break;
			case "%": result = num1 % num2; break; //일단 다 잘 입력했다고 생각하기
			// >> 혹시라도 없는 연산기호를 입력했을 경우 "없는 연산자입니다. 다시 입력해주세요."출력 후 반복문 다시 실행!
			default: System.out.println("없는 연산자입니다. 다시 입력해주세요.\n"); continue; // continue만나는 순간 조건문 위로 올라간다!
			}
			
			// 4. 산술연산 결과 출력 ex) xx 연산기호 xx = 연산결과
			System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);
			
			// 복잡한 경우 사용자가 잘 입력한 경우를 먼저 입력 후,
			// 하나하나 잘못입력한 경우를 넣어본 후 어느 곳에 유효성 검사를 해야할지 넣자!
		
		}
		
		
		
		
	}
	
	
}
