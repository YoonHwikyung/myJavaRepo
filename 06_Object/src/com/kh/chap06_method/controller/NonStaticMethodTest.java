package com.kh.chap06_method.controller; // �޼ҵ�

import java.util.Scanner;

import com.kh.chap05_constructor.model.vo.User;

public class NonStaticMethodTest {

	/*
	 * * �޼ҵ�
	 * <ǥ����>
	 * ���������� [�����] ��ȯ�Ұ����ڷ��� �޼ҵ��([�Ű�����, �Ű�����, ...]) {
	 * 		�޼ҵ� ����(ȣ��)�� ������ �ڵ�;
	 * 		...
	 * 		[return ��ȯ��;]
	 * }
	 */ 
	
	// �������� �޼ҵ带 ������ �����غ���!
	
	// 1. �Ű������� ���� ��ȯ���� ���� �޼ҵ� 
	public void method1() {
		System.out.println("�Ű������� ��ȯ���� �� �� ���� �޼ҵ�");
		
		//return; // ��ǻ� ��� �޼ҵ忡 return�� ���� (JVM�� �ڵ����� ��������)
				  // ��, ��ȯ���� �ִ� �޼ҵ��� ��� return �����; ������ ��������� �����!
	}
	
	// 2. �Ű������� ���� ��ȯ���� �ִ� �޼ҵ�
	public String method2() {
		
		System.out.println("�Ű������� ������ ��ȯ���� �ִ� �޼ҵ�");
		
		// ����ڰ� �Է��� �̸��� ��������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		
		//String name = sc.nextLine();
		//return name;
		return sc.nextLine();
		
	}
	
	// 3. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ�
	public void method3(String name, int age) {
		
	
		System.out.println("�Ű������� ������ ��ȯ���� ���� �޼ҵ�");
		System.out.printf("%s���� ���̴� %d���Դϴ�.\n", name, age);
	}
	
	// 4. �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
		
		System.out.println("�Ű������� ��ȯ�� �� �� �ִ� �޼ҵ�");
		return num1 + num2;
	}
	
	
	// ** �߰� **
	// �Ű������� ��ü�� ���� ���� �� �ִ�!
	public void method5(User a) { // User a = u; // import ����� ��
		a.setAge(20); // 
	
	}
	
	// ������ ��� �� 
	// ���� �ε�
	// �� Ŭ���� ���� ������ �޼ҵ�� ����� �� �ִ�.
	
	
}
