package com.kh.array; // 배열 : 배열의 개념

import java.util.Scanner;

public class A_Array {
	
	/*
	 * * 변수 : "자료형의 값 하나만"을 담을 수 있는 개념
	 * 		  ex) int a = 10;
	 * 			      a = 20; // 기존의 10은 버리고 20이라는 새로운 수가 담긴다.
	 * 
	 * * 배열 : "같은 자료형의 값 여러개"를 담을 수 있는 개념
	 * 			각 방마다 인덱스가 지정됨 (인덱스 0부터 시작!)
	 * 			ex) int[] arr = new int[5]; // 5개의 방을 만들어 두는 개념
	 * 				  arr[0] = 10;
	 * 				  arr[1] = 20;
	 * 				     ....
	 */
	
	public void method1() {
		
		// * 배열을 왜 써야할까?
		
		/*
		// 변수만을 가지고 프로그래밍을 하게 된다면..? 
		// 0, 1, 2, 3, 4 데이터를 기록하고 싶다!
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 변수에 담은 값 출력 하려면? => 일일히 출력해야 함(반복문 적용 불가능)
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		// 총 합계를 구할 때? => 일일히 입력해야 함
		int sum = num1 + num2 + num3 + num4 + num5; 
		System.out.println("총합계 : " + sum);
		*/
		
		// * 위와 같은 경우를 "배열"을 이용해서 프로그래밍 해보자! (선언+할당+선언과동시에할당, 출력하기, 합계 구하기)
		
		/*
		 * 1. 배열 선언 (여러개의 값들을 보관할 배열을 만들거야!)
		 * 	[표현법]
		 * 	자료형 배열명[];
		 *  자료형[] 배열명; // 둘 중 아무거나 써도 된다!
		 */
		int a; // 변수 선언
		
		//int arr[];
		//int[] arr;
		
		/*
		 * 2. 배열 할당 ( 이 배열에 몇 개의 값들을 보관할 건지 크기를 지정하는 과정 == 그 갯수만큼 방이 만들어짐)
		 *    배열명 = new 자료형[배열크기];
		 */
		
		//arr = new int[5];
		
		// * 배열 선언과 동시에 할당
		int[] arr = new int[5];
		
		/*
		 *  3. 각 인덱스에 값 대입
		 *  [표현법]
		 *  배열명[인덱스] = 값;
		 */
		
		
		// 배열의 가장 큰 장범 : 반복문을 활용할 수 있음!
		
		/* 하나 하나 대입한 경우
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		// arr이라는 배열에 5개의 방이 있고 그 안에 값을 넣어두었다
		// 규칙이 보인다! 규칙이 있다면 배열은 반복문이 사용 가능하다!
		// 반복문을 이용해보자!
		 * 
		 */
		//for(int i=0; i<=4; i++) { // 0에서부터 4(마지막 인덱스 == 배열의 크기-1)까지 매번 1씩 증가하는 동안 반복 수행
		//for(int i=0; i<=arr.length-1; i++) { // 배열의 크기 : 배열명.length		배열의 마지막 인덱스 : 배열명.length-1
		
		for(int i=0; i<arr.length; i++) {	// = i<=arr.length-1 와 같은 것!
			arr[i] = i; // i라는 변수를 인덱스로 사용하는 것!
		}
		
		
		// 5개의 정수 값이 잘 담겼는지 확인해보자!
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		=> 규칙이 보인다! 반복문 활용해보자!
		*/
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		
		}
		
		System.out.println(arr);
		
	}

	// * 배열의 주소값 개념 공부하기!
	public void method2() {
		// 배열의 주소값
		
		int i = 10;
		
		int[] iArr = new int[5];
		
		System.out.println("i : " + i); // 변수 출력
		System.out.println("iArr : " + iArr); // 배열 출력은 이렇게 하면? 배열의 주소값이 출력이 된다.
		System.out.println("iArr의 해쉬코드값 : " + iArr.hashCode());
		
		//실수값을 배열에 담아보자
		double[] dArr = new double[3];
		
		System.out.println("dArr : " + dArr); // dArr의 추소값 확인해보자! 고유주소이기 때문에 다 다르다!
		System.out.println("dArr의 해쉬코드값 : " + dArr.hashCode());
		
		/*
		 * * 메모리 구조를 그려가면서 알 수 있었던 점
		 * 
		 *  실제 값을 바로 담을 수 있는 변수를 '일반 변수'라고 얘기하고
		 *  주소 값을 담고 있는 변수를 '참조 변수(레퍼런스변수)'라고 한다.
		 *  
		 *  기본자료형(boolean, char, byte, short, int, long, float, double)으로 선언한 변수
		 *  => 일반 변수 => 실제 값을 바로 담을 수 있는 변수
		 *  
		 *  그 외에 자료형(int[], double[], char[], short[], ...., String, Scanner, 클래스...)으로 선언된 변수는
		 *  => 참조 변수 (레퍼런스 변수) => 주소값을 담고 있는 변수
		 *  
		 */

	}
	// 배열 선언과 동시에 할당, heap 공간에는 정말 해당 자료형의 기본값을 넣어주는지 확인해보자!
	public void method3() {
		
		// 배열 선언과 동싱 할당 => 그림을 그려 이해해보자!
		int[] iArr = new int[3]; // [0]번방, [1]번방, [2]번방
		double[] dArr = new double[5]; // [0]번방, [1]번방, [2]번방, [3]번방, [4]번방
		
		// 배열의 크기
		System.out.println("iArr 배열의 크기 : " + iArr.length);
		System.out.println("dArr 배열의 크기 : " + dArr.length);
		
		
		// heap 메모리 영역에는 jvm이 해당 자료형의 기본 값을 넣어준다! 이를 확인해보자!
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		for(int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		
		/*
		 * 각각의 인덱스에 값을 대입하지 않았음에도 불구하고 뭔가 담겨있음!
		 * 왜? heap은 절대 빈 공간이 존재할 수 없음!
		 * => JVM이 기본값으로 초기화를 진행해줌!
		 */
		
	}
	// 배열
	public void method4() {
		
		// int[] iArr;
		// iArr[0] = 10; => 길이를 정하지 않았기 때문에 오류남!
		
		int[] iArr = new int[5];
		
		/* 반복문을 사용하지 않은 경우
		iArr[0] = 1;
		iArr[1] = 2;
		iArr[2] = 3;
		iArr[3] = 4;
		iArr[4] = 5;
		// iArr[10] = 10; => 오류 : 반드시 존재하는 인덱스에만 접근해야 한다!
		*/
		
		// 반복문을 사용해서 값을 대입해보자!
		for(int i=0; i<iArr.length; i++) { // i<5라고 쓰는 것 보다 애초에 배열의 크기를 문법으로 적어주면 일일히 수정할 필요 없이 위에만 수정하면 된다! new int[5] -> new int[10]변경시
			//iArr[인덱스] = 값;
			iArr[i] = i + 1;
		}
		
		// 총합계 구하기/출력하기
		int sum = 0;
		
		/* 규칙 찾기
		sum += iArr[0];
		sum += iArr[1];
		....
		sum += iArr[4];
		*/
		
		for(int i=0; i<iArr.length; i++) { // i를 0으로 지정한건 i를 인덱스로 사용하기 위함
			sum += iArr[i];
			System.out.print(iArr[i] + " ");
		}
				
		System.out.println("\n총 합계 : " + sum);
		
		System.out.println(iArr); // => [I@6d06d69c 가 출력. 이를 해쉬코드값(10진수형)을 알아보자.
		System.out.println(iArr.hashCode()); // 1829164700 이 출력. 해쉬코드 == 주소값의 10진수 형태.
		

	}
	
	//배열의 단점
	public void method5() {
		
		int[] iArr = new int[5];
		
		int value = 2; // => int배열 인덱스에 2, 4, 6, 8, 10을 넣기위해 변수 이용!
		
		// 대입 반복문. 각 인덱스에 2, 4, 6, 8, 10 넣어보자! 
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = value;
			value += 2;
		}
		
		// 출력 반복문
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]); // iArr의 각 인덱스에 담긴 값을 출력해보자!
		}
		
		System.out.println("iArr의 해쉬코드 값 : " + iArr.hashCode());
		
		/*인덱스(방) 5,6 추가하고 싶을 때
		iArr[5] = 12;
		iArr[6] = 14;
		 => 없는 인덱스를 억지로 추가한다고 자동으로 인덱스수가 늘어나지 않는다.
		*/ 
		
		// * 배열의 가장 큰 단점
		// -한 번 지정한 배열의 크기는 변경 불가
		// => 배열의 크기를 변경하고자 한다면 어쩔 수 없이 다시 만들어야 한다..
		
		iArr = new int[7]; // => 배열의 크기를 변경(새로 생성)했다!
		System.out.println("=== 변경 후 iArr ===");
		System.out.println("jArr의 해쉬코드 값: " +iArr.hashCode()); // 위의 해쉬코드와 다르다!
		
		System.out.println("0번 인덱스 값 : " + iArr[0]); // => 원래 담겨 있던 값은 사라지고 새롭게 생성된 7자리 에서 0번 인덱스가 출력된다!, 둥둥 떠다니게된 인덱스5짜리는 자동 메모리 관리로 사라진다!
		
		/*
		 * 기존에 참조하고 있던 연결이 끊기고 새로운 곳을 참조
		 * 
		 * 연결이 끊어진 기존 배열은 Heap 영역에 둥둥 떠다닌다.
		 * => 일정 시간이 지나면 "가비지 컬렉터"가 지워준다.
		 * 		(자바 특징 : 자동 메모리 관리)
		 */
		
		// 지금 연결되어 있는 고리를 끊고자 한다면?
		iArr = null;
		
		System.out.println(iArr); // => 출력해보면 null이 나온다!
		//iArr[0] = 1;
		System.out.println(iArr.hashCode());
	
		// null
		// 참조자료형의 기본값
		// String str = null; -> 참조자료형
		
		// int i = 0; ->기본형
		// double d = 0.0; ->기본형
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	// 2020.12.30 (수) 12강
	
	// 배열 복습
	public void method6() {
		
		int num = 10;
		
		// 배열 선언 & 할당 => 그림 그려보기
		int[] arr = new int[3];
		
		// 값 대입
		arr[0] = 100 ; // arr 주소지의 0번 방까지 가서 100이라는 값을 대입하고 싶어
		
		// 반복문 활용한 값 대입
		for(int i=0; i<arr.length; i++) {
			arr[i] = 100; // arr의 i번째 인덱스에 100를 넣겠다.
		}
		
		// 반복문 활용한 값 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		// 배열의 크기 변경 -> 불가능
		arr = new int[5];
		// => 새로운 고유주소를 가진 5개의 방이 생기고 그것을 참조한다. 기존의 3개의 방은 "가비지 컬렉터"가 삭제한다.
		
	}
	
	// 랜덤값
	public void method7() {
		
		int[] arr = new int[10]; // 0~9번 인덱스 생성되었음
		
		// 반복문 활용한 랜덤값 대입
		// 51~100 사이의 랜덤값을 넣어보자!
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 50 + 51); // * : 랜덤값 갯수 (끝 수가 아님!!), + : 시작 값. 
							// 52 <= 랜덤값 < 101
		}
		
		// 반복문 활용한 랜덤값 출력 (한꺼번에 가능하지만 연습을 위해)
		for(int i=0; i<arr.length; i++) {
			// arr[x] : xx 형식으로 출력해보자!
			System.out.printf("arr[%d] : %d\n", i, arr[i]); // => 실행 할 때다 매번 랜덤값이 담겨져 있을 것!
			
		}
		
	}
	
	// 사용자에게 입력 받은 문자열을 대입/출력(string)
	public void method8() {
		
		String[] arr = new String[5]; // 마지막인덱스 =4 (배열의 크기 -1)
		
		// String의 기본 값 null
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]); // => 출력 결과를 보면 String의 기본 값은 null임을 확인할 수 있다!
		}
	
		// 입력 받은 값 대입. 매번 사용자에게 좋아하는 과일을 입력 받아 각 인덱스에 담기
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print("좋아하는 과일 입력 : ");
			arr[i] = sc.nextLine(); // => 시용자가 입력한 문자열을 각각의 인덱스에 순차적으로 담아보자!
		} // => 각각의 인덱스에 사용자가 입력한 과일명이 담아져 있을 것!
		
		
		// 입력 받은 값 출력
		for(int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	// 사용자에게 입력 받은 키를 대입/출력(+총합,평균)
	public void method9() {
		// 3명의 사용자에게 매번 키의 정보를 입력 받아 배열에 담아두고
		// 3명의 키의 총 합계, 평균값 구하기
		
		// 대입
		Scanner sc = new Scanner(System.in);
		
		double[] heights = new double[3]; // 마지막 인덱스 : 2
		
		for(int i=0; i<heights.length; i++) {
			
			System.out.print("키 입력(cm) : ");
			heights[i] = sc.nextDouble(); // => 3명의 사용자가 입력한 각각의 키를 heights의 인덱스에 각각 넣곘다.
		}
		
		// 출력 ( 출력, 합, 평균)
		double sum = 0.0; // 반복문 실행 전에 미리 총합을 담아둘 변수를 만들어두자!
		
		for(int i=0; i<heights.length; i++) {
			System.out.println(heights[i]);
			sum += heights[i];
		}
		
		//System.out.println("세 명의 키 총 합계 :" + sum);
		//System.out.println("세 명의 키 평균 : " + (sum / heights.length)); // heights.length == 크기 == 3 == 3명
		// => 결과 : 495.40000000000003 /165.13333333333335
		// => printf를 이용해 %.1를 이용하면 소수점 아래 한 자리 수 까지만 표현 할 수 있다.
		
		System.out.printf("세 명의 키의 총 합 계 : %.1f\n", sum); // %f => 더블형. %.1f => 더블형 소수점 첫 번째 자리 까지.
		System.out.printf("세 명의 키의 평균 : %.1f", sum / heights.length);
		
	}
	
	
	// char배열에 입력 받은 문자열의 각 문자들 대입/출력
	public void method10() {
		// 사용자에게 문자열을 입력 받은 후 각 문자들을 char배열에 담기
		
		// 1. 사용자에게 문자열을 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		
		// 2. char 배열 생성 해두기 (배열 크기 == 문자열의 길이만큼)
		// 배열은 크기를 지정해야하는데, 사용자가 입력한 문자열의 크기를 모른다.
		char[] arr = new char[str.length()]; // [문자열의 길이] : 문자열.length()
		
		
		// 3. 문자열에서 각 인덱스별 문자를 뽑아서 char배열의 각 인덱스에 담기
			/* 규칙 찾기
			arr[0] = str.charAt(0); // arr 배열의 0번 인덱스에 문자열 첫 번째 문자를 담을거야
			arr[1] = str.charAt(1);
			....
			arr{마지막인덱스] = str.charAt(마지막인덱스);
			=> 반복문을 활용할 수 있겠다!
			*/
		
		for(int i=0; i<arr.length; i++) { // 방의 크기 == 사용자가 입력한 문자열의 길이 i<str.length()도 가능하다!
			arr[i] = str.charAt(i);
		}
		
		// 4. char배열의 각 인덱스에 잘 담겨있는지 출력해보기
		for(int i=0; i<str.length(); i++) {
			System.out.println(arr[i]);
		}

	}
	
	// 배열 선언&할당&대입 동시에 하기
	public void method11() {
		// 배열에 담고자 하는 값들이 정해져 있을 경우
		// 각 인덱스에 값을 담은 채로 배열을 생성할 수 있는 방법
		
		
		 // 지금까지의 흐름
		int[] arr = new int[4]; //=> 배열 선언과 동시에 할당
		arr[0] = 1;				//=> 그 후에 각 인덱스에 값 초기화(대입)
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		//=> 이 과정을 한 번에 할 수 있다!
		
		//배열 선언 및 할당과 동시에 초기화(대입) 한 큐에 끝내기

		// 첫 번째 방법
		// 자료형[] 배열명 = new 자료형[] {값, 값, 값, 값};
		int[] arr1 = new int[] {1, 2, 3, 4};
		
		
		// *두 번째 방법
		// 자료형[] 배열명 = {값, 값, 값, 값};
		int[] arr2 = {1, 2, 3, 4};
		
		// => 공간을 확보하지 않고 중괄호 안에 값들을 순차적으로 넣어준다.
		
		// arr, arr1, arr2에 담겨있는 값 모두 같다! 그렇다면 arr == arr1 == arr2 인것인가?
		System.out.println(arr == arr1);
		System.out.println(arr1 == arr2);
		// false 
		// => 주소값 간의 동등비교이기 때문에 false!
		
		// String 문자열 동등비교 할 때..!!
		// => 변수명.equals("비교하고자하는 문자열") 이었다!
		// => String은 나중에 다시 깊게 공부하자!
		
		// 여기서 배운 것을 바탕응로
		// 배열 복사에 대해 배워보자!
	}
	
	
}
