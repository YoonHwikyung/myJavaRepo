package com.kh.operator; // �н����� : ��� ������

public class B_Arithmetic {
	
	public void method() {
		
		// ��� �����ڸ� ���� ������ ��Ƶ���
		int num1 = 10;
		int num2 = 3;
		
		// System.out.println("num1 + num2 = " + num1 + num2); -> "10" + 3 = 103�� ��µȴ�.
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("\nnum1 - num2 = " + (num1 - num2));
		System.out.println();
		System.out.println("num1 x num2 = " + (num1 * num2)); // ���ϱⰡ ���ϱ⺸�� �켱������ ������ ��ȣ�� ���� �ʾƵ� �ȴ�, �������� ���� ����α� ����!
		System.out.println("num1 / num2 = " + (num1 / num2)); // �������� �����θ� ��� ����
		System.out.println("num1 % num2 = " + (num1 % num2)); // �������� ������ (������������)
		
		
	}

}
