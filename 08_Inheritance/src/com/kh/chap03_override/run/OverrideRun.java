package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		
		// ��� Ŭ������ Object�� ��� �ް��ִ�.
		// ��, �ֻ��� Ŭ������ �׻� Object��
		// == Object�� �ִ� �޼ҵ���� �� ������ �� �� ����
		// == ���� ���� ������ �����ǵ� ������! (�������̵�)
		
		// Book ��ü 2�� ����
		Book bk1 = new Book("������ ����", "������", 10000); // �Ű����� ������ �̿��ؼ� ������ ���ÿ� �ʱ�ȭ
		Book bk2 = new Book("������ ����", "������", 10000); // ���빰�� ��ġ�ϴ� ���� ��� ���ο� �� ��ü�� �������.

		System.out.println(bk1 == bk2); // false
		
		System.out.println(bk1.hashCode());
		System.out.println(bk2.hashCode());
		// ��? �ٵ� �����غ��� Book Ŭ�������� hashCode() �޼ҵ尡 ���µ�?
		// => �˰Ը𸣰� Book Ŭ������ �θ��� Object Ŭ������ �޼ҵ带 ȣ���� ��!
		
		System.out.println(bk1.equals(bk2)); // equals�� ���ڿ����� ����񱳰� �ƴ�, ��� ����� ����!
		// Object Ŭ������ equals�޼ҵ� : �� ��ü�� �ּҰ� ���� ��� ��ȯ
		
		// ��¹� �ȿ� � ���۷����� ����ϰ��� �� �� JVM�� �ڵ����� Object Ŭ������ �ִ�
		// �ش� ���۷���.toString() �޼ҵ带 ȣ����
		// + �ּҰ��� ��游�� �� : ��������, ���۷��� ����
		System.out.println(bk1/*.toString()*/);
		System.out.println(bk1.toString());
		//System.out.println(bk1.information());
		
		// * �������̵�
		// �� ~ bk1 ���� ȣ�� ���� �� Object Ŭ������ .toString() �޼ҵ尡 �˰Ը𸣰� �پ��־���,
		// �� .toString()�� �ش� ���۷����� �ּҰ��� 16������ ��Ÿ���� �ű���~
		// �׷��� bk1���� ����ϸ� bk1�� �ּҰ��� ���Դ� �ű���~
		// * �ٵ� ���� .toString() �޼ҵ尡 ���� �ȵ��!
		// bk1�� ������ �ش� ��ü�� ����ִ� ������ �����ϰ� �;�~
		// �׷��� ���ݱ��� Book Ŭ������ information()�� ���� �����־���!
		// �׷��ٸ� ObjectŬ������ �ִ� �޼ҵ带 *�������̵� �ؼ� ���ļ� �Ẹ��!
		// Book Ŭ�������� information -> toString ���� �ٲ������!
		// �׷� ���� bk1 ���ø��ϸ� �˰Ը𸣰� .toString()�� �پ������Ű�,
		// BookŬ������ �ִ� Overriding �� toString() �޼ҵ尡 ����ǰڴ�!!!
		
		System.out.println(bk2);
		
		// ��, �������ʹ� voŬ������ �ۼ��ؾ��� ��
		// �ʵ��, �⺻������, �Ű�����������, setter/getter, toString
		
		
		
		
		
		
		
		
		
		
	}

}
