package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap05_constructor.model.vo.User;
import com.kh.chap06_method.controller.NonStaticMethodTest;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethodTest;

public class MethodRun {

	public static void main(String[] args) {
		/*
	NonStaticMethodTest ns = new NonStaticMethodTest();
	
	// 1. �Ű������� ��ȯ���� ���� �޼ҵ� ȣ��
	ns.method1();
	
	// 2. �Ű������� ������ ��ȯ���� �ִ� �޼ҵ� ȣ��
	//String name = ns.method2(); // �޼ҵ�2�� ���� ���ƿ��� ������� name�̶�� ������ ���� �� �ִ�.
	//System.out.println(name + "�� ȯ���մϴ�^:^");
	//System.out.println(ns.method2() + "�� ȯ���մϴ�^:^");
	
	// 3. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ� ȣ��
	ns.method3("���̹���", 2);
	// String str = ns.method3("���̹���", 2); => ��ȯ���� ���� ������ ����!
	
	// 4. �Ű������� ��ȯ�� �� �� �ִ� �޼ҵ� ȣ��
	int result = ns.method4(10, 20); // �̷��Ը� �ϸ� ������� ��������� ������ ������ ���� ��ȯ�Ǳ�� ���� ��. ����ؼ� Ȯ�ΰ���
	System.out.println("10 + 20 = " + result);
	// System.out.println("10 + 20 = " + ns.method4(10,20)); �� ���� ����� ��Ÿ����
	
	
	
	// ** �߰� **
	// �Ű������� ��ü�� ������ �� �ִ�. (��ü�� �ּҰ��� ���� �� �� �ִ�. (���� ����ó��))
	
	// User ��ü ���� ( chap05���� ������ voŬ���� �̿�)
	User u = new User("user01", "pass01", "ȫ�浿");
	System.out.println(u.information());
	
	ns.method5(u);
	
	System.out.println(u.information());
	*/
		
		/////////////////////////////////////////////////////////////
		
		// ��ü ����(new) ���� �ʾƵ� ȣ�� ������ static �޼ҵ�
		// ���� import�� �ʿ��ϴ�!
		StaticMethodTest.method1();
		
		//String str = StaticMethodTest.method2();
		// str�̶�� ������ �޼ҵ�2�� ȣ���ؼ� ��ȯ�� ���� ��ƾ���
		//System.out.println(str);
		System.out.println(StaticMethodTest.method2());
		
		System.out.println(Math.random()); // => MathŬ������ ���� ���� static �޼ҵ��̱� ������ ���� ��ü �������� �ʰ� �ٷ� �� �� �־���  ��!!!
		
		// 3. �Ű������� �ְ� ��ȯ���� ���� ����ƽ  �޼ҵ� ȣ��
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		StaticMethodTest.method3(name, age);
		
		
		// 4. �Ű������� �ְ� ��ȯ���� �ִ� ����ƽ �޼ҵ� ȣ��
		int result = StaticMethodTest.method4(20, 10, 'x');
		System.out.println("��� : " + result);
		
		
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(5, "������");
		ot.test("����", 7);
		ot.test(2, 3);
		
		// �ڹٿ��� �̹� ���� �Ǿ��ִ� �����ε� ��ǥ���� ��
		// ��¹�
		System.out.println("�ȳ�");
		System.out.println(10);
		System.out.println(1.54);
		
	}

}
