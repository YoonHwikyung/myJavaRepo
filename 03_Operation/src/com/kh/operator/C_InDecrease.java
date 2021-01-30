package com.kh.operator; // �н����� : ���������� (���׿����� �� �ϳ�)

public class C_InDecrease {

	/*
	 *  * ���������� (++, --)
	 *  ++ : ���� 1 ���� ��Ű�� ������
	 *  	 ++�� (�������� ������), ��++ (�������� ������)
	 *  
	 *  -- : ���� 1 ���� ��Ű�� ������
	 *  	 --�� (�������� ������), ��-- (�������� ������)
	 *  
	 * (����������)�� : ���� ���� => ������ ��ó�� (���� ����/���� ��Ű�� �Ŀ� ó��)
	 * ��(����������) : ���� ���� => ��ó�� ������ (���� ó���ϰ� �Ŀ� ����/���� �Ѵ�)
	 * 
	 */
	 // �̸� �׽�Ʈ �ϱ� ���� �������� �޼ҵ带 Ȱ���غ���
	
	public void method1() {
		
		// ���� ����
		int a = 10; // => �޸𸮿� a��� �ڽ��� ����� �� �ȿ� 10�̶�� ���� ����� ��
		int b = ++a; // a = a+1  ==> b = a
		
		 // a++;
		 // ++a;
		// a : xx, b : xx
		System.out.println("a : " + a + ", b : " + b);
		// ��� => a : 11, b : 11 =����=> ���� ���� : ���� ������ ��Ű��, �� �Ŀ� ���Խ�Ű�ڴ�.
		
		
		// ���� ����
		int c = 10;
		int d = c++; // d = c => c = c + 1  == ���� ���� : ���� ���� �ϰ�, �� �Ŀ� ������Ű�ڴ�.
		
		// c : xx, d : xx ---> xx�� ���� ���� Ī�ϴ� ��
		// �̹����� printf �� �̿��غ���!
		System.out.printf("c : %d, d: %d\n", c, d);
		// ��� => c : 11, d: 10  =����=> ���� ���� : ���� ���� �ϰ�, �� �Ŀ� ������Ű�ڴ�.
		
		System.out.println("==============="); // => ���ο� �����̶�� ���м��� ���� ��
	
		int num = 20;
		
		System.out.println("���� num : " + num);  // num=20
		System.out.println("++num : " + ++num); // num=21
		System.out.println("num++ : " + num++); // num=21(22) tip : ���� ������ 21�� ��µ����� ���߿��� 22�� ���� ��Ű�ڴ�. (���� ������)
		System.out.println("--num : " + --num); // num=21
		System.out.println("num-- : " + num--); // num=21(20) tip : ���� ������ 21�� ��µ����� ���߿��� 20���� ���� ��Ű�ڴ�. (���� ������)
		System.out.println("���� num : " + num);  // num=20
		
		
	}
	
	public void method2() {
		
		int num1 = 20;
		int result1 = num1++ * 3; // 20(21) * 3 = 60 / tip : ���� ������ 20���� ��� �ϰ����� �������ʹ� 21�� ���� ��Ű�ڴ�.
								  // result1 = 60, num1�� ���߿� 21�� �� ��
		
		System.out.println("num1 : " + num1); // num1=21
		System.out.println("result1 : " + result1); // result1=60
		
		int num2 = 20;
		int result2 = ++num2 *3; // 21 * 3
								 // result2 = 63, num2 = 21
		
		System.out.println("num2 : " + num2); // num2 : 21
		System.out.println("result2 : " + result2); // result2 : 63
		
		
	}
	
	public void method3() { // ���� ���������ڸ� ȥ�ڼ� �����غ��� �ð�
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // a=10(11)	=> 10 ��� (���� ���� ��µǴ°� 10�̰����� �� ������ a���� 11�� ������ų�ž�.)
		
		System.out.println((++a) + (b++)); // a=12, b=20(21)	=> 32 ���
		
		System.out.println((a++) + (--b) + (--c)); // a=12(13), b=20, c=29	=> 61 ���
		
		System.out.println("a : " + a); // a : 13
		System.out.println("b : " + b); // b : 20
		System.out.println("c : " + c); // c : 29
		
		// 2��, 10�� �������Ѿ� �ϴ� ��쵵 ���� ���̴�. ���� �װ��� �������. (���ο� Ŭ��������!)
	
		
	}
	
	
}
