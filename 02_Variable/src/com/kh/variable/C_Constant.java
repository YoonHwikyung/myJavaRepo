package com.kh.variable; // �н����� : ���

public class C_Constant {

	public void finalConstant() {
		// ���� : ���ο� �� ��Ƽ� �� ���� ����
		int age = 20;	// ������ ���� �����غ���! // ��ƺ���!
		System.out.println("age : " + age); // ȣ���غ���!
		
		//age = 21;	// �� �ذ� �귶�� ���� age ���� �����Ѵ�. (���� �� �ִ� ��)
		age = age + 1;
		System.out.println("����� age : " + age);
		
		// ��� : ���ο� ���� ��Ƽ� �� ���� �Ұ�
		//		=> �� �� ��� ���� ������ �Ұ����ϴ�! (������ ���� ��Ƶ� �� ���)
		// ����� ������� => �� �빮��
		final String BAN = "IŬ����";
		// BAN = "AŬ����"; => ����! �� �� ���� �� ���� �Ұ��� �ϱ� ������  ������ �����!
		System.out.println("�� : " + BAN);
		
		
	}
}
