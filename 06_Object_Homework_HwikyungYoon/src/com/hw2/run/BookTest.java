package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	
	public static void main(String[] args) {
		
		// ù ��° book ��ü ����
		Book bk1 = new Book();
		
		// �� ��° Book ��ü ���� �� �ʱ�ȭ ( �Ű����� ������ �̿�)
		Book bk2 = new Book("�ڹ�������", 20000, 0.2, "����");
		
		// �� ��ü�� ���� �ʵ� �� ��� Ȯ��
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		System.out.println("================================");
		
		// ù ��° ��ü�� ���� ���� setter�� �̿��Ͽ� ����
		bk1.setTitle("C���");
		bk1.setPrice(30000);
		bk1.setDiscountRate(0.1);
		bk1.setAuthor("ȫ�浿"); 
		
		// ������ ��� Ȯ��
		System.out.println("������ ��� Ȯ��");
		System.out.println(bk1.information());
		
		System.out.println("================================");
		
		// ���� ���
		//System.out.println("������ = " + bk1.getTitle());
		//System.out.printf("���ε� ���� = %.0f��\n", bk1.getPrice() - (bk1.getPrice() * bk1.getDiscountRate()));
	
		bk1.information2();
		bk2.information2();
		
		
	
	
	}
}
