package com.kh.array;

import java.util.Scanner;

public class C_DimensionalArray {
	 
	// 이차원 배열 : 일차원 배열 여러개를 하나로 묶은 것이 2차원 배열
	
	public void method1() {
		
		// 1차원 배열 복습 + 그림
		int[] iArr = new int[3];
		
		/*
		 * 1. 이차원 배열 선언
		 * 	    자료형 배열명[][];
		 * 	    자료형[] 배열명[];
		 * 	    자료형[][] 배열명;
		 * 	
		 */
		
		int arr1[][];
		int[] arr2[];
		int[][] arr3;
		// 바로 담을 수 있나? 박스만 만들어져 있을 뿐, 할당(공간 확보)를 해야 값을 넣을 수 있다!
		
		/*
		 * 2. 이차원 배열 할당(크기 지정)=(공간 확보)
		 * 	    배열명 = new 자료형[행크기][열크기];
		 */
		
		arr3 = new int[2][3];
		
		// * 이차원 배열 선언과 동시에 할당 
		int[][] arr = new int[3][5]; // int 이차원 배열을 만들건데, 3행 5열짜리로 만들래
		
		// 값을 출력해보자.
		System.out.println(arr); // => 고유주소 출력
		System.out.println(arr[0]); // => 고유수고 출력
		System.out.println(arr[1][0]); // => 담긴 값 출력
		
		// 행의 길이
		System.out.println("행의 길이 : " + arr.length);
		
		// 열의 길이
		System.out.println("0행의 열의 길이 : " + arr[0].length);
		System.out.println("1행의 열의 길이 : " + arr[1].length);
		
		/*
		 * 별찍기
		 *  *****
		 *  *****
		 *  *****
		 *  
		 *  바깥족 for문 -> 행의 갯수만큼 반복
		 *  안쪽 for문 -> 열의 갯수만큼 반복
		 *  
		 */
		
		for(int i=0; i<arr.length; i++) { // 3행
			
			for(int j=0; j<arr[i].length; j++) { // 5열
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // 한 행의 대입이 끝나면 개행 넣어준다
		}

	}
	
	// 이차원 배열에 값 대입
	public void method2() {
		
		int[][] arr = new int[3][5];
		
		
		/*
		 * 모든 행과 열에 1을 담아보자!
		 * 1 1 1 1 1
		 * 1 1 1 1 1
		 * 1 1 1 1 1
		 */
		/*
		for(int i=0; i<arr.length; i++) { // 행을 지정하는 for문
			
			for(int j=0; j<arr[i].length; j++) { // 열을 지정하는 for문
				arr[i][j] = 1;
			}
		}
		*/
		
		
		/* 1부터 1씩 순차적으로 증가하는 값을 넣자!
		 *  1 2 3 4 5
		 *  6 7 8 9 10
		 *  11 12 13 14 15
		 */
		
		// 대입
		int value = 1;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++; // value 후위연산 : 애초에 1로 초기화 했기떄문에 전위증감이 된다면 2부터 담기게 된다. 먼저 담고, 그 후에 1 증가!
			}
		}
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%-2d ", arr[i][j]); // printf %-2d
			}
			System.out.println(); // => 2차원배열 처럼 보이기 위해 개행 넣어주자!
		}
		
	}
	
	// 이차원 배열 선언&할당&초기화 한 번에 설정하기
	public void method3() {
		
		int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(); 
		}
		
	}
	
	// 가변 배열
	public void method4() {
		
		// 각 행별 열의 크기가 다를 수 있다.
		
		// 가변배열
		// 행은 정해져있으나 각 행에 대한 열의 갯수가 정해지지 않은 상태
		// 이차원배열 == 일차원 배열을 여러개 묶은 형태
		// 즉, 묶여있는 일차원 배열의 길이가 꼭 같을 필요는 없음
		
		int[][] arr = new int[3][]; // 가변 배열 할당 (행의 크기는 3행으로)
		
		System.out.println(arr);
		System.out.println(arr[0]); // 결과값 : null => 행의 크기는 정했으나 열의 크기는 할당하지 않았으므로 주소값의 기본값은 null이다!
		// System.out.println(arr[0].length); // 오류 : NullPointerException => 아직 생성이 되지 않았는데 null에서 접근하려하면 오류가 생긴다.
		// arr[0][1] = 10; // 오류! NullPointerException
		
		// 그러면 각각의 행 별 크기를 지정해보자!
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		
		// 매번 1씩 증가하는 값 담기
		/*
		 * 1 2
		 * 3 
		 * 4 5 6
		 */
		
		int value = 1; // 특정 변수를 언제든 활용 가능하다
		
		for(int i=0; i<arr.length; i++) { // 행의 크기
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// 가변배열 선언&할당&초기화 한 번에 끝내기
	public void method5() {
		
		int[][] arr = {{1, 2}, {3}, {4, 5, 6}};
		// 무엇을 담을지 값을 알고 있는 경우, 선언&할당&초기화 한 번에 가능하다!
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	
	}
	// 사용자에게 입력 받은 점수 값을 초기화
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		double[][] arr = new double[2][3];
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				if(i == 0) { // i가 0번 행일 때 국어 점수  출력
					System.out.print("국어 점수 : ");
				}else { // i가 1번 행일 때 국어 점수 출력
					System.out.print("영어 점수 : ");
				}
				arr[i][j] = sc.nextDouble();
			} 
		}
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			
			if(i == 0) {
				System.out.print("국어 점수 : ");
			}else {
				System.out.print("영어 점수 : ");
			}
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
		
	
	
	
}
