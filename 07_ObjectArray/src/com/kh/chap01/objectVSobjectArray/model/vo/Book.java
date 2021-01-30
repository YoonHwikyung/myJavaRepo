package com.kh.chap01.objectVSobjectArray.model.vo; // 객체 vs 객체 배열 비교

public class Book { // vo용 클래스
	
	// 도서명, 저자, 가격, 출판사
	
	// 필드부
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	// 생성자부
	// 기본생성자(단지 객체 생성을 위한 용도)
	public Book() {
		
	}
	// 매개변수(모든필드) 생성자(객체 생성과 동시에 초기화하기 위한 용도)
	public Book(String title, String author, int price, String publisher) { // 매개변수 자리이니 => 자료형 변수명
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	// 메소드부
	// 각 필드에 대한 setter 메소드
	public void setTitle(String title) {
		this.title = title; 
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	// 각 필드에 대한 getter 메소드
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	
	// 모든 필드를 하나의 문자열로 합쳐서 반환 해주는 information 메소드
	
	public String information() {
		return title + ", " + author + ", " + price + ", " + publisher;
		
	}
	
	  
	
	
	
	
	
	
}
