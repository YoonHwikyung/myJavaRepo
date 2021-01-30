package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/ {

	// 이번에는 부모 클래스, 자식 클래스 따로 만들지는 않을거다!
	// 모든 클래스는 알게모르게 Object의 상속을 받고 있다!
	// Object 클래스에 정의되어 있는 메소드같은 것들을 마음대로 쓸 수 있고, 재정의도 가능 하다!
	
	// 필드부
	private String title;
	private String author;
	private int price;
	
	// 생성자부
	// 기본 생성자
	public Book() {}
	// 매개변수 생성자
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// 메소드부
	// setter & getter 메소드
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	/*
	// information 메소드 (모든 필드의 정보가 궁금할 때 호출하는 메소드)
	public String informaion() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	*/
	
	/*
	 * * 오버라이딩
	 * - 자식 클래스가 상속받고 있는 부모클래스의 메소드를 재정의(재작성)하는 것
	 * - 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미
	 *   자식 메소드가 우선권을 가진다.
	 *   
	 * * 오버라이딩 성립 조건
	 * - 재정의하고자 하는 부모 메소드의 메소드명과 일치해야 함
	 * - 매개변수 자료형, 갯수, 순서 동일 (매개변수명은 상관 없다!)
	 * - 반환형 동일 (단, jdk가 버전업 되면서 반환형의 자식자료형까지는 가능)
	 * - 부모 메소드의 접근제한자보다 같거나 커야함! ( 부모 : protected => 자식 : protected, public 가능)
	 * 
	 * ===> 규약의 개념 ( 너가 재정의하려면 이 정도의 규칙은 지켜줘!!)
	 * 
	 * * Override 어노테이션
	 * - 생략 가능 ( 명시를 하지 않아도 부모 메소드와 형태가 똑같으면 그냥 오버라이딩 잘 된다!)
	 * - 단, 어노테이션을 붙이는 이유?
	 *	 > 잘못 기술했을 경우 오류를 알려줌. 다시 한 번 검토할 수 있게 유도해줌.
	 *	 > 부모 메소드명이나 매개변수가 수정된 경우 -> 오류 발생 시켜줌 -> 찾아보기 쉽다
	 *	       자식 메소드도 마찬가지로 수정되는 경우 -> 오류 발생 시켜줌  -> 찾아보기 쉽다
	 *	 >
	 */
	
	
	
	@Override
	public String toString() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	
	
}
