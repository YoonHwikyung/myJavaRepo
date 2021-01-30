package com.kh.chap01.objectVSobjectArray.run; // ��ü �迭

import java.util.Scanner;

import com.kh.chap01.objectVSobjectArray.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		// ������ vo�� Ŭ���� Book �̿�! 
		// ��ü �迭 ����
		Book[] books = new Book[3];
		System.out.println(books.length);
		/*
		books[0] = new Book(); // books �迭�� 0�� �濡 Book��ü�� �ʱ�ȭ �� �� �ִ�.
		books[1] = new Book(); // books �迭�� 1�� �濡 Book��ü�� �ʱ�ȭ �� �� �ִ�.
		books[2] = new Book(); // books �迭�� 2�� �濡 Book��ü�� �ʱ�ȭ �� �� �ִ�.
		*/
		// ObjectRun�� ���غ���!
		Scanner sc = new Scanner(System.in);
		
		// ��ü ���� ������ ���� ����ڷκ��� �Է� ���� ��
		// �� ��ü�� ������ ���ÿ� �ʱ�ȭ
		for(int i=0; i<books.length; i++) {
			
			System.out.println(i + 1 + "���� ���� ���� �Է�");
			System.out.print("���� : ");
			String title = sc.nextLine();
			System.out.print("���� : ");
			String author = sc.nextLine();
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine(); // ���ۿ� �����ִ� ���͸� ��������!
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			
			books[i] = new Book(title, author, price, publisher); // ��ü �迭�� �̿��� �� �迭���� ���� �˻� �ʿ� ����. 
		} // ��ü ���� ��
		
		// ��ü ���� ������ ��ȸ�ϱ�(����ϱ�)
		// ObjectRun������ �ݺ��� ��� �Ұ����ߴ�.
		// ��Ģ ã��
		//System.out.println(books[0].information());
		//System.out.println(books[1].information());
		//System.out.println(books[2].information());
		
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		// ��ü �迭�� ����ϸ� �̷��� �����ϰ� �ڵ� ����� �� �� �ִ�.
				
		
		// �˻�����
		System.out.print("�˻��� å ����: ");
		String search = sc.nextLine();
		
		int count = 0; // ��ġ�ϴ� ������ ã�� ���� 1 ������Ŵ ( �˻��Ǵ� ������ �����ϴ� �� ���� ���� Ȱ��)
		
		for(int i=0; i<books.length; i++) {
			
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
				count++; // ��ġ�ϴ� ������ ã�� ���� 1 ����
			}
		}
		
		if(count == 0) { // �ݺ����� �� �����µ��� 0�̴�? ��ġ�ϴ� ������ �� ���� ã�� ���Ѱ��
			System.out.println("�˻��Ǵ� ������ �����ϴ�.");
		}
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
