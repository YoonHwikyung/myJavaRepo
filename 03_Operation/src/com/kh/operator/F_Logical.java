package com.kh.operator; // �н� ���� : �� ������

import java.util.Scanner;

public class F_Logical {

	/*
	 * * �� ������
	 * - �� ���� ������ �����ϴ� ������
	 * - ���� (��������) ����		=> ����			// true/false (��������) true/false ==> true/false ����
	 * 
	 *  [�� ������ ����]
	 * 1. ���� && ���� : �� ��, ���� �� �� �� true�� ��� => �������� ����� true ( �� �� �ϳ��� false�� ����� false)
	 *      ���ص�
	 * 2. ���� || ���� : �� ��, ���� �� �� �߿� �ϳ��� true => �������� ����� true ( �� �� �ϳ��� true�� ����� true)
	 * 		������
	 * 
	 */
	
	
	
		// and �����ڸ� �����غ���! ���� && ����
	public void method1() {
		// ����ڰ� �Է��� �������� ���"�̸鼭(�̰�)" ¦������ Ȯ���ϰ��� �Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �� �� �Է� : ");
		int num = sc.nextInt();
		
		// ����ڰ� �Է��� num���� ����̸鼭 ¦���Դϱ�? �� ����� boolean�� �־����.
		boolean result = (num > 0) && (num % 2 == 0);
			// && �ǹ� : �׸���, ~�̰�, ~�̸鼭, ���ÿ�
		
		System.out.println("����ڰ� �Է��� ���� ����̸鼭 ¦���Դϱ� : " + result);
		
		
	}
	// �� �� ���ø� ��� �����غ���!
	public void method2() {
		//����ڰ� �Է��� ���� ���� 1 �̻� 100���� ������ Ȯ���ϰ��� �Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �� �Է� : ");
		int num = sc.nextInt();
		
		//����ڰ� �Է��� ���� ���� 1 �̻�"�̰�" 100 ���������� ���� ������� ������ ��ƺ���! ������!
		// boolean result = ( 1 <= num <= 100 ) => �ڹٿ����� ���� ����. �ݵ�� �ΰ��� ������ �����ϰ� ������� ��
		boolean result = (num >= 1) && (num <= 100);

		System.out.println("����ڰ� �Է��� ���� 1 �̻�, 100 ���� �Դϱ� : " + result); // => ����ڰ� �Է��ϴ� ���� ���� ���� ����� �޶�����. 
		
		/* ����
		 * && (and) : �� ���� ������ ��� true���Ƹ� &&�� ������� ���������� true
		 * 			     �� �� �ϳ��� false�� �ȴٸ� && ������ ������� false
		 * 
		 */
		
		
		
	}
	
		// ���� or�����ڸ� �����غ���! ���� || ����
	public void method3( ) {
		
		//����ڰ� �Է��� ���� y"�̰ų�(�Ǵ�)" Y���� Ȯ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �Ͻ÷��� y �Ǵ� Y�� �Է��ϼ��� : ");
		
		char ch = sc.nextLine().charAt(0);
		
		//����ڰ� �Է��� ���� y �Ǵ� Y
		// boolean result = 'y' == ch =='Y'; =>�Ұ���. �� ���� �����ְ� ����� �Ѵ�!
		boolean result = (ch == 'y') || (ch == 'Y');
		// || (or) : �Ǵ�, ~�̰ų�
		
		System.out.println("����ڰ� �Է��� ���� y �Ǵ� Y �Դϱ� : " + result);
		
		/* ����
		 * || (or) :  �� ���� ���� �� �ϳ��� true�� ���  => ���� ����� true
		 * 			     �� ���� ���� ��� false�� ��� => ���� ����� false
		 * 
		 */
		
		// �� �����ڸ� ���� ��� ���ǹ����� ���� ����Ѵ�!
		// ���� ��Ʊ� ������ ������ ������ �������� ���ø� �ϸ� ���� �� ������ ��!
		
	}
	
	
	// and ($$) or (||) ���� ����
	/*
	 *  && : �� ���� ������ ��� true���� ������� true�̴�. (AND)
	 *  	true && true		=> true
	 *  	true && false		=> false
	 *  	false && true		=> false
	 *  	false && false		=> false
	 *  
	 * 		=> && �����ڸ� �������� ���� ����� false���� ���´ٸ� ���� ������ ���� �������� �ʴ´�.
	 * 
	 * 
	 *  || : �� ���� ���� �� �ϳ��� true�� ������� true�̴�. (OR)
	 *  	true || true		=> true
	 *  	true || false		=> true
	 *  	false || true		=> true
	 *  	false || false		=> false
	 *  
	 *  	=> || �����ڸ� �������� ���� �����  true���� ���´ٸ� ���� ������ ���� �������� �ʴ´�.
	 *  
	 */
	
		//���� ������ �´��� �����غ���!
	public void method4() {
		
		int num1 = 10;
		
		boolean result1 = (num1 <= 5) && (++num1 > 0);
		
		System.out.println("result1 : " + result1); // => false
		System.out.println("&& ���� �� num1 : " + num1); // => 10
			// => &&���꿡�� ���� ������ false�̱� ������ ���� ������ �������� �ʾҴ�.
			// => �׷��� ������ &&���� �� num1�� ���� 10�̴�!
			// ���� ���� ������ true���ٸ� &&���� �� num1�� ���� 11�� ��!
		
		
		int num2 = 10;
		
		boolean result2 = (num2 <20) || (++num2 > 0);
		
		System.out.println("result 2 : " + result2);
		System.out.println("|| ���� �� num2 :" + num2);
			// => ||���꿡�� ���� ������ true�� ���Ա� ������ ���� ������ �������� �ʴ´�.
			// => �׷��� ������ ||���� �� num2�� ���� 10�̴�!
			// => ���� ���� ������ false���ٸ� ||���� �� num1�� ���� 11�� ��!
	
		// �����ڴ� ���� �� �����! ���������� ���� �����ڸ� �������!
		
	}
	
}
