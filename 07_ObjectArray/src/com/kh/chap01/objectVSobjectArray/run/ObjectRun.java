package com.kh.chap01.objectVSobjectArray.run; // 객체 vs 객체 배열 비교

import java.util.Scanner;

import com.kh.chap01.objectVSobjectArray.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		// 사용자에게 총 3번 도서 정보를 입력 받을 예정
		// 기본자료형이 아닌 그 외에 자료형(주소값이 담길만한 자료형)의 기본값은 null
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		// 사용자에게 총 3번 도서 정보를 입력 받을 예정
		Scanner sc = new Scanner(System.in);
		
		// 전체 도서 정보에 대해 사용자로부터 입력 받은 후
		// 각 객체에 생성과 동시에 초기화
		for(int i=0; i<3; i++) { // 반복횠수 : 3
			
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
			
			// 하나의 도서 정보를 모두 입력 받은 후 조건문
			// 매번 조건검사 후 각 객체를 따로 따로 생성해야 함(객체를 사용했을시 불편함)
			if(i == 0) { // i가 0일 경우 첫 번째 객체 생성
				bk1 = new Book(title, author, price, publisher);
			}else if(i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
		}
		// 객체 생성 끝
		
		// 전체 도서 정보들 조회하기 (출력하기)
		// 3개의 출력문을 써야하는 구나
		// 반복문 사용 불가
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		// 도서 제목으로 검색하는 서비스
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}else if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}else if(bk3.getTitle().equals(search)) { //else (X). 사용자가 입력한 값이 bk3와 같다고 장담할 수 없다.
			System.out.println(bk3.information());
		}else {
			System.out.println("검색되는 도서가 없습니다.");
		}
		
		
		// 지금은 3개의 도서지만, 100가지 도서라고 하면 힘들 것
		// 객채를 생성하고, 출력할 때 반복문 사용 불가능
		
		
	}

}
