package com.kh.operator; // �н����� : �� ���� ������

public class A_LogicalNegation {

	public void method() {
		/*
		 * * ������ ������ (!) - ���� ������(�� �ϳ����� ������ ������ �����Ѵ�)
		 *   !���� => ����
		 *   
		 *   ����(true/false)�� �ݴ�� �ٲ��ִ� ������. !true = ���� �ʴ�? !false = Ʋ���� �ʴ�?
		 */
		
		//���� ������� �ʰ� �ٷ� ��� ȣ���غ���~ (�̹����� ��Ƶ��� ���� �ٷ� ��� ȣ������~!)
		
		System.out.println("true�� ���� : " + !true);
		System.out.println("false�� ���� : " + !false);
		
		boolean b = true;
		boolean b2 = !b;
		
		System.out.println("b2 : " + b2);
		
		
	} 
}
