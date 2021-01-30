package com.kh.chap01.objectVSobjectArray.run; // 객체 배열

import java.util.Scanner;

import com.kh.chap01.objectVSobjectArray.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		// 만들어둔 vo용 클래스 Book 이용! 
		// 객체 배열 생성
		Book[] books = new Book[3];
		System.out.println(books.length);
		/*
		books[0] = new Book(); // books 배열의 0번 방에 Book객체를 초기화 할 수 있다.
		books[1] = new Book(); // books 배열의 1번 방에 Book객체를 초기화 할 수 있다.
		books[2] = new Book(); // books 배열의 2번 방에 Book객체를 초기화 할 수 있다.
		*/
		// ObjectRun과 비교해보자!
		Scanner sc = new Scanner(System.in);
		
		// 전체 도서 정보에 대해 사용자로부터 입력 받은 후
		// 각 객체에 생성과 동시에 초기화
		for(int i=0; i<books.length; i++) {
			
			System.out.println(i + 1 + "번쨰 도서 정보 입력");
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine(); // 버퍼에 남아있는 엔터를 비워줘야함!
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			books[i] = new Book(title, author, price, publisher); // 객체 배열을 이용하 각 배열마다 조건 검사 필요 없다. 
		} // 객체 생성 끝
		
		// 전체 도서 정보들 조회하기(출력하기)
		// ObjectRun에서는 반복문 사용 불가능했다.
		// 규칙 찾기
		//System.out.println(books[0].information());
		//System.out.println(books[1].information());
		//System.out.println(books[2].information());
		
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		// 객체 배열을 사용하면 이렇게 간단하게 코드 기술을 할 수 있다.
				
		
		// 검색서비스
		System.out.print("검색할 책 제목: ");
		String search = sc.nextLine();
		
		int count = 0; // 일치하는 도서를 찾는 순간 1 증가시킴 ( 검색되는 도서가 없습니다 를 위해 변수 활용)
		
		for(int i=0; i<books.length; i++) {
			
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
				count++; // 일치하는 도서를 찾는 순간 1 증가
			}
		}
		
		if(count == 0) { // 반복문이 다 끝났는데도 0이다? 일치하는 도서를 한 번도 찾지 못한경우
			System.out.println("검색되는 도서가 없습니다.");
		}
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
