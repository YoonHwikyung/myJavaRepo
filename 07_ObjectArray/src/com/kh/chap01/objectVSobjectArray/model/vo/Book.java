package com.kh.chap01.objectVSobjectArray.model.vo; // ��ü vs ��ü �迭 ��

public class Book { // vo�� Ŭ����
	
	// ������, ����, ����, ���ǻ�
	
	// �ʵ��
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	// �����ں�
	// �⺻������(���� ��ü ������ ���� �뵵)
	public Book() {
		
	}
	// �Ű�����(����ʵ�) ������(��ü ������ ���ÿ� �ʱ�ȭ�ϱ� ���� �뵵)
	public Book(String title, String author, int price, String publisher) { // �Ű����� �ڸ��̴� => �ڷ��� ������
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	// �޼ҵ��
	// �� �ʵ忡 ���� setter �޼ҵ�
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
	// �� �ʵ忡 ���� getter �޼ҵ�
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
	
	// ��� �ʵ带 �ϳ��� ���ڿ��� ���ļ� ��ȯ ���ִ� information �޼ҵ�
	
	public String information() {
		return title + ", " + author + ", " + price + ", " + publisher;
		
	}
	
	  
	
	
	
	
	
	
}
