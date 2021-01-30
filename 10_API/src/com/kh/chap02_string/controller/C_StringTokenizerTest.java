package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method1(){
		String str = "Java,Oracle,JDBC,HTML,Server,Spring";
		
		// 구분자를 제시해서 해당 문자열 분리시키는 방법
		
		// 방법 1. 분리된 문자열들을 String[]에 차곡 차곡 담아서 관리하고자 할 떄
		//       문자열.split(String 구분자) : String[]
		String[] arr = str.split(",");
		
		System.out.println("arr의 크기 : " + arr.length);
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		// 향상 for문
		//  String    String[]
		for(String s : arr) {
			System.out.println(s);
		}
		
		System.out.println("===============");
		
		// 방법 2. 분리된 각각의 문자열들을 토큰으로 취급하고 싶을 떄
		//       java.util.StringToKenizer 클래스를 이용하는 방법
		//       StringToKenizer stn = new StirngToKenizer(분리시키고자하는문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("분리된 문자열 갯수 : " + stn.countTokens()); // 배열 개념 x
		
		/*
		System.out.println(stn.nextToken()); // Java
		System.out.println(stn.nextToken()); // Oracle
		System.out.println(stn.nextToken()); // JDBC
		System.out.println(stn.nextToken()); // HTML
		System.out.println(stn.nextToken()); // Server
		System.out.println(stn.nextToken()); // Spring
		// System.out.println(stn.nextToken()); => NoSuchElementException
		
		System.out.println("현재 담겨있는 문자열 갯수 : " + stn.countTokens());
		*/
		
		// 메소드 활용할 떄 종종 while 반복문 쓴다!
		while(stn.hasMoreTokens()) { // stn 공간에 남아있는 토큰이 있을 동안만 반복
			System.out.println(stn.nextToken());
		}
		
		
		
		
		
		
		
	}
}
