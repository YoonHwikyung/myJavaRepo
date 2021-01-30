package com.kh.chap06_method.controller; // static �޼ҵ�

public class StaticMethodTest {

	// 1. �Ű������� ���� ��ȯ���� ���� �޼ҵ�
	public static void method1() {
		System.out.println("�Ű������� ���� ��ȯ���� ���� static �޼ҵ�");
		
	} 
	
	// 2. �Ű������� ���� ��ȯ���� �ִ� �޼ҵ�
	public static String method2() {
		System.out.println("�Ű������� ������ ��ȯ���� �ִ� �޼ҵ�");
		return "�ȳ��ϼ���";
	}
	
	// 3. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ�
	public static void method3(String name, int age) {
		System.out.println(age + "���� " + name + "�� ȯ���մϴ�~!");
		
	}
	
	// 4. �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
	public static int method4(int num1, int num2, char op) {
		
		int result = 0;
		
		if(op == '+') {
			result = num1 + num2;
			
		}else if(op == '-') {
			result = num1 - num2;
			
		}else if(op == '*' || op == 'x') {
			result = num1 * num2;
			
		}else if(op == '/') {
			result = num1 / num2;
			
		}
		
		return result;
	}
	
	
	// => static �޼ҵ�� ��ü ���� ���� ��� �����ϴ�!
	
}
