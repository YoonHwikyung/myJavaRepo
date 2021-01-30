package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	
	// 사용자가 키보드를 통해서 입력한 값을 가져온 후 변수에 기록하는 방법
	
	public void inputScanner1() {
		/*
		 * 키보드로 입력한 값을 가져오기 위해서는
		 * 자바에서 이미 제공하고 있는 Scanner 라는 클래스가 가지고 있는 메소드를 이용해야 한다.
		 * Scanner 클래스의 위치 및 풀네임 java.util.Scanner
		 * 
		 * 다른 클래스에 있는 메소드를 호출하고자 할 때
		 * 1) 클래스 생성(new)
		 * 2) 해당 클래스에 있는 메소드를 호출
		 *
		 */
		// java.util.Scanner sc = new java.util.Scanner(); => 원래 생성하던 방법으로는 오류가 뜬다! 소괄호 안에 어떠한 내용을 기술해야한다.
		// java.util.Scanner sc = new java.util.Scanner(System.in); // => System.in : 입력 받은 값을 바이트 단위로 받아 들이겠다는 말
		Scanner sc = new Scanner(System.in); // sc 빨간 줄 이유 : 위에 주석처리를 하지 않아서.
		
		// 간단하게 사용자의 정보(이름, 나이, 키)를 입력 받고 그 입력받을 정보를 출력하는 프로그램
		// 보통 입력 받고자 하는 내용을 먼저 출력을 해서 유도를 해야한다!
		System.out.print("당신의 이름은 무엇입니까 : "); //입력을 유도하는 출력문인 경우 print 를 이용한다! (옆에 커서가 깜빡이도록)
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드 ( sc.next(), sc.nextLine() )
		// sc.next(); 이렇게만 작성하면 입력된 값을 가지고 오고 나서 끝남. 잘 가지고 왔는지 확인이 불가능하다.
		
		// String name = sc.next(); //=>사용자가 입력해서 가져옴과 동시에  String name이라는 변수에 저장하는것이 가능하다!
		// next() : 사용자가 입력한 값 중 공백 이전까지의 값만 읽어옴!
		//          (따라서 주소와 같은 공백이 포함될 여지가 있는 문자열에는 적절하지 않음!)
		
		String name = sc.nextLine();
		// nextLine() : 사용자가 입력한 값 모두 다 읽어옴! 
		
		System.out.print("당신의 나이는 몇 살입니까 (숫자만 입력) : ");
		int age = sc.nextInt();	// next다음 사용하려는 변수종류 넣기ㅣ!
		// nextInt() : 사용자가 입력한 값 정수로 읽어옴! (정수만 읽어올 수 있음!, 문자를 같이 입력했을 경우 오류 발생)
		
		System.out.print("당신의 키는 몇 cm입니까 (소수점 아래 첫 째 자리까지만 입력) : ");
		double height = sc.nextDouble();
		//nextDouble() : 사용자가 입력한 값 실수로 읽어옴! (문자를 같이 입력했을 경우 오류 발생)
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
	}
	
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in);
		
		// 이름, 나이, 주소, 키
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이(숫자만) : "); 
		int age = sc.nextInt();
		
		// 버퍼에 남아있는 '엔터'를 비워주는 과정을 해야한다!!
		sc.nextLine();
		
		/*
		 * sc.nextLine() : 버퍼에서 값을 가지고 온 후 '엔터'를 비워주는 역할도 수행
		 * 하지만 그 외 next~~~() : 버퍼에서 값만 가져고오 끝냄 ('엔터'를 비워주지 않음 == '엔터'가 여전히 남아있을 것)
		 * 
		 * sc.nextInt() 후에 sc.nextLine() 메소드가 호출된다면
		 * 버퍼에 남아있는 '엔터'때문에 sc.nextLine() 이 바로 실행되어 버린다.
		 * 
		 * 결론 : sc.nexet~~() 메소드 뒤에 바로 sc.nextLine() 메소드가 사용될 것 같으면 버퍼에 남아있는 '엔터'를 빼주는 과정이 필요하다!
		 * 		즉, 그 사이에 sc.nextLine() 메소드를 한 번 더 호출 해서 '엔터'를 제거하자!
		 */
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키(cm) : ");
		double height = sc.nextDouble();
		
		/*
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(height);
		*/
		
		// xxx님은 xx살이며, 사는 곳은 xxxxxxx이고, 키는 xxxcm입니다.
		
		//System.out.println(name + "님은 " + age + "살이며, 사는 곳은 " + address + "이고, 키는" + height + "cm입니다.");
		
		System.out.printf("%s님은  %d살이며, 사는곳은  %s이고, 키는  %.1fcm입니다.", name, age, address, height);
		
		
	}
	
	
	public void inputScanner3() {
		
		// 학습목표 : 문자형 (char)형
		Scanner sc = new Scanner(System.in);
		
		// 문자열 => sc.nextLine()
		// 정수 => sc.nextInt()
		// 실수 => sc.nextDouble()
		
		System.out.print("이름 : ");
		String name = sc.nextLine(); // "홍길동"
		
		System.out.print("성별(남/여) : ");
		// char gender = sc.nextChar();		=> nextChar 메소드는 존재하지 않음
		char gender = sc.nextLine().charAt(0);
		// 사용자가 입력한 값을 문자열로 가지고 온 후에, 내가 원하는 인덱스 순서의 문자 값을 추출해서 담아야 한다.
		// * 인덱스 == 0번부터 시작
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		/*
		 * xxx님의 개인정보
		 * 성별 : x
		 * 나이 : xx
		 * 키 : xxxcm
		 */
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height + "cm");
		
		
		
	}
	
	
	/*
	 * 
	 *  * 정리 *
	 *  1. 콘솔창에(모니터) 출력하기 위해 : System.out.println(출력하고자 하는 값) 메소드를 호출했다. 
	 *  2. 콘솔창에(키보드) 입력받기 위해 : Scanner sc = new Scanner(System.in);
	 *  						  sc.nextLine(), sc.next(), sc.nextInt(), sc.nextDouble(), ...
	 *  	'문자' 값을 입력받기 위해서는 sc.nextLine().charAt(인덱스);
	 *  	( sc.nextLine()을 통해 문자열로 가지고 온 후, 그 뒤에 .charAt(추출하고자하는인덱스)을 통해 해당 인덱스의 문자 값을 뽑을 수 있음)
	 *  
	 *  * 주의사항 *
	 *  sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드가 오게 될 경우
	 *  그 전에 버퍼에 남아있는 '엔터(\n)'를 비워주는 과정인 sc.nextLine() 메소드를 한 번 더 호출 해야 한다!
	 *  
	 *  
	 */
	
	
	
	
	
	
	
	
	

}
