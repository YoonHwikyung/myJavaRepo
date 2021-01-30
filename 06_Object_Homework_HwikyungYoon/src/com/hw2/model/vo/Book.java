package com.hw2.model.vo;

public class Book { // vo�� Ŭ����

	// �ʵ��
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	
	// �����ں�
	// �⺻������
	public Book() {
		
	}
	// �Ű����� ������
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	
	// �޼ҵ��
	// setter �޼ҵ�
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// getter �޼ҵ�
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public String getAuthor() {
		return author;
	}
	
	public String information() {
		return title + "\t" + price + "\t" + discountRate + "\t" + author;
	}
	
	public void information2() {
		System.out.println("������ = " + title);
		System.out.println("���ε� ���� = " + (int)(price - (price * discountRate)) + "��");
		
	}
	
	
}
