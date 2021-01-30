package com.kh.chap01.objectVSobjectArray.run; // ��ü vs ��ü �迭 ��

import java.util.Scanner;

import com.kh.chap01.objectVSobjectArray.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		// ����ڿ��� �� 3�� ���� ������ �Է� ���� ����
		// �⺻�ڷ����� �ƴ� �� �ܿ� �ڷ���(�ּҰ��� ��游�� �ڷ���)�� �⺻���� null
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		// ����ڿ��� �� 3�� ���� ������ �Է� ���� ����
		Scanner sc = new Scanner(System.in);
		
		// ��ü ���� ������ ���� ����ڷκ��� �Է� ���� ��
		// �� ��ü�� ������ ���ÿ� �ʱ�ȭ
		for(int i=0; i<3; i++) { // �ݺ�Ø�� : 3
			
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
			
			// �ϳ��� ���� ������ ��� �Է� ���� �� ���ǹ�
			// �Ź� ���ǰ˻� �� �� ��ü�� ���� ���� �����ؾ� ��(��ü�� ��������� ������)
			if(i == 0) { // i�� 0�� ��� ù ��° ��ü ����
				bk1 = new Book(title, author, price, publisher);
			}else if(i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
		}
		// ��ü ���� ��
		
		// ��ü ���� ������ ��ȸ�ϱ� (����ϱ�)
		// 3���� ��¹��� ����ϴ� ����
		// �ݺ��� ��� �Ұ�
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		// ���� �������� �˻��ϴ� ����
		System.out.print("�˻��� å ���� : ");
		String search = sc.nextLine();
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}else if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}else if(bk3.getTitle().equals(search)) { //else (X). ����ڰ� �Է��� ���� bk3�� ���ٰ� ����� �� ����.
			System.out.println(bk3.information());
		}else {
			System.out.println("�˻��Ǵ� ������ �����ϴ�.");
		}
		
		
		// ������ 3���� ��������, 100���� ������� �ϸ� ���� ��
		// ��ä�� �����ϰ�, ����� �� �ݺ��� ��� �Ұ���
		
		
	}

}
