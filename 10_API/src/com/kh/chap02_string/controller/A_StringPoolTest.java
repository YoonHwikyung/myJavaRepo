package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	// String�� �Һ� Ŭ���� => �����ϴ� ���� ������ ���� ����ִ� �������� �������� �ʴ´�.
	
	// 1. �����ڸ� ���� ���ڿ� ���
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2); // ��� : false(�ּҰ� ���̱� ����)
		
		System.out.println(str1);
		System.out.println(str2/*.toString()*/);
		// toString() => String Ŭ������ �̹� �������̵� �Ǿ����� (���� ����ִ� ���ڿ� ��ȯ)
		
		System.out.println(str1.equals(str2));
		// Object Ŭ������ equals �޼ҵ�� �ּҰ� ���� �� �̱� ������ ������ false�� ���;� ��
		// ������, String Ŭ������ �̹� equals()�޼ҵ尡 �������̵� �Ǿ��ִ�! (���ڿ� �񱳰� �ǵ���)
		// �׷��� ������, �ּҰ� �񱳰� �ƴ� ���� ��� ���ڿ��� �񱳰� �̷������!
		
		// ���� �ּҰ��� ��Ÿ���� ������? �׷� �ؽ��ڵ带 ���� �ǰڴ�!
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// ? �� ���� �ؽ��ڵ� ���� ���� ����..
		// ObejectŬ������ �ؽ��ڵ� �޼ҵ带 String Ŭ������ �� �������̵� �صξ���.
		// (�ּҰ� ����� �ƴ� ���� ��� ���ڿ� ������� �ؽ��ڵ尪 ���� ��ȯ�ϵ���)
		
		// ���� ���� ���� �ּҰ��� ���� �;�!!!!
		// System.identityHashOde(���۷���)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// �������� �ּҰ��� �ٸ��ٴ� ���� ������ Ȯ�� �� �� �ִ�!
		
	
	}
	
	// 2. ���ڿ��� ���ͷ��� ����
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";
		// ������ ���ý� StringPool(���Ǯ) ������ �ö�
		// StringPool Ư¡ : ������ ���ڿ� ���� �Ұ�
		
		System.out.println(str1 == str2); // ��� : true(�ּҰ� ��ġ)
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// ���� ���� ���� �ּҰ��� ���� �;�!!
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	
	// �Һ�Ŭ����
	public void method3() {
		
		String str = "hello";
		System.out.println(System.identityHashCode(str));
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str));
		
		str += "abc"; // str = str + "abc";
		System.out.println(System.identityHashCode(str));
		
		// �Һ� �̶���ؼ� ������ �ƿ� �Ұ����� ���� �ƴ϶�
		// ������ �� �ڸ����� �����Ǵ� ������ �ƴϴ�!!
		// => �Ź� ���ο� �ּҰ��� �����ϰ� �ȴ�!
	}

}
