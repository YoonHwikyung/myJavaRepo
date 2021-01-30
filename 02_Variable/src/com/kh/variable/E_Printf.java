package com.kh.variable; // �н����� : ��¹� �� ������ printf

public class E_Printf {

	public void printfMethod() {
		
		/*
		 * [������ ����� println, print]
		 * System.out.println(����ϰ����ϴ°�); => �� ��� �� �� �� ����
		 * System.out.print(����ϰ����ϴ°�); => ���� ��¸� �ϰ� ��
		 * 
		 * [printf]
		 * System.out.printf("����ϰ����ϴ�����(����)", ������� ����ϰ����ϴ� ��, ��, ��, ...);
		 * => ����(����)�� ���缭 ������ ��¸� �ϰ� ��
		 * 
		 * -������ Ȯ���� �� ���̴� ����-
		 * %d : ����
		 * %f : �Ǽ�
		 * %c : ����(�ѱ���)
		 * %s : ���ڿ�
		 * 
		 */
		
		// ������� ���� ���� ������ �غ���! int ������ ���ڸ� ��Ƶΰ� printf�� ����غ���!
		int iNum1 = 10;
		int iNum2 = 20;
		
		// xx, xx (����ϰ��� �ϴ� ����)
		// ���� ������� �غ���! (println ����غ���!)
		System.out.println(iNum1 + ", " + iNum2);
		// printf �� ����غ���!
		//System.out.printf("%d, %d", iNum1, iNum2);
		//�ٹٲ� ���ϴ� 
		System.out.printf("%d, %d\n", iNum1, iNum2);
		
		// xx + xx = xxx(����ϰ��� �ϴ� ����)
		// ���� ������� �غ���! (println ����غ���!)
		System.out.println(iNum1 + " + " + iNum2 + " = " +(iNum1 + iNum2));
		// printf �� ����غ���!
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2);
		
		System.out.printf("%5d\n", iNum1);
						//5ĭ�� ���� �� ���� ��  ������ ����
		System.out.printf("%-5d\n", iNum1);
						//5ĭ�� ���� �� ���� �� ���� ����
		
		double dNum = 4.57;
		
		System.out.printf("%f\n", dNum); //%f - �Ҽ��� �Ʒ� 6° �ڸ����� ������!
		System.out.printf("%.1f\n", dNum); // %.1f - �Ҽ����Ʒ� ù ° �ڸ� ���� ������! (�ݿø�)
		System.out.printf("%.2f\n", dNum); // %.2f - �Ҽ����Ʒ� �� °�ڸ� ���� ������!
											// �Ҽ��� �Ʒ� �� �� �ڸ����� ������ ���� ����(�ݿø�)
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n", ch, str); // ���� �� �� Ȯ��, �� ���� �� ������ ��
		System.out.printf("%C %S\n", ch, str); // %C, %S �빮�ڷε� ��� �����ϴ�.	
				
		
		// xx�� xxx�� �ݰ����ϴ�!
		//System.out.printf("%d��  %s\n", iNum1, "�ְ澾 �ݰ����ϴ�");
		
		// xxxx�⿡ �� �������带 ���� �ٷ���!
		//System.out.printf("%s %d�� %s\n", "�ְ澾! ", 2021, "�� �������带 �� ���� �ٷ���!");
		
		
	} 
	

	
	
}
