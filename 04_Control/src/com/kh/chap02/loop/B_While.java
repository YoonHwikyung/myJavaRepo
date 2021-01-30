package com.kh.chap02.loop; //while��

import java.util.Scanner;

public class B_While {

	/*
	 * * while��
	 * 
	 * [ǥ���]
	 * �ʱ��
	 * while(���ǽ�) { 
	 * 		�ݺ������� ������ �ڵ�;
	 * 		������;
	 * }
	 * 	���� ���� while���� for�� ó�� �� �� �ִ�!
	 * 
	 * �ʱ��
	 * ���ǽ� --> true�� ���� --> ������
	 * ���ǽ� --> true�� ���� --> ������
	 * ���ǽ� --> false�� �ݺ��� stop
	 * 
	 */
	
	// for�� ���� while������ �����غ��� ������ ���� ���� (���� while�� �� ��� ��������!)
	
	public void method1() {
		// "�ȳ��ϼ���" 5�� ���
		
		/* for�� ������� ��
		for(int i=1; i<=5; i++) {
			System.out.println("�ȳ��ϼ���");
		}
		*/
		
		int i = 1; // => while�� ���� ���� ���� �߱� ������ method1���� �� �� �ִ�.
		while(i<=5) {
			System.out.println("�ȳ��ϼ���");
			i++;
		}
		
		System.out.println(i); // => while���� ������� �������� �ҷ��ü� �ִ�!
		
		// 1 2 3 4 5 ���
		// int i = 1 => ���� �̹� �ֱ� ������ ����!
		i = 1; // ������ ���� i���� 6�̴� �ٽ� 1�� ��������!
		
		while(i<=5) {
			System.out.print(i + " ");
			i++;
			
		}
	}
	
	public void method2() {
		// 1���� 10������ �� �հ�
		
		int sum = 0;
		
		int i = 1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("�� �հ� : " + sum);
	}
	
	public void method3() {
		// 1���� ������(1~10����) ������ �� �հ�
		int random = (int)(Math.random() * 10 + 1); // �������� �� : ���ۼ�, �������� �� : �� ��� ����������. 
		
		int sum = 0;
		int i = 1;
		while(i<=random) {
			sum += i;
			i++;
		}
		System.out.println("1�������� " + random + "������ �� �հ� : " + sum);
	}
	
	public void method4() {
		// �޴� ����
		Scanner sc = new Scanner(System.in);
		
		//-----------------------------------
		while(true) { // => ���� �ݺ� ��Ű�� ���� �� == for(;true;)�� �����ϴ�!
			System.out.println("\n==== �޴� ====");
			System.out.println("1. �ȳ��ϼ��� 5�� ���");
			System.out.println("2. 1���� 10������ �� �հ�");
			System.out.println("3. 1���� ������������ �� �հ�");
			System.out.println("0. ���α׷� ����");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 0: System.out.println("\n���α׷��� �����մϴ�."); return; //=> return : �޼ҵ� ��ü�� ����������.
			default : System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
		//------------------------------------
	}
		
		////////////////////
	/*
	 * * do-while��
	 * 
	 * [ǥ����]
	 * do{
	 * 		�ݺ������� ������ �ڵ�;
	 * 
	 * }while(���ǽ�);
	 * 
	 * [do-while���� �ݺ������� �����ϰ� ���� ��]
	 * �ʱ��;
	 * do{
	 * 		�ݺ������� ������ �ڵ�;
	 * 		������;
	 * }while(���ǽ�);
	 * 
	 * [�帧]
	 * �ʱ��
	 *		������ �ڵ� �� �� ���� --> ������
	 * ���ǽ� --> true�� ���� --> ������
	 * ���ǽ� --> true�� ���� --> ������
	 * ���ǽ� --> false�� ��������
	 * 
	 * while���� �ٸ� ����?
	 * while���� ó�� ����� ���� ���� �˻� �� true���� ����
	 * ��, do while���� ���� �˻� ���� ������ �� ���� ����ȴ�.
	 * 
	 */
	
	
	// do while�� ����
	public void method5() {
		// ���ʿ� ������ ���� �ʾƵ� �ݵ�� �� ���� ����Ǵ� do while���� Ư¡�� ���ø� ���� �˾ƺ���!
		int num = 1;
		
		do {
			System.out.println(num);
			
		}while(num == 0); // num�� ��� ���� 0�� ��ġ�ϴ� ���ȿ��� �����϶�� ��
	}
	
	//
	public void method6() {
		// 1 2 3 4 5
		
		int i = 1; // for��ó�� �ݺ���Ű�� ���� do while�� ���� ���� ���� �ʱ�ȭ
		
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=5);
	}
	
	//
	public void method7() {
		// 2�� ����ϱ�
		// 2 x 1 = 2
		// 2 x 2 = 4
		// .....
		// 2 x 9 = 18
		
		System.out.println("=== 2�� ===");
		int su = 1;
		
		do {
			System.out.printf("2 x %d = %d\n", su, 2*su);
			su++;
		}while(su<=9);
	}
	
	// �ݺ����� ���� ����. �ݺ����� ���� ���̴� '�б⹮'�� �����غ���!
	
	
}
