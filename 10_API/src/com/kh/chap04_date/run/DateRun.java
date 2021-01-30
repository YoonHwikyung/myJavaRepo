package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {

		/*
		 * * java.util.Date
		 * - 날짜와 시간에 대한 정보를 담을 수 있는 클래스
		 * - 자바 개발 초창기에 급하게 만든 완성도가 높지 않은 클래스 (다국적으로 쓰기 적합x)
		 * 
		 * 
		 */
		
		// 기본 생성자를 통해 Date 객체 생성 => 현재 날짜(시스템날짜) 및 시간 가지고 옴
		Date today = new Date();
		System.out.println("기본생성자 : " + today);
		
		// 내가 원하는 날짜 (2020년 6월 19일)
		// 1) 매개변수 생성자를 통해
		//Date date1 = new Date(2020, 6, 19); => Depercated : 권장하지 않음
		// 내부적으로 내가 전달한 년도 + 1900		=> 세팅하고자하는년-1900
		//		     내가 전달한 월 + 1			=> 세팅하고자하는월-1
		
		Date date1 = new Date(2020-1900, 6-1, 19, 19, 15, 30);
		System.out.println("매개변수 생성자 : " + date1/*toString()*/);
		
		
		// ""2020년 06월 19일 19시 15분 30초"
		// 내 입맛대로 포맷(형식)을 지정한 문자열을 받고자 할 때
		// java.text.SimpleDateFormat
		
		// 1. 형식을 지정하면서 SimpleDateFormat 객체 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		// 2. sdf 객체에서 제공하는 format메소드 호출 시 Date객체 전달 => 포맷지정된 String 돌아옴
		//    sdf.format(Date객체) : String
		//String formatDate = sdf.format(date1);
		//System.out.println(formatDate);
		
		String formatDate = sdf.format(today);
		System.out.println(formatDate);
		
	}

}
