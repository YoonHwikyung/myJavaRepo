package com.kh.variable; // 학습주제 : 형변환(casting)

public class D_Casting {

	// 형변환 : 값의 자료형을 바꾸는 것 ( ex. int -> double )
	/*
	 * * 컴퓨터에서의 값 처리 규칙
	 * 1.대입 연산자(=)를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야 한다.
	 * 	 => 즉, 같은 자료형에 해당하는 값만 대입 가능함! (ex. 실수값에 정수 대입 불가능)
	 *	 => 다른 자료형의 값을 대입하고자 한다면 "형변환"이 필수!!
	 *
	 *	 자료형 변수명 = (자료형)값; // =>이런식으로 형변환이 이루어진다!
	 *
	 * 2. 같은 자료형끼리만 연산이 가능, 뿐만 아니라 연산결과도 같은 자료형으로 나옴!
	 *    같은 자료형 : 값  + 값 = / 다른 자료형 : 값 + (자료형)값 = => 다른 자료형끼리의 연산은 형변환을 통해서 가능하다!
	 *    
	 * * 형변환 종류
	 * 1. 자동 형변환 => 자동으로 형변환이 진행되기 때문에 내가 직접 형변환 할 필요 없음
	 * 2. 강제(명시적) 형변환 => 자동 형변환이 되지 않아 내가 직접 형변환을 해야하는 경우
	 * 		[표현법] (바꾸고자하는 자료형)값  ==> 이것도 하나의 연산자이다.
	 * 
	 * 		(바꾸고자하는 자료형)을 cast연산자 즉, 형변환 연산자 라고 함.
	 * 
	 * 
	 * *주의사항
	 * -boolean은 형변환이 불가 (즉, true 또는 false 값만 가질 수 있음)
	 */ // 자동 형변환이 되는 경우와, 강제 형변화를 해야하는 경우를 각각 공부해보자!
	
	
	// 자동 형변환 (을 공부하기 위해 자동 형변환 메소드를 만들어보자)
	public void autoCasting() {
		
		/*
		 * * 자동 형변환
		 * 사이즈가 작은 자료형과 큰 자료형 간의 연산(대입, 계산 등)시 
		 * 자동으로 작은 자료형이 큰 자료형으로 변환된다.
		 */
		
		// 자동 형변환 예시1. 대입
		// int(4byte), double(8byte) 간의 연산을 시행하면 int가 double형으로 자동 형변환 될 것.
		int i1 = 10;
		double d1 = /*(double)*/i1; // int 자료형의 값을 담아보자. 다른 자료형임에도 오류가 나지 않는다. 왜? 내부적으로 자동 형변환이 이루어지고 있다!
		// 				ㄴ연산의 순서. i1이 10에서 10.0으로 먼저 바뀌고 나서 대입이 된다.
		System.out.println("d1 : " + d1);
		
		// 자동 형변환 예시2. 연산
		
		//정수와 실수간의 연산 (다른 자료형)
		int i2 = 12;
		double d2 = 3.3;
		//                 ㄱ눈에보이지 않을 뿐 알아서 형변환을 했을 것임을 알려주기 위해 표시함.
		double result = /*(double)*/i2 + d2; // 다른 자료형인데 오류가 나지 않는다는 걸 보여주기 위해 연산 결과를 더블형 result변수에 저장 해보자.
		//ㄴ연산 순서 : 1 3 2 (12.0 + 3.3)이 먼저 이뤄지고 나서 대입연산이 이뤄진다. 뒤에서 앞으로 담긴다.
		
		System.out.println("result : " + result);
		
		// 크기가 다른 정수와 정수간의 연산 (다른 자료형)
		// int(4byte) --> long(8byte) 지동형변환 가능
		int i3 = 1000;
		long l3 = /*(long)*/i3;
		
		System.out.println("l3 : " + l3); // 잘 되어있는지 확인해보자!
		
		int i4 = 22345;
		long l4 = 154678795L;
		
		long result2 = /*(long)*/i4 + l4;
		
		System.out.println("result2 :" + result2);
		
		// *특이케이스1. 자동 형변환 예시3. 
		// 정수 long(8byte) 와 실수 float(4byte)의 연산5
		// long은 8바이트고 float는 4바이라서 long이 더 크다고 생각할 수 있으나!
		// float이 long형보다 담을 수 있는 값의 범위가 더 크다! (실수형은 어떤 정수형보다 범위가 크다!)
		long l5 = 10000000000L;
		float f5 = /*(float)*/l5; // 10000000000.0으로 담겨있을 것
		
		System.out.println("f5 : " + f5);
		
		// *특이케이스2. 자동 형변환 예시4. char => 0~65xxx, 음수는 담을 수 없다.
		// char(2byte) <-->  int(4byte) 양방향으로 형변환이 이루어진다.
		char ch = 65; //엄연히 다른 자료형인데 오류가 나지 않음.
		System.out.println("ch : " + ch); // => 결과가 65가 아닌 A로 나옴. 왜? 숫자 65의 고유한 문자가 A이기 때문!
		// ch = -65 --> 오류! 왜? 음수값은 저장 불가능!
	
		int num = 'A';
		System.out.println("num : " + num); // => 결과가 A가 아닌 65로 나옴. 왜? 각각 정해져있는 숫자와 문자를 가지고 있음!
		
		 // 각 문자마다의 고유한 숫자가 정해져있음!
		// 아스키코드표(0~127,영문/숫자/특수문자에 대한 고유 번호를 가지고 있다.)
		// 유니코드표 로 확인 가능하다.(0~65xxx, 영문/숫자/특수문자 뿐만 아니라 한글에 대한 문자까지고 다 표현하고 있어서 범위가 굉장히 크다 .)
		
		// 대문자 U가 가진 고유한 숫자가 궁금할 때
		System.out.println((int)'U');
		// 문자 '윤'이 가진 고유한 숫자가 궁금할 때
		System.out.println((int)'윤');
		// 문자와 숫자 간 연산도 가능하다. 왜? 각각의 문자가 가지고 있는 숫자가 다르기 때문.
		int sum = 'A' + 10;
		System.out.println("sum : " + sum); // int 이기 때문에 65+10 =75로 나옴
		
		char sum1 = 'A' + 10;
		System.out.println("sum1 : " + sum1); // char 이기 때문에 K로 나옴
		
		
		// *특이케이스3. 자동 형변환 예시5. 
		// byte, short 간의 연산
		byte b1 = 1;
		byte b2 = 10;
		// 같은 자료형 byte끼리 연산했으니 결과값도 byte 변수형에 담아보자!
		// byte result3 = b1 + b2; // 오류! 왜? byte나 short로 연산시 무조건 int(4byte)로 처리해야함
		// int result3 = b1 + b2; ->으로 하면 된다.
		
		// 그러나 꼭  byte 자료형으로 처리하고 싶은 경우에는
		byte result3 = (byte)(b1 + b2);
		System.out.println("result3 : " + result3);
		
		//ㄴ특이케이스3. 이것이 바로 강제 형변환이다! 이제 본격적으로 강제 형변환에 대해 알아보자~!
	
	
		
	}
	
	// 강제 형변환 
	public void forseCasting() {
		
		// 강제형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것
		
		// 실수와 실수
		//double(8byte) --> float(4byte) 더블을 플롯으로 바꿔보자!
		
		//이 전에 확인해볼 것!
		float f = 4.0f; // 이것도 하나의 강제 형변환 같은 것! 강제로 f를 붙여야만 한다.
		System.out.println("f : " + f);
		
		double d2 = 4.0;
		//float f2 = d2; // !오류 : 자료형이 다름 (자동형변환이 불가능:크기가 작은 곳에 구겨넣어야함. 즉, 강제형변환 필요)
		float f2 = (float)d2;
		System.out.println("f2 : " + f2);
		
		// 실수와 정수
		// double(8byte) --> int(4byte) 더 큰 더블형을 int에 구겨 넣어보자
		double d3 = 10.89;
		//int i3 = d3; // !오류 : double은 int보다 크기가 큼. 강제 형변화 필요
		int i3 = (int)d3;
		System.out.println("i3 : " + i3); // 10.89 -> 10으로 변환. 데이터 손실.
		
		int iNum = 10;
		double dNum = 5.89;
		
		// 오류 ! int iSum = iNum + dNum; // 10.0 + 5.89 => 15.89, 결과값도 double형.
		
		// 문제 해결 방법1. 수행 결과를 int형으로 강제형변환
		int iSum = (int)(iNum + dNum); // (int)15.89 => 15
		System.out.println("isum : " + iSum);
		// 실수형을 정수형으로 강제 형변환시 => 데이터 손실이 발생할 수 있음!!
		
		// 문제 해결 방법2. dNum값만 int형으로 강제형변환
		int iSum2 = iNum + (int)dNum; // 10 + 5 =>15 int형
		System.out.println("iSum2 : " + iSum2);
		
		// 문제 해결 방법3. 그냥 연산결과를 double로 담기
		double dSum = iNum + dNum; // 강제형변환을 하지 않고 결과값이 실수형이니 그냥 실수형에 담자!
		System.out.println("dSum : " + dSum);
		
		
	}
	
	
	
	
}
