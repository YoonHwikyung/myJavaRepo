package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import model.vo.Book;

public class BookController {
	
	private Book[] list = new Book[5];
	{ // 초기화 블럭이라고 해서 => list라는 배열에 샘플데이터로 4개의 객체를 미리 담아둘 수 있음
		list[0] = new Book("자바의 정석", "제임스 고슬링", "나무", new Date(2018-1900, 4-1, 15), 20000);
		list[1] = new Book("여러분들 성공할꺼에요", "보람쌤", "KH", new Date(2019-1900, 6-1, 15), 30000);
		list[2] = new Book("API의 모든것", "강보람", "KH", new Date(2017-1900, 2-1, 13), 15000);
		list[3] = new Book("씨언어 프로그래밍", "김절차", "문학동네", new Date(2016-1900, 8-1, 30), 10000);
	}
	
	public BookController() {}
	
	// 1. 도서 전체 출력 기능 메소드
	public void printAll() {
		
		// list 배열 전체 출력하는 구문 작성 
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		
	}
	
	
	
	
	
	// 2. 도서 추가 기능 메소드
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// 1. 매개변수로 전달받은 newPrice값  ==>      String --> int로 변환 작업 (파싱 해야됨)
		int iPrice = Integer.parseInt(newPrice);
		
		
		// --------------------------------------------------------
		// 2. 매개변수로 전달받은 newDate값   ==>       String --> Date로 변환 작업
		//	  '-'를 구분자로 StringTokenizer 또는 split을 이용하여 문자열 분리 후 각각 년,월,일 을 Date에 적용
		
		StringTokenizer stn = new StringTokenizer(newDate, "-");
		int year = Integer.parseInt(stn.nextToken());
		int month = Integer.parseInt(stn.nextToken());
		int day = Integer.parseInt(stn.nextToken());
		
		Date publishDate = new Date(year-1900, month-1, day);
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		
		// ------------------------------------------------------
		// 3. 나머지 전달받은 값들과 위에서 변환작업을 해준 price와 date값을 가지고
		//	  매개변수 생성자를 통해 생성한 값 4번 인덱스에 대입
		list[4] = new Book(newTitle, newAuthor, newPublisher, publishDate, iPrice);
		
	
	}
	
	
	// 3. 도서 출간일 출력 기능 메소드
	public void printBookPublishDate() {
		
		// 마지막 도서의 출간일만 출력
		// "xxxx년 xx월 xx일 출간" 과 같은 형식으로 출력 (SimpleDateFormat이용)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(list[4].getPublishDate()) + "출간");
		
		
		
	}
	
	
	// 4. 도서 검색 기능 메소드
	public void searchBook(String searchTitle) {
		
		// 도서 리스트를 전체적으로 조회하면서 (for문 이용)
		// 전달받은 검색어를 "포함"한!! 도서들 모두 출력(문자열.contains(문자열)) 
		
		for(int i =0; i<list.length; i++) {
			
			int count = 0 ;
			if(list[i].getTitle().contains(searchTitle)) {
				System.out.println(list[i]);
				count += 1;
			}
			
		}
		
	
		
	}
	
	
	

}
