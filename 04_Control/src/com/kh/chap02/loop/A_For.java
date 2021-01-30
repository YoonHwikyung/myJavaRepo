package com.kh.chap02.loop; //제어문 - 반복문

import java.util.Scanner;

public class A_For {
	/*
	 *  < 반복문 >
	 *  프로그램 흐름을 제어하는 제어문 중 하나
	 *  어떤 실행코드를 반복적으로 수행시켜줌
	 *  
	 *  크게 두 가지 종류로 나뉜다. (for문  / while문 (do-while문))
	 *  
	 *  * for 문 [표현법]
	 *  
	 *  for(초기식; 조건식; 증감식) { // 괄호 안에 반복횟수를 지정하기 위해 제시하는 것들이 많다.
	 *  	반복적으로 실행 시키고자 하는 코드;
	 *  }
	 *  
	 *   - 초기식 : 반복문이 시작될 때 "초기에 단 한 번만 실행되는 구문"
	 *   		 (보통 반복문에서 사용될 변수를 선언 및 초기화 하는 구문) ex) int i=0;
	 *   
	 *   - 조건식 : "반복문이 수행될 조건"을 작성하는 구문(영역)
	 *   		    조건식이 true일 경우 반복문 실행
	 *   		    조건식이 false가 되는 순간 반복문 멈추고 빠져나옴
	 *   		  (보통 초기식에서 제시한 변수를 가지고 조건식을 작성함) ex) i<10; (i가 10보다 작을경우만 실행시키겠다)
	 *   
	 *   - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
	 *   		 (보통 초기식에 제시한 변수를 가지고 증감식을 작성함) ex) i++
	 *   
	 *   
	 *   * for문 실행 흐름
	 *   for문 만나는 순간
	 *   초기식 --> 조건식 검사 --> true일 경우 해당 코드 실행 --> 증감식
	 *   	  --> 조건식 검사 --> true일 경우 해당 코드 실행 --> 증감식
	 *   	  --> 다시 조건식 --> true일 경우 해당 코드 실행  --> 증감식
	 *   	-------------- 이 내용이 계속 반복 ------------------
	 *   	  --> 다시 조건식 --> false일 경우 코드 실행x -------------->반복문 빠져나옴
	 *  
	 */
	
	// 간단한 예시로! 반복문을 쓰지 않았을 경우를 알아보자!
	public void method1() {
		// "안녕하세요"를 5번 반복해서 출력하고 싶을 때
		
		/* 기존방법
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		
		//* 반복문을 사용
		for(int i=1; i<=5; i++) { // i값이 1에서부터 5보다 작거나 같을 떄 까지 1씩 증가할 동안 반복 수행한다. (5회)
			System.out.println("안녕하세요");
		}
		
		for(int i=0; i<=4; i++) { // i값이 0에서부터 4까지 1씩 증가 할 동안 반복 수행(5회) // i<=4 를 i<5 로 표현해도 5회가 될 것!
			System.out.println("반갑습니다");
		}
		
		// 5번 증가를 시킬 떄 어떤 조건이 와도 5회만 수행된다면 다 맞다. =>다양한 방법으로 5번을 반복할 수 있다!
		// int i=10; i<15, i++
		// int i=10; i<=14, i++
		
		// => 가장 단순하게 반복되는 횟수를 지정하는 표현법
		// => int i=0; i<반복시키고자하는횟수; i++
		
	}
	
	
	// for문 연습. 복합대입연산자. 무수히 다양한 방법을 5회를 지정할 수 있다.
	public void method2() {
		
		// "다시만나요" 5 번 출력
		// i값이 1에서부터 10까지 매번 2씩 증가하는 동안 반복을 수행시켜보자
		// 1 3 5 7 9 (5회)
		
		for(int i=1; i<=10; i+=2) { // i+=2 는 i=i+2와 같다!
			System.out.println("다시만나요");

		}
		
	}
	
	
	// for문 연습. 반복문 안에서 초기식에 제시된 변수를 이용해보기.(초기식에 제시된 변수값을 출력)
	public void method3() {
		// 10회 반복 실행
		
		for(int i=1; i<=10; i++) { // i<11 도 같은 10번 반복이다!(무수히 많은 방법이 있다!)
			System.out.println(i); // => 이번에는 단순한 문장이 아니라 i에 담겨있는 매번 증가하는 값을 나타내보자!
								   // => 반복문 안에서 초기식에 제시된 변수를 이용하는 경우가 빈번해질 예정!
		}
		
		// 1 2 3 4 5 6 7 8 9 10 => 으로 출력하고싶다면?
		for(int i=1; i<11; i++) {
			// System.out.print(i); // => 이렇게하면 띄어쓰기가 없이 12345678910 으로 출력된다!
			// System.out.print(i + " "); // => 공백을 넣어주자! 
			System.out.print(i + "\t"); // tab을 넣고 싶으면 "\t"를 넣으면 된다!
		}  
	
	}
	
	
	// for문 연습. i값 응용
	public void method4() {
		// 위와 같이
		// 1 2 3 .... 8 9 10 출력 해보자! (10회 반복)
	
		// 아래의 반복문을 가지고 위의 출력
		for(int i=0; i<10; i++) {
			System.out.print(i + 1 + " ");
		}
	}
	
	
	
	// for문 연습. if else문 속의 반복문.
	// 사용자에게 반복할 횟수를 입력 받아 문자열을 반복적으로 출력해보자.
	public void method5() { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반복 시키고자하는 횟수(정수) : ");
		int count = sc.nextInt();
		
		// 1에서부터 10까지 1씩 증가 => 10회
		// 0에서부터 9까지 1씩 증가 => 10회
		
		// 1에서부터 count까지 1씩 증가  => count회
		// 0에서부터 count-1까지 1씩 증가 => count회
		
		// 먼저 유효성 체크를 하면 좋다!
		if(count > 0) { // 양수로 잘 입력했을 경우
			
			for(int i=1; i<=count; i++) { // count = 사용자가 입력한 횟수. 1보다 작은 수를 입력했을 떄에는 조건식이 false이기 때문에 for문을 빠져나간다.
				System.out.print(i + " ");
				}
			}else { // 양수가 아닌 값을 입려했을 경우
				System.out.println("양수만 입력해주세요.");
			}      
		}
	
	
	// for문 연습. 1씩 감소하는 후위감소 사용
	public void method6() {
		// 반대로도 가능
		// 5회 반복 => i값이 5에서부터 1까지 매번 1씩 감소하는 동안 반복 (5 4 3 2 1)
		for(int i=5; i>=1; i--) {
			System.out.print(i + " ");
		}
		
	}
		
	
	// for문 연습. 단독if문 활용
	public void method7() {
		// 1부터 10 사이의 홀수만을 출력
		// 1 3 5 7 9
		
		// i값이 1에서 부터 10까지 매번 2씩 증가하는 동안 반복 => 1 3 5 7 9 (5회)
		/*
		for(int i=1; i<=10; i+=2) {
			System.out.print(i + " ");
		} //=> 위에서 배운 방법이다! 다른 방법으로도 결과도출 해보자!
		*/
		
		// 1에서부터 10까지 매번 1씩 증가하는 동안 반복 => (10회) => 10회를 반복하지만 if문에서 홀수만 걸러 나오기 때문에 5개의 숫자만 보인다. 반복은 10회를 한 것.
		for(int i=1; i<=10; i++) { // => 여기서 i를 출력하면 1 ~10 다뜸. 여기서 홀수만 출력하고싶다면!? 유효성 검사로 선택적으로 실행되게 가능하다!
			
			if(i %2 == 1) { 
				System.out.print(i + " "); //  i를 2로 나눈 값의 나머지가 1이었을 경우에 실행되는 코드
			}
		}
		
	}
	
	// for문 연습. 총합 구하기. 규칙을 찾아 반복문을 적용시키기
	public void method8() {
		// 1에서 부터 10까지의 수의 총합
		// 1에서 10까지 매번 1씩 증가하는 값 총합 구하기
		// int sum = 1+2+3+4+5+6+7+8+9+10;
		
		/*
		 *  int sum = 0; // 누적해서 나올 결과값을 담을 박스
		 *  
		 *  sum += 1;
		 *  sum += 2;
		 *  sum += 3;
		 *  sum += 4;
		 *  ....
		 *  sum += 9;
		 *  sum += 10;
		 *  
		 *   규칙 => 누적해서 더하고자 하는 값이 1에서 부터 10까지 매번 1씩 증가되는 값!
		 *   => sum += 는 공통. 증가하는 값들만 1씩 증가하고 있음. 반복문 사용 가능하다!
		 */
		
		int sum = 0; // => 결과값을 담을 박스
		
		for(int i=1; i<=10; i++) {
			sum += i; // == sum = sum + i // i에 담겨있는 값들의 총 합을 구하겠다.
		}
		
		System.out.println("1에서 부터 10까지의 총 합계 : " + sum);
		
	}
	
	
	// for문 연습. 총합 구하기 응용(사용자가 입력한 수까지의 합계)
	public void method9() {
		//1에서부터 사용자가 입력한 수까지의 총합계
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : "); // 유도
		int num = sc.nextInt();    // 기록 
		
		
		/*
		 *  잘 모르겠으면 규칙을 찾기 위해 나열해보자
		 *  
		 *  int sum = 0;
		 *  
		 *  sum += 1;
		 *  sum += 2;
		 *  ....                                                                                                                                                                                                                                                                                                                                                                                                                                                       
		 *  sum += num;
		 *  
		 */
		
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i; // sum에 매번 누적되는 i 값을 담겠다.
		} 
		
		// 최종 출력 : "1에서 부터 xx까지의 총 합계 : xxx"
		System.out.println("1에서 부터 " + num + "까지의 총 합계 : " + sum); // => 반복되지 않도록 반복문 밖에 기술한다. 
		
		
		
	}
	
	// for문 연습. 총합 구하기 응용. 1에서부터 랜덤 값 까지의 총 합계. 정수 랜덤값 불러오기.
	public void method10() {
		
		// * 먼저 내가 원하는 정수 랜덤값을 호출하는 방법을 배워보자!
		
		// 1부터 매번 달라지는 '랜덤값' 까지의 총 합계를 구하기 위해
		// 랜덤값을 얻어올 수 있다. 내가 어디서 부터 어디까지 중 랜덤값인지 범위를 지정할 수 있다.
		// 범위 지정 : 1에서부터 10 사이의 랜덤 숫자
		
		/*
		 * Math 클래스
		 * Math 클래스에서 정의되어있는 random() 메소드를 호출하면 매번 다른 랜덤값을 얻어올 수 있음!
		 * 별도의 클래스 생성(new) 없이 바로 호출이 가능하다! (Scanner와 달리!)
		 * 
		 * Math.random()
		 * => 호출시 0.0 ~ 0.99999999999... 사이의 랜덤값 발생 (0.0 <= 랜덤값 < 1.0)
		 * 
		 */
		
		
		// * 실수 값만을 발생시키는 Math클래스에 담긴 double 값을 int값에 담아야한다. 우리는 정수 랜덤값을 원하므로.
		// => Math 클래스를 조작해가면서 내가 원하는 값을 얻어보자! 단계적으로 해결해보자!
		
		// int random = Math.random(); // ! 오류 : double형이라서 int에 담지지 않음. 여기에 10을 곱해본다면!?
	
		
		//int random = Math.random() * 10;
					// 0.0 <=  <1.0 =====> 랜덤값에 *10을 하면 0.0 ~ 10.0으로 변경 될 것.
					//==> 0.0 ~ 9.999999.. => 여전히 자료형 맞지 않음. 0도 포함되어있음. 그렇다면 여기에 1을 더해본다면?!
		
		//int random = Math.random() * 10 + 1;
					// 1.0 <= 랜덤값 < 11.0 ==> 1.0 ~ 10.99999..
					// => 여전히 자료형 맞지 않음 => 0은 없어졌으나 여전히 자료형이 맞지 않는다! 그렇다면 int로 강제형변환 한다면!?
		
		int random = (int)(Math.random() * 10 + 1); // 드디어 우리가 원하는 1 ~ 10 의 랜덤값을 얻었다!
					// 1 <= 랜덤값 < 11 ====> 1 ~ 10
		
		System.out.println("현재 발생된 랜덤 값 : " + random);
		
		
		// * 이제 랜덤값을 이용해 1에서부터 랜덤수 까지의 누적된 수의 합을 구해보자
		
		int sum = 0;
		
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		
		// 최종 : 1에서부터 xx까지의 총 합계 : xxx
		System.out.println("1에서부터 " + random + "까지의 총 합계 : " + sum);
	}
	
	
	// for문 연습. 
	public void method11() {
		
		// 사용자에게 문자열을 입력 받아
		// 각 인덱스별 한 문자를 매번 뽑아서 출력을 하고자 한다
		// 예를들어, "apple" => a p p l e
		
		/*
		 * 규칙 찾기
		 * String str = "apple";
		 * 
		 * a --> str.charAt(0) 출력
		 * p --> str.charAt(1) 출력
		 * p --> str.charAt(2) 출력
		 * l --> str.charAt(3) 출력
		 * e --> str.charAt(4) 출력
		 * 
		 * --> str.charAt()은 반복되고 인덱스가 0에서부터 매번 1씩 증가한다는 규칙을 알아챘다!
		 * 
		 *  = 내가 어떤 문자열을 입력했냐에 따라 길이(글자수), 마지막 인덱스도 다르다!
		 *  
		 *  
		 * * 문자열 길이 구하기
		 * 문자열의 길이 == 문자열.length()*
		 * 
		 * * 문자열의 마지막 인덱스 구하기
		 * apple 문자열의 길이(몇글자) : 5		strawberry 길이 : 10				kiwi 길이 : 4
		 * 01234 ->마지막 인덱스 : 4			0123456789 -> 마지막 인덱스 : 9		0123 -> 마지막 인덱스 : 3
		 *  => 찾아낸 규칙 : 마지막 인덱스 수 = 문자열의 길이 - 1
		 *  => 마지막 인덱스 수 = 문자열.length()-1
		 *  
		 * =이로써=> 0번 인덱스에서부터 마지막 인덱스(문자열.length()-1)까지 매번 1씩 증가할 때 마다 반복 수행 할 수 있다!
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		 
		
		for(int i=0; i<=str.length()-1; i++) { 
		// *for(int i=0; i<str.length(); i++)*랑 같은 것 더 간결하기 때문에 이것을 추천
			System.out.print(str.charAt(i) + " "); // i가 곧 인덱스 값이 된다.
		}
		
		
	}
	
	
	// for문 연습. 구구단 출력
	public void method12() {
		// 구구단 중에 2단 출력
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 *...
		 * 2 x 8 = 16
		 * 2 x 9 = 18
		 * 
		 */
		System.out.println("=== 2단 ===");
		for(int su=1; su<=9; su++) {
			// System.out.println("2 x " + su + " = " + 2*su);
			System.out.printf("%d x %d = %d\n", 2, su, 2*su);
		}
	}
	
	// for문 연습. for문 중첩사용
	public void method13() {
		// 2단부터 9단 까지 모두 출력
		
		/*
		System.out.println("=== 2단 ===");
		for(int su=1; su<=9; su++) {
			// System.out.println("2 x " + su + " = " + 2*su);
			System.out.printf("%d x %d = %d\n", 2, su, 2*su);
		}
		System.out.println(); // => 줄바꿈
		
		System.out.println("=== 3단 ===");
		for(int su=1; su<=9; su++) {
			// System.out.println("3 x " + su + " = " + 3*su);
			System.out.printf("%d x %d = %d\n", 3, su, 3*su);
		}                           
		System.out.println();
		
		System.out.println("=== 4단 ===");
		for(int su=1; su<=9; su++) {
			// System.out.println("4 x " + su + " = " + 4*su);
			System.out.printf("%d x %d = %d\n", 4, su, 4*su);
		}
		*/
		
		for(int dan=2; dan<=9; dan++) {
			
			System.out.println("=== " + dan + "단 ===");
			
			for(int su=1; su<=9; su++) {
		
			System.out.printf("%d x %d = %d\n", dan, su, dan*su);
			}
			
			System.out.println();
		}
		
		
	}
	
	// for문 중첩사용 간단 예시.
	public void method14() {
		// 1에서 5까지 1씩 증가하는 값을 출력하는 것을 - 3번 반복 해보자!
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		// * 중첩사용하지 않고 복사하는 방법
		/*
		for(int j=1; j<=5; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		for(int j=1; j<=5; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		for(int j=1; j<=5; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		*/
		
		
		//중첩사용으로 간단하게 만들어보자!
		
		for(int i=1; i<=3; i++) {	// => 행을 지정해주는 for문
			
			for(int j=1; j<=5; j++) {	// => 열을 지정해주는 for문
				System.out.print(j + " ");
			}
			System.out.println();
		
		}
	}
	
	
	// for문 중첩사용 예시. 별찍기
	public void method15() {
		// *****
		// *****
		// *****
		// *****
		
		// System.out.print('*')
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	

	// for문 중첩사용. 별찍기2
	public void method16() {
		//		     i  j
		// 1***		1행 1열일 경우 1출력
		// *2**		2행 2열일 경우 2출력
		// **3*		3행 3열일 경우 3출력
		// ***4		4행 4열일 경우 4출력
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=4; j++) {
				
				if(i == j) { 	//=>숫자출력
					System.out.print(i);
				}else {
				System.out.print("*");
				}
			}
			System.out.println();
			
		}
		
		
		
	}
	
	
	// for문 예시. 시간
	public void method17() {
		// 0시 0분 ~ 23시 59분 까지 출력 
		
		// 규칙 찾아보기
		
		// 0시 0분
		// 0시 1분
		// ...
		// 0시 58분
		// 0시 59분
		
		// 1시 0분
		// 1시 1분
		// ....
		// 1시 59분
		
		// 2시 0분
		// 2시 1분
		// ....
		// 2시 59분
		
		// ....
		
		// 23시 0분
		// 23시 1분
		// ....
		// 23시 59분
		
		// 시간은 0시 ~ 23시까지 1씩 증가 =? 바깥쪽 for문
		// 분은 매 시간마다 0분~50분까지 1씩 증가 => 안쪽 for문
		
		
		for(int hour=0; hour<24; hour++) { // 시간. hour<=23 이랑 같은 것
			
			for(int min=0; min<60; min++) {
				System.out.println(hour + "시 " + min + "분");
			}
			
			System.out.println();
			
		}
		
	}
	
	
	
	
	
	
		
	}

	
	
	
		

