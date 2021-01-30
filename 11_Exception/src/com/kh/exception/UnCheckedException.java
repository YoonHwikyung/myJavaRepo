package com.kh.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {
	
	/*
	 * * RuntimeException
	 * - 프로그램 실행시 발생되는 예외들 (문법적으로 문제되지 않음! 예외처리 굳이 할 필요x)
	 * 
	 * * RuntimeException 후손들(자식클래스들)
	 * - IndexOutOfBoundsException : 잘못된 인덱스 값으로 접근했을 떄 발생되는 예외
	 * - ClassCastException : 허용할 수 없는 형변환이 진행되었을 경우 발생되는 에외
	 * - NullPointException : 레퍼런스가 아직 null임에도 불구하고 접근했을 때 발생되는 예외
	 * - ArithmeticException : 나누기 연산에서 부모(나눠지는 수)가 0인 경우 발생되는 예외
	 * - NegativeArraySizeException : 배열 크기를 지정하는 과정에서 배열의 크기를 음수로 지정했을 경우 발생되는 예외 
	 * - ...
	 * 
	 * => 이러한 RuntimeException 관련한 애들은 충분히 예측 가능하기 때문에
	 *    애초에 예외 자체가 발생 되지 않게 조건문으로 충분히 해결 가능하긴 하다!
	 *    굳이 예외처리(예외가 발생했을 때 실행할 내용을 정의)할 필요 없이
	 * 
	 * 
	 */
	
	
	// 필드부. 전역변수로 스캐너 생성해서 어느 메소드에서도 쓸 수 있게 하자!
	private Scanner sc = new Scanner(System.in);
	//  Scanner sc = new Scanner(System.in); => default로 두어도 된다. vo클래스에서는 private 필수

	
	// try~catch문
	public void method1() {
		
		// ArithmeticException : 나누기 연산에서 부모가 0인 경우 발생되는 예외
		
		// 사용자에게 두 개의 정수값을 입력 받아 나눗셈 연산 진행 => 결과 출력
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수(0 제외) : ");
		int num2 = sc.nextInt();
		
		/*
		// 해결방법 1. 애초에 예외자체가 발생할 일 없게 if문으로 조건검사 후에 실행(예외처리가 아님!)
		if(num2 != 0) {
			int result = num1 / num2;
			System.out.println("나눗셈 연산 결과 : " + result);
		}else {
			System.out.println("0으로는 나눌 수 없습니다.");
		}

		System.out.println("안녕히가세요 빠이");
		*/
		
		// 해결방법 1. 예외처리로 해결 (예외처리 == 예와가 발생했을 때를 대비해서 실행할 내용을 정의해두는 것)
		// try~catch문
		try {
			// 예외가 발생할 수 있는 구문
			int result = num1 / num2; // ArithmeticException 예외가 발생될 수 있는 구문
			System.out.println("나눗셈 연산 결과 : " + result); // 예외 발생시 이 구문은 건너뛰고 catch문 실행
			
		}catch(ArithmeticException e) { // ArithmeticException 예외 발생시 
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		
		System.out.println("안녕히가세요 빠이");
		
	}
	
	/*
	 * * try~catch문
	 * try {
	 * 		예외가 발생할 만한 구문;
	 * }catch(발생될 예외클래스 매개변수) {
	 * 		해당 예외가 발생되는 경우 실행할 구문;
	 * } 
	 */
	
	
	
	// 다중 캐치 블럭
	public void method2() {
		
		System.out.print("정수(0 제외) 입력 : ");
		
		try {
			int num = sc.nextInt(); // InputMismatchException (jave.util= > import 필요)
			System.out.println("나눗셈 연산 결과 : " + 10/num); // ArithmeticException
			
		}catch(InputMismatchException e) {
			System.out.println("정수값이 아닌 그 외의 값을 입력하셨습니다.");
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
	}
	
	
	
	// 다중 캐치 블럭
	public void method3() {
		
		// NegativeArraySizeException : 배열의 크기를 음수로 지정했을 때 발생되는 예외
		// ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스로 접근했을 때 발생되는 예외
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		/*
		if(size > 0) {
			int[] arr = new int[size]; // NegativeArraySizeException 미리 방지
		}
		*/
		
		/*
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(NegativeArraySizeException e) { // NegativeArraySizeException 발생시 실행할 구문
			System.out.println("배열의 크기는 음수로 할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) { //ArrayIndexOutOfBoundsException 발생시 실행할 구문
			System.out.println("부적젛한 인덱스로 접근했습니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
		*/
		
		
		// 둘 다 한꺼번에 처리하는 방법도 있다!!  NegativeArray~,ArrayIndexOutOf~의 부모타입인 RuntimeException으로!
		
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(RuntimeException e) { // 다형성 적용해서 부모클래스로 작성하면 다 받아줄 수 있음!
			System.out.println("예외가 발생했어.. 배열의 크기를 음수로 입력했더나 부적절한 인덱스로 접근헀어");
			// 단, 각각의 예외가 발생될 때 각각 실행된 내용이 다를 경우 세분화 필요!
			// 다형성 적용 catch문도 가능하다라는 것을 알려주기 위함
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		
		
	}
	// 지금까지는 RuntimeException(예외처리를 해도 그만 안해도 그만)으로
	// 조건처리를 하거나, 예외처리구문 처리로 해결해봤다!
	
	
	
	/*
	 * if문으로 조건처리 == 애초에 예외 자체가 발생하지 않도록 개발자가 소슼드로 핸들링하는 것 (예외처리 아님)
	 * 예외처리구문 처리 == 예외가 발생했을 때를 대비해서 그 때 실행할 내용을 정의해두는 것
	 * 
	 * 예측이 가능한 경우 ==> 조건문으로 해결 (권장사항)
	 * 예측이 불가한 경우 ==> 예외처리 구문으로 해결
	 * 
	 * RuntimeException 계열은 충분히 예측 가능한 상황이 대부분! => 조건문으로 해결하는 것 권장!!
	 * 					조건문으로 해결 + 예외처리로도 가능
	 * 					=> 예외처리를 해도 그만 안해도 그만 (필수는 아님) => UnCheckedException
	 * 
	 * 
	 */

}
