package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method1(){
		String str = "Java,Oracle,JDBC,HTML,Server,Spring";
		
		// �����ڸ� �����ؼ� �ش� ���ڿ� �и���Ű�� ���
		
		// ��� 1. �и��� ���ڿ����� String[]�� ���� ���� ��Ƽ� �����ϰ��� �� ��
		//       ���ڿ�.split(String ������) : String[]
		String[] arr = str.split(",");
		
		System.out.println("arr�� ũ�� : " + arr.length);
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		// ��� for��
		//  String    String[]
		for(String s : arr) {
			System.out.println(s);
		}
		
		System.out.println("===============");
		
		// ��� 2. �и��� ������ ���ڿ����� ��ū���� ����ϰ� ���� ��
		//       java.util.StringToKenizer Ŭ������ �̿��ϴ� ���
		//       StringToKenizer stn = new StirngToKenizer(�и���Ű�����ϴ¹��ڿ�, ������);
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("�и��� ���ڿ� ���� : " + stn.countTokens()); // �迭 ���� x
		
		/*
		System.out.println(stn.nextToken()); // Java
		System.out.println(stn.nextToken()); // Oracle
		System.out.println(stn.nextToken()); // JDBC
		System.out.println(stn.nextToken()); // HTML
		System.out.println(stn.nextToken()); // Server
		System.out.println(stn.nextToken()); // Spring
		// System.out.println(stn.nextToken()); => NoSuchElementException
		
		System.out.println("���� ����ִ� ���ڿ� ���� : " + stn.countTokens());
		*/
		
		// �޼ҵ� Ȱ���� �� ���� while �ݺ��� ����!
		while(stn.hasMoreTokens()) { // stn ������ �����ִ� ��ū�� ���� ���ȸ� �ݺ�
			System.out.println(stn.nextToken());
		}
		
		
		
		
		
		
		
	}
}
