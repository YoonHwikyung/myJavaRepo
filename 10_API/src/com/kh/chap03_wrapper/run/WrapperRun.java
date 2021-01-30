package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {

		/*
		 * * Wrapper 클래스
		 * => 기본자료형을 객체로 포장해주는 클래스들을 '래퍼클래스'라고 함
		 * 
		 *    기본자료형		  Wrapper 클래스
		 *    boolean  <-->   Boolean
		 *    char     <-->   Character
		 *    byte     <-->   Byte
		 *    short    <-->   Short
		 *    int      <-->   Integer
		 *    long     <-->   Long
		 *    float    <-->   Float
		 *    double   <-->   Double
		 *   
		 *    => 양 방향으로 형변환이 가능하다!
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		//System.out.println(num1.equals(num2)); 
		//System.out.prinltn(num1.hashCode());
		//=> 그냥 기본자료형. 객체가 아니기때문에 메소드 활용 불가능
		
		// 기본자료형 => Wrapper자료형	(Boxing)
		Integer i1 = num1; // 10
		Integer i2 = num2; // 15
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞쪽이 크면 1 리턴, 뒤쪽이 크면 -1, 같으면 0리턴
		// 기본자료형을 객체로 바꾸게 되면 메소드들 이용가능
		
		
		// Wrapper 자료형 => 기본자료형	(unBoxing)
		int num3 = i1; // 10
		int num4 = i2; // 15
		
		
		
		System.out.println("===========");
		
		// 기본자료형 <--> String
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2);
		
		// 1. String --> 기본자료형		: 파싱한다.
		//    해당Wrapper클래스.parseXXX(변환할문자열)
		int i = Integer.parseInt(str1); // "10" => 10
		double d = Double.parseDouble(str2); // "15.3" => 15.3
		
		System.out.println(i + d);
		
		// 2. 기본자료형 --> Stirng
		//		10   --> "10"
		//		15.3 --> "15.3"
		
		//    String.valueOf(변환할기본자료형값) : String
		String strI = String.valueOf(i); // 10   => "10"
		String strD = String.valueOf(d); // 15.3 => "15.3"
		
		
		
		
		
		
	}

}
