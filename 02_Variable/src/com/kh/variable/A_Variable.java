package com.kh.variable; // 패키지에 속해 있기 때문에 패키지 선언부가 있는 것

//다른 패키지라면 동일한 이름의 클래스를 만들 수 있음!!
public class A_Variable { // 실제 클래스명 => com.kh.variable.A_Variable

	/*
	 *  * 학습목표 
	 *  1. 변수라는 게 뭔지
	 *  2. 변수를 왜 써야만 하는지
	 *  3. 변수를 어떻게 쓰는지
	 *  4. 변수명은 어떻게 짓는지 (변수 명명 규칙 = 네이밍룰)
	 */
	//             메소드ㄱ
	public void printVariable( ) {
		
		System.out.println("== 변수사용 전 ==");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println((100 + 10) * 10 - 10);
		System.out.println(((100 + 10) * 10 - 10) / 10);
		// 결과물은 잘 출력되나 무슨 의미인지 파악하기는 어렵다.. 변수를 사용하면 의미가 파악이 가능하다!
		//100이라는 숫자를 70으로 바꾸려 할 때, 변수를 사용하기 전에는 하나하나 다 변경을 해줘야 한다. '포인트 + 보너스 * 사람 -세금 '을 의미하는 것이라면??
		
		// 1. 변수란? => 어떠한 값을 메모리상에 기록하기 위한 공간이다. (박스같은 존재)
		int point = 100;			// 포인트
		int bonus = 10;				// 보너스
		int personCount = 10;		// 사람명수
		int fees = 10;				// 세금
		
		System.out.println("== 변수사용 후 ==");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println((point + bonus) * personCount - fees);
		System.out.println(((point + bonus) * personCount - fees) / personCount);
		
		System.out.println(point);
		
		/*
		 * 2. 변수를 사용하는 이유
		 * - 우선적으로 값에 의미를 부여해놓고자 하는 목적으로 사용 (가독성 좋음)
		 * - 한 번 값을 저장해 두고 계속적으로 사용할 목적으로 사용
		 * - 유지보수를 용이하게 하기 위한 목적으로 사용
		 */
			
	}
	
	public void declareVariavle() {
		
		// System.out.println(point); 오류! 지역변수 => 다른 영역에 있는 변수는 접근할 수 없음!
		//						ㄴ
		/*
		 * 3. 변수의 선언 (기록할 값을 위한 변수를 메모리 공간에 확보해 놓는 과정 == 변수(박스)를 만드는 과정)
		 * 
		 * [표현법] 자료형 변수명;  => 값은 넣지 않고 일단 변수(박스)만 만들어 두는 것을 '변수를 선언한다' 라고 한다.
		 * 
		 * * 자료형 : 어떤 값을 담아낼지, 어느 정도의 크기의 값을 담아낼지에 대한 변수(박스)의 모양 및 크기를 정하는 부분 ex) 수박, 사과
		 * 
		 * * 주의할 점
		 * - 변수명의 첫 문자는 반드시 소문자로 시작, 여러 단어로 엮여 있는 경우에는 낙타표기법 (클래스명만 대문자로 시작, 나머지는 다 소문자로 시작!)
		 * - 해당 영역({})에 선언한 변수는 해당 영역에서만 쓸 수 있음! (즉, 다른 메소드에서는 쓸 수 없음) ==> '지역변수'라는 개념이다.
		 * - 해당 영역({})에 동일한 변수명으로 선언 불가 (중복 오류 발생 'duplicate')
		 */
		
		// 1. 논리형
		boolean isTrue;		// 1byte => 값은 비어있고 isTrue라는 변수(박스만)만들어진 상태. 변수 선언 연습 중인 것이다.
		   
		// 2. 숫자형
		// 2-1. 정수형
		byte bNum;			// 1byte
		short sNum;			// 2byte
		int iNum;			// 4byte => 정수형 중 가장 대표적인 자료형(기본형) -21억xxx ~ 21억xxx
		long lNum;			// 8byte
		
		// 2-2. 실수형
		float fNum;			// 4byte
		double dNum;		// 8byte => 실수형 중 가장 대표적인 자료형(기본형) 크기가 커도 float 보다 더 정확한 값을 담을 수 있기 때문.
		
		// 3. 문자형(한글자)
		char ch;			// 2byte / 문자(한글자)
		
		//-------------------- 여기까지가 기본자료형 (8개) -----------------------
		
		// 4. 문자열 (참조자료형) => 기본 자료형과는 다른 종특
		String str;
		
		// = 현재는 변수(박스)만 9개 만들어진 상태. 그 안에 값은 없는 상태. 이제 변수에 값을 대입해보자.
		/*
		 * * 변수에 값을 대입(담기)
		 *        
		 * [표현법] 변수명 = 값;		=> 뒤에서 앞으로 담긴다.
		 */
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;		// long 형 변수에 값을 담을 때는 뒤에 l 또는 L을 붙인다! (대문자 L을 더 권장!)
		fNum = 4.0f;	// 실수형 float 형 변수에 값을 담을 떄는 '반드시' 뒤에 f를 붙여야 한다!
		dNum = 8.0;
		ch = 'A';
		ch = '윤';		// ? 그럼 ch에는 A랑 윤 둘 다 담긴건가 => '윤'으로만 덮어씌워졌을 것!
		//ch = "B" 		// 문자(한글자)형 변수 안의 문자는 반드시 홑따옴표안에 넣어야 한다. 문자 변수 이기 때문에 쌍따옴표 불가능!
		str = "ABC";
		str = "B"; 
		
		// ** 변수를 호출해서 담긴 값을 출력해보자!
		// isTrue의 값 : true =>로 나타내고 싶을 때 : 문자열과 그 외의 값을 덧셈연산한다.
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 :" + bNum);
		// sNum, iNum, lNum, fNum, dNum, ch, str 를 위 처럼 값을 대입해보자! ('초기화 한다'라고도 말함)
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		//int iNum; // 같은 영역 내에서 중복된 변수 이름 사용 불가능!
		//int a;
		//int b;
		//int c;   // 다른 변수 이름은 얼마든지 사용 가능하다!
		
		
		
	}
	public void initVariable() {
		/*
		 * 위의 메소드에서는 변수 선언 후에 값을 대입했다면,
		 * 지금부터는 변수를 선언함과 '동시'에 값을 대입(초기화)해보자!
		 * 
		 * [표현법] 자료형 변수명 = 값;
		 */
		
		// 기본자료형
		// 1. 논리형
		boolean isTrue = false; //위에서 썼어도 다른 영역안이니 가능!
		
		// 2_1. 숫자형 (정수형)
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L; // long 자료형에서는 숫자 뒤에 L을 붙인다!
			
		// 2_2. 숫자형 (실수형)
		float fNum = 4.0f; // float 자료형에서는 숫자 뒤에 반드시 f를 붙인다!
		double dNum = 8.0;
				
		// 3. 문자형 (한글자형)
		char ch = '가';

		// 참조자료형
		// 4. 문자열
		String str = "I오전반";
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		iNum = 10; // 코드는 순차적으로 실행되기 때문에 위의 iNum은 4, 아래부터는 10으로 적용된다.
		System.out.println("변경된 iNum의 값 : " + iNum);
		
		// 번외
		// 엄청 큰 값을 담아야만 할 때 가독성 좋게 언더바(_)를 이용할 수 있다.
		// 단, 결과는 숫자값만이 담김!
		int etc = 999_999_999;
		System.out.println(etc);
	
	}
	
	
	public void namingRule() {
		
		int number; // => 가능하다! 이제 불가능한 룰을 사용해보자!
		
		// 4. 변수 명명 규칙 (네이밍 룰)
		
		
		// 1) 변수명 중복 불가 => 중복시 에러 발생
		// short number;
		// 2) 대소문자는 구분한다.
		short numBer;
		
		// 3) 예약어 ( 이미 자바에서 사용되고 있는 키워드) 사용 불가 => 예약어 사용시 에러 발생
		// int public;
		// int class;
		// int void;
		// int true;
		
		// 4) 숫자 사용 가능하나, 숫자로 시작하는 것은 불가능! => 숫자로 시작시 에러 발생
		int age1;
		int age2;
		int a1ge;
		// int 1age;
		
		// 5) 특수문자는 언더바(_)와 달러($)만 가능하다! => 이외의 특수문자 사용시 에러 발생
		int number_1;
		int number_$1;
		// int number!1;
		// int number~1;
		
		// 변수 네이밍 권 장 사 항 !
		// 1) 낙타 표기법 ( Camel Case) 지켜주세요! 
		String username;
		String userName;
		
		// 2) 영문으로 표기 해주세요!
		//		왜? 한글을 사용하지 않는 환경에서는 오류를 유발할 가능성이 있기 때문
		int 점수;
		int score;
		
		
	}
	
	/*
	 *  ** 정리 **
	 *  변수 : 값(리터럴)을 기록하기 위한 공간
	 *  
	 *  값 (리터럴) : 프로그램상에 필요한 명시적인 값 / 또는 사용자가 마우스 또는 키보드로 입력한 값
	 *  
	 */
	
}
