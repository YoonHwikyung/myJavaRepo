package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/ {

	// �̹����� �θ� Ŭ����, �ڽ� Ŭ���� ���� �������� �����Ŵ�!
	// ��� Ŭ������ �˰Ը𸣰� Object�� ����� �ް� �ִ�!
	// Object Ŭ������ ���ǵǾ� �ִ� �޼ҵ尰�� �͵��� ������� �� �� �ְ�, �����ǵ� ���� �ϴ�!
	
	// �ʵ��
	private String title;
	private String author;
	private int price;
	
	// �����ں�
	// �⺻ ������
	public Book() {}
	// �Ű����� ������
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// �޼ҵ��
	// setter & getter �޼ҵ�
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
	// information �޼ҵ� (��� �ʵ��� ������ �ñ��� �� ȣ���ϴ� �޼ҵ�)
	public String informaion() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	*/
	
	/*
	 * * �������̵�
	 * - �ڽ� Ŭ������ ��ӹް� �ִ� �θ�Ŭ������ �޼ҵ带 ������(���ۼ�)�ϴ� ��
	 * - �θ� �����ϴ� �޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٴ� �ǹ�
	 *   �ڽ� �޼ҵ尡 �켱���� ������.
	 *   
	 * * �������̵� ���� ����
	 * - �������ϰ��� �ϴ� �θ� �޼ҵ��� �޼ҵ��� ��ġ�ؾ� ��
	 * - �Ű����� �ڷ���, ����, ���� ���� (�Ű��������� ��� ����!)
	 * - ��ȯ�� ���� (��, jdk�� ������ �Ǹ鼭 ��ȯ���� �ڽ��ڷ��������� ����)
	 * - �θ� �޼ҵ��� ���������ں��� ���ų� Ŀ����! ( �θ� : protected => �ڽ� : protected, public ����)
	 * 
	 * ===> �Ծ��� ���� ( �ʰ� �������Ϸ��� �� ������ ��Ģ�� ������!!)
	 * 
	 * * Override ������̼�
	 * - ���� ���� ( ��ø� ���� �ʾƵ� �θ� �޼ҵ�� ���°� �Ȱ����� �׳� �������̵� �� �ȴ�!)
	 * - ��, ������̼��� ���̴� ����?
	 *	 > �߸� ������� ��� ������ �˷���. �ٽ� �� �� ������ �� �ְ� ��������.
	 *	 > �θ� �޼ҵ���̳� �Ű������� ������ ��� -> ���� �߻� ������ -> ã�ƺ��� ����
	 *	       �ڽ� �޼ҵ嵵 ���������� �����Ǵ� ��� -> ���� �߻� ������  -> ã�ƺ��� ����
	 *	 >
	 */
	
	
	
	@Override
	public String toString() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	
	
}
