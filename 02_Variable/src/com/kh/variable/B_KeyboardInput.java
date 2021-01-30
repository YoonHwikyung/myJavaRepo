package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	
	// ����ڰ� Ű���带 ���ؼ� �Է��� ���� ������ �� ������ ����ϴ� ���
	
	public void inputScanner1() {
		/*
		 * Ű����� �Է��� ���� �������� ���ؼ���
		 * �ڹٿ��� �̹� �����ϰ� �ִ� Scanner ��� Ŭ������ ������ �ִ� �޼ҵ带 �̿��ؾ� �Ѵ�.
		 * Scanner Ŭ������ ��ġ �� Ǯ���� java.util.Scanner
		 * 
		 * �ٸ� Ŭ������ �ִ� �޼ҵ带 ȣ���ϰ��� �� ��
		 * 1) Ŭ���� ����(new)
		 * 2) �ش� Ŭ������ �ִ� �޼ҵ带 ȣ��
		 *
		 */
		// java.util.Scanner sc = new java.util.Scanner(); => ���� �����ϴ� ������δ� ������ ���! �Ұ�ȣ �ȿ� ��� ������ ����ؾ��Ѵ�.
		// java.util.Scanner sc = new java.util.Scanner(System.in); // => System.in : �Է� ���� ���� ����Ʈ ������ �޾� ���̰ڴٴ� ��
		Scanner sc = new Scanner(System.in); // sc ���� �� ���� : ���� �ּ�ó���� ���� �ʾƼ�.
		
		// �����ϰ� ������� ����(�̸�, ����, Ű)�� �Է� �ް� �� �Է¹��� ������ ����ϴ� ���α׷�
		// ���� �Է� �ް��� �ϴ� ������ ���� ����� �ؼ� ������ �ؾ��Ѵ�!
		System.out.print("����� �̸��� �����Դϱ� : "); //�Է��� �����ϴ� ��¹��� ��� print �� �̿��Ѵ�! (���� Ŀ���� �����̵���)
		
		// ����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ� ( sc.next(), sc.nextLine() )
		// sc.next(); �̷��Ը� �ۼ��ϸ� �Էµ� ���� ������ ���� ���� ����. �� ������ �Դ��� Ȯ���� �Ұ����ϴ�.
		
		// String name = sc.next(); //=>����ڰ� �Է��ؼ� �����Ȱ� ���ÿ�  String name�̶�� ������ �����ϴ°��� �����ϴ�!
		// next() : ����ڰ� �Է��� �� �� ���� ���������� ���� �о��!
		//          (���� �ּҿ� ���� ������ ���Ե� ������ �ִ� ���ڿ����� �������� ����!)
		
		String name = sc.nextLine();
		// nextLine() : ����ڰ� �Է��� �� ��� �� �о��! 
		
		System.out.print("����� ���̴� �� ���Դϱ� (���ڸ� �Է�) : ");
		int age = sc.nextInt();	// next���� ����Ϸ��� �������� �ֱ��!
		// nextInt() : ����ڰ� �Է��� �� ������ �о��! (������ �о�� �� ����!, ���ڸ� ���� �Է����� ��� ���� �߻�)
		
		System.out.print("����� Ű�� �� cm�Դϱ� (�Ҽ��� �Ʒ� ù ° �ڸ������� �Է�) : ");
		double height = sc.nextDouble();
		//nextDouble() : ����ڰ� �Է��� �� �Ǽ��� �о��! (���ڸ� ���� �Է����� ��� ���� �߻�)
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
	}
	
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in);
		
		// �̸�, ����, �ּ�, Ű
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("����(���ڸ�) : "); 
		int age = sc.nextInt();
		
		// ���ۿ� �����ִ� '����'�� ����ִ� ������ �ؾ��Ѵ�!!
		sc.nextLine();
		
		/*
		 * sc.nextLine() : ���ۿ��� ���� ������ �� �� '����'�� ����ִ� ���ҵ� ����
		 * ������ �� �� next~~~() : ���ۿ��� ���� ������� ���� ('����'�� ������� ���� == '����'�� ������ �������� ��)
		 * 
		 * sc.nextInt() �Ŀ� sc.nextLine() �޼ҵ尡 ȣ��ȴٸ�
		 * ���ۿ� �����ִ� '����'������ sc.nextLine() �� �ٷ� ����Ǿ� ������.
		 * 
		 * ��� : sc.nexet~~() �޼ҵ� �ڿ� �ٷ� sc.nextLine() �޼ҵ尡 ���� �� ������ ���ۿ� �����ִ� '����'�� ���ִ� ������ �ʿ��ϴ�!
		 * 		��, �� ���̿� sc.nextLine() �޼ҵ带 �� �� �� ȣ�� �ؼ� '����'�� ��������!
		 */
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.print("Ű(cm) : ");
		double height = sc.nextDouble();
		
		/*
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(height);
		*/
		
		// xxx���� xx���̸�, ��� ���� xxxxxxx�̰�, Ű�� xxxcm�Դϴ�.
		
		//System.out.println(name + "���� " + age + "���̸�, ��� ���� " + address + "�̰�, Ű��" + height + "cm�Դϴ�.");
		
		System.out.printf("%s����  %d���̸�, ��°���  %s�̰�, Ű��  %.1fcm�Դϴ�.", name, age, address, height);
		
		
	}
	
	
	public void inputScanner3() {
		
		// �н���ǥ : ������ (char)��
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ� => sc.nextLine()
		// ���� => sc.nextInt()
		// �Ǽ� => sc.nextDouble()
		
		System.out.print("�̸� : ");
		String name = sc.nextLine(); // "ȫ�浿"
		
		System.out.print("����(��/��) : ");
		// char gender = sc.nextChar();		=> nextChar �޼ҵ�� �������� ����
		char gender = sc.nextLine().charAt(0);
		// ����ڰ� �Է��� ���� ���ڿ��� ������ �� �Ŀ�, ���� ���ϴ� �ε��� ������ ���� ���� �����ؼ� ��ƾ� �Ѵ�.
		// * �ε��� == 0������ ����
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		/*
		 * xxx���� ��������
		 * ���� : x
		 * ���� : xx
		 * Ű : xxxcm
		 */
		System.out.println(name + "���� ��������");
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height + "cm");
		
		
		
	}
	
	
	/*
	 * 
	 *  * ���� *
	 *  1. �ܼ�â��(�����) ����ϱ� ���� : System.out.println(����ϰ��� �ϴ� ��) �޼ҵ带 ȣ���ߴ�. 
	 *  2. �ܼ�â��(Ű����) �Է¹ޱ� ���� : Scanner sc = new Scanner(System.in);
	 *  						  sc.nextLine(), sc.next(), sc.nextInt(), sc.nextDouble(), ...
	 *  	'����' ���� �Է¹ޱ� ���ؼ��� sc.nextLine().charAt(�ε���);
	 *  	( sc.nextLine()�� ���� ���ڿ��� ������ �� ��, �� �ڿ� .charAt(�����ϰ����ϴ��ε���)�� ���� �ش� �ε����� ���� ���� ���� �� ����)
	 *  
	 *  * ���ǻ��� *
	 *  sc.nextXXX() �޼ҵ� �ڿ� sc.nextLine() �޼ҵ尡 ���� �� ���
	 *  �� ���� ���ۿ� �����ִ� '����(\n)'�� ����ִ� ������ sc.nextLine() �޼ҵ带 �� �� �� ȣ�� �ؾ� �Ѵ�!
	 *  
	 *  
	 */
	
	
	
	
	
	
	
	
	

}
