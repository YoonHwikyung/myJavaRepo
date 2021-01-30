package com.kh.chap02.objectArray.run;

import java.util.Scanner;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		// 2021.01.15 향상 for문
		int[] iArr = {1, 2, 3, 4, 5};
		
		// 0번 인덱스에서부터 마지막 인덱스까지 순차적으로 접근해서 출력.
		for(int i=0; i<iArr.length; i++) { // 반복횟수 : 5 == 배열의 크기만큼 반복이 수행됨
			System.out.println(iArr[i]);
		}
		/*
		- 향상된 for문 (어떤 배열같은 존재에 0번 인덱스에서부터 마지막인덱스까지 순차적으로 접근할 목적일 경우 쓰임)
		  <표기법>
		  for(순차적으로접근한 값을 담을 변수선언 : 순차적으로접근할배열명) { // 반복횟수 == 배열의 크기
			  반복적으로 실행할 내용
		   }
		*/
		//		int		int[]
		for(int value : iArr) { // iArr[0] => iArr[1] => ... => iArr[마지막]
			System.out.println(value);
		}
		
		
		
		
		// 객체 배열 생성
		Phone[] arr = new Phone[3];

		/*
		System.out.println(arr); // => 주소값이 출력된다.
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[0].information()); // NullPointer 오류 - arr[0]이 아직 null이기 때문에 오류!
		arr[0].setBrand("애플"); // NullPointe 오류 
		*/
		
		// 각 객체에 값 초기화
		arr[0] = new Phone("갤럭시", "샘송", 1500000, "노트 20");
		arr[1] = new Phone("아이폰", "사과", 1300000, "11 pro");
		arr[2] = new Phone("벨벳폰", "엘지", 900000, "1");
		
		
		int total = 0;
		
		/*// 출력 
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
			total += arr[i].getPrice();
		}*/
		
		// 2021.01.15 위의 일반 for문을 이용한 출력을 향상 for문으로 출력
		// 향상 for문으로 출력
		//	 Phone	   Phone[]
		for( Phone p : arr) { // arr[0] => arr[i] => arr[2]
			System.out.println(p.information());
			total += p.getPrice();
		}
		
		
		
		
		System.out.println("총 가격 : " + total + "원");
		System.out.println("평균가 : " + total / arr.length + "원");
	
		
		// 검색 할 핸드폰명 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 명 : ");
		String search = sc.nextLine();
		
		
		// 모든 핸드폰의 이름 or 브랜드 or 시리즈와 비교하여 일치하는 경우 => 해당 폰의 가격을 출력하시오
		/*
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getName().equals(search)
					|| arr[i].getBrand().equals(search)
						|| arr[i].getSeries().equals(search)) {
				System.out.println("당신이 찾는 핸드폰의 가격은 " + arr[i].getPrice() + "원 입니다.");
				count++;
			}
		
		}

		if(count == 0) {
			System.out.println("우리 매장에 없는 핸드폰입니다.");
		}*/
		
		// 향상된 for문 이용
		for(Phone p : arr) {
			if(p.getName().equals(search)
					|| p.getBrand().equals(search)
						|| p.getSeries().equals(search)) {
				System.out.println("당신이 찾는 핸드폰의 가격은 " + p.getPrice() + "원 입니다.");
			}
		}
		
		
		
		
		
		
	
	}
	
	
	
	
	
	
	

}
