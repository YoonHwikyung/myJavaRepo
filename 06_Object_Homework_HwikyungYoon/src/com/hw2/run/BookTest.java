package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	
	public static void main(String[] args) {
		
		// 첫 번째 book 객체 생성
		Book bk1 = new Book();
		
		// 두 번째 Book 객체 생성 및 초기화 ( 매개변수 생성자 이용)
		Book bk2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		// 각 객체가 가진 필드 값 출력 확인
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		System.out.println("================================");
		
		// 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		bk1.setTitle("C언어");
		bk1.setPrice(30000);
		bk1.setDiscountRate(0.1);
		bk1.setAuthor("홍길동"); 
		
		// 수정된 결과 확인
		System.out.println("수정된 결과 확인");
		System.out.println(bk1.information());
		
		System.out.println("================================");
		
		// 최종 출력
		//System.out.println("도서명 = " + bk1.getTitle());
		//System.out.printf("할인된 가격 = %.0f원\n", bk1.getPrice() - (bk1.getPrice() * bk1.getDiscountRate()));
	
		bk1.information2();
		bk2.information2();
		
		
	
	
	}
}
